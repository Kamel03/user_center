package com.tianque.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tianque.core.cache.service.CacheService;
import com.tianque.util.FormTokenHelper;

/**
 * @ClassName: TokenTag
 * @Description: 表单提交令牌标签
 * @author yumeng
 * @date 2013-5-1 下午01:06:22
 */
public class TokenTag extends TagSupport {

	private static final long serialVersionUID = -3337359247042123970L;

	private static Logger logger = LoggerFactory.getLogger(TokenTag.class);

	/** 判断该标签是否用于ajax请求 默认是在页面生成隐藏域 */
	private boolean ajax = false;

	public int doStartTag() throws JspException {
		String token = FormTokenHelper.generateGUID();
		CacheService cacheService = getCacheService();
		cacheService.set(token, token);
		toHTML(token);
		return Tag.EVAL_PAGE;
	}

	private CacheService getCacheService() {
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(this.pageContext.getServletContext());
		CacheService cacheService = (CacheService) applicationContext.getBean("cacheService");
		return cacheService;
	}

	private void toHTML(String token) {
		JspWriter out = this.pageContext.getOut();
		StringBuffer sb = new StringBuffer();
		if (ajax) {
			sb.append(token);
		} else {
			sb.append("<input type='hidden' name='" + FormTokenHelper.TOKEN_NAME + "' value='")
					.append(token).append("'/>");
		}
		try {
			out.print(sb.toString());
		} catch (Exception e) {
			logger.error("异常信息", e);
		}

	}

	public boolean getAjax() {
		return ajax;
	}

	public void setAjax(boolean ajax) {
		this.ajax = ajax;
	}

}
