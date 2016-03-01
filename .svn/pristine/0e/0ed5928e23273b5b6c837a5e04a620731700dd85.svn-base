package com.tianque.userAuth.api.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Contacter;
import com.tianque.domain.MyArea;
import com.tianque.domain.MyContacter;
import com.tianque.domain.MyGroup;
import com.tianque.domain.Organization;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;
import com.tianque.service.ContacterService;
import com.tianque.service.SearchWorkContacterService;
import com.tianque.userAuth.api.ContacterDubboService;

@Component
public class ContacterDubboServiceImpl implements ContacterDubboService {

	@Autowired
	private ContacterService contacterService;

	@Autowired
	private SearchWorkContacterService searchWorkContacterService;

	@Override
	public MyContacter addMyContacter(MyContacter myContact) {
		return contacterService.addMyContacter(myContact);
	}

	@Override
	public MyContacter updateMyContacter(MyContacter myContact) {
		return contacterService.updateMyContacter(myContact);
	}

	@Override
	public boolean deleteContacterById(Long id) {
		return contacterService.deleteContacterById(id);
	}

	@Override
	public MyContacter getSimpleMyContacterById(Long id) {
		return contacterService.getSimpleMyContacterById(id);
	}

	@Override
	public List<MyContacter> findMyContactersByNameAndPinyinAndOwnerId(
			String name, Long id) {
		return contacterService.findMyContactersByNameAndPinyinAndOwnerId(name,
				id);
	}

	@Override
	public PageInfo<MyContacter> findMyContacterByOwnerId(Long ownerId,
			Integer page, Integer rows, String sidx, String sord) {
		return contacterService.findMyContacterByOwnerId(ownerId, page, rows,
				sidx, sord);
	}

	@Override
	public PageInfo<MyContacter> searchMyContacter(MyContacter myContact,
			Integer page, Integer rows, String sidx, String sord) {
		return contacterService.searchMyContacter(myContact, page, rows, sidx,
				sord);
	}

	@Override
	public List<MyContacter> findMyContacterByOwnerId(Long ownerId) {
		return contacterService.findMyContacterByOwnerId(ownerId);
	}

	@Override
	public WorkContacter addWorkContacter(WorkContacter workContacter) {
		return contacterService.addWorkContacter(workContacter);
	}

	@Override
	public WorkContacter updateWorkContacter(WorkContacter workContacter) {
		return contacterService.updateWorkContacter(workContacter);
	}

	@Override
	public WorkContacter getSimpleWorkContacterByUserId(Long userId) {
		return contacterService.getSimpleWorkContacterByUserId(userId);
	}

	@Override
	public List<WorkContacter> findWorkContacter() {
		return contacterService.findWorkContacter();
	}

	@Override
	public PageInfo<WorkContacter> findWorkContacterForUpate(Integer page,
			Integer rows, String sidx, String sord, Organization organization,
			String leavel) {
		return contacterService.findWorkContacterForUpate(page, rows, sidx,
				sord, organization, leavel);
	}

	@Override
	public List<WorkContacter> findWorkContactersByNameAndPinyin(String name) {
		return contacterService.findWorkContactersByNameAndPinyin(name);
	}

	@Override
	public ContacterVo getSimpleContacterById(Long id) {
		return contacterService.getSimpleContacterById(id);
	}

	@Override
	public List<WorkContacter> findWorkContactersByOrganizationId(Long id) {
		return contacterService.findWorkContactersByOrganizationId(id);
	}

	@Override
	public List<MyArea> findMyAreaByOrgIdAndOrgLevelAndOrgType(
			Map<Long, List<Integer>> map, List<Integer> orgTypeInternals,
			List<Long> exceptOrgIds) {
		return contacterService.findMyAreaByOrgIdAndOrgLevelAndOrgType(map,
				orgTypeInternals, exceptOrgIds);
	}

	@Override
	public WorkContacter getWorkContactersByName(String userName) {
		return contacterService.getWorkContactersByName(userName);
	}

	@Override
	public WorkContacter getWorkContacterById(Long id) {
		return contacterService.getWorkContacterById(id);
	}

	@Override
	public MyGroup addMyGroup(MyGroup myGroup) {
		return contacterService.addMyGroup(myGroup);
	}

	@Override
	public List<MyGroup> findMyGroupByOwnerId(Long id) {
		return contacterService.findMyGroupByOwnerId(id);
	}

	@Override
	public Contacter findUserContacters(Long fromUserId) {
		return contacterService.findUserContacters(fromUserId);
	}

	@Override
	public PageInfo<MyGroup> findMyGroupByOwnerId(Long id, Integer page,
			Integer rows, String sidx, String sord) {
		return contacterService
				.findMyGroupByOwnerId(id, page, rows, sidx, sord);
	}

	@Override
	public MyGroup getSimpleMyGroupById(Long id) {
		return contacterService.getSimpleMyGroupById(id);
	}

	@Override
	public List<MyGroup> findMyGroupsByNameAndPinyinAndOwnerId(String name,
			Long id) {
		return contacterService.findMyGroupsByNameAndPinyinAndOwnerId(name, id);
	}

	@Override
	public MyGroup updateMyGroup(MyGroup myGroup) {
		return contacterService.updateMyGroup(myGroup);
	}

	@Override
	public List<ContacterVo> findMyGroupHasContactersByGroupId(Long id) {
		return contacterService.findMyGroupHasContactersByGroupId(id);
	}

	@Override
	public List<WorkContacter> findWorkContacterById(Long id) {
		return contacterService.findWorkContacterById(id);
	}

	@Override
	public void addMyGroupHasContacter(Long groupId, Long contacterId) {
		contacterService.addMyGroupHasContacter(groupId, contacterId);
	}

	@Override
	public PageInfo<ContacterVo> findMyGroupHasContactersByGroupId(Long id,
			String belongClass, String name, Integer page, Integer rows,
			String sidx, String sord) {
		return contacterService.findMyGroupHasContactersByGroupId(id,
				belongClass, name, page, rows, sidx, sord);
	}

	@Override
	public void deleteMyGroupHasAllContacterByGroupId(Long groupId) {
		contacterService.deleteMyGroupHasAllContacterByGroupId(groupId);
	}

	@Override
	public void deleteMyGroupHasSingleContacterByTwoId(Long groupId,
			Long contacterId) {
		contacterService.deleteMyGroupHasSingleContacterByTwoId(groupId,
				contacterId);
	}

	@Override
	public PageInfo<MyGroup> findMyGroupByCondition(Long groupId,
			ContacterVo contacterVo, String belongClass, Integer page,
			Integer rows, String sidx, String sord) {
		return contacterService.findMyGroupByCondition(groupId, contacterVo,
				belongClass, page, rows, sidx, sord);
	}

	@Override
	public List<MyGroup> findMygroupMemberByGroupId(Long groupId) {
		return contacterService.findMygroupMemberByGroupId(groupId);
	}

	@Override
	public Integer getGroupMemberNum(Long id) {
		return contacterService.getGroupMemberNum(id);
	}

	@Override
	public void updateGroupMemberNumber(Long Id, Integer number) {
		contacterService.updateGroupMemberNumber(Id, number);
	}

	@Override
	public void deleteAllMyGroup(String[] ids) {
		contacterService.deleteAllMyGroup(ids);
	}

	@Override
	public PageInfo<WorkContacter> searchUsersByWorkContacter(
			ContacterVo contacterVo, Boolean isHasOrg, Integer page,
			Integer rows, String sidx, String sord) {
		return searchWorkContacterService.searchUsersByWorkContacter(
				contacterVo, isHasOrg, page, rows, sidx, sord);
	}

}
