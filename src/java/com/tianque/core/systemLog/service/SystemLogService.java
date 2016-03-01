package com.tianque.core.systemLog.service;

import java.util.Date;
import java.util.List;

import com.tianque.core.systemLog.domain.SystemLog;
import com.tianque.core.vo.PageInfo;

public interface SystemLogService {

	public PageInfo<SystemLog> findAllSystemLogsForPage(String orgInternalCode,
			Date startDate, Date endDate, String userName, int pageNum,
			int pageSize, String sortField, String order);

	public PageInfo<SystemLog> findSuccessSystemLogsForPage(
			String orgInternalCode, Date startDate, Date endDate,
			String userName, int pageNum, int pageSize, String sortField,
			String order);

	public PageInfo<SystemLog> findFailSystemLogsForPage(Date startDate,
			Date endDate, int pageNum, int pageSize, String sortField,
			String order);

	public SystemLog log(String operation, Integer operationType,
			String moduleName, int logLevel, String userName, String clientIp,
			String orgInternalCode);

	public SystemLog log(String operation, String moduleName,
			Integer operationType, int logLevel, String clientIp);

	public SystemLog log(String operation, String moduleName,
			Integer operationType);

	public SystemLog log(int logLevel, String moduleName,
			Integer operationType, String operation, String operateContent);

	public SystemLog log(int logLevel, String moduleName,
			Integer operationType, String operation, String operateContent,
			String beforeKey, String afterKey, String beforeName,
			String afterName);

	public PageInfo<SystemLog> findAllSystemLogsForPagebyQuery(String OrgCode,
			Date startDate, Date endDate, String modelName,
			Integer operationType, String userName, Integer pageNum,
			Integer pageSize, String sidx, String sord);

	public PageInfo<SystemLog> findSystemLogByOrgCode(String OrgCode,
			Date startDate, Date endDate, Integer pageNum, Integer pageSize,
			String sidx, String sord);

	public void archiveSystemLogs();

	public void archiveSystemLogsForOld();

	/**
	 * 获取当前周用户的登录情况
	 * 
	 * @param OrgCode
	 * @param startDate
	 * @param endDate
	 * @param operationType
	 * @param userName
	 * @param sidx
	 * @param sord
	 * @return
	 */
	public List<String> findLoginOfCurrentWeek(String OrgCode,
			String modelName, Integer operationType, String userName);
}
