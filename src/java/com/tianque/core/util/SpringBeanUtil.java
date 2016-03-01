package com.tianque.core.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringBeanUtil.applicationContext = applicationContext;
	}

	/**
	 * 通过名称在spring容器中获取对象
	 * 
	 * @param beanName
	 * @return
	 */
	public static Object getBeanFromSpringByBeanName(String beanName) {
		return applicationContext.getBean(beanName);
	}

	/**
	 * 通过名称在spring容器中获取对象,给插件用的方法
	 * 
	 * @param beanName
	 * @return
	 */
	public static Object getBeanFromSpringByBeanNameForFacade(String beanName) {
		return applicationContext.getBean(beanName);
	}

}
