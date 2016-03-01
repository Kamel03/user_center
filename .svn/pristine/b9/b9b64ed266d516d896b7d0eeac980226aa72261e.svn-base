package com.tianque.plugin.analyzing.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.util.BaseInfoTables;
import com.tianque.domain.Organization;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.plugin.analyzing.domain.StatisticsBaseInfoAddCountVo;
import com.tianque.plugin.analyzing.domain.StatisticsNode;
import com.tianque.sysadmin.service.OrganizationService;

public class AnalyseUtil {

	public static final String STATCOUNTBYORGIDKEY = "statCountByOrgId";
	public static final String COMPANY_ANALYSIS = "companyAnalysis";
	public static final String ORG_LOGIN_STATISTICS = "orgLoginStatistics";
	/** 用户覆盖率统计的Key抬头 */
	public static final String USERACTIVATEREPORTKEY = "userActivateReport";
	// 实有人员表名
	public static final String ACTUALPERSONTABLENAME = "populationStatType";
	// 实有人员类别分布数据表名
	public static final String ACTUALPERSONCATEGORYTABLENAME = "householdStaffStat";
	// 重点人员表名
	public static final String IMPORTPERSONTABLENAME = "statistichistory";
	// 重点场所表名
	public static final String IMPORTPLACETABLENAME = "baseInfoStatType";
	// 青少年表名
	public static final String YOUTH_TABLE_NAME = "youthStatType";

	// 新的单位场所的表表名
	public static final String COMPANY_PLACE_TABLE_NAME = "companyPlaceStatType";

	// 组织机构表名
	public static final String PRIMARYORGANIZATIONSENAME = "primaryOrganizations";
	// 组织机构-党委部门 表名
	public static final String DEPARTMENTPARTYNAME = "departmentParty";

	public static final String LOCK_KEY = "LockKey";

	// 登录头攻击-表名
	public static final String LOGINMANGE_TABLE_NAME = "loginManage";

	// 系统操作日志-表名
	public static final String SYSTEMLOGS_TABLE_NAME = "systemlogs";
	/** 用户覆盖率-表名 */
	public static final String USER_ACTIVATE_REPORT_TABLE_NAME = "userActivateReports";

	/** 基本信息统计报表-表名 */
	public static final String BASESITUATION_STATEMENT_TABLE_NAME = "baseSituationStatement";

	/** 基本信息统计报表-sql */
	public static final String BASESITUATION_STATEMENT_TABLE_NAME_SQL = "create table %s "
			+ "(id 				number(10)  			not null primary key,"
			+ "year              number(10)              not null,"
			+ "month 			number(10)              not null,"
			+ "orgId				number(10)				not null,"
			+ "statisticsData	clob,"
			+ "createUser		varchar2(32)			not null,"
			+ "createDate		date					not null,"
			+ "statisticsType    number(1)               not null)";

	/** 用户覆盖率表sql */
	public static final String USER_ACTIVATE_REPORT_TABLE_NAME_SQL = "create table %s "
			+ "(id                   	NUMBER(10)                      not null primary key,"
			+ "year                  	NUMBER(10)                      not null,"
			+ "month                 	NUMBER(10)                      not null,"
			+ "orgId                 	NUMBER(10),"
			+ "orgInternalCode       	VARCHAR2(60)                    not null,"
			/** 组织机构下辖乡镇的个数 */
			+ "townCount           	 	NUMBER(10),"
			/** 组织机构下辖村社区的个数 */
			+ "villageCount          	NUMBER(10),"
			+ "communityCount          	NUMBER(10),"
			/** 组织机构下辖乡镇的激活数量（某个乡镇至少有一个账号激活的为1否则为0） */
			+ "townActivateCount     	NUMBER(10),"
			+ "communityActivateCount   NUMBER(10),"
			/** 组织机构下辖村社区的激活数量 */
			+ "villageActivateCount  	NUMBER(10),"
			/** 开通职能部门的总数 */
			+ "functionalActivateCount  NUMBER(10),"
			/** 所有的激活账号个数 */
			+ "allActivateCount  		NUMBER(10),"
			/** 季度活跃数 */
			+ "quarterActiveRateCount   NUMBER(10),"
			/** 月活跃数 */
			+ "monthActiveRateCount     NUMBER(10),"
			/** 周活跃数 */
			+ "weekActiveRateCount      NUMBER(10),"
			+ "createDate           	DATE  ,"
			+ "createUser           	varchar2(60))";

