package com.tianque.core.util;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.exception.base.SystemUtilException;

public class JdbcProperties {
	private static Logger logger = LoggerFactory
			.getLogger(JdbcProperties.class);
	private static Properties properties = null;
	static {
		properties = new Properties();
		try {
			properties.load(JdbcProperties.class.getClassLoader()
					.getResourceAsStream("jdbc.properties"));
		} catch (IOException e) {
			throw new SystemUtilException("加载jdbc.properties出错！", e);
		}
	}

	public static String url = properties.getProperty(GlobalValue.environment
			+ ".url");
	public static String username = properties
			.getProperty(GlobalValue.environment + ".username");
	public static String password = properties
			.getProperty(GlobalValue.environment + ".password");
	public static String urlBak = properties
			.getProperty(GlobalValue.environment + ".bak.url");
	public static String usernameBak = properties
			.getProperty(GlobalValue.environment + ".bak.username");
	public static String passwordBak = properties
			.getProperty(GlobalValue.environment + ".bak.password");
}
