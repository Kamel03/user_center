package com.tianque.sysadmin.service;

import java.util.Map;

import com.tianque.sysadmin.vo.PacketStatisticsVo;

public interface PacketStatisticsService {

	public void packetStatisticsByTableAndGroupType(
			PacketStatisticsVo packetStatisticsVo);

	public void fillOrgIdForTable(Map<?, ?> map);

	public void createPacketStatisticsByTypeAndTime(String tableType,
			String baseinfoType, int year, int month);

	/***
	 * 给表新增dispose字段
	 */
	public void createDisposeColumn(Map<?, ?> map);
}
