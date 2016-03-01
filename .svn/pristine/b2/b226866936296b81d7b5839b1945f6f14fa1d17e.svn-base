/**
 * tianque-com.tianque.component.web.filter-IsLoginValidateInterceptor.java Created on Apr 9, 2009
 * Copyright (c) 2010 by 杭州天阙科技有限公司
 */
package com.tianque.web.filter;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tianque.component.SessionManager;
import com.tianque.controller.LoginValidateType;
import com.tianque.core.datatransfer.ExcelImportHelper;
import com.tianque.core.util.CookieUtil;
import com.tianque.core.util.GlobalValue;
import com.tianque.core.util.ThreadVariable;
import com.tianque.mobile.vo.ErrorResponse;
import com.tianque.mobile.vo.ErrorResponse.SessionError;

/**
 * Title: ***<br>
 * 
 * @author <a href=mailto:nifeng@hztianque.com>倪峰</a><br>
 * 
 * @description ***<br/>
 * 
 * @version 1.0
 */
public class LoginValidateFilter implements Filter {

	private FilterConfig filterConfig;
	private SessionManager sessionManager;
	private static Logger logger = LoggerFactory
			.getLogger(LoginValidateFilter.class);

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		ExcelImportHelper.isImport.set(false);
		Long startTime = System.currentTimeMillis();

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String url = request.getRequestURI();
		if (url.endsWith(".jpg") || url.endsWith(".gif")
				|| url.endsWith(".css") || url.endsWith(".js")
				|| url.endsWith(".png") || url.endsWith(".bmp")
				|| url.endsWith(".ico") || url.endsWith("1.txt")
				|| url.indexOf("/druid") > -1) {
			chain.doFilter(servletRequest, servletResponse);
			ThreadVariable.clearThreadVariable();
			return;
		}
		if (isNotLoginValidate(url, request)) {
			chain.doFilter(servletRequest, servletResponse);
			ThreadVariable.clearThreadVariable();
			return;
		}
		String sessionId = request.getParameter(GlobalValue.LOGIN_SESSION_ID);
		if (sessionId == null || "".equals(sessionId.trim())) {
			sessionId = CookieUtil.getSesssionIdFromCookies(request);
		}
		HashMap<String, Object> resultMap = getSessionManager().isLogin(
				sessionId, request.getRequestURI(),
				CookieUtil.getIpAddr(request));

		LoginValidateType loginValidateType = (LoginValidateType) resultMap
				.get(GlobalValue.LOGIN_FAILURE_MSG + "_TYPE");

		if (LoginValidateType.isLogined.equals(loginValidateType)) {
			CookieUtil.putSessionIdInCookies(request, response,
					GlobalValue.LOGIN_SESSION_ID, sessionId);
		}
		if (!LoginValidateType.isLogined.equals(loginValidateType)) {
			String errorMessage;
			if (LoginValidateType.sessionTimeOut.equals(loginValidateType)) {
				errorMessage = "因长时间不使用系统，请重新登录!";
			} else if (LoginValidateType.noLogin.equals(loginValidateType)) {
				errorMessage = "账号已经登出!";
			} else {
				errorMessage = "账号在异地登录，请确认密码安全，建议修改。";
			}
			if ("true".equals(request.getParameter("tqmobile"))) {
				response.addHeader(ErrorResponse.KEY_HTTP_HEAD,
						ErrorResponse.VALUE_ERROR_CAUGHT);
				response.setContentType("application/json");
				response.getWriter().print(
						"{errorCode:'" + SessionError.LOGIN_ELSEWHERE
								+ "',errorMessage:''}");
				return;
			}
			response.setContentType("text/html");
			response.getWriter().print(
					"<script>document.location.href='/login.jsp?errorMessage="
							+ errorMessage + "'</script>");
			ThreadVariable.clearThreadVariable();
			return;
		} else {
			chain.doFilter(servletRequest, servletResponse);
			ThreadVariable.clearThreadVariable();
			long processTime = System.currentTimeMillis() - startTime;
			if (processTime > 3000) {
				logger.error("花了 {} 时间访问 {}", new Object[] { processTime, url });
			}
			return;
		}

	}

	private boolean isNotLoginValidate(String url, HttpServletRequest request) {
		for (String path : GlobalValue.IS_NOT_LOGIN_VALIDATE_PATH) {
			if (url.equals(request.getContextPath() + path)
					|| (url.endsWith("/login.jsp") && !url
							.endsWith("/index.jsp"))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 在别的地方被登录
	 * 
	 * @param request
	 * @return
	 */
	// private boolean hasFired(HttpServletRequest request) {
	// String sessionId = CookieUtil.getSesssionIdFromCookies(request);
	// Session session = getSessionManager().findSessionBySessionId(sessionId);
	// if (session != null)
	// return !session.isLogin()&&session.getUserName()!=null;
	// return false;
	// }

	@Override
	public void destroy() {
		filterConfig = null;
		sessionManager = null;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	private SessionManager getSessionManager() {
		if (this.sessionManager == null) {
			WebApplicationContext applicationContext = WebApplicationContextUtils
					.getWebApplicationContext(filterConfig.getServletContext());
			AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext
					.getAutowireCapableBeanFactory();
			this.sessionManager = (SessionManager) autowireCapableBeanFactory
					.getBean("sessionManager");
		}
		return sessionManager;
	}
}
