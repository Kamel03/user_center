package com.tianque.sysadmin.constant;

import com.tianque.core.util.StringUtil;
import com.tianque.sysadmin.vo.PacketStatisticsVo;

/**
 * @Description:研判分析数据生成帮助类
 * @author zhangyouwei@hztian.com
 * @date: 2014-12-4 下午09:26:34
 */
public class PacketStatisticsHelper {
	/**
	 * 实例化一个生成数据的vo类
	 * 
	 * @param year
	 * @param month
	 * @param type
	 * @return
	 */
	public static PacketStatisticsVo createPacketStatisticsVo(int year,
			int month, String type) {
		PacketStatisticsVo packetStatisticsVo = new PacketStatisticsVo();
		if (!StringUtil.isStringAvaliable(type)) {
			return packetStatisticsVo;
		}
		packetStatisticsVo.setStartMonth(month);
		packetStatisticsVo.setStartYear(year);
		packetStatisticsVo.setEndMonth(month);
		packetStatisticsVo.setEndYear(year);
		packetStatisticsVo.setTypeName(type);
		return packetStatisticsVo;
	}
}
