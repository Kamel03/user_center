package com.tianque.peopleLog.domain;

import com.tianque.core.base.BaseDomain;

public class PeopleLogAttachFiles extends BaseDomain {
	/* 民情日志id */
	private Long peopleLogId;
	/* 民情日志附件名 */
	private String fileName;
	/* 民情日志附件URL */
	private String fileActualUrl;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileActualUrl() {
		return fileActualUrl;
	}

	public void setFileActualUrl(String fileActualUrl) {
		this.fileActualUrl = fileActualUrl;
	}

	public Long getPeopleLogId() {
		return peopleLogId;
	}

	public void setPeopleLogId(Long peopleLogId) {
		this.peopleLogId = peopleLogId;
	}
}
