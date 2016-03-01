package com.tianque.core.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.domain.Organization;
import com.tianque.sysadmin.service.OrganizationService;

@Component
public class OrganizationHelper {
	@Autowired
	private OrganizationService organizationService;

	/**
	 * 根据orgId取orgName，从当前orgId开始取直到orgId的父org的id不存在
	 * 
	 * @param orgId
	 * @return
	 */
	public String getRelativeName(Long orgId) {
		String path;
		Organization org = organizationService.getSimpleOrgById(orgId);
		path = org.getOrgName();
		while (org.getParentOrg() != null && null != org.getParentOrg().getId()) {
			org = organizationService.getSimpleOrgById(org.getParentOrg()
					.getId());
			path = org.getOrgName() + "->" + path;
		}
		return path;
	}

}
