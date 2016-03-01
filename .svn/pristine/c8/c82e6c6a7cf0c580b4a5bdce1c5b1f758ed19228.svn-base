package com.tianque.sysadmin.constant;

import java.util.HashMap;
import java.util.Map;

import com.tianque.core.util.AnalyseUtilNew;


public class PacketStatisticsTables {
	public final static String ORGID_NAME = "orgIdName";
	public final static String ORGCODE_NAME = "orgCodeName";
	public final static String TYPE = "type";
	public final static String ORGID_CREATE = "orgIdCreate";
	public final static String CLEAN_HISTORY = "cleanHistory";

	public final static String POPULATIONSTATTYPE_KEY = AnalyseUtilNew.ACTUALPERSONTABLENAME;
	public final static String POPULATIONSTATTYPE_DISPLAYNAME = "实有人口研判分析表";
	public final static String PRIMARYORGANIZATIONS_KEY = AnalyseUtilNew.PRIMARYORGANIZATIONSENAME;
	public final static String PRIMARYORGANIZATIONS_DISPLAYNAME = "组织机构总况研判分析表";
	public final static String DEPARTMENTPARTY_KEY = AnalyseUtilNew.DEPARTMENTPARTYNAME;
	public final static String DEPARTMENTPARTY_DISPLAYNAME = "党委部门研判分析表";
	public final static String STATISTICHISTORY_KEY = AnalyseUtilNew.IMPORTPERSONTABLENAME;
	public final static String STATISTICHISTORY_DISPLAYNAME = "业务人员房屋两新组织研判分析表";
	public final static String HOUSEHOLDSTAFFSTAT_KEY = AnalyseUtilNew.ACTUALPERSONCATEGORYTABLENAME;
	public final static String HOUSEHOLDSTAFFSTAT_DISPLAYNAME = "户籍人口业务研判分析表";
	public final static String COMPANYPLACESTATTYPE_KEY = AnalyseUtilNew.COMPANY_PLACE_TABLE_NAME;
	public final static String COMPANYPLACESTATTYPE_DISPLAYNAME = "单位场所研判分析表";
	public final static String YOUTHSTATTYPE_KEY = AnalyseUtilNew.YOUTH_TABLE_NAME;
	public final static String YOUTHSTATTYPE_DISPLAYNAME = "青少年统计表";
	/** 基础信息报表 */
	public final static String BASESITUATIONSTATEMENT_KEY = AnalyseUtilNew.BASESITUATION_STATEMENT_TABLE_NAME;
	public final static String BASESITUATIONSTATEMENT_DISPLAYNAME = "基础信息报表";

