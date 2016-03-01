package com.tianque.core.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tianque.datatransfer.DataTransferConstants;
import com.tianque.domain.property.PropertyTypesYinchuan;

public class BaseInfoTables {

	private final static Map<String, String> keyTables = new HashMap<String, String>();
	/** 人员表名集合 */
	public final static Map<String, String> populationKeyTables = new HashMap<String, String>();
	/** 重点人员表名集合 */
	public final static Map<String, String> importantsPersonnelTables = new HashMap<String, String>();
	/** 实有人口表名集合 */
	public final static Map<String, String> personnelTables = new HashMap<String, String>();
	/** 实有房屋表名集合 */
	public final static Map<String, String> actualHouseTables = new HashMap<String, String>();
	/** 重点场所表名集合 */
	public final static Map<String, String> importantPlaceTables = new HashMap<String, String>();
	/** 实有单位表名集合 */
	public final static Map<String, String> actualCompanyTables = new HashMap<String, String>();
	/** 两新组织表名 */
	public final static Map<String, String> doubleNewTables = new HashMap<String, String>();
	/** 民政表名集合 */
	public final static Map<String, String> civil = new HashMap<String, String>();
	/** 计生表名集合 */
	public final static Map<String, String> birth = new HashMap<String, String>();
	/** 失业人员表名集合 */
	public final static Map<String, String> unemployed = new HashMap<String, String>();
	/** 关怀人员表名集合 */
	public final static Map<String, String> lovingCare = new HashMap<String, String>();
	/** FXJ人员表名集合 */
	public final static Map<String, String> fxj = new HashMap<String, String>();
	/** 所有业务人员表名集合 */
	public final static Map<String, String> bussinessPopulationTables = new HashMap<String, String>();
	/** 企业表名集合（包含规上规下） */
	public final static Map<String, String> enterpriseTables = new HashMap<String, String>();
	public final static Map<String, String> grassrootOrganizationTables = new HashMap<String, String>();
	public final static Map<String, String> helpType = new HashMap<String, String>();

	private final static Map<String, String> keyNames = new HashMap<String, String>();

	public final static Map<String, Map<String, String>> keyTablesMaps = new HashMap<String, Map<String, String>>();

	/** 与户主关系的各种集合 */
	public final static Map<String, String> householdStafftypes = new HashMap<String, String>();
	/** 城市部件类别集合 */
	public final static Map<String, String> digitalCityType = new HashMap<String, String>();
	public static final String PUBLICFACILITIES_KEY = "publicFacilities";// 公共设施类
	public static final String ROADTRAFFIC_KEY = "roadTraffic";// 道路交通类
	public static final String CITYENVIRONMRNT_KEY = "cityEnvironmrnt";// 市容环境类
	public static final String LANDSCAPING_KEY = "landscaping";// 园林绿化类
	public static final String HOUSELAND_KEY = "houseLand";// 房屋土地类
	public static final String EXPANSIONCOMPONENTS_KEY = "expansionComponents";// 扩展部件类
	public static final String OTHERFACILITIES_KEY = "otherFacilities";// 其他设施类

	public static final String RENHUTONGZAI_KEY = "renhutongzai";// 人户同在
	public static final String HUZAIRENBUZAI_KEY = "huzairenbuzai";// 户在人不在
	public static final String RENZAIHUBUZAI_KEY = "renzaihubuzai";// 人在户不在

	public static final String RENHUTONGZAI = "人户同在";// 人户同在
	public static final String HUZAIRENBUZAI = "户在人不在";// 户在人不在
	public static final String RENZAIHUBUZAI = "人在户不在";// 人在户不在

	public static final String POPULATIONKEYTABLES_KEY = "populationKeyTables";
	public static final String POPULATION_KEY = "POPULATION";
	public static final String CIVIL_KEY = "CIVIL";
	public static final String BIRTH_KEY = "BIRTH";
	public static final String UNEMPLOYED_KEY = "UNEMPLOY";
	public static final String LOVINGCARE_KEY = "LOVINGCARE";
	public static final String ACTUALPOPULATION_KEY = "actualPopulation";
	public static final String ENTERPRISE_KEY = "ENTERPRISE";

	public static final String HOUSEHOLDSTAFF_KEY = "householdStaff";
	public static final String FLOATINGPOPULATION_KEY = "floatingPopulation";
	public static final String UNSETTED_POPULATION = "unsettledPopulation";
	public static final String UNSETTEDPOPULATION_KEY = "unsettledPopulation";
	public static final String OVERSEAPERSONNEL_KEY = "overseaStaff";

	public static final String NURTURESWOMEN_KEY = "nurturesWomen";

	public static final String OPTIMALOBJECT_KEY = "optimalObject";
	public static final String ELDERLYPEOPLE_KEY = "elderlyPeople";
	public static final String HANDICAPPED_KEY = "handicapped";
	public static final String AIDNEEDPOPULATION_KEY = "aidNeedPopulation";

	public static final String DANGEROUSGOODSPRACTITIONER_KEY = "dangerousGoodsPractitioner";
	public static final String DRUGGY_KEY = "druggy";
	public static final String IDLEYOUTH_KEY = "idleYouth";
	public static final String MENTALPATIENT_KEY = "mentalPatient";
	public static final String POSITIVEINFO_KEY = "positiveInfo";
	public static final String RECTIFICATIVEPERSON_KEY = "rectificativePerson";
	public static final String SUPERIORVISIT_KEY = "superiorVisit";
	public static final String AIDSPOPULATIONS_KEY = "aidspopulation"; // 艾滋病人员

	public static final String PARTYMEMBERINFO_KEY = "PARTYMEMBERINFO";
	public static final String PARTYORGACTIVITY_KEY = "PARTYORGACTIVITY";
	public static final String OTHERATTENTIONPERSONNEL_KEY = "otherAttentionPersonnel";
	public static final String SPECIALCAREGROUPS_KEY = "SPECIALCAREGROUPS";
	public static final String NEWSOCIETYFEDERATION_KEY = "NEWSOCIETYFEDERATION";
	public static final String NEWSOCIETYORGANIZATIONS_KEY = "NEWSOCIETYORGANIZATIONS";

	// 基本情况报表 所需要的KEY
	public static final String RENTALHOUSE = "rentalHouse";
	public static final String NEWSECURITYKEY = "NEWSECURITYKEY";
	// FXJ
	public static final String FPERSONNEL_KEY = "fPersonnel";
	public static final String FPERSONNEL_DISPLAYNAME = "F人员";
	public static final String QPERSONNEL_KEY = "qPersonnel";
	public static final String QPERSONNEL_DISPLAYNAME = "Q人员";
	public static final String MPERSONNEL_KEY = "mPersonnel";
	public static final String MPERSONNEL_DISPLAYNAME = "M人员";

	public static final String LETTINGHOUSE_KEY = "LETTINGHOUSE";
	public static final String OTHERLOCALE_KEY = "OTHERLOCALE";
	public static final String OTHER_LOCALE_KEY = "OTHER_LOCALE";
	public static final String CONSTRUCTIONUNIT_KEY = "CONSTRUCTIONUNIT";
	public static final String SCHOOL_KEY = "SCHOOL";
	public static final String COMMONCOMPLEXPLACE_KEY = "COMMONCOMPLEXPLACE";
	public static final String ENTERPRISEKEY_KEY = "ENTERPRISEKEY";
	public static final String ENTERPRISEDOWNKEY_KEY = "ENTERPRISEDOWNKEY";
	public static final String SAFETYPRODUCTIONKEY_KEY = "SAFETYPRODUCTIONKEY";
	public static final String FIRESAFETYKEY_KEY = "FIRESAFETYKEY";
	public static final String SECURITYKEY_KEY = "SECURITYKEY";
	public static final String POORPEOPLE_KEY = "POORPEOPLE";
	public static final String POLLUTIONSOURCE_KEY = "POLLUTIONSOURCE";

	public static final String SCENICTRAFFIC_KEY = "SCENICTRAFFIC";
	public static final String SCENICEQUIPMENT_KEY = "SCENICEQUIPMENT";
	public static final String SCENICSPOTS_KEY = "SCENICSPOTS";

	public static final String IMPORTANTPERSONNEL_KEY = "IMPORTANTPERSONNEL";
	public static final String IMPORTANTPLACE_KEY = "IMPORTANTPLACE";

	public static final String PROVINCEUSER_KEY = "PROVINCEUSER";
	public static final String CITYUSER_KEY = "CITYUSER";
	public static final String DISTRICTUSER_KEY = "DISTRICTUSER";
	public static final String TOWNUSER_KEY = "TOWNUSER";
	public static final String VILLAGEUSER_KEY = "VILLAGEUSER";
	public static final String INHABITANT_KEY = "INHABITANT";
	public static final String ESTATEINFORMATION_KEY = "ESTATEINFORMATION";
	public static final String ACTUALHOUSE_KEY = "ACTUALHOUSE";
	public static final String RENTALHOUSE_KEY = "RENTALHOUSE";
	public static final String HOUSEINFO_KEY = "houseinfo";
	public static final String ACTUALCOMPANY_KEY = "actualCompany";
	public static final String DOUBLENEW_KEY = "doubleNew";
	public static final String INCIDENT_KEY = "INCIDENTTYPE";
	public static final String PUBLICPLACE_KEY = "PUBLICPLACE";
	public static final String PUBLICCOMPLEXPLACES_KEY = "PUBLICCOMPLEXPLACES";
	public static final String INTERNETBAR_KEY = "INTERNETBAR";
	public static final String DANGEROUSCHEMICALSUNIT_KEY = "DANGEROUSCHEMICALSUNIT";

