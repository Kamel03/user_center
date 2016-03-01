package com.tianque.core.cache.constant;

import com.tianque.core.util.EncryptUtil;
import com.tianque.core.util.StringUtil;

public class MemCacheConstant {
	/** 人口缓存标识 */
	public static final String POPULATION_NAMESPACE = "population_";
	/** 单位场所缓存标识 */
	public static final String COMPANYPLACE_NAMESPACE = "companyPlace_";
	/** 用户缓存标识 */
	public static final String USER_NAMESPACE = "user_";
	/** 用户缓存标识 */
	public static final String USER_KEY = "user_key_";

	/** 防止表单提交缓存标识 */
	// public static final String TOKEN_REQUEST_PARAMETER = "form.parameter";
	/** 组织机构缓存标识 */
	public static final String ORGANIZATION_NAMESPACE = "organization_";
	/** session缓存标识 */
	public static final String SESSION_NAMESPACE = "session_";
	/** 地图缓存标识 */
	public static final String MAP_NAMESPACE = "map_";
	/** 领导视图缓存标识 */
	public static final String LEADERVIEW_NAMESPACE = "leaderView_";
	/** 研判分析缓存标识 */
	public static final String ANALYSIS_NAMESPACE = "analysis_";
	/** 事件缓存标识issueTypeDao */
	public final static String IssueTypeDao_IssueTypeDomain_NameSpace = "IssueTypeDomain_";
	public final static String IssueTypeDao_IssueType_NameSpace = "IssueType_";
	/** 事件缓存标识issueTypeDomainDao */
	public final static String IssueTypeDomainDao_findIssueTypeDomains = "IssueTypeDomainDao_findIssueTypeDomains_";
	/** 基础信息的缓存标识 */
	public final static String BASEINFOCONTEXT_NAMESPACE = "baseInfoContext_";
	/**
	 * =======================================================
	 */
	/** 危险品从业人员 */
	public static final String CACHE_ADDDANGEROUSGOODSPRACTITIONERBASEINFO = "addDangerousGoodsPractitionerBaseInfo";
	public static final String CACHE_ADDDANGEROUSGOODSPRACTITIONER = "addDangerousGoodsPractitioner";
	public static final String CACHE_ADDDANGEROUSGOODSPRACTITIONERFORMOBILE = "addDangerousGoodsPractitionerForMobile";
	/** 吸毒人员 */
	public static final String CACHE_ADDDRUGGY = "addDruggy";
	public static final String CACHE_ADDDRUGGYBASEINFO = "addDruggyBaseInfo";
	public static final String CACHE_ADDDRUGGYFORMOBILE = "addDruggyForMobile";
	/** 老年人 */
	public static final String CACHE_ADDELDERLYPEOPLE = "addElderlyPeople";
	public static final String CACHE_ADDELDERLYPEOPLEBASEINFO = "addElderlyPeopleBaseInfo";
	/** 残疾人 */
	public static final String CACHE_ADDHANDICAPPED = "addHandicapped";
	public static final String CACHE_ADDHANDICAPPEDBASEINFO = "addHandicappedBaseInfo";
	/** 重点青少年 */
	public static final String CACHE_ADDIDLEYOUTH = "addIdleYouth";
	public static final String CACHE_ADDIDLEYOUTHBASEINFO = "addIdleYouthBaseInfo";
	/** 育龄妇女 */
	public static final String CACHE_ADDNURTURESWOMEN = "addNurturesWomen";
	public static final String CACHE_ADDNURTURESWOMENBASEINFO = "addNurturesWomenBaseInfo";
	/** 优抚对象 */
	public static final String CACHE_ADDOPTIMALOBJECT = "addOptimalObject";
	public static final String CACHE_ADDOPTIMALOBJECTBASEINFO = "addOptimalObjectBaseInfo";
	/** 其他人员 */
	public static final String CACHE_ADDOTHERATTENTIONPERSONNEL = "addOtherAttentionPersonnel";
	public static final String CACHE_ADDOTHERATTENTIONPERSONNELBASEINFO = "addOtherAttentionPersonnelBaseInfo";
	/** 境外人员 */
	public static final String CACHE_ADDOVERSEAPERSONNEL = "addOverseaPersonnel";
	/** 刑释解教人员 */
	public static final String CACHE_ADDPOSITIVEINFO = "addPositiveInfo";
	public static final String CACHE_ADDPOSITIVEINFOBASEINFO = "addPositiveInfoBaseInfo";
	/** 艾滋病人员 */
	public static final String CACHE_ADDAIDSPOPULATIONS = "addAidspopulations";
	public static final String CACHE_ADDAIDSPOPULATIONBASEINFO = "addAidspopulationBaseInfo";
	/** F人员 */
	public static final String CACHE_ADDFPERSONNEL = "addFPersonnel";
	public static final String CACHE_ADDFPERSONNELBASEINFO = "addFPersonnelBaseInfo";
	/** M人员 */
	public static final String CACHE_ADDMPERSONNEL = "addMPersonnel";
	public static final String CACHE_ADDMPERSONNELBASEINFO = "addMPersonnelBaseInfo";
	/** Q人员 */
	public static final String CACHE_ADDQPERSONNEL = "addQPersonnel";
	public static final String CACHE_ADDQPERSONNELBASEINFO = "addQPersonnelBaseInfo";
	/** 社区矫正人员 */
	public static final String CACHE_ADDRECTIFICATIVEPERSON = "addRectificativePerson";
	public static final String CACHE_ADDRECTIFICATIVEPERSONBASEINFO = "addRectificativePersonBaseInfo";
	/** 精神病人员 */
	public static final String CACHE_ADDMENTALPATIENT = "addMentalPatient";
	public static final String CACHE_ADDMENTALPATIENTBASEINFO = "addMentalPatientBaseInfo";
	/** 重点上访人员 */
	public static final String CACHE_ADDSUPERIORVISIT = "addSuperiorVisit";
	public static final String CACHE_ADDSUPERIORVISITFORMOBILE = "addSuperiorVisitForMobile";
	public static final String CACHE_ADDSUPERIORVISITBASEINFO = "addSuperiorVisitBaseInfo";
	/** 需救助对象 */
	public static final String CACHE_ADDAIDNEEDPOPULATION = "addAidNeedPopulation";
	public static final String CACHE_ADDAIDNEEDPOPULATIONBASEINFO = "addAidNeedPopulationBaseInfo";
	/** 失业人员 */
	public static final String CACHE_ADDUNEMPLOYEDPEOPLE = "addUnemployedPeople";
	public static final String CACHE_ADDUNEMPLOYEDPEOPLEBASEINFO = "addUnemployedPeopleBaseInfo";
	/** 户籍人口 */
	public static final String HOUSEHOLDSTAFF_KEY = "householdStaff";
	/** 流动人口 */
	public static final String CACHE_ADDFLOATINGPOPULATION = "addFloatingPopulation";
	public static final String CACHE_ADDFLOATINGPOPULATIONFORMOBILE = "addFloatingPopulationFormob";
	public static final String CACHE_ADDFLOATINGPOPULATIONBASEINFO = "addFloatingPopulationBaseInfo";
	/**
	 * 地图
	 */
	/** 地图房屋 */
	public static final String COUNT_HOUSEPROPERTYBYORGCODE = "countHousePropertyByOrgCode";
	public static final String COUNT_BOUNDEDTWODIMENSIONMAPINFOBYORGINTERNALCODE = "countBoundedTwoDimensionMapInfoByOrgInternalCode";
	/** 地图事件 */
	public static final String COUNT_MYJURISDICTIONSNEEDDOBOUNDEDTWODIMENSIONMAPINFOBYORGINTERNALCODE = "countmyjurisdictionsneeddoboundedtwodimensionmapinfobyorginternalcode";
	public static final String COUNT_MYJURISDICTIONSFINISHBOUNDEDTWODIMENSIONMAPINFOBYORGINTERNALCODE = "countMyJurisdictionsFinishBoundedTwoDimensionMapInfoByOrgInternalCode";
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGIDANDTYPENAME = "countTwoDimensionMapPageInfoByOrgIdAndTypeName";
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGINTERNALCODEANDTYPENAME = "countTwoDimensionMapPageInfoByOrgInternalCodeAndTypeName";
	public static final String COUNT_MYJURISDICTIONSNEEDDOTWODIMENSIONMAPPAGEINFOBYORGIDANDDEALSTATE = "countMyJurisdictionsNeedDoTwoDimensionMapPageInfoByOrgIdAndDealState";
	public static final String COUNT_MYJURISDICTIONSDONETWODIMENSIONMAPPAGEINFOBYORGIDANDDEALSTATE = "countMyJurisdictionsDoneTwoDimensionMapPageInfoByOrgIdAndDealState";
	public static final String COUNT_MYDONETWODIMENSIONMAPPAGEINFOBYORGIDANDDEALSTATE = "countMyDoneTwoDimensionMapPageInfoByOrgIdAndDealState";

