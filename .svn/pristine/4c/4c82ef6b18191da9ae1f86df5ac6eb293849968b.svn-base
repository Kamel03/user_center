package com.tianque.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.dao.VillageProfileDao;
import com.tianque.domain.Organization;
import com.tianque.domain.VillageProfile;
import com.tianque.exception.base.BusinessValidationException;

@Repository("villageProfileDao")
public class VillageProfileDaoImpl extends AbstractBaseDao implements
		VillageProfileDao {

	@Override
	public VillageProfile addVillageProfile(VillageProfile villageProfile) {
		Long id = (Long) getSqlMapClientTemplate().insert(
				"villageProfile.addVillageProfile", villageProfile);
		return findVillageProfileById(id, null);
	}

	@Override
	public VillageProfile findVillageProfileById(Long id, Long orgId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("orgId", orgId);
		VillageProfile villageProfile = new VillageProfile();
		villageProfile = (VillageProfile) getSqlMapClientTemplate()
				.queryForObject("villageProfile.getvillageProfileResultById",
						map);
		return villageProfile;
	}

	@Override
	public VillageProfile updateVillageProfile(VillageProfile villageProfile) {
		getSqlMapClientTemplate().update("villageProfile.updateVillageProfile",
				villageProfile);
		VillageProfile villageProfiles = findVillageProfileById(
				villageProfile.getId(), null);
		return villageProfiles;
	}

	// 方法没有显式调用
	// @Override
	// public VillageProfile getVillageProfileByFullPinYin(String fullPinYin) {
	// Organization organization = new Organization();
	// organization.setFullPinyin(fullPinYin);
	// return (VillageProfile) getSqlMapClientTemplate().queryForObject(
	// "villageProfile.selectByfullPinyin", organization);
	// }

	@Override
	public void deleteVillageProfile(Long orgId) {
		getSqlMapClientTemplate().delete("villageProfile.deleteVillageProfile",
				orgId);
	}

	@Override
	public VillageProfile getVillageProfileByOrgId(Long orgId) {
		if (orgId == null) {
			throw new BusinessValidationException("orgId为空");
		}
		return (VillageProfile) getSqlMapClientTemplate().queryForObject(
				"villageProfile.getVillageProfileByOrgId", orgId);
	}

}
