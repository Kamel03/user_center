package com.tianque.core.web.tag;

import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tianque.core.globalSetting.service.GlobalSettingService;
import com.tianque.exception.base.SystemUtilException;

public class GlobalSettingTag extends TagSupport {
	private String value;
	private String key;
	private String condition;

	public int doStartTag() {
		String value = getGlobalSettingService().getGlobalValue(
				getValueByExpression(key));
		if (value == null
				|| (!getValueByExpression(this.value).equals(value) && (condition == null || condition
						.equals("eq")))) {
			return Tag.SKIP_BODY;
		}
		if (value == null
				|| (getValueByExpression(this.value).equals(value) && "notEq"
						.equals(condition))) {
			return Tag.SKIP_BODY;
		}
		return Tag.EVAL_PAGE;
	}

	private GlobalSettingService getGlobalSettingService() {
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(this.pageContext.getServletContext());
		return (GlobalSettingService) applicationContext
				.getBean("globalSettingService");
	}

	private String getValueByExpression(String name) {
		String result = name;
		try {
			OgnlContext context = new OgnlContext();
			Object parseExpression = Ognl.parseExpression(name);
			Object value = Ognl.getValue(parseExpression, context);
			if (value != null)
				result = value.toString();
		} catch (OgnlException e) {
			throw new SystemUtilException("全局变量标签异常", e);
		}
		return result;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

}
