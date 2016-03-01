/*   
 * Copyright (c) 2014-2020 TianQue Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * TianQue. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with TianQue.
 *   
 */
package com.tianque.core.dubbo.filter;

import org.apache.commons.lang.StringUtils;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.tianque.component.SessionManager;
import com.tianque.core.util.CalendarUtil;
import com.tianque.core.util.GlobalValue;
import com.tianque.core.util.GridProperties;
import com.tianque.core.util.SpringBeanUtil;
import com.tianque.core.util.StringUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.domain.Organization;
import com.tianque.domain.Session;
import com.tianque.domain.User;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.IllegalOperationException;
import com.tianque.init.impl.CreateSessionForTestInitialization;
import com.tianque.job.JobHelper;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;

/**
 * @ClassName: DubboRPCFilter
 * @Description: dubbo请求过滤器
 * @author wangxiaohu wsmalltiger@163.com
 * @date 2015年3月9日 下午4:02:57
 */
public class DubboRPCFilter implements Filter {

	private static final String DUBBO_URL_PREFIX = "dubbo:";
	private static final String INIT_APP_COOKIE = "INIT_APP";
	public static String[] whiteList = GridProperties.DUBBO_WHITE_LIST.split(";");

	private static SessionManager sessionManager;
	private static PermissionService permissionService;
	private static OrganizationService organizationService;

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation)
			throws RpcException {
		ThreadVariable.clearThreadVariable();
		String accessUrl = invoker.getUrl().toString();
		String cookie = invocation.getAttachment("cookie");
		String url = invoker.getInterface().getName() + "."
				+ invocation.getMethodName();
		if (!accessUrl.startsWith(DUBBO_URL_PREFIX) || isNeedFilter(url)) {
			if (StringUtils.isNotEmpty(cookie)) {
				putSessionToThreadVariable(cookie, false, url);
			}
			return getResult(invoker, invocation);
		}
		if (!StringUtil.isStringAvaliable(cookie)) {
			throw new IllegalOperationException("非法操作，cookie 不存在！URL[" + url
					+ "]");
		}
		if (INIT_APP_COOKIE.equals(cookie)) {
			try {
				new CreateSessionForTestInitialization().init();
			} catch (Exception e) {
				throw new IllegalOperationException("创建初始化session失败！");
			}
			return getResult(invoker, invocation);
		}
		if (cookie.startsWith(GlobalValue.JOB_COOKIE)) {
			JobHelper.createMockAdminSession();
			return getResult(invoker, invocation);
		}
		putSessionToThreadVariable(cookie, true, url);
		return getResult(invoker, invocation);
	}

	private void putSessionToThreadVariable(String cookie, boolean isValidate,
			String url) {
		Session session = getSessionManagerService().findSessionBySessionId(
				cookie);
		if (session == null) {
			if (!isValidate) {
				return;
			}
			throw new BusinessValidationException("登录身份失效，请重新登录！URL[" + url
					+ "]");
		}
		session.setAccessTime(CalendarUtil.now("yyyy-MM-dd HH:mm:ss"));
		User user = getPermissionService().getSimpleUserById(
				session.getUserId());
		if (user != null) {
			Organization org = getOrganizationService().getFullOrgById(
					user.getOrganization().getId());
			user.setOrganization(org);
			ThreadVariable.setUser(user);
			ThreadVariable.setOrganization(org);
		}
		ThreadVariable.setSession(session);
	}

	private Result getResult(Invoker<?> invoker, Invocation invocation) {
		return invoker.invoke(invocation);
	}

	private boolean isNeedFilter(String url) {
		for (String witeName : whiteList) {
			if (url.trim().equals(witeName)) {
				return true;
			}
		}
		return false;
	}

	private static SessionManager getSessionManagerService() {
		if (sessionManager == null) {
			sessionManager = (SessionManager) SpringBeanUtil
					.getBeanFromSpringByBeanName("sessionManager");
		}
		return sessionManager;
	}

	private static PermissionService getPermissionService() {
		if (permissionService == null) {
			permissionService = (PermissionService) SpringBeanUtil
					.getBeanFromSpringByBeanName("permissionService");
		}
		return permissionService;
	}

	private OrganizationService getOrganizationService() {
		if (organizationService == null) {
			organizationService = (OrganizationService) SpringBeanUtil
					.getBeanFromSpringByBeanName("organizationService");
		}
		return organizationService;
	}
}
