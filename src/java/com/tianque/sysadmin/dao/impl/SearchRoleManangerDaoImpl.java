package com.tianque.sysadmin.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Role;
import com.tianque.sysadmin.dao.SearchRoleManangerDao;

@Repository("searchRoleManangerDao")
public class SearchRoleManangerDaoImpl extends AbstractBaseDao implements SearchRoleManangerDao {

	@Override
	public PageInfo<Role> searchRoles(Role role, int pageNum, int pageSize, String sortField,
			String order) {
		if (role == null) {
			return emptyRolePage(pageSize);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", role.getRoleName());
		map.put("description", role.getDescription());
		map.put("useInLevelId", role.getUseInLevel().getId());
		PageInfo<Role> pageInfo = new PageInfo<Role>();
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"searchRole.countSearchRoles", map);
		int pageCount = 0;
		if (countNum / pageSize == 0) {
			pageCount = countNum / pageSize;
		} else {
			pageCount = countNum / pageSize + 1;
		}
		pageNum = pageNum > pageCount ? pageCount : pageNum;
		if (countNum > 0) {
			List<Role> list = getSqlMapClientTemplate().queryForList("searchRole.searchRoles", map,
					(pageNum - 1) * pageSize, pageSize);
			pageInfo.setResult(list);
		} else {
			pageInfo.setResult(new ArrayList<Role>());
		}
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setPerPageSize(pageSize);
		pageInfo.setCurrentPage(pageNum);
		return pageInfo;
	}

	@Override
	public PageInfo<Role> searchRolesLike(Role role, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		if (role == null) {
			return emptyRolePage(pageSize);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", role.getRoleName());
		map.put("description", role.getDescription());
		map.put("useInLevelId", role.getUseInLevel().getId());
		PageInfo<Role> pageInfo = new PageInfo<Role>();
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"searchRole.countSearchRolesLike", map);
		int pageCount = 0;
		if (countNum / pageSize == 0) {
			pageCount = countNum / pageSize;
		} else {
			pageCount = countNum / pageSize + 1;
		}
		pageNum = pageNum > pageCount ? pageCount : pageNum;
		if (countNum > 0) {
			List<Role> list = getSqlMapClientTemplate().queryForList("searchRole.searchRolesLike",
					map, (pageNum - 1) * pageSize, pageSize);
			pageInfo.setResult(list);
		} else {
			pageInfo.setResult(new ArrayList<Role>());
		}
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setPerPageSize(pageSize);
		pageInfo.setCurrentPage(pageNum);
		return pageInfo;
	}

	private PageInfo<Role> emptyRolePage(int pageSize) {
		PageInfo<Role> pageInfo = new PageInfo<Role>();
		pageInfo.setTotalRowSize(0);
		pageInfo.setCurrentPage(0);
		pageInfo.setPerPageSize(pageSize);
		pageInfo.setResult(new ArrayList<Role>());
		return pageInfo;
	}
}
