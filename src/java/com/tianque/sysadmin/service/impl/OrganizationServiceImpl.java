package com.tianque.sysadmin.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.systemLog.service.SystemLogService;
import com.tianque.core.systemLog.util.ModelType;
import com.tianque.core.systemLog.util.OperatorType;
import com.tianque.core.util.Chinese2pinyin;
import com.tianque.core.util.ObjectToJSON;
import com.tianque.core.util.OrganizationHelper;
import com.tianque.core.util.StringUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.AutoCompleteData;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.GisInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.Session;
import com.tianque.domain.User;
import com.tianque.domain.VillageProfile;
import com.tianque.domain.property.OrganizationLevel;
import com.tianque.domain.property.OrganizationType;
import com.tianque.domain.property.PropertyTypes;
import com.tianque.domain.vo.OrganizationVo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.platformMessage.constants.PlatformMessageType;
import com.tianque.service.VillageProfileService;
import com.tianque.service.impl.LogableService;
import com.tianque.service.impl.OrganizationServiceHelper;
import com.tianque.sysadmin.dao.OrganizationDao;
import com.tianque.sysadmin.dao.UserHasMultizoneDao;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.util.FindStringOfWordUtil;

@Transactional(timeout = 12000)
@Service("organizationService")
public class OrganizationServiceImpl extends LogableService implements
		OrganizationService {
	@Autowired
	private OrganizationDao organizationDao;
	@Autowired
	private UserHasMultizoneDao userHasMultizoneDao;
	@Autowired
	private PermissionService permissionService;
	@Autowired
	private PropertyDictService propertyDictService;
	@Autowired
	private VillageProfileService villageProfileService;
	@Autowired
	private SystemLogService systemLogService;
	@Autowired
	private OrganizationHelper organizationHelper;

	// @Autowired
	// private com.tianque.plugin.analyzing.service.OrgLoginStanalsService orgLoginStanalsService;

	// @Autowired
	// private IssueTypeStanalService issueTypeStanalService;

	@Override
	public List<Organization> findOrganizationsByParentId(Long parentId) {
		return organizationDao.findOrganizationsByParentId(parentId);
	}

	public List<Long> findOrgIdByParentId(Long parentId) {
		return organizationDao.findOrgIdByParentId(parentId);
	}

	@Override
	public List<Organization> findProvinceOrganizationsByOrgIdAndCityLevel(
			Long orgId, Integer organizationLevel) {
		return organizationDao.findProvinceOrganizationsByOrgIdAndCityLevel(
				orgId, organizationLevel);
	}
	@Override
	@Transactional(timeout = 12000)
	public Organization addOrganization(Organization organization) {
		OrganizationServiceHelper organizationServiceHelper = new OrganizationServiceHelper();

		if (organization == null || organization.getParentOrg() == null
				|| organization.getParentOrg().getId() == null
				|| organization.getParentOrg().getId() < 0L) {
			if (organization != null
					&& organization.getOrgInternalCode() != null) {

			} else {
				throw new BusinessValidationException("上级部门信息为空");
			}
		}
		OrganizationServiceHelper.checkAddOrganization(organization, this,
				propertyDictService);
		autofillFields(organization);
		organization = getFullOrgById(organizationDao.addOrganization(
				organization).getId());
		updateFunParentOrgSubCount(organization);

		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {
			organizationServiceHelper.checkDepartmentNoAndOrgLevel(
					organization, propertyDictService);
		}
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {
			systemLogService.log(
					INFO,
					ModelType.DEPT,
					OperatorType.ADD,
					ThreadVariable.getUser().getUserName()
							+ "在"
							+ getOrganizationRelativeNameByRootOrgIdAndOrgId(
									organization.getId(),
									OrganizationServiceHelper.getRootOrg(this)
											.getId()) + "新增部门"
							+ organization.getOrgName(), ObjectToJSON
							.convertJSON(organization));

		}
		return organization;
	}

	private void autofillFields(Organization organization) {
		autoFillChinesePinyin(organization);
		setSeqWhenOrgAdd(organization);
		setOrgLevel(organization);
		organization.setOrgInternalCode(generateInternalCode(organization,
				getParentMaxCode(organization)));
	}

	private void setSeqWhenOrgAdd(Organization organization) {
		Long parentId = null;
		if (organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null) {
			parentId = organization.getParentOrg().getId();
		}
		Integer seq = organizationDao.findChildrenMaxSeqByParentId(parentId);
		if (null == seq) {
			seq = 0;
		}
		organization.setSeq(seq.longValue() + 1);
	}

	private void setOrgLevel(Organization organization) {
		PropertyDict propertyDict = propertyDictService
				.getPropertyDictById(organization.getOrgType().getId());
		if (propertyDict.getInternalId() == OrganizationType.FUNCTIONAL_ORG) {
			if (null == organization.getParentOrg()) {
				throw new BusinessValidationException("parentOrg为null!");
			}
			organization.setOrgLevel(getSimpleOrgById(
					organization.getParentOrg().getId()).getOrgLevel());
		}
	}

	private String generateInternalCode(Organization organization,
			int currentInternalCode) {
		String internalCode = ".";
		if (organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null) {
			Organization parentOrg = organizationDao.updateOrgSubCount(
					organization.getParentOrg().getId(), 1);
			internalCode = parentOrg.getOrgInternalCode() + currentInternalCode
					+ ".";
		}
		return internalCode;
	}

	private void updateFunParentOrgSubCount(Organization organization) {
		if (organization.getOrgType().getInternalId() == OrganizationType.FUNCTIONAL_ORG
				&& organization.getParentFunOrg() != null
				&& organization.getParentFunOrg().getId() != null) {
			organizationDao.updateFunParentOrgSubCount(organization
					.getParentFunOrg().getId(), 1);
		}
	}

	private int getParentMaxCode(Organization organization) {
		Integer maxCode = 0;
		if (organization != null && organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null) {
			maxCode = organizationDao.getMaxCodeById(organization
					.getParentOrg().getId());
			organizationDao.updateMaxCodeById(organization.getParentOrg()
					.getId());
		}
		if (maxCode == null) {
			maxCode = 0;
		}
		return maxCode + 1;
	}

	@Override
	public String deleteOrgById(Long id) {
		Organization organization = organizationDao.getSimpleOrgById(id);

		userHasMultizoneDao.deleteMultizoneByOrgId(id);

		deleteVillageprofiles(id);

		//orgLoginStanalsService.deleteOrgLoginStanalsByOrgId(id);
		// issueTypeStanalService.deleteAllStatIssueByOrgId(id);
		// operateLogService

		List<OrganizationVo> tables = organizationDao.getTableNameAndOrgId();
		List<String> tableInfo = new ArrayList<String>();
		for (int i = 0; i < tables.size(); i++) {
			if (organizationDao.countDatasByOrgIdAndTableName(tables.get(i)
					.getTableName(), tables.get(i).getOrgIdStr(), id) > 0) {
				tableInfo.add(tables.get(i).getTableName());
			}
		}

		String name = organization.getOrgName();
		try {
			organizationDao.deleteOrgById(id);
		} catch (Exception e) {
			logger.error("删除组织机构错误",e);
			throw new ServiceValidationException("不能删除此部门，此部门已被引用！", e);
		}
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {
			systemLogService.log(WARN, ModelType.DEPT, OperatorType.DELETE,
					ThreadVariable.getSession().getUserName() + "删除部门" + name,
					ObjectToJSON.convertJSON(organization),
					organization.getId() + "", "", organization.getOrgName(),
					"");
		}
		if (organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null) {
			organizationDao.updateOrgsSeqAfterReferSeq(organization
					.getParentOrg().getId(), organization.getSeq(), -1L);
		}
		if (organization.getParentOrg() != null) {
			Organization parentOrg = getSimpleOrgById(organization
					.getParentOrg().getId());
			organizationDao.updateOrgSubCount(parentOrg.getId(), -1);
			if (organization.getOrgType().getInternalId() == OrganizationType.FUNCTIONAL_ORG
					&& organization.getParentFunOrg() != null
					&& organization.getParentFunOrg().getId() != null) {
				organizationDao.updateFunParentOrgSubCount(organization
						.getParentFunOrg().getId(), -1);
			}
		}
		return "success";
	}

	private void deleteVillageprofiles(Long orgId) {
		// 判断是否为空，为空删除部门
		VillageProfile villageProfile = villageProfileService
				.getVillageProfileByOrgId(orgId);
		if (villageProfile != null
				&& (villageProfile.getGridNum() == null || villageProfile
						.getGridNum().doubleValue() == 0)
				&& (villageProfile.getDoors() == null || villageProfile
						.getDoors().doubleValue() == 0)
				&& (villageProfile.getVillagers() == null || villageProfile
						.getVillagers().doubleValue() == 0)
				&& (villageProfile.getVillageRingsters() == null || villageProfile
						.getVillageRingsters() == 0)
				&& (villageProfile.getVillageDelegate() == null || villageProfile
						.getVillageDelegate().doubleValue() == 0)
				&& (villageProfile.getHamletEconomyinclude() == null || villageProfile
						.getHamletEconomyinclude().doubleValue() == 0)
				&& (villageProfile.getIndividualAverageInclude() == null || villageProfile
						.getIndividualAverageInclude().doubleValue() == 0)
				&& (villageProfile.getVillageCollectivityAsset() == null || villageProfile
						.getVillageCollectivityAsset().doubleValue() == 0)
				&& !StringUtil.isStringAvaliable(villageProfile
						.getInterzoneLeading())
				&& !StringUtil
						.isStringAvaliable(villageProfile.getDepartment())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getVillageBuildupSecretary())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getBuildupSecretaryPhone())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getVillageDirector())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getVillageDirectorPhone())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getInformationPersonA())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getInformationPersonAPhone())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getInformationPersonB())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getInformationPersonBPhone())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getNatureGeography())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getEconomyGeography())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getCommunityGeography())
				&& !StringUtil.isStringAvaliable(villageProfile
						.getItemEngineering())
				&& !StringUtil.isStringAvaliable(villageProfile.getImgUrl())) {

			villageProfileService.deleteVillageProfile(orgId);
		}

	}

	@Override
	public Organization getSimpleOrgById(Long id) {
		return organizationDao.getSimpleOrgById(id);
	}

	@Override
	public Organization updateOrgNameAndOrgTypeAndContactWay(
			Organization organization) {
		if (organization == null || organization.getId() == null) {
			throw new BusinessValidationException("参数错误");
		}
		Organization beforeOrganization = getFullOrgById(organization.getId());
		OrganizationServiceHelper organizationServiceHelper = new OrganizationServiceHelper();
		OrganizationServiceHelper.checkOrgWhenUpdate(organizationDao,
				propertyDictService, organization);
		organizationServiceHelper.checkOrgLevelAndDepartmentNo(organization,
				propertyDictService);
		organization.setUpdateDate(Calendar.getInstance().getTime());
		organization.setUpdateUser(ThreadVariable.getSession().getUserName());
		autoFillChinesePinyin(organization);
		Organization targetOrg = organizationDao
				.updateOrgNameAndOrgTypeAndContactWay(organization);
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {
			systemLogService.log(
					INFO,
					ModelType.DEPT,
					OperatorType.UPDATE,
					ThreadVariable.getUser().getUserName()
							+ "在"
							+ getOrganizationRelativeNameByRootOrgIdAndOrgId(
									organization.getId(),
									OrganizationServiceHelper.getRootOrg(this)
											.getId()) + "修改部门"
							+ organization.getOrgName(), ObjectToJSON
							.convertJSON(targetOrg), beforeOrganization.getId()
							+ "", organization.getId() + "", beforeOrganization
							.getOrgName(), organization.getOrgName());
		}
		return targetOrg;
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameForPage(String orgName,
			int pageNum, int pageSize) {
		Session session = ThreadVariable.getSession();
		User user = permissionService.getSimpleUserById(session.getUserId());

		Long parentId = null;
		if (user.isAdmin()) {
			parentId = findOrganizationsByParentId(null).get(0).getId();
		} else {
			parentId = user.getOrganization().getId();
		}

		Organization organization = organizationDao.getSimpleOrgById(parentId);
		return organizationDao
				.findOrganizationsByOrgNameAndInternalCodeForPage(
						organization.getOrgInternalCode(), orgName, pageNum,
						pageSize);
	}

	@Override
	public List<Organization> findOrganizationsByorgNameAndOrgType(
			String orgName, int pageNum, int pageSize) {

		Session session = ThreadVariable.getSession();
		User user = permissionService.getSimpleUserById(session.getUserId());

		Long parentId = null;
		if (user.isAdmin()) {
			parentId = findOrganizationsByParentId(null).get(0).getId();
		} else {
			parentId = user.getOrganization().getId();
		}

		Organization organization = organizationDao.getSimpleOrgById(parentId);
		return organizationDao.findOrganizationsByorgNameAndOrgType(
				organization.getOrgInternalCode(), orgName,
				organization.getOrgType(), pageNum, pageSize);
	}

	@Override
	public void moveOrganization(Long id, Long parentId, ReferType position,
			Long referOrgId) {
		Organization organization = organizationDao.getSimpleOrgById(id);

		if (ReferType.inside.equals(position)) {
			organizationDao.updateOrgsSeqAfterReferSeq(organization
					.getParentOrg().getId(), organization.getSeq(), -1L);
			organizationDao.updateOrgsSeqAfterReferSeq(parentId, 1L, 1L);
			organizationDao.updateOrgSeqAndParentId(id, 1L, parentId);
			return;
		}
		if (ReferType.last.equals(position)) {
			Integer maxSeq = organizationDao
					.findChildrenMaxSeqByParentId(organization.getParentOrg()
							.getId());
			organizationDao.updateOrgsSeqBetweenReferOrg(organization.getSeq()
					.longValue(), maxSeq.longValue(), organization
					.getParentOrg().getId(), -1L);
			organizationDao.updateOrgSeq(id, maxSeq.longValue());
			return;
		}
		if (ReferType.first.equals(position)) {
			organizationDao.updateOrgsSeqBetweenReferOrg(1L, organization
					.getSeq().longValue(), organization.getParentOrg().getId(),
					1L);
			organizationDao.updateOrgSeq(id, 1L);
			return;
		}
		Organization referOrg = organizationDao.getSimpleOrgById(referOrgId);
		if (ReferType.after.equals(position)) {
			moveOrgAferReferOrg(parentId, organization, referOrg);
			return;
		}

		if (ReferType.before.equals(position)) {
			moveOrgBeforeReferOrg(parentId, organization, referOrg);
			return;
		}
	}

	private void moveOrgAferReferOrg(Long parentId, Organization organization,
			Organization referOrg) {
		if (organization.getSeq() > referOrg.getSeq()) {
			organizationDao.updateOrgsSeqBetweenReferOrg(referOrg.getSeq(),
					organization.getSeq(), organization.getParentOrg().getId(),
					1L);
			organizationDao.updateOrgSeq(organization.getId(),
					referOrg.getSeq() + 1L);
			organizationDao.updateOrgSeq(referOrg.getId(), referOrg.getSeq());
		} else {
			organizationDao
					.updateOrgsSeqBetweenReferOrg(organization.getSeq(),
							referOrg.getSeq(), organization.getParentOrg()
									.getId(), -1L);
			organizationDao.updateOrgSeq(organization.getId(),
					referOrg.getSeq());
		}
	}

	private void moveOrgBeforeReferOrg(Long parentId,
			Organization organization, Organization referOrg) {
		if (organization.getSeq() > referOrg.getSeq()) {
			organizationDao.updateOrgsSeqBetweenReferOrg(referOrg.getSeq(),
					organization.getSeq(), organization.getParentOrg().getId(),
					1L);
			organizationDao.updateOrgSeq(organization.getId(),
					referOrg.getSeq());
		} else {
			organizationDao
					.updateOrgsSeqBetweenReferOrg(organization.getSeq(),
							referOrg.getSeq(), organization.getParentOrg()
									.getId(), -1L);
			organizationDao.updateOrgSeq(organization.getId(),
					referOrg.getSeq() - 1);
			organizationDao.updateOrgSeq(referOrg.getId(), referOrg.getSeq());
		}
	}

	@Override
	public List<Long> searchParentOrgIds(Long orgId, Long rootId) {
		if (orgId == null) {
			throw new BusinessValidationException("组织机构参数未获得");
		}
		User user = permissionService.getSimpleUserById(ThreadVariable
				.getUser().getId());

		Long parentId = null;

		if (!user.isAdmin()) {
			if (rootId == null) {
				parentId = user.getOrganization().getId();
			} else {
				parentId = rootId;
			}

			Organization org = getFullOrgById(parentId);
			// 如果是职能部门 parentId 就是该职能部门所在的行政单位
			if (org.getOrgType().getInternalId() == OrganizationType.FUNCTIONAL_ORG) {

				parentId = org.getParentOrg().getId();
			}

		}
		List<Long> returnParentIds = new ArrayList<Long>();

		if (orgId.equals(parentId)) {

			return returnParentIds;
		}
		searchParentId(orgId, returnParentIds, parentId);

		return returnParentIds;
	}

	@Override
	public List<Long> searchParentOrgIdsWhenRootIsTown(Long id) {
		Long rootId = 0L;
		Organization organization = this.getFullOrgById(id);
		int orgLevelInternald = propertyDictService.getPropertyDictById(
				organization.getOrgLevel().getId()).getInternalId();
		if (orgLevelInternald > OrganizationLevel.TOWN) {
		} else if (orgLevelInternald == OrganizationLevel.TOWN) {
			rootId = organization.getId();
		} else if (orgLevelInternald == OrganizationLevel.GRID) {
			rootId = organization.getParentOrg().getParentOrg().getId();
		} else if (orgLevelInternald == OrganizationLevel.VILLAGE) {
			rootId = organization.getParentOrg().getId();
		}
		List<Long> returnParentIds = new ArrayList<Long>();
		searchParentId(id, returnParentIds, rootId);
		return returnParentIds;
	}

	private void searchParentId(Long orgId, List<Long> returnParentIds,
			Long parentId) {
		Organization organization = organizationDao.getSimpleOrgById(orgId);
		if (organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null) {
			returnParentIds.add(organization.getParentOrg().getId());
			if (parentId == null
					|| !organization.getParentOrg().getId().equals(parentId)) {
				searchParentId(organization.getParentOrg().getId(),
						returnParentIds, parentId);
			}
		}
	}

	@Override
	public String getOrganizationRelativeNameByRootOrgIdAndOrgId(Long orgId,
			Long rootId) {

		if (orgId == null || rootId == null)
			return "";
		Organization org = organizationDao.getSimpleOrgById(orgId);
		String path = org.getOrgName();
		if (orgId.equals(rootId))
			return path;
		while (org.getParentOrg() != null
				&& !org.getParentOrg().getId().equals(rootId)) {
			org = organizationDao.getSimpleOrgById(org.getParentOrg().getId());
			path = org.getOrgName() + "->" + path;
		}
		return path;
	}

	@Override
	public Map<Long, String> getOrganizationDisplayName(Long[] orgIds) {
		if (orgIds == null || orgIds.length == 0)
			return new HashMap<Long, String>();
		return organizationDao.getOrganizationDisplayName(orgIds);
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameAndParentId(Long id,
			String orgName, Long parentId) {
		return organizationDao.findOrganizationsByOrgNameAndParentId(id,
				orgName, parentId);
	}

	@Override
	public List<Organization> findOrganizationsByDepartmentNoAndTypeAndLevel(
			Organization org) {
		return organizationDao
				.findOrganizationsByDepartmentNoAndTypeAndLevel(org);
	}

	@Override
	public List<Organization> findMultizonesByUserId(Long userId) {
		return organizationDao.findMultizonesByUserId(userId);
	}

	@Override
	public int countOrgsByOrgInternalCode(String orgInternalCode) {
		return organizationDao.countOrgsByOrgInternalCode(orgInternalCode);
	}

	@Override
	public List<Organization> findFunOrgsByParentId(Long parentId) {

		if (parentId == null) {
			Session session = ThreadVariable.getSession();
			parentId = permissionService.getSimpleUserById(session.getUserId())
					.getOrganization().getId();
		}

		List<PropertyDict> propertyDicts = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationType.ORG_TYPE_KEY,
						OrganizationType.FUNCTIONAL_ORG);
		Long[] propertyDictIds = new Long[propertyDicts.size()];
		for (int i = 0; i < propertyDicts.size(); i++) {
			propertyDictIds[i] = propertyDicts.get(i).getId();
		}
		return organizationDao.findFunOrgsByParentIdAndOrgTypes(parentId,
				propertyDictIds);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndFunTypes(Long parentId) {
		return findOrgsByParentIdAndOrgTypeInternalIds(parentId,
				new Long[] { Long.valueOf(OrganizationType.FUNCTIONAL_ORG) });
	}

	@Override
	public List<Organization> findOrgsByParentIdAndOrgTypeInternalIds(
			Long parentId, Long[] orgTypeInternalIds) {
		return organizationDao.findOrgsByParentIdAndOrgTypeInternalIds(
				parentId, orgTypeInternalIds);
	}

	@Override
	public List<Organization> findMultizonesWithParentOrgNameByUserId(
			Long userId) {

		List<Organization> organizations = new ArrayList<Organization>();
		organizations.add(ThreadVariable.getUser().getOrganization());
		organizations.addAll(findMultizonesByUserId(userId));

		if (organizations == null || organizations.size() == 1) {
			User user = permissionService.getSimpleUserById(userId);
			organizations.addAll(this.findOrganizationsByParentId(user
					.getOrganization().getId()));
		}
		for (int i = 0; i < organizations.size(); i++) {
			organizations.set(i,
					this.getFullOrgById(organizations.get(i).getId()));
			Organization organization = organizations.get(i);
			if (organization.getParentOrg() != null
					&& organization.getParentOrg().getId() != null) {
				Organization parentOrg = organizationDao
						.getSimpleOrgById(organization.getParentOrg().getId());
				organization.setOrgName(parentOrg.getOrgName() + "->"
						+ organization.getOrgName());
			}
		}
		return organizations;
	}

	@Override
	public Organization getFullOrgById(Long id) {
		Organization organization = organizationDao.getSimpleOrgById(id);
		if (organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null) {
			organization.setParentOrg(organizationDao
					.getSimpleOrgById(organization.getParentOrg().getId()));
			organization.getParentOrg().setOrgLevel(
					propertyDictService.getPropertyDictById(organization
							.getParentOrg().getOrgLevel().getId()));
		}
		if (organization.getParentFunOrg() != null
				&& organization.getParentFunOrg().getId() != null) {
			organization.setParentFunOrg(organizationDao
					.getSimpleOrgById(organization.getParentFunOrg().getId()));
		}
		organization.setOrgLevel(propertyDictService
				.getPropertyDictById(organization.getOrgLevel().getId()));
		organization.setOrgType(propertyDictService
				.getPropertyDictById(organization.getOrgType().getId()));
		if (organization.getFunctionalOrgType() != null) {
			organization.setFunctionalOrgType(propertyDictService
					.getPropertyDictById(organization.getFunctionalOrgType()
							.getId()));
		}

		organization.setFullOrgName(organizationHelper.getRelativeName(id));
		return organization;
	}

	@Override
	public Organization getOrganizationsByParentAndOrgName(Long parentId,
			String orgName) {
		return organizationDao.getOrganizationsByParentAndOrgName(parentId,
				orgName);
	}

	@Override
	public boolean isGridOrganization(Long orgId) {
		if (orgId == null)
			return false;
		return getFullOrgById(orgId).getOrgLevel().getInternalId() == OrganizationLevel.GRID ? true
				: false;
	}
	
	public boolean isVillageOrganization(Long orgId){
		if (orgId == null)
			return false;
		Organization org = getFullOrgById(orgId);
		return org.getOrgLevel().getInternalId() == OrganizationLevel.VILLAGE;
	}
	
	public boolean isVillageOrGridOrganization(Long orgId){
		if (orgId == null)
			return false;
		Organization org = getFullOrgById(orgId);
		return (org.getOrgLevel().getInternalId() == OrganizationLevel.GRID
				|| org.getOrgLevel().getInternalId() == OrganizationLevel.VILLAGE);
	}
	
	@Override
	public boolean isTownOrganization(Long orgId) {
		if (orgId == null)
			return false;
		Organization org = getFullOrgById(orgId);
		return (org.getOrgLevel().getInternalId() == OrganizationLevel.GRID
				|| org.getOrgLevel().getInternalId() == OrganizationLevel.VILLAGE || org
				.getOrgLevel().getInternalId() == OrganizationLevel.TOWN)
				&& (org.getOrgType().getInternalId() == OrganizationType.ADMINISTRATIVE_REGION);
	}

	private void autoFillChinesePinyin(Organization org) {
		Map<String, String> pinyin = Chinese2pinyin.changeChinese2Pinyin(org
				.getOrgName());
		org.setSimplePinyin(pinyin.get("simplePinyin"));
		org.setFullPinyin(pinyin.get("fullPinyin"));
	}

	private boolean isTownOrganization(Organization org) {
		if (org == null)
			return false;
		return org.getOrgLevel().getInternalId() == OrganizationLevel.TOWN ? true
				: false;
	}

	@Override
	public Long getTownOrganizationId(Long orgId) {
		if (orgId == null) {
			return null;
		}
		Organization org = getFullOrgById(orgId);
		while (org.getParentOrg() != null) {
			if (isTownOrganization(org)) {
				return org.getId();
			} else {
				org = getFullOrgById(org.getParentOrg().getId());
			}
		}
		return -1L;
	}

	@Override
	public String getMaxDepartmentNoByParentId(Long parentId, Long orgLevel) {
		if (parentId == null || orgLevel == null) {
			throw new BusinessValidationException("参数不正确！");
		}
		String value = "";
		if (orgLevel == 0) {
			String departmentNo = organizationDao
					.getMaxDepartmentNoByParentId(parentId);
			if (departmentNo != null && !departmentNo.equals("")) {
				return String.valueOf((Long.valueOf(departmentNo) + 1L));
			} else {
				// 该组织没有下级组织（社区添加网格时）
				value = getSimpleOrgById(parentId).getDepartmentNo();
				value += "000";
			}
		} else {
			return getSimpleOrgById(parentId).getDepartmentNo();
		}
		return String.valueOf((Long.valueOf(value) + 1L));
	}

	@Override
	public boolean ifGreaterThanDistrictOrgId(Long orgId) {
		if (orgId == null) {
			throw new BusinessValidationException("orgId不能为空！");
		}
		Organization org = getSimpleOrgById(orgId);
		int orgLevelInternald = propertyDictService.getPropertyDictById(
				org.getOrgLevel().getId()).getInternalId();
		if (orgLevelInternald > OrganizationLevel.DISTRICT) {
			return true;
		}
		return false;
	}

	@Override
	public Organization getDistrictOrganizationId(Long orgId) {
		if (orgId == null)
			return null;
		Organization org = getFullOrgById(orgId);
		while (org.getParentOrg() != null) {
			if (OrganizationLevel.levelCompare(OrganizationLevel.DISTRICT, org
					.getOrgLevel().getInternalId()) <= 0) {
				break;
			} else {
				org = getFullOrgById(org.getParentOrg().getId());
			}
		}
		return org;
	}

	@Override
	public Organization getOrganizationByOrgInternalCode(String orgInternalCode) {
		return organizationDao
				.getOrganizationByOrgInternalCode(orgInternalCode);
	}

	@Override
	public List<Organization> findOrganizationsByOrgInternalCode(
			String orgInternalCode) {
		return organizationDao
				.findOrganizationsByOrgInternalCode(orgInternalCode);
	}

	@Override
	public Organization updateOrganizationByName(String orgName, Long orgId,
			Organization domain) {
		Organization older = organizationDao.getOrganizationByNameAndOrgId(
				orgName, orgId);
		domain.setId(older.getId());
		domain.setCreateDate(older.getCreateDate());
		domain.setCreateUser(older.getCreateUser());
		return updateOrgNameAndOrgTypeAndContactWay(domain);
	}

	@Override
	public List<Organization> findAdminOrgsByParentIdAndName(Long id, String tag) {
		return organizationDao.findAdminOrgsByParentIdAndName(id, tag);
	}

	@Override
	public List<Organization> findFunOrgsByParentFunOrgIdAndName(Long id,
			String tag) {
		return organizationDao.findFunOrgsByParentFunOrgIdAndName(id, tag);
	}

	@Override
	public List<Organization> findFunOrgsByParentIdAndName(Long id, String tag) {
		return organizationDao.findFunOrgsByParentIdAndName(id, tag);
	}

	@Override
	public Organization getSimplePinyinBySimpleCode(String simpleCode) {
		return organizationDao.getOrganizationByOrgInternalCode(simpleCode);
	}

	@Override
	public boolean isDistrictOfAdministrativeRegion(Organization organization) {
		if (organization.getParentOrg().getId() == null) {
			return false;
		}
		Organization parentOrg = getSimpleOrgById(organization.getParentOrg()
				.getId());
		PropertyDict organizationType = propertyDictService
				.getPropertyDictById(organization.getOrgType().getId());
		parentOrg.setOrgLevel(propertyDictService.getPropertyDictById(parentOrg
				.getOrgLevel().getId()));
		if (organizationType.getInternalId() == OrganizationType.ADMINISTRATIVE_REGION
				&& parentOrg.getOrgLevel().getInternalId() - 1 == OrganizationLevel.DISTRICT) {
			return true;
		}
		return false;
	}

	@Override
	public List<Organization> findAdminOrgsByParentId(Long id) {
		return findOrgsByParentIdAndOrgTypeInternalIds(id,
				new Long[] { Long
						.valueOf(OrganizationType.ADMINISTRATIVE_REGION) });
	}

	@Override
	public List<Organization> getOrganizationByIdAndOrgInternalCode() {
		return organizationDao.getOrganizationByIdAndOrgInternalCode();
	}

	@Override
	public boolean validateRepeatDepartmentNo(Organization organization) {
		List<Organization> organizations = findOrganizationsByDepartmentNoAndTypeAndLevel(organization);
		if (organizations.size() >= 1) {
			return false;
		} else if (organizations.size() == 1) {
			if (organizations.get(0).getId().equals(organization.getId())) {
				return true;
			}
		}
		return true;
	}

	@Override
	public Organization getOrgByDepartmentNo(String departmentNo) {
		return organizationDao.getOrgByDepartmentNo(departmentNo);
	}

	@Override
	public String[] findDepartmentNosByParentDeparmentNo(String departmentNo) {
		Organization parentOrg = organizationDao
				.getOrgByDepartmentNo(departmentNo);
		PropertyDict orgLevel = propertyDictService
				.getPropertyDictById(parentOrg.getOrgLevel().getId());
		PropertyDict funDict = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationType.ORG_TYPE_KEY,
						OrganizationType.FUNCTIONAL_ORG).get(0);
		List<Organization> orgs = organizationDao
				.findOrgsByParentDeptNoAndLevelIdExcludeFunOrgId(
						departmentNo,
						propertyDictService
								.findPropertyDictByDomainNameAndInternalId(
										OrganizationLevel.ORG_LEVEL_KEY,
										orgLevel.getInternalId() - 1).get(0)
								.getId(), funDict.getId());
		int size = orgs.size();
		String[] deptNos = new String[size];
		for (int i = 0; i < size; i++) {
			deptNos[i] = orgs.get(i).getDepartmentNo();
		}
		return deptNos;
	}

	@Override
	public Organization getOrgAndLevelInfo(Long orgId) {
		return organizationDao.getOrgAndLevelInfo(orgId);
	}

	@Override
	public List<Organization> fingOrganizationforLevel(Long orgLevelId) {
		return organizationDao.fingOrganizationforLevel(orgLevelId);
	}

	@Override
	public Organization updateOrganizationForGis(Long orgId, GisInfo gisInfo) {
		Organization org = new Organization();
		org.setId(orgId);
		org.setGisInfo(gisInfo);
		return organizationDao.updateOrganizationForGis(org);
	}

	@Override
	public Organization unBundOrgToGis(Long orgId) {
		try {
			return organizationDao.unBundOrgToGis(orgId);
		} catch (Exception e) {
			throw new ServiceValidationException("组织机构解绑地图异常", e);
		}

	}

	@Override
	public List<Organization> findOrganizationByParentIdAndOrgType(
			Long parentId, Long orgType) {
		return organizationDao.findOrganizationByParentIdAndOrgType(parentId,
				orgType);
	}

	@Override
	public Organization getDistrictTownOrganizationId(Long orgId) {
		if (orgId == null) {
			return null;
		}
		Organization org = getFullOrgById(orgId);
		while (org.getParentOrg() != null) {
			if (org.getOrgLevel().getInternalId() == OrganizationLevel.TOWN) {
				return org;
			} else {
				org = getFullOrgById(org.getParentOrg().getId());
			}
		}
		return org;
	}

	@Override
	public Organization findSomeLevelParentOrg(Long orgId, int levelInternalId) {
		Organization org = getFullOrgById(orgId);
		if (OrganizationLevel.levelCompare(org.getOrgLevel().getInternalId(),
				levelInternalId) < 0) {
			while (org.getParentOrg() != null) {
				org = getFullOrgById(org.getParentOrg().getId());
				if (OrganizationLevel.levelCompare(org.getOrgLevel()
						.getInternalId(), levelInternalId) == 0) {
					return org;
				}
			}
		}
		return null;
	}

	@Override
	public boolean isHasThisOrganization(Long orgId) {
		boolean flag = false;
		try {
			flag = organizationDao.isHasThisOrganization(orgId);
		} catch (Exception e) {
			throw new ServiceValidationException("获取部门信息失败", e);
		}
		return flag;
	}

	@Override
	public List<Organization> findOrgsByOrgCodeAndOrgLevelInternalsAndOrgTypeInternals(
			String orgCode, List<Integer> orgLevelInternals,
			List<Integer> orgTypeInternals, List<Long> exceptOrgIds) {
		return organizationDao
				.findOrgsByOrgCodeAndOrgLevelInternalsAndOrgTypeInternals(
						orgCode, orgLevelInternals, orgTypeInternals,
						exceptOrgIds);
	}

	@Override
	public Organization getRootOrganization() {

		return organizationDao.getRootOrganization();
	}

	@Override
	public List<Organization> findChildOrgs(Long startOrgId, Long endOrgId) {
		List<Organization> organizations = new ArrayList<Organization>();
		recursionGetOrg(startOrgId, endOrgId, organizations);
		Collections.reverse(organizations);
		fillOrgTypeAndLevel(organizations);
		return organizations;
	}

	private void fillOrgTypeAndLevel(List<Organization> organizations) {
		for (Organization org : organizations) {
			org.setOrgLevel(propertyDictService.getPropertyDictById(org
					.getOrgLevel().getId()));
			org.setOrgType(propertyDictService.getPropertyDictById(org
					.getOrgType().getId()));
		}
	}

	private void recursionGetOrg(Long startOrgId, Long endOrgId,
			List<Organization> organizations) {
		Organization org = getSimpleOrgById(endOrgId);
		organizations.add(org);
		if (null == org.getParentOrg() || startOrgId.equals(endOrgId)) {
			return;
		} else if (startOrgId.equals(org.getParentOrg().getId())) {
			organizations.add(getSimpleOrgById(startOrgId));
			return;
		} else {
			recursionGetOrg(startOrgId, org.getParentOrg().getId(),
					organizations);
		}
	}

	@Override
	public List<Organization> findOrgsFetchParentOrgByKeyword(String keyword,
			int size) {
		if (null == keyword || "".equals(keyword)) {
			return null;
		}
		List<Organization> orgs = organizationDao
				.findOrgsFetchParentOrgByKeyword(keyword, size);
		for (Organization org : orgs) {
			org = getFullOrgById(org.getId());
		}
		return orgs;
	}

	@Override
	public List<Organization> findOrgsByOrgTypeAndOrgLevelAndParentId(
			Integer orgTypeInternalId, Integer orgLevelInternalId, Long parentId) {
		if (null == parentId || null == orgTypeInternalId
				|| null == orgLevelInternalId) {
			return null;
		}
		String parentOrgInternalCode = getOrgInternalCodeById(parentId);
		Long orgTypeId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationType.ORG_TYPE_KEY, orgTypeInternalId);
		Long orgLevelId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationLevel.ORG_LEVEL_KEY, orgLevelInternalId);

		return organizationDao
				.findOrgsByOrgTypeIdAndOrgLevelIdAndParentOrgInternalCode(
						orgTypeId, orgLevelId, parentOrgInternalCode);
	}

	@Override
	public List<Organization> findOrganizationByOrgTypeAndOrgLevelAndParentId(
			Integer orgTypeInternalId, Integer orgLevelInternalId, Long parentId) {
		List<Organization> list = new ArrayList<Organization>();
		if (null == parentId || null == orgTypeInternalId
				|| null == orgLevelInternalId) {
			return null;
		}
		User user = ThreadVariable.getUser();
		if (user == null || user.getOrganization() == null
				|| user.getOrganization().getId() == null
				|| user.getOrganization().getOrgLevel() == null
				|| user.getOrganization().getOrgLevel().getId() == null) {
			throw new BusinessValidationException("用户信息为空，请重新登录");
		}
		String userorgInternalCode = ThreadVariable.getUser()
				.getOrgInternalCode();
		Long orgTypeId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationType.ORG_TYPE_KEY, orgTypeInternalId);
		Long orgLevelId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationLevel.ORG_LEVEL_KEY, orgLevelInternalId);
		Long userLeavel = user.getOrganization().getOrgLevel().getId();
		Integer isUp = 0;
		if (orgLevelId < userLeavel) {// 查询当当前用户的直属上级
			isUp = 1;
		}
		if (orgTypeInternalId == OrganizationType.FUNCTIONAL_ORG
				&& (!PlatformMessageType.IS_SEARCH_ADMIN_MESSAGE
						.equals(ThreadVariable.getUser().getUserName()))) {
			Organization org = getCrruentOrg(orgLevelInternalId, user
					.getOrganization().getId());
			if (org != null) {
				// 根据查询得到的组织机构查询该组织机构下的职能部门信息 isUp=0：查询当前层级，1：下辖所有
				list = organizationDao.findFuncOrgInfoByCondition(orgLevelId,
						orgTypeId, org.getOrgInternalCode(), isUp);
			}
		} else {
			// 判断 如果用户是职能部门的用户，则通过parentId去查询信息，否则就通过当前用户的ID去查询。
			PropertyDict organizationType = propertyDictService
					.getPropertyDictById(user.getOrganization().getOrgType()
							.getId());
			if (organizationType.getInternalId() == OrganizationType.FUNCTIONAL_ORG) {
				userorgInternalCode = getOrgInternalCodeById(parentId);
			}
			list = organizationDao
					.findOrgsByOrgTypeIdAndOrgLevelIdAndOrgInternalCode(
							orgTypeId, orgLevelId, userorgInternalCode, isUp);
		}

		return list;
	}

	/***
	 * 判断当前需要发送的职能部门层级
	 * 
	 * @param organizations
	 */
	private Organization getCrruentOrg(Integer orgLevelInternalId, Long orgId) {
		List<Organization> list = new ArrayList<Organization>();
		if (orgLevelInternalId == OrganizationLevel.PROVINCE) {
			list = organizationDao.findOrganizationByOrgIdAndNum(orgId,
					OrganizationType.FUNCTIONAL_ORG_PROVINCE_LEVEL);// 查询省级的组织机构信息
		}
		if (orgLevelInternalId == OrganizationLevel.CITY) {
			list = organizationDao.findOrganizationByOrgIdAndNum(orgId,
					OrganizationType.FUNCTIONAL_ORG_CITY_LEVEL);// 查询市级的组织机构信息
		}
		if (orgLevelInternalId == OrganizationLevel.DISTRICT) {
			list = organizationDao.findOrganizationByOrgIdAndNum(orgId,
					OrganizationType.FUNCTIONAL_ORG_DISTRICT_LEVEL);// 查询县级的组织机构信息
		}
		if (orgLevelInternalId == OrganizationLevel.TOWN) {
			list = organizationDao.findOrganizationByOrgIdAndNum(orgId,
					OrganizationType.FUNCTIONAL_ORG_TOWN_LEVEL);// 查询乡镇级的组织机构信息
		}
		if (orgLevelInternalId == OrganizationLevel.VILLAGE) {
			list = organizationDao.findOrganizationByOrgIdAndNum(orgId,
					OrganizationType.FUNCTIONAL_ORG_VILLAGE_LEVEL);// 查询社区级的组织机构信息
		}
		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<Organization> findOrgsByOrgTypeAndOrgLevel(
			Integer orgTypeInternalId, Integer orgLevelInternalId,
			Long userOrgId) {
		if (null == orgTypeInternalId || null == orgLevelInternalId) {
			return new ArrayList<Organization>();
		}
		String userOrgInternalCode = getOrgInternalCodeById(userOrgId);
		Long orgTypeId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationType.ORG_TYPE_KEY, orgTypeInternalId);
		Long orgLevelId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationLevel.ORG_LEVEL_KEY, orgLevelInternalId);

		List<Organization> results = organizationDao
				.findOrgsByOrgTypeIdAndOrgLevelId(orgTypeId, orgLevelId,
						userOrgInternalCode);
		createPropertyDictNameById(results);
		return results;
	}

	private void createPropertyDictNameById(List<Organization> organizations) {
		if (organizations == null) {
			return;
		}
		for (int i = 0; i < organizations.size(); i++) {
			if (organizations.get(i).getFunctionalOrgType() != null) {
				Long functionalOrgTypeId = organizations.get(i)
						.getFunctionalOrgType().getId();
				if (functionalOrgTypeId != null) {
					organizations.get(i).setFunctionalOrgType(
							propertyDictService
									.getPropertyDictById(functionalOrgTypeId));
				}
			}
		}
	}

	private Long getPropertyDictIdByDomainNameAndInternalId(String domainName,
			Integer orgTypeInternalId) {
		if (null == domainName || "".equals(domainName)
				|| null == orgTypeInternalId) {
			return null;
		}
		List<PropertyDict> dicts = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(domainName,
						orgTypeInternalId);
		if (null == dicts || dicts.size() == 0) {
			return null;
		}
		return dicts.get(0).getId();
	}

	@Override
	public String getOrgInternalCodeById(Long id) {
		String orgInternalCode = "";
		Organization parentOrg = getSimpleOrgById(id);
		if (null != parentOrg) {
			orgInternalCode = getSimpleOrgById(id).getOrgInternalCode();
		}
		return orgInternalCode;
	}

	@Override
	public List<Organization> findFunOrgsByFunParentId(Long funParentId) {
		return organizationDao.findFunOrgsByFunParentId(funParentId);
	}

	@Override
	public Organization getTownOrganizationById(Long orgId) {
		if (orgId == null)
			return null;
		Organization org = getFullOrgById(orgId);
		while (org.getParentOrg() != null) {
			if (isTownOrganization(org)) {
				return org;
			} else {
				org = getFullOrgById(org.getParentOrg().getId());
			}
		}
		return null;
	}

	@Override
	public List<String> findOrganizationInternaCodeSpecifiedOrgName(
			String orgName) {
		List<String> list = new ArrayList<String>();
		List<Organization> organizations = organizationDao
				.findOrganizationsByOrgName(orgName);
		for (Organization o : organizations) {
			String internalCode = o.getOrgInternalCode();
			if (StringUtils.isNotEmpty(internalCode)) {
				list.add(internalCode);
			}
		}
		return list;
	}

	@Override
	public List<String> findOrganizationInternaCodeHaiNing() {
		// return organizationDao.findOrganizationInternaCodeByOrgName("海宁市");
		List<String> list = new ArrayList<String>();
		List<Organization> organizations = organizationDao
				.findOrganizationsByOrgName("海宁市");
		for (Organization o : organizations) {
			String internalCode = o.getOrgInternalCode();
			if (StringUtils.isNotEmpty(internalCode)) {
				list.add(internalCode);
			}
		}
		return list;
	}

	@Override
	public List<Organization> getOrgZN(Long id) {
		return organizationDao.getOrgZN(id);
	}

	@Override
	public String getUserCityOrganizationName() {
		String cityOrgName = "";
		Long orgId = ThreadVariable.getOrganization().getId();
		Organization org = organizationDao.getSimpleOrgById(orgId);
		if (org != null) {
			if (org.getDepartmentNo() != null
					&& org.getDepartmentNo().length() > 4) {
				org.setDepartmentNo(org.getDepartmentNo().substring(0, 4));
			}
			org = organizationDao.getOrgByDepartmentNo(org.getDepartmentNo());
			cityOrgName = org == null ? cityOrgName : org.getOrgName();
		}
		if ("".equals(cityOrgName)) {
			List<Organization> orgList = organizationDao
					.findOrganizationsByParentId(orgId);
			if (orgList != null && orgList.size() != 0
					&& orgList.get(0) != null) {
				if (orgList.get(0).getDepartmentNo() != null
						&& orgList.get(0).getDepartmentNo().length() == 2) {
					cityOrgName = orgList.get(0).getOrgName();
				}
			}
		}
		return cityOrgName;
	}

	@Override
	public List<Organization> findOrgsByDepartmentNo(String departmentNo) {
		if (departmentNo == null) {
			throw new BusinessValidationException("部门编号不能为空");
		}
		return organizationDao.findOrgsByDepartmentNo(departmentNo);
	}

	@Override
	public List<Organization> findFunOrgsByParentOrgId(Long parentOrgId) {
		List<PropertyDict> propertyDicts = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationType.ORG_TYPE_KEY,
						OrganizationType.FUNCTIONAL_ORG);
		Long[] propertyDictIds = new Long[propertyDicts.size()];
		for (int i = 0; i < propertyDicts.size(); i++) {
			propertyDictIds[i] = propertyDicts.get(i).getId();
		}
		return organizationDao.findFunOrgsByParentOrgIdAndOrgTypes(parentOrgId,
				propertyDictIds);
	}

	@Override
	public List<Organization> findOrganizationsByOrgName(String orgName) {
		if (orgName == null) {
			throw new BusinessValidationException("部门名称不能为空");
		}
		return organizationDao.findOrganizationsByOrgName(orgName);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndOrgTypeInternalIdsAndFunctionalType(
			Long parentId, Long[] orgTypeInternalIds, Long orgFunctionalType) {
		return organizationDao
				.findOrgsByParentIdAndOrgTypeInternalIdsAndFunctionalType(
						parentId, orgTypeInternalIds, orgFunctionalType);
	}

	@Override
	public Organization getParentOrgByOrgTypeAndChildOrgId(Long orgId,
			int orgLevel) {
		Organization tempOrg = getFullOrgById(orgId);
		if (tempOrg.getOrgType().getInternalId() == OrganizationType.ADMINISTRATIVE_REGION) {
			PropertyDict propertyDict = propertyDictService
					.getPropertyDictById(tempOrg.getOrgLevel().getId());
			if (propertyDict.getInternalId() >= orgLevel) {
				return tempOrg;
			} else {
				return getParentOrgByOrgTypeAndChildOrgId(tempOrg
						.getParentOrg().getId(), orgLevel);
			}
		} else {
			return getParentOrgByOrgTypeAndChildOrgId(tempOrg.getParentOrg()
					.getId(), orgLevel);
		}

	}

	@Override
	public boolean hasFunOrganizationByParentOrgAndFunOrgType(
			String parentOrgCode, Long funOrgType) {
		return organizationDao.hasFunOrganizationByParentOrgAndFunOrgType(
				parentOrgCode, funOrgType);
	}

	@Override
	public List<Long> getOrganizationsByLevel(Long typeId, Long levelId) {
		return organizationDao.getOrganizationsByLevel(typeId, levelId);
	}

	@Override
	public List<Organization> getDepartmentNoByLevel(Long typeId, Long levelId) {
		return organizationDao.getDepartmentNoByLevel(typeId, levelId);
	}

	@Override
	public List<Organization> findDistrictAdminOrgsByOrgType(Long orgTypeId,
			String searchOrgCode, String orgCodeFindLevel) {
		return organizationDao.findDistrictAdminOrgsByOrgType(orgTypeId,
				searchOrgCode, orgCodeFindLevel);
	}

	@Override
	public List<Organization> findProvinceOrganizationsByOrgId(Long orgId) {
		return organizationDao.findProvinceOrganizationsByOrgId(orgId);
	}

	@Override
	public List<Organization> findOrganizationByOrgIdAndNum(Long orgId,
			Integer num) {
		List<Organization> list = organizationDao
				.findOrganizationByOrgIdAndNum(orgId, num);
		if (list != null && list.size() != 0) {
			Organization organization = list.get(0);
			organization.setOrgType(propertyDictService
					.getPropertyDictById(organization.getOrgType().getId()));
		}
		return list;
	}

	@Override
	public Organization getOrganizationByOrganizationCode(
			String organizationCode) {
		return organizationDao
				.getOrganizationByOrganizationCode(organizationCode);
	}

	/**
	 * 
	 * @Title: getOrganizationByIdAndDictName
	 * @Description: TODO根据组织机构id，字典项名称，查询组织机构
	 * @param @param id
	 * @param @param domainName
	 * @param @param dictName
	 * @param @return 设定文件
	 * @return Organization 返回类型
	 * @author wanggz
	 * @date 2014-8-29 上午10:46:16
	 */
	@Override
	public Organization getOrganizationByIdAndDictName(Long id,
			String domainName, String dictName) {
		try {
			if (id == null || domainName == null || "".equals(domainName)
					|| dictName == null || "".equals(dictName)) {
				return null;
			} else {
				return organizationDao.getOrganizationByIdAndDictName(id,
						domainName, dictName);
			}
		} catch (Exception e) {
			throw new ServiceValidationException("查询组织机构出错", e);
		}
	}

	public List<Long> findAllRelatedOrgIdsByUserOrgId(int startLevelId) {
		String userOrg = ThreadVariable.getOrganization().getOrgInternalCode();
		int userOrgLevel = ThreadVariable.getOrganization().getOrgLevel()
				.getInternalId();
		if (ThreadVariable.getOrganization().getOrgType() != null
				&& ThreadVariable.getOrganization().getOrgType()
						.getInternalId() == OrganizationType.FUNCTIONAL_ORG
				&& ThreadVariable.getOrganization().getParentOrg() != null) {
			userOrg = ThreadVariable.getOrganization().getParentOrg()
					.getOrgInternalCode();
			userOrgLevel = ThreadVariable.getOrganization().getParentOrg()
					.getOrgLevel().getInternalId();
		}
		List<Long> allOrgIds = new ArrayList<Long>();
		for (int i = startLevelId; i > userOrgLevel; i -= 10) {
			String organizationCode = FindStringOfWordUtil
					.findStringOfWordPlace(userOrg, ".", 1,
							(OrganizationLevel.COUNTRY - i) / 10 + 1);
			Organization org = organizationDao
					.getOrganizationByOrganizationCode(organizationCode);
			allOrgIds.add(org.getId());
		}
		List<Organization> orgs = organizationDao
				.findOrganizationsByOrgInternalCode(userOrg);
		if (orgs == null || orgs.size() < 1) {
			return allOrgIds;
		}
		for (Organization org : orgs) {
			allOrgIds.add(org.getId());
		}
		return allOrgIds;
	}

	@Override
	public List<Organization> findOrgsByParentOrgAndOrgTypeInternalId(
			String OrgInternalCode, Integer orgTypeInternalId) {
		return organizationDao.findOrgsByParentOrgAndOrgTypeInternalId(
				OrgInternalCode, orgTypeInternalId);
	}

	@Override
	public Organization getCityOrgByAreaOrgId(Long id) {
		List<Long> listParentIds = searchParentOrgIds(id, null);
		for (Long orgId : listParentIds) {
			Organization organization = getFullOrgById(orgId);
			if (organization.getOrgLevel().getInternalId() == Long
					.valueOf(OrganizationLevel.CITY + "")) {
				return organization;
			}
		}
		return null;
	}

	@Override
	public Organization getCityOrganizationId(Long orgId) {
		if (orgId == null) {
			return null;
		}
		Organization org = getFullOrgById(orgId);
		while (org.getParentOrg() != null) {
			if (org.getOrgLevel().getInternalId() == OrganizationLevel.CITY) {
				return org;
			} else {
				org = getFullOrgById(org.getParentOrg().getId());
			}
		}
		return org;
	}

	@Override
	public List<Organization> findAllOrganization() {
		return organizationDao.findAllOrganization();
	}

	@Override
	public List<Organization> findOrgByOrgNameAndInternalCode(String orgName,
			String orgInternalCode, int pageNum, int pageSize) {
		return organizationDao
				.findOrganizationsByOrgNameAndInternalCodeForPage(
						orgInternalCode, orgName, pageNum, pageSize);
	}

	@Override
	public List<Long> findLeafOrgIdByCode(String orgCode) {
		return organizationDao.findLeafOrgIdByCode(orgCode);
	}

	@Override
	public List<Long> getOrganizationByOrgLevelAndOrgType(Long orgLevel,
			Long orgType) {
		return organizationDao.findOrganizationByOrgLevelAndOrgType(orgLevel,
				orgType);
	}

	@Override
	public List<Organization> findAllOrgByParentOrgCode(String orgCode,
			String orgType) {
		PropertyDict typeDict = propertyDictService
				.getPropertyDictByDomainName(orgType);
		return organizationDao.findAllOrgByParentOrgCode(orgCode,
				typeDict.getId());
	}

	public List<Long> findOrganizationsByParentIdAndType(Long orgId,
			int orgTypeId) {
		return organizationDao.findOrganizationsByParentIdAndType(orgId,
				orgTypeId);
	}

	@Override
	public List<Long> queryOrgIdsByModelForStatisticsAccountTimeouts(
			List<Long> idModList, String taskParameter, Integer paseSize,
			String tableName) {
		if (idModList == null || idModList.size() == 0
				|| !StringUtil.isStringAvaliable(taskParameter)) {
			return null;
		}

		return organizationDao.queryOrgIdsByModelForStatisticsAccountTimeouts(
				idModList, taskParameter, paseSize, tableName);
	}

	// add by bing 2014年11月12日 下午6:06:18
	@Override
	public List<Long> findOrganIdForLevelExcludeGrid(Long orgLevelId,
			int taskItemNum, List<Long> idModList, int fetchNum, int year,
			int month, String targetIssueTable) {
		List<Long> organIds = new ArrayList<Long>();
		List<Organization> organizations = organizationDao
				.findOrganIdForLevelExcludeGrid(orgLevelId, taskItemNum,
						idModList, fetchNum, year, month, targetIssueTable);
		for (Organization organization : organizations) {
			organIds.add(organization.getId());
		}
		return organIds;
	}

	// add by bing 2014年11月12日 下午6:06:23

	@Override
	public Integer countOrgIdsByModelForStatisticsAccountTimeouts(
			List<Long> idModList, String taskParameter) {
		if (idModList == null || idModList.size() == 0
				|| !StringUtil.isStringAvaliable(taskParameter)) {
			return 0;
		}
		return organizationDao.countOrgIdsByModelForStatisticsAccountTimeouts(
				idModList, taskParameter);
	}

	@Override
	public List<Long> queryOrgIdsByModelForAccountReport(List<Long> idModList,
			String taskParameter, int orgLevelInternalId, int orgTypeInternalId) {
		if (idModList == null || idModList.size() == 0
				|| !StringUtil.isStringAvaliable(taskParameter)) {
			return null;
		}

		return organizationDao.queryOrgIdsByModelForAccountReport(idModList,
				taskParameter, orgLevelInternalId, orgTypeInternalId);
	}

	/******************* 组织机构迁移合并方法 *******************/
	@Override
	public Organization updateOrgSubCount(Long id, int num) {
		return organizationDao.updateOrgSubCount(id, num);
	}

	@Override
	public int updateAllOrgSubCount(Long id) {
		return organizationDao.updateAllOrgSubCount(id);
	}

	@Override
	public void updateOrgSeqAndParentId(Long id, Long seq, Long parentId) {
		organizationDao.updateOrgSeqAndParentId(id, seq, parentId);
	}

	@Override
	public Integer getMaxCodeById(Long id) {
		organizationDao.updateMaxCodeById(id);
		Integer maxCode = organizationDao.getMaxCodeById(id);
		if (maxCode == null) {
			maxCode = 0;
		}
		return maxCode;
	}

	@Override
	public void updateOrgInternalCode(Long id, String newOrgCode) {
		organizationDao.updateOrgInternalCode(id, newOrgCode);
	}

	@Override
	public Integer findChildrenMaxSeqByParentId(Long parentId) {
		return organizationDao.findChildrenMaxSeqByParentId(parentId);
	}

	@Override
	public List<String> getDepartmentnosByParentOrgId(Long parentId) {
		return organizationDao.getDepartmentnosByParentOrgId(parentId);
	}

	@Override
	public void editChildOrganizationDeptNo(String oldDeptNo, String newDeptNo) {
		organizationDao.editChildOrganizationDeptNo(oldDeptNo, newDeptNo);
	}

	@Override
	public Organization getOrgForFirstCity(Long userOrgId) {
		if (userOrgId == null) {
			throw new BusinessValidationException("参数错误");
		}
		Organization result = null;
		try {
			Organization org = getFullOrgById(userOrgId);
			PropertyDict orgLevel = null;
			PropertyDict orgType = null;

			if (org != null && org.getOrgLevel() != null) {
				orgLevel = propertyDictService.getPropertyDictById(org
						.getOrgLevel().getId());
			}
			if (orgLevel == null
					|| orgLevel.getInternalId() < OrganizationLevel.PROVINCE) {
				throw new BusinessValidationException("不是省级及以上用户");
			}
			if (org.getOrgType() != null) {
				orgType = propertyDictService.getPropertyDictById(org
						.getOrgType().getId());
			}
			if (org != null) {
				if (orgType != null
						&& orgType.getInternalId() == OrganizationType.FUNCTIONAL_ORG) {
					org = organizationDao.getSimpleOrgById(org.getParentOrg()
							.getId());
					userOrgId = org.getId();
				}
				PropertyDict cityOrgLevel = propertyDictService
						.findPropertyDictByDomainNameAndDictDisplayName(
								PropertyTypes.ORGANIZATION_LEVEL,
								OrganizationLevel.CITY_KEY);

				orgType = propertyDictService
						.findPropertyDictByDomainNameAndDictDisplayName(
								PropertyTypes.ORGANIZATION_TYPE,
								OrganizationType.ADMINISTRATIVE_KEY);

				result = organizationDao.getAdministrativeCityOrg(
						org.getOrgInternalCode(), orgType.getId(),
						cityOrgLevel.getId());
				PropertyDict dict = propertyDictService
						.getPropertyDictById(result.getOrgLevel().getId());
				result.setOrgLevel(dict);
			}

		} catch (Exception e) {
			throw new ServiceValidationException(
					"GroupFamilyServiceImpl类的getOrganizationForChengdu方法错误，原因是：",
					e);
		}
		return result;
	}

	@Override
	public Organization findTownOrgInfoByOrgId(Long orgId) {
		if (orgId == null) {
			throw new BusinessValidationException("参数错误");
		}
		Organization townOrg;
		try {
			townOrg = null;
			Organization org = getSimpleOrgById(orgId);

			if (org != null) {
				PropertyDict gridLevel = propertyDictService
						.findPropertyDictByDomainNameAndInternalId(
								PropertyTypes.ORGANIZATION_LEVEL,
								OrganizationLevel.GRID).get(0);
				PropertyDict adminOrgType = propertyDictService
						.findPropertyDictByDomainNameAndInternalId(
								PropertyTypes.ORGANIZATION_TYPE,
								OrganizationType.ADMINISTRATIVE_REGION).get(0);
				if (gridLevel.getId().equals(org.getOrgLevel().getId())
						&& adminOrgType.getId()
								.equals(org.getOrgType().getId())) {
					List<Organization> list = findOrganizationByOrgIdAndNum(
							orgId, OrganizationType.TOWN_LEVEL);
					if (list != null && list.size() != 0) {
						townOrg = list.get(0);
					}

				}
			}
			return townOrg;
		} catch (Exception e) {
			throw new ServiceValidationException(
					"OrganizationServiceImpl类的findTownOrgInfoByOrgId方法错误，原因是：",
					e);
		}
	}

	@Override
	public List<Long> findOrgIdsBySearchVo(OrganizationVo searchVo) {
		return organizationDao.findOrgIdsBySearchVo(searchVo);
	}
	
	@Override
	public List<Organization> findOrgsBySearchVo(OrganizationVo searchVo) {
		return organizationDao.findOrgsBySearchVo(searchVo);
	}

	@Override
	public List<Organization> findNameAndRemarkBySearchVo(OrganizationVo searchVo) {
		return organizationDao.findNameAndRemarkBySearchVo(searchVo);
	}
	
	@Override
	public Integer countOrgsBySearchVo(OrganizationVo searchVo) {
		return organizationDao.countOrgsBySearchVo(searchVo);
	}
	
	@Override
	public String getUserOrganztionCodeByOrgId(Long orgId) {
		return organizationDao.getUserOrganztionCodeByOrgId(orgId);
	}

	@Override
	public List<Integer> getViewObjectDefNum(List<Map<String, Object>> list) {
		return organizationDao.getViewObjectDefNum(list);
	}

	@Override
	public List<Long> getOrgIdsWhenSelectByLevel(
			List<Map<String, Object>> selectedLevelList) {
		return organizationDao.getOrgIdsWhenSelectByLevel(selectedLevelList);
	}

	@Override
	public List<String> getSelectedOrgNamesByOrgIdsAndTypeLevel(
			OrganizationVo organizationVo) {
		return organizationDao
				.getSelectedOrgNamesByOrgIdsAndTypeLevel(organizationVo);
	}

	@Override
	public Organization getOrgByOrgIdAndOrgLevelInternalId(Long orgId, Integer internalId){
		return organizationDao.getOrgByOrgIdAndOrgLevelInternalId(orgId, internalId);
	}

	@Override
	public Integer countOrgByOrgIdsListAndResidentStatusDict(
			OrganizationVo searchVo) {
		return organizationDao.countOrgByOrgIdsListAndResidentStatusDict(searchVo);
	}

	@Override
	public Organization findOrganizationByOrgTypeAndOrgLevelAndOrgName(
			Long orgTypeId, Long orgLevelId, String orgName,String fullOrgName) {
		if (orgTypeId == null || orgLevelId==null || !StringUtil.isStringAvaliable(orgName)||!StringUtil.isStringAvaliable(fullOrgName)) {
			throw new BusinessValidationException("参数错误");
		}
		try {
			return organizationDao.findOrganizationByOrgTypeAndOrgLevelAndOrgName(orgTypeId,orgLevelId,orgName,fullOrgName);
		} catch (Exception e) {
			throw new ServiceValidationException(
					"OrganizationServiceImpl类的findOrganizationByOrgTypeAndOrgLevelAndOrgName方法错误，原因是：",
					e);
		}
	}
	
	@Override
	public Long getOrganizationforLevelWithGridTotal() {
		List<PropertyDict> dictGrid = propertyDictService.findPropertyDictByDomainNameAndInternalId(OrganizationLevel.ORG_LEVEL_KEY, OrganizationLevel.GRID);
		Long total = 0L;
		if (null != dictGrid && dictGrid.size() == 1)
		{
			total = organizationDao.getOrganizationforLevelWithGridTotal(dictGrid.get(0).getId());
		}
		return total;
	}
	
	// 以下四个方法是三本台账新增调用的
	@Override
	public List<Organization> findByDepartmentNoAndParentId(
			String departmentNo, Long parentId) {
		if (parentId == null) {
			throw new BusinessValidationException("查询失败，组织机构父ID未得到");
		}
		return organizationDao.findByDepartmentNoAndParentId(departmentNo,
				parentId);
	}

	@Override
	public PageInfo<AutoCompleteData> findChildOrgsByParentIdAndName(
			PropertyDict orgType, Long parentId, String tag, Long[] exceptIds,
			String[] exceptDeptNos, int page, int rows) {
		if (parentId == null) {
			throw new BusinessValidationException("查询失败，组织机构父ID未得到");
		}
		return organizationDao.findChildOrgsByParentIdAndName(orgType,
				parentId, tag, exceptIds, exceptDeptNos, page, rows);
	}

//	@Override
//	public List<AutoCompleteData> findChildFunOrgsByParentFunIdAndName(
//			Long parentId, String orgName, Long[] exceptIds) {
//		if (parentId == null) {
//			throw new BusinessValidationException("查询失败，组织机构父ID未得到");
//		}
//		return organizationDao.findChildFunOrgsByParentFunIdAndName(parentId,
//				orgName, exceptIds);
//	}

//	@Override
//	public List<AutoCompleteData> findParentFunOrgsByIdAndName(Long id,
//			String tag, Long[] exceptIds) {
//		if (id == null) {
//			throw new BusinessValidationException("查询失败，组织机构ID未得到");
//		}
//		return organizationDao.findParentFunOrgsByIdAndName(id, tag, exceptIds);
//	}

	@Override
	public List<Organization> findFuncOrgInfoByCondition(String orgCode,
			Long orgLevel,Integer isUp) {
		return organizationDao.findFuncOrgInfoByCondition(orgLevel, null, orgCode, isUp);
	}

	@Override
	public Organization getSimpleOrgAllOrganizationById(Long id) {
		return organizationDao.getSimpleOrgAllOrganizationById(id);
	}

	@Override
	public List<Organization> getAdministrativeOrgByLevelAndType(String orgCode,
			Long orgLevel, Long orgType) {
		return organizationDao.getAdministrativeOrgByLevelAndType(orgCode, orgLevel, orgType);
	}
	
	@Override
	public Long countOrgsByLevelAndOrgCode(Long orgLevel, String orgCode) {
		return organizationDao.countOrgsByLevelAndOrgCode(orgLevel, orgCode);
	}
}
