package com.tianque.mobile.vo;

import java.io.Serializable;

public class MobilePropertyDict implements Serializable {

	private Long id;
	private String displayName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
