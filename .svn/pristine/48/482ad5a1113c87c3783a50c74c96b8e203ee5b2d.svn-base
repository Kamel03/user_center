package com.tianque.userAuth.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Role;
import com.tianque.sysadmin.dao.SearchRoleManangerDao;
import com.tianque.userAuth.api.SearchRoleDubboService;

@Component
public class SearchRoleDubboServiceImpl implements SearchRoleDubboService {
	
	@Autowired
	private SearchRoleManangerDao searchRoleManangerDao;

	@Override
	public PageInfo<Role> searchRoles(Role condition, int pageNum,
			int pageSize, String sortField, String order) {
		return searchRoleManangerDao.searchRoles(condition, pageNum, pageSize, sortField, order);
	}

	@Override
	public PageInfo<Role> searchRolesLike(Role role, Integer page,
			Integer rows, String sidx, String sord) {
		return searchRoleManangerDao.searchRolesLike(role, page, rows, sidx, sord);
	}
}
