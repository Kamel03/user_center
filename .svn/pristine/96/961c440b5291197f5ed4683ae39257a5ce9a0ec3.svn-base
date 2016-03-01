/**
 * tianque-com.tianque.common.util-GlobalValue.java Created on Apr 7, 2009
 * Copyright (c) 2010 by 杭州天阙科技有限公司
 */
package com.tianque.core.util;

import java.util.ArrayList;
import java.util.List;

import com.tianque.exception.base.SystemUtilException;

/**
 * Title: ***<br>
 * 
 * @author <a href=mailto:nifeng@hztianque.com>倪峰</a><br>
 * @description ***<br/>
 * @version 1.0
 */
public class GlobalValue {

	/** js压缩的版本，预防浏览器缓存 必须和package.json里面的jsVersionNo对应 */
	public static String JS_NODE_VERSION = "011";
	public static String environment;

	public static boolean isInitApp = false;

	public static final String JOB_COOKIE = "JOB_COOKIE";

	public final static String LOGIN_SESSION_ID = "sid";
	public final static String OLD_LOGIN_SESSION_ID = "oldSid";
	public final static String CURRENT_ORG_ID = "currentOrgId";
	public final static String LOGIN_USER_ID = "userId";
	public final static String LOGIN_ORGANIZATION = "loginOrganization";
	public final static String PERMISSION_TYPE_MENU = "1";
	public final static String PERMISSION_TYPE_BUTTON = "2";
	public final static String PERMISSIONS = "permissions";
	public final static String NOT_HAVE_PERMISSION_RESULT = "notHavePermissionResult";
	public final static String LOGIN_FAILURE_MSG = "login_failure_msg";
	public final static String SHI_LAYER = "oracle_gis:GISSHIJIEREGION";
	public final static String XIAN_LAYER = "tianqueMap:GISXIANJIEREGIO";
	public final static String UPLOAD_ORG = "uploadOrg";
	public final static String CHECK_ORG_OR_NOT = "checkOrgOrNot";
	public final static String DATAFROM = "dataFrom";
	public final static String SQLS_TABLE_PATH = getProjectPath(GlobalValue.class)
			+ "/../../../" + "database/tables";
	public final static String SHARD_SQLS_TABLE_PATH = getProjectPath(GlobalValue.class)
			+ "/../../../" + "database/shardTables";
	public final static String SQLS_TABLE_PEOPLE_PATH = getProjectPath(GlobalValue.class)
			+ "/../../../" + "database/versionTrack/people";
	public final static String SQLS_TABLE_COMPANYPLACE_PATH = getProjectPath(GlobalValue.class)
			+ "/../../../" + "database/versionTrack/companyPlace";
	public final static String SQLS_TABLE_COMPANYPLACE_TWO_PATH = getProjectPath(GlobalValue.class)
			+ "/../../../" + "database/versionTrack/companyPlaceTwo";

	public static String getCreateSQLPath() {
		return getProjectPath(GlobalValue.class) + "/../../../"
				+ "database/tables/001_createTables.sql";
	}

	public static final String JOB_TABLES = getProjectPath(GlobalValue.class)
			+ "/../../../" + "database/tables/003_quarz.sql";

	public static String getVersionCleanTablesFileName(String version) {
		return getProjectPath(GlobalValue.class) + "/../../../"
				+ "database/tables/clean" + version + "Tables.sql";
	}

	public static String getVersionCreateTablesFileName(String version) {
		return getProjectPath(GlobalValue.class) + "/../../../"
				+ "database/tables/create" + version + "Tables.sql";
	}

