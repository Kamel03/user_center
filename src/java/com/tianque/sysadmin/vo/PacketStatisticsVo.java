package com.tianque.sysadmin.vo;

import java.util.List;

import com.tianque.core.base.BaseDomain;

public class PacketStatisticsVo extends BaseDomain {

	private String typeName;

	private List<String> groupByTypes;

	private Integer startYear;

	private Integer startMonth;

	private Integer endYear;

	private Integer endMonth;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<String> getGroupByTypes() {
		return groupByTypes;
	}

	public void setGroupByTypes(List<String> groupByTypes) {
		this.groupByTypes = groupByTypes;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(Integer startMonth) {
		this.startMonth = startMonth;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public Integer getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(Integer endMonth) {
		this.endMonth = endMonth;
	}

}
