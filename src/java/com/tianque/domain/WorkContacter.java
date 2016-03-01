package com.tianque.domain;

/** 平台联系人 /站内联系人 */
public class WorkContacter extends SingleContacter {

	private static final long serialVersionUID = -6807911044883088568L;
	/** 关联用户 */
	private User fromUser;

	public WorkContacter() {
		this.setBelongClass(WORKCONTACTER);
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	@Override
	public String getMobile() {
		return this.getMobileNumber();
	}
	
	

}
