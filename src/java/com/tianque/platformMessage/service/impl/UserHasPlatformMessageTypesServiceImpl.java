package com.tianque.platformMessage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.domain.User;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.platformMessage.dao.UserHasPlatformMessageTypesDao;
import com.tianque.platformMessage.service.UserHasPlatformMessageTypesService;
import com.tianque.sysadmin.service.PermissionService;

@Transactional
@Service("userHasPlatformMessageTypesService")
public class UserHasPlatformMessageTypesServiceImpl implements
		UserHasPlatformMessageTypesService {

	@Autowired
	private UserHasPlatformMessageTypesDao userHasPlatformMessageTypesDao;
	@Autowired
	private PermissionService permissionService;

	@Override
	public void addUserHasPlatformMessageType(List<Integer> messageTypes,
			Long userId) {
		try {
			userHasPlatformMessageTypesDao
					.deleteUserHasPlatformMessageTypeByUserId(userId);

			if (messageTypes != null && messageTypes.size() > 0) {

				for (Integer meeageTye : messageTypes) {

					userHasPlatformMessageTypesDao
							.addUserHasPlatformMessageType(userId, meeageTye);
				}
			}
		} catch (Exception e) {
			throw new ServiceValidationException("用户新增订阅消息类型出错:", "操作失败，请重试", e);
		}
	}

	@Override
	public void deleteUserHasPlatformMessageTypeByUserId(Long userId) {
		try {
			userHasPlatformMessageTypesDao
					.deleteUserHasPlatformMessageTypeByUserId(userId);
		} catch (Exception e) {
			throw new ServiceValidationException("删除用户订阅消息类型出错:", "操作失败，请重试", e);
		}
	}
	
	@Override
	public void deleteUserHasPlatformMessageTypeByUserName(String name) {
		try {
			User user = permissionService.getFullUserByUerName(name);
			if (user != null && user.getId() != null) {
				deleteUserHasPlatformMessageTypeByUserId(user.getId());
			}
		} catch (Exception e) {
			throw new BusinessValidationException("操作失败，请重试");
		}
	}

	@Override
	public List<Integer> findUserHasPlatformMessageTypeByUserId(Long userId) {
		try {
			return userHasPlatformMessageTypesDao
					.findUserHasPlatformMessageTypeByUserId(userId);
		} catch (Exception e) {
			throw new ServiceValidationException("查询用户消息类型出错:", "操作失败，请重试", e);
		}
	}

}
