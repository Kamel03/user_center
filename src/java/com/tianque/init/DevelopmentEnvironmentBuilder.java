package com.tianque.init;

import net.rubyeye.xmemcached.XMemcachedClient;

import com.tianque.core.globalSetting.service.GlobalSettingService;
import com.tianque.init.impl.CreateSessionForTestInitialization;
import com.tianque.init.impl.DatabaseInitialization;
import com.tianque.init.impl.DestoryCacheConnection;
import com.tianque.init.impl.GlobalSettingInitialization;
import com.tianque.init.impl.OrganizationInitialization;
import com.tianque.init.impl.PermissionXmlInit;
import com.tianque.init.impl.SystemPropertiesInitialization;
import com.tianque.init.impl.UserRoleInitialization;
import com.tianque.init.util.ApplicationContextFactory;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.sysadmin.service.PropertyDomainService;

public class DevelopmentEnvironmentBuilder extends InitializationsRunner {

	public DevelopmentEnvironmentBuilder() throws Exception {
		ApplicationContextFactory.getInstance().getApplicationContext(
				ContextType.development);
		addDefaultInitializations();
	}

	/**
	 * 默认数据初始化
	 * 
	 * @throws Exception
	 */
	private void addDefaultInitializations() throws Exception {
		new DatabaseInitialization(ContextType.development).init();
		getXMemcachedClient().flushAll();
		addInitialization(new CreateSessionForTestInitialization());
		addInitialization(new SystemPropertiesInitialization(
				getPropertyDomainService(), getPropertyDictService()));
		addInitialization(new PermissionXmlInit(getPermissionService()));
		addInitialization(new PermissionPluginInitialization(
				getPermissionService(), ContextType.development));
		addInitialization(new OrganizationExcelInit(getPropertyDictService(),
				getOrganizationService(), false));
		/*
		 * addInitialization(new OrganizationInitialization(
		 * getOrganizationService(), getPropertyDictService()));
		 */
		addInitialization(new UserRoleInitialization(getPermissionService(),
				getOrganizationService(), getPropertyDictService()));
		addInitialization(new GlobalSettingInitialization(
				getGlobalSettingService()));
		addInitialization(new DestoryCacheConnection(getXMemcachedClient()));
	}

	public void builderTestEnv() throws Exception {
		executeInitialization();
		logger.info("开发环境初始化结束!");
		System.exit(0);
	}

	private XMemcachedClient getXMemcachedClient() {
		return (XMemcachedClient) ApplicationContextFactory.getInstance()
				.getBean(ContextType.development, "memcachedClient");
	}

	private GlobalSettingService getGlobalSettingService() {
		return (GlobalSettingService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.development, "globalSettingService");
	}

	private PermissionService getPermissionService() {
		return (PermissionService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.development, "permissionService");
	}

	private OrganizationService getOrganizationService() {
		return (OrganizationService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.development, "organizationService");
	}

	private PropertyDictService getPropertyDictService() {
		return (PropertyDictService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.development, "propertyDictService");
	}

	private PropertyDomainService getPropertyDomainService() {
		return (PropertyDomainService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.development, "propertyDomainService");
	}

}