	public static final String COMPOSITE_KEY = "COMPOSITE";
	public static final String MASSES_KEY = "MASSES";
	public static final String POSTULANT_KEY = "POSTULANT";
	public static final String LEADERGROUP_KEY = "LEADERGROUP";
	public static final String GRASSROOTSPARTY_KEY = "GRASSROOTSPARTY";
	public static final String AUTONOMYORG_KEY = "AUTONOMYORG";
	public static final String HOUSINGINFOTYPE_KEY = "HOUSINGTYPE";

	public static final String LEADER_VIEW = "LeaderView";

	// 新经济组织表
	public static final String NEWSOCIETYORGANIZATIONS = "newSocietyOrganizations";

	public static final String NEWSOCIETYORGANIZATION_DISPLAYNAME = "社会组织";
	// 非公有制经济组织表
	public static final String NEWECONOMICORGANIZATIONS = "newEconomicOrganizations";

	public static final String NEWECONOMICORGANIZATION_DISPLAYNAME = "非公有制经济组织";

	// 综治组织
	public static final String COMPREHENSIVEORGANIZATION_DISPLAYNAME = "综治组织";
	// 基层党组织
	public static final String BASICLEVELORGANIZATION_DISPLAYNAME = "基层党委";
	// 网格化管理服务团队
	public static final String GRIDORGANIZATION_DISPLAYNAME = "网格化管理服务团队";
	// 其他
	public static final String OTHERORGANIZATION_DISPLAYNAME = "其他";
	// 专项工作领导小组
	public static final String SPECIALORGANIZATION_DISPLAYNAME = "专项工作领导小组";

	// 部门党委
	public static final String DEPARTMENTOFPARTY_DISPLAYNAME = "部门党委";
	// 党委部门
	public static final String PARTYCOMMITTEE_DISPLAYNAME = "党委部门";

	// 手机账号
	public static final String MOBILEUSER_KEY = "MOBILEUSER";
	public static final String MOBILEUSER_DISPLAYNAME = "手机账号";
	// 四支队伍成员
	public static final String FOUR_TEAM_MEMBERS_KEY = "FOURTEAMMEMBERS";
	public static final String FOUR_TEAM_MEMBERS_DISPLAYNAME = "成员信息";
	// 事件对接
	public static final String ISSUE_JOINT_KEY = "ISSUEJOINT";
	public static final String ISSUE_JOINT_DISPLAYNAME = "对接事件";

	public static final String NEWECONOMICORGANIZATIONS_KEY = "NEWECONOMICORGANIZATIONS";
	public static final String UNEMPLOYEDPEOPLE_KEY = "unemployedPeople";
	public static final String NURTURESWOMEN_DISPLAYNAME = "育妇";
	public static final String POPULATION_DISPLAYNAME = "人口信息";
	public static final String FLOATINGPOPULATION_DISPLAYNAME = "流动人口";
	public static final String UNSETTED_POPULATIONNAME = "未落户人口";
	public static final String HOUSEHOLD_STAFFNAME = "户籍人口";
	public static final String DRUGGY_DISPLAYNAME = "吸毒人员";
	public static final String OTHERATTENTIONPERSONNEL_DISPLAYNAME = "其他人员";
	public static final String OVERSEAPERSONNEL_DISPLAYNAME = "境外人员";
	public static final String UNSETTEDPOPULATION_DISPLAYNAME = "未落户人口";
	public static final String DANGEROUSGOODSPRACTITIONER_DISPLAYNAME = "危险品从业人员";
	public static final String IDLEYOUTH_DISPLAYNAME = "重点青少年";
	public static final String AIDNEEDPOPULATION_DISPLAYNAME = "需救助人员";

	public static final String OPTIMALOBJECT_DISPLAYNAME = "优抚对象";
	public static final String MENTALPATIENT_DISPLAYNAME = "精神病人员";
	public static final String POSITIVEINFO_DISPLAYNAME = "刑释人员";
	public static final String AIDSPOPULATIONS_DISPLAYNAME = "艾滋病人员";
	public static final String RECTIFICATIVEPERSON_DISPLAYNAME = "社区矫正人员";
	public static final String RESIDENT_DISPLAYNAME = "户籍人口";
	public static final String SUPERIORVISIT_DISPLAYNAME = "重点上访人员";
	public static final String TRAMPRESIDENT_DISPLAYNAME = "流动人口";
	public static final String NEWSOCIETYFEDERATION_DISPLAYNAME = "社会组织";
	public static final String NEWSOCIETYORGANIZATIONS_DISPLAYNAME = "社会组织";

	public static final String LETTINGHOUSE_DISPLAYNAME = "出租房";
	public static final String OTHERLOCALE_DISPLAYNAME = "其他场所";
	public static final String CONSTRUCTIONUNIT_DISPLAYNAME = "建筑施工单位";
	public static final String SCHOOL_DISPLAYNAME = "学校";
	public static final String ENTERPRISEKEY_DISPLAYNAME = "规上企业";
	public static final String ENTERPRISEDOWNKEY_DISPLAYNAME = "规下企业";
	public static final String SAFETYPRODUCTIONKEY_DISPLAYNAME = "安全生产重点";
	public static final String FIRESAFETYKEY_DISPLAYNAME = "消防安全重点";
	public static final String SECURITYKEY_DISPLAYNAME = "治安重点";
	public static final String POORPEOPLE_DISPLAYNAME = "需救助人员";
	public static final String POLLUTIONSOURCE_DISPLAYNAME = "污染源";
	public static final String SCENICTRAFFIC_DISPLAYNAME = "景区交通";
	public static final String SCENICEQUIPMENT_DISPLAYNAME = "配套设施";
	public static final String SCENICSPOTS_DISPLAYNAME = "旅游景点";

	public static final String IMPORTANTPERSONNEL_DISPLAYNAME = "特殊人群";
	public static final String IMPORTANTPLACE_DISPLAYNAME = "重点场所";
	public static final String INHABITANT_DISPLAYNAME = "常住人口";
	public static final String HANDICAPPED_DISPLAYNAME = "残疾人";
	public static final String ESTATEINFORMATION_DISPLAYNAME = "房产信息";
	public static final String ELDERLYPEOPLE_DISPLAYNAME = "老年人";
	public static final String CIVIL_DISPLAYNAME = "优抚对象";
	public static final String BIRTH_DISPLAYNAME = "育龄妇女";
	public static final String UNEMPLOYED_DISPLAYNAME = "失业人员";
	// public static final String PROTECTIONKEY_KEY="PROTECTIONKEY";
	public static final String HOSPITAL_KEY = "HOSPITAL";
	// public static final String SPECIALTRADE_KEY="SPECIALTRADE";
	// public static final String DANGERTRAMPRESIDENT_KEY="DANGERTRAMPRESIDENT";
	public static final String ORGANIZATION_KEY = "ORGANIZATION";

	public static final String COMPREHENSIVE = "综治办";
	public static final String COMMITTEE = "综治委";
	public static final String MASSEDUTY = "群防群治队伍类型";
	public static final String PRIMARYORGANIZATIONS = "组织大类";
	public static final String DEPARTMENTPARTY = "部门党委组织类别";
	public static final String ZUZHIBU = "组织部";
	public static final String XUANCHUANBU = "宣传部";
	public static final String TONGZHANBU = "统战部";
	public static final String ZHEGNFAWEI = "政法委";
	public static final String FANGXIEBAN = "防邪办";
	public static final String XINFANGBAN = "信访办";
	public static final String ZZCYDANWEI = "综治成员单位";
	public static final String ZXGZLDXIAOZU = "专项工作领导小组";

	public static final String NEWECONOMICORGANIZATIONS_DISPLAYNAME = "非公有制经济组织";
	public static final String UNEMPLOYEDPEOPLE_DISPLAYNAME = "失业人员";
	public static final String PROVINCEUSER_DISPLAYNAME = "省级用户";
	public static final String CITYUSER_DISPLAYNAME = "市级用户";
	public static final String DISTRICTUSER_DISPLAYNAME = "县级用户";
	public static final String TOWNUSER_DISPLAYNAME = "乡镇用户";
	public static final String VILLAGEUSER_DISPLAYNAME = "网格用户";

	public static final String COMPOSITE_DISPLAYNAME = "基层综治组织";
	public static final String MASSES_DISPLAYNAME = "群防群治队伍";
	public static final String POSTULANT_DISPLAYNAME = "社会志愿者队伍";
	public static final String LEADERGROUP_DISPLAYNAME = "专项工作领导小组";
	public static final String GRASSROOTSPARTY_DISPLAYNAME = "基层党组织";
	public static final String AUTONOMYORG_DISPLAYNAME = "基层自治组织";
	public static final String ACTUALHOUSE_DISPLAYNAME = "房屋信息";
	public static final String RENTALHOUSE_DISPLAYNAME = "出租房";

	public static final String ACTUALCOMPANY_DISPLAYNAME = "实有单位";
	public static final String DOUBLENEW_DISPLAYNAME = "两新组织";
	public static final String ENTERPRISE_DISPLAYNAME = "企业";
	public static final String INCIDENTTYPE_DISPLAYNAME = "应急系统管理";

	public static final String PUBLICPLACE_DISPLAYNAME = "公共场所";
	public static final String PUBLICCOMPLEXPLACES_DISPLAYNAME = "公共复杂场所";
	public static final String DANGEROUSCHEMICALSUNIT_DISPLAYNAME = "危险化学品单位";
	public static final String INTERNETBAR_DISPLAYNAME = "网吧";
	public static final String PARTYMEMBERINFO_DISPLAYNAME = "党员信息";

