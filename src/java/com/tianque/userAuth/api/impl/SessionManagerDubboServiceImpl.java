package com.tianque.userAuth.api.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.component.SessionManager;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.Session;
import com.tianque.domain.User;
import com.tianque.userAuth.api.SessionManagerDubboService;

@Component
public class SessionManagerDubboServiceImpl implements
		SessionManagerDubboService {
	@Autowired
	private SessionManager sessionManager;

	@Override
	public HashMap<String, Object> isLogin(String sessionId, String requestURI,
			String ipAddr) {
		return sessionManager.isLogin(sessionId, requestURI, ipAddr);
	}

	@Override
	public boolean isFirstLogin() {
		return sessionManager.isFirstLogin();
	}

	@Override
	public void deleteSessionsWhenTimeOut() {
		sessionManager.deleteSessionsWhenTimeOut();
	}

	@Override
	public HashMap<String, Object> login(User user, Session session,
			String oldSessionId, String sso) {
		return sessionManager.login(user, session, oldSessionId, sso);
	}

	@Override
	public PageInfo<Session> getSessionsByOrgInternalCode(
			String orgInternalCode, int pageNum, int pageSize,
			String sortField, String order, Organization organization,
			int accountType) {
		return sessionManager.getSessionsByOrgInternalCode(orgInternalCode,
				pageNum, pageSize, sortField, order, organization, accountType);
	}

	@Override
	public void logout(String sessionId) {
		sessionManager.logout(sessionId);
	}

	@Override
	public void deleteSessionBySessionId(String sessionId) {
		sessionManager.deleteSessionBySessionId(sessionId);
	}

	@Override
	public Session addSession(Session session) {
		return sessionManager.addSession(session);
	}

	@Override
	public Session findSessionBySessionId(String sessionId) {
		return sessionManager.findSessionBySessionId(sessionId);
	}

	@Override
	public Session updateSessionAccessTimeBySessionId(String id,
			Date accessDate, String lastLoginUrl, String accessIp) {
		return sessionManager.updateSessionAccessTimeBySessionId(id,
				accessDate, lastLoginUrl, accessIp);
	}

	@Override
	public void validateUserSessionByUserName(String userName) {
		sessionManager.validateUserSessionByUserName(userName);
	}

	@Override
	public HashMap<String, Object> mockLogin(Session session, String userName,
			String oldSessionId, String curSessionId) {
		return sessionManager.mockLogin(session, userName, oldSessionId,
				curSessionId);
	}

	@Override
	public HashMap<String, Object> loginForMobile(User user, Session session,
			String oldSessionId, String imsiNo) {
		return sessionManager.loginForMobile(user, session, oldSessionId,
				imsiNo);
	}

	@Override
	public String updateMobileVersion(String mobileVersion,
			String mobileInnerVersion) {
		return sessionManager.updateMobileVersion(mobileVersion,
				mobileInnerVersion);
	}

	@Override
	public List<Session> findSessionByUserName(String userName) {
		return sessionManager.findSessionByUserName(userName);
	}

}
