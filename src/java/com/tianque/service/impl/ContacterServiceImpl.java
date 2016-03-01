package com.tianque.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.datatransfer.dataconvert.ValidateHelper;
import com.tianque.core.util.Chinese2pinyin;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.dao.MyGroupDao;
import com.tianque.dao.WorkContacterDao;
import com.tianque.domain.Contacter;
import com.tianque.domain.MyArea;
import com.tianque.domain.MyContacter;
import com.tianque.domain.MyGroup;
import com.tianque.domain.Organization;
import com.tianque.domain.User;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;
import com.tianque.domain.vo.OrganizationVo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.service.ContacterService;
import com.tianque.service.util.MyGroupMode;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;

@Transactional
@Service("contacterService")
public class ContacterServiceImpl implements ContacterService {

	@Autowired
	private MyGroupDao myGroupDao;

	@Autowired
	private WorkContacterDao workContacterDao;

	@Autowired
	private OrganizationService organizationService;

	@Autowired
	private PermissionService permissionService;

	@Autowired
	private ValidateHelper validateHelper;

	public final String FORMUSER_WORKPHONE = "fromUser.workPhone";// 平台内联系人
																	// 通过固定电话排序
	public final String SORD_WORKPHONE = "u.workPhone";// 转化固定电话排序的字段
	public final String JURISDICTION = "jurisdiction";// 下辖
	public final String SAME_LEVEL = "sameLevel";// 本级
	public final String SUPERIOR = "superior";// 上级

	public WorkContacter getWorkContacterById(Long id) {
		return workContacterDao.getSimpleWorkContacterById(id);
	}

	@Override
	public List<MyContacter> findMyContacterByOwnerId(Long ownerId) {
		return workContacterDao.findMyContacterByOwnerId(ownerId);
	}

	@Override
	public List<MyContacter> findMyContactersByNameAndPinyinAndOwnerId(
			String name, Long id) {
		return workContacterDao.findMyContactersByNameAndPinyinAndOwnerId(name,
				id);
	}

	@Override
	public MyContacter addMyContacter(MyContacter myContact) {
		if (!validate(myContact))
			throw new BusinessValidationException("系统异常");
		setContacterChinesePinyin(myContact);
		return workContacterDao.addMyContacter(myContact);
	}

	@Override
	public boolean deleteContacterById(Long id) {
		if (workContacterDao.getMyContacterByIdInMyGroup(id) > 0)
			return false;
		else {
			workContacterDao.deleteMyContacterById(id);
			return true;
		}
	}

	@Override
	public PageInfo<MyContacter> findMyContacterByOwnerId(Long ownerId,
			Integer page, Integer rows, String sidx, String sord) {
		return workContacterDao.findMyContacterByOwnerIdForPage(ownerId, page,
				rows, sidx, sord);
	}

	@Override
	public MyContacter getSimpleMyContacterById(Long id) {
		return workContacterDao.getSimpleMyContacterById(id);
	}

	@Override
	public MyContacter updateMyContacter(MyContacter myContact) {
		if (!validate(myContact))
			throw new BusinessValidationException("系统异常");
		setContacterChinesePinyin(myContact);
		return workContacterDao.updateMyContacter(myContact);
	}

	private boolean validate(MyContacter myContact) {
		if (validateHelper.nullObj(myContact)) {
			return false;
		}
		if (validateHelper.emptyString(myContact.getName())) {
			return false;
		}
		if (validateHelper.nullObj(myContact.getMobileNumber())) {
			return false;
		}
		if (validateHelper.nullObj(myContact.getOwner())) {
			return false;
		}
		if (validateHelper.emptyString(myContact.getBelongClass())) {
			return false;
		}
		return true;
	}

	@Override
	public PageInfo<MyContacter> searchMyContacter(MyContacter myContact,
			Integer page, Integer rows, String sidx, String sord) {
		return workContacterDao.searchMyContacter(myContact, page, rows, sidx,
				sord);
	}

	@Override
	public WorkContacter addWorkContacter(WorkContacter workContacter) {
		if (!validate(workContacter))
			throw new BusinessValidationException("系统异常");
		setContacterChinesePinyin(workContacter);
		return workContacterDao.addWorkContacter(workContacter);
	}

	@Override
	public WorkContacter getSimpleWorkContacterByUserId(Long userId) {
		return workContacterDao.getSimpleWorkContacterByUserId(userId);
	}

	@Override
	public ContacterVo getSimpleContacterById(Long id) {
		return workContacterDao.getSimpleContacterById(id);
	}

	@Override
	public WorkContacter updateWorkContacter(WorkContacter workContacter) {
		if (!validate(workContacter))
			throw new BusinessValidationException("系统异常");
		setContacterChinesePinyin(workContacter);
		return workContacterDao.updateWorkContacter(workContacter);
	}

	@Override
	public List<WorkContacter> findWorkContacter() {
		return workContacterDao.findWorkContacter();
	}

