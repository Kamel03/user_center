package com.tianque.core.util;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.exception.base.SystemUtilException;

public class GridProperties {
	private static Logger logger = LoggerFactory
			.getLogger(GridProperties.class);
	private static Properties properties = new Properties();

	private static Properties getGridProperties() {
		if (properties.size() == 0) {
			synchronized (properties) {
				properties = new Properties();
				try {
					properties.load(GridProperties.class.getClassLoader()
							.getResourceAsStream("grid.properties"));
				} catch (IOException e) {
					throw new SystemUtilException("加载grid.properties出错！", e);
				}
			}
		}
		return properties;
	}

	public static String getKey(String key) {
		return getGridProperties().getProperty(key);
	}

	public static final Boolean IS_CONNECT_VPDN = Boolean
			.valueOf(getKey("isConnectVpdn"));
	public static final Boolean IS_VALIDATE_MOBILE = Boolean
			.valueOf(getKey("isValidateMobile"));

	public static final int ORG_TREE_AUTOCOMPLETE_SEARCH_NUM = Integer
			.valueOf((String) getGridProperties().get(
					"orgTreeAutoCompleteSearchNum"));

	private static String fileSeparator = File.separator;

	public static final String CURRENT_VERSION = getGridProperties()
			.getProperty("currentVersion");

	// start 上传文件路径

	public static final String UPLOAD_FILE_FOLDER = "uploadFile"
			+ fileSeparator + "upload";

	public static final String ORGANIZATION_EXCEL_FOLDER = "uploadFile"
			+ fileSeparator + "upload";
	// 存放错误信息文件的路径
	public static final String UPLOAD_FILE_ERRORMESSAGE = "uploadFile"
			+ fileSeparator + "upload" + fileSeparator + "errorMessageExcel";

	public static final String TMP = "uploadFile" + fileSeparator + "tmp";

	public static final String ISSUE_ATTACHFILE = "uploadFile" + fileSeparator
			+ "issue";
	/** 对接事件附件存放目录 */
	public static final String ISSUE_JOINT_TEMP_ATTACHFILE = "uploadFile"
			+ fileSeparator + "dataChangeFile";

	public static final String DAILY_DIRECTORY = "uploadFile" + fileSeparator
			+ "dailylog";

	public static final String ITEM_ATTACHFILE = "uploadFile" + fileSeparator
			+ "issue";

	public static final String DOCUMENTS_ATTACHFILE = "uploadFile"
			+ fileSeparator + "documents";

	public static final String WORK_BULLETIN = "uploadFile" + fileSeparator
			+ "issue";

	public static final String DAILYLOG_PATH = "uploadFile" + fileSeparator
			+ "dailylog";

	public static final String WORKINGRECORD_PATH = "uploadFile"
			+ fileSeparator + "upload";

	public static final String MAIL_ATTACHFILE_PATH = "uploadFile"
			+ fileSeparator + "mail";

	public static final String DOWNLOAD_TEMP_FILE_FOLDER = "uploadFile"
			+ fileSeparator + "tmp";
	public static final String RESOURCEPOOL_PATH = "uploadFile" + fileSeparator
			+ "upload";
	// 服务记录附件的上传路径
	public static final String SERVICERECORD_PATH = "uploadFile"
			+ fileSeparator + "upload";

	// 通知通报附件的上传路径
	public static final String PUBLICNOTICE_ATTACHFILE = "uploadFile"
			+ fileSeparator + "upload";

	// 民情日志附件的上传路径
	public static final String PEOPLELOG_ATTACHFILE = "uploadFile"
			+ fileSeparator + "upload";

	// 党建组织附件的上传路径
	public static final String ACTIVITYRECORDS_ATTACHFILE = "uploadFile"
			+ fileSeparator + "upload" + fileSeparator + "activityRecords";

	// 二维码的存放路径
	public static final String QRCODE_PATH = "uploadFile" + fileSeparator
			+ "tmp";

	// 单位场所附件的上传路径
	public static final String COMPANY_PALCE_PATH = "uploadFile"
			+ fileSeparator + "upload";

	// end 上传文件路径

	public static final String BBS_BASEURL = getGridProperties().getProperty(
			"bbs.baseurl");

	public static final String IS_ASYNC_BBS_USER = getGridProperties()
			.getProperty(GlobalValue.environment + ".isAsyncBbsUser");