	// 系统日志表sql
	public static final String SYSTEMLOGS_TABLE_NAME_SQL = "create table %s"
			+ "(id        		  NUMBER(10)    not null primary key,"
			+ "orgId                NUMBER(10)                ,"
			+ "operationContent     clob                      ,"
			+ "logLevel             NUMBER(10)                ,"
			+ "operation            VARCHAR2(500)             ,"
			+ "moduleName           VARCHAR2(200)             ,"
			+ "username             VARCHAR2(60)				,"
			+ "clientIp             VARCHAR2(32)              ,"
			+ "orgInternalCode      VARCHAR2(32)              ,"
			+ "operateTime          DATE              not null,"
			+ "operationType 		  NUMBER(10)                ,"
			+ "beforekey 			  varchar2(150)             ,"
			+ "afterkey 			  varchar2(150)             ,"
			+ "beforename 		  varchar2(150)             ,"
			+ "aftername 			  varchar2(150)             )";

	// 单位场所sql
	public static final String COMPANY_PLACE_TABLE_NAME_SQL = "create table %s "
			+ "(id                  NUMBER(10)                      not null primary key,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "orgId                NUMBER(10),"
			+ "orgInternalCode      VARCHAR2(60)                    not null,"
			+ "startDate            DATE,"
			+ "endDate              DATE,"
			+ "typeName             VARCHAR2(60),"
			+ "baseinfoType         VARCHAR2(32)                    not null,"
			+ "total                NUMBER(10),"
			+ "percentage           varchar2(60),"
			+ "objectSum			NUMBER(10)						not null,"
			+ "monthcreate			NUMBER(10)						not null)";
	// 组织机构表SQL
	public static final String PRIMARYORGANIZATIONSSQL = "create table %s  "
			+ "(id                   NUMBER(10)                      not null primary key,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "total                NUMBER(10)                      not null,"
			+ "typeName             VARCHAR2(60)                    ,"
			+ "primaryOrgType       VARCHAR2(32),"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "createUser           varchar2(60)                    ,"
			+ "sum                  NUMBER(10)                      ,"
			+ "percentage           varchar2(60)                    ,"
			+ "objectSum			 NUMBER(10)                      ,"
			+ "monthcreate			 NUMBER(10)                      ,"
			+ "memberNum              NUMBER(10)                      )";
	// 实有人员表sql
	public static final String ACTUALPERSONSQL = "create table %s  "
			+ "(id                   NUMBER(10)                      not null primary key,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "total                NUMBER(10)                      not null,"
			+ "typeName             VARCHAR2(60)                    ,"
			+ "populationType       VARCHAR2(32)                    not null,"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "createUser           varchar2(60)                    ,"
			+ "sum                  NUMBER(10)                      ,"
			+ "percentage           varchar2(60)                    ,"
			+ "objectSum			 NUMBER(10)                      ,"
			+ "monthcreate			 NUMBER(10)                      ,"
			+ "involveTibetCount     NUMBER(10)                      ,"
			+ "involveSinkiangCount  NUMBER(10))";

	// 实有人员类别分布数据表sql
	public static final String ACTUALPERSONCATEGORYSQL = "create table %s  "
			+ "(id                  NUMBER(10)                      not null primary key,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "typeName             NUMBER(10)                        ,"
			+ "populationType       VARCHAR2(32)                    not null,"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "createUser           varchar2(60)                    ,"
			+ "monthcreate			 NUMBER(10))";

