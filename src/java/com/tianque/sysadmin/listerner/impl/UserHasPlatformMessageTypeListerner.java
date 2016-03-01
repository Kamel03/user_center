package com.tianque.sysadmin.listerner.impl;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.domain.User;
import com.tianque.platformMessage.constants.PlatformMessageType;
import com.tianque.platformMessage.service.UserHasPlatformMessageTypesService;
import com.tianque.sysadmin.listerner.UserListernerAdapter;

/***
 * @author hjw
 */
@Component("UserHasPlatformMessageTypeListerner")
public class UserHasPlatformMessageTypeListerner extends UserListernerAdapter {
	@Autowired
	private UserHasPlatformMessageTypesService userHasPlatformMessageTypesService;

	@Override
	public void addUser(User user) {
		// 所有的消息类型
		Set<Integer> allMessageType = PlatformMessageType.MESSAGE_TYPE.keySet();
		// 新增用户时把所有的平台消息类型添加到用户的订阅表里面
		userHasPlatformMessageTypesService.addUserHasPlatformMessageType(
				new ArrayList<Integer>(allMessageType), user.getId());
	}

	@Override
	public void deleteUser(String userName) {

		userHasPlatformMessageTypesService.deleteUserHasPlatformMessageTypeByUserName(userName);
	}

}
