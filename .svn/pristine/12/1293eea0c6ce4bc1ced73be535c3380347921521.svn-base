package com.tianque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
import com.tianque.core.util.JdbcProperties;
import com.tianque.core.util.SpringBeanUtil;

/**
 * 
 * @作者:龙振东
 * @功能:切换数据源,只针对druid连接池
 * @时间:2015-3-27 下午05:11:47
 * @邮箱:longzhendong@hztianque.com
 */
public class DataSourceHeartbeatMonitor extends Thread implements
		InitializingBean {
	private static Logger logger = LoggerFactory
			.getLogger(DataSourceHeartbeatMonitor.class);
	private String currentUrl;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static long TICTTIME = 30000;

	public DataSourceHeartbeatMonitor() {
		setDaemon(true);
	}

	@Override
	public void run() {
		DruidDataSource dataSource = (DruidDataSource) SpringBeanUtil
				.getBeanFromSpringByBeanName("zzGrid_main_ds");
		while (true) {
			try {
				Thread.currentThread().sleep(TICTTIME);
			} catch (Exception e) {
			}
			switchDataSource(dataSource);
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.start();
	}

	private void switchDataSource(DruidDataSource dataSource) {
		try {
			currentUrl = dataSource.getUrl();
			jdbcTemplate.execute("select * from dual");
		} catch (Exception e) {
			try {
				dataSource.restart();
				if (JdbcProperties.url.equalsIgnoreCase(currentUrl)) {
					dataSource.setUrl(JdbcProperties.urlBak);
					dataSource.setUsername(JdbcProperties.usernameBak);
					dataSource.setPassword(JdbcProperties.passwordBak);
				} else {
					dataSource.setUrl(JdbcProperties.url);
					dataSource.setUsername(JdbcProperties.username);
					dataSource.setPassword(JdbcProperties.password);
				}
				dataSource.init();
				logger.error("数据库已经切换至" + dataSource.getUrl());
			} catch (Exception exp) {
				logger.error("切换数据源异常：", exp);
			}
		}
	}
}