	// 重点人员的sql
	public static final String IMPORTPERSONSQL = "create table %s ( "
			+ " id                   NUMBER(10)                      not null primary key,"
			+ " year                 NUMBER(10)                      not null,"
			+ " month                NUMBER(10)                      not null,"
			+ " sum                  NUMBER(10)                      not null,"
			+ " countValue           NUMBER(10)                   ,"
			+ " typeName             VARCHAR2(60)                    not null,"
			+ " baseinfoType         VARCHAR2(32)                    not null,"
			+ " orgInternalCode      VARCHAR2(32)                    not null,"
			+ " orgName              VARCHAR2(60) ,"
			+ " orgId                NUMBER(10),"
			+ " isHelp               NUMBER(10)                      ,"
			+ " noHelp               NUMBER(10)                      ,"
			+ " resited              NUMBER(10)                      ,"
			+ " recidivism           NUMBER(10)                      ,"
			+ " createuser           VARCHAR2(32)                    ,"
			+ " createDate           DATE,"
			+ " startDate            DATE                            ,"
			+ " endDate              DATE                            ,"
			+ " MONTHCREATE     NUMBER(10)," + " ATTENTIONNUM    NUMBER(10),"
			+ " TOTAL           NUMBER(10))";

	// 创建重点场所表的sql
	public static final String IMPORTPLACESQL = "create table %s ( "
			+ "id                   NUMBER(10)                      not null primary key,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "total                NUMBER(10)                      not null,"
			+ "typeName             VARCHAR2(60)                    not null,"
			+ "baseinfoType         VARCHAR2(32)                    not null,"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "isHelp               NUMBER(10)                      ,"
			+ "noHelp               NUMBER(10)                      ,"
			+ "resited              NUMBER(10)                      ,"
			+ "sum                  NUMBER(10)                      ,"
			+ "recidivism           NUMBER(10)                      ,"
			+ "percentage           varchar2(60)                    not null,"
			+ "objectSum			 NUMBER(10)                      ,"
			+ "monthcreate			 NUMBER(10))";
	// 创建用户登录情况的统计表
	public static final String LOGINMANAGESQL = "create table %s ( "
			+ "id                   		NUMBER(10)                      not null,"
			+ "year                 		NUMBER(10)                      not null,"
			+ "month                		NUMBER(10)                      not null,"
			+ "orgId                		NUMBER(10)                      not null,"
			+ "orgInternalCode      		VARCHAR2(32)                    not null,"
			+ "createDate           		DATE                            		,"
			+ "createUser           		varchar2(60)                    		,"
			+ "allLoginCount            	NUMBER(10)                           	,"
			+ "threeMonthsLoginCount        NUMBER(10)                            	,"
			+ "outThreeMonthsLoginCount     NUMBER(10)                            	,"
			+ "nerverLoginCount             NUMBER(10)                     		  	,"
			+ "state                        NUMBER(10)      default 0             	,"
			+ "constraint pk%s primary key  (id))";
	/** 三本台账报表 */
	public static final String ACCOUNT_REPORT_TABLE_NAME = "accountReport";
	/** 三本台账报表sql */
	public static final String ACCOUNT_REPORT_TABLE_NAME_SQL = "create table %s "
			+ "(id					NUMBER(10)                      not null,"
			+ "orgId				NUMBER(10)                      not null,"
			+ "orgInternalCode 		VARCHAR2(32)                    not null,"
			+ "reportYear			VARCHAR2(4),"
			+ "reportMonth			VARCHAR2(2),"
			+ "content				CLOB,"
			+ "accountType			VARCHAR2(100),"
			+ "reportType			NUMBER(10),"
			+ "createUser           VARCHAR2(60),"
			+ "updateUser           VARCHAR2(60),"
			+ "createDate           DATE,"
			+ "updateDate           DATE,"
			+ "constraint pk%s primary key (ID))";
	/** 三本台账时限考核成绩表 */
	public static final String STATISTICS_ACCOUNT_TIMEOUT = "statisticsAccounts";
	/** 三本台账时限考核层级sql */
	public static final String STATISTICS_ACCOUNT_TIMEOUT_SQL = "create table %s "
			+ "(id 					number (10),"
			+ "orgid 				number(10) not null,"
			+ "orginternalcode 		varchar2(32) not null,"
			+ "parentorgid 			number(10) not null,"
			+ "orgtype 				number(10) not null,"
			+ "year 				varchar2(4),"
			+ "month 				varchar2(2),"
			+ "doing 				number(10,2) default 0.00,"
			+ "done 				number(10,2)  default 0.00,"
			+ "transfer 			number(10,2)  default 0.00,"
			+ "createuser 			varchar2(60),"
			+ "createdate 			date,"
			+ "constraint pk%s primary key (ID))";