	public static final String RESOURCE_PATH = getGridProperties().getProperty(
			"production.resourcePath");

	public static final String CMS_PATH = getGridProperties().getProperty(
			"cms.path");

	public static final String CMS_OFF = getGridProperties().getProperty(
			"cms.off");
	public static final String DUBBO_WHITE_LIST = getGridProperties()
			.getProperty("dubbo.whiteList");

	public static final long SESSION_TIME_OUT = Long
			.valueOf(getGridProperties().getProperty("sessionTimeOut"));

	public static final long PASSWORD_DAY_OUT = Long
			.valueOf(getGridProperties().getProperty("passwordDayOut"));

	public static final String CURRENT_PROJECT = getGridProperties()
			.getProperty("currentProject");

	public static final String SYS_BEGIN_USE_YEAR = getGridProperties()
			.getProperty("sysBeginUseYear");

	public static final long MAX_MAIL_ATTACH_FILE_SIZE = 2 * 1024 * 1024;
	public static final long MAX_MAIL_SIZE = 15 * 1024 * 1024;
	public static final long SINGLE_MAIL_CONTENT_LENGTH = 200;

	public static final String TIANQUE_GRID_JS_VERSION = getGridProperties()
			.getProperty("tianqueGridJsVersion");

	public static final String TEMPORARYRESIDENT_UPLOAD = getGridProperties()
			.getProperty(GlobalValue.environment + ".temporaryResidentFolder");

	public static final String IS_NEED_UNCONCEPTEDSTATE = getGridProperties()
			.getProperty("isNeedUnConceptedState");

	public static final String OPENFIRESERVER = getGridProperties()
			.getProperty("openfireServer");

	public static final String OPENFIREHOST = OPENFIRESERVER.substring(0,
			OPENFIRESERVER.indexOf(":") != -1 ? OPENFIRESERVER.indexOf(":")
					: OPENFIRESERVER.length());

	public static final String OPENFIREPORT = OPENFIRESERVER.indexOf(":") != -1 ? OPENFIRESERVER
			.substring(OPENFIRESERVER.indexOf(":") + 1) : "9201";

	public static final String WEB_APP_URL = getGridProperties().getProperty(
			"webAppUrl");

	static {
		logger.info("ORG_TREE_AUTOCOMPLETE_SEARCH_NUM:"
				+ ORG_TREE_AUTOCOMPLETE_SEARCH_NUM);
		logger.info("SYS_BEGIN_USE_YEAR:" + SYS_BEGIN_USE_YEAR);
		logger.info("UPLOAD_FILE_FOLDER:" + UPLOAD_FILE_FOLDER);
		logger.info("SESSION_TIME_OUT:" + SESSION_TIME_OUT);
	}

	public static final String GIS_INDEX_MAP = getGridProperties().getProperty(
			"gis.indexmap");

	public static final String GIS_BOUND_BUILD_DATA = getGridProperties()
			.getProperty("gis.boundBuildData");

	public static final String GIS_SERVER = getGridProperties().getProperty(
			"gis.server");

	/** 历史平台消息模版名称 */
	public static final String HISTORY_MESSAGE_TEMPLATE = getGridProperties()
			.getProperty("historyMessageTemplate");
	/** 社区矫正人员到期提醒消息模版名称 */
	public static final String RECTIFICATIVE_PERSON_MESSAGE_TEMPLATE = getGridProperties()
			.getProperty("rectificativePersonMessageTemplate");
	/** 刑释解教人员到期提醒消息模版名称 */
	public static final String POSITIVEINFO_MESSAGE_TEMPLATE = getGridProperties()
			.getProperty("positiveInfoMessageTemplate");
	/** 重点青少年到期提醒消息模版名称 */
	public static final String IDLEYOUTHM_ESSAGE_TEMPLATE = getGridProperties()
			.getProperty("idleYouthMessageTemplate");
	/** 实口标记为老年人提醒消息模版名称 */
	public static final String ELDERLY_PEOPLE_MESSAGE_TEMPLATE = getGridProperties()
			.getProperty("elderlyPeopleMessageTemplate");
	/** 实口标记为育龄妇女提醒消息模版名称 */
	public static final String NURTURES_WOMEN_MESSAGE_TEMPLATE = getGridProperties()
			.getProperty("elderlyPeopleMessageTemplate");
	/** 流动人口到期后提示消息模板名称 */
	public static final String FLOATINGPOPULATION_PEOPLE_MESSAGE_TEMPLATE = getGridProperties()
			.getProperty("floatingPopulationMessageTemplate");

