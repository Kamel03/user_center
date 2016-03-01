package com.tianque.core.base;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapExecutor;
import com.tianque.core.util.StringUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.plugin.weChat.util.PageInfoUtil;

abstract public class AbstractBaseDao<T> extends SqlMapClientDaoSupport
		implements DruidSpringMonitor {
	public final Logger logger = LoggerFactory.getLogger(getClass());

	private static final String PAGE_FROM = "pageFrom";
	private static final String PAGE_TO = "pageTo";

	@Resource(name = "sqlMapClient")
	public void setSqlMapClientBase(SqlMapClient sqlMapClient) {
		super.setSqlMapClient(sqlMapClient);
	}

	protected PageInfo<T> getPageInfoByParamMap(PageInfo<T> pageInfo,
			String countListStatementName, String getListStatementName,
			int pageNum, int pageSize, Map<String, Object> paramObject) {
		Long total = (Long) getSqlMapClientTemplate().queryForObject(
				countListStatementName, paramObject);

		pageNum = PageInfoUtil.getInstance().dealOutofMaxPageNum(
				total.intValue(), pageSize, pageNum);
		List<T> result = new ArrayList<T>();
		if (total != null && total.longValue() > 0) {
			paramObject.put(PAGE_FROM, (pageNum - 1) * pageSize);
			paramObject.put(PAGE_TO, pageNum * pageSize);
			result = getSqlMapClientTemplate().queryForList(
					getListStatementName, paramObject);
		}
		pageInfo.setResult(result);
		pageInfo.setTotalRowSize(total);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}

	protected List<T> getListByParamMap(String countListStatementName,
			String getListStatementName, Integer page, Integer rows,
			Map<String, Object> map) {
		Long total = (Long) getSqlMapClientTemplate().queryForObject(
				countListStatementName, map);
		if (total != null && total.longValue() > 0) {
			if (page == null && rows == null) {
				map.put(PAGE_FROM, 0);
				map.put(PAGE_TO, total);
			}
			if (page != null && rows != null) {
				map.put(PAGE_FROM, (page - 1) * rows);
				map.put(PAGE_TO, page * rows);
			}
		}
		return getSqlMapClientTemplate()
				.queryForList(getListStatementName, map);
	}

	protected List<Long> batchInsertDate(List datas, String sqlAlias) {
		List batchList = new ArrayList();
		List<Long> ids = new ArrayList<Long>();
		for (int index = 0; index < datas.size(); index++) {
			batchList.add(datas.get(index));
			if (index != 0 && index % 500 == 0) {
				ids.addAll(batchInsertFor500(batchList, sqlAlias));
				batchList.clear();
			}
		}
		if (batchList.size() > 0) {
			ids.addAll(batchInsertFor500(batchList, sqlAlias));
		}
		return ids;

	}

	private List<Long> batchInsertFor500(final List datas, final String sqlAlias) {
		return (List) getSqlMapClientTemplate().execute(
				new SqlMapClientCallback() {
					@Override
					public Object doInSqlMapClient(SqlMapExecutor excutor)
							throws SQLException {
						List<Long> ids = new ArrayList<Long>();
						excutor.startBatch();
						for (Object data : datas) {
							ids.add((Long) excutor.insert(sqlAlias, data));
						}
						excutor.executeBatch();
						return ids;
					}

				});
	}

	protected void batchUpdateDate(List datas, String sqlAlias) {
		List batchList = new ArrayList();
		for (int index = 0; index < datas.size(); index++) {
			batchList.add(datas.get(index));
			if (index != 0 && index % 500 == 0) {
				batchUpdateFor500(batchList, sqlAlias);
				batchList.clear();
			}
		}
		if (batchList.size() > 0) {
			batchInsertFor500(batchList, sqlAlias);
		}

	}

	private void batchUpdateFor500(final List datas, final String sqlAlias) {
		getSqlMapClientTemplate().execute(new SqlMapClientCallback() {
			@Override
			public Object doInSqlMapClient(SqlMapExecutor excutor)
					throws SQLException {
				excutor.startBatch();
				for (Object data : datas) {
					excutor.update(sqlAlias, data);
				}
				excutor.executeBatch();
				return null;
			}

		});
	}
	
	protected void updateTableUpdateDateById(String tableName, Long id) {
		try {
			if (!StringUtil.isStringAvaliable(tableName) || id == null) {
				return;
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("tableName", tableName);
			map.put("id", id);
			map.put("updateDate", ThreadVariable.getSession().getAccessTime());
			map.put("updateUser", ThreadVariable.getSession().getUserName());
			getSqlMapClientTemplate().update(
					"common.updateTableUpdateDateById", map);
		} catch (Exception e) {
			logger.error("修改表" + tableName + "的修改时间出错：" + e);
		}
	}
	
	protected Map<String, Object> getUpdateDateAndUser() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("updateDate", ThreadVariable.getSession().getAccessTime());
		map.put("updateUser", ThreadVariable.getSession().getUserName());
		return map;
	}
}
