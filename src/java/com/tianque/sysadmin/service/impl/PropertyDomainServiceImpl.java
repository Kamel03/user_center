package com.tianque.sysadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.base.AbstractBaseService;
import com.tianque.domain.PropertyDomain;
import com.tianque.sysadmin.dao.PropertyDomainDao;
import com.tianque.sysadmin.service.PropertyDomainService;

@Transactional
@Service("propertyDomainService")
public class PropertyDomainServiceImpl extends AbstractBaseService implements
		PropertyDomainService {

	@Autowired
	private PropertyDomainDao propertyDomainDao;

	@Override
	public PropertyDomain addPropertyDomain(PropertyDomain propertyDomain) {
		return this.propertyDomainDao.addPropertyDomain(propertyDomain);
	}

	@Override
	public List<PropertyDomain> findPropertyDomain() {
		return this.propertyDomainDao.findPropertyDomain();
	}

	@Override
	public PropertyDomain getPropertyDomainById(Long id) {
		return this.propertyDomainDao.getPropertyDomainById(id);
	}

	@Override
	public PropertyDomain getPropertyDomainByDomainName(String domainName) {
		return propertyDomainDao.getPropertyDomainByDomainName(domainName);
	}

	@Override
	public List<PropertyDomain> findPropertyDomainBydomainName(
			String domainName, int pageNum, int pageSize) {
		return propertyDomainDao.findPropertyDomainBydomainName(domainName,
				pageNum, pageSize);
	}
}
