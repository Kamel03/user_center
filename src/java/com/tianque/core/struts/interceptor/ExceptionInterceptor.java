package com.tianque.core.struts.interceptor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.tianque.exception.domain.Result;
import com.tianque.exception.facade.ExceptionHandlerFacade;

/**
 * 异常拦截器，拦截系统中抛出的所有异常或错误，进行分发处理
 * 
 * @author yulei
 * @date 2014-9-2上午10:49:36
 * @version 1.0.0
 * 
 */
public class ExceptionInterceptor extends AbstractInterceptor {

	private static Logger logger = LoggerFactory
			.getLogger(ExceptionInterceptor.class);

	@Override
	public String intercept(ActionInvocation ai) {
		try {
			String result = ai.invoke();
			return result;
		} catch (Exception e) {
			Result result = ExceptionHandlerFacade.handleException(e);
			return doFilter(ai, result);
		} catch (Throwable e) {
			Result result = ExceptionHandlerFacade
					.handleThrowable(e.getCause());
			return doFilter(ai, result);
		}
	}

	// 如果request中包含有附件，则需要将response的contentType重新设值
	private String doFilter(ActionInvocation ai, Result result) {
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setHeader("Error", "Error");
			String ae = ServletActionContext.getRequest().getHeader(
					"accept-encoding");
			if (ae != null && ae.indexOf("gzip") >= 0
					&& !response.containsHeader("Content-Encoding")) {
				response.setContentType("text/html;charset=UTF-8");
			} else {
				if ("true".equals(ServletActionContext.getRequest()
						.getParameter("tqmobile"))) {
					response.setContentType("application/json;charset=UTF-8");
				}
				ai.getInvocationContext().put("expResult", result);
			}
			PrintWriter pw = response.getWriter();
			pw.println(new Gson().toJson(result));
			pw.close();
		} catch (IOException ioException) {
			logger.error("异常拦截器拦截异常失败", ioException);
		}
		return null;
	}
}
