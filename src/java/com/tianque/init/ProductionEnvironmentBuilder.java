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

public class ProductionEnvironmentBuilder extends InitializationsRunner {

	public ProductionEnvironmentBuilder() throws Exception {
		ApplicationContextFactory.getInstance().getApplicationContext(
				ContextType.production);
		addDefaultInitializations();
	}

	/**
	 * 默认数据初始化
	 * 
	 * @throws Exception
	 */
	private void addDefaultInitializations() throws Exception {
		new DatabaseInitialization(ContextType.production).init();
		getXMemcachedClient().flushAll();
		addInitialization(new CreateSessionForTestInitialization());
		addInitialization(new SystemPropertiesInitialization(
				getPropertyDomainService(), getPropertyDictService()));
		addInitialization(new PermissionXmlInit(getPermissionService()));
		addInitialization(new OrganizationInitialization(
				getOrganizationService(), getPropertyDictService()));
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
				.getBean(ContextType.production, "memcachedClient");
	}

	private GlobalSettingService getGlobalSettingService() {
		return (GlobalSettingService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.production, "globalSettingService");
	}

	private PermissionService getPermissionService() {
		return (PermissionService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.production, "permissionService");
	}

	private OrganizationService getOrganizationService() {
		return (OrganizationService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.production, "organizationService");
	}

	private PropertyDictService getPropertyDictService() {
		return (PropertyDictService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.production, "propertyDictService");
	}

	private PropertyDomainService getPropertyDomainService() {
		return (PropertyDomainService) ApplicationContextFactory.getInstance()
				.getBean(ContextType.production, "propertyDomainService");
	}

}
