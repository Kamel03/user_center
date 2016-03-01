package com.tianque.sysadmin.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianque.core.util.AnalyseUtilNew;
import com.tianque.core.util.StringUtil;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.property.OrganizationLevel;
import com.tianque.domain.property.PropertyTypes;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.sysadmin.constant.PacketStatisticsTables;
import com.tianque.sysadmin.dao.PacketStatisticsDao;
import com.tianque.sysadmin.service.PacketStatisticsService;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.sysadmin.vo.PacketStatisticsVo;
import com.tianque.tableManage.service.TableManageService;

@Service("packetStatisticsService")
public class PacketStatisticsServiceImpl implements PacketStatisticsService {
	private final static Logger logger = LoggerFactory
			.getLogger(PacketStatisticsServiceImpl.class);

	@Autowired
	private PacketStatisticsDao packetStatisticsDao;
	@Autowired
	private PropertyDictService propertyDictService;
	@Autowired
	private TableManageService tableManageService;
	// @Autowired
	// private BaseSituationStatementNewService baseSituationStatementNewService;

	private final String START_YEAR = "startYear";
	private final String START_MONTH = "startMonth";
	private final String END_YEAR = "endYear";
	private final String END_MONTH = "endMonth";
	private final String ORGID_CREATE = "orgIdCreate";
	private final String CLEAN_HISTORY = "cleanHistory";

