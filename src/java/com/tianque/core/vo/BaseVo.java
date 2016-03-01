package com.tianque.core.vo;

import java.io.Serializable;

public class BaseVo implements Serializable {

	private int startRow;

	private int endRow;

	private String sortField;

	private String order;

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public String getSortField() {
		return sortField;
	}

	public String getOrder() {
		return order;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