	@Override
	public List<WorkContacter> findWorkContactersByNameAndPinyin(String name) {
		return workContacterDao.findWorkContactersByNameAndPinyin(name);
	}

	@Override
	public PageInfo<WorkContacter> findWorkContacterForUpate(Integer page,
			Integer rows, String sidx, String sord, Organization organization,
			String leavel) {
		if (FORMUSER_WORKPHONE.equals(sidx)) {
			sidx = SORD_WORKPHONE;
		} else {
			sidx = "c." + sidx;
		}
		if (organization == null) {
			throw new BusinessValidationException("请先选中一个组织机构！");
		}
		User users = ThreadVariable.getUser();
		String orgCode = null;
		if (!users.isAdmin()) {
			orgCode = organizationService
					.getUserOrganztionCodeByOrgId(organization.getId());
		}
		OrganizationVo organizationVo = new OrganizationVo();
		organizationVo.setLessOrgLevelId(organization.getOrgLevel().getId());
		organizationVo.setOrgInternalCode(orgCode);
		organizationVo.setLeavel(leavel);
		List leavelIds = organizationService
				.findOrgIdsBySearchVo(organizationVo);

		PageInfo<WorkContacter> pageInfo = workContacterDao
				.findWorkContacterForPage(page, rows, sidx, sord, organization,
						leavel, leavelIds, orgCode);
		List<WorkContacter> list;
		if (pageInfo != null && pageInfo.getPerPageSize() != 0) {
			list = pageInfo.getResult();
			for (WorkContacter workContacter : list) {
				if (workContacter.getFromUser() != null
						&& workContacter.getFromUser().getId() != null) {
					User user = permissionService
							.getSimpleUserById(workContacter.getFromUser()
									.getId());
					workContacter.setFromUser(user);
					if (user == null) {
						continue;
					}
					Organization org = organizationService
							.getSimpleOrgById(user.getOrganization().getId());
					workContacter.getFromUser().setOrganization(org);
				}
			}
			pageInfo.setResult(list);
		}
		return pageInfo;
	}

	private boolean validate(WorkContacter workContacter) {
		if (validateHelper.nullObj(workContacter)) {
			return false;
		}
		if (validateHelper.emptyString(workContacter.getName())) {
			return false;
		}
		if (validateHelper.nullObj(workContacter.getMobileNumber())) {
			return false;
		}
		if (validateHelper.nullObj(workContacter.getFromUser())) {
			return false;
		}
		if (validateHelper.emptyString(workContacter.getBelongClass())) {
			return false;
		}
		return true;
	}

	private void setContacterChinesePinyin(Contacter contacter) {
		Map<String, String> pinyin = Chinese2pinyin
				.changeChinese2Pinyin(contacter.getName());
		contacter.setFullPinyin(pinyin.get("fullPinyin"));
		contacter.setSimplePinyin(pinyin.get("simplePinyin"));
	}

	@Override
	public List<WorkContacter> findWorkContactersByOrganizationId(Long id) {
		return workContacterDao.findWorkContactersByOrganizationId(id);
	}

	@Override
	public List<MyArea> findMyAreaByOrgIdAndOrgLevelAndOrgType(
			Map<Long, List<Integer>> map, List<Integer> orgTypeInternals,
			List<Long> exceptOrgIds) {
		List<MyArea> myAreas = new ArrayList<MyArea>();
		for (Long key : map.keySet()) {
			MyArea myArea = new MyArea();
			myArea.setOrganization(organizationService.getSimpleOrgById(key));
			myArea.setOrganizations(organizationService
					.findOrgsByOrgCodeAndOrgLevelInternalsAndOrgTypeInternals(
							myArea.getOrganization().getOrgInternalCode(),
							map.get(key), orgTypeInternals, exceptOrgIds));
			myAreas.add(myArea);
		}
		return myAreas;
	}

	@Override
	public WorkContacter getWorkContactersByName(String userName) {
		return workContacterDao.getWorkContactersByName(userName);
	}

	@Override
	public MyGroup addMyGroup(MyGroup myGroup) {
		if (!validate(myGroup)) {
			throw new BusinessValidationException("系统异常");
		}
		setContacterChinesePinyin(myGroup);
		return myGroupDao.addMyGroup(myGroup);
	}

	private boolean validate(MyGroup myGroup) {
		if (validateHelper.nullObj(myGroup)) {
			return false;
		}
		if (validateHelper.emptyString(myGroup.getName())) {
			return false;
		}
		if (validateHelper.nullObj(myGroup.getOwner())
				|| validateHelper.nullObj(myGroup.getOwner().getId())) {
			return false;
		}

		if (validateHelper.emptyString(myGroup.getBelongClass())) {
			return false;
		}
		return true;
	}

	@Override
	public List<MyGroup> findMyGroupByOwnerId(Long id) {

		return myGroupDao.findMyGroupByOwnerId(id);
	}

	@Override
	public Contacter findUserContacters(Long fromUserId) {
		return myGroupDao.findUserContacters(fromUserId);
	}

