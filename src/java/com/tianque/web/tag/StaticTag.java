package com.tianque.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts2.views.jsp.TagUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态访问自定义标签，通过OGNL表达式访问静态方法和值
 * 
 * <pop:static value="@com.tianque.controller.WorkContactController@key"/>
 * <pop:static value="@com.tianque.core.util.ThreadVariable@getUser().admin"/>
 * 
 * @author 曾利民<br>
 *         email:zenglimin@hztianque.com <br>
 *         date:2014年8月14日
 */
public class StaticTag extends TagSupport {

	private final static Logger logger = LoggerFactory
			.getLogger(StaticTag.class);

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int doStartTag() throws JspException {
		String temp = (String) TagUtils.getStack(pageContext).findValue(value,
				String.class);
		try {
			JspWriter out = this.pageContext.getOut();
			out.print(temp);
		} catch (IOException e) {
			logger.error("", e);
		}
		return Tag.EVAL_PAGE;
	}
}
