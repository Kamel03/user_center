package com.tianque.domain.vo;

import com.tianque.domain.MyContacter;
import com.tianque.domain.Organization;
import com.tianque.domain.SingleContacter;
import com.tianque.domain.User;
import com.tianque.domain.WorkContacter;

public class ContacterVo extends SingleContacter {

	private static final long serialVersionUID = -2901217269080757084L;

	private Organization organization;

	private User owner;

	private User fromUser;

	private Integer minContacterNums;// 最小成员数量
	private Integer maxContacterNums;// 最大成员数量

	private Long currentUserOrgLeavel;// 当前用户的组织机构等级

	@Override
	public String getMobile() {
		return this.getMobileNumber();
	}

	public ContacterVo(WorkContacter workContacter) {
		this.setId(workContacter.getId());
		this.setName(workContacter.getName());
		this.setMobileNumber(workContacter.getMobileNumber());
		this.organization = workContacter.getFromUser().getOrganization();
		this.fromUser = workContacter.getFromUser();
		this.setBelongClass(workContacter.getBelongClass());
	}

	public ContacterVo(MyContacter myContacter) {
		this.setId(myContacter.getId());
		this.setName(myContacter.getName());
		this.setMobileNumber(myContacter.getMobileNumber());
		this.setOwner(myContacter.getOwner());
		this.setBelongClass(myContacter.getBelongClass());
	}

	public ContacterVo() {

	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public Integer getMinContacterNums() {
		return minContacterNums;
	}

	public void setMinContacterNums(Integer minContacterNums) {
		this.minContacterNums = minContacterNums;
	}

	public Integer getMaxContacterNums() {
		return maxContacterNums;
	}

	public void setMaxContacterNums(Integer maxContacterNums) {
		this.maxContacterNums = maxContacterNums;
	}

	public Long getCurrentUserOrgLeavel() {
		return currentUserOrgLeavel;
	}

	public void setCurrentUserOrgLeavel(Long currentUserOrgLeavel) {
		this.currentUserOrgLeavel = currentUserOrgLeavel;
	}

}