	/** 地图重点人员 */
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGINTERNALCODEANDSCREENCOORDINATEVOANDTYPENAME_POINT = "countTwoDimensionMapPageInfoByOrgInternalCodeAndScreenCoordinateVoAndTypeName_point";
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGINTERNALCODEANDTYPENAME_POINT = "countTwoDimensionMapPageInfoByOrgInternalCodeAndTypeName_point";
	/** 地图单位场所 */
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGINTERNALCODEANDTYPENAME_COMPANYPLACE = "countTwoDimensionMapPageInfoByOrgInternalCodeAndTypeName_companyPlace";
	public static final String COUNT_TWODIMENSIONMAPINFOBYORGINTERNALCODEANDSCREENCOORDINATEVOANDTYPENAME_COMPANYPLACE = "countTwoDimensionMapInfoByOrgInternalCodeAndScreenCoordinateVoAndTypeName_companyPlace";
	/** 地图人口信息 */
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGINTERNALCODEANDTYPENAME_POPULATION = "countTwoDimensionMapPageInfoByOrgInternalCodeAndTypeName_population";
	public static final String COUNT_BOUNDEDTWODIMENSIONMAPINFOBYORGINTERNALCODEANDTYPENAME_POPULATION = "countBoundedTwoDimensionMapInfoByOrgInternalCodeAndTypeName_population";
	/** 地图公安部件 */
	public static final String COUNT_TWODIMENSIONMAPPAGEINFOBYORGINTERNALCODEANDSCREENCOORDINATEVO = "countTwoDimensionMapPageInfoByOrgInternalCodeAndScreenCoordinateVo";
	/** gis二维地图区域管理 */
	public static final String GETUNDERGIS2DLAYERSBYORGID = "getUnderGis2DLayersByOrgId";
	public static final String GISUTIL_INTERSECTPOLYGON = "gisUtilIntersectPolygon";

