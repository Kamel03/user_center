package com.tianque.sysadmin.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.sysadmin.dao.PacketStatisticsDao;

@Repository("packetStatisticsDao")
public class PacketStatisticsDaoImpl extends AbstractBaseDao implements
		PacketStatisticsDao {

	@Override
	public void savePacketStatisticsByTableAndGroupType(Map map) {
		getSqlMapClientTemplate().insert(
				getInsertSqlByType((String) map.get("type")), map);
	}

	private String getInsertSqlByType(String type) {
		return "packetStatistics." + type + "Statistics";

	}

	@Override
	public void createDisposeColumn(Map map) {
		getSqlMapClientTemplate().update(
				"packetStatistics.createDisposeColumn", map);

	}

	@Override
	public void createOrgIdColumn(Map map) {
		getSqlMapClientTemplate().update("packetStatistics.createOrgIdColumn",
				map);
	}

	@Override
	public void fillOrgIdForTable(Map map) {
		getSqlMapClientTemplate().update("packetStatistics.fillOrgIdForTable",
				map);
	}

	@Override
	public void cleanHistoryData(Map map) {
		getSqlMapClientTemplate().delete("packetStatistics.cleanHistoryData",
				map);
	}

	@Override
	public void cleanCreateData(Map map) {
		getSqlMapClientTemplate().delete("packetStatistics.cleanCreateData",
				map);
	}

}
