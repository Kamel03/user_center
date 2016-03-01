package com.tianque.sysadmin.dao;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.User;

public interface SearchUserListDatasDao {
	public PageInfo<User> findUserListDatas(String orgId, User user, List<Long> roleIds,
			Integer page, Integer rows, String sidx, String sord);

	public PageInfo<User> findUserListDatasBylockStatus(User user, List<Long> roles, Integer page,
			Integer rows, String sidx, String sord);
}
