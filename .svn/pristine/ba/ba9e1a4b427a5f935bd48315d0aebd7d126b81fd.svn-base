package com.tianque.web.tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tianque.core.util.ThreadVariable;
import com.tianque.domain.Permission;
import com.tianque.domain.Session;
import com.tianque.sysadmin.service.PermissionService;

public class JugePermissionTag extends TagSupport {
	private static Logger logger = LoggerFactory
			.getLogger(JugePermissionTag.class);
	private String ename;

	private boolean hasPermission;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int doStartTag() throws JspException {

		if (ename == null || ename.length() == 0) {
			return Tag.SKIP_BODY;
		}

		Session session = (Session) ThreadVariable.getSession();
		if (session == null || session.getUserId() == null) {
			return Tag.SKIP_BODY;
		}

		String[] enames = ename.split(",");

		try {
			boolean hasSkipBody = true;
			for (int i = 0; i < enames.length; i++) {
				PermissionService permissionService = (PermissionService) WebApplicationContextUtils
						.getWebApplicationContext(
								pageContext.getServletContext()).getBean(
								"permissionService");
				Permission permission = permissionService
						.findPermissionByEname(enames[i]);
				if (null != permission && null != permission.getEname()) {
					pageContext.getRequest().setAttribute("name",
							permission.getCname());
					hasSkipBody = false;
					break;
				}
			}
			if (hasSkipBody) {
				return Tag.SKIP_BODY;
			}
		} catch (Exception e) {
			logger.error("JugePermissionTag报错", e);
		}

		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getUser().isAdmin()) {
			return Tag.EVAL_BODY_INCLUDE;
		}

		if (ThreadVariable.getPermissionEnameList() != null) {
			if (isHasPermissionFromThreadLocal()) {
				return Tag.EVAL_BODY_INCLUDE;
			} else {
				return Tag.SKIP_BODY;
			}
		}

		boolean isEvalBodyInclude = false;
		PermissionService permissionService = getPermissionService();
		for (String name : ename.split(",")) {
			if (permissionService
					.isUserHasPermission(session.getUserId(), name)) {
				isEvalBodyInclude = true;
				break;
			}
		}
		if (hasPermission) {
			isEvalBodyInclude = !isEvalBodyInclude;
		}
		if (isEvalBodyInclude) {
			return Tag.EVAL_BODY_INCLUDE;
		}
		return Tag.SKIP_BODY;
	}

	private boolean isHasPermissionFromThreadLocal() {
		String[] enames = ename.split(",");
		List<String> enameList = ThreadVariable.getPermissionEnameList();
		boolean flag = false;
		for (int i = 0; i < enames.length; i++) {
			if (enameList.contains(enames[i])) {
				flag = true;
				break;
			}
		}
		if (hasPermission) {
			flag = !flag;
		}
		return flag;
	}

	private PermissionService getPermissionService() {
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(this.pageContext.getServletContext());
		PermissionService permissionService = (PermissionService) applicationContext
				.getBean("permissionService");
		return permissionService;
	}

	@Override
	public int doEndTag() throws JspException {
		return Tag.EVAL_PAGE;
	}

	public boolean isHasPermission() {
		return hasPermission;
	}

	public void setHasPermission(boolean hasPermission) {
		this.hasPermission = hasPermission;
	}
}