	/** 领导视图 */
	public static final String STATCOUNTBYORGIDKEY = "statCountByOrgId";
	public static final String COMPANY_ANALYSIS = "companyAnalysis";
	public static final String STATISTICSCOLUMN = "statisticsColumn";// 柱状图
	public static final String STATISTICSPIE = "statisticsPie";// 饼状图
	public static final String STATISTICSTABLELIST = "statisticsTableList";// 报表
	public static final String STATISTICSTREND = "statisticsTrend";// 趋势图
	public static final String ROOTKEY = "AnalyseUtilNodeRootKey";

	/** 事件issueTypeDao */
	public static final String FINDISSUETYPESBYDOMAINID = "findIssueTypesBydomainId";
	public static final String FINDISSUETYPESBYDOMAINIDANDORGINTERNALCODE = "findIssueTypesByDomainIdAndOrgInternalCode";
	public static final String FINDENABLEDISSUETYPESBYDOMAINIDANDORGID = "findEnabledIssueTypesByDomainIdAndOrgId";
	public static final String FINDALLISSUETYPESBYDOMAINIDANDORGID = "findAllIssueTypesByDomainIdAndOrgid";

	/** 事件issueTypeDomainDao */
	public static final String FINDISSUETYPEDOMAINS = "findIssueTypeDomains";
	public static final String FINDISSUETYPEDOMAINSBYMODULE = "findIssueTypeDomainsByModule";

	/** 单位场所 */
	public static final String CACHE_COMPANYPLACE = "cache_companyplace";
	public static String COMPANYPLACEKEY = "CompanyPlace";
	/**
	 * 权限缓存namespace标识
	 */
	public static final String PERMISSION_NAMESPACE = "permission_";
	/**
	 * 数据字典缓存namespace标识(以大类Id[domainId做区分的namespace]单个子类缓存)
	 */
	public static final String PROPERTYDICT_NAMESPACE = "propertyDict_";
	/**
	 * 数据字典缓存namespace标识(以大类Id[domainId做区分的namespace]大类对应所有子类的缓存)
	 */
	public static final String PROPERTYDICTS_BY_DOMAIN_NAMESPACE = "propertydicts_by_domain_";

	/**
	 * 数据字典缓存namespace标识
	 */
	public static final String PROPERTYDOMAIN_NAMESPACE = "propertyDomain_";

	// /**
	// * 组织机构缓存namespace标识
	// */
	// public static final String ORGANIZATION_NAMESPACE = "organization_";

	/**
	 * 工作台缓存namespace标识
	 */
	public static final String PATELCONFIG_NAMESPACE = "patelConfig_";

	/**
	 * token缓存namespace标识
	 */
	public static final String TOKEN_NAMESPACE = "token_";

	/**
	 * 单位场所缓存namespace标识
	 */
	// public static final String COMPANYPLACE_NAMESPACE = "companyPlace_";
	/**
	 * 处理数据来源缓存namespace标识
	 */
	public static final String DATAFROMTYPE_NAMESPACE = "dataFromType_";

	/**
	 * 岗位权限的缓存key值前缀规范
	 */
	public static final String MENUPERMISSION_KEY = "menuPermission";
	/**
	 * 用户权限的缓存key值前缀规范
	 */
	public static final String USERPERMISSION_KEY = "userPermission";
	/**
	 * 用户权限的缓存key值拼接的参数
	 */
	public static final String USERPERMISSION_KEYPARAME_NOTE = "List<Node>";
	/**
	 * 用户权限的缓存key值拼接的参数
	 */
	public static final String USERPERMISSION_KEYPARAME_STRING = "List<String>";

