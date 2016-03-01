package com.tianque.sysadmin.dao.impl;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.sysadmin.dao.UserHasMultizoneDao;

@Repository("userHasMultizoneDao")
public class UserHasMultizoneDaoImpl extends AbstractBaseDao implements UserHasMultizoneDao {
	@Override
	public void deleteMultizoneByOrgId(Long id) {
		getSqlMapClientTemplate().delete("userHasMultizone.deleteMultizoneByOrgId", id);
	}
}
