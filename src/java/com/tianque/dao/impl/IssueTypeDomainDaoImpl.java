package com.tianque.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.cache.util.CacheKeyGenerator;
import com.tianque.dao.IssueTypeDomainDao;
import com.tianque.domain.IssueTypeDomain;

@Repository("issueTypeDomainDao")
public class IssueTypeDomainDaoImpl extends AbstractBaseDao implements
		IssueTypeDomainDao {
	@Autowired
	private CacheService cacheService;

	// private String findIssueTypeDomainsNameSpace() {
	// return CacheNameSpace.IssueTypeDomainDao_findIssueTypeDomains;
	// }

	@Override
	public List<IssueTypeDomain> findIssueTypeDomains() {
		String cacheKey = MemCacheConstant.generateCacheKeyFromMethodName(
				IssueTypeDomain.class, MemCacheConstant.FINDISSUETYPEDOMAINS,
				"");
		List<IssueTypeDomain> result = (List<IssueTypeDomain>) cacheService
				.get(MemCacheConstant.getIssueTypeDomainsNameSpace(), cacheKey);
		if (result != null) {
			return result;
		} else {
			result = this.getSqlMapClientTemplate().queryForList(
					"issueTypeDomain.findIssueTypeDomains");
			cacheService.set(MemCacheConstant.getIssueTypeDomainsNameSpace(),
					cacheKey, result);
			return result;
		}
	}

	@Override
	public IssueTypeDomain addIssueTypeDomain(IssueTypeDomain issueTypeDomain) {
		Long id = (Long) this.getSqlMapClientTemplate().insert(
				"issueTypeDomain.insertIssueTypeDomain", issueTypeDomain);
		IssueTypeDomain result = getIssueTypeDoaminById(id);
		cacheService.invalidateNamespaceCache(MemCacheConstant
				.getIssueTypeDomainsNameSpace());
		cacheService.remove(MemCacheConstant.getIssueTypeDomainsNameSpace(),
				MemCacheConstant.generateCacheKeyFromMethodName(
						IssueTypeDomain.class,
						MemCacheConstant.FINDISSUETYPEDOMAINSBYMODULE,
						issueTypeDomain.getModule()));
		return result;
	}

	@Override
	public IssueTypeDomain getIssueTypeDoaminById(Long id) {
		String idCachKey = CacheKeyGenerator.generateCacheKeyFromId(
				IssueTypeDomain.class, id);
		IssueTypeDomain result = (IssueTypeDomain) cacheService.get(
				MemCacheConstant.getIssueTypeDomainsNameSpace(), idCachKey);
		if (result != null) {
			return result;
		} else {
			result = reLoadIssueTypeDomain(id);
			if (result != null) {
				cacheService.set(
						MemCacheConstant.getIssueTypeDomainsNameSpace(),
						idCachKey, result);
			}
			return result;
		}
	}

	private IssueTypeDomain reLoadIssueTypeDomain(Long id) {
		return (IssueTypeDomain) this.getSqlMapClientTemplate().queryForObject(
				"issueTypeDomain.getIssueTypeDomainById", id);
	}

	@Override
	public IssueTypeDomain getIssueTypeDoaminByDomainName(String domainName) {
		return (IssueTypeDomain) this.getSqlMapClientTemplate().queryForObject(
				"issueTypeDomain.getIssueTypeDomainByDomainName", domainName);
	}

	@Override
	public List<IssueTypeDomain> findIssueTypeDomainsByModule(String module) {
		String cacheKey = CacheKeyGenerator.generateCacheKeyFromMethodName(
				IssueTypeDomain.class,
				MemCacheConstant.FINDISSUETYPEDOMAINSBYMODULE, module);
		List<IssueTypeDomain> result = (List<IssueTypeDomain>) cacheService
				.get(MemCacheConstant.getIssueTypeDomainsNameSpace(), cacheKey);
		if (result != null) {
			return result;
		} else {
			result = this.getSqlMapClientTemplate().queryForList(
					"issueTypeDomain.findIssueTypeDomainsByModule", module);
			cacheService.set(MemCacheConstant.getIssueTypeDomainsNameSpace(),
					cacheKey, result);
			return result;
		}
	}

	@Override
	public List<IssueTypeDomain> findIssueTypeDomainsByDomainName(
			String domainName) {
		List<IssueTypeDomain> result = (List<IssueTypeDomain>) this
				.getSqlMapClientTemplate().queryForList(
						"issueTypeDomain.findIssueTypeDomainsByDomainName",
						domainName);
		return result;
	}

}