	public static final String BUILDDATAS_DISPLAYNAME = "楼宇";
	public static final String BUILDDATAS_DISPLAYNAMEINFO = "楼宇信息";
	public static final String BUILDDATAS_TEMP_DISPLAYNAME = "数据管理楼宇信息";

	public static final String DRUGGYTEMP_KEY = "druggyTemp"; // 数据管理 吸毒人员
	public static final String DRUGGYTEMP_DISPLAYNAME = "数据管理吸毒人员";// 数据管理 吸毒人员
	public static final String POSITIVETEMP_KEY = "positiveInfoTemp"; // 数据管理

	// 艾滋病人员
	public static final String AIDSPOPULATIONSTEMP_KEY = "aidspopulationsTemp"; // 数据管理
	// 艾滋病人员
	public static final String AIDSPOPULATIONSTEMP_DISPLAYNAME = "数据管理艾滋病人员";// 数据管理
	// 刑释人员
	public static final String POSITIVETEMP_DISPLAYNAME = "数据管理刑释人员";// 数据管理

	public static final String IDLEYOUTHTEMP_KEY = "idleYouthTemp"; // 数据管理
	// 重点青少年
	public static final String IDLEYOUTHTEMP_DISPLAYNAME = "数据管理重点青少年";// 数据管理
	// 重点青少年
	public static final String MENTALPATIENTTEMP_KEY = "mentalPatientTemp"; // 数据管理
	// 精神病人员
	public static final String MENTALPATIENTTEMP_DISPLAYNAME = "数据管理精神病人员";// 数据管理
	// 精神病人员
	public static final String RECTIFICATIVEPERSONTEMP_KEY = "rectificativePersonTemp"; // 数据管理
	// 社区矫正人员
	public static final String RECTIFICATIVEPERSONTEMP_DISPLAYNAME = "数据管理社区矫正人员";// 数据管理社区矫正人员
	public static final String SUPERIORVISITTEMP_KEY = "superiorVisitTemp"; // 数据管理
	// 重点上访人员
	public static final String SUPERIORVISITTEMP_DISPLAYNAME = "数据管理重点上访人员";// 数据管理
	// 重点上访人员
	public static final String DANGEROUSGOODSPRACTITIONERTEMP_KEY = "dangerousGoodsPractitionerTemp"; // 数据管理危险品从业人员
	public static final String DANGEROUSGOODSPRACTITIONERTEMP_DISPLAYNAME = "数据管理危险品从业人员";// 数据管理

	public static final String ELDERLYPEOPLETEMP_KEY = "elderlyPeopleTemp"; // 数据管理老年人
	public static final String ELDERLYPEOPLETEMP_DISPLAYNAME = "数据管理老年人";// 数据管理

	public static final String HANDICAPPEDTEMP_KEY = "handicappedTemp"; // 数据管理残疾人
	public static final String HANDICAPPEDTEMP_DISPLAYNAME = "数据管理残疾人";// 数据管理
	public static final String OTHERATTENTIONPERSONNELTEMP_KEY = "otherAttentionPersonnelTemp"; // 数据管理残疾人
	public static final String OTHERATTENTIONPERSONNELTEMP_DISPLAYNAME = "数据管理其他人员";// 数据管理

	public static final String OPTIMALOBJECTTEMP_KEY = "optimalObjectTemp"; // 数据管理优抚对象
	public static final String OPTIMALOBJECTTEMP_DISPLAYNAME = "数据管理优抚对象";// 数据管理

	public static final String AIDNEEDPOPULATIONTEMP_KEY = "aidneedpopulationTemp"; // 数据管理需救助人员
	public static final String AIDNEEDPOPULATIONTEMP_DISPLAYNAME = "数据管理需救助人员";// 数据管理

	public static final String UNEMPLOYEDPEOPLETEMP_KEY = "unemployedPeopleTemp"; // 数据管理失业人员
	public static final String UNEMPLOYEDPEOPLETEMP_DISPLAYNAME = "数据管理失业人员";// 数据管理

	public static final String NURTURESWOMENTEMP_KEY = "nurturesWomenTemp"; // 数据管理育龄妇女
	public static final String NURTURESWOMENTEMP_DISPLAYNAME = "数据管理育龄妇女";// 数据管理

	public static final String FLOATINGPOPULATIONTEMP_KEY = "floatingPopulationTemp"; // 数据管理流动人口
	public static final String FLOATINGPOPULATIONTEMP_DISPLAYNAME = "数据管理流动人口";// 数据管理

	public static final String HOUSEHOLDSTAFFTEMP_KEY = "householdStaffTemp"; // 数据管理户籍人口
	public static final String HOUSEHOLDSTAFFTEMP_DISPLAYNAME = "数据管理户籍人口";// 数据管理

	public static final String OVERSEAPERSONNELTEMP_KEY = "overseaPersonnelTemp"; // 数据管理境外人员
	public static final String OVERSEAPERSONNELTEMP_DISPLAYNAME = "数据管理境外人员";

	public static final String UNSETTLEDPOPULATIONTEMP_KEY = "UnsettledPopulationTemp"; // 数据管理未落户人员
	public static final String UNSETTLEDPOPULATIONTEMP_DISPLAYNAME = "数据管理未落户人口";

	public static final String SAFETYPRODUCTIONKEYTEMP_KEY = "safetyProductionKeyTemp"; // 数据管理安全生产重点
	public static final String SAFETYPRODUCTIONKEYTEMP_DISPLAYNAME = "数据管理安全生产重点";// 数据管理
	public static final String FIRESAFETYKEYTEMP_KEY = "fireSafetyKeyTemp"; // 数据管理消防安全重点
	public static final String FIRESAFETYKEYTEMP_DISPLAYNAME = "数据管理消防安全重点";// 数据管理
	public static final String SECURITYKEYTEMP_KEY = "securityKeyTemp"; // 数据管理治安重点
	public static final String SECURITYKEYTEMP_DISPLAYNAME = "数据管理治安重点";// 数据管理
	public static final String SCHOOKEYTEMP_KEY = "schoolTemp"; // 数据管理学校
	public static final String SCHOOKEYTEMP_DISPLAYNAME = "数据管理学校";// 数据管理
	public static final String HOSPITALKEYTEMP_KEY = "hospitalTemp"; // 数据管理医院
	public static final String HOSPITALKEYTEMP_DISPLAYNAME = "数据管理医院";// 数据管理
	public static final String OTHERLOCALETEMP_KEY = "otherLocaleTemp"; // 数据管理其他场所
	public static final String OTHERLOCALETEMP_DISPLAYNAME = "数据管理其他场所";// 数据管理
	public static final String ENTERPRISEKEYTEMP_KEY = "enterpriseKeyTemp"; // 数据管理规上企业
	public static final String ENTERPRISEDOWNKEYTEMP_KEY = "enterpriseDownKeyTemp"; // 数据管理规下企业
	public static final String ENTERPRISEKEYTEMP_DISPLAYNAME = "数据管理规上企业";// 数据管理
	public static final String ENTERPRISEDOWNKEYTEMP_DISPLAYNAME = "数据管理规下企业";// 数据管理

	public static final String RENTALHOUSETEMP_KEY = "rentalHouseTemp"; // 数据管理出租房
	public static final String RENTALHOUSETEMP_DISPLAYNAME = "数据管理出租房";// 数据管理

	public static final String NEWSOCIETYORGANIZATIONSTEMP_KEY = "newSocietyOrganizationsTemp"; // 数据管理新社会组织
	public static final String NEWSOCIETYORGANIZATIONSTEMP_DISPLAYNAME = "数据管理社会组织";// 数据管理
	public static final String BUILDDATA_KEY = "builddata";
	public static final String BUILDDATASTEMP_KEY = "builddatasTemp";
	public static final String BUILDDATADATE_KEY = "builddatasData";

	public static final String INTERNET_BAR_TEMP_KEY = "internetBarTemp"; // 数据管理网吧
	public static final String UNSETTLED_POPULATION_TEMP_KEY = "unsettledPopulationTemp"; // 数据管理未落户人口
	public static final String SCHOOL_TEMP_KEY = "schoolTemp";// 数据管理学校
	public static final String SAFETY_PRODUCTION_TEMP_KEY = "safetyProductionTemp";// 数据管理安全生产重点
	public static final String FIRE_SAFETY_TEMP_KEY = "fireSafetyEnterpriseTemp";// 数据管理消防安全重点
	public static final String SECURITY_TEMP_KEY = "securityEnterpriseTemp";// 数据管理治安重点

	public static final String DANGEROUS_CHEMICALS_UNIT_TEMP_KEY = "dangerousChemicalsUnitTemp";// 数据管理危险化学品单位
	public static final String DANGEROUS_CHEMICALS_UNIT_TEMP_KEY_DISPLAYNAME = "数据管理危险化学品单位";// 数据管理

	public static final String PUBLIC_PLACE_TEMP_KEY = "publicPlaceTemp";// 数据管理公共场所
	public static final String PUBLIC_PLACE_TEMP_KEY_DISPLAYNAME = "数据管理公共场所";// 数据管理

	public static final String NEW_SOCIETY_ORGANIZATIONS_TEMP_KEY = "newSocietyOrganizationsTemp";// 数据管理新社会组织

	public static final String NEW_ECONOMIC_ORGANIZATIONS_TEMP_KEY = "newEconomicOrganizationsTemp";// 数据管理新经济组织
	public static final String NEW_ECONOMIC_ORGANIZATIONS_TEMP_KEY_DISPLAYNAME = "数据管理新经济组织";// 数据管理

	public static final String ACTUAL_HOUSE_TEMP_KEY = "actualHouseTemp";// 数据管理实有房屋
	public static final String ACTUAL_HOUSE_TEMP_KEY_DISPLAYNAME = "数据管理房屋信息";// 数据管理

