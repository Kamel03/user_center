package com.tianque.core.systemLog.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tianque.baseInfo.companyPlace.constacts.ModulTypes;

public class ModelType {
	// 第一级大类
	public static final int SYSTEM_LOG_TYPE = 1;// 系统管理模块
	public static final String SYSTEM_LOG_TYPE_DISPLAYNAME = "系统管理";
	public static final String USER = "用户管理";
	public static final String DEPT = "部门管理";
	public static final String ROLES = "岗位管理";
	public static final String LOGGIN = "系统登录";
	public static final String MOBILEINFOMANAGE = "手机信息管理";
	public static final String PERMANENTADDRESS = "户籍地管理";
	public static final String VERSION = "新版功能";
	public static final String SYSTEMPROPERTYDICT = "系统属性管理";
	public static final String ISSUEHANDLETYPES = "事件处理类别管理";
	public static final String USERCOUNTMANAGE = "账号统计";

	public static final int COMPANYPALCE_LOG_TYPE = 2;// 单位场所模块
	public static final String COMPANYPALCE_LOG_TYPE_DISPLAYNAME = "单位场所";
	public static final String COMPANYPALCE = ModulTypes.CompanyPlace;
	public static final String ENTERPRISEDOWN = ModulTypes.EnterpriseDown;
	public static final String ENTERPRISE = ModulTypes.Enterprise;
	public static final String IMPORTANTPLACE = "重点场所";
	public static final String PUBLICPLACE = ModulTypes.PublicPlace;
	public static final String TRAFFICPLACE = ModulTypes.TrafficPlace;
	public static final String ENTERTAINMENTPLACE = ModulTypes.EntertainmentPlace;
	public static final String TRADEPLACE = ModulTypes.TradePlace;
	public static final String INTERNETSERVICESPLACE = ModulTypes.InternetServicesPlace;
	public static final String ACCOMMODATIONSERVICESPLACE = ModulTypes.AccommodationServicesPlace;
	public static final String FOODSERVICESPLACE = ModulTypes.FoodServicesPlace;
	public static final String TRAVELINGPLACE = ModulTypes.TravelingPlace;
	public static final String CONSTRUCTIONPLACE = ModulTypes.ConstructionPlace;
	public static final String OTHERPLACE = ModulTypes.OtherPlace;

	public static final String PartyGovernmentOrganCompany = ModulTypes.PartyGovernmentOrganCompany;
	public static final String EducationCompany = ModulTypes.EducationCompany;
	public static final String MedicalHygieneCompany = ModulTypes.MedicalHygieneCompany;
	public static final String DangerousStoreCompany = ModulTypes.DangerousStoreCompany;
	public static final String OtherCompany = ModulTypes.OtherCompany;

	public static final int BASE_LOG_TYPE = 3;// 基础信息模块
	public static final String BASE_LOG_TYPE_DISPLAYNAME = "基础信息";
	public static final String BASE = "基础信息";

	public static final int ACTUAL_POPULATION_LOG_TYPE = 4;// 人口模块
	public static final String ACTUAL_POPULATION_LOG_TYPE_DISPLAYNAME = "人口信息";
	public static final String IMPORTANT = "特殊人群";

	public static final int ACTUAL_HOUSE_LOG_TYPE = 5;// 实有房屋模块
	public static final String ACTUAL_HOUSE_LOG_TYPE_DISPLAYNAME = "房屋信息";
	public static final String ACTUALHOUSE = "房屋信息";
	public static final String TEMPORARYRESIDENT = "出租房";
	public static final String BUILDDATA = "楼宇信息";

	public static final int ORG_LOG_TYPE = 6;// 组织机构模块模块
	public static final String ORG_LOG_TYPE_DISPLAYNAME = "组织机构";
	public static final String NEWSOCIETYFEDERATION = "社会组织";

	public static final int ISSUE_LOG_TYPE = 7;// 事件处理模块
	public static final String ISSUE_LOG_TYPE_DISPLAYNAME = "事件处理";
	public static final String EVENTPROCESS = "事件处理";

	public static final int OTHER_LOG_TYPE = 8;// 其他模块
	public static final String OTHER_LOG_TYPE_DISPLAYNAME = "其他";
	public static final String AREAINFO = "辖区信息";
	public static final String DAILYWORK = "日常工作";

	//岗位权限日志操作类别
	public static final Integer ROLE_OPEARTE_TYPE=0;//删除
	