	/**
	 * 岗位权限的缓存key值前缀规范
	 */
	public static final String MENUPERMISSION_KEYPERMISSIONIDTYPE_PARENTID = "parentId";

	/**
	 * 岗位权限的缓存key值前缀规范（区分出不需要领导视图权限的部分）
	 */
	public static final String MENUPERMISSION_KEYPERMISSIONIDTYPE_PARENTID_TREE = "parentId_to_tree";
	/**
	 * 岗位权限的缓存key值前缀规范
	 */
	public static final String MENUPERMISSION_KEYPERMISSIONIDTYPE_ID = "id";
	/**
	 * 岗位权限的缓存key值前缀规范
	 */
	public static final String MENUPERMISSION_KEYPERMISSIONIDTYPE_ENAME = "ename";

	/**
	 * 数据字典的缓存key值前缀规范
	 */
	public static final String PROPERTYDICT_KEY = "propertyDict";
	/**
	 * 数据字典通过id的缓存key值拼接的参数
	 */
	public static final String PROPERTYDICT_ID_KEY = "id";
	/**
	 * 数据字典通过domainId的缓存key值前缀规范
	 */
	public static final String PROPERTYDICT_DOMAINID_KEY = "domainId";

	// /**
	// * 组织机构的缓存key值前缀规范
	// */
	// public static final String ORGANIZATION_KEY = "organization";
	//
	// /**
	// * 组织机构的缓存key值拼接的参数
	// */
	// public static final String ORGANIZATION_ID_KEY = "id";
	//
	// /**
	// * 组织机构的缓存key值拼接的参数
	// */
	// public static final String ORGANIZATION_PARENTID_KEY = "parentId";
	//
	// /**
	// * 组织机构的缓存key值拼接的参数
	// */
	// public static final String ORGANIZATION_LEVELID_KEY = "levelId";
	// /**
	// * 组织机构的缓存key值拼接的参数
	// */
	// public static final String ORGANIZATION_FUNCTIONALTYPE_KEY =
	// "orgFunctionalType";

	/**
	 * 数据字典的缓存key值前缀规范
	 */
	public static final String PROPERTYDOMAIN_KEY = "propertyDomain";
	/**
	 * 数据字典通过id的缓存key值拼接的参数
	 */
	public static final String PROPERTYDOMAIN_DOMAINID_KEY = "domainId";
	/**
	 * 数据字典通过domainName的缓存key值拼接的参数
	 */
	public static final String PROPERTYDOMAIN_DOMAINNAME_KEY = "domainName";

	/**
	 * 工作台的缓存key值前缀规范
	 */
	public static final String PATELCONFIG_KEY = "patelConfig";
	/**
	 * 工作台通过PatelConfigList的缓存key值拼接的参数
	 */
	public static final String PATELCONFIG_PATEL_KEY = "patel";
	/**
	 * 工作台通过TabPatelList的缓存key值拼接的参数
	 */
	public static final String PATELCONFIG_TABPATEL_KEY = "tabPatel";

	/**
	 * token缓存key值前缀规范
	 */
	public static final String TOKEN_KEY = "token";

	/**
	 * 单位场所缓存key值前缀规范
	 */
	public static final String COMPANYPLACE_KEY = "companyPlace";
	/**
	 * 单位场所缓存key值拼接的参数（数据变换）
	 */
	public static final String COMPANYPLACE_CONVERTER_KEY = "converter";
	/**
	 * 单位场所缓存key值拼接的参数（单位场所基本数据）
	 */
	public static final String COMPANYPLACE_BASE_KEY = "base";

	/**
	 * 处理数据来源缓存key值前缀规范
	 */
	public static final String DATAFROMTYPE_KEY = "dataFromType";

	/**
	 * 缓存计数器和列表 缓存KEY值前缀
	 */
	public static final String CACHE_PAGE = "cache_page";

	/** 研判分析账号覆盖率报表namespace */
	public static final String ANALYSE_USERACTIVATEREPORT_NAMESPACE = "analyse_userActivateReport";
	/** 研判分析基础信息统计报表namespace */
	public static final String BASESITUATION_STATEMENT_NAMESPACE = "basesituation_statement";

	// 研判分析基本信息统计报表namespace
	public static final String ANALYSE_BASE_SITUATION_STATEMENT_NAMESPACE = "analyse_baseSituationStatement";
	// cachekey
	public static final String BASE_SITUATION_STATEMENT_CACHKEY = "baseSituationStatement";

