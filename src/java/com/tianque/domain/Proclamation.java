package com.tianque.domain;

import com.tianque.core.base.BaseDomain;
import com.tianque.core.util.BaseDomainIdEncryptUtil;

/**
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class Proclamation extends BaseDomain {
	private String content;
	private boolean display;
	// PC是否可用
	private Boolean pcusable = false;
	// 手机是否可用
	private Boolean mobileusable = false;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	public Boolean getPcusable() {
		return pcusable;
	}

	public void setPcusable(Boolean pcusable) {
		this.pcusable = pcusable;
	}

	public Boolean getMobileusable() {
		return mobileusable;
	}

	public void setMobileusable(Boolean mobileusable) {
		this.mobileusable = mobileusable;
	}

	public String getEncryptId() {
		return BaseDomainIdEncryptUtil.encryptDomainId(super.getId(), null,
				null);
	}
}
