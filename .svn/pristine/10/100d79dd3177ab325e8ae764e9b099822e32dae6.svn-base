package com.tianque.sysadmin.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.domain.PropertyDict;
import com.tianque.mobile.vo.MobilePropertyDict;
import com.tianque.sysadmin.dao.PropertyDictDao;

@Repository("propertyDictDao")
public class PropertyDictDaoImpl extends AbstractBaseDao implements
		PropertyDictDao {

	@Autowired
	private CacheService cacheService;

	private PropertyDict savePropertyDictToCached(Long id, boolean haschange) {
		PropertyDict dict = getPropertyDictById(id);
		if (dict == null) {
			logger.warn("无法在数据库中找到id=" + id + "的系统属性");
		} else {
			/** 小类自己的缓存 上一步查询时会设置缓存 */
			// cacheService.set(MemCacheConstant.PROPERTYDICT_NAMESPACE,
			// MemCacheConstant.getPropertyDictKey(
			// MemCacheConstant.PROPERTYDICT_KEY,
			// MemCacheConstant.PROPERTYDICT_ID_KEY, id, null),
			// dict);
			if (haschange) {
				/** 清除掉大类下所有的子类的缓存 */
				cacheService
						.invalidateNamespaceCache(MemCacheConstant
								.getPropertyDomainHasPropertyNameSpace(
										MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
										dict.getPropertyDomain().getId()));
			}
		}
		return dict;
	}

	public List<PropertyDict> findPropertyDictByIds(Long[] ids) {
		if (ids == null || ids.length == 0) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findPropertyDictByIds", map);
	}

	public PropertyDict getPropertyDictById(Long id) {
		PropertyDict propertyDict = (PropertyDict) cacheService
				.get(MemCacheConstant.PROPERTYDICT_NAMESPACE, MemCacheConstant
						.getPropertyDictKey(MemCacheConstant.PROPERTYDICT_KEY,
								MemCacheConstant.PROPERTYDICT_ID_KEY, id, null));
		if (null == propertyDict) {
			propertyDict = (PropertyDict) getSqlMapClientTemplate()
					.queryForObject("propertyDict.getPropertyDictById", id);
			cacheService.set(MemCacheConstant.PROPERTYDICT_NAMESPACE,
					MemCacheConstant.getPropertyDictKey(
							MemCacheConstant.PROPERTYDICT_KEY,
							MemCacheConstant.PROPERTYDICT_ID_KEY, id, null),
					propertyDict);
		}
		return propertyDict;
	}

	@Override
	public PropertyDict getPropertyDictByOrgId(Long id) {
		return (PropertyDict) getSqlMapClientTemplate().queryForObject(
				"propertyDict.getPropertyDictByOrgId", id);
	}

	private void removePropertyDictCacheByDictId(Long dictId) {
		cacheService.remove(MemCacheConstant.PROPERTYDICT_NAMESPACE,
				MemCacheConstant.getPropertyDictKey(
						MemCacheConstant.PROPERTYDICT_KEY,
						MemCacheConstant.PROPERTYDICT_ID_KEY, dictId, null));
	}

	@Override
	public PropertyDict addPropertyDict(PropertyDict propertyDict) {
		Long id = (Long) getSqlMapClientTemplate().insert(
				"propertyDict.addPropertyDict", propertyDict);
		/** 大类对应所有小类缓存 */
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getPropertyDomainHasPropertyNameSpace(
						MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
						propertyDict.getPropertyDomain().getId()));
		/** 小类单独缓存 */
		return getPropertyDictById(id);
	}

	@Override
	public Integer getMaxDisplaySeqById(Long domainid) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"propertyDict.getMaxDisplaySeqById", domainid);
	}

	@Override
	public PropertyDict getPropertyDictByDomainIdAndDictId(Long domainId,
			Long dictid) {
		/** 小类自己的 */
		PropertyDict result = (PropertyDict) cacheService.get(
				MemCacheConstant.PROPERTYDICT_NAMESPACE, MemCacheConstant
						.getPropertyDictKey(MemCacheConstant.PROPERTYDICT_KEY,
								MemCacheConstant.PROPERTYDICT_ID_KEY, dictid,
								null));
		if (result != null) {
			return result;
		} else {
			return savePropertyDictToCached(dictid, false);
		}
	}

	@Override
	public List<PropertyDict> findPropertyDictByPropertyDomainId(
			Long propertyDomainId) {
		/** 大类下所有的小类缓存 */
		List<PropertyDict> dicts = (List<PropertyDict>) cacheService.get(
				MemCacheConstant.getPropertyDomainHasPropertyNameSpace(
						MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
						propertyDomainId), MemCacheConstant.getPropertyDictKey(
						MemCacheConstant.PROPERTYDICT_KEY,
						MemCacheConstant.PROPERTYDICT_DOMAINID_KEY, null,
						propertyDomainId));
		if (null == dicts) {
			Map map = new HashMap();
			map.put("propertyDomainId", propertyDomainId);
			dicts = getSqlMapClientTemplate().queryForList(
					"propertyDict.findPropertyDictByPropertyDomainId", map);
			/** 大类下所有的小类缓存 */
			cacheService.set(MemCacheConstant
					.getPropertyDomainHasPropertyNameSpace(
							MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
							propertyDomainId), MemCacheConstant
					.getPropertyDictKey(MemCacheConstant.PROPERTYDICT_KEY,
							MemCacheConstant.PROPERTYDICT_DOMAINID_KEY, null,
							propertyDomainId), dicts);
		}
		return dicts;
	}

	@Override
	public List<PropertyDict> findPropertyDictByPropertyDomainId(
			Long propertyDomainId, String sidx, String sord) {
		Map map = new HashMap();
		map.put("propertyDomainId", propertyDomainId);
		map.put("sortField", sidx);
		map.put("order", sord);
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findPropertyDictByPropertyDomainIdOrder", map);
	}

	@Override
	public PropertyDict updatePropertyDict(PropertyDict propertyDict) {
		getSqlMapClientTemplate().update("propertyDict.updatePropertyDict",
				propertyDict);
		propertyDict = getPropertyDictById(propertyDict.getId());
		/** 大类下所有的小类缓存 */
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getPropertyDomainHasPropertyNameSpace(
						MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
						propertyDict.getPropertyDomain().getId()));

		/** 小类自己的缓存 */
		removePropertyDictCacheByDictId(propertyDict.getId());
		return propertyDict;
	}

	@Override
	public List<PropertyDict> findPropertyDictByDisplayNameAndDomainPropertyId(
			Long propertyDomainId, String displayName, Long id) {
		Map map = new HashMap();
		map.put("propertyDomainId", propertyDomainId);
		map.put("displayName", displayName);
		map.put("id", id);
		return getSqlMapClientTemplate()
				.queryForList(
						"propertyDict.findPropertyDictByDisplayNameAndDomainPropertyId",
						map);
	}

	@Override
	public void updateProSeqBetweenReferPro(int fromDisplaySeq,
			int toDisplaySeq, Long propertyDomainId, Long index) {
		Map map = new HashMap();
		map.put("fromDisplaySeq", fromDisplaySeq);
		map.put("toDisplaySeq", toDisplaySeq);
		map.put("propertyDomainId", propertyDomainId);
		map.put("index", index);
		getSqlMapClientTemplate().update(
				"propertyDict.updateProSeqBetweenReferPro", map);

		/** 大类下所有的小类缓存 */
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getPropertyDomainHasPropertyNameSpace(
						MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
						propertyDomainId));
		/** 小类自己的缓存 */
		removeCacheByDictList(propertyDomainId);
	}

	private void removeCacheByDictList(Long propertyDomainId) {
		List<PropertyDict> dicts = findPropertyDictByPropertyDomainId(propertyDomainId);
		for (PropertyDict propertyDict : dicts) {
			/** 小类自己的缓存 */
			removePropertyDictCacheByDictId(propertyDict.getId());
		}
	}

	@Override
	public void updatePropertyDictDisplaySeq(Long id, int displaySeq) {
		Map map = new HashMap();
		map.put("id", id);
		map.put("displaySeq", displaySeq);
		getSqlMapClientTemplate().update(
				"propertyDict.updatePropertyDictDisplaySeq", map);
		PropertyDict dict = getPropertyDictById(id);

		/** 大类下所有的小类缓存 */
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getPropertyDomainHasPropertyNameSpace(
						MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
						dict.getPropertyDomain().getId()));
		/** 小类自己的缓存 */
		removePropertyDictCacheByDictId(id);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainIdAndInternalId(
			Long propertyDomainId, Integer internalId) {
		Map map = new HashMap();
		map.put("domainId", propertyDomainId);
		map.put("internalId", internalId);
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findPropertyDictByDomainIdAndInternalId", map);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainIdAndInternalIds(
			Long propertyDomainId, int[] internalIds) {
		Map map = new HashMap();
		map.put("domainId", propertyDomainId);
		map.put("internalIds", internalIds);
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findPropertyDictByDomainIdAndInternalIds", map);
	}

	@Override
	public PropertyDict findPropertyDictByDomainIdAndDictDisplayName(
			Long propertyDomainId, String dictDisplayName) {
		Map map = new HashMap();
		map.put("domainId", propertyDomainId);
		map.put("displayName", dictDisplayName);
		return (PropertyDict) getSqlMapClientTemplate().queryForObject(
				"propertyDict.findPropertyDictByDomainIdAndDictDisplayName",
				map);
	}

	@Override
	public int deletePropertyDictById(Long id) {
		PropertyDict dict = getPropertyDictById(id);
		/** 大类下所有的小类缓存 */
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getPropertyDomainHasPropertyNameSpace(
						MemCacheConstant.PROPERTYDICTS_BY_DOMAIN_NAMESPACE,
						dict.getPropertyDomain().getId()));
		/** 小类自己的缓存 */
		removePropertyDictCacheByDictId(id);
		return getSqlMapClientTemplate().delete(
				"propertyDict.deletePropertyDictById", id);
	}

	@Override
	public List<MobilePropertyDict> findMobilePropertyDictByPropertyDomainId(
			Long propertyDomainId) {
		Map map = new HashMap();
		map.put("propertyDomainId", propertyDomainId);
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findMobilePropertyDictByPropertyDomainId", map);
	}

	@Override
	public PropertyDict getPropertyDictByDomainName(String domainName) {
		return (PropertyDict) getSqlMapClientTemplate().queryForObject(
				"propertyDict.getPropertyDomainName", domainName);
	}

	@Override
	public PropertyDict getPropertyDictName(Long id) {
		if (id == null)
			return null;
		return (PropertyDict) getSqlMapClientTemplate().queryForObject(
				"propertyDict.getPropertyDictName", id);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndDisplayseqs(
			Long domianId, int[] displayseqs) {
		Map map = new HashMap();
		map.put("domainId", domianId);
		map.put("displayseqs", displayseqs);
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findPropertyDictByDomainNameAndDisplayseq", map);
	}

	@Override
	public List<PropertyDict> getPropertyDictByPinYinAndDomainid(
			Map<String, Object> map) {
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.getPropertyDictByPinYinAndDomainid", map);
	}

	@Override
	public List<PropertyDict> getPropertyDictByDomainidAndInternalid(
			Map<String, Object> map) {
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.getPropertyDictByDomainidAndInternalid", map);
	}

	@Override
	public List<PropertyDict> findFullPropertyDictByDomainId(
			Map<String, Object> map) {
		return getSqlMapClientTemplate().queryForList(
				"propertyDict.findFullPropertyDictByDomainId", map);
	}
}
