package com.tianque.core.util;


public class AnalyseUtilNew {
	/** 查询用户某表某字段是否创建时，该字段表示用户名称 */
	public static final String OWNER_NAME = "SICHUAN_TRUCK";
	/** 用户覆盖率统计的Key抬头 */
	public static final String USERACTIVATEREPORTKEY = "userActivateReport";

	public static final String STATCOUNTBYORGIDKEY = "statCountByOrgId";
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
	public static final String LOCK_KEY = "LockKey";
	// 新的单位场所的表表名
	public static final String COMPANY_PLACE_TABLE_NAME = "companyPlaceStatType";
	// 组织机构-党委部门 表名
	public static final String DEPARTMENTPARTYNAME = "departmentParty";
	// 组织机构表名
	public static final String PRIMARYORGANIZATIONSENAME = "primaryOrganizations";
	// 系统操作日志-表名
	public static final String SYSTEMLOGS_TABLE_NAME = "systemlogs";
	// 登录头攻击-表名
	public static final String LOGINMANGE_TABLE_NAME = "loginManage";
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
			+ "dispose               number(1)            ,"
			+ "statisticsData	clob,"
			+ "createUser		varchar2(32)			not null,"
			+ "createDate		date					not null,"
			+ "statisticsType    number(1)               not null)";

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
	/** 三本台账报表 */
	public static final String ACCOUNT_REPORT_TABLE_NAME = "accountReport";
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
			+ "createUser           VARCHAR2(60) 					not null,"
			+ "updateUser           VARCHAR2(60),"
			+ "createDate           DATE         					not null,"
			+ "updateDate           DATE,"
			+ "constraint pk%s primary key (ID))";

	// 单位场所sql
	public static final String COMPANY_PLACE_TABLE_NAME_SQL = "create table %s "
			+ "(id                  NUMBER(10)                      not null,"
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
			+ "monthcreate			NUMBER(10)						not null,"
			+ "constraint pk%s primary key  (id))";
	// 组织机构表SQL
	public static final String PRIMARYORGANIZATIONSSQL = "create table %s  "
			+ "(id                   NUMBER(10)                      not null,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "total                NUMBER(10)                      not null,"
			+ "typeName             VARCHAR2(60)                    ,"
			+ "primaryOrgType       VARCHAR2(32)                    not null,"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "orgId                NUMBER(10),"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "createUser           varchar2(60)                    ,"
			+ "sum                  NUMBER(10)                      ,"
			+ "percentage           varchar2(60)                    ,"
			+ "objectSum			 NUMBER(10)                      ,"
			+ "monthcreate			 NUMBER(10)                      ,"
			+ "memberNum              NUMBER(10)                      ,"
			+ "constraint pk%s primary key  (id) )";
	// 实有人员表sql
	public static final String ACTUALPERSONSQL = "create table %s  "
			+ "(id                   NUMBER(10)                      not null,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "total                NUMBER(10)                      not null,"
			+ "typeName             VARCHAR2(60)                    ,"
			+ "populationType       VARCHAR2(32)                    not null,"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "orgId                NUMBER(10),"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "createUser           varchar2(60)                    ,"
			+ "sum                  NUMBER(10)                      ,"
			+ "percentage           varchar2(60)                    ,"
			+ "objectSum			 NUMBER(10)                      ,"
			+ "monthcreate			 NUMBER(10)                      ,"
			+ "involveTibetCount     NUMBER(10)                      ,"
			+ "involveSinkiangCount  NUMBER(10),"
			+ "constraint pk%s primary key  (id) )";

	// 实有人员类别分布数据表sql
	public static final String ACTUALPERSONCATEGORYSQL = "create table %s  "
			+ "(id                  NUMBER(10)                      not null,"
			+ "year                 NUMBER(10)                      not null,"
			+ "month                NUMBER(10)                      not null,"
			+ "typeName             NUMBER(10)                        ,"
			+ "populationType       VARCHAR2(32)                    not null,"
			+ "orgInternalCode      VARCHAR2(32)                    not null,"
			+ "orgId                NUMBER(10),"
			+ "startDate            DATE                            ,"
			+ "endDate              DATE                            ,"
			+ "createDate           DATE                            ,"
			+ "createUser           varchar2(60)                    ,"
			+ "monthcreate			 NUMBER(10),"
			+ "constraint pk%s primary key  (id) )";

	// 重点人员的sql
	public static final String IMPORTPERSONSQL = "create table %s ( "
			+ " id                   NUMBER(10)                      not null,"
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
			+ " TOTAL           NUMBER(10),"
			+ "constraint pk%s primary key  (id)  )";

	// 创建重点场所表的sql
	public static final String IMPORTPLACESQL = "create table %s ( "
			+ "id                   NUMBER(10)                      not null,"
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
			+ "monthcreate			 NUMBER(10),"
			+ "constraint pk%s primary key  (id))";
	 
}
