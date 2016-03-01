package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.platformMessage.service.UserHasPlatformMessageTypesService;
import com.tianque.userAuth.api.UserHasPlatformMessageTypesDubboService;

@Component
public class UserHasPlatformMessageTypesDubboServiceImpl implements UserHasPlatformMessageTypesDubboService{

	@Autowired
	private UserHasPlatformMessageTypesService userHasPlatformMessageTypesService;
	
	@Override
	public void addUserHasPlatformMessageType(List<Integer> messageTypes,
			Long userId) {
		userHasPlatformMessageTypesService.addUserHasPlatformMessageType(
				messageTypes, userId);
	}

	@Override
	public void deleteUserHasPlatformMessageTypeByUserId(Long userId) {
		userHasPlatformMessageTypesService
				.deleteUserHasPlatformMessageTypeByUserId(userId);
	}

	@Override
	public void deleteUserHasPlatformMessageTypeByUserName(String name) {
		userHasPlatformMessageTypesService
				.deleteUserHasPlatformMessageTypeByUserName(name);
	}
	
	@Override
	public List<Integer> findUserHasPlatformMessageTypeByUserId(Long userId) {
		return userHasPlatformMessageTypesService
				.findUserHasPlatformMessageTypeByUserId(userId);
	}

}