	// 第一级
	public static final Map<String, Integer> getTopModelTypes() {
		Map<String, Integer> modelTypes = new HashMap<String, Integer>();
		modelTypes.put(SYSTEM_LOG_TYPE_DISPLAYNAME, SYSTEM_LOG_TYPE);
		modelTypes
				.put(COMPANYPALCE_LOG_TYPE_DISPLAYNAME, COMPANYPALCE_LOG_TYPE);
		modelTypes.put(BASE_LOG_TYPE_DISPLAYNAME, BASE_LOG_TYPE);
		modelTypes.put(ACTUAL_POPULATION_LOG_TYPE_DISPLAYNAME,
				ACTUAL_POPULATION_LOG_TYPE);
		modelTypes
				.put(ACTUAL_HOUSE_LOG_TYPE_DISPLAYNAME, ACTUAL_HOUSE_LOG_TYPE);
		modelTypes.put(ORG_LOG_TYPE_DISPLAYNAME, ORG_LOG_TYPE);
		modelTypes.put(ISSUE_LOG_TYPE_DISPLAYNAME, ISSUE_LOG_TYPE);
		modelTypes.put(OTHER_LOG_TYPE_DISPLAYNAME, OTHER_LOG_TYPE);
		return modelTypes;
	}

	// 第二级
	public static List<String> secondModelTypes = new ArrayList<String>();

	public static final List<String> getSecondModelTypes(Integer level) {
		switch (level) {
		case SYSTEM_LOG_TYPE:
			secondModelTypes.clear();
			// secondModelTypes.add();
			secondModelTypes.add(ISSUEHANDLETYPES);
			secondModelTypes.add(SYSTEMPROPERTYDICT);
			secondModelTypes.add(VERSION);
			secondModelTypes.add(PERMANENTADDRESS);
			secondModelTypes.add(MOBILEINFOMANAGE);
			secondModelTypes.add(LOGGIN);
			secondModelTypes.add(ROLES);
			secondModelTypes.add(DEPT);
			secondModelTypes.add(USER);
			secondModelTypes.add(USERCOUNTMANAGE);
			break;
		case COMPANYPALCE_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(PartyGovernmentOrganCompany);
			secondModelTypes.add(EducationCompany);
			secondModelTypes.add(MedicalHygieneCompany);
			secondModelTypes.add(DangerousStoreCompany);
			secondModelTypes.add(OtherCompany);
			secondModelTypes.add(ENTERPRISE);
			secondModelTypes.add(ENTERPRISEDOWN);
			secondModelTypes.add(IMPORTANTPLACE);
			secondModelTypes.add(PUBLICPLACE);
			secondModelTypes.add(TRAFFICPLACE);
			secondModelTypes.add(ENTERTAINMENTPLACE);
			secondModelTypes.add(TRADEPLACE);
			secondModelTypes.add(INTERNETSERVICESPLACE);
			secondModelTypes.add(ACCOMMODATIONSERVICESPLACE);
			secondModelTypes.add(FOODSERVICESPLACE);
			secondModelTypes.add(TRAVELINGPLACE);
			secondModelTypes.add(CONSTRUCTIONPLACE);
			secondModelTypes.add(OTHERPLACE);
			secondModelTypes.add(COMPANYPALCE);
			break;
		case BASE_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(BASE);
			break;
		case ACTUAL_POPULATION_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(IMPORTANT);
			break;
		case ACTUAL_HOUSE_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(BUILDDATA);
			secondModelTypes.add(TEMPORARYRESIDENT);
			secondModelTypes.add(ACTUALHOUSE);
			break;
		case ORG_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(NEWSOCIETYFEDERATION);
			break;
		case ISSUE_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(EVENTPROCESS);
			break;
		case OTHER_LOG_TYPE:
			secondModelTypes.clear();
			secondModelTypes.add(AREAINFO);
			secondModelTypes.add(DAILYWORK);
			break;
		default:
			secondModelTypes.clear();
			break;
		}
		return secondModelTypes;
	}

	public static final List<String> getModelTypes() {
		List<String> modelTypes = new ArrayList<String>();
		modelTypes.add(USER);
		modelTypes.add(DEPT);
		modelTypes.add(ROLES);
		modelTypes.add(LOGGIN);
		modelTypes.add(BASE);
		modelTypes.add(IMPORTANT);
		modelTypes.add(IMPORTANTPLACE);
		modelTypes.add(TEMPORARYRESIDENT);
		modelTypes.add(ENTERPRISE);
		modelTypes.add(NEWSOCIETYFEDERATION);
		modelTypes.add(AREAINFO);
		modelTypes.add(MOBILEINFOMANAGE);
		modelTypes.add(EVENTPROCESS);
		modelTypes.add(DAILYWORK);
		modelTypes.add(ENTERPRISEDOWN);
		modelTypes.add(USERCOUNTMANAGE);
		return modelTypes;
	}

}
