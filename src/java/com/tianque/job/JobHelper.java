package com.tianque.job;

import java.util.Calendar;
import java.util.Date;

import com.tianque.core.util.CalendarUtil;
import com.tianque.core.util.GlobalValue;
import com.tianque.core.util.ThreadVariable;
import com.tianque.domain.Organization;
import com.tianque.domain.Session;
import com.tianque.domain.User;

public class JobHelper {
	public static void createMockAdminSession() {
		Session session = new Session();
		session.setUserName("admin");
		session.setUserRealName("超级管理员");
		session.setAccessIp("127.0.0.1");
		session.setAccessTime(CalendarUtil.now("yyyy-MM-dd HH:mm:ss"));
		session.setLoginDate(CalendarUtil.now("yyyy-MM-dd HH:mm:ss"));
		session.setLogin(true);
		session.setUserId(1L);
		session.setSessionId(GlobalValue.JOB_COOKIE);
		Organization org = new Organization();
		org.setId(1L);
		org.setOrgInternalCode(".");
		session.setOrganization(org);
		session.setOrgInternalCode(".");
		User user = new User();
		ThreadVariable.setUser(user);
		user.setOrganization(org);
		ThreadVariable.setSession(session);
		ThreadVariable.setOrganization(org);
	}

	/**
	 * 获取时间（根据时间段当前时间向前推时间段天）
	 * 
	 * @param limitation
	 *            时间段（天）
	 * @return
	 */
	public static Date getMaxTime(Integer limitation) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, CalendarUtil.getNowYear());
		calendar.set(Calendar.MONTH, CalendarUtil.getNowMonth() - 1);
		calendar.getTime();
		calendar.set(Calendar.DAY_OF_MONTH, CalendarUtil.getNowDay()
				- limitation);
		calendar.getTime();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);

		return calendar.getTime();
	}
}
