package com.tianque.core.util;

/**
 * 常量接口
 * 
 * @author Administrator
 */
public interface ConstantsProduct {
	/**
	 * 全部、有、无
	 * 
	 * @author Administrator
	 */
	class HasOrHavntOrAll {
		// 有
		public final static Long HAS = 0L;
		public final static String HASSTRING = "有";
		// 无
		public final static Long HAVNT = 1L;
		public final static String HAVNTSTRING = "无";
		// 全部
		public final static Long ALL = -1L;
		public final static String ALLSTRING = "全部";
	}

	class SourcesState {
		/** 新增 */
		public final static Long ADDED = 0l;
		/** 导入 */
		public final static Long IMPORT = 1l;
		/** 同步 */
		public final static Long SYNCHRO = 2l;
		/** 认领 */
		public final static Long CLAIM = 3l;
		/** 核实 */
		public final static Long VERIFY = 4l;
		/** 落户 */
		public final static Long SETTLED = 5l;
		/** job录入 */
		public final static Long JOB = 6l;
		/** 转移 */
		public final static Long TRANSFER = 7l;

	}

	/**
	 * 线程池中的常量
	 * 
	 * @author T26
	 */
	class ThreadVariableConstants {
		/** 导入时间 */
		public final static String IMPORT_DATE = "IMPROT_DATE";
		/** 导入功能预留标示符 */
		public final static String MODULE = "MODULE";
	}
}