	public static final String RENTAL_HOUSE_TEMP_KEY = "rentalHouseTemp";// 数据管理出租房

	public static final String ACTUAL_COMPANY_TEMP_KEY = "actualCompanyTemp";// 数据管理实有单位
	public static final String ACTUAL_COMPANY_TEMP_KEY_DISPLAYNAME = "数据管理实有单位";// 数据管理
	public static final String DUSTBIN_KEY = "DUSTBIN";
	public static final String DUSTBIN_KEY_DISPLAYNAME = "部件信息";
	public static final String DUSTBIN_TEMP_KEY = "DUSTBINTEMP";
	public static final String DUSTBIN_TEMP_KEY_DISPLAYNAME = "数据管理部件信息";
	public static final String MEMBER_KEY = "member";
	public static final String MEMBER_KEY_DISPLAYNAME = "成员信息";

	public static final String HOSPITALTEMP_KEY = "hospitalTemp"; // 数据管理重点单位医院
	public static final String HOSPITALTEMP_DISPLAYNAME = "数据管理医院";
	// 数据管理单位场所导入
	public static final String NEW_PARTYGOVERNMENTORGANCOMPANYTEMP_KEY = "NewPartyGovernmentOrganCompanyTemp";
	public static final String NEW_PARTYGOVERNMENTORGANCOMPANYTEMP_DISPLAYNAME = "数据管理党政机关";
	public static final String NEW_SCHOOLSTEMP_KEY = "NewEducationCompanyTemp";
	public static final String NEW_SCHOOLSTEMP_DISPLAYNAME = "数据管理学校";
	public static final String NEW_HOSPITALTEMP_KEY = "NewMedicalHygieneCompanyTemp";
	public static final String NEW_HOSPITALTEMP_DISPLAYNAME = "数据管理医院";
	public static final String NEW_DANGEROUSCHEMICALSUNITTEMP_KEY = "NewDangerousStoreCompanyTemp";
	public static final String NEW_DANGEROUSCHEMICALSUNITTEMP_DISPLAYNAME = "数据管理危化品存放单位";
	public static final String NEW_OTHERCOMPANYTEMP_KEY = "NewOtherCompanyTemp";
	public static final String NEW_OTHERCOMPANYTEMP_DISPLAYNAME = "数据管理单位-其他";
	public static final String NEW_PUBLICPLACETEMP_KEY = "NewPublicPlaceTemp";
	public static final String NEW_PUBLICPLACETEMP_DISPLAYNAME = "数据管理公共活动场所";
	public static final String NEW_TRAFFICPLACETEMP_KEY = "NewTrafficPlaceTemp";
	public static final String NEW_TRAFFICPLACETEMP_DISPLAYNAME = "数据管理交通场所";
	public static final String NEW_ENTERTAINMENTPLACETEMP_KEY = "NewEntertainmentPlaceTemp";
	public static final String NEW_ENTERTAINMENTPLACETEMP_DISPLAYNAME = "数据管理娱乐场所";
	public static final String NEW_TRADEPLACETEMP_KEY = "NewTradePlaceTemp";
	public static final String NEW_TRADEPLACETEMP_DISPLAYNAME = "数据管理商贸场所";
	public static final String NEW_INTERNETSERVICESPLACETEMP_KEY = "NewInternetServicesPlaceTemp";
	public static final String NEW_INTERNETSERVICESPLACETEMP_DISPLAYNAME = "数据管理网吧";
	public static final String NEW_ACCOMMODATIONSERVICESPLACETEMP_KEY = "NewAccommodationServicesPlaceTemp";
	public static final String NEW_ACCOMMODATIONSERVICESPLACETEMP_DISPLAYNAME = "数据管理住宿服务场所";
	public static final String NEW_FOODSERVICESPLACETEMP_KEY = "NewFoodServicesPlaceTemp";
	public static final String NEW_FOODSERVICESPLACETEMP_DISPLAYNAME = "数据管理餐饮服务场所";
	public static final String NEW_TRAVELINGPLACETEMP_KEY = "NewTravelingPlaceTemp";
	public static final String NEW_TRAVELINGPLACETEMP_DISPLAYNAME = "数据管理旅游场所";
	public static final String NEW_CONSTRUCTIONPLACETEMP_KEY = "NewConstructionPlaceTemp";
	public static final String NEW_CONSTRUCTIONPLACETEMP_DISPLAYNAME = "数据管理施工场所";
	public static final String NEW_OTHERPLACETEMP_KEY = "NewOtherPlaceTemp";
	public static final String NEW_OTHERPLACETEMP_DISPLAYNAME = "数据管理其它场所";

	// 单位场所系统
	public static final String NEWPUBLICPLACE_KEY = "NewPublicPlace";
	public static final String NEWPUBLICPLACE_DISPLAYNAME = "公共活动场所";
	public static final String TRAFFICPLACE_KEY = "TrafficPlace";
	public static final String TRAFFICPLACE_DISPLAYNAME = "交通场所";
	public static final String ENTERTAINMENTPLACE_KEY = "EntertainmentPlace";
	public static final String ENTERTAINMENTPLACE_DISPLAYNAME = "娱乐场所";
	public static final String TRADEPLACE_KEY = "TradePlace";
	public static final String TRADEPLACE_DISPLAYNAME = "商贸场所";
	public static final String NEWINTERNETBAR_KEY = "NewInternetbar";
	public static final String NEWINTERNETBAR_DISPLAYNAME = "网吧";
	public static final String ACCOMMODATIONSERVICESPLACE_KEY = "AccommodationServicesPlace";
	public static final String ACCOMMODATIONSERVICESPLACE_DISPLAYNAME = "住宿服务场所";
	public static final String NEWFOODSERVICESPLACE_KEY = "NewFoodServicesPlace";
	public static final String NEWFOODSERVICESPLACE_DISPLAYNAME = "餐饮服务场所";
	public static final String TRAVELINGPLACE_KEY = "TravelingPlace";
	public static final String TRAVELINGPLACE_DISPLAYNAME = "旅游场所";
	public static final String CONSTRUCTIONPLACE_KEY = "ConstructionPlace";
	public static final String CONSTRUCTIONPLACE_DISPLAYNAME = "施工场所";
	public static final String OTHERPLACE_KEY = "OtherPlace";
	public static final String OTHERPLACE_DISPLAYNAME = "场所-其他";
	public static final String PARTYGOVERNMENTORGANCOMPANY_KEY = "PartyGovernmentOrganCompany";
	public static final String PARTYGOVERNMENTORGANCOMPANY_DISPLAYNAME = "党政机关";
	public static final String NEWSCHOOLS_KEY = "NewSchools";
	public static final String NEWSCHOOLS_DISPLAYNAME = "学校";
	public static final String NEWHOSPITAL_KEY = "NewHospital";
	public static final String NEWHOSPITAL_DISPLAYNAME = "医院";
	public static final String NEWDANGEROUSCHEMICALSUNIT_KEY = "NewDangerousChemicalsunit";
	public static final String NEWDANGEROUSCHEMICALSUNIT_DISPLAYNAME = "危化品存放单位";
	public static final String OTHERCOMPANY_KEY = "OtherCompany";
	public static final String OTHERCOMPANY_DISPLAYNAME = "单位-其他";

	public static final String GIS2DLAYER_KEY = "Gis2DLayer";
	public static final String GIS2DLAYER_DISPLAYNAME = "地图区域";
	public static final String UPDATELONLAT_KEY = "UpdateLonlat";
	public static final String UPDATELONLAT_DISPLAYNAME = "重置坐标";

