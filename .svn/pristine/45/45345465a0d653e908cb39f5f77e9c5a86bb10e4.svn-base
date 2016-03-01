package com.tianque.sysadmin.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.util.StringUtil;
import com.tianque.core.vo.PageInfo;
import com.tianque.sysadmin.dao.JobMonitorDao;
import com.tianque.sysadmin.domain.JobMonitor;

@Repository("jobMonitorDao")
public class JobMonitorDaoImpl extends AbstractBaseDao implements JobMonitorDao {

	@Override
	public Long addJobMonitor(JobMonitor jobMonitor) {
		return (Long) getSqlMapClientTemplate().insert("jobMonitor.addJobMonitor", jobMonitor);
	}

	@Override
	public void updateJobMonitor(Long id, Date enddate, String remark, Boolean success) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("entDate", enddate);
		map.put("remark", remark);
		map.put("success", success);
		getSqlMapClientTemplate().update("jobMonitor.updateJobMonitor", map);

	}

	@Override
	public PageInfo<JobMonitor> findJobMonitor(int pageNum, int pageSize, String sortField,
			String order, Long grade) {
		PageInfo<JobMonitor> pageInfo = new PageInfo<JobMonitor>();
		Map<String, Object> query = new HashMap<String, Object>();
		if (StringUtil.isStringAvaliable(sortField)) {
			query.put("sortField", sortField);
			query.put("order", order);
		}
		query.put("grade", grade);
		List list = getSqlMapClientTemplate().queryForList("jobMonitor.findJobMonitor", query,
				(pageNum - 1) * pageSize, pageSize);
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"jobMonitor.countJobMonitor", query);
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}

}
