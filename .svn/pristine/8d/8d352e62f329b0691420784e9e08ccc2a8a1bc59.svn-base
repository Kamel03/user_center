package com.tianque.component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.component.dao.SessionDao;
import com.tianque.controller.LoginType;
import com.tianque.controller.LoginValidateType;
import com.tianque.controller.mode.ClientMode;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.cache.util.CacheKeyGenerator;
import com.tianque.core.systemLog.domain.SystemLog;
import com.tianque.core.systemLog.service.SystemLogService;
import com.tianque.core.systemLog.util.ModelType;
import com.tianque.core.systemLog.util.OperatorType;
import com.tianque.core.util.EncryptUtil;
import com.tianque.core.util.GlobalValue;
import com.tianque.core.util.GridProperties;
import com.tianque.core.util.StringUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.Session;
import com.tianque.domain.User;
import com.tianque.domain.UserSign;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.mobile.service.MobileInfoService;
import com.tianque.plugin.dataManage.util.Constants;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;
import com.tianque.sysadmin.service.UserSignService;
import com.tianque.util.DateFormat;

@Component("sessionManager")
public class SessionManagerImpl implements SessionManager {
	private final static Logger logger = LoggerFactory
			.getLogger(SessionManagerImpl.class);
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private MobileInfoService mobileInfoService;
	@Autowired
	private CacheService cacheService;

	@Autowired
	private SessionDao sessionDao;
	@Autowired
	private PermissionService permissionService;
	@Autowired
	private SystemLogService systemLogService;

	@Autowired
	private UserSignService userSignService;
	