	public final static List<String> DO_NOT_FIRST_LOGIN_VALIDATE_PATH = new ArrayList<String>();
	static {
		DO_NOT_FIRST_LOGIN_VALIDATE_PATH.add("login");
		DO_NOT_FIRST_LOGIN_VALIDATE_PATH.add("logout");
		DO_NOT_FIRST_LOGIN_VALIDATE_PATH.add("updatePasswordEmail");
		DO_NOT_FIRST_LOGIN_VALIDATE_PATH.add("toFirstPasswordUpdate");
		DO_NOT_FIRST_LOGIN_VALIDATE_PATH.add("updatePassword");
		DO_NOT_FIRST_LOGIN_VALIDATE_PATH.add("mockLogin");
	}

	public final static List<String> IS_NOT_LOGIN_VALIDATE_PATH = new ArrayList<String>();
	static {
		String isNotLoginValidatePaths = GridProperties
				.getKey("isNotValidatePath");
		String[] isNotLoginValidatePathArray = isNotLoginValidatePaths
				.split("\\;");
		for (String path : isNotLoginValidatePathArray) {
			IS_NOT_LOGIN_VALIDATE_PATH.add(path);
		}
	}

	/**
	 * getAppPath需要一个当前程序使用的Java类的class属性参数，它可以返回打包过的
	 * Java可执行文件（jar，war）所处的系统目录名或非打包Java程序所处的目录
	 * 
	 * @param cls为Class类型
	 * @return 返回值为该类所在的Java程序运行的目录
	 */
	public static String getProjectPath(Class cls) {
		// 检查用户传入的参数是否为空
		if (cls == null)
			throw new java.lang.IllegalArgumentException("参数不能为空！");
		ClassLoader loader = cls.getClassLoader();
		// 获得类的全名，包括包名
		String clsName = cls.getName() + ".class";
		// 获得传入参数所在的包
		Package pack = cls.getPackage();
		String path = "";
		// 如果不是匿名包，将包名转化为路径
		if (pack != null) {
			String packName = pack.getName();
			// 此处简单判定是否是Java基础类库，防止用户传入JDK内置的类库
			if (packName.startsWith("java.") || packName.startsWith("javax."))
				throw new java.lang.IllegalArgumentException("不要传送系统类！");
			// 在类的名称中，去掉包名的部分，获得类的文件名
			clsName = clsName.substring(packName.length() + 1);
			// 判定包名是否是简单包名，如果是，则直接将包名转换为路径，
			if (packName.indexOf(".") < 0)
				path = packName + "/";
			else {// 否则按照包名的组成部分，将包名转换为路径
				int start = 0, end = 0;
				end = packName.indexOf(".");
				while (end != -1) {
					path = path + packName.substring(start, end) + "/";
					start = end + 1;
					end = packName.indexOf(".", start);
				}
				path = path + packName.substring(start) + "/";
			}
		}
		// 调用ClassLoader的getResource方法，传入包含路径信息的类文件名
		java.net.URL url = loader.getResource(path + clsName);
		// 从URL对象中获取路径信息
		String realPath = url.getPath();
		// 去掉路径信息中的协议名"file:"
		int pos = realPath.indexOf("file:");
		if (pos > -1)
			realPath = realPath.substring(pos + 5);
		// 去掉路径信息最后包含类文件信息的部分，得到类所在的路径
		pos = realPath.indexOf(path + clsName);
		realPath = realPath.substring(0, pos - 1);
		// 如果类文件被打包到JAR等文件中时，去掉对应的JAR等打包文件名
		if (realPath.endsWith("!"))
			realPath = realPath.substring(0, realPath.lastIndexOf("/"));
		/*------------------------------------------------------------
		  ClassLoader的getResource方法使用了utf-8对路径信息进行了编码，当路径
		   中存在中文和空格时，他会对这些字符进行转换，这样，得到的往往不是我们想要
		   的真实路径，在此，调用了URLDecoder的decode方法进行解码，以便得到原始的
		   中文及空格路径
		 -------------------------------------------------------------*/
		try {
			realPath = java.net.URLDecoder.decode(realPath, "utf-8");
		} catch (Exception e) {
			throw new SystemUtilException("获取项目路径异常", e);
		}
		return realPath;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		GlobalValue.environment = environment;
	}

}
