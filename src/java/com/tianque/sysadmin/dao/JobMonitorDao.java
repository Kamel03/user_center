package com.tianque.sysadmin.dao;

import java.util.Date;

import com.tianque.core.vo.PageInfo;
import com.tianque.sysadmin.domain.JobMonitor;

public interface JobMonitorDao {
	Long addJobMonitor(JobMonitor jobMonitor);

	void updateJobMonitor(Long id, Date enddate, String remark, Boolean success);

	PageInfo<JobMonitor> findJobMonitor(int pageNum, int pageSize, String sortField, String order,
			Long grade);
}
