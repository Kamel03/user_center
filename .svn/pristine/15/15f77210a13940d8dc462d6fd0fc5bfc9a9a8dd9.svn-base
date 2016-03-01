package com.tianque.workMemo.domain;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

import com.tianque.core.base.BaseDomain;

public class WorkMemo extends BaseDomain {
	/* 用户Id */
	private Long userId;
	/* 添加备忘录的时间 */
	private Date addMemoDate;
	/* 备忘录内容 */
	private String memoContents;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getAddMemoDate() {
		return addMemoDate;
	}

	public void setAddMemoDate(Date addMemoDate) {
		this.addMemoDate = addMemoDate;
	}

	public String getMemoContents() {
		return memoContents;
	}

	public void setMemoContents(String memoContents) {
		this.memoContents = memoContents;
	}
}
