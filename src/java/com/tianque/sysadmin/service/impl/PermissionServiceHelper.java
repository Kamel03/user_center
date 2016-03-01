package com.tianque.sysadmin.service.impl;

import com.tianque.domain.User;
import com.tianque.exception.base.BusinessValidationException;

public class PermissionServiceHelper {
	public static void checkAddUser(User user) {
		if (user == null || user.getUserName() == null
				|| "".equals(user.getUserName().trim())) {
			throw new BusinessValidationException("用户名不能为空！");
		}
		if (user.getPassword() == null || "".equals(user.getPassword().trim())) {
			throw new BusinessValidationException("密码不能为空！");
		}
		if (user.isLock()) {
			throw new BusinessValidationException("不能添加锁定状态的用户！");
		}
		if (user.getMobile() == null || "".equals(user.getMobile())) {
			throw new BusinessValidationException("手机号码不能为空");
		}
		if (user.getWorkPhone() == null || "".equals(user.getWorkPhone())) {
			throw new BusinessValidationException("单位电话不能为空");
		}
		if (user.isValidatorImsi()
				&& (user.getImsi() == null || "".equals(user.getImsi().trim()))) {
			throw new BusinessValidationException("imsi不能为空");
		}
	}

	public static void checkAddMobileUser(User user) {
		if (user == null || user.getUserName() == null
				|| "".equals(user.getUserName().trim())) {
			throw new BusinessValidationException("用户名不能为空！");
		}
		if (user.getPassword() == null || "".equals(user.getPassword().trim())) {
			throw new BusinessValidationException("密码不能为空！");
		}
		if (!user.isMobileusable()) {
			throw new BusinessValidationException("必须是手机端可用！");
		}
		if (user.getMobile() == null || "".equals(user.getMobile())) {
			throw new BusinessValidationException("手机号码不能为空");
		}
		if (user.getWorkPhone() == null || "".equals(user.getWorkPhone())) {
			throw new BusinessValidationException("单位电话不能为空");
		}
		if (user.isValidatorImsi()
				&& (user.getImsi() == null || "".equals(user.getImsi().trim()))) {
			throw new BusinessValidationException("imsi不能为空");
		}
	}

	public static void checkUpdateUser(User user) {
		if (user.isLock()) {
			throw new BusinessValidationException("不能更新锁定状态的用户！");
		}
	}

}
