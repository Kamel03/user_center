package com.tianque.init.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.core.util.CalendarUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.domain.Organization;
import com.tianque.domain.Session;
import com.tianque.domain.User;
import com.tianque.init.Initialization;

public class CreateSessionForTestInitialization implements Initialization {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private static Session session;
	private static User user;

	public CreateSessionForTestInitialization() {
	}

	private synchronized static void createSession() {
		if (session == null) {
			session = new Session();
			session.setUserName("admin");
			session.setUserRealName("超级管理员");
			session.setAccessIp("127.0.0.1");
			session.setAccessTime(CalendarUtil.now("yyyy-MM-dd HH:mm:ss"));
			session.setLoginDate(CalendarUtil.now("yyyy-MM-dd HH:mm:ss"));
			session.setLoginDate(CalendarUtil.now("yyyy-MM-dd HH:mm:ss"));
			session.setLogin(true);
			session.setUserId(1L);
			session.setSessionId(UUID.randomUUID().toString());
			Organization org = new Organization();
			org.setId(1L);
			org.setOrgInternalCode("1.1.");
			session.setOrganization(org);
			session.setOrgInternalCode("1.1.");
			// session = getSessionDao().addSession(session);
			user = new User();
			user.setId(1L);
			user.setUserName("admin");
			user.setOrganization(org);
			// 初始化添加admin用户时设置密码修改时间 add by miaoyuanshuai 2014-09-17
			user.setUpdatePswTime(session.getAccessTime());
		}
		ThreadVariable.setUser(user);
		ThreadVariable.setSession(session);
	}

	@Override
	public void init() throws Exception {
		createSession();
		logger.info("创建测试登录完成!");
	}
}
