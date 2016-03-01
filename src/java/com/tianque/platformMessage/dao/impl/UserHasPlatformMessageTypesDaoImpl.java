package com.tianque.platformMessage.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.platformMessage.dao.UserHasPlatformMessageTypesDao;

@Repository("userHasPlatformMessageTypesDao")
public class UserHasPlatformMessageTypesDaoImpl extends AbstractBaseDao
		implements UserHasPlatformMessageTypesDao {

	@Override
	public List<Integer> findUserHasPlatformMessageTypeByUserId(Long userId) {

		return getSqlMapClientTemplate()
				.queryForList(
						"userHasPlatformMessageTypes.findUserHasPlatformMessageTypeByUserId",
						userId);
	}

	@Override
	public void addUserHasPlatformMessageType(Long userId, Integer messageTye) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("messageTye", messageTye);
		map.put("userId", userId);
		getSqlMapClientTemplate().insert(
				"userHasPlatformMessageTypes.addUserHasPlatformMessageType",
				map);

	}

	@Override
	public void deleteUserHasPlatformMessageTypeByUserId(Long userId) {
		getSqlMapClientTemplate()
				.delete("userHasPlatformMessageTypes.deleteUserHasPlatformMessageTypeByUserId",
						userId);
	}

}
