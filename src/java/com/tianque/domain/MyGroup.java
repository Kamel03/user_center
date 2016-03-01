package com.tianque.domain;

import java.util.List;

/** 我的群组 */
public class MyGroup extends MultipleContacter {

	private static final long serialVersionUID = -1016248851263488112L;
	/** 群组所属用户 */
	private User owner;
	/** 群组描述 */
	private String remark;
	/** 联系人手机号码 */
	private String mobileNumber;
	/** 拥有的联系人 */
	List<SingleContacter> singleContacters;

	@Override
	public String getMobile() {
		// 群组没有联系手机
		return null;
	}

	public MyGroup() {
		this.setBelongClass(MYGROUP);
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<SingleContacter> getSingleContacters() {
		return singleContacters;
	}

	public void setSingleContacters(List<SingleContacter> singleContacters) {
		this.singleContacters = singleContacters;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