	@Override
	public PageInfo<MyGroup> findMyGroupByOwnerId(Long id, Integer page,
			Integer rows, String sidx, String sord) {
		return myGroupDao.findMyGroupByOwnerId(id, page, rows, sidx, sord);
	}

	@Override
	public MyGroup getSimpleMyGroupById(Long id) {
		return myGroupDao.getSimpleMyGroupById(id);
	}

	@Override
	public List<MyGroup> findMyGroupsByNameAndPinyinAndOwnerId(String name,
			Long id) {
		return myGroupDao.findMyGroupsByNameAndPinyinAndOwnerId(name, id);
	}

	@Override
	public MyGroup updateMyGroup(MyGroup myGroup) {
		if (!validate(myGroup))
			throw new BusinessValidationException("系统异常");
		setContacterChinesePinyin(myGroup);
		return myGroupDao.updateMyGroup(myGroup);
	}

	@Override
	public List<ContacterVo> findMyGroupHasContactersByGroupId(Long id) {
		List<ContacterVo> contacterVos = myGroupDao
				.findMyGroupHasContactersByGroupId(id);
		if (contacterVos == null || contacterVos.size() < 1) {
			return contacterVos;
		}
		for (ContacterVo contacterVo : contacterVos) {
			if (contacterVo.getFromUser() != null
					&& contacterVo.getFromUser().getId() != null) {
				contacterVo.setFromUser(permissionService
						.getSimpleUserById(contacterVo.getFromUser().getId()));
			}
		}
		return contacterVos;
	}

	@Override
	public List<WorkContacter> findWorkContacterById(Long id) {
		if (myGroupDao.isMyGroupById(id)) {
			return myGroupDao.findMyGroupHasWorkContactersByGroupId(id);
		} else {
			WorkContacter workContacter = workContacterDao
					.getSimpleWorkContacterById(id);
			if (workContacter != null)
				return Arrays.asList(new WorkContacter[] { workContacter });
		}
		return null;
	}

	@Override
	public void addMyGroupHasContacter(Long groupId, Long contacterId) {
		myGroupDao.addMyGroupHasContacter(groupId, contacterId);
		myGroupDao.updateMemberNums(groupId, MyGroupMode.IS_ADD_STATUS);
	}

	@Override
	public PageInfo<ContacterVo> findMyGroupHasContactersByGroupId(Long id,
			String belongClass, String name, Integer page, Integer rows,
			String sidx, String sord) {
		PageInfo<ContacterVo> pageInfo = myGroupDao
				.findMyGroupHasContactersByGroupId(id, belongClass, name, page,
						rows, sidx, sord);
		List<ContacterVo> list;
		Organization org;
		if (pageInfo != null && pageInfo.getPerPageSize() != 0) {
			list = pageInfo.getResult();
			for (ContacterVo contacterVo : list) {

				if (contacterVo.getFromUser() != null
						&& contacterVo.getFromUser().getId() != null) {
					User user = permissionService.getSimpleUserById(contacterVo
							.getFromUser().getId());
					contacterVo.setFromUser(user);
					if (user == null) {
						continue;
					}
					org = organizationService.getSimpleOrgById(user
							.getOrganization().getId());
					contacterVo.getFromUser().setOrganization(org);
				}
			}
			pageInfo.setResult(list);
		}
		return pageInfo;
	}

	@Override
	public void deleteMyGroupHasAllContacterByGroupId(Long groupId) {
		myGroupDao.deleteMyGroupHasAllContacterByGroupId(groupId);
		// 将群组联系人数量置为0
		myGroupDao.updateGroupMemberNumber(groupId,
				MyGroupMode.GROUP_MEMBER_NUMBER);
	}

	@Override
	public void deleteMyGroupHasSingleContacterByTwoId(Long groupId,
			Long contacterId) {
		myGroupDao.deleteMyGroupHasSingleContacterByTwoId(groupId, contacterId);
		myGroupDao.updateMemberNums(groupId, MyGroupMode.IS_DEL_STATUS);
	}

	@Override
	public PageInfo<MyGroup> findMyGroupByCondition(Long groupId,
			ContacterVo contacterVo, String belongClass, Integer page,
			Integer rows, String sidx, String sord) {
		return myGroupDao.findMyGroupByCondition(groupId, contacterVo,
				belongClass, page, rows, sidx, sord);
	}

	@Override
	public List<MyGroup> findMygroupMemberByGroupId(Long groupId) {
		if (groupId == null) {
			throw new BusinessValidationException("请先选择一个群组！");
		}
		return myGroupDao.findMygroupMemberByGroupId(groupId);
	}

	/***
	 * 获取群组的成员数量
	 */
	@Override
	public Integer getGroupMemberNum(Long id) {
		return myGroupDao.getGroupMemberNum(id);
	}

	@Override
	public void updateGroupMemberNumber(Long Id, Integer number) {
		myGroupDao.updateGroupMemberNumber(Id, number);
	}

	@Override
	public void deleteAllMyGroup(String[] ids) {
		myGroupDao.deleteAllMyGroup(ids);
	}

}
