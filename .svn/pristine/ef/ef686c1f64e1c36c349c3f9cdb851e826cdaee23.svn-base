package com.tianque.sysadmin.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianque.core.base.AbstractBaseService;
import com.tianque.core.vo.PageInfo;
import com.tianque.sysadmin.dao.JobMonitorDao;
import com.tianque.sysadmin.domain.JobMonitor;
import com.tianque.sysadmin.service.JobMonitorService;

@Service("jobMonitorService")
public class JobMonitorServiceImpl extends AbstractBaseService implements JobMonitorService {
	@Autowired
	private JobMonitorDao jobMonitorDao;

	@Override
	public Long addJobMonitor(String jobName) {
		JobMonitor jobMonitor = createJobMonitor(jobName);
		return jobMonitorDao.addJobMonitor(jobMonitor);
	}

	private JobMonitor createJobMonitor(String jobName) {
		JobMonitor jobMonitor = new JobMonitor();
		jobMonitor.setJobname(jobName);
		jobMonitor.setStartDate(new Date());
		return jobMonitor;
	}

	@Override
	public void updateJobMonitor(Long id, String remark, Boolean success) {
		jobMonitorDao.updateJobMonitor(id, new Date(), remark, success);
	}

	@Override
	public PageInfo<JobMonitor> findJobMonitor(int pageNum, int pageSize, String sortField,
			String order, Long grade) {
		return jobMonitorDao.findJobMonitor(pageNum, pageSize, sortField, order, grade);
	}

}