	public static final Map<String, String[]> groupMap = new HashMap<String, String[]>();
	public static final String[] helps = { "已帮教", "未帮教", "帮教情况", "帮教率" };
	public static final String[] wards = { "已监管", "未监管", "监管情况", "监管率" };
	public static final String[] comprehensives = { "已落实综治人员", "未落实综治人员",
			"落实情况", "落实率" };
	public static final String[] leads = { "已落实负责人", "未落实负责人", "落实情况", "落实率" };

	/** systemlog每个月的表创建索引的loglevel字段 */
	private static final String LOGLEVEL_COLUMN = "loglevel";
	/** systemlog每个月的表创建索引的modulename字段 */
	private static final String MODULENAME_COLUMN = "modulename";
	/** systemlog每个月的表创建索引的operatetime字段 */
	private static final String OPERATETIME_COLUMN = "operatetime";
	/** systemlog每个月的表创建索引的orginternalcode字段 */
	private static final String ORGINTERNALCODE_COLUMN = "orginternalcode";
	/** systemlog每个月的表创建索引的username字段 */
	private static final String USERNAME_COLUMN = "username";

	/** 有些字段太长拼接后超过了索引名称超过了长度 */
	/** systemlog每个月的表创建索引的loglevel名称 */
	private static final String LOGLEVEL_COLUMN_NAME = "loglevel";
	/** systemlog每个月的表创建索引的modulename名称 */
	private static final String MODULENAME_COLUMN_NAME = "modulename";
	/** systemlog每个月的表创建索引的operatetime名称 */
	private static final String OPERATETIME_COLUMN_NAME = "operatetime";
	/** systemlog每个月的表创建索引的orginternalcode名称 */
	private static final String ORGINTERNALCODE_COLUMN_NAME = "orgcode";
	/** systemlog每个月的表创建索引的username名称 */
	private static final String USERNAME_COLUMN_NAME = "username";

	/** 研判分析（登陆情况），每个月的表创建索引的orgId字段 */
	public static final String ORGID_LOGINMANAGE = "orgId";

	/** 研判分析（登陆情况），每个月的表创建索引的orgId名称 */
	public static final String ORGID_LOGINMANAGE_NAME = "orgId";

