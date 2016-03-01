package com.tianque.domain.property;

import com.tianque.core.datatransfer.DataType;

/**
 * 定义格式：序号|属性|中文名|属性类型|是否采用默认样式|合并行|合并列|
 * 
 * @author 张忠祥(zhangzhongxiang@hztianque.com)
 * @date 2013-5-30 上午10:49:24
 */
public class SpecialGroupsContextYinchuan
{
	public static String[][] getSocialSecurityPersonnelPropertyArraySlf()
	{
		String[][] excelColumArray = { { "0", "", "社保人员清单", "", "", "true", "0", "29" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "otherAddress", "临时居所", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" }, { "22", "socialSecurityType", "社保类型", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.SOCIAL_SECURITY_TYPE, "true" }, { "23", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "true" }, { "24", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSocialSecurityPersonnelPropertyArrayRla()
	{
		String[][] excelColumArray = { { "0", "", "社保人员清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" },
				{ "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "socialSecurityType", "社保类型", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.SOCIAL_SECURITY_TYPE, "true" },
				{ "25", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "true" }, { "26", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSocialSecurityPersonnelImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "socialSecurityType", "社保类型", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.SOCIAL_SECURITY_TYPE, "true" }, { "25", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "医疗保险", "true" },
				{ "26", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "养老保险", "true" }, { "27", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "失业保险", "true" }, { "28", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "工伤保险", "true" },
				{ "29", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "生育保险", "true" }, { "30", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "住房公积金", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSocialSecurityPersonnelImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "socialSecurityType", "社保类型", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.SOCIAL_SECURITY_TYPE, "true" }, { "4", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "医疗保险", "true" },
				{ "5", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "养老保险", "true" }, { "6", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "失业保险", "true" }, { "7", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "工伤保险", "true" },
				{ "8", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "生育保险", "true" }, { "9", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "住房公积金", "true" }, { "10", "businessRemark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSocialSecurityPersonnelImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "socialSecurityType", "社保类型", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.SOCIAL_SECURITY_TYPE, "true" },
				{ "27", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "医疗保险", "true" }, { "28", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "养老保险", "true" }, { "29", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "失业保险", "true" },
				{ "30", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "工伤保险", "true" }, { "31", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "生育保险", "true" }, { "32", "socialSecurityInsuranceKinds", "社保险种", DataType.DATA_TYPE_DICT_LIST, PropertyTypesYinchuan.SOCIAL_SECURITY_INSURANCE_KIND, "住房公积金", "true" },
				{ "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getMinimumLivingPersonPropertyArraySlf()
	{// 低保人员
		String[][] excelColumArray = { { "0", "", "低保人员清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "otherAddress", "临时居所", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" }, { "22", "minLiveCode", "低保证号", "", "", "true" }, { "23", "poorSource", "致困原因", DataType.DATA_TYPE_DICT, PropertyTypes.AIDRREASON, "true" }, { "24", "ensureWay", "保障方式", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_WAY, "true" }, { "25", "ensureType", "保障类别", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_TYPE, "true" },
				{ "26", "enjoyArea", "享受地区", "", "", "true" }, { "27", "enjoyDate", "享受时间", DataType.DATA_TYPE_DATE, "", "true" }, { "28", "sendMoney", "发放金额(元)", "", "", "true" }, { "29", "receiveDate", "领取时间", DataType.DATA_TYPE_DATE, "", "true" }, { "30", "poorSituation", "困难情况", "", "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getMinimumLivingPersonPropertyArrayRla()
	{// 低保人员
		String[][] excelColumArray = { { "0", "", "低保人员清单", "", "", "true", "0", "33" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" },
				{ "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "minLiveCode", "低保证号", "", "", "true" }, { "25", "poorSource", "致困原因", DataType.DATA_TYPE_DICT, PropertyTypes.AIDRREASON, "true" },
				{ "26", "ensureWay", "保障方式", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_WAY, "true" }, { "27", "ensureType", "保障类别", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_TYPE, "true" }, { "28", "enjoyArea", "享受地区", "", "", "true" }, { "29", "enjoyDate", "享受时间", DataType.DATA_TYPE_DATE, "", "true" }, { "30", "sendMoney", "发放金额(元)", "", "", "true" }, { "31", "receiveDate", "领取时间", DataType.DATA_TYPE_DATE, "", "true" }, { "32", "poorSituation", "困难情况", "", "", "true" },
				{ "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getMinimumLivingPersonImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "minLiveCode", "低保证号", "", "", "true" }, { "25", "poorSource", "致困原因", DataType.DATA_TYPE_DICT, PropertyTypes.AIDRREASON, "true" }, { "26", "ensureWay", "保障方式", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_WAY, "true" }, { "27", "ensureType", "保障类别", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_TYPE, "true" },
				{ "28", "enjoyArea", "享受地区", "", "", "true" }, { "29", "enjoyDate", "享受时间", DataType.DATA_TYPE_DATE, "", "true" }, { "30", "sendMoney", "发放金额", "", "", "true" }, { "31", "receiveDate", "领取时间", DataType.DATA_TYPE_DATE, "", "true" }, { "32", "poorSituation", "困难情况", "", "", "true" }, { "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getMinimumLivingPersonImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "minLiveCode", "低保证号", "", "", "true" }, { "4", "poorSource", "致困原因", DataType.DATA_TYPE_DICT, PropertyTypes.AIDRREASON, "true" }, { "5", "ensureWay", "保障方式", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_WAY, "true" },
				{ "6", "ensureType", "保障类别", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_TYPE, "true" }, { "7", "enjoyArea", "享受地区", "", "", "true" }, { "8", "enjoyDate", "享受时间", DataType.DATA_TYPE_DATE, "", "true" }, { "9", "sendMoney", "发放金额", "", "", "true" }, { "10", "receiveDate", "领取时间", DataType.DATA_TYPE_DATE, "", "true" }, { "11", "poorSituation", "困难情况", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getMinimumLivingPersonImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "minLiveCode", "低保证号", "", "", "true" }, { "27", "poorSource", "致困原因", DataType.DATA_TYPE_DICT, PropertyTypes.AIDRREASON, "true" },
				{ "28", "ensureWay", "保障方式", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_WAY, "true" }, { "29", "ensureType", "保障类别", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.ENSURE_TYPE, "true" }, { "30", "enjoyArea", "享受地区", "", "", "true" }, { "31", "enjoyDate", "享受时间", DataType.DATA_TYPE_DATE, "", "true" }, { "32", "sendMoney", "发放金额", "", "", "true" }, { "33", "receiveDate", "领取时间", DataType.DATA_TYPE_DATE, "", "true" }, { "34", "poorSituation", "困难情况", "", "", "true" },
				{ "35", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getRetireSoldierPropertyArraySlf()
	{// 退役人员
		String[][] excelColumArray = { { "0", "", "退役人员清单", "", "", "true", "0", "29" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "otherAddress", "临时居所", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" }, { "22", "retireDate", "退役日期", DataType.DATA_TYPE_DATE, "", "true" }, { "23", "formerUnit", "原服役单位", "", "", "true" }, { "24", "formerUnitJob", "原单位职位", "", "", "true" }, { "25", "serveAge", "服役年限", "", "", "true" }, { "26", "familyCondition", "家庭状况", "", "", "true" }, { "27", "subsidyCondition", "国家补贴情况", "", "", "true" },
				{ "28", "incomeCondition", "收入情况", "", "", "true" }, { "29", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getRetireSoldierPropertyArrayRla()
	{// 退役人员
		String[][] excelColumArray = { { "0", "", "退役人员清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" },
				{ "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "retireDate", "退役日期", DataType.DATA_TYPE_DATE, "", "true" }, { "25", "formerUnit", "原服役单位", "", "", "true" }, { "26", "formerUnitJob", "原单位职位", "", "", "true" },
				{ "27", "serveAge", "服役年限", "", "", "true" }, { "28", "familyCondition", "家庭状况", "", "", "true" }, { "29", "subsidyCondition", "国家补贴情况", "", "", "true" }, { "30", "incomeCondition", "收入情况", "", "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getRetireSoldierImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "retireDate", "退役日期", DataType.DATA_TYPE_DATE, "", "true" }, { "25", "formerUnit", "原服役单位", "", "", "true" }, { "26", "formerUnitJob", "原单位职位", "", "", "true" }, { "27", "serveAge", "服役年限", "", "", "true" }, { "28", "familyCondition", "家庭状况", "", "", "true" }, { "29", "subsidyCondition", "国家补贴情况", "", "", "true" },
				{ "30", "incomeCondition", "收入情况", "", "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getRetireSoldierImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "retireDate", "退役日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "formerUnit", "原服役单位", "", "", "true" }, { "5", "formerUnitJob", "原单位职位", "", "", "true" }, { "6", "serveAge", "服役年限", "", "", "true" }, { "7", "familyCondition", "家庭状况", "", "", "true" },
				{ "8", "subsidyCondition", "国家补贴情况", "", "", "true" }, { "9", "incomeCondition", "收入情况", "", "", "true" }, { "10", "businessRemark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getRetireSoldierImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "retireDate", "退役日期", DataType.DATA_TYPE_DATE, "", "true" }, { "27", "formerUnit", "原服役单位", "", "", "true" }, { "28", "formerUnitJob", "原单位职位", "", "", "true" },
				{ "29", "serveAge", "服役年限", "", "", "true" }, { "30", "familyCondition", "家庭状况", "", "", "true" }, { "31", "subsidyCondition", "国家补贴情况", "", "", "true" }, { "32", "incomeCondition", "收入情况", "", "", "true" }, { "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSuspicionHeresyPersonPropertyArraySlf()
	{// 涉嫌参与邪教人员
		String[][] excelColumArray = { { "0", "", "涉嫌参与邪教人员清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "usedName", "曾用名", "", "", "true" }, { "9", "workUnit", "工作单位或就读学校", "", "", "true" }, { "10", "telephone", "联系电话", "", "", "true" }, { "11", "mobileNumber", "联系手机", "", "", "true" }, { "12", "email", "电子邮件", "", "", "true" }, { "13", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "14", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "15", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "16", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "17", "skillsAndSpecialities", "专业特长", DataType.DATA_TYPE_DICT, PropertyTypes.SKILLS_AND_SPECIALITIES, "true" }, { "18", "skillTitle", "技术职称", "", "", "true" },
				{ "19", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "20", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "21", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "22", "stature", "身高", "", "", "true" }, { "23", "heresyDate", "参与邪教时间", DataType.DATA_TYPE_DATE, "", "true" }, { "24", "dependStrength", "依靠力量", "", "", "true" }, { "25", "heresyName", "邪教名称", "", "", "true" },
				{ "26", "heresySituation", "邪教情况说明", "", "", "true" }, { "27", "reality", "现实表现", "", "", "true" }, { "28", "followRecord", "跟踪记录", "", "", "true" }, { "29", "contactPerson", "主要交往人员", "", "", "true" }, { "30", "currentStatus", "当前状态", "", "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSuspicionHeresyPersonPropertyArrayRla()
	{// 涉嫌参与邪教人员
		String[][] excelColumArray = { { "0", "", "涉嫌参与邪教人员清单", "", "", "true", "0", "33" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "usedName", "曾用名", "", "", "true" }, { "11", "workUnit", "工作单位或就读学校", "", "", "true" }, { "12", "telephone", "联系电话", "", "", "true" }, { "13", "mobileNumber", "联系手机", "", "", "true" }, { "14", "email", "电子邮件", "", "", "true" },
				{ "15", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "16", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "17", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "18", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "19", "skillsAndSpecialities", "专业特长", DataType.DATA_TYPE_DICT, PropertyTypes.SKILLS_AND_SPECIALITIES, "true" },
				{ "20", "skillTitle", "技术职称", "", "", "true" }, { "21", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "22", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "23", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "24", "stature", "身高", "", "", "true" }, { "25", "heresyDate", "参与邪教时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "dependStrength", "依靠力量", "", "", "true" },
				{ "27", "heresyName", "邪教名称", "", "", "true" }, { "28", "heresySituation", "邪教情况说明", "", "", "true" }, { "29", "reality", "现实表现", "", "", "true" }, { "30", "followRecord", "跟踪记录", "", "", "true" }, { "31", "contactPerson", "主要交往人员", "", "", "true" }, { "32", "currentStatus", "当前状态", "", "", "true" }, { "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSuspicionHeresyPersonImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "dependStrength", "依靠力量", "", "", "true" }, { "25", "heresyDate", "参与邪教时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "heresyName", "邪教名称", "", "", "true" }, { "27", "heresySituation", "邪教情况说明", "", "", "true" }, { "28", "reality", "现实表现", "", "", "true" }, { "29", "followRecord", "跟踪记录", "", "", "true" },
				{ "30", "contactPerson", "主要交往人员", "", "", "true" }, { "31", "currentStatus", "当前状态", "", "", "true" }, { "32", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSuspicionHeresyPersonImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "dependStrength", "依靠力量", "", "", "true" }, { "4", "heresyDate", "参与邪教时间", DataType.DATA_TYPE_DATE, "", "true" }, { "5", "heresyName", "邪教名称", "", "", "true" }, { "6", "heresySituation", "邪教情况说明", "", "", "true" }, { "7", "reality", "现实表现", "", "", "true" },
				{ "8", "followRecord", "跟踪记录", "", "", "true" }, { "9", "contactPerson", "主要交往人员", "", "", "true" }, { "10", "currentStatus", "当前状态", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getSuspicionHeresyPersonImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "dependStrength", "依靠力量", "", "", "true" }, { "27", "heresyDate", "参与邪教时间", DataType.DATA_TYPE_DATE, "", "true" }, { "28", "heresyName", "邪教名称", "", "", "true" },
				{ "29", "heresySituation", "邪教情况说明", "", "", "true" }, { "30", "reality", "现实表现", "", "", "true" }, { "31", "followRecord", "跟踪记录", "", "", "true" }, { "32", "contactPerson", "主要交往人员", "", "", "true" }, { "33", "currentStatus", "当前状态", "", "", "true" }, { "34", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getLegalLitigationPropertyArraySlf()
	{// 涉法涉诉人员
		String[][] excelColumArray = { { "0", "", "涉法涉诉人员清单", "", "", "true", "0", "32" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "usedName", "曾用名", "", "", "true" }, { "9", "workUnit", "工作单位或就读学校", "", "", "true" }, { "10", "telephone", "联系电话", "", "", "true" }, { "11", "mobileNumber", "联系手机", "", "", "true" }, { "12", "email", "电子邮件", "", "", "true" }, { "13", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "14", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "15", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "16", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "17", "skillsAndSpecialities", "专业特长", DataType.DATA_TYPE_DICT, PropertyTypes.SKILLS_AND_SPECIALITIES, "true" }, { "18", "skillTitle", "技术职称", "", "", "true" },
				{ "19", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "20", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "21", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "22", "stature", "身高", "", "", "true" }, { "23", "handlingTime", "办案时间", DataType.DATA_TYPE_DATE, "", "true" }, { "24", "mainDemand", "主要诉求", "", "", "true" }, { "25", "caseBasicFacts", "案件基本事实", "", "", "true" },
				{ "26", "caseHandlingOrgan", "办案机关", "", "", "true" }, { "27", "undertaker", "承办人", "", "", "true" }, { "28", "processingResults", "依法处理结果", "", "", "true" }, { "29", "livingConditions", "生活状态", "", "", "true" }, { "30", "otherDynamic", "对方动态", "", "", "true" }, { "31", "currentStatus", "当前状态", "", "", "true" }, { "32", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getLegalLitigationPropertyArrayRla()
	{// 涉法涉诉人员
		String[][] excelColumArray = { { "0", "", "涉法涉诉人员清单", "", "", "true", "0", "34" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "usedName", "曾用名", "", "", "true" }, { "11", "workUnit", "工作单位或就读学校", "", "", "true" }, { "12", "telephone", "联系电话", "", "", "true" }, { "13", "mobileNumber", "联系手机", "", "", "true" }, { "14", "email", "电子邮件", "", "", "true" },
				{ "15", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "16", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "17", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "18", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "19", "skillsAndSpecialities", "专业特长", DataType.DATA_TYPE_DICT, PropertyTypes.SKILLS_AND_SPECIALITIES, "true" },
				{ "20", "skillTitle", "技术职称", "", "", "true" }, { "21", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "22", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "23", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "24", "stature", "身高", "", "", "true" }, { "25", "handlingTime", "办案时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "mainDemand", "主要诉求", "", "", "true" },
				{ "27", "caseBasicFacts", "案件基本事实", "", "", "true" }, { "28", "caseHandlingOrgan", "办案机关", "", "", "true" }, { "29", "undertaker", "承办人", "", "", "true" }, { "30", "processingResults", "依法处理结果", "", "", "true" }, { "31", "livingConditions", "生活状态", "", "", "true" }, { "32", "otherDynamic", "对方动态", "", "", "true" }, { "33", "currentStatus", "当前状态", "", "", "true" }, { "34", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getLegalLitigationImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "handlingTime", "办案时间", DataType.DATA_TYPE_DATE, "", "true" }, { "25", "mainDemand", "主要诉求", "", "", "true" }, { "26", "caseBasicFacts", "案件基本事实", "", "", "true" }, { "27", "caseHandlingOrgan", "办案机关", "", "", "true" }, { "28", "undertaker", "承办人", "", "", "true" }, { "29", "processingResults", "依法处理结果", "", "", "true" },
				{ "30", "livingConditions", "生活状态", "", "", "true" }, { "31", "otherDynamic", "对方动态", "", "", "true" }, { "32", "currentStatus", "当前状态", "", "", "true" }, { "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getLegalLitigationImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "handlingTime", "办案时间", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "mainDemand", "主要诉求", "", "", "true" }, { "5", "caseBasicFacts", "案件基本事实", "", "", "true" }, { "6", "caseHandlingOrgan", "办案机关", "", "", "true" }, { "7", "undertaker", "承办人", "", "", "true" },
				{ "8", "processingResults", "依法处理结果", "", "", "true" }, { "9", "livingConditions", "生活状态", "", "", "true" }, { "10", "otherDynamic", "对方动态", "", "", "true" }, { "11", "currentStatus", "当前状态", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getLegalLitigationImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "handlingTime", "办案时间", DataType.DATA_TYPE_DATE, "", "true" }, { "27", "mainDemand", "主要诉求", "", "", "true" }, { "28", "caseBasicFacts", "案件基本事实", "", "", "true" },
				{ "29", "caseHandlingOrgan", "办案机关", "", "", "true" }, { "30", "undertaker", "承办人", "", "", "true" }, { "31", "processingResults", "依法处理结果", "", "", "true" }, { "32", "livingConditions", "生活状态", "", "", "true" }, { "33", "otherDynamic", "对方动态", "", "", "true" }, { "34", "currentStatus", "当前状态", "", "", "true" }, { "35", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getHomelessBeggarsPropertyArraySlf()
	{
		String[][] excelColumArray = { { "0", "", "流浪乞讨人员清单", "", "", "true", "0", "29" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "otherAddress", "临时居所", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" }, { "22", "beggingReason", "乞讨原因", "", "", "true" }, { "23", "familyStatus", "家庭现状", "", "", "true" }, { "24", "demandServices", "服务需求", "", "", "true" }, { "25", "guardianName", "监护人姓名", "", "", "true" }, { "26", "guardianRelationship", "监护人关系", "", "", "true" }, { "27", "guardianPhone", "监护人联系电话", "", "", "true" },
				{ "28", "isFriendsRefuge", "是否有亲友投靠", DataType.DATA_TYPE_BOOLEAN, "", "true" },
				
				{ "29", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getHomelessBeggarsPropertyArrayRla()
	{
		String[][] excelColumArray = { { "0", "", "流浪乞讨人员清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" },
				{ "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "beggingReason", "乞讨原因", "", "", "true" }, { "25", "familyStatus", "家庭现状", "", "", "true" }, { "26", "demandServices", "服务需求", "", "", "true" },
				{ "27", "guardianName", "监护人姓名", "", "", "true" }, { "28", "guardianRelationship", "监护人关系", "", "", "true" }, { "29", "guardianPhone", "监护人联系电话", "", "", "true" }, { "30", "isFriendsRefuge", "是否有亲友投靠", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getHomelessBeggarsImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "beggingReason", "乞讨原因", "", "", "true" }, { "25", "familyStatus", "家庭现状", "", "", "true" }, { "26", "demandServices", "服务需求", "", "", "true" }, { "27", "guardianName", "监护人姓名", "", "", "true" }, { "28", "guardianRelationship", "监护人关系", "", "", "true" }, { "29", "guardianPhone", "监护人联系电话", "", "", "true" },
				{ "30", "isFriendsRefuge", "是否有亲友投靠", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getHomelessBeggarsImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "beggingReason", "乞讨原因", "", "", "true" }, { "4", "familyStatus", "家庭现状", "", "", "true" }, { "5", "demandServices", "服务需求", "", "", "true" }, { "6", "guardianName", "监护人姓名", "", "", "true" }, { "7", "guardianRelationship", "监护人关系", "", "", "true" },
				{ "8", "guardianPhone", "监护人联系电话", "", "", "true" }, { "9", "isFriendsRefuge", "是否有亲友投靠", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "businessRemark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getHomelessBeggarsImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "beggingReason", "乞讨原因", "", "", "true" }, { "27", "familyStatus", "家庭现状", "", "", "true" }, { "28", "demandServices", "服务需求", "", "", "true" },
				{ "29", "guardianName", "监护人姓名", "", "", "true" }, { "30", "guardianRelationship", "监护人关系", "", "", "true" }, { "31", "guardianPhone", "监护人联系电话", "", "", "true" }, { "32", "isFriendsRefuge", "是否有亲友投靠", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "33", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPrivateSubstituteTeacherPropertyArraySlf()
	{
		String[][] excelColumArray = { { "0", "", "民办代课教师清单", "", "", "true", "0", "29" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "otherAddress", "临时居所", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" }, { "22", "formerSubstituteSchool", "原代课学校", "", "", "true" }, { "23", "startSubstituteTime", "开始代课时间", DataType.DATA_TYPE_DATE, "", "true" }, { "24", "employmentSituation", "解代后就业情况", "", "", "true" }, { "25", "livingConditions", "生活状况", "", "", "true" }, { "26", "majorPersonnelExchanges", "主要交往人员", "", "", "true" },
				{ "27", "currentStatus", "当前状态", "", "", "true" }, { "28", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPrivateSubstituteTeacherPropertyArrayRla()
	{
		String[][] excelColumArray = { { "0", "", "民办代课教师清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" },
				{ "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "formerSubstituteSchool", "原代课学校", "", "", "true" }, { "25", "startSubstituteTime", "开始代课时间", DataType.DATA_TYPE_DATE, "", "true" },
				{ "26", "employmentSituation", "解代后就业情况", "", "", "true" }, { "27", "livingConditions", "生活状况", "", "", "true" }, { "28", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "29", "currentStatus", "当前状态", "", "", "true" }, { "30", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPrivateSubstituteTeacherImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "formerSubstituteSchool", "原代课学校", "", "", "true" }, { "25", "startSubstituteTime", "开始代课时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "employmentSituation", "解代后就业情况", "", "", "true" }, { "27", "livingConditions", "生活状况", "", "", "true" }, { "28", "majorPersonnelExchanges", "主要交往人员", "", "", "true" },
				{ "29", "currentStatus", "当前状态", "", "", "true" }, { "30", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPrivateSubstituteTeacherImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "formerSubstituteSchool", "原代课学校", "", "", "true" }, { "4", "startSubstituteTime", "开始代课时间", DataType.DATA_TYPE_DATE, "", "true" }, { "5", "employmentSituation", "解代后就业情况", "", "", "true" }, { "6", "livingConditions", "生活状况", "", "", "true" },
				{ "7", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "8", "currentStatus", "当前状态", "", "", "true" }, { "9", "businessRemark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPrivateSubstituteTeacherImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "formerSubstituteSchool", "原代课学校", "", "", "true" }, { "27", "startSubstituteTime", "开始代课时间", DataType.DATA_TYPE_DATE, "", "true" },
				{ "28", "employmentSituation", "解代后就业情况", "", "", "true" }, { "29", "livingConditions", "生活状况", "", "", "true" }, { "30", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "31", "currentStatus", "当前状态", "", "", "true" }, { "32", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getInmatesPropertyArraySlf()
	{
		String[][] excelColumArray = { { "0", "", "正在服刑人员清单", "", "", "true", "0", "32" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "usedName", "曾用名", "", "", "true" }, { "9", "workUnit", "工作单位或就读学校", "", "", "true" }, { "10", "telephone", "联系电话", "", "", "true" }, { "11", "mobileNumber", "联系手机", "", "", "true" }, { "12", "email", "电子邮件", "", "", "true" }, { "13", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "14", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "15", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "16", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "17", "skillsAndSpecialities", "专业特长", DataType.DATA_TYPE_DICT, PropertyTypes.SKILLS_AND_SPECIALITIES, "true" }, { "18", "skillTitle", "技术职称", "", "", "true" },
				{ "19", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "20", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "21", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "22", "stature", "身高", "", "", "true" }, { "23", "simpleCauseAction", "简单案由", "", "", "true" }, { "24", "relyForce", "依靠力量", "", "", "true" }, { "25", "prisonTerm", "刑期", "", "", "true" },
				{ "26", "startTimeServed", "服刑开始时间", DataType.DATA_TYPE_DATE, "", "true" }, { "27", "placeServing", "服刑地点", "", "", "true" }, { "28", "trackRecord", "跟踪记录", "", "", "true" }, { "29", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "30", "currentStatus", "当前状态", "", "", "true" }, { "31", "businessRemark", "业务备注", "", "", "true" }, { "32", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getInmatesPropertyArrayRla()
	{
		String[][] excelColumArray = { { "0", "", "正在服刑人员清单", "", "", "true", "0", "34" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "usedName", "曾用名", "", "", "true" }, { "11", "workUnit", "工作单位或就读学校", "", "", "true" }, { "12", "telephone", "联系电话", "", "", "true" }, { "13", "mobileNumber", "联系手机", "", "", "true" }, { "14", "email", "电子邮件", "", "", "true" },
				{ "15", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "16", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "17", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "18", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "19", "skillsAndSpecialities", "专业特长", DataType.DATA_TYPE_DICT, PropertyTypes.SKILLS_AND_SPECIALITIES, "true" },
				{ "20", "skillTitle", "技术职称", "", "", "true" }, { "21", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "22", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "23", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "24", "stature", "身高", "", "", "true" }, { "25", "simpleCauseAction", "简单案由", "", "", "true" }, { "26", "relyForce", "依靠力量", "", "", "true" },
				{ "27", "prisonTerm", "刑期", "", "", "true" }, { "28", "startTimeServed", "服刑开始时间", DataType.DATA_TYPE_DATE, "", "true" }, { "29", "placeServing", "服刑地点", "", "", "true" }, { "30", "trackRecord", "跟踪记录", "", "", "true" }, { "31", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "32", "currentStatus", "当前状态", "", "", "true" }, { "33", "businessRemark", "业务备注", "", "", "true" }, { "34", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getInmatesImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "simpleCauseAction", "简单案由", "", "", "true" }, { "25", "relyForce", "依靠力量", "", "", "true" }, { "26", "prisonTerm", "刑期", "", "", "true" }, { "27", "startTimeServed", "服刑开始时间", DataType.DATA_TYPE_DATE, "", "true" }, { "28", "placeServing", "服刑地点", "", "", "true" }, { "29", "trackRecord", "跟踪记录", "", "", "true" },
				{ "30", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "31", "currentStatus", "当前状态", "", "", "true" }, { "32", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getInmatesImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "simpleCauseAction", "简单案由", "", "", "true" }, { "4", "relyForce", "依靠力量", "", "", "true" }, { "5", "prisonTerm", "刑期", "", "", "true" }, { "6", "startTimeServed", "服刑开始时间", DataType.DATA_TYPE_DATE, "", "true" }, { "7", "placeServing", "服刑地点", "", "", "true" },
				{ "8", "trackRecord", "跟踪记录", "", "", "true" }, { "9", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "10", "currentStatus", "当前状态", "", "", "true" }, { "11", "businessRemark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getInmatesImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "simpleCauseAction", "简单案由", "", "", "true" }, { "27", "relyForce", "依靠力量", "", "", "true" }, { "28", "prisonTerm", "刑期", "", "", "true" },
				{ "29", "startTimeServed", "服刑开始时间", DataType.DATA_TYPE_DATE, "", "true" }, { "30", "placeServing", "服刑地点", "", "", "true" }, { "31", "trackRecord", "跟踪记录", "", "", "true" }, { "32", "majorPersonnelExchanges", "主要交往人员", "", "", "true" }, { "33", "currentStatus", "当前状态", "", "", "true" }, { "34", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPartyMemberPropertyArraySlf()
	{
		String[][] excelColumArray = { { "0", "", "党员清单", "", "", "true", "0", "29" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" }, { "6", "nativePlaceAddress", "户籍地详址", "", "", "true" },
				{ "7", "currentAddress", "常住地址", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" },
				{ "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" },
				{ "22", "belongsPartyBranch", "所属党支部", "", "", "true" }, { "23", "joinPartyBranchDate", "进入党支部时间", DataType.DATA_TYPE_DATE, "", "true" }, { "24", "partyMemberType", "党员类型", DataType.DATA_TYPE_DICT, PropertyTypes.PARTYMEMBER_TYPE, "true" }, { "25", "joinPartyDate", "入党时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "joinPartyBranch", "入党时所在党支部", "", "", "true" }, { "27", "becomesDate", "转正时间", DataType.DATA_TYPE_DATE, "", "true" },
				{ "28", "becomesState", "转正情况", DataType.DATA_TYPE_DICT, PropertyTypes.BECOMES_STATE, "true" }, { "29", "partyPosition", "党内主要职务", "", "", "true" }, { "30", "officeDate", "任职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "31", "trainingState", "培训情况", DataType.DATA_TYPE_DICT, PropertyTypes.TRAINING_STATE, "true" }, { "32", "rewardsPunishment", "奖惩情况", "", "", "true" }, { "33", "expertise", "专长", "", "", "true" },
				{ "34", "isFlowPartyCard", "是否持流动党员证", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "35", "flowPartyBranch", "流入地（单位）党支部", "", "", "true" }, { "36", "flowPartyBranchDate", "流入时间", DataType.DATA_TYPE_DATE, "", "true" }, { "37", "partyBranchContacts", "党支部联系人", "", "", "true" }, { "38", "branchTelephone", "固定电话（党支部联系人）", "", "", "true" }, { "39", "branchMobileNumber", "联系手机（党支部联系人)", "", "", "true" }, { "40", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPartyMemberPropertyArrayRla()
	{
		String[][] excelColumArray = { { "0", "", "党员清单", "", "", "true", "0", "31" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" }, { "6", "nativePlaceAddress", "户籍地详址", "", "", "true" },
				{ "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" },
				{ "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" },
				{ "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" },
				
				{ "24", "belongsPartyBranch", "所属党支部", "", "", "true" }, { "25", "joinPartyBranchDate", "进入党支部时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "partyMemberType", "党员类型", DataType.DATA_TYPE_DICT, PropertyTypes.PARTYMEMBER_TYPE, "true" }, { "27", "joinPartyDate", "入党时间", DataType.DATA_TYPE_DATE, "", "true" }, { "28", "joinPartyBranch", "入党时所在党支部", "", "", "true" }, { "29", "becomesDate", "转正时间", DataType.DATA_TYPE_DATE, "", "true" },
				{ "30", "becomesState", "转正情况", DataType.DATA_TYPE_DICT, PropertyTypes.BECOMES_STATE, "true" }, { "31", "partyPosition", "党内主要职务", "", "", "true" }, { "32", "officeDate", "任职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "33", "trainingState", "培训情况", DataType.DATA_TYPE_DICT, PropertyTypes.TRAINING_STATE, "true" }, { "34", "rewardsPunishment", "奖惩情况", "", "", "true" }, { "35", "expertise", "专长", "", "", "true" },
				{ "36", "isFlowPartyCard", "是否持流动党员证", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "37", "flowPartyBranch", "流入地（单位）党支部", "", "", "true" }, { "38", "flowPartyBranchDate", "流入时间", DataType.DATA_TYPE_DATE, "", "true" }, { "39", "partyBranchContacts", "党支部联系人", "", "", "true" }, { "40", "branchTelephone", "固定电话（党支部联系人）", "", "", "true" }, { "41", "branchMobileNumber", "联系手机（党支部联系人)", "", "", "true" },
				
				{ "42", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPartyMemberImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "belongsPartyBranch", "所属党支部", "", "", "true" }, { "25", "joinPartyBranchDate", "进入党支部时间", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "partyMemberType", "党员类型", DataType.DATA_TYPE_DICT, PropertyTypes.PARTYMEMBER_TYPE, "true" }, { "27", "joinPartyDate", "入党时间", DataType.DATA_TYPE_DATE, "", "true" },
				{ "28", "joinPartyBranch", "入党时所在党支部", "", "", "true" }, { "29", "becomesDate", "转正时间", DataType.DATA_TYPE_DATE, "", "true" }, { "30", "becomesState", "转正情况", DataType.DATA_TYPE_DICT, PropertyTypes.BECOMES_STATE, "true" }, { "31", "partyPosition", "党内主要职务", "", "", "true" }, { "32", "officeDate", "任职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "33", "trainingState", "培训情况", DataType.DATA_TYPE_DICT, PropertyTypes.TRAINING_STATE, "true" },
				{ "34", "rewardsPunishment", "奖惩情况", "", "", "true" }, { "35", "expertise", "专长", "", "", "true" }, { "36", "isFlowPartyCard", "是否持流动党员证", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "37", "flowPartyBranch", "流入地（单位）党支部", "", "", "true" }, { "38", "flowPartyBranchDate", "流入时间", DataType.DATA_TYPE_DATE, "", "true" }, { "39", "partyBranchContacts", "党支部联系人", "", "", "true" }, { "40", "branchTelephone", "固定电话（党支部联系人）", "", "", "true" },
				{ "41", "branchMobileNumber", "联系手机（党支部联系人)", "", "", "true" }, { "42", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPartyMemberImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "belongsPartyBranch", "所属党支部", "", "", "true" }, { "4", "joinPartyBranchDate", "进入党支部时间", DataType.DATA_TYPE_DATE, "", "true" }, { "5", "partyMemberType", "党员类型", DataType.DATA_TYPE_DICT, PropertyTypes.PARTYMEMBER_TYPE, "true" },
				{ "6", "joinPartyDate", "入党时间", DataType.DATA_TYPE_DATE, "", "true" }, { "7", "joinPartyBranch", "入党时所在党支部", "", "", "true" }, { "8", "becomesDate", "转正时间", DataType.DATA_TYPE_DATE, "", "true" }, { "9", "becomesState", "转正情况", DataType.DATA_TYPE_DICT, PropertyTypes.BECOMES_STATE, "true" }, { "10", "partyPosition", "党内主要职务", "", "", "true" }, { "11", "officeDate", "任职日期", DataType.DATA_TYPE_DATE, "", "true" },
				{ "12", "trainingState", "培训情况", DataType.DATA_TYPE_DICT, PropertyTypes.TRAINING_STATE, "true" }, { "13", "rewardsPunishment", "奖惩情况", "", "", "true" }, { "14", "expertise", "专长", "", "", "true" }, { "15", "isFlowPartyCard", "是否持流动党员证", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "16", "flowPartyBranch", "流入地（单位）党支部", "", "", "true" }, { "17", "flowPartyBranchDate", "流入时间", DataType.DATA_TYPE_DATE, "", "true" }, { "18", "partyBranchContacts", "党支部联系人", "", "", "true" },
				{ "19", "branchTelephone", "固定电话（党支部联系人）", "", "", "true" }, { "20", "branchMobileNumber", "联系手机（党支部联系人)", "", "", "true" }, { "21", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getPartyMemberImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "belongsPartyBranch", "所属党支部", "", "", "true" }, { "27", "joinPartyBranchDate", "进入党支部时间", DataType.DATA_TYPE_DATE, "", "true" },
				{ "28", "partyMemberType", "党员类型", DataType.DATA_TYPE_DICT, PropertyTypes.PARTYMEMBER_TYPE, "true" }, { "29", "joinPartyDate", "入党时间", DataType.DATA_TYPE_DATE, "", "true" }, { "30", "joinPartyBranch", "入党时所在党支部", "", "", "true" }, { "31", "becomesDate", "转正时间", DataType.DATA_TYPE_DATE, "", "true" }, { "32", "becomesState", "转正情况", DataType.DATA_TYPE_DICT, PropertyTypes.BECOMES_STATE, "true" }, { "33", "partyPosition", "党内主要职务", "", "", "true" },
				{ "34", "officeDate", "任职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "35", "trainingState", "培训情况", DataType.DATA_TYPE_DICT, PropertyTypes.TRAINING_STATE, "true" }, { "36", "rewardsPunishment", "奖惩情况", "", "", "true" }, { "37", "expertise", "专长", "", "", "true" }, { "38", "isFlowPartyCard", "是否持流动党员证", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "39", "flowPartyBranch", "流入地（单位）党支部", "", "", "true" },
				{ "40", "flowPartyBranchDate", "流入时间", DataType.DATA_TYPE_DATE, "", "true" }, { "41", "partyBranchContacts", "党支部联系人", "", "", "true" }, { "42", "branchTelephone", "固定电话（党支部联系人）", "", "", "true" }, { "43", "branchMobileNumber", "联系手机（党支部联系人)", "", "", "true" }, { "44", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getEnterpriseLegalPropertyArray()
	{
		String[][] excelColumArray = { { "0", "", "企业单位清单", "", "", "true", "0", "31" }, { "1", "companyName", "单位名称", "", "", "true" }, { "2", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "3", "companyAddress", "单位地址 ", "", "", "true" }, { "4", "companyType", "单位类别", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_COMPANYTYPE, "true" }, { "5", "businessLicenseNo", "营业执照号码", "", "", "true" }, { "6", "orgCode", "组织机构代码", "", "", "true" },
				{ "7", "corporateRepresentative", "法人代表", "", "", "true" }, { "8", "idCardNo", "法人身份证号码", "", "", "true" }, { "9", "industryInvolved", "所属行业", DataType.DATA_TYPE_DICT, PropertyTypes.INDUSTRY_INVOLVED, "true" }, { "10", "isKey", "是否重点单位", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "11", "registeredCapital", "注册资金", "", "", "true" }, { "12", "registeredCapitalCurrency", "注册资金币种", "", "", "true" },
				{ "13", "economicNature", "经济性质", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_ECONOMICNATURE, "true" }, { "14", "registrationDate", "注册日期", DataType.DATA_TYPE_DATE, "", "true" }, { "15", "expiryDate", "有效期至", DataType.DATA_TYPE_DATE, "", "true" }, { "16", "businessScope", "经营范围", "", "", "true" }, { "17", "registrationAddress", "注册地址", "", "", "true" }, { "18", "employeesNum", "从业人数", "", "", "true" }, { "19", "telephone", "单位电话", "", "", "true" },
				{ "20", "facsimile", "单位传真", "", "", "true" }, { "21", "companyWebsite", "公司网址", "", "", "true" }, { "22", "competentDepartment", "主管部门", "", "", "true" }, { "23", "supervisoryLevel", "管理级别", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_SUPERVISORYLEVEL, "true" }, { "24", "supervisoryDepartment", "管理部门", "", "", "true" }, { "25", "securityChief", "治安负责人", "", "", "true" },
				{ "26", "fireFightingLevel", "消防等级", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_FIREFIGHTINGLEVEL, "true" }, { "27", "remark", "备注", "", "", "true" } };
		
		return excelColumArray;
	}
	
	public static String[][] getLegalInstitutionPropertyArray()
	{
		String[][] excelColumArray = { { "0", "", "事业单位清单", "", "", "true", "0", "31" }, { "0", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "1", "name", "单位名称", "", "", "true" }, { "2", "address", "单位地址 ", "", "", "true" }, { "3", "orgCodeBusiness", "组织机构代码", "", "", "true" }, { "4", "workPhone", "单位电话", "", "", "true" }, { "5", "unitFax", "单位传真", "", "", "true" }, { "6", "legalRepresentative", "法人代表", "", "", "true" }, { "7", "legalIdNumber", "法人身份证号码", "", "", "true" },
				{ "8", "purposeAndScope", "宗旨和业务范围", "", "", "true" }, { "9", "fundSource", "经费来源", "", "", "true" }, { "10", "startUpCapital", "开办资金", "", "", "true" }, { "11", "employeesNumber", "从业人数", "", "", "true" }, { "12", "registrationAgency", "登记机构", "", "", "true" }, { "13", "establishmentDate", "成立日期", DataType.DATA_TYPE_DATE, "", "true" }, { "14", "remark", "备注", "", "", "true" } };
		
		return excelColumArray;
	}
	
	public static String[][] getLegalInstitutionImportArray()
	{
		String[][] excelColumArray = { { "0", "name", "单位名称", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "address", "单位地址 ", "", "", "true" }, { "3", "orgCodeBusiness", "组织机构代码", "", "", "true" }, { "4", "workPhone", "单位电话", "", "", "true" }, { "5", "unitFax", "单位传真", "", "", "true" }, { "6", "legalRepresentative", "法人代表", "", "", "true" }, { "7", "legalIdNumber", "法人身份证号码", "", "", "true" },
				{ "8", "purposeAndScope", "宗旨和业务范围", "", "", "true" }, { "9", "fundSource", "经费来源", "", "", "true" }, { "10", "startUpCapital", "开办资金", "", "", "true" }, { "11", "employeesNumber", "从业人数", "", "", "true" }, { "12", "registrationAgency", "登记机构", "", "", "true" }, { "13", "establishmentDate", "成立日期", DataType.DATA_TYPE_DATE, "", "true" }, { "14", "remark", "备注", "", "", "true" } };
		
		return excelColumArray;
	}
	
	public static String[][] getEnterpriseLegalImportArray()
	{
		String[][] excelColumArray = { { "0", "companyName", "单位名称", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "companyAddress", "单位地址 ", "", "", "true" }, { "3", "companyType", "单位类别", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_COMPANYTYPE, "true" }, { "4", "businessLicenseNo", "营业执照号码", "", "", "true" }, { "5", "orgCode", "组织机构代码", "", "", "true" }, { "6", "corporateRepresentative", "法人代表", "", "", "true" },
				{ "7", "idCardNo", "法人身份证号码", "", "", "true" }, { "8", "industryInvolved", "所属行业", DataType.DATA_TYPE_DICT, PropertyTypes.INDUSTRY_INVOLVED, "true" }, { "9", "isKey", "是否重点单位", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "registeredCapital", "注册资金", "", "", "true" }, { "11", "registeredCapitalCurrency", "注册资金币种", "", "", "true" }, { "12", "economicNature", "经济性质", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_ECONOMICNATURE, "true" },
				{ "13", "registrationDate", "注册日期", DataType.DATA_TYPE_DATE, "", "true" }, { "14", "expiryDate", "有效期至", DataType.DATA_TYPE_DATE, "", "true" }, { "15", "businessScope", "经营范围", "", "", "true" }, { "16", "registrationAddress", "注册地址", "", "", "true" }, { "18", "employeesNum", "从业人数", "", "", "true" }, { "18", "telephone", "单位电话", "", "", "true" }, { "19", "facsimile", "单位传真", "", "", "true" }, { "20", "companyWebsite", "公司网址", "", "", "true" },
				{ "21", "competentDepartment", "主管部门", "", "", "true" }, { "22", "supervisoryLevel", "管理级别", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_SUPERVISORYLEVEL, "true" }, { "23", "supervisoryDepartment", "管理部门", "", "", "true" }, { "24", "securityChief", "治安负责人", "", "", "true" }, { "25", "fireFightingLevel", "消防等级", DataType.DATA_TYPE_DICT, PropertyTypes.ACTUALCOMPANY_FIREFIGHTINGLEVEL, "true" }, { "26", "remark", "备注", "", "", "true" } };
		
		return excelColumArray;
	}
	
	public static String[][] getSocialGroupLegalPropertyArray()
	{
		String[][] excelColumArray = { { "0", "", "非企业、社会团体", "", "", "true", "0", "31" }, { "1", "companyName", "单位名称", "", "", "true" }, { "2", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "3", "companyAddress", "单位地址 ", "", "", "true" }, { "4", "corporateRepresentative", "法人代表", "", "", "true" }, { "5", "idCardNo", "法人身份证号码", "", "", "true" }, { "6", "registrationNumber", "登记证号码", "", "", "true" }, { "7", "setupDate", "成立日期", DataType.DATA_TYPE_DATE, "", "true" },
				{ "8", "startValidDate", "有效期开始时间 ", DataType.DATA_TYPE_DATE, "", "true" }, { "9", "endValidDate", "有效期结束时间", DataType.DATA_TYPE_DATE, "", "true" }, { "10", "telephone", "单位电话", "", "", "true" }, { "11", "facsimile", "单位传真", "", "", "true" }, { "12", "businessScope", "经营范围", "", "", "true" }, { "13", "businessManageUnits", "业务管理单位", "", "", "true" }, { "14", "contactName", "联系人姓名", "", "", "true" }, { "15", "workPersonnelTotal", "工作人员总数", "", "", "true" },
				{ "16", "fullTimeWorkPersonnelNumber", "专职工作人员数", "", "", "true" }, { "17", "partyMemberNumber", "党员数", "", "", "true" }, { "18", "acquireHonour", "获得荣誉", "", "", "true" }, { "19", "introduction", "简介", "", "", "true" }, { "20", "remark", "备注", "", "", "true" } };
		
		return excelColumArray;
	}
	
	public static String[][] getSocialGroupLegalImportArray()
	{
		String[][] excelColumArray = { { "0", "companyName", "单位名称", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "companyAddress", "单位地址 ", "", "", "true" }, { "3", "corporateRepresentative", "法人代表", "", "", "true" }, { "4", "idCardNo", "法人身份证号码", "", "", "true" }, { "5", "registrationNumber", "登记证号码", "", "", "true" }, { "6", "setupDate", "成立日期", DataType.DATA_TYPE_DATE, "", "true" },
				{ "7", "startValidDate", "有效期开始时间 ", DataType.DATA_TYPE_DATE, "", "true" }, { "8", "endValidDate", "有效期结束时间", DataType.DATA_TYPE_DATE, "", "true" }, { "9", "telephone", "单位电话", "", "", "true" }, { "10", "facsimile", "单位传真", "", "", "true" }, { "11", "businessScope", "经营范围", "", "", "true" }, { "12", "businessManageUnits", "业务管理单位", "", "", "true" }, { "13", "contactName", "联系人姓名", "", "", "true" }, { "14", "workPersonnelTotal", "工作人员总数", "", "", "true" },
				{ "15", "fullTimeWorkPersonnelNumber", "专职工作人员数", "", "", "true" }, { "16", "partyMemberNumber", "党员数", "", "", "true" }, { "17", "acquireHonour", "获得荣誉", "", "", "true" }, { "18", "introduction", "简介", "", "", "true" }, { "19", "remark", "备注", "", "", "true" } };
		
		return excelColumArray;
	}
	
	public static String[][] getBuilddatasTempImportArray()
	{
		String[][] excelColumArray = { { "0", "buildingname", "建筑物名称", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "type", "建筑物类型", DataType.DATA_TYPE_DICT, PropertyTypes.BUILDDATAS_TYPE, "true" }, { "3", "buildingaddress", "建筑物地址", "", "", "true" }, { "4", "owner", "业主", "", "", "true" }, { "5", "phone", "业主联系电话", "", "", "true" }, { "6", "responsibleperson", "物管负责人", "", "", "true" }, { "7", "managementPhone", "物管负责人联系电话", "", "", "true" },
				{ "8", "unitName", "物管单位名称", "", "", "true" }, { "9", "buildingstructures", "建筑结构", DataType.DATA_TYPE_DICT, PropertyTypes.BUILDING_STRUCTURE, "true" }, { "10", "yearBuilt", "建成年份", DataType.DATA_TYPE_DATE, "", "true" }, { "11", "aliasReferred", "别名简称", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getDemobilizedDryImportArrayNap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "idCardNo", "身份证号码", "", "", "true" }, { "3", "position", "职务", "", "", "true" }, { "4", "transferDate", "转职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "5", "communityContacts", "社区联系人", "", "", "true" }, { "6", "phone", "联系人电话", "", "", "true" }, { "7", "businessRemark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getDemobilizedDryImportArraySap()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "isHaveHouse", "是否有固定地址", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "10", "houseCode", "房屋编号", "", "", "true" }, { "11", "noHouseReason", "无房原因", "", "", "true" }, { "12", "otherAddress", "临时居所", "", "", "true" }, { "13", "usedName", "曾用名", "", "", "true" }, { "14", "workUnit", "工作单位或就读学校", "", "", "true" }, { "15", "telephone", "联系电话", "", "", "true" }, { "16", "mobileNumber", "联系手机", "", "", "true" },
				{ "17", "email", "电子邮件", "", "", "true" }, { "18", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "19", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "20", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "21", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "22", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "23", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "24", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "25", "stature", "身高", "", "", "true" }, { "26", "position", "职务", "", "", "true" }, { "27", "transferDate", "转职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "28", "communityContacts", "社区联系人", "", "", "true" },
				{ "29", "phone", "联系人电话", "", "", "true" }, { "30", "businessRemark", "业务备注", "", "", "true" }, { "31", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getDemobilizedDryImportArrayNdt()
	{
		String[][] excelColumArray = { { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "province", "省", "", "", "true" }, { "6", "city", "市", "", "", "true" }, { "7", "district", "县", "", "", "true" },
				{ "8", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "9", "currentAddress", "常住地址", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" }, { "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "position", "职务", "", "", "true" }, { "25", "transferDate", "转职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "communityContacts", "社区联系人", "", "", "true" }, { "27", "phone", "联系人电话", "", "", "true" }, { "28", "businessRemark", "业务备注", "", "", "true" }, { "29", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getDemobilizedDryPropertyArraySlf()
	{
		String[][] excelColumArray = { { "0", "", "军转干人员清单", "", "", "true", "0", "27" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "currentAddress", "常住地址", "", "", "true" }, { "8", "otherAddress", "临时居所", "", "", "true" }, { "9", "usedName", "曾用名", "", "", "true" }, { "10", "workUnit", "工作单位或就读学校", "", "", "true" }, { "11", "telephone", "联系电话", "", "", "true" }, { "12", "mobileNumber", "联系手机", "", "", "true" }, { "13", "email", "电子邮件", "", "", "true" }, { "14", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" },
				{ "15", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "16", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "17", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" }, { "18", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "19", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" },
				{ "20", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "21", "stature", "身高", "", "", "true" }, { "22", "position", "职务", "", "", "true" }, { "23", "transferDate", "转职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "24", "communityContacts", "社区联系人", "", "", "true" }, { "25", "phone", "联系人电话", "", "", "true" }, { "26", "businessRemark", "业务备注", "", "", "true" }, { "27", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getDemobilizedDryPropertyArrayRla()
	{
		String[][] excelColumArray = { { "0", "", "军转干人员清单", "", "", "true", "0", "29" }, { "0", "name", "姓名", "", "", "true" }, { "1", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "2", "gender", "性别", DataType.DATA_TYPE_DICT, PropertyTypes.GENDER, "true" }, { "3", "birthday", "出生日期", DataType.DATA_TYPE_DATE, "", "true" }, { "4", "idCardNo", "身份证号码", "", "", "true" }, { "5", "detailNativeAddress", "户籍地址", "", "", "true" },
				{ "6", "nativePlaceAddress", "户籍地详址", "", "", "true" }, { "7", "houseCode", "房屋编号", "", "", "true" }, { "8", "currentAddress", "常住地址", "", "", "true" }, { "9", "noHouseReason", "无房原因", "", "", "true" }, { "10", "otherAddress", "临时居所", "", "", "true" }, { "11", "usedName", "曾用名", "", "", "true" }, { "12", "workUnit", "工作单位或就读学校", "", "", "true" }, { "13", "telephone", "联系电话", "", "", "true" }, { "14", "mobileNumber", "联系手机", "", "", "true" },
				{ "15", "email", "电子邮件", "", "", "true" }, { "16", "nation", "民族", DataType.DATA_TYPE_DICT, PropertyTypes.NATION, "true" }, { "17", "politicalBackground", "政治面貌", DataType.DATA_TYPE_DICT, PropertyTypes.POLITICAL_BACKGROUND, "true" }, { "18", "schooling", "文化程度", DataType.DATA_TYPE_DICT, PropertyTypes.SCHOOLING, "true" }, { "19", "career", "职业", DataType.DATA_TYPE_DICT, PropertyTypes.CAREER, "true" },
				{ "20", "maritalState", "婚姻状况", DataType.DATA_TYPE_DICT, PropertyTypes.MARITAL_STATUS, "true" }, { "21", "bloodType", "血型", DataType.DATA_TYPE_DICT, PropertyTypes.BLOOD_TYPE, "true" }, { "22", "faith", "宗教信仰", DataType.DATA_TYPE_DICT, PropertyTypes.FAITH, "true" }, { "23", "stature", "身高", "", "", "true" }, { "24", "position", "职务", "", "", "true" }, { "25", "transferDate", "转职日期", DataType.DATA_TYPE_DATE, "", "true" }, { "26", "communityContacts", "社区联系人", "", "", "true" },
				{ "27", "phone", "联系人电话", "", "", "true" }, { "28", "businessRemark", "业务备注", "", "", "true" }, { "29", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getDustbinPropertyArray(String partyName)
	{
		String[][] excelColumArray = { { "0", "", partyName, "", "", "true", "0", "10" }, { "0", "organization", "所属网格", DataType.DATA_TYPE_ORG, "", "true" }, { "1", "partType", "部件类型", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.PART_TYPE, "true" }, { "2", "partName", "部件名称", DataType.DATA_TYPE_DICT, PropertyTypesYinchuan.PART_NAME, "true" }, { "3", "dustbinCode", "部件标识码", "", "", "true" }, { "4", "address", "地址", "", "", "true" }, { "5", "deptName", "主管部门", "", "", "true" },
				{ "6", "ownershipUnitName", "权属单位", "", "", "true" }, { "7", "maintenanceUnitName", "护养单位", "", "", "true" }, { "8", "logOutTime", "注销时间", DataType.DATA_TYPE_DATE, "", "true" }, { "9", "logOutReason", "注销原因", "", "", "true" }, { "10", "remark", "备注", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getUserPropertyArray()
	{
		String[][] excelColumArray = {
				{ "0", "", "手机账号清单", "", "", "true", "0", "8" },
				// { "0", "organization", "所属网格", DataType.DATA_TYPE_ORG, "",
				// "true" },
				{ "0", "userName", "用户名", "", "", "true" }, { "1", "name", "用户姓名", "", "", "true" }, { "2", "workPhone", "工作电话", "", "", "true" }, { "3", "mobile", "手机", "", "", "true" }, { "4", "orgInternalCode", "是否已匹配网格", DataType.DATA_TYPE_MATCHINGTOORG, "", "true" }, { "5", "admin", "是否超级管理员", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "6", "validatorImsi", "是否验证IMSI号", DataType.DATA_TYPE_BOOLEAN, "", "true" }, { "7", "imsi", "imsi码", "", "", "true" },
				{ "8", "workCompany", "工作单位或就读学校", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getUserCountPropertyArray()
	{
		String[][] excelColumArray = { { "0", "", "账号统计清单", "", "", "true", "0", "2" }, { "0", "organization", "所在组织机构", DataType.DATA_TYPE_ORG, "", "true" }, { "1", "pcUserCount", "PC账号数", "", "", "true" }, { "2", "mobileUserCount", "手机账号数", "", "", "true" } };
		return excelColumArray;
	}
	
	public static String[][] getUserCountAboutPropertyArray()
	{
		String[][] excelColumArray = {
				{ "0", "", "账号统计清单", "", "", "true", "0", "7" },
				{ "0", "orgName", "所属机构", "", "", "true"},
				{ "1", "userName", "用户名", "", "", "true" },
				{ "2", "name", "姓名", "", "", "true" },
				{ "3", "activationTime", "激活时间", "", "", "true" },
				{ "4", "lastLoginTime", "最后登录时间", "", "", "true" },
				{ "5", "createDate", "新增时间", "", "", "true" },
				{ "6", "roles", "所在岗位", "", "", "true" },
				{ "7", "pcOrMobile", "账号类型", "", "", "true" } };
		return excelColumArray;
	}
}