	static {
		populationKeyTables.put(IMPORTANTPERSONNEL_KEY,
				BaseInfoTables.IMPORTANTPERSONNEL_KEY);// 重点人员
		populationKeyTables.put(CIVIL_KEY, "CIVIL");// 关怀对象(民政)
		populationKeyTables.put(UNEMPLOYED_KEY, "UNEMPLOY");// 失业人员
		populationKeyTables.put(BIRTH_KEY, "BIRTH");// 育龄妇女
		populationKeyTables.put(IMPORTANTPLACE_KEY, "IMPORTANTPLACE");// 重点场所
		populationKeyTables.put(ACTUALCOMPANY_KEY, "ACTUALCOMPANY");// 实有单位
		populationKeyTables.put(DOUBLENEW_KEY, "DOUBLENEW");// 两新组织
		populationKeyTables.put(ACTUALHOUSE_KEY, "ACTUALHOUSE");// 实有房屋
		populationKeyTables.put(ENTERPRISE_KEY, "ENTERPRISE");// 企业

		importantsPersonnelTables.put(POSITIVEINFO_KEY, "positiveinfos");// 刑释人员
		importantsPersonnelTables.put(AIDSPOPULATIONS_KEY, "aidsPopulations");// 艾滋病人员
		importantsPersonnelTables.put(RECTIFICATIVEPERSON_KEY,
				"rectificativePersons");// 社区矫正人员
		importantsPersonnelTables.put(IDLEYOUTH_KEY, "idleYouths");// 闲散青少年
		importantsPersonnelTables.put(MENTALPATIENT_KEY, "mentalPatients");// 重性精神病人员
		importantsPersonnelTables.put(DRUGGY_KEY, "druggys");// 吸毒人员
		importantsPersonnelTables.put(SUPERIORVISIT_KEY, "superiorVisits");// 重点上访人员
		importantsPersonnelTables.put(DANGEROUSGOODSPRACTITIONER_KEY,
				"dangerousGoodsPractitioners");// 危险品从业人员
		importantsPersonnelTables.put(OTHERATTENTIONPERSONNEL_KEY,
				"otherAttentionPersonnels");// 其他人员

		importantPlaceTables
				.put(SAFETYPRODUCTIONKEY_KEY, "safetyProductionKey");// 安全生产重点
		importantPlaceTables.put(FIRESAFETYKEY_KEY, "fireSafetyKey");// 消防安全重点
		importantPlaceTables.put(SECURITYKEY_KEY, "securityKey");// 治安重点
		importantPlaceTables.put(SCHOOL_KEY, "schools");// 学校
		importantPlaceTables.put(OTHERLOCALE_KEY, "otherLocales");// 其他场所
		importantPlaceTables.put(DANGEROUSCHEMICALSUNIT_KEY,
				"dangerousChemicalsUnit");// 危险化学品单位
		importantPlaceTables.put(INTERNETBAR_KEY, "internetBar");// 网吧
		importantPlaceTables.put(PUBLICPLACE_KEY, "publicPlace");// 公共场所
		importantPlaceTables
				.put(PUBLICCOMPLEXPLACES_KEY, "publicComplexPlaces");// 公共复杂场所

		actualCompanyTables.put(ACTUALCOMPANY_KEY, "actualCompany");// 实有单位

		doubleNewTables.put(NEWSOCIETYORGANIZATIONS_KEY,
				"newSocietyOrganizations");// 新社会组织
		doubleNewTables.put(NEWECONOMICORGANIZATIONS_KEY,
				"newEconomicOrganizations");// 新经济组织
		enterpriseTables.put(ENTERPRISEKEY_KEY, "enterpriseKey");// 规上
		enterpriseTables.put(ENTERPRISEDOWNKEY_KEY, "enterpriseDownKey");// 规下
		actualHouseTables.put(RENTALHOUSE_KEY, "rentalHouse");

		// importantPlaceTables.put(CONSTRUCTIONUNIT_KEY,
		// "constructionUnits");// 建筑施工单位

		// personnelTables.put(TRAMPRESIDENT_KEY, "floatingPopulations");//流动人口
		// personnelTables.put(RESIDENT_KEY, "householdStaffs");//户籍人口
		personnelTables.put(FLOATINGPOPULATION_KEY, "floatingPopulations");
		personnelTables.put(HOUSEHOLDSTAFF_KEY, "householdStaffs");
		personnelTables.put(UNSETTEDPOPULATION_KEY, "unsettledPopulations");// 未落户人员
		personnelTables.put(OVERSEAPERSONNEL_KEY, "overseaPersonnel");// 境外人员

		civil.put(ELDERLYPEOPLE_KEY, "elderlyPeople");// 老年人
		civil.put(HANDICAPPED_KEY, "handicappeds");// 残疾人
		// civil.put(OPTIMALOBJECT_KEY, "optimalObjects");// 优抚对象
		civil.put(AIDNEEDPOPULATION_KEY, "aidneedpopulation");// 需救助人员

		birth.put(NURTURESWOMEN_KEY, "nurturesWomen");// 育妇
		unemployed.put(UNEMPLOYEDPEOPLE_KEY, "unemployedPeople");// 失业人员
		// 所有业务人员
		bussinessPopulationTables.putAll(importantsPersonnelTables);
		bussinessPopulationTables.putAll(civil);
		bussinessPopulationTables.putAll(birth);
		bussinessPopulationTables.putAll(unemployed);

		lovingCare.put(ELDERLYPEOPLE_KEY, "elderlyPeople");// 老年人
		lovingCare.put(HANDICAPPED_KEY, "handicappeds");// 残疾人
		lovingCare.put(OPTIMALOBJECT_KEY, "optimalObjects");// 优抚对象
		lovingCare.put(AIDNEEDPOPULATION_KEY, "aidneedpopulation");// 需救助人员
		lovingCare.put(NURTURESWOMEN_KEY, "nurturesWomen");// 育妇

		fxj.put(FPERSONNEL_KEY, "fpersonnels");
		fxj.put(QPERSONNEL_KEY, "qpersonnels");
		fxj.put(MPERSONNEL_KEY, "mpersonnels");

		keyTables.put(NEWECONOMICORGANIZATIONS_KEY, "newEconomicOrganizations");// 新经济组织
		keyTables.put(NEWSOCIETYFEDERATION_KEY, "newsocietyorganizations");// 新社会组织
		keyTables.put(NEWSOCIETYORGANIZATIONS_KEY, "newSocietyOrganizations");// 新社会组织(改版)
		keyTables.put(LETTINGHOUSE_KEY, "lettingHouses");// 出租房
		keyTables.put(ENTERPRISEKEY_KEY, "enterpriseKey");// 规上企业
		keyTables.put(ENTERPRISEDOWNKEY_KEY, "enterpriseDownKey");// 规下企业
		keyTables.put(INHABITANT_KEY, "inhabitants");// 常住人口

		keyTables.put(ESTATEINFORMATION_KEY, "estateInformation");// 房产信息

		keyTables.put(DRUGGYTEMP_KEY, "druggyTemp"); // 吸毒人员 数据管理
		keyTables.put(POSITIVETEMP_KEY, "positiveInfoTemp"); // 刑释人员 数据管理
		keyTables.put(IDLEYOUTHTEMP_KEY, "idleYouthTemp"); // 重点青少年 数据管理
		keyTables.put(MENTALPATIENTTEMP_KEY, "mentalPatientTemp"); // 精神病人员 数据管理
		keyTables.put(RECTIFICATIVEPERSONTEMP_KEY, "rectificativePersonTemp"); // 社区矫正人员
		// 数据管理
		keyTables.put(SUPERIORVISITTEMP_KEY, "superiorVisitTemp"); // 重点上访人员
		// 数据管理
		keyTables.put(DANGEROUSGOODSPRACTITIONERTEMP_KEY,
				"dangerousGoodsPractitionerTemp"); // 危险品从业人员
													// 数据管理

		keyTables.put(AIDSPOPULATIONSTEMP_KEY, "aidsPopulationTemp"); // 艾滋病人员
																		// 数据管理

		keyNames.put(AIDSPOPULATIONSTEMP_KEY, AIDSPOPULATIONSTEMP_DISPLAYNAME);// 吸毒人员
																				// 数据管理
		keyNames.put(DRUGGYTEMP_KEY, DRUGGYTEMP_DISPLAYNAME);// 吸毒人员 数据管理
		keyNames.put(POSITIVETEMP_KEY, POSITIVETEMP_DISPLAYNAME);// 刑释人员 数据管理
		keyNames.put(IDLEYOUTHTEMP_KEY, IDLEYOUTHTEMP_DISPLAYNAME);// 重点青少年
		// 数据管理
		keyNames.put(MENTALPATIENTTEMP_KEY, MENTALPATIENTTEMP_DISPLAYNAME);// 精神病人员
		// 数据管理
		keyNames.put(RECTIFICATIVEPERSONTEMP_KEY,
				RECTIFICATIVEPERSONTEMP_DISPLAYNAME);// 社区矫正人员
														// 数据管理
		keyNames.put(SUPERIORVISITTEMP_KEY, SUPERIORVISITTEMP_DISPLAYNAME);// 重点上访人员
		// 数据管理
		keyNames.put(DANGEROUSGOODSPRACTITIONERTEMP_KEY,
				DANGEROUSGOODSPRACTITIONERTEMP_DISPLAYNAME);// 危险品从业人员
															// 数据管理

		// 数据管理老年人
		keyNames.put(ELDERLYPEOPLETEMP_KEY, ELDERLYPEOPLETEMP_DISPLAYNAME);
		// 数据管理残疾人
		keyNames.put(HANDICAPPEDTEMP_KEY, HANDICAPPEDTEMP_DISPLAYNAME);
		// 数据管理其他人员
		keyNames.put(OTHERATTENTIONPERSONNELTEMP_KEY,
				OTHERATTENTIONPERSONNELTEMP_DISPLAYNAME);
		// 数据管理优抚对象
		keyNames.put(OPTIMALOBJECTTEMP_KEY, OPTIMALOBJECTTEMP_DISPLAYNAME);
		// 数据管理需救助人员
		keyNames.put(AIDNEEDPOPULATIONTEMP_KEY,
				AIDNEEDPOPULATIONTEMP_DISPLAYNAME);
		// 数据管理失业人员
		keyNames.put(UNEMPLOYEDPEOPLETEMP_KEY, UNEMPLOYEDPEOPLETEMP_DISPLAYNAME);
		// 数据管理育龄妇女
		keyNames.put(NURTURESWOMENTEMP_KEY, NURTURESWOMENTEMP_DISPLAYNAME);
		// 数据管理 流动人口
		keyNames.put(FLOATINGPOPULATIONTEMP_KEY,
				FLOATINGPOPULATIONTEMP_DISPLAYNAME);
		// 数据管理 户籍人口
		keyNames.put(HOUSEHOLDSTAFFTEMP_KEY, HOUSEHOLDSTAFFTEMP_DISPLAYNAME);
		// 数据管理 境外人员
		keyNames.put(OVERSEAPERSONNELTEMP_KEY, OVERSEAPERSONNELTEMP_DISPLAYNAME);
		// 数据管理 未落户人员
		keyNames.put(UNSETTLEDPOPULATIONTEMP_KEY,
				UNSETTLEDPOPULATIONTEMP_DISPLAYNAME);
		// 数据管理 安全生产重点
		keyNames.put(SAFETY_PRODUCTION_TEMP_KEY,
				SAFETYPRODUCTIONKEYTEMP_DISPLAYNAME);
		// 数据管理 消防安全重点
		keyNames.put(FIRE_SAFETY_TEMP_KEY, FIRESAFETYKEYTEMP_DISPLAYNAME);
		// 数据管理 治安重点
		keyNames.put(SECURITY_TEMP_KEY, SECURITYKEYTEMP_DISPLAYNAME);
		// 数据管理 规上企业
		keyNames.put(ENTERPRISEKEYTEMP_KEY, ENTERPRISEKEYTEMP_DISPLAYNAME);
		// 数据管理 规下企业
		keyNames.put(ENTERPRISEDOWNKEYTEMP_KEY,
				ENTERPRISEDOWNKEYTEMP_DISPLAYNAME);
		// 数据管理 学校
		keyNames.put(SCHOOKEYTEMP_KEY, SCHOOKEYTEMP_DISPLAYNAME);
		// 数据管理 学校
		keyNames.put(HOSPITALKEYTEMP_KEY, HOSPITALKEYTEMP_DISPLAYNAME);
		// 数据管理 其他
		keyNames.put(OTHERLOCALETEMP_KEY, OTHERLOCALETEMP_DISPLAYNAME);

		// 数据管理危险化学品单位
		keyNames.put(DANGEROUS_CHEMICALS_UNIT_TEMP_KEY,
				DANGEROUS_CHEMICALS_UNIT_TEMP_KEY_DISPLAYNAME);
		// 数据管理公共场所
		keyNames.put(PUBLIC_PLACE_TEMP_KEY, PUBLIC_PLACE_TEMP_KEY_DISPLAYNAME);
		// 数据管理实有房屋
		keyNames.put(ACTUAL_HOUSE_TEMP_KEY, ACTUAL_HOUSE_TEMP_KEY_DISPLAYNAME);
		// 数据管理 出租房
		keyNames.put(RENTAL_HOUSE_TEMP_KEY, RENTALHOUSETEMP_DISPLAYNAME);
		// 数据管理新经济组织
		keyNames.put(NEW_ECONOMIC_ORGANIZATIONS_TEMP_KEY,
				NEW_ECONOMIC_ORGANIZATIONS_TEMP_KEY_DISPLAYNAME);
		// 数据管理 新社会组织
		keyNames.put(NEW_SOCIETY_ORGANIZATIONS_TEMP_KEY,
				NEWSOCIETYORGANIZATIONSTEMP_DISPLAYNAME);
		// 数据管理 实有单位
		keyNames.put(ACTUAL_COMPANY_TEMP_KEY,
				ACTUAL_COMPANY_TEMP_KEY_DISPLAYNAME);

		keyNames.put(BUILDDATA_KEY, BUILDDATAS_DISPLAYNAME);
		keyNames.put(BUILDDATADATE_KEY, BUILDDATAS_DISPLAYNAMEINFO);
		keyNames.put(BUILDDATASTEMP_KEY, BUILDDATAS_TEMP_DISPLAYNAME);
		keyNames.put(HOSPITALTEMP_KEY, HOSPITALTEMP_DISPLAYNAME);
		// 数据管理单位场所
		keyNames.put(NEW_PARTYGOVERNMENTORGANCOMPANYTEMP_KEY,
				NEW_PARTYGOVERNMENTORGANCOMPANYTEMP_DISPLAYNAME);
		keyNames.put(NEW_SCHOOLSTEMP_KEY, NEW_SCHOOLSTEMP_DISPLAYNAME);
		keyNames.put(NEW_HOSPITALTEMP_KEY, NEW_HOSPITALTEMP_DISPLAYNAME);
		keyNames.put(NEW_DANGEROUSCHEMICALSUNITTEMP_KEY,
				NEW_DANGEROUSCHEMICALSUNITTEMP_DISPLAYNAME);
		keyNames.put(NEW_OTHERCOMPANYTEMP_KEY, NEW_OTHERCOMPANYTEMP_DISPLAYNAME);
		keyNames.put(NEW_PUBLICPLACETEMP_KEY, NEW_PUBLICPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_TRAFFICPLACETEMP_KEY, NEW_TRAFFICPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_ENTERTAINMENTPLACETEMP_KEY,
				NEW_ENTERTAINMENTPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_TRADEPLACETEMP_KEY, NEW_TRADEPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_INTERNETSERVICESPLACETEMP_KEY,
				NEW_INTERNETSERVICESPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_ACCOMMODATIONSERVICESPLACETEMP_KEY,
				NEW_ACCOMMODATIONSERVICESPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_FOODSERVICESPLACETEMP_KEY,
				NEW_FOODSERVICESPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_TRAVELINGPLACETEMP_KEY,
				NEW_TRAVELINGPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_CONSTRUCTIONPLACETEMP_KEY,
				NEW_CONSTRUCTIONPLACETEMP_DISPLAYNAME);
		keyNames.put(NEW_OTHERPLACETEMP_KEY, NEW_OTHERPLACETEMP_DISPLAYNAME);
		// 单位场所系统
		keyNames.put(NEWPUBLICPLACE_KEY, NEWPUBLICPLACE_DISPLAYNAME);
		keyNames.put(TRAFFICPLACE_KEY, TRAFFICPLACE_DISPLAYNAME);
		keyNames.put(ENTERTAINMENTPLACE_KEY, ENTERTAINMENTPLACE_DISPLAYNAME);
		keyNames.put(TRADEPLACE_KEY, TRADEPLACE_DISPLAYNAME);
		keyNames.put(NEWINTERNETBAR_KEY, NEWINTERNETBAR_DISPLAYNAME);
		keyNames.put(ACCOMMODATIONSERVICESPLACE_KEY,
				ACCOMMODATIONSERVICESPLACE_DISPLAYNAME);
		keyNames.put(NEWFOODSERVICESPLACE_KEY, NEWFOODSERVICESPLACE_DISPLAYNAME);
		keyNames.put(TRAVELINGPLACE_KEY, TRAVELINGPLACE_DISPLAYNAME);
		keyNames.put(CONSTRUCTIONPLACE_KEY, CONSTRUCTIONPLACE_DISPLAYNAME);
		keyNames.put(OTHERPLACE_KEY, OTHERPLACE_DISPLAYNAME);
		keyNames.put(PARTYGOVERNMENTORGANCOMPANY_KEY,
				PARTYGOVERNMENTORGANCOMPANY_DISPLAYNAME);
		keyNames.put(NEWSCHOOLS_KEY, NEWSCHOOLS_DISPLAYNAME);
		keyNames.put(NEWHOSPITAL_KEY, NEWHOSPITAL_DISPLAYNAME);
		keyNames.put(NEWDANGEROUSCHEMICALSUNIT_KEY,
				NEWDANGEROUSCHEMICALSUNIT_DISPLAYNAME);
		keyNames.put(OTHERCOMPANY_KEY, OTHERCOMPANY_DISPLAYNAME);

		grassrootOrganizationTables.put("COMPOSITE_KEY", "composites"); // 基层综治组织
		grassrootOrganizationTables.put("MASSES_KEY", "masses"); // 群防群治队伍
		grassrootOrganizationTables.put("POSTULANT_KEY", "postulant"); // 社会志愿者队伍
		grassrootOrganizationTables.put("LEADERGROUP_KEY", "leaderGroup"); // 专项工作领导小组
		grassrootOrganizationTables.put("GRASSROOTSPARTY_KEY",
				"grassRootsParty"); // 基层党组织
		grassrootOrganizationTables.put("AUTONOMYORG_KEY", "autonomyOrg"); // 基层自治组织

		// importantPlaceTables.put(PROTECTIONKEY, "protectionKey");//重点保障
		importantPlaceTables.put(HOSPITAL_KEY, "hospitals");// 医院
		// importantPlaceTables.put(SPECIALTRADE_KEY, "specialTrades");//特种行业
		// importantsPersonnelTables.put(DANGERTRAMPRESIDENT_KEY,
		// "trampResidents");//高危流动人口
		// importantPlaceTables.put(COMMONCOMPLEXPLACE_KEY,
		// "commonComplexPlaces");//公共复杂场所

		keyTables.putAll(populationKeyTables);
		keyTables.putAll(personnelTables);
		keyTables.putAll(importantPlaceTables);
		keyTables.putAll(actualHouseTables);
		keyTables.putAll(actualCompanyTables);
		keyTables.putAll(doubleNewTables);
		keyTables.putAll(importantsPersonnelTables);
		keyTables.putAll(civil);
		keyTables.putAll(fxj);
		keyTables.putAll(birth);
		keyTables.putAll(unemployed);
		keyTables.putAll(lovingCare);
		keyTables.putAll(enterpriseTables);
		keyTables.put(ORGANIZATION_KEY, "organization");
		keyTables.put(ACTUALCOMPANY_KEY, "actualCompany");
		keyTables.put(DOUBLENEW_KEY, "doubleNew");

		keyTables.putAll(grassrootOrganizationTables);

		keyNames.put(POPULATION_KEY, POPULATION_DISPLAYNAME);
		keyNames.put(UNSETTED_POPULATION, UNSETTED_POPULATIONNAME);// 未落户人口
		keyNames.put(DataTransferConstants.UNSETTED_POPULATION_DATA,
				UNSETTED_POPULATIONNAME);// 未落户人口
		keyNames.put(HOUSEHOLDSTAFF_KEY, HOUSEHOLD_STAFFNAME);// 户籍人口
		keyNames.put(DataTransferConstants.HOUSEHOLD_STAFF_DATA,
				HOUSEHOLD_STAFFNAME);// 户籍人口
		keyNames.put(FLOATINGPOPULATION_KEY, FLOATINGPOPULATION_DISPLAYNAME);// 流动人口
		keyNames.put(DataTransferConstants.FLOATING_POPULATION_DATA,
				FLOATINGPOPULATION_DISPLAYNAME);// 流动人口
		keyNames.put(POSITIVEINFO_KEY, POSITIVEINFO_DISPLAYNAME);// 刑释人员
		keyNames.put(AIDSPOPULATIONS_KEY, AIDSPOPULATIONS_DISPLAYNAME); // 艾滋病人员
		keyNames.put(AIDSPOPULATIONS_KEY + "s", AIDSPOPULATIONS_DISPLAYNAME);
		keyNames.put(RECTIFICATIVEPERSON_KEY, RECTIFICATIVEPERSON_DISPLAYNAME);// 社区矫正人员
		keyNames.put(IDLEYOUTH_KEY, IDLEYOUTH_DISPLAYNAME);// 闲散青少年
		keyNames.put(AIDNEEDPOPULATION_KEY, AIDNEEDPOPULATION_DISPLAYNAME);// 需救助人员
		keyNames.put(OPTIMALOBJECT_KEY, OPTIMALOBJECT_DISPLAYNAME);// 优抚对象
		keyNames.put(MENTALPATIENT_KEY, MENTALPATIENT_DISPLAYNAME);// 重性精神病人员
		keyNames.put(DRUGGY_KEY, DRUGGY_DISPLAYNAME);// 吸毒人员
		keyNames.put(SUPERIORVISIT_KEY, SUPERIORVISIT_DISPLAYNAME);// 重点上访人员
		keyNames.put(POORPEOPLE_KEY, POORPEOPLE_DISPLAYNAME);// 需救助人员
		keyNames.put(DANGEROUSGOODSPRACTITIONER_KEY,
				DANGEROUSGOODSPRACTITIONER_DISPLAYNAME);// 危险品从业人员
		keyNames.put(OTHERATTENTIONPERSONNEL_KEY,
				OTHERATTENTIONPERSONNEL_DISPLAYNAME);// 其他人员
		keyNames.put(OVERSEAPERSONNEL_KEY, OVERSEAPERSONNEL_DISPLAYNAME);// 境外人员
		keyNames.put(DataTransferConstants.OVERSEA_PERSONNEL_DATA,
				OVERSEAPERSONNEL_DISPLAYNAME);// 境外人员
		// 实有人口系统FXJ模块
		keyNames.put(FPERSONNEL_KEY, FPERSONNEL_DISPLAYNAME);
		keyNames.put(QPERSONNEL_KEY, QPERSONNEL_DISPLAYNAME);
		keyNames.put(MPERSONNEL_KEY, MPERSONNEL_DISPLAYNAME);

		keyNames.put(SCENICSPOTS_KEY, SCENICSPOTS_DISPLAYNAME);
		keyNames.put(SCENICEQUIPMENT_KEY, SCENICEQUIPMENT_DISPLAYNAME);
		keyNames.put(SCENICTRAFFIC_KEY, SCENICTRAFFIC_DISPLAYNAME);
		keyNames.put(POLLUTIONSOURCE_KEY, POLLUTIONSOURCE_DISPLAYNAME);
		keyNames.put(SAFETYPRODUCTIONKEY_KEY, SAFETYPRODUCTIONKEY_DISPLAYNAME);// 安全生产重点
		keyNames.put(DataTransferConstants.SAFETYPRODUCTION_DATA,
				SAFETYPRODUCTIONKEY_DISPLAYNAME);// 安全生产重点
		keyNames.put(FIRESAFETYKEY_KEY, FIRESAFETYKEY_DISPLAYNAME);// 消防安全重点
		keyNames.put(DataTransferConstants.FIRE_DATA, FIRESAFETYKEY_DISPLAYNAME);// 消防安全重点
		keyNames.put(SECURITYKEY_KEY, SECURITYKEY_DISPLAYNAME);// 治安重点
		keyNames.put(DataTransferConstants.SECURITY_DATA,
				SECURITYKEY_DISPLAYNAME);// 治安重点
		keyNames.put(SCHOOL_KEY, SCHOOL_DISPLAYNAME);// 学校
		keyNames.put(DataTransferConstants.SCHOOL_DATA, SCHOOL_DISPLAYNAME);// 学校
		keyNames.put(OTHERLOCALE_KEY, OTHERLOCALE_DISPLAYNAME);// 其他场所
		keyNames.put(DataTransferConstants.OTHER_LOCALE_DATA,
				OTHERLOCALE_DISPLAYNAME);// 其他场所
		keyNames.put(CONSTRUCTIONUNIT_KEY, CONSTRUCTIONUNIT_DISPLAYNAME);// 建筑司施工单位
		keyNames.put(ENTERPRISE_KEY, ENTERPRISE_DISPLAYNAME);// 企业
		keyNames.put(CIVIL_KEY, CIVIL_DISPLAYNAME);
		keyNames.put(BIRTH_KEY, BIRTH_DISPLAYNAME);
		keyNames.put(UNEMPLOYED_KEY, UNEMPLOYED_DISPLAYNAME);

		keyNames.put(HOUSEHOLDSTAFF_KEY, RESIDENT_DISPLAYNAME);// 常住人口
		keyNames.put(FLOATINGPOPULATION_KEY, TRAMPRESIDENT_DISPLAYNAME);// 流动人口
		keyNames.put(ENTERPRISEKEY_KEY, ENTERPRISEKEY_DISPLAYNAME);// 规上企业
		keyNames.put(ENTERPRISEDOWNKEY_KEY, ENTERPRISEDOWNKEY_DISPLAYNAME);// 规下企业
		keyNames.put(DataTransferConstants.ENTERPRISE_DATA,
				ENTERPRISEKEY_DISPLAYNAME);// 规上企业

		keyNames.put(DataTransferConstants.ENTERPRISEDOWN_DATA,
				ENTERPRISEDOWNKEY_DISPLAYNAME);// 规下企业
		keyNames.put(NEWSOCIETYFEDERATION_KEY, NEWSOCIETYFEDERATION_DISPLAYNAME);// 社会组织

		keyNames.put(NEWSOCIETYORGANIZATIONS_KEY,
				NEWSOCIETYORGANIZATIONS_DISPLAYNAME);// 新社会组织(改版)
		keyNames.put(LETTINGHOUSE_KEY, LETTINGHOUSE_DISPLAYNAME);// 出租房
		keyNames.put(INHABITANT_KEY, INHABITANT_DISPLAYNAME);// 常住人口
		keyNames.put(HANDICAPPED_KEY, HANDICAPPED_DISPLAYNAME);// 残疾人
		keyNames.put(ESTATEINFORMATION_KEY, ESTATEINFORMATION_DISPLAYNAME);// 房产信息
		keyNames.put(ELDERLYPEOPLE_KEY, ELDERLYPEOPLE_DISPLAYNAME);// 老年人
		keyNames.put(NURTURESWOMEN_KEY, NURTURESWOMEN_DISPLAYNAME);// 育妇
		keyNames.put(NEWECONOMICORGANIZATIONS_KEY,
				NEWECONOMICORGANIZATIONS_DISPLAYNAME);// 新经济组织
		keyNames.put(DataTransferConstants.NEWECONOMICORGANIZATIONS_DATA,
				NEWECONOMICORGANIZATIONS_DISPLAYNAME);// 新经济组织
		keyNames.put(UNEMPLOYEDPEOPLE_KEY, UNEMPLOYEDPEOPLE_DISPLAYNAME);// 失业人员
		keyNames.put(ACTUALHOUSE_KEY, ACTUALHOUSE_DISPLAYNAME);// 实有房屋
		keyNames.put(DataTransferConstants.ACTUALHOUSE_DATA,
				ACTUALHOUSE_DISPLAYNAME);// 实有房屋
		keyNames.put(RENTALHOUSE_KEY, RENTALHOUSE_DISPLAYNAME);// 出租房
		keyNames.put(DataTransferConstants.RENTALHOUSE_DATA,
				RENTALHOUSE_DISPLAYNAME);// 出租房
		keyNames.put(ACTUALCOMPANY_KEY, ACTUALCOMPANY_DISPLAYNAME);// 实有单位
		keyNames.put(DOUBLENEW_KEY, DOUBLENEW_DISPLAYNAME);
		keyNames.put(DataTransferConstants.ACTUALCOMPANY_DATA,
				ACTUALCOMPANY_DISPLAYNAME);// 实有单位
		keyNames.put(INCIDENT_KEY, INCIDENTTYPE_DISPLAYNAME);// 预警系统

		keyNames.put(PUBLICPLACE_KEY, PUBLICPLACE_DISPLAYNAME);// 公共场所
		keyNames.put(DataTransferConstants.PUBLICPLACE_DATA,
				PUBLICPLACE_DISPLAYNAME);// 公共场所
		keyNames.put(PUBLICCOMPLEXPLACES_KEY, PUBLICCOMPLEXPLACES_DISPLAYNAME);// 公共复杂场所
		keyNames.put(DataTransferConstants.PUBLICCOMPLEXPLACES_DATA,
				PUBLICCOMPLEXPLACES_DISPLAYNAME);// 公共复杂场所
		keyNames.put(INTERNETBAR_KEY, INTERNETBAR_DISPLAYNAME);// 网吧
		keyNames.put(DataTransferConstants.INTERNETBAR_DATA,
				INTERNETBAR_DISPLAYNAME);// 网吧

		keyNames.put(DANGEROUSCHEMICALSUNIT_KEY,
				DANGEROUSCHEMICALSUNIT_DISPLAYNAME);// 危险化学品单位
		keyNames.put(DataTransferConstants.DANGEROUSCHEMICALSUNIT_DATA,
				DANGEROUSCHEMICALSUNIT_DISPLAYNAME);// 危险化学品单位
		// keyNames.put(PROTECTIONKEY, "重点保障");//重点保障
		// keyNames.put(DANGERTRAMPRESIDENT_KEY, "高危流动人口");//高危流动人口
		keyNames.put(HOSPITAL_KEY, "医院");// 医院
		// keyNames.put(SPECIALTRADE_KEY, "特种行业");//特种行业
		// keyNames.put(COMMONCOMPLEXPLACE_KEY, "公共复杂场所");//公共复杂场所

		keyNames.put(ORGANIZATION_KEY, "组织机构");

		keyNames.put(IMPORTANTPERSONNEL_KEY, IMPORTANTPERSONNEL_DISPLAYNAME);
		keyNames.put(IMPORTANTPLACE_KEY, IMPORTANTPLACE_DISPLAYNAME);

		keyNames.put(PROVINCEUSER_KEY, PROVINCEUSER_DISPLAYNAME);// 省用户
		keyNames.put(CITYUSER_KEY, CITYUSER_DISPLAYNAME);// 市用户
		keyNames.put(DISTRICTUSER_KEY, DISTRICTUSER_DISPLAYNAME);// 县用户
		keyNames.put(TOWNUSER_KEY, TOWNUSER_DISPLAYNAME);// 乡镇用户
		keyNames.put(VILLAGEUSER_KEY, VILLAGEUSER_DISPLAYNAME);// 网格用户

		keyNames.put(COMPOSITE_KEY, COMPOSITE_DISPLAYNAME); // 基层综治组织
		keyNames.put(MASSES_KEY, MASSES_DISPLAYNAME); // 群防群治队伍
		keyNames.put(POSTULANT_KEY, POSTULANT_DISPLAYNAME); // 社会志愿者组织
		keyNames.put(LEADERGROUP_KEY, LEADERGROUP_DISPLAYNAME); // 专项工作领导小组
		keyNames.put(GRASSROOTSPARTY_KEY, GRASSROOTSPARTY_DISPLAYNAME); // 基层党组织
		keyNames.put(AUTONOMYORG_KEY, AUTONOMYORG_DISPLAYNAME); // 基层自治组织
		keyNames.put(PARTYMEMBERINFO_KEY, PARTYMEMBERINFO_DISPLAYNAME);// 本级党员
		keyNames.put(DUSTBIN_KEY, DUSTBIN_KEY_DISPLAYNAME);// 部件信息
		keyNames.put(DUSTBIN_TEMP_KEY, DUSTBIN_TEMP_KEY_DISPLAYNAME);// 数据管理部件信息

		keyNames.put(MEMBER_KEY, MEMBER_KEY_DISPLAYNAME);// 成华党建
		// 手机账号
		keyNames.put(MOBILEUSER_KEY, MOBILEUSER_DISPLAYNAME);
		// 四支队伍成员
		keyNames.put(FOUR_TEAM_MEMBERS_KEY, FOUR_TEAM_MEMBERS_DISPLAYNAME);
		// 事件对接
		keyNames.put(ISSUE_JOINT_KEY, ISSUE_JOINT_DISPLAYNAME);

		helpType.put(POSITIVEINFO_KEY, "positiveInfo");
		helpType.put(AIDSPOPULATIONS_KEY, "aidsPopulations");
		helpType.put(RECTIFICATIVEPERSON_KEY, "rectificativePerson");
		helpType.put(DRUGGY_KEY, "druggy");
		helpType.put(MENTALPATIENT_KEY, "mentalPatient");
		helpType.put(IDLEYOUTH_KEY, "idleYouth");
		helpType.put(SUPERIORVISIT_KEY,
				BaseInfoTables.importantsPersonnelTables
						.get(BaseInfoTables.SUPERIORVISIT_KEY));
		helpType.put(POORPEOPLE_KEY,
				BaseInfoTables.civil.get(BaseInfoTables.POORPEOPLE_KEY));
		helpType.put(DANGEROUSGOODSPRACTITIONER_KEY,
				BaseInfoTables.importantsPersonnelTables
						.get(BaseInfoTables.DANGEROUSGOODSPRACTITIONER_KEY));
		helpType.put(OTHERATTENTIONPERSONNEL_KEY, "attentionPersonnel");

		helpType.put(SAFETYPRODUCTIONKEY_KEY, "safetyProductionKey");
		helpType.put(FIRESAFETYKEY_KEY, "fireSafetyKey");
		helpType.put(SECURITYKEY_KEY, "securityKey");
		helpType.put(ENTERPRISEKEY_KEY, "enterpriseKey");
		helpType.put(SCHOOL_KEY, "school");

		helpType.put(
				LETTINGHOUSE_KEY,
				BaseInfoTables.getKeytables().get(
						BaseInfoTables.LETTINGHOUSE_KEY));
		helpType.put(NEWSOCIETYFEDERATION_KEY, "newsocietyorganization");

		keyTablesMaps.put(POPULATIONKEYTABLES_KEY, populationKeyTables);
		keyTablesMaps.put(POPULATION_KEY, personnelTables);
		keyTablesMaps.put(IMPORTANTPERSONNEL_KEY, importantsPersonnelTables);
		keyTablesMaps.put(IMPORTANTPLACE_KEY, importantPlaceTables);
		keyTablesMaps.put(ACTUALHOUSE_KEY, actualHouseTables);
		keyTablesMaps.put(ACTUALCOMPANY_KEY, actualCompanyTables);
		keyTablesMaps.put(DOUBLENEW_KEY, doubleNewTables);
		keyTablesMaps.put(CIVIL_KEY, civil);
		keyTablesMaps.put(BIRTH_KEY, birth);
		keyTablesMaps.put(UNEMPLOYED_KEY, unemployed);
		keyTablesMaps.put(LOVINGCARE_KEY, lovingCare);
		keyTablesMaps.put(ENTERPRISE_KEY, enterpriseTables);

		// 人户状态
		householdStafftypes.put(RENHUTONGZAI_KEY, "renhutongzai");// 人户同在
		householdStafftypes.put(HUZAIRENBUZAI_KEY, "huzairenbuzai");// 户在人不在
		householdStafftypes.put(RENZAIHUBUZAI_KEY, "renzaihubuzai");// 人在户不在

		/** 城市部件 */
		digitalCityType.put(PUBLICFACILITIES_KEY,
				PropertyTypesYinchuan.PUBLIC_FACILITIES);
		digitalCityType
				.put(ROADTRAFFIC_KEY, PropertyTypesYinchuan.ROAD_TRAFFIC);
		digitalCityType.put(CITYENVIRONMRNT_KEY,
				PropertyTypesYinchuan.CITY_ENVIRONMENT);
		digitalCityType.put(LANDSCAPING_KEY, PropertyTypesYinchuan.LANDSCAPING);
		digitalCityType.put(HOUSELAND_KEY, PropertyTypesYinchuan.HOUSELAND);
		digitalCityType.put(EXPANSIONCOMPONENTS_KEY,
				PropertyTypesYinchuan.EXPANSION_COMPONENTS);
		digitalCityType.put(OTHERFACILITIES_KEY,
				PropertyTypesYinchuan.OTHER_FACILITIES);

		keyNames.put(RENHUTONGZAI_KEY, RENHUTONGZAI);// 人户同在
		keyNames.put(HUZAIRENBUZAI_KEY, HUZAIRENBUZAI);// 户在人不在
		keyNames.put(RENZAIHUBUZAI_KEY, RENZAIHUBUZAI);// 人在户不在

		keyNames.put(GIS2DLAYER_KEY, GIS2DLAYER_DISPLAYNAME);
		keyNames.put(UPDATELONLAT_KEY, UPDATELONLAT_DISPLAYNAME);
	}

