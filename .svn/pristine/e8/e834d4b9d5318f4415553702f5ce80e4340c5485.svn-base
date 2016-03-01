package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.domain.PropertyDomain;
import com.tianque.sysadmin.service.PropertyDomainService;
import com.tianque.userAuth.api.PropertyDomainDubboService;

@Component
public class PropertyDomainDubboServiceImpl implements
		PropertyDomainDubboService {

	@Autowired
	private PropertyDomainService propertyDomainService;

	@Override
	public PropertyDomain addPropertyDomain(PropertyDomain propertyDomain) {
		return propertyDomainService.addPropertyDomain(propertyDomain);
	}

	@Override
	public List<PropertyDomain> findPropertyDomain() {
		return propertyDomainService.findPropertyDomain();
	}

	@Override
	public PropertyDomain getPropertyDomainById(Long id) {
		return propertyDomainService.getPropertyDomainById(id);
	}

	@Override
	public PropertyDomain getPropertyDomainByDomainName(String domainName) {
		return propertyDomainService.getPropertyDomainByDomainName(domainName);
	}

	@Override
	public List<PropertyDomain> findPropertyDomainBydomainName(
			String domainName, int pageNum, int pageSize) {
		return propertyDomainService.findPropertyDomainBydomainName(domainName,
				pageNum, pageSize);
	}

}
