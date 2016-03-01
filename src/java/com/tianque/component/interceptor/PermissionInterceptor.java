package com.tianque.component.interceptor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.tianque.component.SessionManager;
import com.tianque.core.util.BaseDomainIdEncryptUtil;
import com.tianque.core.util.CookieUtil;
import com.tianque.core.util.GlobalValue;
import com.tianque.core.util.StringUtil;

public class PermissionInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		String action = ai.getProxy().getActionName();
		Class c = ai.getAction().getClass();
		Method method = c.getDeclaredMethod(ai.getProxy().getMethod());
		String className = c.getName();
		if (-1 != c.getName().indexOf('$')) {
			className = c.getName().substring(0, c.getName().indexOf('$'));
		}
		Map<String, Object> parameters = ai.getInvocationContext()
				.getParameters();
		List<String> orgCodeValue = decodeParameterValues(parameters);
		ai.getInvocationContext().setParameters(parameters);
		HttpServletRequest request = (HttpServletRequest) ai
				.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
		String sessionId = request.getParameter(GlobalValue.LOGIN_SESSION_ID);
		Cookie[] cookies = request.getCookies();
		if (sessionId == null && cookies == null) {
			return GlobalValue.NOT_HAVE_PERMISSION_RESULT;
		}
		if (cookies != null) {
			sessionId = CookieUtil.getSesssionIdFromCookies(request);
		}
		//		if (sessionManager.havePermission(Class.forName(className)
		//				.getMethod(method.getName()), action, sessionId, orgCodeValue)) {
		return ai.invoke();
		//		} else {
		//			return GlobalValue.NOT_HAVE_PERMISSION_RESULT;
		//		}
	}

	private List<String> decodeParameterValues(Map<String, Object> parameters) {
		if (parameters == null) {
			return null;
		}
		List<String> orgCodeValues = new ArrayList<String>();
		Set entrySet = parameters.entrySet();
		String[] strings = null;
		String[] values = null;
		int strLength = 0;
		for (Iterator it = entrySet.iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			if (value instanceof String[]) {
				values = (String[]) value;// 类型转换
				strLength = values.length;
				strings = new String[strLength];
				for (int i = 0; i < strLength; i++) {
					strings[i] = decodeIdValues(values[i], orgCodeValues);
				}
				parameters.put((String) key, strings);
			}
		}
		return orgCodeValues;
	}

	private String decodeIdValues(String arrayValue, List<String> orgCodeValues) {
		if (!StringUtil.isStringAvaliable(arrayValue)) {
			return arrayValue;
		}
		if (arrayValue
				.indexOf(BaseDomainIdEncryptUtil.DISCERN_ENCRYPT_CONSTANT) != -1) {
			Map decodeDomainId = BaseDomainIdEncryptUtil
					.decodeDomainId(arrayValue);
			if (decodeDomainId == null) {
				return arrayValue;
			}
			Object domainId = decodeDomainId
					.get(BaseDomainIdEncryptUtil.DOMIAN_ID_CONSTANT);
			if (domainId != null) {
				arrayValue = String.valueOf(domainId);
			}
			Object orgCode = decodeDomainId
					.get(BaseDomainIdEncryptUtil.ORG_CODE_CONSTANT);
			if (orgCode != null && !"".equals(orgCode)
					&& !"null".equals(orgCode)) {
				String[] orgCodes = String.valueOf(orgCode).split(",");
				orgCodeValues.addAll(Arrays.asList(orgCodes));
			}
		}
		return arrayValue;
	}

	@Autowired
	private SessionManager sessionManager;
}
