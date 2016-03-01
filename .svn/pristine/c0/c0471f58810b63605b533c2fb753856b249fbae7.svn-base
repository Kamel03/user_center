package com.tianque.core.globalSetting.dao;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.exception.base.BusinessValidationException;

@Repository("globalSettingDao")
public class GlobalSettingDaoImpl extends AbstractBaseDao implements GlobalSettingDao {

	@Override
	public String addGlobalSetting(String val) {
		if (val == null || "".equals(val.trim()))
			throw new BusinessValidationException();
		getSqlMapClientTemplate().insert("globalSetting.addGlobalSetting", val);
		return getGlobalSetting();
	}

	@Override
	public String getGlobalSetting() {
		return (String) getSqlMapClientTemplate().queryForObject("globalSetting.getGlobalSetting",
				null);
	}

	@Override
	public String updateGlobalSetting(String val) {
		if (val == null || "".equals(val.trim()))
			throw new BusinessValidationException();
		getSqlMapClientTemplate().update("globalSetting.updateGlobalSetting", val);
		return getGlobalSetting();
	}

}
