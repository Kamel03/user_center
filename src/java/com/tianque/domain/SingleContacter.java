package com.tianque.domain;

public abstract class SingleContacter extends Contacter {

	private static final long serialVersionUID = -7533365187302213513L;
	/** 联系手机 */
	private String mobileNumber;
	/** 备注 */
	private String remark;

//	/** 用户名(视频会议用到) */
//	private String userName;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}

	@Override
	public abstract String getMobile();

}