	// 基本信息统计报表获取缓存key
	public static String getBasesituationStatementCachKey(String cachekey,
			int year, int month, Integer type, Long orgId, String statisticsType) {
		if (null == cachekey || null == type || null == orgId) {
			return null;
		}
		String key = cachekey + "_" + orgId + "_" + type + "_" + year + "_"
				+ month + "_" + statisticsType;
		return key;
	}

	/**
	 * 用户权限缓存的key拼装
	 * 
	 * @param cacheKey
	 *            （用户权限的缓存key值前缀）
	 * @param userId
	 *            （用户的id）
	 * @param parame
	 *            (1.当userId跟别的缓存相同的时候，该参数存储，value的返回值类型；2.传参)
	 * 
	 * @return
	 */
	public static String getUserPermissionKey(String cacheKey, Long userId,
			String parame) {
		if (null == cacheKey && null == userId && null == parame) {
			return null;
		}
		String key = cacheKey + "_" + userId + "_" + parame;
		return key;
	}

	/**
	 * 岗位权限的缓存key拼装
	 * 
	 * @param cacheKey
	 *            （岗位权限的缓存key值前缀）
	 * @param permissionId
	 *            （岗位id）
	 * @param permissionIdType
	 *            (权限的id类型，parentId或者id)
	 * @param parame
	 *            （可以存储key中不包含以上两个参数的（eg：ename））
	 * @return
	 */
	public static String getMenuPermissionKey(String cacheKey,
			Long permissionId, String permissionIdType, String parame) {
		String key = "";
		if (null == cacheKey && null == permissionIdType
				&& (null == permissionId || null == parame)) {
			return null;
		}
		if (null != permissionId && parame == null) {
			key = cacheKey + "_" + permissionIdType + "_" + permissionId;
		}
		if (null == permissionId && parame != null) {
			key = cacheKey + "_" + permissionIdType + "_" + parame;
		}
		return key;
	}

	/**
	 * 数据字典的缓存key拼装
	 * 
	 * @param cacheKey
	 *            （数据字典的缓存key值前缀）
	 * @param dictId
	 *            （数据字典id）
	 * @param propertyDictType
	 *            (数据字典类型，domainId或者id)
	 * @param domainId
	 *            （数据字典domainId）
	 * @return
	 */
	public static String getPropertyDictKey(String cacheKey,
			String propertyDictType, Long dictId, Long domainId) {
		if (null == cacheKey && null == propertyDictType
				&& (null == dictId || null == domainId)) {
			return null;
		}
		String key = "";
		if (null != dictId) {
			key = cacheKey + "_" + propertyDictType + "_" + dictId;
		} else if (null != domainId) {
			key = cacheKey + "_" + propertyDictType + "_" + domainId;
		}
		return key;
	}

	/**
	 * 根据大类id去设置大类有小类所对应的小类缓存的nameSpace
	 * 
	 * @param cacheNameNameSpace
	 * @param domainId
	 *            大类id
	 * @return
	 */

	public static String getPropertyDomainHasPropertyNameSpace(
			String cacheNameNameSpace, Long domainId) {
		String nameNameSpace = null;
		if (!StringUtil.isStringAvaliable(cacheNameNameSpace)
				|| domainId == null) {
			return nameNameSpace;
		}
		nameNameSpace = cacheNameNameSpace + domainId.toString();

		return nameNameSpace;
	}

	/**
	 * 数据字典的缓存key拼装
	 * 
	 * @param cacheKey
	 *            （数据字典的缓存key值前缀）
	 * @param domainId
	 *            （数据字典id）
	 * @param propertyDomainType
	 *            (数据字典类型，domainId或者domainName)
	 * @param domainName
	 *            （数据字典domainName）
	 * @return
	 */
	public static String getPropertyDomainKey(String cacheKey,
			String propertyDomainType, Long domainId, String domainName) {
		if (null == cacheKey && null == propertyDomainType
				&& (null == domainId || null == domainName)) {
			return null;
		}
		String key = "";
		if (null != domainId) {
			key = cacheKey + "_" + propertyDomainType + "_" + domainId;
		} else if (null != domainName) {
			key = cacheKey + "_" + propertyDomainType + "_" + domainName;
		} else {
			key = cacheKey;
		}
		return key;
	}

	/**
	 * 组织机构的缓存key拼装
	 * 
	 * @param cacheKey
	 *            （组织机构的缓存key值前缀）
	 * @param organizationTypeValue
	 *            （权限的类型值）
	 * @param organizationType
	 *            (权限的类型，parentId或者id或者levelId)
	 * @param parame
	 *            （可以存储key中无法通过上面两个参数区分的key，eg(当为parentId时，
	 *            这个参数为orgFunctionalType)）
	 * @return
	 */
	// public static String getOrganizationKey(String cacheKey,
	// Long organizationTypeValue, String organizationType, String parame) {
	// if (null == cacheKey && null == organizationTypeValue
	// && null == organizationType) {
	// return null;
	// }
	// String key = cacheKey + "_" + organizationType + "_"
	// + organizationTypeValue;
	// if (parame != null) {
	// key = key + "_" + parame;
	// }
	// return key;
	// }

