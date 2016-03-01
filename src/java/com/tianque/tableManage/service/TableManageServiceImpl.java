package com.tianque.tableManage.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.util.StringUtil;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.tableManage.dao.TableManageDao;

@Service("tableManageService")
public class TableManageServiceImpl implements TableManageService {
	final static Logger logger = LoggerFactory
			.getLogger(TableManageServiceImpl.class);
	@Autowired
	private TableManageDao tableManageDao;

	@Override
	public void createTable(String createTableSql) {
		tableManageDao.createTable(createTableSql);
	}

	@Override
	public void crateIndex(String indexSql) {
		tableManageDao.crateIndex(indexSql);

	}

	@Override
	public boolean IsCreateTable(String tableName) {
		return tableManageDao.IsCreateTable(tableName);
	}

	@Override
	public boolean IsCreateIndex(String tableName) {
		return tableManageDao.IsCreateIndex(tableName);
	}

	@Override
	public void dorpIndex(String tableName) {
		tableManageDao.dorpIndex(tableName);
	}

	/** 如果有创建表则返回true */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public boolean createAnalyseTable(String tableName, String createSql,
			int year, int month) {
		if (null == tableName || null == createSql || 0 == year || 0 == month) {
			logger.error("创建表结构的参数错误！");
			throw new BusinessValidationException("创建表结构的参数错误！");
		}
		String tableAllName = tableName + "_" + year + "_" + month;
		// 判断表是否存在，不存在创建表
		if (!tableManageDao.IsCreateTable(tableAllName.toUpperCase())) {
			tableManageDao.createTable(String.format(createSql, tableAllName,
					tableAllName));
			return true;
		}
		return false;
	}

	/**
	 * 研判分析，执行job的时候创建当月的索引
	 * 
	 * @param tableName
	 *            （创建索引的表）
	 * @param parame
	 *            （索引字段） year month
	 * 
	 */

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public void createAnalyseIndex(String tableName, String parame, int year,
			int month) {

		if (null == tableName || null == parame || 0 == year || 0 == month) {
			logger.error("表结构的参数错误！");
			throw new BusinessValidationException("表结构的参数错误！");
		}
		String index = "idx_" + tableName + "_" + year + "_" + month + "_"
				+ parame;

		String tableNameOfIndex = tableName + "_" + year + "_" + month;
		String tableNameOfIndexUp = tableNameOfIndex.toUpperCase();
		String indexArr = index.toUpperCase();
		if (!tableManageDao.IsCreateIndex(indexArr)) {
			List<String> list = new ArrayList<String>();
			list.add(generateSql(indexArr, tableNameOfIndexUp,
					parame.toUpperCase()));
			tableManageDao.createIndexArr(list);
		}
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public void createAnalyseIndex(String prefix, String field1, String field2) {
		String index = "";
		String tableName = "";
		String[] indexArr = new String[12];
		List<String> list = new ArrayList<String>();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -12);
		SimpleDateFormat timePattern = new SimpleDateFormat("yyyy_M");

		for (int i = 0; i < 12; i++) {
			String subfix = "_" + timePattern.format(calendar.getTime());
			tableName = prefix + subfix;
			index = "idx_" + prefix + subfix;
			indexArr[i] = index.toUpperCase();
			list.add(generateSql(index, tableName, field1, field2));

			calendar.add(Calendar.MONTH, 1);
		}
		if (!tableManageDao.IsCreateIndex(indexArr)) {
			tableManageDao.createIndexArr(list);
		}
	}

	private String generateSql(String index, String tableName, String field1,
			String field2) {
		return "create index " + index + " on " + tableName + "(" + field1
				+ "," + field2 + ")";
	}

	private String generateSql(String index, String tableName, String field1) {
		return "create index " + index + " on " + tableName + "(" + field1
				+ ")";
	}

	@Override
	public boolean isTableExists(List<String> tableNames) {
		return tableManageDao.isTableExists(tableNames);
	}

	@Override
	public boolean isCreateIndexByIndexName(String indexName) {
		boolean isCreateIndex = false;
		if (StringUtil.isStringAvaliable(indexName)) {
			isCreateIndex = tableManageDao.isCreateIndexByIndexName(indexName
					.toUpperCase());
		}
		return isCreateIndex;
	}

	@Override
	public boolean tableColumnIsCreate(String tableName, String columnName,
			String owner) {
		if ((!StringUtil.isStringAvaliable(tableName))
				|| (!StringUtil.isStringAvaliable(columnName))) {
			throw new BusinessValidationException("表名或字段名未获得");
		}
		return tableManageDao.tableColumnIsCreate(tableName, columnName, owner);
	}
}
