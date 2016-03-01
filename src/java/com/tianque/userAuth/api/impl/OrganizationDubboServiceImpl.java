package com.tianque.userAuth.api.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.AutoCompleteData;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.GisInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.vo.OrganizationVo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.impl.ReferType;
import com.tianque.userAuth.api.OrganizationDubboRemoteService;

/**
 * @ClassName: OrganizationDubboServiceImpl
 * @Description: 认证中心，组织机构dubbo服务接口实现
 * @author wangxiaohu wsmalltiger@163.com
 * @date 2015年3月9日 下午1:49:40
 */
@Component
public class OrganizationDubboServiceImpl implements OrganizationDubboRemoteService {
	@Autowired
	private OrganizationService organizationService;

	@Override
	public List<Organization> findOrganizationsByParentId(Long parentId) {
		return organizationService.findOrganizationsByParentId(parentId);
	}

	@Override
	public List<Long> findOrgIdByParentId(Long parentId) {
		return organizationService.findOrgIdByParentId(parentId);
	}

	@Override
	public Organization addOrganization(Organization organization) {
		return organizationService.addOrganization(organization);
	}

	@Override
	public String deleteOrgById(Long id) {
		return organizationService.deleteOrgById(id);
	}
	@Override
	public List<Organization> findProvinceOrganizationsByOrgIdAndCityLevel(
			Long orgId, Integer organizationLevel) {
		return organizationService.findProvinceOrganizationsByOrgIdAndCityLevel(
				orgId, organizationLevel);
	}
	@Override
	public Organization getSimpleOrgById(Long id) {
		return organizationService.getSimpleOrgById(id);
	}

