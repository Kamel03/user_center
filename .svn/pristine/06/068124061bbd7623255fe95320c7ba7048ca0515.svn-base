package com.tianque.sysadmin.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.util.StringUtil;
import com.tianque.domain.PropertyDomain;
import com.tianque.sysadmin.dao.PropertyDomainDao;

@Repository("propertyDomainDao")
public class PropertyDomainDaoImpl extends AbstractBaseDao implements
		PropertyDomainDao {

	@Autowired
	private CacheService cacheService;

	private PropertyDomain loadPropertyDomainById(Long id) {
		PropertyDomain propertyDomain = (PropertyDomain) cacheService.get(
				MemCacheConstant.PROPERTYDOMAIN_NAMESPACE, MemCacheConstant
						.getPropertyDomainKey(
								MemCacheConstant.PROPERTYDOMAIN_KEY,
								MemCacheConstant.PROPERTYDOMAIN_DOMAINID_KEY,
								id, null));
		if (null == propertyDomain) {
			propertyDomain = (PropertyDomain) getSqlMapClientTemplate()
					.queryForObject("propertyDomain.getPropertyDomainById", id);
			cacheService.set(MemCacheConstant.PROPERTYDOMAIN_NAMESPACE,
					MemCacheConstant.getPropertyDomainKey(
							MemCacheConstant.PROPERTYDOMAIN_KEY,
							MemCacheConstant.PROPERTYDOMAIN_DOMAINID_KEY, id,
							null), propertyDomain);
		}
		return propertyDomain;
	}

	@Override
	public PropertyDomain addPropertyDomain(PropertyDomain propertyDomain) {
		return getPropertyDomainById((Long) getSqlMapClientTemplate().insert(
				"propertyDomain.addPropertyDomain", propertyDomain));
	}

	@Override
	public List<PropertyDomain> findPropertyDomain() {
		return getSqlMapClientTemplate().queryForList(
				"propertyDomain.findPropertyDomain");
	}

	@Override
	public PropertyDomain getPropertyDomainById(Long id) {
		return loadPropertyDomainById(id);
	}

	@Override
	public PropertyDomain getPropertyDomainByDomainName(String domainName) {
		String key = MemCacheConstant.getPropertyDomainKey(
				MemCacheConstant.PROPERTYDOMAIN_KEY,
				MemCacheConstant.PROPERTYDOMAIN_DOMAINNAME_KEY, null,
				domainName);
		PropertyDomain propertyDomain = null;
		if (StringUtil.isStringAvaliable(key)) {
			propertyDomain = (PropertyDomain) cacheService.get(
					MemCacheConstant.PROPERTYDOMAIN_NAMESPACE, key);
		}

		if (null == propertyDomain) {
			propertyDomain = (PropertyDomain) getSqlMapClientTemplate()
					.queryForObject(
							"propertyDomain.getPropertyDomainByDomainName",
							domainName);
			if (!StringUtil.isStringAvaliable(key)) {
				cacheService.set(MemCacheConstant.PROPERTYDOMAIN_NAMESPACE,
						MemCacheConstant.getPropertyDomainKey(
								MemCacheConstant.PROPERTYDOMAIN_KEY,
								MemCacheConstant.PROPERTYDOMAIN_DOMAINNAME_KEY,
								null, domainName), propertyDomain);
			}

		}
		return propertyDomain;
	}

	@Override
	public List<PropertyDomain> findPropertyDomainBydomainName(
			String domainName, int pageNum, int pageSize) {
		Map map = new HashMap();
		map.put("domainName", domainName + "%");
		return getSqlMapClientTemplate().queryForList(
				"propertyDomain.findpropertyDomainsByDomainName", map,
				(pageNum - 1) * pageSize, pageSize);

	}

	// @Override
	// public List<PropertyDomain> findPropertyDomainByModule(String moduleName)
	// {
	// List<PropertyDomain> result =
	// (List<PropertyDomain>)cacheService.get("findPropertyDomainByModule"+moduleName);
	// if(null == result){
	// result = (List<PropertyDomain>) getSqlMapClientTemplate().queryForObject(
	// "propertyDomain.findPropertyDomainByModule", moduleName);
	// cacheService.set("findPropertyDomainByModule"+moduleName, result);
	// }
	// return result;
	// }

}
