package com.tianque.domain;

import com.tianque.core.util.BaseDomainIdEncryptUtil;

/** 其他联系人 */
public class MyContacter extends SingleContacter {

	private static final long serialVersionUID = -1008952658246620093L;
	/** 所属用户 */
	private User owner;

	public MyContacter() {
		this.setBelongClass(MYCONTACTER);
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public String getMobile() {
		return this.getMobileNumber();
	}

	public String getEncryptId() {
		return BaseDomainIdEncryptUtil.encryptDomainId(super.getId(), null,
				null);
	}

}