	@Override
	@Transactional
	public HashMap<String, Object> isLogin(String sessionId, String requestURI,
			String ipAddr) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		Session session = sessionDao.findSessionBySessionId(sessionId);
		if (session == null || null == session.getSessionId()) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
					LoginValidateType.noLogin);
			return resultMap;
		}

		if (!session.isLogin()) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
					LoginValidateType.otherLogin);
			return resultMap;
		}

		if (isTimeOut(session)) {
			sessionDao.deleteSessionBySessionId(sessionId);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
					LoginValidateType.sessionTimeOut);
			return resultMap;
		}
		
		
		sessionDao.updateSessionAccessTimeBySessionId(sessionId, Calendar
				.getInstance().getTime(), requestURI, ipAddr);
		ThreadVariable.setSession(session);
		User user = permissionService.getSimpleUserById(session.getUserId());
		Organization org = organizationService.getFullOrgById(user
				.getOrganization().getId());
		user.setOrganization(org);
		ThreadVariable.setUser(user);
		ThreadVariable.setOrganization(org);
		resultMap.put("newSession", session);
		resultMap.put("newUser", user);
		resultMap.put("newOrganization", org);
		resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
				LoginValidateType.isLogined);
		if( session.getClientMode()==1){ 
			logger.error(String.format("用户%s访问isLogin , url:/%s", user.getUserName(),requestURI));
		}
		return resultMap;
	}

	private boolean isTimeOut(Session session) {
		if ((Calendar.getInstance().getTime().getTime() - session
				.getAccessTime().getTime()) > GridProperties.SESSION_TIME_OUT) {
			logger.info("用户：{}Session失效，上一次访问时间{}", session.getUserName(),
					session.getAccessTime());
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public void logout(String sessionId) {
		sessionDao.deleteSessionBySessionId(sessionId);
		systemLogService.log("用户登出", ModelType.LOGGIN, OperatorType.LOGINUP);
		ThreadVariable.setSession(null);
	}

	private boolean checkValidateCode(String sessionId, String validateCode) {
		if (sessionId == null) {
			return true;
		}
		Session session = sessionDao.findSessionBySessionId(sessionId);
		if (validateCode != null
				&& validateCode.equals(session.getValidateCode())) {
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public HashMap<String, Object> login(User user, Session session,
			String oldSessionId, String sso) {
		long start = System.currentTimeMillis();
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		LoginType resultType = proccessLogin(resultMap, session.getAccessIp(),
				user.getUserName(), user.getPassword(),
				session.getValidateCode(),
				"true".equals(user.getMobile()) ? ClientType.mobile
						: ClientType.PC, session.getLastUrl(),
				session.getSessionId(), oldSessionId, sso, user.getImsi());
		if (LoginType.loginSuccess != resultType) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE", resultType);
			return resultMap;
		}
		// 当天用户第一次登录成功后，签到表中新增一条登录数据
		if (!userSignService.getUserSignByUserId(ThreadVariable.getSession()
				.getUserId(), DateFormat.today())) {
			userSignService.addUserSign(fillUserSign());
		}
		long end = System.currentTimeMillis();
		logger.info("登录用时" + (end - start));
		resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
				LoginType.loginSuccess);
		return resultMap;

	}

	/**
	 * 创建出一个UserSign
	 * @return
	 */
	private UserSign fillUserSign() {
		UserSign userSign = new UserSign();
		User user=permissionService.getSimpleUserById(ThreadVariable.getSession().getUserId());
		userSign.setUserId(user.getId());
		Organization org = organizationService.getSimpleOrgById(user.getOrganization().getId());
		userSign.setOrg(org);
		userSign.setOrgType(org.getOrgType());
		userSign.setOrgLevel(org.getOrgLevel());
		return userSign;
	}
	/**
	 * 
	 * @Title: updateMobileVersion
	 * @Description: TODO手机端 登录时传入内部版本号和版本号参数
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @author wanggz
	 * @date 2014-7-21 下午05:31:15
	 */
	public String updateMobileVersion(String mobileVersion,
			String mobileInnerVersion) {
		try {
			if (ThreadVariable.getSession() != null
					&& ThreadVariable.getSession().getUserId() != null) {
				User newUser = permissionService
						.getSimpleUserById(ThreadVariable.getSession()
								.getUserId());
				if (null == mobileVersion || "".equals(mobileVersion)) {
					newUser.setMobileVersion("");
				} else {
					newUser.setMobileVersion(mobileVersion);
				}
				if (null == mobileInnerVersion || "".equals(mobileInnerVersion)) {
					newUser.setMobileInnerVersion("");
				} else {
					newUser.setMobileInnerVersion(mobileInnerVersion);
				}
				permissionService.updateMobileUserVersion(newUser);
			}
		} catch (Exception e) {
			throw new ServiceValidationException("修改手机版本号和内部版本号出错", e);
		}
		return "success";
	}

	@Override
	public HashMap<String, Object> loginForMobile(User user, Session session,
			String oldSessionId, String imsiNo) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		if (GridProperties.IS_VALIDATE_MOBILE) {
			if (!StringUtil.isStringAvaliable(imsiNo)) {
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG, "imsiNo为空!");
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
						LoginType.loginFailure);
				return resultMap;
			}
			if (!validateImsi(imsiNo)) {
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG, "imsiNo不存在!");
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
						LoginType.loginFailure);
				return resultMap;
			}
		}
		LoginType resultType = proccessLogin(resultMap, session.getAccessIp(),
				user.getUserName(), user.getPassword(),
				session.getValidateCode(), ClientType.mobile,
				session.getLastUrl(), session.getSessionId(), oldSessionId,
				null, user.getImsi());
		if (LoginType.loginSuccess != resultType) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE", resultType);
			return resultMap;
		}
		resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
				LoginType.loginSuccess);
		return resultMap;
	}

	private boolean validateImsi(String imsiNo) {
		return mobileInfoService.existImsiNo(imsiNo);
	}

	private LoginType proccessLogin(HashMap<String, Object> resultMap,
			String ipAddr, String userName, String password,
			String validateCode, ClientType clientType, String requestURI,
			String sessionId, String oldSessionId, String sso, String imsi) {
		if (!validateParameters(userName, password)) {
			return LoginType.loginFailure;
		}
		User user = getUserByUserName(resultMap, ipAddr, userName);
		if (user != null) {
			user.setClientType(clientType);
		}
		if (user != null
				&& !user.isAdmin()
				&& !validateUserAbleByClientType(resultMap, ipAddr, user,
						clientType)) {
			return LoginType.loginFailure;
		}
		if (!compareUserToParameters(user, resultMap, userName, password,
				validateCode, clientType, ipAddr, sso, imsi, sessionId)) {
			return LoginType.loginFailure;
		}
		fireOldLoginUser(oldSessionId);
		proccessLoginSuccess(user, ipAddr, requestURI, sessionId, resultMap);
		if (!isUserFirstLogin(user)) {
			return LoginType.firstLogin;
		}
		// 判断用户密码是否超过一个月没修改add by miaoys 2014-09-15
		// if (isPasswordOutTime(user)) {
		// return LoginType.loginSuccessNeedUpdatePsw;
		// }
		return LoginType.loginSuccess;
	}

	/**
	 * @Description: 判断用户密码是否超过一个月没修改
	 * @param user
	 * @return boolean 返回类型 true :超过,false:未超过
	 * @author miaoys
	 * @date 2014-09-15 下午02:05:15
	 */
	//	private boolean isPasswordOutTime(User user) {
	//		if (null == user
	//				|| null == user.getUpdatePswTime()
	//				|| (Calendar.getInstance().getTime().getTime() - user
	//						.getUpdatePswTime().getTime()) / (24 * 60 * 60 * 1000) > GridProperties.PASSWORD_DAY_OUT) {
	//			logger.info("用户已超过一个月未更改密码", user.getUpdatePswTime());
	//			return true;
	//		}
	//		return false;
	//	}

	private boolean validateUserAbleByClientType(
			HashMap<String, Object> resultMap, String ipAddr, User user,
			ClientType clientType) {
		if (!GridProperties.IS_VALIDATE_MOBILE) {
			return true;
		}
		if (clientType.equals(ClientType.PC) && !user.isPcusable()) {
			systemLogService.log("用户登录失败:" + user.getUserName() + "不能通过pc登录系统",
					ModelType.LOGGIN, OperatorType.LOGIN, SystemLog.WARN,
					ipAddr);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'此帐号不能通过pc登录系统'}");
			return false;
		}
		if (clientType.equals(ClientType.mobile) && !user.isMobileusable()) {
			systemLogService.log("用户登录失败:" + user.getUserName() + "不能通过手机登录系统",
					ModelType.LOGGIN, OperatorType.LOGIN, SystemLog.WARN,
					ipAddr);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'此帐号不能通过手机登录系统'}");
			return false;
		}
		return true;
	}

	private void fireOldLoginUser(String oldSessionId) {
		if (oldSessionId != null && !"".equals(oldSessionId.trim())) {
			Session oldSession = sessionDao
					.findSessionBySessionId(oldSessionId);
			if (oldSession != null) {
				fireLoginedUser(oldSession.getUserName());
			}
		}
	}

	private User getUserByUserName(HashMap<String, Object> resultMap,
			String ipAddr, String userName) {
		return permissionService.findUserByUserName(userName);
	}

	private boolean validateParameters(String userName, String password) {
		if (userName == null || password == null) {
			return false;
		}
		return true;
	}

	/**
	 * 这个是重复登录
	 */
	private void fireLoginedUser(String userName) {
		List<Session> sessions = sessionDao.findSessionByUserName(userName);
		for (Session session : sessions) {
			sessionDao.updateSessionHasLogined(session.getSessionId(), false);
		}
	}

	private boolean isUserFirstLogin(User user) {
		if (user.isChangePassword()) {
			return false;
		}
		return true;
	}

	private void proccessLoginSuccess(User user, String ipAddr,
			String requestURI, String sessionId,
			HashMap<String, Object> resultMap) {
		fireLoginedUser(user.getUserName());
		generateLoginedSession(user, ipAddr, requestURI, sessionId, resultMap);
		updateLoginUser(ipAddr, user);
		systemLogService.log("用户登录成功!", ModelType.LOGGIN,
				OperatorType.USER_SUCCESS_LOGIN);
		if (user.getFailureTimes() > 0) {
			user.setFailureTimes(0);
			permissionService.updateFailureTimesById(user.getId(),
					user.getFailureTimes());
		}
	}

	private boolean compareUserToParameters(User user,
			HashMap<String, Object> resultMap, String userName,
			String password, String validateCode, ClientType clientType,
			String ipAddr, String sso, String imsi, String sessionId) {
		if (user == null) {
			systemLogService.log("用户登录失败，不存在用户名:" + userName, ModelType.LOGGIN,
					OperatorType.LOGIN, SystemLog.WARN, ipAddr);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'用户名或密码错误'}");
			return false;
		}
		if (user.getState() != null) {
			if (Constants.UserState.WITHACTIVATION_STATE
					.equals(user.getState())) {
				systemLogService.log("用户登录失败:" + userName, ModelType.LOGGIN,
						OperatorType.LOGIN, SystemLog.WARN, ipAddr);
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
						"{userName:'该用户待激活'}");
				return false;
			}
			if (Constants.UserState.DISABLE_STATE.equals(user.getState())) {
				systemLogService.log("用户登录失败:" + userName, ModelType.LOGGIN,
						OperatorType.LOGIN, SystemLog.WARN, ipAddr);
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
						"{userName:'该用户已停用'}");
				return false;
			}
		}
		if (user.isLock()) {
			systemLogService.log("用户登录失败，该用户已被锁定:" + user.getUserName() + "#"
					+ user.getOrgInternalCode(), ModelType.LOGGIN,
					OperatorType.LOGIN, SystemLog.WARN, ipAddr);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'用户登录失败，该用户已被锁定'}");
			return false;
		}
		if (sso != null && !"".equals(sso)) {
		} else {
			if (!validatePassword(user, password, clientType)) {
				systemLogService.log("用户登录失败，密码错误！ 用户名为:" + user.getUserName()
						+ "#" + user.getOrgInternalCode(), ModelType.LOGGIN,
						OperatorType.LOGIN, SystemLog.WARN, ipAddr);
				resultMap.put("user", user);
				proccessFailureTimeslimit(resultMap, user);
				return false;
			}
		}

		if (user.getFailureTimes() != null
				&& user.getFailureTimes().intValue() >= 3
				&& !checkValidateCode(sessionId, validateCode)
				&& clientType.equals(ClientType.PC)) {
			systemLogService.log("用户登录失败，验证码错误", ModelType.LOGGIN,
					OperatorType.LOGIN, SystemLog.WARN, ipAddr);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{validateCode:'验证码错误'}");
			return false;
		}
		imsi = imsi == null ? "" : imsi.trim();
		if (user.isValidatorImsi() && ClientType.mobile.equals(clientType)
				&& ("".equals(imsi) || !imsi.equals(user.getImsi()))) {
			systemLogService.log("登录失败，请使用对应手机号登录账号", ModelType.LOGGIN,
					OperatorType.LOGIN, SystemLog.WARN, ipAddr);
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{validateCode:'登录失败，请使用对应手机号登录账号'}");
			return false;
		}
		return true;
	}

	/**
	 * 登录失败次数限制，如果超过5次将锁定用户
	 * 
	 * @param request
	 * @param user
	 */
	private void proccessFailureTimeslimit(HashMap<String, Object> resultMap,
			User user) {
		if (user.isAdmin()) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'用户名或密码错误'}");
			return;
		}
		user.setFailureTimes(user.getFailureTimes() + 1);
		permissionService.updateFailureTimesById(user.getId(),
				user.getFailureTimes());

		if (user.getFailureTimes() >= 5) {
			user.setLock(true);
			permissionService.lockOperate(user.getId(), user.isLock());
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'用户登录失败，密码错误！<br>您的账号已被锁定，请与管理员联系',failureTimes:'"
							+ user.getFailureTimes() + "'}");
		} else {
			resultMap.put(
					GlobalValue.LOGIN_FAILURE_MSG,
					"{userName:'用户登录失败，密码错误！<br>您已有" + user.getFailureTimes()
							+ "次登录失败，超过5次将被锁定',failureTimes:'"
							+ user.getFailureTimes() + "'}");
		}
	}

	private void updateLoginUser(String ipAddr, User user) {
		user.setPreviousLoginIp(user.getLastLoginIp());
		user.setPreviousLoginTime(user.getLastLoginTime());
		user.setLastLoginIp(ipAddr);
		user.setLastLoginTime(Calendar.getInstance().getTime());
		this.permissionService.updateUser(user);
	}

	private void generateLoginedSession(User user, String ipAddr,
			String requestURI, String sessionId,
			HashMap<String, Object> resultMap) {
		if (sessionId != null) {
			sessionDao.deleteSessionBySessionId(sessionId);
		}
		int userClientMode = (ClientType.PC).equals(user.getClientType()) ? ClientMode.CLIENT_MODE_PC
				: ClientMode.CLIENT_MODE_MOBILE;
		Session session = addSession(user.getId(), user.getUserName(),
				user.getName(), user.getOrganization(), ipAddr, requestURI,
				true, ipAddr, user.getOrgInternalCode(), userClientMode);
		logger.debug("user.getOrgInternalCode:", user.getOrgInternalCode());
		ThreadVariable.setSession(session);
		resultMap.put("newSession", session);
	}

	// 假设所有访问时间加上过期时间，还没到当前时间，则不增加Session
	// 行为对外公开，应当做业务约束
	public Session addSession(Session session) {
		if (session.getAccessTime().getTime() + GridProperties.SESSION_TIME_OUT < System
				.currentTimeMillis()) {
			return null;
		}
		return sessionDao.addSession(session);
	}

	private Session addSession(Long userId, String userName,
			String userRealName, Organization org, String loginIp,
			String lastUrl, boolean isLogin, String accessIp,
			String orgInternalCode, int userClientMode) {
		Session session = new Session();
		session.setLoginIp(loginIp);
		session.setUserName(userName);
		session.setUserRealName(userRealName);
		session.setOrganization(org);
		session.setAccessTime(Calendar.getInstance().getTime());
		String randomUUId = UUID.randomUUID().toString();
		session.setSessionId(randomUUId);
		session.setLogin(isLogin);
		session.setLastUrl(lastUrl);
		session.setAccessIp(accessIp);
		session.setUserId(userId);
		session.setOrgInternalCode(orgInternalCode);
		session.setClientMode(userClientMode);
		if (isLogin) {
			session.setLoginDate(Calendar.getInstance().getTime());
		}
		return addSession(session);
	}

	private boolean validatePassword(User user, String password,ClientType clientType) {
		if(password == null){
			return false;
		}
		if(ClientType.mobile.equals(clientType)){
			password = EncryptUtil.md5Encrypt(password);
		}
		if (!password.equals(user.getPassword())) {
			return false;
		}
		return true;
	}

	// private boolean haveSessionIdInCookies(HttpServletRequest request,
	// HttpServletResponse response) {
	// if (CookieUtil.getSesssionIdFromCookies(request) != null) {
	// return true;
	// }
	// return false;
	// }

	@Override
	@Transactional
	public void deleteSessionsWhenTimeOut() {
		int deletedSessionCounts = sessionDao.deleteSessionsWhenTimeOut();
		logger.info("自动清理过期Session,总共清理{}个在线用户", deletedSessionCounts);
	}

	@Override
	@Transactional
	public boolean isFirstLogin() {
		if (ThreadVariable.getSession() == null) {
			return false;
		}
		Long userId = ThreadVariable.getSession().getUserId();
		User user = permissionService.getSimpleUserById(userId);
		return user.isChangePassword();
	}

	public void deleteSessionBySessionId(String sessionId) {
		sessionDao.deleteSessionBySessionId(sessionId);
	}

	/**
	 * 安全验证,如果成功，返回最初登录的session
	 */
	private Session verifySession(String userName, String oldSessionId,
			String curSessionId) {
		Session verifySession = null;
		if (oldSessionId != null && !"".equals(oldSessionId.trim())) {
			verifySession = sessionDao.findSessionBySessionId(oldSessionId);
		} else {
			verifySession = sessionDao.findSessionBySessionId(curSessionId);
		}
		if (verifySession == null || verifySession.getUserName() == null
				|| "".equals(verifySession.getUserName().trim())) {
			return null;
		}
		if (!"admin".equals(verifySession.getUserName())) {
			User oldUser = permissionService.getSimpleUserById(verifySession
					.getUserId());
			if (!oldUser.isAdmin())
				return null;
		}
		if ("admin".equals(userName)) {
			return null;
		}
		return verifySession;

	}

	@Override
	public HashMap<String, Object> mockLogin(Session session, String userName,
			String oldSessionId, String curSessionId) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		Session oldSession = verifySession(userName, oldSessionId, curSessionId);
		if (null == oldSession) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
					LoginType.loginFailure);
			return resultMap;
		}
		LoginType resultType = mockProccessLogin(resultMap, userName,
				oldSession, session.getAccessIp(), session.getLastUrl(),
				oldSessionId, curSessionId);
		if (LoginType.loginSuccess != resultType) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE", resultType);
			return resultMap;
		}
		// 当天用户第一次登录成功后，签到表中新增一条登录数据
		if (!userSignService.getUserSignByUserId(ThreadVariable.getSession()
				.getUserId(), DateFormat.today())) {
			userSignService.addUserSign(fillUserSign());
		}
		resultMap.put(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE",
				LoginType.loginSuccess);
		return resultMap;
	}

	private LoginType mockProccessLogin(HashMap<String, Object> resultMap,
			String userName, Session oldSession, String ipAddr,
			String requestURI, String oldSessionId, String curSessionId) {
		// 密码和验证码不用
		User user = permissionService.findUserByUserName(userName);
		if (user == null) {
			resultMap.put(GlobalValue.LOGIN_FAILURE_MSG, "{userName:'用户名错误'}");
			return LoginType.loginFailure;
		}
		if (user.getState() != null) {
			if (Constants.UserState.WITHACTIVATION_STATE
					.equals(user.getState())) {
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
						"{userName:'该用户待激活'}");
				return LoginType.loginFailure;
			}
			if (Constants.UserState.DISABLE_STATE.equals(user.getState())) {
				resultMap.put(GlobalValue.LOGIN_FAILURE_MSG,
						"{userName:'该用户已停用'}");
				return LoginType.loginFailure;
			}
		}
		mockProccessLoginSuccess(resultMap, user, oldSession, userName, ipAddr,
				requestURI, oldSessionId, curSessionId);
		return LoginType.loginSuccess;
	}

	private void mockProccessLoginSuccess(HashMap<String, Object> resultMap,
			User user, Session oldSession, String userName, String ipAddr,
			String requestURI, String oldSessionId, String curSessionId) {
		// 先把要更换的用户在线的session都fire掉
		// fireLoginedUser(user.getUserName());
		mockGenerateLoginedSession(resultMap, user, oldSession, userName,
				ipAddr, requestURI, oldSessionId, curSessionId);
		// updateLoginUser(request, user);
		systemLogService.log(
				oldSession.getUserName() + "切换为" + user.getUserName() + "成功!",
				ModelType.LOGGIN, OperatorType.LOGIN);
		if (user.getFailureTimes() > 0) {
			user.setFailureTimes(0);
			permissionService.updateFailureTimesById(user.getId(),
					user.getFailureTimes());
		}
	}

	/**
	 * 有两种情况：有oldSid和没有oldSid； 如果有oldSid，证明是更换用户后再次更换用户，那么删除当前session(即当前更换的用户)，
	 * 然后再新增新更换的用户的session(这个用户已经fire过);
	 * 如果没有oldSid，证明是第一次更换用户，则将当前的sessionId存入oldSid，
	 * 然后将新增更换的用户的session(这个用户已经fire过);
	 */
	private void mockGenerateLoginedSession(HashMap<String, Object> resultMap,
			User user, Session oldSession, String userName, String ipAddr,
			String requestURI, String oldSid, String sessionId) {
		if (oldSid != null && !"".equals(oldSid.trim())) {
			sessionDao.deleteSessionBySessionId(sessionId);
		} else {
			oldSid = sessionId;
		}

		logger.debug("mockUserName:{} mockPassword:{}", user.getUserName(),
				user.getPassword());
		// 同时添加为要切换的用户添加session
		Session session = null;
		if (user.getUserName().equals(oldSession.getUserName())) {
			session = oldSession;
		} else {
			session = addSession(user.getId(), userName, user.getName(),
					user.getOrganization(), ipAddr, requestURI, true, ipAddr,
					user.getOrgInternalCode(), oldSession.getClientMode());
		}
		logger.debug("switchUser.getOrgInternalCode:",
				user.getOrgInternalCode());
		ThreadVariable.setSession(session);
		resultMap.put("newSession", session);
		resultMap.put("oldSessionId", oldSid);
	}

	public PageInfo<Session> getSessionsByOrgInternalCode(
			String orgInternalCode, int pageNum, int pageSize,
			String sortField, String order, Organization organization,
			int accountType) {
		if (organization != null && organization.getId() != null) {
			String currentOrgInternalCode = organizationService
					.getOrgInternalCodeById(organization.getId());
			if (currentOrgInternalCode != null
					&& !"".equals(currentOrgInternalCode)) {
				orgInternalCode = currentOrgInternalCode;
			}
		}
		PageInfo<Session> pageInfo = this.sessionDao
				.getSessionsByOrgInternalCode(orgInternalCode, pageNum,
						pageSize, sortField, order, accountType);
		pageInfo.setResult(creatCacheSessionList(pageInfo.getResult()));
		return pageInfo;
	}

	private List<Session> creatCacheSessionList(List<Session> list) {
		List<Session> sessionList = new ArrayList<Session>();
		for (int i = 0; i < list.size(); i++) {
			Session session = (Session) cacheService.get(CacheKeyGenerator
					.generateCacheKeyFromString(Session.class, list.get(i)
							.getSessionId()));
			if (session != null) {
				sessionList.add(session);
			} else {
				sessionList.add(list.get(i));
			}
		}
		return sessionList;
	}

	@Override
	public Session findSessionBySessionId(String sessionId) {
		return this.sessionDao.findSessionBySessionId(sessionId);
	}

	@Override
	public Session updateSessionAccessTimeBySessionId(String id,
			Date accessDate, String lastLoginUrl, String accessIp) {
		return this.sessionDao.updateSessionAccessTimeBySessionId(id,
				accessDate, lastLoginUrl, accessIp);
	}

	@Override
	public void validateUserSessionByUserName(String userName) {
		sessionDao.validateUserSessionByUserName(userName);
	}

	@Override
	public List<Session> findSessionByUserName(String userName) {
		return sessionDao.findSessionByUserName(userName);
	}

}