	public static final Map<String, String> SYSTEMLOG_INDEX_MAP = new HashMap<String, String>();
	/** 研判分析索引的map */
	public static final Map<String, String> STATANALYSE_INDEX_MAP = new HashMap<String, String>();
	static {
		SYSTEMLOG_INDEX_MAP.put(LOGLEVEL_COLUMN, LOGLEVEL_COLUMN_NAME);
		SYSTEMLOG_INDEX_MAP.put(MODULENAME_COLUMN, MODULENAME_COLUMN_NAME);
		SYSTEMLOG_INDEX_MAP.put(OPERATETIME_COLUMN, OPERATETIME_COLUMN_NAME);
		SYSTEMLOG_INDEX_MAP.put(ORGINTERNALCODE_COLUMN,
				ORGINTERNALCODE_COLUMN_NAME);
		SYSTEMLOG_INDEX_MAP.put(USERNAME_COLUMN, USERNAME_COLUMN_NAME);

		STATANALYSE_INDEX_MAP.put(ORGID_LOGINMANAGE, ORGID_LOGINMANAGE_NAME);

		groupMap.put(BaseInfoTables.POSITIVEINFO_DISPLAYNAME, helps); // 刑释解教
		groupMap.put(BaseInfoTables.RECTIFICATIVEPERSON_DISPLAYNAME, wards); // 社区矫正
		groupMap.put(BaseInfoTables.IDLEYOUTH_DISPLAYNAME, helps); // 重点青少年
		groupMap.put(BaseInfoTables.MENTALPATIENT_DISPLAYNAME, helps); // 精神病人
		groupMap.put(BaseInfoTables.DRUGGY_DISPLAYNAME, helps); // 吸毒人员
		groupMap.put(BaseInfoTables.SUPERIORVISIT_DISPLAYNAME, comprehensives); // 重点上访人员
		groupMap.put(BaseInfoTables.DANGEROUSGOODSPRACTITIONER_DISPLAYNAME,
				comprehensives); // 危险品从业人员
		groupMap.put(BaseInfoTables.AIDSPOPULATIONS_DISPLAYNAME, comprehensives); // 艾滋病人员
		groupMap.put(BaseInfoTables.AIDNEEDPOPULATION_DISPLAYNAME,
				comprehensives); // 需救助人员
		groupMap.put(BaseInfoTables.OPTIMALOBJECT_DISPLAYNAME, comprehensives); // 优抚对象
		groupMap.put(BaseInfoTables.ELDERLYPEOPLE_DISPLAYNAME, comprehensives); // 老年人
		groupMap.put(BaseInfoTables.HANDICAPPED_DISPLAYNAME, comprehensives); // 残疾人员
		groupMap.put(BaseInfoTables.UNEMPLOYED_DISPLAYNAME, comprehensives); // 失业人员
		// groupMap.put(BaseInfoTables.NURTURESWOMEN_DISPLAYNAME,
		// comprehensives); // 育妇
		groupMap.put("育龄妇女", comprehensives);
		groupMap.put(BaseInfoTables.SAFETYPRODUCTIONKEY_DISPLAYNAME, leads); // 安全生产重点
		groupMap.put(BaseInfoTables.FIRESAFETYKEY_DISPLAYNAME, leads); // 消防安全重点
		groupMap.put(BaseInfoTables.SECURITYKEY_DISPLAYNAME, leads); // 治安重点
		groupMap.put(BaseInfoTables.SCHOOL_DISPLAYNAME, leads); // 学校
		groupMap.put(BaseInfoTables.DANGEROUSCHEMICALSUNIT_DISPLAYNAME, leads); // 危险化学品单位
		groupMap.put(BaseInfoTables.INTERNETBAR_DISPLAYNAME, leads); // 网吧
		groupMap.put(BaseInfoTables.PUBLICPLACE_DISPLAYNAME, leads); // 公共场所
		groupMap.put(BaseInfoTables.PUBLICCOMPLEXPLACES_DISPLAYNAME, leads); // 公共复杂场所
		groupMap.put(BaseInfoTables.OTHERLOCALE_DISPLAYNAME, leads); // 其他场所

		groupMap.put(BaseInfoTables.ACTUALCOMPANY_DISPLAYNAME, leads); // 实有单位

		groupMap.put(BaseInfoTables.ENTERPRISEKEY_DISPLAYNAME, leads);// 规上企业
		groupMap.put(BaseInfoTables.ENTERPRISEDOWNKEY_DISPLAYNAME, leads);// 规下企业
		groupMap.put(BaseInfoTables.NEWSOCIETYORGANIZATIONS_DISPLAYNAME,
				comprehensives); // 新社会组织
		// groupMap.put(BaseInfoTables.NEWECONOMICORGANIZATIONS_DISPLAYNAME,
		// comprehensives); // 非公有制经济组织
		groupMap.put("新经济组织", comprehensives);

		// groupMap.put(BaseInfoTables.ACTUALHOUSE_DISPLAYNAME, comprehensives);
		// // 出租房
		groupMap.put(BaseInfoTables.RENTALHOUSE_DISPLAYNAME, comprehensives); // 出租房

	}

