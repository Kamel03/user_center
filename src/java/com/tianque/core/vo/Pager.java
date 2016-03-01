package com.tianque.core.vo;

import java.io.Serializable;

public class Pager implements Serializable {
	/**
	 * 显示页
	 */
	private Integer pageNum;
	/**
	 * 一页行数
	 */
	private Integer pageSize;
	/**
	 * 排序的字段名
	 */
	private String sortField;
	/**
	 * 排序的顺序
	 */
	private String order;

	/**
	 * 排序实体类
	 * 
	 * @param pageNum
	 *            显示页
	 * @param pageSize
	 *            一页行数
	 * @param sortField
	 *            排序的字段名
	 * @param order
	 *            排序的顺序
	 */
	public Pager(Integer pageNum, Integer pageSize, String sortField,
			String order) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.sortField = sortField;
		this.order = order;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
