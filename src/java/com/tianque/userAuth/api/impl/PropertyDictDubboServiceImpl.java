package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.domain.PropertyDict;
import com.tianque.mobile.vo.MobilePropertyDict;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.sysadmin.service.impl.ReferType;
import com.tianque.userAuth.api.PropertyDictDubboService;

@Component
public class PropertyDictDubboServiceImpl implements PropertyDictDubboService {

	@Autowired
	private PropertyDictService propertyDictService;

	@Override
	public List<PropertyDict> findPropertyDictByIds(Long[] id) {
		return propertyDictService.findPropertyDictByIds(id);
	}

	@Override
	public PropertyDict addPropertyDict(PropertyDict propertyDict) {
		return propertyDictService.addPropertyDict(propertyDict);
	}

	@Override
	public PropertyDict updatePropertyDict(PropertyDict propertyDict) {
		return propertyDictService.updatePropertyDict(propertyDict);
	}

	@Override
	public List<PropertyDict> findPropertyDictByPropertyDomainId(Long domainId) {
		return propertyDictService.findPropertyDictByPropertyDomainId(domainId);
	}

	@Override
	public List<PropertyDict> findPropertyDictByPropertyDomainId(Long domainId,
			String sidx, String sord) {
		return propertyDictService.findPropertyDictByPropertyDomainId(domainId);
	}

	@Override
	public PropertyDict getPropertyDictByDomainNameAndDictId(String domainName,
			Long id) {
		return propertyDictService.getPropertyDictByDomainNameAndDictId(
				domainName, id);
	}

	@Override
	public void movePropertyDict(Long id, Long propertyDomainId,
			ReferType position, Long referPropertyDictId) {
		propertyDictService.movePropertyDict(id, propertyDomainId, position,
				referPropertyDictId);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainName(String domainName) {
		return propertyDictService.findPropertyDictByDomainName(domainName);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDisplayNameAndDomainPropertyId(
			Long propertyDomainId, String displayName, Long id) {
		return propertyDictService
				.findPropertyDictByDisplayNameAndDomainPropertyId(
						propertyDomainId, displayName, id);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndInternalId(
			String domainName, Integer internalId) {
		return propertyDictService.findPropertyDictByDomainNameAndInternalId(
				domainName, internalId);
	}

	@Override
	public int deletePropertyDictById(Long id) {
		return propertyDictService.deletePropertyDictById(id);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndInternalIds(
			String domainName, int[] internalIds) {
		return propertyDictService.findPropertyDictByDomainNameAndInternalIds(
				domainName, internalIds);
	}

	@Override
	public PropertyDict findPropertyDictByDomainNameAndDictDisplayName(
			String propertyDomainName, String dictDisplayName) {
		return propertyDictService
				.findPropertyDictByDomainNameAndDictDisplayName(
						propertyDomainName, dictDisplayName);
	}

	@Override
	public PropertyDict getPropertyDictById(Long id) {
		return propertyDictService.getPropertyDictById(id);
	}

	@Override
	public PropertyDict getPropertyDictByOrgId(Long id) {
		return propertyDictService.getPropertyDictByOrgId(id);
	}

	@Override
	public List<MobilePropertyDict> findMobilePropertyDictByDomainName(
			String domainName) {
		return propertyDictService
				.findMobilePropertyDictByDomainName(domainName);
	}

	@Override
	public PropertyDict getPropertyDictByDomainName(String useInLevel) {
		return propertyDictService.getPropertyDictByDomainName(useInLevel);
	}

	@Override
	public PropertyDict getPropertyDictName(Long gender) {
		return propertyDictService.getPropertyDictName(gender);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndDisplayseqs(String domainName, int[] displayseqs) {
		return propertyDictService.findPropertyDictByDomainNameAndDisplayseqs(domainName, displayseqs);
	}

	@Override
	public List<PropertyDict> getPropertyDictByPinYinAndDomainid(String pinyin,
			Long domainId) {
		return propertyDictService.getPropertyDictByPinYinAndDomainid(pinyin, domainId);
	}

	@Override
	public List<PropertyDict> getPropertyDictByDomainidAndInternalid(
			Long domainId, Integer internalid) {
		return propertyDictService.getPropertyDictByDomainidAndInternalid(domainId, internalid);
	}

	@Override
	public List<PropertyDict> findFullPropertyDictByDomainId(Long dictTypeId,
			Long dictTypeSubId) {
		return propertyDictService.findFullPropertyDictByDomainId(dictTypeId, dictTypeSubId);
	}
}
