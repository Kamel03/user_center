package com.tianque.domain;

import com.tianque.core.base.BaseDomain;

/**
 * @author 张静静
 * @data 2014-10-16 下午01:57:30
 * 
 */
public class UserSign extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private Long userId;
	private Organization org;
	private PropertyDict orgLevel;
	private PropertyDict orgType;
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public PropertyDict getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(PropertyDict orgLevel) {
		this.orgLevel = orgLevel;
	}

	public PropertyDict getOrgType() {
		return orgType;
	}

	public void setOrgType(PropertyDict orgType) {
		this.orgType = orgType;
	}

}