	public static Map<String, StatisticsBaseInfoAddCountVo> listToMap(
			List<StatisticsBaseInfoAddCountVo> list) {
		if (list != null) {
			StatisticsBaseInfoAddCountVo vo = null;
			Map<String, StatisticsBaseInfoAddCountVo> map = new HashMap<String, StatisticsBaseInfoAddCountVo>(
					list.size());
			for (int i = 0; i < list.size(); i++) {
				vo = list.get(i);
				map.put(vo.getStatisticsType(), vo);
			}
			return map;
		}

		return null;
	}

	// 领导视图job可以公用同一个root,不能直接使用需要用clone方法，该对象四小时更新一次
	private static StatisticsNode root;

	private static final int level = 4;

	private final static Lock lock = new ReentrantLock();

	public final static Logger logger = LoggerFactory
			.getLogger(AnalyseUtil.class);

	public static StatisticsNode getRootNode(CacheService cacheService,
			OrganizationService organizationoService,
			Organization organization, boolean isRoot) {
		if (organization == null)
			throw new BusinessValidationException("请输入正确的组织机构");
		long start = System.currentTimeMillis();
		try {
			StatisticsNode root;
			if (isRoot) {
				lock.lock();
			}
			if (isRoot
					&& cacheService.get(MemCacheConstant.ANALYSIS_NAMESPACE,
							MemCacheConstant.ROOTKEY) != null
					&& AnalyseUtil.root != null) {
				root = AnalyseUtil.root.clone();
			} else {
				logger.info("开始初始化[" + organization.getOrgName() + "]组织机构树");
				root = new StatisticsNode();
				root.setRoot(true);
				root.setOrganization(organization);
				root.setChildren(organization, root, organizationoService);
				if (isRoot) {
					AnalyseUtil.root = root.clone();
					cacheService.set(MemCacheConstant.ANALYSIS_NAMESPACE,
							MemCacheConstant.ROOTKEY, true);// 组织树4小时更新一次
				}
				logger.info("初始化[" + organization.getOrgName() + "]树耗时"
						+ (System.currentTimeMillis() - start) / 1000 + "s");
			}
			return root;
		} finally {
			if (isRoot) {
				lock.unlock();
			}
		}
	}

	/**
	 * @param baseInfoAddCountVoList
	 * @param root
	 */
	public static void initNode(
			List<StatisticsBaseInfoAddCountVo> baseInfoAddCountVoList,
			StatisticsNode root) {
		for (StatisticsBaseInfoAddCountVo gridCountVo : baseInfoAddCountVoList) {
			try {
				StatisticsNode node = root.findNodeByOrgId(Long
						.valueOf(gridCountVo.getStatisticsType()));
				if (node != null) {
					gridCountVo.setStatisticsType(node.getOrganization()
							.getOrgName());
					gridCountVo.setSeq(node.getOrganization().getSeq());
					StatisticsBaseInfoAddCountVo old = node
							.getStatisticsCountVo();
					if (old == null) {
						node.setStatisticsCountVo(gridCountVo);
					} else {
						old.setAllCount(old.getAllCount()
								+ gridCountVo.getAllCount());
						old.setAttentionCount(old.getAttentionCount()
								+ gridCountVo.getAttentionCount());
						old.setInvolveSinkiangCount(old
								.getInvolveSinkiangCount()
								+ gridCountVo.getInvolveSinkiangCount());
						old.setInvolveTibetCount(old.getInvolveTibetCount()
								+ gridCountVo.getInvolveTibetCount());
						old.setThisMonthCount(old.getThisMonthCount()
								+ gridCountVo.getThisMonthCount());
						old.setTodayAddCount(old.getTodayAddCount()
								+ gridCountVo.getTodayAddCount());
					}
				} else {
					logger.info("node is null, orgId:"
							+ gridCountVo.getStatisticsType());
				}
			} catch (Exception e) {
				logger.error("orgId:" + gridCountVo.getStatisticsType(), e);
			}

		}
	}
}
