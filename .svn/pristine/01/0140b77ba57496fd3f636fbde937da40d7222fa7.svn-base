package com.tianque.core.web.tag;

import java.io.IOException;

import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tianque.core.globalSetting.service.GlobalSettingService;
import com.tianque.exception.base.SystemUtilException;

public class GetGlobalSettingValueTag extends TagSupport {

	private GlobalSettingService globalSettingService;

	private String key;

	public int doStartTag() {
		try {
			if (null == globalSettingService)
				this.pageContext.getOut().print(
						getGlobalSettingService().getGlobalValue(
								getValueByExpression(key)));
		} catch (IOException e) {
			throw new SystemUtilException("获取全局变量标签异常", e);
		}
		return Tag.EVAL_PAGE;
	}

	private GlobalSettingService getGlobalSettingService() {
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(this.pageContext.getServletContext());

		GlobalSettingService globalSettingService = (GlobalSettingService) applicationContext
				.getBean("globalSettingService");
		return globalSettingService;
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
			throw new SystemUtilException("获取全局变量标签异常", e);
		}
		return result;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