	/**
	 * 工作台的缓存key拼装
	 * 
	 * @param cacheKey
	 *            （工作台的缓存key值前缀）
	 * @param userId
	 *            （用户id）
	 * @param patelConfigType
	 *            (工作台的类型，patel或者tabPatel)
	 * @param parame
	 *            （存储无法通过上面两个参数区分的值，eg:keyName的值）
	 * @return
	 */
	public static String getPatelConfigKey(String cacheKey,
			String patelConfigType, Long userId, String parame) {
		if (null == cacheKey && null == patelConfigType && null == userId) {
			return null;
		}
		String key = cacheKey + "_" + patelConfigType + "_" + userId;
		if (parame != null) {
			key = key + "_" + parame;
		}
		return key;
	}

	/**
	 * token的缓存key拼装
	 * 
	 * @param cacheKey
	 *            （token的缓存key值前缀）
	 * @param token
	 *            （token随机数）
	 * @return
	 */
	public static String getTokenKey(String cacheKey, String token) {
		if (null == cacheKey && null == token) {
			return null;
		}
		String key = cacheKey + "_" + token;
		return key;
	}

	/**
	 * 单位场所的缓存key拼装
	 * 
	 * @param cacheKey
	 * @param companyPlaceType
	 *            （converter{数据变换}或者base）
	 * @param companyPlaceName
	 *            （单位场所名称）
	 * @param orgId
	 *            （单位场所所属组织机构id）
	 * @param classifiCationId
	 *            （单位场所分类二级 字典项）
	 * @return
	 */
	public static String getCompanyPlaceKey(String cacheKey,
			String companyPlaceType, String companyPlaceName, Long orgId,
			Long classifiCationId) {
		if (null == cacheKey && null == companyPlaceType
				&& null == companyPlaceName && null == orgId
				&& null == classifiCationId) {
			return null;
		}
		String md5Name = EncryptUtil.md5Encrypt(companyPlaceName);
		String key = cacheKey + "_" + companyPlaceType + "_" + md5Name + "_"
				+ orgId + "_" + classifiCationId;
		return key;
	}

	/**
	 * 数据来源key值规范
	 * 
	 * @param cacheKey
	 * @param idCard
	 * @param orgId
	 * @return
	 */
	public static String getDataFromTypeKey(String cacheKey, int seq) {
		if (null == cacheKey) {
			return null;
		}
		String key = cacheKey + "_" + seq;
		return key;
	}

	/** 人口缓存key值规范 */
	public static String getPopulationKey(String cacheKey, String idCard,
			Long orgId) {
		if (null == cacheKey || null == idCard || null == orgId) {
			return null;
		}
		String key = cacheKey + "_" + idCard + "_" + orgId;
		return key;
	}

	/** 组织机构缓存nameSpace */
	public static String getOrganizationNameSpace(Long parentId,
			Long orgFunctionalType) {
		if (orgFunctionalType == null) {
			return ORGANIZATION_NAMESPACE + parentId;
		}
		return ORGANIZATION_NAMESPACE + parentId + "_" + orgFunctionalType + "";
	}

	/** 组织机构缓存3个参数 */
	public static String getOrganizationKey(Long parentId, int orgTypeId,
			Long orgFunctionalType) {
		StringBuffer findOrgsByParentIdAndOrgTypeIdsKey = new StringBuffer();
		findOrgsByParentIdAndOrgTypeIdsKey.append(parentId);
		findOrgsByParentIdAndOrgTypeIdsKey.append("_");
		findOrgsByParentIdAndOrgTypeIdsKey.append(orgTypeId);
		if (orgFunctionalType != null) {
			findOrgsByParentIdAndOrgTypeIdsKey.append("_");
			findOrgsByParentIdAndOrgTypeIdsKey.append(orgFunctionalType);
		}
		return findOrgsByParentIdAndOrgTypeIdsKey.toString();
	}

	/** 组织机构缓存2个参数 */
	public static String generateCacheKeyFromId(Class<?> clazz, Long id) {
		if (null == id) {
			id = -1L;
		}
		return clazz.getName() + "_" + id.toString();
	}

	/** session缓存key */
	public static String generateCacheKeyFromString(Class<?> clazz, String name) {
		return clazz.getName() + "_keystring:" + name;
	}

	/** 地图房屋缓存key */
	public static String generateCacheKeyFromMethodName(Class<?> clazz,
			String methodname, String typeName, String orgInternalCode) {
		return clazz.getName() + ":" + methodname + ",param:" + typeName + "&"
				+ orgInternalCode;
	}