	public final static Map<String, String> statisticsKeyNames = new HashMap<String, String>();
	public final static Map<String, Map<String, Object>> allStatisticsTables = new HashMap<String, Map<String, Object>>();
	public final static Map<String, Object> populationstatTypeTables = new HashMap<String, Object>();
	public final static Map<String, Object> primaryOrganizationsTables = new HashMap<String, Object>();
	public final static Map<String, Object> departmentTables = new HashMap<String, Object>();
	public final static Map<String, Object> statistichistoryTables = new HashMap<String, Object>();
	public final static Map<String, Object> householdstaffstatTables = new HashMap<String, Object>();
	public final static Map<String, Object> companyPlaceStatTypeTables = new HashMap<String, Object>();
	public final static Map<String, Object> youthsStatTypeTables = new HashMap<String, Object>();
	static {

		youthsStatTypeTables.put(ORGID_NAME, "orgId");
		youthsStatTypeTables.put(ORGCODE_NAME, "orginternalcode");
		youthsStatTypeTables.put(TYPE, YOUTHSTATTYPE_KEY);
		youthsStatTypeTables.put(ORGID_CREATE, true);
		youthsStatTypeTables.put(CLEAN_HISTORY, true);

		populationstatTypeTables.put(ORGID_NAME, "orgId");
		populationstatTypeTables.put(ORGCODE_NAME, "orginternalcode");
		populationstatTypeTables.put(TYPE, POPULATIONSTATTYPE_KEY);
		populationstatTypeTables.put(ORGID_CREATE, true);
		populationstatTypeTables.put(CLEAN_HISTORY, true);

		primaryOrganizationsTables.put(ORGID_NAME, "orgId");
		primaryOrganizationsTables.put(ORGCODE_NAME, "orginternalcode");
		primaryOrganizationsTables.put(TYPE, PRIMARYORGANIZATIONS_KEY);
		primaryOrganizationsTables.put(ORGID_CREATE, true);
		primaryOrganizationsTables.put(CLEAN_HISTORY, true);

		departmentTables.put(ORGID_NAME, "orgId");
		departmentTables.put(ORGCODE_NAME, "orginternalcode");
		departmentTables.put(TYPE, DEPARTMENTPARTY_KEY);
		departmentTables.put(ORGID_CREATE, true);
		departmentTables.put(CLEAN_HISTORY, true);

		statistichistoryTables.put(ORGID_NAME, "orgId");
		statistichistoryTables.put(ORGCODE_NAME, "orginternalcode");
		statistichistoryTables.put(TYPE, "statistichistory");
		statistichistoryTables.put(ORGID_CREATE, false);
		statistichistoryTables.put(CLEAN_HISTORY, true);
		statistichistoryTables.put("cleanType", true);

		householdstaffstatTables.put(ORGID_NAME, "orgId");
		householdstaffstatTables.put(ORGCODE_NAME, "orginternalcode");
		householdstaffstatTables.put(TYPE, "householdstaffstat");
		householdstaffstatTables.put(ORGID_CREATE, true);
		householdstaffstatTables.put(CLEAN_HISTORY, false);

		companyPlaceStatTypeTables.put(ORGID_NAME, "orgId");
		companyPlaceStatTypeTables.put(ORGCODE_NAME, "orginternalcode");
		companyPlaceStatTypeTables.put(TYPE, "companyPlaceStatType");
		companyPlaceStatTypeTables.put(ORGID_CREATE, false);
		companyPlaceStatTypeTables.put(CLEAN_HISTORY, false);

		statisticsKeyNames.put(POPULATIONSTATTYPE_KEY,
				POPULATIONSTATTYPE_DISPLAYNAME);
		statisticsKeyNames.put(PRIMARYORGANIZATIONS_KEY,
				PRIMARYORGANIZATIONS_DISPLAYNAME);
		statisticsKeyNames
				.put(DEPARTMENTPARTY_KEY, DEPARTMENTPARTY_DISPLAYNAME);
		statisticsKeyNames.put(STATISTICHISTORY_KEY,
				STATISTICHISTORY_DISPLAYNAME);
		statisticsKeyNames.put(HOUSEHOLDSTAFFSTAT_KEY,
				HOUSEHOLDSTAFFSTAT_DISPLAYNAME);
		statisticsKeyNames.put(COMPANYPLACESTATTYPE_KEY,
				COMPANYPLACESTATTYPE_DISPLAYNAME);
		statisticsKeyNames.put(BASESITUATIONSTATEMENT_KEY,
				BASESITUATIONSTATEMENT_DISPLAYNAME);
		statisticsKeyNames.put(YOUTHSTATTYPE_KEY, YOUTHSTATTYPE_DISPLAYNAME);

		allStatisticsTables.put(POPULATIONSTATTYPE_KEY,
				populationstatTypeTables);
		allStatisticsTables.put(PRIMARYORGANIZATIONS_KEY,
				primaryOrganizationsTables);
		allStatisticsTables.put(DEPARTMENTPARTY_KEY, departmentTables);
		allStatisticsTables.put(STATISTICHISTORY_KEY, statistichistoryTables);
		allStatisticsTables.put(HOUSEHOLDSTAFFSTAT_KEY,
				householdstaffstatTables);
		allStatisticsTables.put(COMPANYPLACESTATTYPE_KEY,
				companyPlaceStatTypeTables);
		allStatisticsTables.put(YOUTHSTATTYPE_KEY, youthsStatTypeTables);

	}
}
