package com.tianque.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.dao.IssueTypeDao;
import com.tianque.domain.IssueType;
import com.tianque.domain.vo.EmphasesVo;
import com.tianque.mobile.vo.MobileIssueType;

@Repository("issueTypeDao")
@SuppressWarnings("unchecked")
public class IssueTypeDaoImpl extends AbstractBaseDao implements IssueTypeDao {

	@Autowired
	private CacheService cacheService;

	// private String getDomainNameSpace(Long domainId) {
	// return CacheNameSpace.IssueTypeDao_IssueTypeDomain_NameSpace
	// + domainId.toString();
	// }
	//
	// private String getIssueTypeNameSpace(Long domainId) {
	// return CacheNameSpace.IssueTypeDao_IssueType_NameSpace
	// + domainId.toString();
	// }

	private void invalidateAllNamespace(Long domainId) {
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getDomainNameSpace(domainId));
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getIssueTypeNameSpace(domainId));
	}

	@Override
	public List<IssueType> findIssueTypesByDomainId(Long domainId) {
		String cacheKey = MemCacheConstant.generateCacheKeyFromMethodName(
				IssueType.class, MemCacheConstant.FINDISSUETYPESBYDOMAINID,
				domainId.toString());
		logger.debug("在缓存中查找domainId=" + domainId + "的事件处理类别列表");
		List<IssueType> result = (List<IssueType>) cacheService.get(
				MemCacheConstant.getDomainNameSpace(domainId), cacheKey);
		if (result == null) {
			logger.debug("在缓存中不存在domainId=" + domainId + "的事件处理类别列表");
			Map<String, Object> query = new HashMap<String, Object>();
			query.put("domainId", domainId);
			result = getSqlMapClientTemplate().queryForList(
					"issueType.findIssueTypes", query);
			cacheService.set(MemCacheConstant.getDomainNameSpace(domainId),
					cacheKey, result);
		}
		return result;
	}

	@Override
	public List<IssueType> findIssueTypesByDomainIdAndOrgId(Long domainId,
			Long orgId) {
		String cacheKey = MemCacheConstant.generateCacheKeyFromMethodName(
				IssueType.class,
				MemCacheConstant.FINDISSUETYPESBYDOMAINIDANDORGINTERNALCODE,
				domainId.toString(), Long.toString(orgId));
		List<IssueType> result = (List<IssueType>) cacheService.get(
				MemCacheConstant.getDomainNameSpace(domainId), cacheKey);
		if (result == null) {
			logger.debug("在缓存中不存在domainId=" + domainId + "的事件处理类别列表");
			Map<String, Object> query = new HashMap<String, Object>();
			query.put("domainId", domainId);
			query.put("orgId", orgId);
			result = getSqlMapClientTemplate().queryForList(
					"issueType.findIssueTypes", query);
			cacheService.set(MemCacheConstant.getDomainNameSpace(domainId),
					cacheKey, result);
		}
		return result;
	}

	@Override
	public IssueType addIssueType(IssueType issueType) {
		Long id = (Long) getSqlMapClientTemplate().insert(
				"issueType.addIssueType", issueType);
		return saveIssueTypeToCached(id, true);
	}

	@Override
	public IssueType getIssueTypeById(Long domainId, Long id) {
		if (domainId == null) {
			return reloadIssueTypeById(id);
		} else {
			String cacheNameSpace = MemCacheConstant
					.getIssueTypeNameSpace(domainId);
			String cacheKey = MemCacheConstant.generateCacheKeyFromId(
					IssueType.class, id);
			IssueType result = (IssueType) cacheService.get(cacheNameSpace,
					cacheKey);
			if (result != null) {
				return result;
			} else {
				return this.saveIssueTypeToCached(id, false);
			}
		}
	}

	@Override
	public IssueType updateIssueType(IssueType issueType) {
		getSqlMapClientTemplate()
				.update("issueType.updateIssueType", issueType);
		return this.saveIssueTypeToCached(issueType.getId(), true);
	}

	@Override
	public void deleteIssueTypeById(Long domainId, Long id) {
		getSqlMapClientTemplate().delete("issueType.deleteIssueTypeById", id);
		String cacheKey = MemCacheConstant.generateCacheKeyFromId(
				IssueType.class, id);
		String cacheNamespace = MemCacheConstant
				.getIssueTypeNameSpace(domainId);
		cacheService.remove(cacheNamespace, cacheKey);
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getDomainNameSpace(domainId));
	}

	@Override
	public void moveIssueTypeToEnd(Long domainId, Long id, int indexId) {
		Map<String, Object> query = new HashMap<String, Object>();
		query.put("indexId", indexId);
		query.put("domainId", domainId);
		query.put("id", id);
		getSqlMapClientTemplate().update("issueType.moveAllIndexPrevious",
				query);
		getSqlMapClientTemplate().update("issueType.moveToEnd", query);
		invalidateAllNamespace(domainId);
	}

	@Override
	public void moveIssueTypeToFirst(Long domainId, Long id, int indexId) {
		Map<String, Object> query = new HashMap<String, Object>();
		query.put("indexId", indexId);
		query.put("domainId", domainId);
		query.put("id", id);
		getSqlMapClientTemplate().update("issueType.moveAllIndexNext", query);
		getSqlMapClientTemplate().update("issueType.moveToFirst", query);
		invalidateAllNamespace(domainId);
	}

	@Override
	public void moveIssueTypeToPreviousOrNext(Long domainId, Long id,
			int indexId, Long referIssueTypeId) {
		Map<String, Object> query = new HashMap<String, Object>();
		query.put("indexId", indexId);
		query.put("domainId", domainId);
		query.put("id", id);
		query.put("referIssueTypeId", referIssueTypeId);
		getSqlMapClientTemplate().update("issueType.changeIndexOwn", query);
		getSqlMapClientTemplate().update("issueType.changeIndexRefer", query);
		invalidateAllNamespace(domainId);
	}

	@Override
	public IssueType getIssueTypeByIssueTypeName(String issueTypeName,
			Long domainId) {
		Map<String, Object> query = new HashMap<String, Object>();
		query.put("issueTypeName", issueTypeName);
		query.put("domainId", domainId);
		List<IssueType> result = getSqlMapClientTemplate().queryForList(
				"issueType.getIssueTypeByName", query);
		return result.size() > 0 ? result.get(0) : null;
	}

	@Override
	public Integer getIndexIdByDomainId(Long domainId) {
		return (Integer) this.getSqlMapClientTemplate().queryForObject(
				"issueType.getIndexIdByDomainId", domainId);
	}

	private IssueType saveIssueTypeToCached(Long id, boolean flag) {
		IssueType issueType = reloadIssueTypeById(id);
		if (issueType == null) {
			logger.warn("无法在数据库中找到id=" + id + "的事件处理类别");
		} else {
			String cacheNamespace = MemCacheConstant
					.getIssueTypeNameSpace(issueType.getIssueTypeDomain()
							.getId());
			String cacheKey = MemCacheConstant.generateCacheKeyFromId(
					IssueType.class, issueType.getId());
			cacheService.set(cacheNamespace, cacheKey, issueType);
			if (flag) {
				cacheService.invalidateNamespaceCache(MemCacheConstant
						.getDomainNameSpace(issueType.getIssueTypeDomain()
								.getId()));
			}
		}
		return issueType;
	}

	private IssueType reloadIssueTypeById(Long id) {
		return (IssueType) getSqlMapClientTemplate().queryForObject(
				"issueType.findIssueTypeById", id);
	}

	@Override
	public void addRelatePersons(Long issueId, String personType,
			Long personId, String personName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("issueId", issueId);
		map.put("personType", personType);
		map.put("personId", personId);
		map.put("personName", personName);
		getSqlMapClientTemplate().insert("issueType.addRelatePersons", map);

	}

	@Override
	public void addRelatePlaces(Long issueId, String placeType, Long placeId,
			String placename) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("issueId", issueId);
		map.put("placeType", placeType);
		map.put("placeId", placeId);
		map.put("placename", placename);
		getSqlMapClientTemplate().insert("issueType.addRelatePlaces", map);
	}

	@Override
	public void deleteRelatePersons(Long issueId) {
		getSqlMapClientTemplate().delete("issueType.deleteRelatePersons",
				issueId);
	}

	@Override
	public void deleteRelatePlaces(Long issueId) {
		getSqlMapClientTemplate().delete("issueType.deleteRelatePlaces",
				issueId);

	}

	@Override
	public List<EmphasesVo> findRelatePersonByName(Long issueId) {
		return (List<EmphasesVo>) getSqlMapClientTemplate().queryForList(
				"issueType.findRelatePersons", issueId);
	}

	@Override
	public List<EmphasesVo> findRelatePlacesByName(Long issueId) {
		return (List<EmphasesVo>) getSqlMapClientTemplate().queryForList(
				"issueType.findRelatePlaces", issueId);
	}

	public Integer getIsRelatePlaces(Long RelatePlaceId, String RelatePlaceType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("RelatePlaceId", RelatePlaceId);
		map.put("RelatePlaceType", RelatePlaceType);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"issueType.getIsRelatePlaces", map);

	}

	public Integer getIsRelatePersons(Long RelatePersonsId,
			String RelatePersonsType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("RelatePersonsId", RelatePersonsId);
		map.put("RelatePersonsType", RelatePersonsType);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"issueType.getIsRelatePersons", map);

	}

	@Override
	public IssueType getIssueTypeByIssueTypeName(String issueTypeName,
			Long domainId, Long orgId) {
		Map<String, Object> query = new HashMap<String, Object>();
		query.put("issueTypeName", issueTypeName);
		query.put("domainId", domainId);
		query.put("orgId", orgId);
		List<IssueType> result = getSqlMapClientTemplate().queryForList(
				"issueType.getIssueTypeByNameAndOrgId", query);
		return result.size() > 0 ? result.get(0) : null;
	}

	@Override
	public void updateIsEnabledById(Long id, boolean enabled) {
		IssueType existedType = reloadIssueTypeById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("enabled", enabled);
		getSqlMapClientTemplate().update("issueType.updateIsEnabledById", map);

		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getDomainNameSpace(existedType.getIssueTypeDomain().getId()));
	}

	@Override
	public List<IssueType> findEnabledIssueTypesByDomainIdAndOrgId(
			Long domainId, Long orgId) {
		String cacheKey = MemCacheConstant.generateCacheKeyFromMethodName(
				IssueType.class,
				MemCacheConstant.FINDENABLEDISSUETYPESBYDOMAINIDANDORGID,
				domainId.toString(),
				orgId == null ? "null" : Long.toString(orgId), "true");
		List<IssueType> result = (List<IssueType>) cacheService.get(
				MemCacheConstant.getDomainNameSpace(domainId), cacheKey);
		if (result == null) {
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("enabled", Boolean.TRUE);
			condition.put("domainId", domainId);
			condition.put("orgId", orgId);
			result = getSqlMapClientTemplate().queryForList(
					"issueType.findEnabledIssueTypesByDomainIdAndOrgId",
					condition);
			cacheService.set(MemCacheConstant.getDomainNameSpace(domainId),
					cacheKey, result);
		}
		return result;
	}

	@Override
	public List<IssueType> findAllIssueTypesByDomainIdAndOrgid(Long orgId,
			Long domainId) {
		String cacheKey = MemCacheConstant.generateCacheKeyFromMethodName(
				IssueType.class,
				MemCacheConstant.FINDALLISSUETYPESBYDOMAINIDANDORGID,
				domainId.toString(),
				orgId == null ? "null" : Long.toString(orgId));
		List<IssueType> result = (List<IssueType>) cacheService.get(
				MemCacheConstant.getDomainNameSpace(domainId), cacheKey);
		if (result == null) {
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("domainId", domainId);
			condition.put("orgId", orgId);
			result = getSqlMapClientTemplate().queryForList(
					"issueType.findEnabledIssueTypesByDomainIdAndOrgId",
					condition);
			cacheService.set(MemCacheConstant.getDomainNameSpace(domainId),
					cacheKey, result);
		}
		return result;
	}

	public List<Long> getIsRelatePersonIds(List<Long> personsIds,
			String personsType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("RelatePersonsId", personsIds);
		map.put("RelatePersonsType", personsType);
		return (List<Long>) getSqlMapClientTemplate().queryForList(
				"issueType.getIsRelatePersonIds", map);
	}

	public List<Long> getIsRelatePlaceIds(List<Long> RelatePlaceId,
			String RelatePlaceType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("RelatePlaceId", RelatePlaceId);
		map.put("RelatePlaceType", RelatePlaceType);
		return (List<Long>) getSqlMapClientTemplate().queryForList(
				"issueType.getIsRelatePlaceIds", map);
	}

	@Override
	public List<MobileIssueType> findMobileEnabledIssueTypesByDomainIdAndOrgId(
			Long domainId) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("enabled", Boolean.TRUE);
		condition.put("domainId", domainId);
		return getSqlMapClientTemplate().queryForList(
				"issueType.findMobileEnabledIssueTypesByDomainIdAndOrgId",
				condition);
	}

	@Override
	public void updateRelatePersonsForOrgChange(Map map) {
		getSqlMapClientTemplate().update(
				"issueType.updateRelatePersonsForOrgChange", map);
	}

	@Override
	public void updateRelatePlacesForOrgChange(Map map) {
		getSqlMapClientTemplate().update(
				"issueType.updateRelatePlacesForOrgChange", map);
	}

	@Override
	public void setOrgIdAndCardNoOrNameForPerson(Map map) {
		getSqlMapClientTemplate().update(
				"issueType.setOrgIdAndCardNoOrNameForPerson", map);
	}

	@Override
	public void setOrgIdAndCardNoOrNameForPlace(Map map) {
		getSqlMapClientTemplate().update(
				"issueType.setOrgIdAndCardNoOrNameForPlace", map);
	}

	@Override
	public Long getIssueTypeIdByIssueId(Long issueId) {
		return (Long) getSqlMapClientTemplate().queryForList(
				"issueType.getIssueTypeIdByIssueId", issueId).get(0);
	}

	@Override
	public IssueType getIssueTypeByIssueId(Long issueId) {
		List<IssueType> list = (List<IssueType>) getSqlMapClientTemplate()
				.queryForList("issueType.getIssueTypeByIssueId", issueId);
		return list.get(0);
	}

	@Override
	public IssueType getIssueTypeById(Long id) {
		return reloadIssueTypeById(id);
	}
}