	/** 播放视频地址 */
	public static final String VIDEOURL = getGridProperties().getProperty(
			"videoUrl");
	public static final String AREADATA_JS_PATH = getGridProperties()
			.getProperty("area.js.path");

	public static final Boolean IS_GIS_LOCAL = Boolean
			.valueOf(getKey("isGisLocal"));

	/** 人口job执行参数每次执行数，最大次数 */
	public static final int POPULATIONJOB_PAGESIZE = Integer
			.valueOf((String) getGridProperties().get("populationJobPageSize"));
	/** 人口job是否在工作时间停止运行 */
	public static final Boolean WORKTIMEBREAK = Boolean
			.valueOf(getKey("workTimeBreak"));
	/** 数据管理job执行参数每次执行数，最大次数 */
	public static final int DATAMANAGEDBJOB_PAGESIZE = Integer
			.valueOf((String) getGridProperties()
					.get("dataManageDBJobPageSize"));
	public static final int DATAMANAGEDBJOB_MAXPAGE = Integer
			.valueOf((String) getGridProperties().get("dataManageDBJobMaxPage"));

	public static final Boolean HBASE_LOCAL = Boolean
			.valueOf(getKey("isHbaseLocal"));

	public static final String HBASE_PATH = getGridProperties().getProperty(
			"hbasePath");
	public static final String HBASE_PROT = getGridProperties().getProperty(
			"hbasePort");

	public static final Boolean ISTQSEARCH = Boolean
			.valueOf(getKey("isTqSearch"));

	public static final Boolean IS_JOBSERVER = Boolean
			.valueOf(getKey("isJobServer"));

	public static final Boolean IS_OPEN_UBA = Boolean
			.valueOf(getGridProperties().getProperty("isOpenUba"));
	public static final Boolean REDIS_OPEN = Boolean
			.valueOf(getGridProperties().getProperty("redis.isOpen"));
	public static final int REDIS_DEFAULT_PAGE_SIZE = Integer
			.valueOf(getGridProperties().getProperty("redis.default.pageSize"));

	public static final String HBASE_MQ_URL = getGridProperties().getProperty(
			"hbaseMqUrl");
	public static final String HBASE_MQ_QUEUE_NAME = getGridProperties()
			.getProperty("hbaseMqQueueName");
	public static final String POPULATION_MQ_URL = getGridProperties()
			.getProperty("populationMqUrl");
	public static final String POPULATION_MQ_QUEUE_NAME = getGridProperties()
			.getProperty("populationMqQueueName");

	// 呼叫中心和社管事件对接相关代码
	public static final String CMS_CALLCENTER_LOCATION = getGridProperties()
			.getProperty("cms.location.href");
	public static final boolean CMS_CALLCENTER_IS_OPEN = "true"
			.equals(getGridProperties().getProperty("cms.isopen"));
	public static final String CMS_CALLCENTER_ISSUE_COMPLETE = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("cmsIssueComplete");
	public static final String CMS_CALLCENTER_ISSUE_CONCEPT = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("cmsIssueConcept");
	public static final String CMS_CALLCENTER_ISSUE_TRANSACTION_LOG = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("cmsTransactionLog");
	public static final String CMS_CALLCENTER_ISSUE_PONE_APPLY = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("cmsPostponeApply");
	public static final String CMS_CALLCENTER_ISSUE_FIND_CMS_LOCATION = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("findCmsLocation");
	public static final String CMS_CALLCENTER_ISSUE_FIND_CMS_SEAT = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("findCmsSeat");
	public static final String CMS_CALLCENTER_ISSUE_DEMAND = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("addDemandByIssue");
	public static final String CMS_CALLCENTER_ISSUE_FIND_CMS_DEMAND = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("findCmsDemandBySerialNumber");
	public static final String CMS_CALLCENTER_ISSUE_BACK = CMS_CALLCENTER_LOCATION
			+ getGridProperties().getProperty("cmsIssueBack");

	// 是否启用mongoDB
	public static final boolean ISMONGODBENABLED = "true"
			.equals(getGridProperties().getProperty("isMongoDbEnabled"));
	// 是否启用Schedule
	public static final boolean ISSCHEDULE = "true".equals(getGridProperties()
			.getProperty("isSchedule"));

}