	public static String toString(String key) {
		if (key == null)
			return "druggys";
		else
			return keyTables.get(key);
	}

	public static Map<String, String> backTablesMap() {
		return keyTables;
	}

	public static String getTypeValue(String key) {
		return keyTables.get(key);
	}

	public static String getTypeDisplayNames(String key) {
		if (key == null) {
			return null;
		}
		key = key.split("_")[0];
		String key1 = key.substring(0, key.length() - 1);
		for (String kn : keyNames.keySet()) {
			if (key.toLowerCase().equals(kn.toLowerCase())) {
				key = kn;
				break;
			}
			if (key1.toLowerCase().equals(kn.toLowerCase())) {
				key = kn;
				break;
			}
		}
		return keyNames.get(key);
	}

	public static List<String> getImportantPersonalKeys() {
		return new ArrayList<String>(importantsPersonnelTables.keySet());
	}

	public static List<String> getImportantPlaceKeys() {
		return new ArrayList<String>(importantPlaceTables.keySet());
	}

	public static List<String> getPopulationKeys() {
		return new ArrayList<String>(personnelTables.keySet());
	}

	public static List<String> getCivilKeys() {
		return new ArrayList<String>(civil.keySet());
	}

	public static List<String> getBirthKeys() {
		return new ArrayList<String>(birth.keySet());
	}

	public static List<String> getUnemployedKeys() {
		return new ArrayList<String>(unemployed.keySet());
	}

	public static Map<String, String> getKeytables() {
		return keyTables;
	}

	public static List<String> getGrassrootOrganizationKeys() {
		return new ArrayList<String>(grassrootOrganizationTables.keySet());
	}

	public static void main(String[] args) {
		String[] names = BaseInfoTables.class.getName().split("\\.");
		String attr = names[names.length - 1];
		attr = attr.substring(0, 1).toLowerCase() + attr.substring(1);
		System.out.println(attr);
	}

	public static Map<String, String> getKeyName() {
		return keyNames;
	}

	public static Map<String, String> getBussinesspopulationtables() {
		return bussinessPopulationTables;
	}

}
