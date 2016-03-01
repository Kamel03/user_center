package com.tianque.sysadmin.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.cache.service.impl.CacheNameSpace;
import com.tianque.core.cache.util.CacheKeyGenerator;
import com.tianque.core.util.StringUtil;
import com.tianque.core.vo.AutoCompleteData;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.property.OrganizationType;
import com.tianque.domain.property.PropertyTypes;
import com.tianque.domain.vo.OrganizationVo;
import com.tianque.sysadmin.dao.OrganizationDao;

/**
 * 此dao增加了缓存处理，对以下的API做了缓存： 1、getSimpleOrgById
 * 2、findOrgsByParentIdAndOrgTypeInternalId
 */
@Repository("organizationDao")
@SuppressWarnings("unchecked")
public class OrganizationDaoImpl extends AbstractBaseDao implements
		OrganizationDao {

	@Autowired
	private CacheService cacheService;

	@Override
	public Organization addOrganization(Organization organization) {
		// Long id = (Long) getSqlMapClientTemplate().insert(
		// "organization.addOrganization", organization);
		// organization = getSimpleOrgById(id);
		// invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		// return organization;
		Long id = (Long) getSqlMapClientTemplate().insert(
				"organization.addOrganization", organization);
		organization = getSimpleOrgById(id);
		getSqlMapClientTemplate().insert("allorganization.addOrganization",
				organization);
		invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		return organization;
	}

	@Override
	public Organization updateOrgSubCount(Long id, int num) {
		// Organization org = getSimpleOrgById(id);
		// org.setSubCount(org.getSubCount() + num);
		// Map map = new HashMap();
		// map.put("id", id);
		// map.put("subCount", org.getSubCount());
		// getSqlMapClientTemplate().update("organization.updatOrgSubCount",
		// map);
		//
		// cacheService.remove(CacheKeyGenerator.generateCacheKeyFromId(
		// Organization.class, id));
		// invalidateFindOrgsByParentIdNamespace(org.getParentOrg());
		//
		// return getSimpleOrgById(id);
		// 迁移合并版本方法
		Organization org = getSimpleOrgById(id);
		org.setSubCount(org.getSubCount() + num);
		Map map = new HashMap();
		map.put("id", id);
		map.put("subCount", org.getSubCount());
		getSqlMapClientTemplate().update("organization.updatOrgSubCount", map);
		if (num != -1) {
			Organization allOrg = getSimpleOrgAllOrganizationById(id);
			allOrg.setSubCount(allOrg.getSubCount() + num);
			Map allOrgMap = new HashMap();
			allOrgMap.put("id", id);
			allOrgMap.put("subCount", allOrg.getSubCount());
			getSqlMapClientTemplate().update(
					"allorganization.updatOrgSubCount", allOrgMap);
		}
		cacheService
				.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
						MemCacheConstant.generateCacheKeyFromId(
								Organization.class, id));
		invalidateFindOrgsByParentIdNamespace(org.getParentOrg());

		return getSimpleOrgById(id);
	}
	
	@Override
	public List<Organization> findProvinceOrganizationsByOrgIdAndCityLevel(
			Long orgId, Integer organizationLevel) {
		Map map = new HashMap();
		map.put("orgId", orgId);
		map.put("num", organizationLevel);
		return getSqlMapClientTemplate().queryForList(
				"organization.findProvinceOrganizationsByOrgId", map);
	}

	@Override
	public Organization getSimpleOrgById(Long id) {
		Organization organization = (Organization) cacheService
				.get(MemCacheConstant.ORGANIZATION_NAMESPACE, MemCacheConstant
						.generateCacheKeyFromId(Organization.class, id));
		if (organization == null) {
			organization = (Organization) getSqlMapClientTemplate()
					.queryForObject("organization.findById", id);
			cacheService.set(MemCacheConstant.ORGANIZATION_NAMESPACE,
					MemCacheConstant.generateCacheKeyFromId(Organization.class,
							id), organization);
		}
		return organization;
	}

	@Override
	public Organization updateOrgNameAndOrgTypeAndContactWay(
			Organization organization) {

		// getSqlMapClientTemplate()
		// .update("organization.updateOrganizationByOrgNameAndOrgTypeAndContactWay",
		// organization);
		// cacheService.remove(CacheKeyGenerator.generateCacheKeyFromId(
		// Organization.class, organization.getId()));
		//
		// organization = getSimpleOrgById(organization.getId());
		// invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		// return organization;
		getSqlMapClientTemplate()
				.update("organization.updateOrganizationByOrgNameAndOrgTypeAndContactWay",
						organization);
		getSqlMapClientTemplate()
				.update("allorganization.updateOrganizationByOrgNameAndOrgTypeAndContactWay",
						organization);
		cacheService.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
				MemCacheConstant.generateCacheKeyFromId(Organization.class,
						organization.getId()));

		organization = getSimpleOrgById(organization.getId());
		invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		return organization;
	}

	@Override
	public void deleteOrgById(Long id) {
		// Organization organization = getSimpleOrgById(id);
		// getSqlMapClientTemplate().delete("organization.deleteById", id);
		// cacheService.remove(CacheKeyGenerator.generateCacheKeyFromId(
		// Organization.class, id));
		// invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		Organization organization = getSimpleOrgById(id);
		getSqlMapClientTemplate().delete("organization.deleteById", id);
		Map map = new HashMap();
		map.put("id", id);
		map.put("changeDate", new Date());
		getSqlMapClientTemplate().update("allorganization.updateChangeInfo",
				map);
		cacheService
				.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
						MemCacheConstant.generateCacheKeyFromId(
								Organization.class, id));
		invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
	}

	@Override
	public List<OrganizationVo> getTableNameAndOrgId() {

		return (List<OrganizationVo>) getSqlMapClientTemplate().queryForList(
				"organization.getTableNameAndOrgId", null);
	}

	@Override
	public int countDatasByOrgIdAndTableName(String tableName, String orgIdStr,
			Long orgId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tableName", tableName);
		map.put("orgIdStr", orgIdStr);
		map.put("orgId", orgId);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.getcountDatas", map);
	}

	@Override
	public List<Organization> findOrganizationsByParentId(Long parentId) {
		List<Organization> list = (List<Organization>) cacheService
				.get(MemCacheConstant.getOrganizationNameSpace(parentId, null));
		if (list == null) {
			list = getSqlMapClientTemplate().queryForList(
					"organization.findOrganizationsByParentId", parentId);
			cacheService.set(
					MemCacheConstant.getOrganizationNameSpace(parentId, null),
					list);
		}
		return list;
	}

	@Override
	public List<Long> findOrgIdByParentId(Long parentId) {
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrgIdByParentId", parentId);
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameAndInternalCodeForPage(
			String orgInternalCode, String orgName, int pageNum, int pageSize) {

		Map map = new HashMap();
		map.put("orgName", orgName + "%");
		map.put("orgInternalCode", orgInternalCode + "%");

		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByOrgNameAndInternalCode", map,
				(pageNum - 1) * pageSize, pageSize);
	}

	@Override
	public void updateOrgSeq(Long orgId, Long seq) {
		// Map map = new HashMap();
		// map.put("id", orgId);
		// map.put("seq", seq);
		// getSqlMapClientTemplate().update("organization.updateOrgSeq", map);
		// cacheService.remove(CacheKeyGenerator.generateCacheKeyFromId(
		// Organization.class, orgId));
		//
		// Organization organization = getSimpleOrgById(orgId);
		// invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		Map map = new HashMap();
		map.put("id", orgId);
		map.put("seq", seq);
		getSqlMapClientTemplate().update("organization.updateOrgSeq", map);
		getSqlMapClientTemplate().update("allorganization.updateOrgSeq", map);
		cacheService.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
				MemCacheConstant.generateCacheKeyFromId(Organization.class,
						orgId));

		Organization organization = getSimpleOrgById(orgId);
		invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
	}

	@Override
	public void updateOrgsSeqAfterReferSeq(Long parentId, Long seq, Long index) {
		// Map map = new HashMap();
		// map.put("parentId", parentId);
		// map.put("seq", seq);
		// map.put("index", index);
		// getSqlMapClientTemplate().update(
		// "organization.updateOrgsSeqAfterReferSeq", map);
		//
		// List<Organization> organizations = getSqlMapClientTemplate()
		// .queryForList("organization.findOrgsSeqAfterReferSeq", map);
		// deleteOrgsFromCache(organizations);
		Map map = new HashMap();
		map.put("parentId", parentId);
		map.put("seq", seq);
		map.put("index", index);
		getSqlMapClientTemplate().update(
				"organization.updateOrgsSeqAfterReferSeq", map);
		getSqlMapClientTemplate().update(
				"allorganization.updateOrgsSeqAfterReferSeq", map);

		List<Organization> organizations = getSqlMapClientTemplate()
				.queryForList("organization.findOrgsSeqAfterReferSeq", map);
		deleteOrgsFromCache(organizations);
	}

	private void deleteOrgsFromCache(List<Organization> organizations) {
		for (Organization organization : organizations) {
			cacheService.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
					MemCacheConstant.generateCacheKeyFromId(Organization.class,
							organization.getId()));
			invalidateFindOrgsByParentIdNamespace(organization.getParentOrg());
		}
	}

	@Override
	public Integer findChildrenMaxSeqByParentId(Long parentId) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.findChildrenMaxSeqByParentId", parentId);
	}

	@Override
	public void updateOrgSeqAndParentId(Long id, Long seq, Long parentId) {
		Map map = new HashMap();
		map.put("parentId", parentId);
		map.put("seq", seq);
		map.put("id", id);
		getSqlMapClientTemplate().update(
				"organization.updateOrgSeqAndParentId", map);
		getSqlMapClientTemplate().update(
				"allorganization.updateOrgSeqAndParentId", map);

		cacheService
				.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
						MemCacheConstant.generateCacheKeyFromId(
								Organization.class, id));
		Organization parentOrg = new Organization();
		parentOrg.setId(parentId);
		invalidateFindOrgsByParentIdNamespace(parentOrg);
	}

	@Override
	public void updateOrgsSeqBetweenReferOrg(Long fromSeq, Long toSeq,
			Long parentId, Long index) {
		// Map map = new HashMap();
		// map.put("fromSeq", fromSeq);
		// map.put("toSeq", toSeq);
		// map.put("parentId", parentId);
		// map.put("index", index);
		// getSqlMapClientTemplate().update(
		// "organization.updateOrgsSeqBetweenReferOrg", map);
		//
		// List<Organization> organizations = getSqlMapClientTemplate()
		// .queryForList("organization.findOrgsSeqBetweenReferOrg", map);
		// deleteOrgsFromCache(organizations);
		Map map = new HashMap();
		map.put("fromSeq", fromSeq);
		map.put("toSeq", toSeq);
		map.put("parentId", parentId);
		map.put("index", index);
		getSqlMapClientTemplate().update(
				"organization.updateOrgsSeqBetweenReferOrg", map);
		getSqlMapClientTemplate().update(
				"allorganization.updateOrgsSeqBetweenReferOrg", map);

		List<Organization> organizations = getSqlMapClientTemplate()
				.queryForList("organization.findOrgsSeqBetweenReferOrg", map);
		deleteOrgsFromCache(organizations);
	}

	@Override
	public List<Organization> findMultizonesByUserId(Long userId) {
		return getSqlMapClientTemplate().queryForList(
				"organization.findMultizonesByUserId", userId);
	}

	@Override
	public Integer getMaxCodeById(Long id) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.getMaxCodeById", id);
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameAndParentId(Long id,
			String orgName, Long parentId) {
		Map map = new HashMap();
		map.put("orgName", orgName);
		map.put("parentId", parentId);
		map.put("id", id);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByOrgNameAndParentId", map);
	}

	@Override
	public List<Organization> findOrganizationsByDepartmentNoAndTypeAndLevel(
			Organization organization) {
		Map map = new HashMap();
		map.put("departmentNo", organization.getDepartmentNo());
		if (organization.getOrgType() != null
				&& organization.getOrgType().getId() != null)
			map.put("orgType", organization.getOrgType().getId());
		if (organization.getOrgLevel() != null
				&& organization.getOrgLevel().getId() != null)
			map.put("orgLevel", organization.getOrgLevel().getId());
		if (organization.getParentOrg() != null
				&& organization.getParentOrg().getId() != null)
			map.put("parentId", organization.getParentOrg().getId());
		if (organization.getId() != null)
			map.put("id", organization.getId());
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByOrgNoAndTypeAndLevel", map);
	}

	@Override
	public Map<Long, String> getOrganizationDisplayName(Long[] orgIds) {
		if (orgIds == null || orgIds.length == 0)
			return new HashMap();
		Map<Long, Organization> temp = getOrganizationNameInfos(orgIds);
		Map result = new HashMap<Long, String>();
		List<Long> parents = new ArrayList<Long>();
		for (Organization org : temp.values()) {
			if (org.getParentOrg() != null) {
				parents.add(org.getParentOrg().getId());
			}
			result.put(org.getId(), org.getOrgName());
		}
		if (parents.size() > 0) {
			Map<Long, Organization> parentNames = getOrganizationNameInfos(parents
					.toArray(new Long[] {}));
			for (Organization org : temp.values()) {
				if (org.getParentOrg() != null) {
					String parentName = parentNames.containsKey(org
							.getParentOrg().getId()) ? parentNames.get(
							org.getParentOrg().getId()).getOrgName() : null;
					if (parentName != null) {
						result.put(org.getId(),
								parentName + "->" + result.get(org.getId()));
					}
				}
			}
		}
		return result;
	}

	private Map<Long, Organization> getOrganizationNameInfos(Long[] orgIds) {
		if (orgIds == null || orgIds.length == 0)
			return new HashMap();
		return getSqlMapClientTemplate().queryForMap(
				"organization.getOrgDisplayName", orgIds, "id");
	}

	@Override
	public void updateOrgInternalCode(Long id, String orgInternalCode) {
		Map map = new HashMap();
		map.put("id", id);
		map.put("orgInternalCode", orgInternalCode);
		getSqlMapClientTemplate().update("organization.updateOrgInternalCode",
				map);
		cacheService
				.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
						MemCacheConstant.generateCacheKeyFromId(
								Organization.class, id));
		invalidateFindOrgsByParentIdNamespace(getSimpleOrgById(id)
				.getParentOrg());
	}

	@Override
	public int countOrgsByOrgInternalCode(String orgInternalCode) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.countOrgsByOrgInternalCode", orgInternalCode);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndOrgTypeInternalIds(
			Long parentId, Long[] orgTypeInternalIds) {
		List<Organization> organizations = new ArrayList<Organization>();
		for (int i = 0; orgTypeInternalIds != null
				&& i < orgTypeInternalIds.length; i++) {
			if (OrganizationType.ADMINISTRATIVE_REGION == orgTypeInternalIds[i]
					.intValue())
				organizations.addAll(findOrgsByParentIdAndOrgTypeInternalId(
						parentId, OrganizationType.ADMINISTRATIVE_REGION));
			if (OrganizationType.FUNCTIONAL_ORG == orgTypeInternalIds[i]
					.intValue())
				organizations.addAll(findOrgsByParentIdAndOrgTypeInternalId(
						parentId, OrganizationType.FUNCTIONAL_ORG));
			if (OrganizationType.OTHER == orgTypeInternalIds[i].intValue())
				organizations.addAll(findOrgsByParentIdAndOrgTypeInternalId(
						parentId, OrganizationType.OTHER));
			if (OrganizationType.PARTYWORK == orgTypeInternalIds[i].intValue())
				organizations.addAll(findOrgsByParentIdAndOrgTypeInternalId(
						parentId, OrganizationType.PARTYWORK));
		}
		Collections.sort(organizations, new OrgComparator());
		return organizations;
	}

	private class OrgComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Organization organization1 = (Organization) o1;
			Organization organization2 = (Organization) o2;
			if (organization1.getSeq() > organization2.getSeq()) {
				return 1;
			} else if (organization1.getSeq() < organization2.getSeq()) {
				return -1;
			}
			return 0;
		}

	}

	// private String nameSpaceFindOrgsByParentIdAndOrgTypeInternalId(Long
	// parentId) {
	// return CacheNameSpace.OrganizationDao_findOrgsByParentIdAndOrgTypeIds
	// + parentId;
	// }

	private void invalidateFindOrgsByParentIdNamespace(Organization parentOrg) {
		Long id = null;
		if (parentOrg != null) {
			id = parentOrg.getId();
		}
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getOrganizationNameSpace(id, null));
	}

	private List<Organization> findOrgsByParentIdAndOrgTypeInternalId(
			Long parentId, int orgTypeInternalId) {
		List<Organization> organizations = (List<Organization>) cacheService
				.get(MemCacheConstant.getOrganizationNameSpace(parentId, null),
						MemCacheConstant.getOrganizationKey(parentId,
								orgTypeInternalId, null));
		if (organizations == null) {
			Map map = new HashMap();
			map.put("parentId", parentId);
			map.put("orgTypeInternalId", orgTypeInternalId);
			organizations = getSqlMapClientTemplate().queryForList(
					"organization.findOrgsByParentIdAndOrgTypeInternalId", map);
			cacheService.set(MemCacheConstant.getOrganizationNameSpace(
					parentId, null), MemCacheConstant.getOrganizationKey(
					parentId, orgTypeInternalId, null), organizations);
		}
		return organizations;
	}

	public List<Organization> findOrgsByParentOrgAndOrgTypeInternalId(
			String OrgInternalCode, Integer orgTypeInternalId) {
		List<Organization> organizations = new ArrayList<Organization>();
		Map map = new HashMap();
		map.put("OrgInternalCode", OrgInternalCode);
		map.put("orgTypeInternalId", orgTypeInternalId);
		organizations = getSqlMapClientTemplate().queryForList(
				"organization.findOrgsByOrgCodeAndOrgTypeInternalId", map);
		return organizations;
	}

	/*
	 * private StringBuffer getOrgsByParentIdAndOrgTypeInternalIdCacheKey( Long
	 * parentId, int orgTypeId) { StringBuffer
	 * findOrgsByParentIdAndOrgTypeIdsKey = new StringBuffer();
	 * findOrgsByParentIdAndOrgTypeIdsKey.append(parentId);
	 * findOrgsByParentIdAndOrgTypeIdsKey.append("_");
	 * findOrgsByParentIdAndOrgTypeIdsKey.append(orgTypeId); return
	 * findOrgsByParentIdAndOrgTypeIdsKey; }
	 */

	@Override
	public List<Organization> findFunOrgsByParentIdAndOrgTypes(Long parentId,
			Long[] orgTypes) {
		Map map = new HashMap();
		map.put("parentId", parentId);
		map.put("orgTypes", orgTypes);
		return getSqlMapClientTemplate().queryForList(
				"organization.findFunOrgsByParentIdAndOrgTypes", map);
	}

	@Override
	public List<Organization> findOrganizationsByOrgName(String orgName) {
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByOrgName", orgName);
	}

	@Override
	public Organization getOrganizationsByParentAndOrgName(Long parentId,
			String orgName) {
		Map map = new HashMap();
		map.put("parentId", parentId);
		map.put("orgName", orgName);
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrganizationsByParentAndOrgName", map);
	}

	@Override
	public List<Organization> findAdminOrgsByParentIdAndName(Long parentId,
			String name) {
		return findOrgsByParentIdAndOrgTypeInternalIdAndNameAndPinyin(parentId,
				OrganizationType.ADMINISTRATIVE_REGION, name);
	}

	private List<Organization> findOrgsByParentIdAndOrgTypeInternalIdAndNameAndPinyin(
			Long parentId, int orgTypeInternalId, String name) {
		Map map = new HashMap();
		map.put("parentId", parentId);
		map.put("orgTypeInternalId", orgTypeInternalId);
		map.put("name", name);
		List<Organization> organizations = getSqlMapClientTemplate()
				.queryForList(
						"organization.findOrgsByParentIdAndOrgTypeInternalIdAndNameAndPinyin",
						map);

		return organizations;
	}

	@Override
	public List<Organization> findFunOrgsByParentIdAndName(Long parentId,
			String name) {
		return findOrgsByParentIdAndOrgTypeInternalIdAndNameAndPinyin(parentId,
				OrganizationType.FUNCTIONAL_ORG, name);
	}

	@Override
	public List<Organization> findFunOrgsByParentFunOrgIdAndName(
			Long parentFunOrgId, String name) {
		Map map = new HashMap();
		map.put("parentFunOrgId", parentFunOrgId);
		map.put("name", name);
		List<Organization> organizations = getSqlMapClientTemplate()
				.queryForList("organization.findFunOrgsByFunParentIdAndName",
						map);

		return organizations;
	}

	@Override
	public void updateMaxCodeById(Long id) {
		getSqlMapClientTemplate().update("organization.updateMaxCodeById", id);
	}

	@Override
	public List<Organization> findOrganizationsByOrgInternalCode(
			String orgInternalCode) {
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByOrgInternalCode",
				orgInternalCode);
	}

	@Override
	public Organization updateFunParentOrgSubCount(Long id, int num) {
		// Organization org = getSimpleOrgById(id);
		// org.setSubCountFun(org.getSubCountFun() + num);
		// Map map = new HashMap();
		// map.put("id", id);
		// map.put("subCountFun", org.getSubCountFun());
		// getSqlMapClientTemplate().update("organization.updatOrgSubCountFun",
		// map);
		//
		// cacheService.remove(CacheKeyGenerator.generateCacheKeyFromId(
		// Organization.class, id));
		// invalidateFindOrgsByParentIdNamespace(org.getParentOrg());
		//
		// return getSimpleOrgById(id);
		Organization org = getSimpleOrgById(id);
		org.setSubCountFun(org.getSubCountFun() + num);
		Map map = new HashMap();
		map.put("id", id);
		map.put("subCountFun", org.getSubCountFun());
		getSqlMapClientTemplate().update("organization.updatOrgSubCountFun",
				map);
		getSqlMapClientTemplate().update("allorganization.updatOrgSubCountFun",
				map);

		cacheService
				.remove(MemCacheConstant.ORGANIZATION_NAMESPACE,
						MemCacheConstant.generateCacheKeyFromId(
								Organization.class, id));
		invalidateFindOrgsByParentIdNamespace(org.getParentOrg());

		return getSimpleOrgById(id);
	}

	@Override
	public Organization getOrganizationByNameAndOrgId(String orgName, Long id) {
		return getOrganizationsByParentAndOrgName(id, orgName);
	}

	@Override
	public Organization getOrganizationByOrgInternalCode(String orgInternalCode) {
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrganizationByOrgInternalCode",
				orgInternalCode);
	}

	@Override
	public List<Organization> getOrganizationByIdAndOrgInternalCode() {
		return getSqlMapClientTemplate().queryForList(
				"organization.getOrganizationByIdAndOrgInternalCode");
	}

	@Override
	public Organization getOrganizationByParentId(Long id) {
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrganizationByParentId", id);
	}

	@Override
	public Organization getOrganizationByOrganizationCode(String orgCode) {
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrgInternalCodeById", orgCode);
	}

	@Override
	public Organization getOrgByDepartmentNo(String departmentNo) {
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrgByDepartmentNo", departmentNo);
	}

	@Override
	public List<Organization> findOrgsByParentDeptNoAndLevelIdExcludeFunOrgId(
			String departmentNo, Long orgLevelId, Long funOrgId) {
		Map map = new HashMap();
		map.put("departmentNo", departmentNo);
		map.put("orgLevelId", orgLevelId);
		map.put("funOrgId", funOrgId);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrgsByParentDeptNoAndLevelIdExcludeFunOrgId",
				map);
	}

	@Override
	public Organization getOrgAndLevelInfo(Long orgId) {
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrgAndLevelInfo", orgId);
	}

	@Override
	public List<Organization> fingOrganizationforLevel(Long orgLevelId) {
		Map map = new HashMap();
		map.put("orgLevelId", orgLevelId);
		return getSqlMapClientTemplate().queryForList(
				"organization.fingOrganizationforLevel", map);
	}

	@Override
	public List<Organization> findOrganizationsByorgNameAndOrgType(
			String orgInternalCode, String orgName, PropertyDict orgType,
			int pageNum, int pageSize) {

		Map map = new HashMap();
		map.put("orgName", orgName + "%");
		map.put("orgInternalCode", orgInternalCode + "%");
		map.put("orgType", orgType);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByorgNameAndOrgType", map,
				(pageNum - 1) * pageSize, pageSize);

	}

	@Override
	public Organization updateOrganizationForGis(Organization org) {
		// getSqlMapClientTemplate().update(
		// "organization.updateOrganizationForGis", org);
		// return getSimpleOrgById(org.getId());
		getSqlMapClientTemplate().update(
				"organization.updateOrganizationForGis", org);
		getSqlMapClientTemplate().update(
				"allorganization.updateOrganizationForGis", org);
		return getSimpleOrgById(org.getId());
	}

	@Override
	public Organization unBundOrgToGis(Long id) {
		// getSqlMapClientTemplate().update(
		// "organization.UnboundOrganizationForGis", id);
		// return getSimpleOrgById(id);
		getSqlMapClientTemplate().update(
				"organization.UnboundOrganizationForGis", id);
		getSqlMapClientTemplate().update(
				"allorganization.UnboundOrganizationForGis", id);
		return getSimpleOrgById(id);
	}

	@Override
	public List<Organization> findOrganizationByParentIdAndOrgType(
			Long parentId, Long orgType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("parentId", parentId);
		map.put("orgType", orgType);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationByParentIdAndOrgType", map);
	}

	@Override
	public boolean isHasThisOrganization(Long orgId) {
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.countOrgsByOrgId", orgId);
		if (countNum != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Organization> findOrgsByOrgCodeAndOrgLevelInternalsAndOrgTypeInternals(
			String orgCode, List<Integer> orgLevelInternals,
			List<Integer> orgTypeInternals, List<Long> exceptOrgIds) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgCode", orgCode);
		map.put("orgLevelInternals", orgLevelInternals);
		map.put("orgTypeInternals", orgTypeInternals);
		map.put("exceptOrgIds", exceptOrgIds);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationByOrgCodeAndOrgLevelInternals",
				map);
	}

	@Override
	public Organization getRootOrganization() {
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getRootOrganization");
	}

	@Override
	public String getMaxDepartmentNoByParentId(Long parentId) {
		return (String) getSqlMapClientTemplate().queryForObject(
				"organization.getMaxDepartmentNoByParentId", parentId);
	}

	@Override
	public List<Organization> findOrgsFetchParentOrgByKeyword(String keyword,
			int size) {
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrgsFetchParentOrgByKeyword", keyword + "%",
				0, size);
	}

	@Override
	public List<Organization> findOrgsByOrgTypeIdAndOrgLevelIdAndParentOrgInternalCode(
			Long orgTypeId, Long orgLevelId, String parentOrgInternalCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("parentOrgInternalCode", parentOrgInternalCode + "%");
		map.put("orgLevelId", orgLevelId);
		map.put("orgTypeId", orgTypeId);
		return getSqlMapClientTemplate()
				.queryForList(
						"organization.findOrgsByOrgTypeIdAndOrgLevelIdAndParentOrgInternalCode",
						map);
	}

	@Override
	public List<Organization> findOrgsByOrgTypeIdAndOrgLevelId(Long orgTypeId,
			Long orgLevelId, String userOrgInternalCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userOrgInternalCode", userOrgInternalCode + "%");
		map.put("orgLevelId", orgLevelId);
		map.put("orgTypeId", orgTypeId);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrgsByOrgTypeIdAndOrgLevelId", map);
	}

	@Override
	public List<Organization> findFunOrgsByFunParentId(Long funParentId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("funParentId", funParentId);
		map.put("domainname", OrganizationType.ORG_TYPE_KEY);
		map.put("internalId", OrganizationType.FUNCTIONAL_ORG);
		return getSqlMapClientTemplate().queryForList(
				"organization.findFunOrgsByFunParentId", map);
	}

	@Override
	public List<Organization> findOrganizationsByOrgNameAndInternalCodeAndTypeForPage(
			String orgInternalCode, String orgName, Long[] type, int pageNum,
			int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgInternalCode", orgInternalCode);
		map.put("orgName", orgName);
		map.put("type", type);
		return getSqlMapClientTemplate()
				.queryForList(
						"organization.findOrganizationsByOrgNameAndInternalCodeAndTypeForPage",
						map, (pageNum - 1) * pageSize, pageSize);
	}

	@Override
	public List<Organization> getOrgZN(Long id) {
		return getSqlMapClientTemplate().queryForList("organization.getOrgZN",
				id);
	}

	@Override
	public List<Organization> findOrgsByDepartmentNo(String departmentNo) {
		Map map = new HashMap();
		map.put("departmentNo", departmentNo);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrgsByDepartmentNo", map);
	}

	@Override
	public List<Organization> findFunOrgsByParentOrgIdAndOrgTypes(
			Long parentOrgId, Long[] propertyDictIds) {
		Map map = new HashMap();
		map.put("parentId", parentOrgId);
		map.put("orgTypes", propertyDictIds);
		return getSqlMapClientTemplate().queryForList(
				"organization.findFunOrgsByParentOrgIdAndOrgTypes", map);
	}

	@Override
	public List<Organization> findOrgsByParentIdAndOrgTypeInternalIdsAndFunctionalType(
			Long parentId, Long[] orgTypeInternalIds, Long orgFunctionalType) {
		List<Organization> organizations = new ArrayList<Organization>();
		for (int i = 0; orgTypeInternalIds != null
				&& i < orgTypeInternalIds.length; i++) {
			if (OrganizationType.ADMINISTRATIVE_REGION == orgTypeInternalIds[i]
					.intValue())
				organizations
						.addAll(findOrgsByParentIdAndOrgTypeInternalIdAndFcuntionType(
								parentId,
								OrganizationType.ADMINISTRATIVE_REGION,
								orgFunctionalType));
			if (OrganizationType.FUNCTIONAL_ORG == orgTypeInternalIds[i]
					.intValue())
				organizations
						.addAll(findOrgsByParentIdAndOrgTypeInternalIdAndFcuntionType(
								parentId, OrganizationType.FUNCTIONAL_ORG,
								orgFunctionalType));
			if (OrganizationType.OTHER == orgTypeInternalIds[i].intValue())
				organizations
						.addAll(findOrgsByParentIdAndOrgTypeInternalIdAndFcuntionType(
								parentId, OrganizationType.OTHER,
								orgFunctionalType));
			if (OrganizationType.PARTYWORK == orgTypeInternalIds[i].intValue())
				organizations
						.addAll(findOrgsByParentIdAndOrgTypeInternalIdAndFcuntionType(
								parentId, OrganizationType.PARTYWORK,
								orgFunctionalType));
		}
		Collections.sort(organizations, new OrgComparator());
		return organizations;
	}

	private List<Organization> findOrgsByParentIdAndOrgTypeInternalIdAndFcuntionType(
			Long parentId, int orgTypeInternalId, Long orgFunctionalType) {
		List<Organization> organizations = (List<Organization>) cacheService
				.get(MemCacheConstant.getOrganizationNameSpace(parentId,
						orgFunctionalType), MemCacheConstant
						.getOrganizationKey(parentId, orgTypeInternalId,
								orgFunctionalType));
		if (organizations == null) {
			Map map = new HashMap();
			map.put("parentId", parentId);
			map.put("orgTypeInternalId", orgTypeInternalId);
			map.put("functionalOrgType", orgFunctionalType);
			organizations = getSqlMapClientTemplate().queryForList(
					"organization.findOrgsByParentIdAndOrgTypeInternalId", map);
			cacheService.set(MemCacheConstant.getOrganizationNameSpace(
					parentId, orgFunctionalType), MemCacheConstant
					.getOrganizationKey(parentId, orgTypeInternalId,
							orgFunctionalType), organizations);
		}
		return organizations;
	}

	@Override
	public boolean hasFunOrganizationByParentOrgAndFunOrgType(
			String parentOrgCode, Long funOrgType) {
		Map map = new HashMap();
		map.put("parentOrgCode", parentOrgCode);
		map.put("funOrgType", funOrgType);
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.hasFunOrganizationByParentOrgAndFunOrgType", map);
		return count == null || count == 0;
	}

	@Override
	public List<Long> getOrganizationsByLevel(Long typeId, Long levelId) {
		Map map = new HashMap();
		map.put("typeId", typeId);
		map.put("levelId", levelId);
		String key = "organizationsByLevel" + levelId + "levelId" + typeId
				+ "typeId";
		List<Long> idList = (List<Long>) cacheService.get(
				MemCacheConstant.ORGANIZATION_NAMESPACE, key);
		if (idList == null) {
			idList = getSqlMapClientTemplate().queryForList(
					"organization.getOrganizationsByLevel", map);
			cacheService.set(MemCacheConstant.ORGANIZATION_NAMESPACE, key,
					idList);
		}
		return idList;
	}

	@Override
	public List<Organization> getDepartmentNoByLevel(Long typeId, Long levelId) {
		Map map = new HashMap();
		map.put("typeId", typeId);
		map.put("levelId", levelId);
		// String key = "departmentNoForShardByLevel" + levelId + "levelId"
		// + typeId + "typeId";
		// List<String> departmentNoList = (List<String>) cacheService.get(key);
		// if (departmentNoList == null) {
		List<Organization> departmentNoList = getSqlMapClientTemplate().queryForList(
				"organization.getDepartmentNoByLevel", map);
		// cacheService.set(key, departmentNoList);
		// }
		return departmentNoList;
	}

	@Override
	public List<Organization> findDistrictAdminOrgsByOrgType(Long orgTypeId,
			String searchOrgCode, String orgCodeFindLevel) {
		List<Organization> organizations;
		Map map = new HashMap();
		map.put("orgTypeId", orgTypeId);
		map.put("searchOrgCode", searchOrgCode);
		map.put("orgCodeFindLevel", orgCodeFindLevel);
		organizations = getSqlMapClientTemplate().queryForList(
				"organization.findDistrictAdminOrgsByOrgType", map);
		return organizations;
	}

	@Override
	public List<Organization> findProvinceOrganizationsByOrgId(Long orgId) {
		Map map = new HashMap();
		map.put("orgId", orgId);
		map.put("num", OrganizationType.ORG_LEVEL);
		return getSqlMapClientTemplate().queryForList(
				"organization.findProvinceOrganizationsByOrgId", map);
	}

	@Override
	public List<Organization> findOrganizationByOrgIdAndNum(Long orgId,
			Integer num) {
		Map map = new HashMap();
		map.put("orgId", orgId);
		map.put("num", num);
		return getSqlMapClientTemplate().queryForList(
				"organization.findProvinceOrganizationsByOrgId", map);
	}                                                                      

	@Override
	public List<Organization> findOrgsByOrgTypeIdAndOrgLevelIdAndOrgInternalCode(
			Long orgTypeId, Long orgLevelId, String userOrgInternalCode,
			Integer isUp) {
		Map map = new HashMap();
		map.put("orgLevelId", orgLevelId);
		map.put("orgTypeId", orgTypeId);
		map.put("orgInternalCode", userOrgInternalCode);
		map.put("isUp", isUp);
		return getSqlMapClientTemplate()
				.queryForList(
						"organization.findOrgsByOrgTypeIdAndOrgLevelIdAndOrgInternalCode",
						map);
	}

	@Override
	public List<Organization> findFuncOrgInfoByCondition(Long orgLevel,
			Long orgType, String orgCode, Integer isUp) {
		Map map = new HashMap();
		map.put("orgLevel", orgLevel);
		map.put("orgType", orgType);
		map.put("orgCode", orgCode);
		map.put("isUp", isUp);
		return getSqlMapClientTemplate().queryForList(
				"organization.findFuncOrgInfoByCondition", map);
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
	 * @date 2014-8-29 上午10:54:10
	 */
	public Organization getOrganizationByIdAndDictName(Long id,
			String domainName, String dictName) {
		Map map = new HashMap();
		map.put("orgId", id);
		map.put("domainName", domainName);
		map.put("dictName", dictName);
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.findOrganizationByOrgLevel", map);
	}

	@Override
	public List<String> getDepartmentnosByParentOrgId(Long parentOrgId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgId", parentOrgId);
		return getSqlMapClientTemplate().queryForList(
				"organization.getDepartmentnosByParentOrgId", map);
	}

	@Override
	public void updateOrganizationDeptNo(String deptNo, Long id) {
		// Map<String, Object> map = new HashMap<String, Object>();
		// map.put("deptNo", deptNo);
		// map.put("orgId", id);
		// getSqlMapClientTemplate().update(
		// "organization.updateOrganizationDeptNo", map);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("deptNo", deptNo);
		map.put("orgId", id);
		getSqlMapClientTemplate().update(
				"organization.updateOrganizationDeptNo", map);
		getSqlMapClientTemplate().update(
				"allorganization.updateOrganizationDeptNo", map);
	}

	@Override
	public void editChildOrganizationDeptNo(String oldDeptNo, String newDeptNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("oldDeptNo", oldDeptNo);
		map.put("newDeptNo", newDeptNo);
		getSqlMapClientTemplate().update(
				"organization.updateChildOrganizationDeptNo", map);
		getSqlMapClientTemplate().update(
				"allorganization.updateChildOrganizationDeptNo", map);
	}

	@Override
	public List<Organization> findAllOrgByParentOrgCode(String orgCode,
			Long orgType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgCode", orgCode);
		map.put("orgType", orgType);
		return getSqlMapClientTemplate().queryForList(
				"organization.findAllOrgByParentOrgCode", map);
	}

	@Override
	public List<Organization> findAllOrganization() {
		return getSqlMapClientTemplate().queryForList(
				"organization.findAllOrganization");
	}

	@Override
	public List<Long> findLeafOrgIdByCode(String orgCode) {
		return getSqlMapClientTemplate().queryForList(
				"organization.findLeafOrgIdByCode", orgCode);
	}

	@Override
	public List<Long> findOrganizationByOrgLevelAndOrgType(Long orgLevel,
			Long orgType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgLevel", orgLevel);
		map.put("orgType", orgType);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationByOrgLevelAndOrgType", map);
	}

	/************************* 迁移合并方法 ************************/
	@Override
	public Organization getSimpleOrgAllOrganizationById(Long id) {
		Organization organization = (Organization) cacheService.get(
				CacheNameSpace.Organization_nameSpace,
				CacheKeyGenerator.generateCacheKey(Organization.class, id));
		if (organization == null) {
			organization = (Organization) getSqlMapClientTemplate()
					.queryForObject("organization.findAllOrganizationById", id);
		}
		return organization;
	}

	@Override
	public int updateAllOrgSubCount(Long id) {
		// 组织机构备份表SubCount通过查询统计
		return getSqlMapClientTemplate().update(
				"allorganization.updatAllOrgSubCount", id);
	}

	/* add by zenglm for job optmize */
	// add by bing 2014年11月12日 下午6:19:52
	@Override
	public List<Organization> findOrganIdForLevelExcludeGrid(Long orgLevelId,
			int taskItemNum, List<Long> idModList, int fetchNum, int year,
			int month, String targetIssueTable) {
		Map map = new HashMap();
		map.put("orgLevelId", orgLevelId);
		map.put("taskItemNum", taskItemNum);
		map.put("idModList", idModList);
		map.put("fetchNum", fetchNum);
		map.put("targetIssueTable", targetIssueTable);
		map.put("year", year);
		map.put("month", month);
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganIdForLevelExcludeGrid", map);
	}

	@Override
	public List<Long> queryOrgIdsByModelForStatisticsAccountTimeouts(
			List<Long> idModList, String taskParameter, Integer pageSize,
			String tableName) {

		if (idModList == null || idModList.size() == 0) {
			return null;
		}
		taskParameter = StringUtil.isStringAvaliable(taskParameter) ? taskParameter
				: "10";
		try {
			Integer.parseInt(taskParameter);
		} catch (Exception e) {
			taskParameter = "10";
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idModList", idModList);
		map.put("taskParameter", taskParameter);
		map.put("tableName", tableName);
		map.put("pageSize", pageSize);
		return getSqlMapClientTemplate().queryForList(
				"organization.queryOrgIdsByModelForStatisticsAccountTimeouts",
				map);
	}

	@Override
	public Integer countOrgIdsByModelForStatisticsAccountTimeouts(
			List<Long> idModList, String taskParameter) {
		if (idModList == null || idModList.size() == 0) {
			return null;
		}
		taskParameter = StringUtil.isStringAvaliable(taskParameter) ? taskParameter
				: "10";
		try {
			Integer.parseInt(taskParameter);
		} catch (Exception e) {
			taskParameter = "10";
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idModList", idModList);
		map.put("taskParameter", taskParameter);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.countOrgIdsByModelForStatisticsAccountTimeouts",
				map);
	}

	@Override
	public List<Long> queryOrgIdsByModelForAccountReport(List<Long> idModList,
			String taskParameter, int orgLevelInternalId, int orgTypeInternalId) {
		if (idModList == null || idModList.size() == 0) {
			return null;
		}
		taskParameter = StringUtil.isStringAvaliable(taskParameter) ? taskParameter
				: "10";
		try {
			Integer.parseInt(taskParameter);
		} catch (Exception e) {
			taskParameter = "10";
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idModList", idModList);
		map.put("taskParameter", taskParameter);
		map.put("orgLevelInternalId", orgLevelInternalId);
		map.put("orgTypeInternalId", orgTypeInternalId);
		return getSqlMapClientTemplate().queryForList(
				"organization.queryOrgIdsByModelForAccountReport", map);
	}

	@Override
	public List<Long> findOrganizationsByParentIdAndType(Long orgId,
			int orgTypeId) {
		Map map = new HashMap();
		map.put("orgType", orgTypeId);
		if (orgId != null) {
			map.put("orgId", orgId);
		}
		return getSqlMapClientTemplate().queryForList(
				"organization.findOrganizationsByParentIdAndType", map);
	}

	@Override
	public Organization getAdministrativeCityOrg(String orgCode, Long orgType,
			Long orgLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgCode", orgCode);
		map.put("orgLevel", orgLevel);
		map.put("orgType", orgType);
		Organization result = null;
		List<Organization> resultList = (List<Organization>) getSqlMapClientTemplate()
				.queryForList("organization.getAdministrativeCityOrg", map);
		if (resultList != null && resultList.size() > 0) {
			result = resultList.get(0);
		}
		return result;

	}
	
	@Override
	public List<Long> findOrgIdsBySearchVo(OrganizationVo searchVo) {
		return getSqlMapClientTemplate()
				.queryForList("organization.findOrgIdsBySearchVo", searchVo);
	}
	
	@Override
	public List<Organization> findOrgsBySearchVo(OrganizationVo searchVo) {
		Integer page = searchVo.getPage();
		Integer rows = searchVo.getRows();
		if(page!=null && rows!=null){
			return getSqlMapClientTemplate().queryForList(
					"organization.findOrgsBySearchVo", searchVo,
					(page - 1) * rows, rows);
		}else{
			return getSqlMapClientTemplate()
					.queryForList("organization.findOrgsBySearchVo", searchVo);
		}
	}
	
	@Override
	public List<Organization> findNameAndRemarkBySearchVo(OrganizationVo searchVo) {
		Integer page = searchVo.getPage();
		Integer rows = searchVo.getRows();
		if(page!=null && rows!=null){
			return getSqlMapClientTemplate().queryForList(
					"organization.findNameAndRemarkBySearchVo", searchVo,
					(page - 1) * rows, rows);
		}else{
			return getSqlMapClientTemplate()
					.queryForList("organization.findNameAndRemarkBySearchVo", searchVo);
		}
	}
	
	@Override
	public Integer countOrgsBySearchVo(OrganizationVo searchVo) {
		return (Integer) getSqlMapClientTemplate()
				.queryForObject("organization.countOrgsBySearchVo", searchVo);
	}
	
	@Override
	public String getUserOrganztionCodeByOrgId(Long orgId) {
		return (String) getSqlMapClientTemplate().queryForObject(
				"organization.getUserOrganztionCodeByOrgId", orgId);
	}

	@Override
	public List<Integer> getViewObjectDefNum(List<Map<String, Object>> list) {
		return getSqlMapClientTemplate().queryForList(
				"organization.getViewObjectDefNum", list);
	}

	@Override
	public List<Long> getOrgIdsWhenSelectByLevel(
			List<Map<String, Object>> selectedLevelList) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gridClazzification", PropertyTypes.ORGANIZATION_LEVEL);
		map.put("gridType", PropertyTypes.ORGANIZATION_TYPE);
		map.put("list", selectedLevelList);
		return getSqlMapClientTemplate().queryForList(
				"organization.getOrgIdsWhenSelectByLevel", map);
	}

	@Override
	public List<String> getSelectedOrgNamesByOrgIdsAndTypeLevel(
			OrganizationVo organizationVo) {
		return getSqlMapClientTemplate().queryForList(
				"organization.getSelectedOrgNamesByOrgIdsAndTypeLevel",
				organizationVo);
	}
	
	@Override
	public Organization getOrgByOrgIdAndOrgLevelInternalId(Long orgId, Integer internalId){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgId", orgId);
		map.put("internalId", internalId);
		return (Organization) getSqlMapClientTemplate().queryForObject(
				"organization.getOrgByOrgIdAndOrgLevelInternalId",
				map);
	}
	
	@Override
	public Integer countOrgByOrgIdsListAndResidentStatusDict(OrganizationVo searchVo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("internalId", 0);
		map.put("domainName", PropertyTypes.RESIDENT_STATUS);
		map.put("searchVo", searchVo);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"organization.countOrgByOrgIdsListAndResidentStatusDict",
				map);
	}

	@Override
	public Organization findOrganizationByOrgTypeAndOrgLevelAndOrgName(
			Long orgTypeId, Long orgLevelId, String orgName,String fullOrgName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgTypeId", orgTypeId);
		map.put("orgLevelId", orgLevelId);
		map.put("orgName", orgName);
		map.put("fullOrgName", fullOrgName);
		return (Organization)getSqlMapClientTemplate().queryForObject(
				"organization.findOrganizationByOrgTypeAndOrgLevelAndOrgName",
				map);
	}
	
	@Override
	public Long getOrganizationforLevelWithGridTotal(Long orgLevelId) {
		Map map = new HashMap();
		map.put("orgLevelId", orgLevelId);
		return (Long) getSqlMapClientTemplate().queryForObject(
				"organization.getOrganizationforLevelWithGridTotal", map);
	}
	
	@Override
	public List<Organization> findByDepartmentNoAndParentId(
			String departmentNo, Long parentId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("departmentNo", departmentNo);
		map.put("parentId", parentId);
		return getSqlMapClientTemplate().queryForList(
				"organization.findByDepartmentNoAndParentId", map);
	}

	@Override
	public PageInfo<AutoCompleteData> findChildOrgsByParentIdAndName(
			PropertyDict orgType, Long parentId, String tag, Long[] exceptIds,
			String[] exceptDeptNos, int page, int rows) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("parentId", parentId);
		params.put("tag", tag);
		if (!ArrayUtils.isEmpty(exceptIds)) {
			params.put("exceptIds", exceptIds);
		}
		if (!ArrayUtils.isEmpty(exceptDeptNos)) {
			params.put("exceptDeptNos", exceptDeptNos);
		}
		if (orgType != null) {
			params.put("orgType", orgType);
		}
		Integer totalCount = (Integer) getSqlMapClientTemplate()
				.queryForObject(
						"organization.countFindChildOrgsByParentIdAndNameAndType",
						params);
		List<AutoCompleteData> datas = getSqlMapClientTemplate().queryForList(
				"organization.findChildOrgsByParentIdAndNameAndType", params,
				(page - 1) * rows, rows);
		PageInfo<AutoCompleteData> result = new PageInfo<AutoCompleteData>(
				page, rows, totalCount, datas);
		return result;
	}

	@Override
	public List<Organization> getAdministrativeOrgByLevelAndType(String orgCode,
			Long orgLevel, Long orgType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgCode", orgCode);
		map.put("orgLevel", orgLevel);
		map.put("orgType", orgType);
		return (List<Organization>) getSqlMapClientTemplate().queryForList("organization.getAdministrativeCityOrg", map);
	}

	@Override
	public Long countOrgsByLevelAndOrgCode(Long orgLevel, String orgCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgLevel", orgLevel);
		map.put("orgCode", orgCode);
		return (Long) getSqlMapClientTemplate().queryForObject("organization.countOrgsByLevelAndOrgCode", map);
	}

//	@Override
//	public List<AutoCompleteData> findChildFunOrgsByParentFunIdAndName(
//			Long parentId, String orgName, Long[] exceptIds) {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("parentId", parentId);
//		params.put("tag", orgName);
//		if (!ArrayUtils.isEmpty(exceptIds)) {
//			params.put("exceptIds", exceptIds);
//		}
//		return getSqlMapClientTemplate().queryForList(
//				"organization.findChildFunOrgsByParentFunIdAndName", params);
//	}
//
//	@Override
//	public List<AutoCompleteData> findParentFunOrgsByIdAndName(Long id,
//			String tag, Long[] exceptIds) {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("id", id);
//		params.put("tag", tag);
//		if (!ArrayUtils.isEmpty(exceptIds)) {
//			params.put("exceptIds", exceptIds);
//		}
//		return getSqlMapClientTemplate().queryForList(
//				"issueStep.findParentFunOrgsByIdAndName", params);
//	}
}