package com.tianque.core.base;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.core.util.ThreadVariable;
import com.tianque.exception.base.ServiceValidationException;

abstract public class AbstractBaseService {
	public final static Logger logger = LoggerFactory
			.getLogger(AbstractBaseService.class);

	public Object getCurrentUser() {
		return ThreadVariable.getSession();
	}

	public <T extends Object> T dealException(String className,
			String methodName, String msg, Throwable e) {
		throw new ServiceValidationException(MessageFormat.format(
				"类{0}的{1}方法出现异常，原因：", className, methodName), msg, e);
	}

	public <T extends Object> T dealException(Object className,
			String methodName, String msg, Throwable e) {
		throw new ServiceValidationException(MessageFormat.format(
				"类{0}的{1}方法出现异常，原因：", className.getClass().getSimpleName(),
				methodName), msg, e);
	}

}
