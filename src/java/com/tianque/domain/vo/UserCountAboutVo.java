package com.tianque.domain.vo;

import java.util.Date;
import java.util.List;

import com.tianque.core.vo.BaseVo;
import com.tianque.domain.Organization;
import com.tianque.domain.Role;

@SuppressWarnings("serial")
public class UserCountAboutVo extends BaseVo {

	private Organization organization;
	private Long userId;
	private String userName;
	private String name;
	private Date lastLoginTime;
	private Date createDate;
	private List<Role> roles;
	private Long pcusable;
	private Long mobileusable;
	private Date activationTime;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Long getPcusable() {
		return pcusable;
	}

	public void setPcusable(Long pcusable) {
		this.pcusable = pcusable;
	}

	public Long getMobileusable() {
		return mobileusable;
	}

	public void setMobileusable(Long mobileusable) {
		this.mobileusable = mobileusable;
	}

	public Date getActivationTime() {
		return activationTime;
	}

	public void setActivationTime(Date activationTime) {
		this.activationTime = activationTime;
	}
	
	
}
