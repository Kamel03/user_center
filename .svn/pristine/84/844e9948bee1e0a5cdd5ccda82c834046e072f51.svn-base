package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.User;
import com.tianque.sysadmin.dao.SearchUserListDatasDao;
import com.tianque.userAuth.api.SearchUserDubboService;

@Component
public class SearchUserDubboServiceImpl implements SearchUserDubboService{

	@Autowired
	private SearchUserListDatasDao searchUserListDatasDao;
	
	@Override
	public PageInfo<User> findUserListDatas(String orgId, User user,
			List<Long> roleIds, Integer page, Integer rows, String sidx,
			String sord) {
		return searchUserListDatasDao.findUserListDatas(orgId, user, roleIds, page, rows, sidx, sord);
	}

	@Override
	public PageInfo<User> findUserListDatasBylockStatus(User user,
			List<Long> roles, Integer page, Integer rows, String sidx,
			String sord) {
		return searchUserListDatasDao.findUserListDatasBylockStatus(user, roles, page, rows, sidx, sord);
	}

}