	public static String generateCacheKeyFromMethodName(Class<?> clazz,
			String methodname, Object param) {
		return clazz.getName() + ":" + methodname + ",param:" + param;
	}

	public static String generateCacheKeyFromMethodName(Class<?> clazz,
			String methodname, String typeName, String orgInternalCode,
			String param) {
		return clazz.getName() + ":" + methodname + ",param:" + typeName + "&"
				+ orgInternalCode + "&" + param;
	}

	/** 领导视图缓存key */
	/** 统计本月的缓存key */
	public static String getCurrentKey(Long orgId, String moduleKey) {
		String catchKey = STATCOUNTBYORGIDKEY + "_" + orgId + "_" + moduleKey;
		return catchKey;
	}

	public static String getCurrentKey(String str, Long orgId, String moduleKey) {
		String catchKey = str + "_" + orgId + "_" + moduleKey;
		return catchKey;
	}

	/** 线形图的缓存key */
	public static String getSummaryKey(String moduleKey, String time, Long orgId) {
		String catchKey = moduleKey + "_" + time + "_" + orgId;
		return catchKey;
	}

	/** 根据orgId、类型、年、月查询区域分布图缓存key */
	public static String getColumnByTimeKey(Long orgId, String keyName,
			String moduleType, int year, int month) {
		String catchKey = COMPANY_ANALYSIS + "_" + keyName + "_" + moduleType
				+ "_" + orgId + "_" + year + "_" + month;
		return catchKey;
	}

	public static String getColumnByTimeKey(Long orgId, String keyName,
			String moduleType) {
		String catchKey = COMPANY_ANALYSIS + "_" + keyName + "_" + moduleType
				+ "_" + orgId;
		return catchKey;
	}

	/** 获得研判分析缓存key */
	public static String getAnalysisKey(String key, Long orgId,
			String moduleType) {
		String catchKey = key + "_" + orgId + "_" + moduleType;
		return catchKey;
	}

	/** issueTypeDao */
	public static String getDomainNameSpace(Long domainId) {
		return IssueTypeDao_IssueTypeDomain_NameSpace + domainId.toString();
	}

	public static String getIssueTypeNameSpace(Long domainId) {
		return IssueTypeDao_IssueType_NameSpace + domainId.toString();
	}

	/** issueTypeDomainDao */
	public static String getIssueTypeDomainsNameSpace() {
		return IssueTypeDomainDao_findIssueTypeDomains;
	}

	/** 单位场所缓存key */
	public static String getCompanyPlaceKey(String key,
			String companyPlaceName, Long classifiCationId, Long orgId) {
		String md5Name = EncryptUtil.md5Encrypt(companyPlaceName);
		String catchKey = key + "_" + md5Name + "_" + classifiCationId + "_"
				+ orgId;
		return catchKey;
	}

	/**
	 * 缓存计数器和列表 缓存名称
	 * 
	 * @param SimpleName
	 *            对象的SimpleName
	 * @return
	 */
	public static String getCachePageKey(String simpleName) {
		String cacheKey = CACHE_PAGE + "_" + simpleName;
		return cacheKey;
	}

	public static String getCachePageKey(Class clazz) {
		String cacheKey = CACHE_PAGE + "_" + clazz.getSimpleName();
		return cacheKey;
	}

	/******************************************************** wangchao **************************************/
	// 研判分析-辖区信息_基层组织namespace
	public static final String ANALYSE_GRASSROOTS_NAMESPACE = "analyse_grassroots";
	// 基层组织的cachkey
	public static final String GRASSROOTS_CACHKEY = "grassroots";

	// 研判分析-辖区信息_组织机构统计namespace
	public static final String ANALYSE_ORGANIZATIONSTATISTICS_NAMESPACE = "analyse_organizationStatistics";
	// 组织机构统计cachkey
	public static final String ORGANIZATIONSTATISTICS_CACHKEY = "organizationStatistics";

	// 研判分析-组织机构_总况 namespace
	public static final String ANALYSE_ORGANIZATION_NAMESPACE = "analyse_organization";
	// 研判分析-组织机构_总况cachkey
	public static final String PRIMARYORGANIZATIONS_CACHKEY = "primaryOrganizations";

	// 研判分析-党委部门namespace
	public static final String ANALYSE_DEPARTEMENT_NAMESPACE = "analyse_departement";
	// 研判分析-党委部门cachkey
	public static final String DEPARTEMENT_CACHKEY = "departement";

	// 研判分析-党委部门_报表缓存key
	public static String getDepartmentKey(String cachKey, int year, int month,
			Long orgId, String statisticsType, Integer orgLevelDistance) {
		if (null == cachKey || null == orgId || null == statisticsType) {
			return null;
		}
		String key = "";
		if (orgLevelDistance == null) {
			key = cachKey + "_" + orgId + "_" + year + "_" + month + "_"
					+ statisticsType;
		} else {
			key = cachKey + "_" + orgId + "_" + orgLevelDistance + "_" + year
					+ "_" + month + "_" + statisticsType;
		}
		return key;
	}