	@Override
	public Organization updateOrgNameAndOrgTypeAndContactWay(
			Organization organization) {
		return organizationService
				.updateOrgNameAndOrgTypeAndContactWay(organization);
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameForPage(String orgName,
			int pageNum, int pageSize) {
		return organizationService.findOrganizationsByOrgNameForPage(orgName,
				pageNum, pageSize);
	}

	@Override
	public List<Organization> findOrganizationsByorgNameAndOrgType(
			String orgName, int pageNum, int pageSize) {
		return organizationService.findOrganizationsByorgNameAndOrgType(
				orgName, pageNum, pageSize);
	}

	@Override
	public void moveOrganization(Long id, Long parentId, ReferType position,
			Long referOrgId) {
		organizationService
				.moveOrganization(id, parentId, position, referOrgId);
	}

	@Override
	public List<Long> searchParentOrgIds(Long orgId, Long rootId) {
		return organizationService.searchParentOrgIds(orgId, rootId);
	}

	@Override
	public List<Long> searchParentOrgIdsWhenRootIsTown(Long id) {
		return organizationService.searchParentOrgIdsWhenRootIsTown(id);
	}

	@Override
	public String getOrganizationRelativeNameByRootOrgIdAndOrgId(Long orgId,
			Long rootId) {
		return organizationService
				.getOrganizationRelativeNameByRootOrgIdAndOrgId(orgId, rootId);
	}

	@Override
	public Map<Long, String> getOrganizationDisplayName(Long[] orgIds) {
		return organizationService.getOrganizationDisplayName(orgIds);
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameAndParentId(Long id,
			String orgName, Long parentId) {
		return organizationService.findOrganizationsByOrgNameAndParentId(id,
				orgName, parentId);
	}

	@Override
	public List<Organization> findOrganizationsByDepartmentNoAndTypeAndLevel(
			Organization org) {
		return organizationService
				.findOrganizationsByDepartmentNoAndTypeAndLevel(org);
	}

	@Override
	public List<Organization> findMultizonesByUserId(Long userId) {
		return organizationService.findMultizonesByUserId(userId);
	}

	@Override
	public int countOrgsByOrgInternalCode(String orgInternalCode) {
		return organizationService.countOrgsByOrgInternalCode(orgInternalCode);
	}

	@Override
	public List<Organization> findFunOrgsByParentId(Long parentId) {
		return organizationService.findFunOrgsByParentId(parentId);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndFunTypes(Long parentId) {
		return organizationService.findOrgsByParentIdAndFunTypes(parentId);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndOrgTypeInternalIds(
			Long parentId, Long[] orgTypeInternalIds) {
		return organizationService.findOrgsByParentIdAndOrgTypeInternalIds(
				parentId, orgTypeInternalIds);
	}

	@Override
	public List<Organization> findMultizonesWithParentOrgNameByUserId(
			Long userId) {
		return organizationService
				.findMultizonesWithParentOrgNameByUserId(userId);
	}

	@Override
	public Organization getFullOrgById(Long id) {
		return organizationService.getFullOrgById(id);
	}

	@Override
	public Organization getOrganizationsByParentAndOrgName(Long parentId,
			String orgName) {
		return organizationService.getOrganizationsByParentAndOrgName(parentId,
				orgName);
	}

	@Override
	public boolean isGridOrganization(Long orgId) {
		return organizationService.isGridOrganization(orgId);
	}
	
	@Override
	public boolean isVillageOrganization(Long orgId){
		return organizationService.isVillageOrganization(orgId);
	}
	
	@Override
	public boolean isVillageOrGridOrganization(Long orgId){
		return organizationService.isVillageOrGridOrganization(orgId);
	}
	
	@Override
	public boolean isTownOrganization(Long orgId) {
		return organizationService.isTownOrganization(orgId);
	}

	@Override
	public Long getTownOrganizationId(Long orgId) {
		return organizationService.getTownOrganizationId(orgId);
	}

	@Override
	public String getMaxDepartmentNoByParentId(Long parentId, Long orgLevel) {
		return organizationService.getMaxDepartmentNoByParentId(parentId,
				orgLevel);
	}

	@Override
	public boolean ifGreaterThanDistrictOrgId(Long orgId) {
		return organizationService.ifGreaterThanDistrictOrgId(orgId);
	}

	@Override
	public Organization getDistrictOrganizationId(Long orgId) {
		return organizationService.getDistrictOrganizationId(orgId);
	}

	@Override
	public Organization getOrganizationByOrgInternalCode(String orgInternalCode) {
		return organizationService
				.getOrganizationByOrgInternalCode(orgInternalCode);
	}

	@Override
	public List<Organization> findOrganizationsByOrgInternalCode(
			String orgInternalCode) {
		return organizationService
				.findOrganizationsByOrgInternalCode(orgInternalCode);
	}

	@Override
	public Organization updateOrganizationByName(String orgName, Long orgId,
			Organization domain) {
		return organizationService.updateOrganizationByName(orgName, orgId,
				domain);
	}

	@Override
	public List<Organization> findAdminOrgsByParentIdAndName(Long id, String tag) {
		return organizationService.findAdminOrgsByParentIdAndName(id, tag);
	}

	@Override
	public List<Organization> findFunOrgsByParentFunOrgIdAndName(Long id,
			String tag) {
		return organizationService.findFunOrgsByParentFunOrgIdAndName(id, tag);
	}

	@Override
	public List<Organization> findFunOrgsByParentIdAndName(Long id, String tag) {
		return organizationService.findFunOrgsByParentIdAndName(id, tag);
	}

	@Override
	public Organization getSimplePinyinBySimpleCode(String simpleCode) {
		return organizationService.getSimplePinyinBySimpleCode(simpleCode);
	}

	@Override
	public boolean isDistrictOfAdministrativeRegion(Organization organization) {
		return organizationService
				.isDistrictOfAdministrativeRegion(organization);
	}

	@Override
	public List<Organization> findAdminOrgsByParentId(Long id) {
		return organizationService.findAdminOrgsByParentId(id);
	}

	@Override
	public List<Organization> getOrganizationByIdAndOrgInternalCode() {
		return organizationService.getOrganizationByIdAndOrgInternalCode();
	}

	@Override
	public boolean validateRepeatDepartmentNo(Organization organization) {
		return organizationService.validateRepeatDepartmentNo(organization);
	}

	@Override
	public Organization getOrgByDepartmentNo(String departmentNo) {
		return organizationService.getOrgByDepartmentNo(departmentNo);
	}

	@Override
	public String[] findDepartmentNosByParentDeparmentNo(String departmentNo) {
		return organizationService
				.findDepartmentNosByParentDeparmentNo(departmentNo);
	}

	@Override
	public Organization getOrgAndLevelInfo(Long orgId) {
		return organizationService.getOrgAndLevelInfo(orgId);
	}

	@Override
	public List<Organization> fingOrganizationforLevel(Long orgLevelId) {
		return organizationService.fingOrganizationforLevel(orgLevelId);
	}

	@Override
	public Organization updateOrganizationForGis(Long orgId, GisInfo gisInfo) {
		return organizationService.updateOrganizationForGis(orgId, gisInfo);
	}

	@Override
	public Organization unBundOrgToGis(Long orgId) {
		return organizationService.unBundOrgToGis(orgId);
	}

	@Override
	public List<Organization> findOrganizationByParentIdAndOrgType(
			Long parentId, Long orgType) {
		return organizationService.findOrganizationByParentIdAndOrgType(
				parentId, orgType);
	}

	@Override
	public Organization getDistrictTownOrganizationId(Long orgId) {
		return organizationService.getDistrictTownOrganizationId(orgId);
	}

	@Override
	public Organization findSomeLevelParentOrg(Long orgId, int levelInternalId) {
		return organizationService.findSomeLevelParentOrg(orgId,
				levelInternalId);
	}

	@Override
	public boolean isHasThisOrganization(Long orgId) {
		return organizationService.isHasThisOrganization(orgId);
	}

	@Override
	public List<Organization> findOrgsByOrgCodeAndOrgLevelInternalsAndOrgTypeInternals(
			String orgCode, List<Integer> orgLevelInternals,
			List<Integer> orgTypeInternals, List<Long> exceptOrgIds) {
		return organizationService
				.findOrgsByOrgCodeAndOrgLevelInternalsAndOrgTypeInternals(
						orgCode, orgLevelInternals, orgTypeInternals,
						exceptOrgIds);
	}

	@Override
	public Organization getRootOrganization() {
		return organizationService.getRootOrganization();
	}

	@Override
	public List<Organization> findChildOrgs(Long startOrgId, Long endOrgId) {
		return organizationService.findChildOrgs(startOrgId, endOrgId);
	}

	@Override
	public List<Organization> findOrgsFetchParentOrgByKeyword(String keyword,
			int size) {
		return organizationService.findOrgsFetchParentOrgByKeyword(keyword,
				size);
	}

	@Override
	public List<Organization> findOrgsByOrgTypeAndOrgLevelAndParentId(
			Integer orgTypeId, Integer orgLevelId, Long parentId) {
		return organizationService.findOrgsByOrgTypeAndOrgLevelAndParentId(
				orgTypeId, orgLevelId, parentId);
	}

	@Override
	public List<Organization> findOrganizationByOrgTypeAndOrgLevelAndParentId(
			Integer orgTypeInternalId, Integer orgLevelInternalId, Long parentId) {
		return organizationService
				.findOrganizationByOrgTypeAndOrgLevelAndParentId(
						orgTypeInternalId, orgLevelInternalId, parentId);
	}

	@Override
	public List<Organization> findOrgsByOrgTypeAndOrgLevel(
			Integer orgTypeInternalId, Integer orgLevelInternalId, Long parentId) {
		return organizationService.findOrgsByOrgTypeAndOrgLevel(
				orgTypeInternalId, orgLevelInternalId, parentId);
	}

	@Override
	public String getOrgInternalCodeById(Long id) {
		return organizationService.getOrgInternalCodeById(id);
	}

	@Override
	public List<Organization> findFunOrgsByFunParentId(Long funParentId) {
		return organizationService.findFunOrgsByFunParentId(funParentId);
	}

	@Override
	public Organization getTownOrganizationById(Long orgId) {
		return organizationService.getTownOrganizationById(orgId);
	}

	@Override
	public List<String> findOrganizationInternaCodeSpecifiedOrgName(
			String orgName) {
		return organizationService
				.findOrganizationInternaCodeSpecifiedOrgName(orgName);
	}

	@Override
	public List<String> findOrganizationInternaCodeHaiNing() {
		return organizationService.findOrganizationInternaCodeHaiNing();
	}

	@Override
	public List<Organization> getOrgZN(Long id) {
		return organizationService.getOrgZN(id);
	}

	@Override
	public String getUserCityOrganizationName() {
		return organizationService.getUserCityOrganizationName();
	}

	@Override
	public List<Organization> findOrgsByDepartmentNo(String departmentNo) {
		if (departmentNo == null) {
			throw new BusinessValidationException("部门编号不能为空");
		}
		return organizationService.findOrgsByDepartmentNo(departmentNo);
	}

	@Override
	public List<Organization> findFunOrgsByParentOrgId(Long parentOrgId) {
		return organizationService.findFunOrgsByParentOrgId(parentOrgId);
	}

	@Override
	public List<Organization> findOrganizationsByOrgName(String orgName) {
		if (orgName == null) {
			throw new BusinessValidationException("部门名称不能为空");
		}
		return organizationService.findOrganizationsByOrgName(orgName);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndOrgTypeInternalIdsAndFunctionalType(
			Long parentId, Long[] orgTypeInternalIds, Long orgFunctionalType) {
		return organizationService
				.findOrgsByParentIdAndOrgTypeInternalIdsAndFunctionalType(
						parentId, orgTypeInternalIds, orgFunctionalType);
	}

	@Override
	public Organization getParentOrgByOrgTypeAndChildOrgId(Long orgId,
			int orgLevel) {
		return organizationService.getParentOrgByOrgTypeAndChildOrgId(orgId,
				orgLevel);
	}

	@Override
	public boolean hasFunOrganizationByParentOrgAndFunOrgType(
			String parentOrgCode, Long funOrgType) {
		return organizationService.hasFunOrganizationByParentOrgAndFunOrgType(
				parentOrgCode, funOrgType);
	}

	@Override
	public List<Long> getOrganizationsByLevel(Long typeId, Long levelId) {
		return organizationService.getOrganizationsByLevel(typeId, levelId);
	}

	@Override
	public List<Organization> getDepartmentNoByLevel(Long typeId, Long levelId) {
		return organizationService.getDepartmentNoByLevel(typeId, levelId);
	}

	@Override
	public List<Organization> findDistrictAdminOrgsByOrgType(Long orgTypeId,
			String searchOrgCode, String orgCodeFindLevel) {
		return organizationService.findDistrictAdminOrgsByOrgType(orgTypeId,
				searchOrgCode, orgCodeFindLevel);
	}

	@Override
	public List<Organization> findProvinceOrganizationsByOrgId(Long orgId) {
		return organizationService.findProvinceOrganizationsByOrgId(orgId);
	}

	@Override
	public List<Organization> findOrganizationByOrgIdAndNum(Long orgId,
			Integer num) {
		return organizationService.findOrganizationByOrgIdAndNum(orgId, num);
	}

	@Override
	public Organization getOrganizationByOrganizationCode(
			String organizationCode) {
		return organizationService
				.getOrganizationByOrganizationCode(organizationCode);
	}

	@Override
	public Organization getOrganizationByIdAndDictName(Long id,
			String domainName, String dictName) {
		return organizationService.getOrganizationByIdAndDictName(id,
				domainName, dictName);
	}

	@Override
	public List<Long> findAllRelatedOrgIdsByUserOrgId(int startLevelId) {
		return organizationService
				.findAllRelatedOrgIdsByUserOrgId(startLevelId);
	}

	@Override
	public List<Organization> findOrgsByParentOrgAndOrgTypeInternalId(
			String OrgInternalCode, Integer orgTypeInternalId) {
		return organizationService.findOrgsByParentOrgAndOrgTypeInternalId(
				OrgInternalCode, orgTypeInternalId);
	}

	@Override
	public Organization getCityOrgByAreaOrgId(Long id) {
		return organizationService.getCityOrgByAreaOrgId(id);
	}

	@Override
	public Organization getCityOrganizationId(Long orgId) {
		return organizationService.getCityOrganizationId(orgId);
	}

	@Override
	public List<Organization> findAllOrganization() {
		return organizationService.findAllOrganization();
	}

	@Override
	public List<Organization> findOrgByOrgNameAndInternalCode(String orgName,
			String orgInternalCode, int pageNum, int pageSize) {
		return organizationService.findOrgByOrgNameAndInternalCode(
				orgInternalCode, orgName, pageNum, pageSize);
	}

	@Override
	public List<Long> findLeafOrgIdByCode(String orgCode) {
		return organizationService.findLeafOrgIdByCode(orgCode);
	}

	@Override
	public List<Long> getOrganizationByOrgLevelAndOrgType(Long orgLevel,
			Long orgType) {
		return organizationService.getOrganizationByOrgLevelAndOrgType(
				orgLevel, orgType);
	}

	@Override
	public List<Organization> findAllOrgByParentOrgCode(String orgCode,
			String orgType) {
		return organizationService.findAllOrgByParentOrgCode(orgCode, orgType);
	}

	public List<Long> findOrganizationsByParentIdAndType(Long orgId,
			int orgTypeId) {
		return organizationService.findOrganizationsByParentIdAndType(orgId,
				orgTypeId);
	}

	@Override
	public List<Long> queryOrgIdsByModelForStatisticsAccountTimeouts(
			List<Long> idModList, String taskParameter, Integer paseSize,
			String tableName) {
		return organizationService
				.queryOrgIdsByModelForStatisticsAccountTimeouts(idModList,
						taskParameter, paseSize, tableName);
	}

	@Override
	public List<Long> findOrganIdForLevelExcludeGrid(Long orgLevelId,
			int taskItemNum, List<Long> idModList, int fetchNum, int year,
			int month, String targetIssueTable) {
		return organizationService
				.findOrganIdForLevelExcludeGrid(orgLevelId, taskItemNum,
						idModList, fetchNum, year, month, targetIssueTable);
	}

	@Override
	public Integer countOrgIdsByModelForStatisticsAccountTimeouts(
			List<Long> idModList, String taskParameter) {
		return organizationService
				.countOrgIdsByModelForStatisticsAccountTimeouts(idModList,
						taskParameter);
	}

	@Override
	public List<Long> queryOrgIdsByModelForAccountReport(List<Long> idModList,
			String taskParameter, int orgLevelInternalId, int orgTypeInternalId) {
		return organizationService
				.queryOrgIdsByModelForAccountReport(idModList, taskParameter,
						orgLevelInternalId, orgTypeInternalId);
	}

	@Override
	public Organization updateOrgSubCount(Long id, int num) {
		return organizationService.updateOrgSubCount(id, num);
	}

	@Override
	public int updateAllOrgSubCount(Long id) {
		return organizationService.updateAllOrgSubCount(id);
	}

	@Override
	public void updateOrgSeqAndParentId(Long id, Long seq, Long parentId) {
		organizationService.updateOrgSeqAndParentId(id, seq, parentId);
	}

	@Override
	public Integer getMaxCodeById(Long id) {
		return organizationService.getMaxCodeById(id);
	}

	@Override
	public void updateOrgInternalCode(Long id, String newOrgCode) {
		organizationService.updateOrgInternalCode(id, newOrgCode);
	}

	@Override
	public Integer findChildrenMaxSeqByParentId(Long parentId) {
		return organizationService.findChildrenMaxSeqByParentId(parentId);
	}

	@Override
	public List<String> getDepartmentnosByParentOrgId(Long parentId) {
		return organizationService.getDepartmentnosByParentOrgId(parentId);
	}

	@Override
	public void editChildOrganizationDeptNo(String oldDeptNo, String newDeptNo) {
		organizationService.editChildOrganizationDeptNo(oldDeptNo, newDeptNo);
	}

	@Override
	public Organization getOrgForFirstCity(Long userOrgId) {
		return organizationService.getOrgForFirstCity(userOrgId);
	}

	@Override
	public Organization findTownOrgInfoByOrgId(Long orgId) {
		return organizationService.findTownOrgInfoByOrgId(orgId);
	}
	
	@Override
	public List<Long> findOrgIdsBySearchVo(OrganizationVo searchVo) {
		return organizationService.findOrgIdsBySearchVo(searchVo);
	}
	
	@Override
	public List<Organization> findOrgsBySearchVo(OrganizationVo searchVo) {
		return organizationService.findOrgsBySearchVo(searchVo);
	}
	
	@Override
	public List<Organization> findNameAndRemarkBySearchVo(OrganizationVo searchVo) {
		return organizationService.findNameAndRemarkBySearchVo(searchVo);
	}
	
	@Override
	public Integer countOrgsBySearchVo(OrganizationVo searchVo) {
		return organizationService.countOrgsBySearchVo(searchVo);
	}

	@Override
	public String getUserOrganztionCodeByOrgId(Long orgId) {
		return organizationService.getUserOrganztionCodeByOrgId(orgId);
	}

	@Override
	public List<Integer> getViewObjectDefNum(List<Map<String, Object>> list) {
		return organizationService.getViewObjectDefNum(list);
	}

	@Override
	public List<Long> getOrgIdsWhenSelectByLevel(
			List<Map<String, Object>> selectedLevelList) {
		return organizationService
				.getOrgIdsWhenSelectByLevel(selectedLevelList);
	}

	@Override
	public List<String> getSelectedOrgNamesByOrgIdsAndTypeLevel(
			OrganizationVo organizationVo) {
		return organizationService
				.getSelectedOrgNamesByOrgIdsAndTypeLevel(organizationVo);
	}

	@Override
	public Organization getOrgByOrgIdAndOrgLevelInternalId(Long orgId, Integer internalId) {
		return organizationService.getOrgByOrgIdAndOrgLevelInternalId(orgId, internalId);
	}

	@Override
	public Integer countOrgByOrgIdsListAndResidentStatusDict(
			OrganizationVo searchVo) {
		return organizationService.countOrgByOrgIdsListAndResidentStatusDict(searchVo);
	}

	@Override
	public Organization findOrganizationByOrgTypeAndOrgLevelAndOrgName(
			Long orgTypeId, Long orgLevelId, String orgName,String fullOrgName) {
		return organizationService.findOrganizationByOrgTypeAndOrgLevelAndOrgName(orgTypeId,orgLevelId,orgName,fullOrgName);
	}

	@Override
	public Long getOrganizationforLevelWithGridTotal() {
		return organizationService.getOrganizationforLevelWithGridTotal();
	}

	//以下四个方法三本台账调用
	@Override
	public List<Organization> findByDepartmentNoAndParentId(
			String departmentNo, Long parentId) {
		return organizationService.findByDepartmentNoAndParentId(departmentNo, parentId);
	}

	@Override
	public PageInfo<AutoCompleteData> findChildOrgsByParentIdAndName(
			PropertyDict orgType, Long parentId, String tag, Long[] exceptIds,
			String[] exceptDeptNos, int page, int rows) {
		return organizationService.findChildOrgsByParentIdAndName(orgType, parentId, tag, exceptIds, exceptDeptNos, page, rows);
	}

//	@Override
//	public List<AutoCompleteData> findChildFunOrgsByParentFunIdAndName(
//			Long parentId, String orgName, Long[] exceptIds) {
//		return organizationService.findChildFunOrgsByParentFunIdAndName(parentId, orgName, exceptIds);
//	}
//
//	@Override
//	public List<AutoCompleteData> findParentFunOrgsByIdAndName(Long id,
//			String tag, Long[] exceptIds) {
//		return organizationService.findParentFunOrgsByIdAndName(id, tag, exceptIds);
//	}

	@Override
	public List<Organization> findFuncOrgInfoByCondition(String orgCode,
			Long orgLevel,Integer isUp) {
		return organizationService.findFuncOrgInfoByCondition(orgCode, orgLevel,isUp);
	}
	
	@Override
	public Organization getSimpleOrgAllOrganizationById(Long id) {
		return organizationService.getSimpleOrgAllOrganizationById(id);
	}

	@Override
	public List<Organization> getAdministrativeOrgByLevelAndType(
			String orgCode, Long orgLevel, Long orgType) {
		return organizationService.getAdministrativeOrgByLevelAndType(orgCode, orgLevel, orgType);
	}
	
	@Override
	public Long countOrgsByLevelAndOrgCode(Long orgLevel,String orgCode) {
		return organizationService.countOrgsByLevelAndOrgCode(orgLevel, orgCode);
	}
}