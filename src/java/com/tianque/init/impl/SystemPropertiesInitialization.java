package com.tianque.init.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.domain.property.OrganizationLevel;
import com.tianque.domain.property.OrganizationType;
import com.tianque.domain.property.PropertyTypes;
import com.tianque.domain.property.WorkBenchType;
import com.tianque.init.AbstractSystemPropertiesInitialization;
import com.tianque.init.Initialization;
import com.tianque.init.xml.XmlUtil;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.sysadmin.service.PropertyDomainService;

public class SystemPropertiesInitialization extends
		AbstractSystemPropertiesInitialization {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public SystemPropertiesInitialization(
			PropertyDomainService propertyDomainService,
			PropertyDictService propertyDictService) {
		super(propertyDomainService, propertyDictService);
	}

	@Override
	public void init() {
		initOrganizationType();
		initOrganizationLevel();
		initWorkBenchType();
		logger.info(PropertyTypes.WORKBENCH_TYPE + "字典初始化结束!");
		try {
			initPlugin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initPlugin() throws Exception, ClassNotFoundException,
			NoSuchMethodException, InstantiationException,
			IllegalAccessException, InvocationTargetException {
		String[] propertyInitClasses = XmlUtil
				.getSystemPropertiesInitClasses();
		for (String initClass : propertyInitClasses) {
			System.out.println(initClass);
			Class init = Class.forName(initClass);
			Constructor constructor = init
					.getDeclaredConstructor(new Class[] {
							PropertyDomainService.class,
							PropertyDictService.class });
			Initialization initialization = (Initialization) constructor
					.newInstance(new Object[] { propertyDomainService,
							propertyDictService });
			initialization.init();
		}
	}

	private void initWorkBenchType() {
		propertyDomain = addPropertyDomain(PropertyTypes.WORKBENCH_TYPE, false,
				null);
		addPropertyDict(WorkBenchType.SUPER_LEVEL_NAME,
				WorkBenchType.SUPER_LEVEL, 1);
		addPropertyDict(WorkBenchType.MIDDLE_LEVEL_NAME,
				WorkBenchType.MIDDLE_LEVEL, 2);
		addPropertyDict(WorkBenchType.LOWER_LEVEL_NAME,
				WorkBenchType.LOWER_LEVEL, 3);
	}

	private void initOrganizationType() {
		propertyDomain = addPropertyDomain(PropertyTypes.ORGANIZATION_TYPE,
				true, OrganizationType.getInternalProperties());
		addPropertyDict("行政区域", OrganizationType.ADMINISTRATIVE_REGION, 1);
		addPropertyDict("职能部门", OrganizationType.FUNCTIONAL_ORG, 2);
		addPropertyDict("其他", OrganizationType.OTHER, 3);
		addPropertyDict("党工委", OrganizationType.PARTYWORK, 4);
	}

	private void initOrganizationLevel() {
		propertyDomain = addPropertyDomain(PropertyTypes.ORGANIZATION_LEVEL,
				true, OrganizationLevel.getInternalProperties());
		addPropertyDict("片组片格", OrganizationLevel.GRID, 1);
		addPropertyDict("村（社区）", OrganizationLevel.VILLAGE, 2);
		addPropertyDict("乡镇（街道）", OrganizationLevel.TOWN, 3);
		addPropertyDict("县（区）", OrganizationLevel.DISTRICT, 4);
		addPropertyDict("市", OrganizationLevel.CITY, 5);
		addPropertyDict("省", OrganizationLevel.PROVINCE, 6);
		addPropertyDict("全国", OrganizationLevel.COUNTRY, 7);
	}

}