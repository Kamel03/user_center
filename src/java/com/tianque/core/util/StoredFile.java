package com.tianque.core.util;

import java.io.File;

public class StoredFile {
	private String storedFilePath;
	private String storedFileName;
	private Long fileSize;
	private String storedTruthFileName;

	public String getStoredTruthFileName() {
		if (storedTruthFileName.indexOf(",") == 0) {
			storedTruthFileName = storedTruthFileName.substring(1);
		}
		return storedTruthFileName;
	}

	public void setStoredTruthFileName(String storedTruthFileName) {
		if (storedTruthFileName.indexOf(",") == 0) {
			storedTruthFileName = storedTruthFileName.substring(1);
		}
		this.storedTruthFileName = storedTruthFileName;
	}

	public String getStoredFilePath() {
		return storedFilePath;
	}

	public void setStoredFilePath(String storedFilePath) {
		this.storedFilePath = storedFilePath;
	}

	// FIXME 解决附件，问题的最快方式
	public String getStoredFileName() {
		if (storedFileName.indexOf(",") == 0) {
			storedFileName = storedFileName.substring(1);
		}
		return storedFileName;
	}

	// FIXME 解决附件，问题的最快方式
	public void setStoredFileName(String storedFileName) {
		if (storedFileName.indexOf(",") == 0) {
			storedFileName = storedFileName.substring(1);
		}
		this.storedFileName = storedFileName;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFullName() {
		return getStoredFilePath() + File.separatorChar + getStoredFileName();
	}
}