	// 研判分析-有 cacheKey type year month orgId statisticsType参数的缓存key取值规范
	public static String getCachKeyForSixData(String cacheKey, String type,
			int year, int month, Long orgId, String statisticsType) {
		if (null == cacheKey || null == orgId || null == statisticsType) {
			return null;
		}
		String key = cacheKey + "_" + type + "_" + orgId + "_" + year + "_"
				+ month + "_" + statisticsType;
		return key;
	}

	// 研判分析- 有cachkey orgId statisticsType参数的缓存key取值规范
	public static String getCachKeyForThreeData(String cacheKey, Long orgId,
			String statisticsType) {
		if (null == cacheKey || null == orgId || null == statisticsType) {
			return null;
		}
		String key = cacheKey + "_" + orgId + "_" + statisticsType;
		return key;
	}

	/***************************************** 人口信息 *****************************************************/

	// 研判分析-人口信息-总况cachkey
	public static final String ALL_POPULATION_STATISTICS_CACHKEY = "all_population_statistics";

	public static final String getPopulationStatisticsCachKey(String cachKey,
			Long orgId, int year, int month, String statisticsType,
			Integer orgLevelDistance) {
		if (orgId == null || cachKey == null || statisticsType == null) {
			return null;
		}
		String key = "";
		if (orgLevelDistance != null) {
			key = cachKey + "_" + orgId + "_" + year + "_" + month + "_"
					+ orgLevelDistance + "_" + statisticsType;
		} else {
			key = cachKey + "_" + orgId + "_" + year + "_" + month + "_"
					+ statisticsType;
		}

		return key;
	}

	public static final String getPopulationCachKeyNamespace(
			String populationType) {
		if (!StringUtil.isStringAvaliable(populationType)) {
			return "analyse_all_population_statistics";
		} else {
			return "analyse_" + populationType;
		}
	}

	/***************************************** 登录统计 *****************************************************/
	// 行政、职能部门登录统计公用namespace和cachkey
	public static final String ANALYSE_ORGLOGINSTATISTICS_NAMESPACE = "analyse_orgLoginStatistics";
	public static final String ORGLOGINSTATISTICS_CACHKEY = "orgLoginStatistics";

	// 登录情况
	public static final String ANALYSE_LOGINMANAGE_NAMESPACE = "analyse_loginmanage";
	public static final String LOGINMANAGETABLEFIRST_CACHKEY = "loginmanageTableFirst";
	public static final String LOGINMANAGETABLESECOND_CACHKEY = "loginmanageTableSecond";

	public static final String getOrgLoginStatisticsCachKey(String cachKey,
			Long orgId, int internalId, int year, int month,
			String statisticsType) {
		if (orgId == null || cachKey == null || statisticsType == null) {
			return null;
		}
		String key = cachKey + "_" + orgId + "_" + internalId + "_" + year
				+ "_" + month + "_" + statisticsType;
		return key;
	}

	public static final String getLoginManageCachkey(String cachKey,
			Long orgId, int year, int month, String statisticsType) {
		if (orgId == null || cachKey == null || statisticsType == null) {
			return null;
		}
		String key = cachKey + "_" + orgId + "_" + year + "_" + month + "_"
				+ statisticsType;
		return key;
	}

	/***************************************** 单位场所 *****************************************************/
	public static final String COMPANYPLACE_CACHKEY = "companyPlace_Statistics";

	public static final String getCompanyPlaceAnalyseNameSpace(String moduleType) {
		if (!StringUtil.isStringAvaliable(moduleType)) {
			return "analyse_all_company_statistics";
		} else {
			return "analyse_" + moduleType;
		}
	}

	public static final String getCompanyPlaceCachKeyForTendency(
			String cachKey, String modulType, Long orgId, String statisticsType) {
		if (cachKey == null || orgId == null || statisticsType == null) {
			return null;
		}
		String key = cachKey + "_" + modulType + "_" + orgId + "_"
				+ statisticsType;
		return key;
	}

	public static final String getCompanyPlaceCachKey(String cachKey,
			String modulType, Long orgId, int year, int month,
			String statisticsType, Integer orgLevelDistance) {
		if (cachKey == null || orgId == null || statisticsType == null) {
			return null;
		}
		String key = "";
		if (orgLevelDistance != null) {
			key = cachKey + "_" + modulType + "_" + orgId + "_" + year + "_"
					+ month + "_" + orgLevelDistance + "_" + statisticsType;
		} else {
			key = cachKey + "_" + modulType + "_" + orgId + "_" + year + "_"
					+ month + "_" + statisticsType;
		}

		return key;
	}
}
