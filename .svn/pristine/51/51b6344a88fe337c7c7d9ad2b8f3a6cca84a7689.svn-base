package com.tianque.sysadmin.domain;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

import com.tianque.core.base.BaseDomain;

public class JobMonitor extends BaseDomain {
	private String jobname;
	private Date startDate;
	private Date entDate;
	private String remark;
	private Boolean success;

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getEntDate() {
		return entDate;
	}

	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
