package com.tianque.core;

public interface Constants {
	class ClaimState {
		/** 认领状态(已认领) */
		public final static Integer CLAIMED = 10;
		/** 认领状态(被认领) */
		public final static Integer BECLAIMED = 11;
		/** 认领状态(未认领) */
		public final static Integer UNCLAIM = 0;
		/** 认领状态(被未认领) */
		public final static Integer BEUNCLAIM = 1;
	}

	class DisposeState {
		/** 未处理 */
		public final static int UNDISPOSE = 0;
		/** 已处理 */
		public final static int DISPOSED = 1;
	}

	class ClaimAvailable {
		/** 是否可认领(不可认领) */
		public final static int CLAIMAVAILABLE_CANT = 0;
		/** 是否可认领(可认领) */
		public final static int CLAIMAVAILABLE_CAN = 1;
	}

	class ClaimHasRepeatActualPopu {
		/** 同网格存在于其他实口当中 */
		public final static Long EXISTEDFOROTHERPEOPLE = -1L;
		/** 在其他网格已被标记为死亡 */
		public final static Long DEATHFOROTHERORG = -2L;
	}

	public class ClaimErrorType {
		public final static int VALIDATE = 0;

		public final static int REPEAT = 1;
		public final static int NOTCLAIMHOUSE = 4;
		public final static int NOTCLAIMFORATOTHERPEOPLE = 5;
		public final static int LOGOUT_DATA = 6;
		public final static int LOGOUT_DATA_FORHOUSEHOLDSTAFF = 7;
		public final static int LOGOUT_DATA_FORFLOAT = 8;
		public final static int NOTCLAIMDEATHFORATOTHERORG = 9;

		/** 不能认领的 */
		public final static int REPEAT_CLAIM = 20;
		public final static int NOT_ADD_ACTUAL = 21;
		public final static int ACTUAL_NOT_EMPHASIS = 22;

		public static String getDisplayName(int value) {
			if (value == VALIDATE) {
				return "验证错误";
			} else if (value == REPEAT) {
				return "数据重复";
			} else if (value == NOTCLAIMHOUSE) {
				return "此网格下，该出租房已认领";
			} else if (value == NOTCLAIMFORATOTHERPEOPLE) {
				return "此网格下，该身份证号码已存在其它实口中！";
			} else if (value == LOGOUT_DATA) {
				return "此网格下，该数据被注销，请先去处理已经注销的数据！";
			} else if (value == LOGOUT_DATA_FORHOUSEHOLDSTAFF) {
				return "此网格下，该数据在户籍人口中被注销，请先去处理已经注销的数据！";
			} else if (value == LOGOUT_DATA_FORFLOAT) {
				return "此网格下，该数据在流动人口中被注销，请先去处理已经注销的数据！";
			} else if (value == NOTCLAIMDEATHFORATOTHERORG) {
				return "该实口在系统中已经被标记为死亡，不能认领！";
			} else if (value == REPEAT_CLAIM) {
				return "已经认领的数据不能重复认领！";
			} else if (value == NOT_ADD_ACTUAL) {
				return "实口不存在，不能认领,请先添加对应的实口！";
			} else if (value == ACTUAL_NOT_EMPHASIS) {
				return "对应的实口是注销的，不能认领！";
			} else {
				return "";
			}
		}
	}

	class ListMode {
		public static String CLAIM_LIST = "claimList";// 表示是认领的列表
		public static String IMPORT_LIST = "importList";// 表示是导入的列表
	}

	class isBusinessInfo {
		public static String BUSINESSINFO_IS = "1";// 表示有业务信息
		public static String BUSINESSINFO_NO = "0";// 表示没有业务信息
	}

	class permanentAddressLevel {
		public static String PERMANENTADRESSLEVEL_PROVINCE = "1";// 省
		public static String PERMANENTADRESSLEVEL_CITY = "2";// 市
		public static String PERMANENTADRESSLEVEL_DISTRICT = "3";// 县
	}

	class UserState {
		public final static String WITHACTIVATION_STRING = "withActivation";// 待激活
		public final static Long WITHACTIVATION_STATE = 1L;// 待激活
		public final static Long NORMAL_STATE = 2L;// 正常
		public final static Long DISABLE_STATE = 3L;// 停用

	}

	class AccountType {
		public final static Long ACCOUNTTYPE_ZERO = 0L;// 仅本层级
		public final static Long ACCOUNTTYPE_ONE = 1L;// 直属下辖
		public final static Long ACCOUNTTYPE_TWO = 2L;// 所有下辖
		public final static Long ACCOUNTTYPE_THREE = 3L;// 全部

	}
}