	public void packetStatisticsByTableAndGroupType(
			PacketStatisticsVo packetStatisticsVo) {
		if (illegalTime(packetStatisticsVo)
				|| !StringUtil.isStringAvaliable(packetStatisticsVo
						.getTypeName())) {
			return;
		}
		try {
			if (AnalyseUtilNew.BASESITUATION_STATEMENT_TABLE_NAME
					.equals(packetStatisticsVo.getTypeName())) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put(START_YEAR, packetStatisticsVo.getStartYear());
				map.put(START_MONTH, packetStatisticsVo.getStartMonth());
				map.put(END_YEAR, packetStatisticsVo.getEndYear());
				map.put(END_MONTH, packetStatisticsVo.getEndMonth());
				saveBasesituationMementStatistics(map);
			} else if (!"packetAll".equals(packetStatisticsVo.getTypeName())
					&& !(AnalyseUtilNew.BASESITUATION_STATEMENT_TABLE_NAME
							.equals(packetStatisticsVo.getTypeName()))) {
				Map<String, Object> map = PacketStatisticsTables.allStatisticsTables
						.get(packetStatisticsVo.getTypeName());
				if (map == null) {
					return;
				}
				map.put(START_YEAR, packetStatisticsVo.getStartYear());
				map.put(START_MONTH, packetStatisticsVo.getStartMonth());
				map.put(END_YEAR, packetStatisticsVo.getEndYear());
				map.put(END_MONTH, packetStatisticsVo.getEndMonth());
				savePacketStatistics(map);
			} else {
				for (String key : PacketStatisticsTables.allStatisticsTables
						.keySet()) {
					Map<String, Object> map = PacketStatisticsTables.allStatisticsTables
							.get(key);
					map.put(START_YEAR, packetStatisticsVo.getStartYear());
					map.put(START_MONTH, packetStatisticsVo.getStartMonth());
					map.put(END_YEAR, packetStatisticsVo.getEndYear());
					map.put(END_MONTH, packetStatisticsVo.getEndMonth());
					savePacketStatistics(map);
				}
			}
		} catch (Exception e) {
			throw new ServiceValidationException("数据清洗出错", e);
		}
	}

	private void savePacketStatistics(Map<String, Object> packetStatisticsTables) {
		try {
			for (int year = (Integer) packetStatisticsTables.get(START_YEAR); year <= (Integer) packetStatisticsTables
					.get(END_YEAR); year++) {
				int startMonth = 1;
				int endMonth = 12;
				if (year == (Integer) packetStatisticsTables.get(START_YEAR)) {
					startMonth = (Integer) packetStatisticsTables
							.get(START_MONTH);
				}
				if (year == (Integer) packetStatisticsTables.get(END_YEAR)) {
					endMonth = (Integer) packetStatisticsTables.get(END_MONTH);
				}
				for (int month = startMonth; month <= endMonth; month++) {
					packetStatisticsTables.put("year", year);
					packetStatisticsTables.put("month", month);
					logger.error("执行" + packetStatisticsTables.get("type")
							+ "_" + year + "_" + month + "表分组统计开始。");
					savePacketStatisticsByTableAndGroupType(packetStatisticsTables);
				}
			}
		} catch (Exception e) {
			throw new BusinessValidationException("数据清洗出错，原因:" + e.getMessage());
		}

	}

	private void saveBasesituationMementStatistics(
			Map<String, Object> packetStatisticsTables) {
		try {
			for (int year = (Integer) packetStatisticsTables.get(START_YEAR); year <= (Integer) packetStatisticsTables
					.get(END_YEAR); year++) {
				int startMonth = 1;
				int endMonth = 12;
				if (year == (Integer) packetStatisticsTables.get(START_YEAR)) {
					startMonth = (Integer) packetStatisticsTables
							.get(START_MONTH);
				}
				if (year == (Integer) packetStatisticsTables.get(END_YEAR)) {
					endMonth = (Integer) packetStatisticsTables.get(END_MONTH);
				}
				for (int month = startMonth; month <= endMonth; month++) {
					/*logger.error("执行"
							+ AnalyseUtilNew.BASESITUATION_STATEMENT_TABLE_NAME
							+ "_" + year + "_" + month + "表分组统计开始。");
					baseSituationStatementNewService
							.addBaseStituationStatementHistory(year, month);*/
				}
			}
		} catch (Exception e) {
			throw new BusinessValidationException("数据清洗出错，原因:" + e.getMessage());
		}

	}

	private void savePacketStatisticsByTableAndGroupType(Map<String, Object> map) {
		Long start = System.currentTimeMillis();
		String tableName = ((String) map.get("type") + "_"
				+ (Integer) map.get("year") + "_" + (Integer) map.get("month"));
		try {
			// 判断表dispose字段是否创建，没创建则增加该字段
			if (!tableManageService.tableColumnIsCreate(
					tableName.toUpperCase(), "DISPOSE",
					AnalyseUtilNew.OWNER_NAME)) {
				packetStatisticsDao.createDisposeColumn(map);
			}
		} catch (Exception e) {
			throw new ServiceValidationException("新增dispose字段出错", e);
		}
		try {
			// 判断表orgId字段是否创建，没创建则增加该字段
			if (!tableManageService
					.tableColumnIsCreate(tableName.toUpperCase(), "ORGID",
							AnalyseUtilNew.OWNER_NAME)) {
				packetStatisticsDao.createOrgIdColumn(map);
			}
		} catch (Exception e) {
			throw new ServiceValidationException("新增orgId字段出错", e);
		}
		try {
			// 数据清洗
			for (int i = 1; i <= 6; i++) {
				map.put("orgLevel", i);
				packetStatisticsDao
						.savePacketStatisticsByTableAndGroupType(map);
			}
			// 将原数据清除
			// if ((Boolean) map.get(CLEAN_HISTORY)) {
			cleanHistoryData(map);
			// }
			// 根据orgcode将orgId赋值
			fillOrgIdForTable(map);
		} catch (Exception e) {
			logger.error("执行" + map.get("type") + "_" + map.get("year") + "_"
					+ map.get("month") + "表分组统计失败：" + e);
			throw new BusinessValidationException("数据清洗失败，原因:" + e.getMessage());
		}
		// 判断索引是否已经存在，不存在则新增
		try {
			boolean bool = tableManageService
					.isCreateIndexByIndexName(getIndexName(
							(String) map.get("type"),
							(String) map.get("orgIdName"),
							(Integer) map.get("year"),
							(Integer) map.get("month")));
			if (!bool) {
				String indexSql = generateSql((String) map.get("type"),
						(String) map.get("orgIdName"),
						(Integer) map.get("year"), (Integer) map.get("month"));
				tableManageService.crateIndex(indexSql);
			}
		} catch (Exception e) {
			throw new BusinessValidationException("给清洗表新建索引失败，原因:"
					+ e.getMessage());
		}
		logger.error("执行" + map.get("type") + "_" + map.get("year") + "_"
				+ map.get("month") + "表分组统计结束。耗时："
				+ (System.currentTimeMillis() - start) + "ms");
	}

	private String generateSql(String tableType, String field, int year,
			int month) {
		int length = tableType.length();
		if (length > 13) {
			length = 13;
		}
		String index = "index_" + tableType.substring(0, length) + year + month
				+ "orgId";
		return "create index " + index + " on " + tableType + "_" + year + "_"
				+ month + "(" + field + ")";
	}

	private String getIndexName(String tableType, String field, int year,
			int month) {
		int length = tableType.length();
		if (length > 13) {
			length = 13;
		}
		String index = "index_" + tableType.substring(0, length) + year + month
				+ "orgId";
		return index;
	}

	@Override
	public void fillOrgIdForTable(Map map) {
		packetStatisticsDao.fillOrgIdForTable(map);
	}

	private void cleanHistoryData(Map map) {
		PropertyDict propertyDict = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						PropertyTypes.ORGANIZATION_LEVEL,
						OrganizationLevel.GRID).get(0);
		map.put("gridProDictId", propertyDict.getId());
		packetStatisticsDao.cleanHistoryData(map);
	}

	private void cleanCreateData(Map map) {
		packetStatisticsDao.cleanCreateData(map);
	}

	private boolean illegalTime(PacketStatisticsVo packetStatisticsVo) {
		if (packetStatisticsVo.getStartYear() == null
				|| packetStatisticsVo.getStartMonth() == null
				|| packetStatisticsVo.getEndYear() == null
				|| packetStatisticsVo.getEndMonth() == null) {
			return true;
		}
		if (packetStatisticsVo.getStartMonth() < 1
				|| packetStatisticsVo.getStartMonth() > 12
				|| packetStatisticsVo.getEndMonth() < 1
				|| packetStatisticsVo.getEndMonth() > 12) {
			return true;
		}
		return false;
	}

	@Override
	public void createPacketStatisticsByTypeAndTime(String tableType,
			String baseinfoType, int year, int month) {
		Map<String, Object> map = PacketStatisticsTables.allStatisticsTables
				.get(tableType);
		if (map == null) {
			return;
		}
		map.put(ORGID_CREATE, false);
		map.put("year", year);
		map.put("month", month);
		if (StringUtil.isStringAvaliable(baseinfoType)) {
			map.put("baseinfoType", baseinfoType);
		}
		savePacketStatisticsByTableAndGroupType(map);
	}

	@Override
	public void createDisposeColumn(Map map) {
		packetStatisticsDao.createDisposeColumn(map);
	}

}
