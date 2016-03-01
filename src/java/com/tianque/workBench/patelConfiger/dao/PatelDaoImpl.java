package com.tianque.workBench.patelConfiger.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;

@Repository("patelDao")
public class PatelDaoImpl extends AbstractBaseDao implements PatelDao {
	@Autowired
	private CacheService cacheService;

	public List<String> getKeyNamesByUserId(Long userId) {
		List<String> keyNames = (List<String>) cacheService.get(
				MemCacheConstant.PATELCONFIG_NAMESPACE, MemCacheConstant
						.getPatelConfigKey(MemCacheConstant.PATELCONFIG_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								null));
		if (keyNames == null) {
			keyNames = new ArrayList<String>();
			List<Map<String, Object>> list = (List<Map<String, Object>>) getSqlMapClientTemplate()
					.queryForList("patelConfiger.getConfigurationByUserId",
							userId);
			for (int i = 0; i < list.size(); i++) {
				keyNames.add((String) list.get(i).get("KEYNAME"));
			}
			cacheService.set(MemCacheConstant.PATELCONFIG_NAMESPACE,
					MemCacheConstant.getPatelConfigKey(
							MemCacheConstant.PATELCONFIG_KEY,
							MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
							null), keyNames);
		}
		return keyNames;
	}

	public Integer getIndexByUserIdAndKeyname(Long userId, String keyName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("keyName", keyName);
		List<Integer> list = getSqlMapClientTemplate().queryForList(
				"patelConfiger.getIndexByUserIdAndKeyname", map);
		return list.size() == 0 ? 0 : list.get(0);
	}

	public List<String> getTabConfiger(Long userId, String keyName) {
		List<String> tabConfigers = (List<String>) cacheService.get(
				MemCacheConstant.PATELCONFIG_NAMESPACE, MemCacheConstant
						.getPatelConfigKey(
								MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								keyName));
		if (tabConfigers == null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("userId", userId);
			map.put("keyName", keyName);
			tabConfigers = getSqlMapClientTemplate().queryForList(
					"patelConfiger.getTabConfigurationByUserId", map);
			cacheService.set(MemCacheConstant.PATELCONFIG_NAMESPACE,
					MemCacheConstant.getPatelConfigKey(
							MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
							MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
							keyName), tabConfigers);
		}
		return tabConfigers;
	}

	public void deleteConfiguration(Long userId, String keyName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("keyName", keyName);
		getSqlMapClientTemplate().delete("patelConfiger.deleteConfiguration",
				map);
		cacheService
				.invalidateNamespaceCache(MemCacheConstant.PATELCONFIG_NAMESPACE);
		cacheService.remove(MemCacheConstant.PATELCONFIG_NAMESPACE,
				MemCacheConstant
						.getPatelConfigKey(
								MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								keyName));
	}

	public void deleteTabConfiguration(Long userId, String keyName,
			String tabKeyName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("keyName", keyName);
		map.put("tabKeyName", tabKeyName);
		getSqlMapClientTemplate().delete(
				"patelConfiger.deleteTabConfiguration", map);
		cacheService.remove(MemCacheConstant.PATELCONFIG_NAMESPACE,
				MemCacheConstant
						.getPatelConfigKey(
								MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								keyName));
	}

	public Integer getCurrentMaxConfiger() {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"patelConfiger.getConfigurationIndex");
	}

	public Integer getCurrentMaxTabConfiger(String keyName) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"patelConfiger.getTabConfigurationIndex", keyName);
	}

	public void buildConfiguration(Long userId, String keyName, Integer index,
			String tabKeyName, Integer tabIndex) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("keyName", keyName);
		map.put("index", index);
		map.put("tabKeyName", tabKeyName);
		map.put("tabConfigerindex", tabIndex);
		getSqlMapClientTemplate().insert("patelConfiger.buildConfiguration",
				map);
		cacheService
				.invalidateNamespaceCache(MemCacheConstant.PATELCONFIG_NAMESPACE);
		cacheService.remove(MemCacheConstant.PATELCONFIG_NAMESPACE,
				MemCacheConstant
						.getPatelConfigKey(
								MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								keyName));
	}

	public void updateConfigurationIndex(Long userId, String keyName,
			Integer index) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("keyName", keyName);
		map.put("index", index);
		getSqlMapClientTemplate().update(
				"patelConfiger.updateConfigurationIndex", map);
		cacheService
				.invalidateNamespaceCache(MemCacheConstant.PATELCONFIG_NAMESPACE);
		cacheService.remove(MemCacheConstant.PATELCONFIG_NAMESPACE,
				MemCacheConstant
						.getPatelConfigKey(
								MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								keyName));
	}

	public void updateTabConfigurationIndex(Long userId, String keyName,
			String tabKeyName, Integer tabIndex) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("keyName", keyName);
		map.put("tabKeyName", tabKeyName);
		map.put("tabIndex", tabIndex);
		getSqlMapClientTemplate().update(
				"patelConfiger.updateTabConfigurationIndex", map);
		cacheService.remove(MemCacheConstant.PATELCONFIG_NAMESPACE,
				MemCacheConstant
						.getPatelConfigKey(
								MemCacheConstant.PATELCONFIG_TABPATEL_KEY,
								MemCacheConstant.PATELCONFIG_PATEL_KEY, userId,
								keyName));
	}

	@Override
	public void deleteConfiguration(Long userId) {
		getSqlMapClientTemplate().delete(
				"patelConfiger.deleteUserConfiguration", userId);
		cacheService
				.invalidateNamespaceCache(MemCacheConstant.PATELCONFIG_NAMESPACE);
	}

	@Override
	public void deleteConfigurationByUserIds(List<Long> userIds) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", userIds);

		getSqlMapClientTemplate().delete(
				"patelConfiger.deleteConfigurationByUserIds", map);
		cacheService
				.invalidateNamespaceCache(MemCacheConstant.PATELCONFIG_NAMESPACE);
	}
}
