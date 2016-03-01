package com.tianque.sysadmin.service;

import com.tianque.core.vo.PageInfo;
import com.tianque.sysadmin.domain.JobMonitor;

public interface JobMonitorService {
	Long addJobMonitor(String jobName);

	void updateJobMonitor(Long id, String remark, Boolean success);

	PageInfo<JobMonitor> findJobMonitor(int pageNum, int pageSize, String sortField, String order,
			Long grade);
}
