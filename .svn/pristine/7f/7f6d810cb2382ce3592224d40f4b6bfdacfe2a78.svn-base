package com.tianque.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.tianque.exception.base.SystemUtilException;

/**
 * 取得标准格式日期和时间 public 函数列表 static String getAddDay(int ,int) static String
 * today() static String time()
 */

public class DateFormat {
	/** 缺省日期格式 */
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	/** 缺省时间格式 */
	public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";

	/** 缺省月格式 */
	public static final String DEFAULT_MONTH = "MONTH";

	/** 缺省年格式 */
	public static final String DEFAULT_YEAR = "YEAR";

	/** 缺省日格式 */
	public static final String DEFAULT_DATE = "DAY";

	/** 缺省长日期格式 */
	public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH-mm";

	/** 缺省长日期格式,精确到秒 */
	public static final String DEFAULT_DATETIME_FORMAT_SEC = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 取当前日期
	 * 
	 * @return 当前日期的字符串 ,如2002-12-12
	 **/
	public static String today() {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				DEFAULT_DATE_FORMAT);
		java.util.Date currentTime_1 = SystemUtil.getCurDate();
		String dateString = formatter.format(currentTime_1);
		return dateString;
	}

	public static String today(String strFormat) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				strFormat);
		java.util.Date currentTime_1 = SystemUtil.getCurDate();
		String dateString = formatter.format(currentTime_1);
		return dateString;
	}

	/**
	 * 取当前时间,
	 * 
	 * @return 当前时间,如:21:10:12
	 **/
	public static String time() {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				DEFAULT_TIME_FORMAT);
		java.util.Date currentTime_1 = SystemUtil.getCurDate();
		String dateString = formatter.format(currentTime_1);
		return dateString;
	}

	/**
	 * 取当前时间,规定格式 'HH:mm:ss'
	 * 
	 * @return 当前时间,如:21:10:12
	 **/

	public static String time(String strFormat) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				strFormat);
		java.util.Date currentTime_1 = SystemUtil.getCurDate();
		String dateString = formatter.format(currentTime_1);
		return dateString;
	}

	/**
	 * 取得相对于当前时间增加天数/月数/年数后的日期 <br>
	 * 欲取得当前日期5天前的日期,可做如下调用:<br>
	 * getAddDay("DATE", -5).
	 * 
	 * @param format
	 *            格式化日期
	 * @param amount
	 *            ,增加的数量(减少用负数表示),如5,-1
	 * @return 格式化后的字符串 如"2000-02-01"
	 **/

	public static Date getAddDate(String format, int amount) {
		// 当前日期和前一天

		Calendar rightNow = Calendar.getInstance();
		Date dt = SystemUtil.getCurDate();
		rightNow.setTime(dt);
		rightNow.add(Calendar.DATE, amount);
		SimpleDateFormat formater = new SimpleDateFormat();
		formater.applyPattern(format);
		formater.setLenient(false);
		try {
			dt = formater.parse(formater.format(rightNow.getTime()));
		} catch (ParseException e) {
			throw new SystemUtilException("获取当前时间出错", e);
		}
		return dt;
	}

	/**
	 * 取得相对于当前时间增加天数/月数/年数后的日期 <br>
	 * 欲取得当前日期5天前的日期,可做如下调用:<br>
	 * getAddDay("DATE", -5).
	 * 
	 * @param field
	 *            ,段,如"year","month","date",对大小写不敏感
	 * @param amount
	 *            ,增加的数量(减少用负数表示),如5,-1
	 * @return 格式化后的字符串 如"2000-02-01"
	 **/

	public static String getAddDay(String field, int amount) {
		// 当前日期和前一天

		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				DEFAULT_DATETIME_FORMAT_SEC);

		Calendar rightNow = Calendar.getInstance();
		Date dt = SystemUtil.getCurDate();
		rightNow.setTime(dt);

		int intField = 0;
		String tmpField = field.toUpperCase();

		intField = Calendar.DATE;
		if (tmpField.equals(DEFAULT_YEAR))
			intField = Calendar.YEAR;
		if (tmpField.equals(DEFAULT_MONTH))
			intField = Calendar.MONTH;
		if (tmpField.equals(DEFAULT_DATE))
			intField = Calendar.DATE;

		rightNow.add(intField, amount);
		String day = formatter.format(rightNow.getTime());
		return day;
	}

	/**
	 * 取得相对于当前时间增加天数/月数/年数后的日期,按指定格式输出 欲取得当前日期5天前的日期,可做如下调用:<br>
	 * getAddDay("DATE", -5,'yyyy-mm-dd HH:mm').
	 * 
	 * @param field
	 *            ,段,如"year","month","date",对大小写不敏感
	 * @param amount
	 *            ,增加的数量(减少用负数表示),如5,-1
	 * @param strFormat
	 *            ,输出格式,如"yyyy-mm-dd","yyyy-mm-dd HH:mm"
	 * @return 格式化后的字符串 如"2000-02-01 HH:mm:ss"
	 **/
	public static String getAddDay(String field, int amount, String strFormat) {
		// 当前日期和前一天

		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				strFormat);

		Calendar rightNow = Calendar.getInstance();
		Date dt = SystemUtil.getCurDate();
		rightNow.setTime(dt);

		int intField = 0;
		String tmpField = field.toUpperCase();

		intField = Calendar.DATE;
		if (tmpField.equals(DEFAULT_YEAR))
			intField = Calendar.YEAR;
		if (tmpField.equals(DEFAULT_MONTH))
			intField = Calendar.MONTH;
		if (tmpField.equals(DEFAULT_DATE))
			intField = Calendar.DATE;

		rightNow.add(intField, amount);
		String day = formatter.format(rightNow.getTime());
		return day;
	}

	/**
	 * 获取办理期限，过滤节假日
	 * 
	 * @param days
	 *            提交的天数
	 * @param flags
	 *            设定的节假日列表
	 * @return 实际的办理期限
	 */
	public static String getDistDay(int days, String[] flags) {
		int tempday = days;
		int count = 0;
		for (int i = 0; i < flags.length; i++) {
			if (flags[i].equals("1")) {
				count += 1;
			}
			if (count == days) {
				tempday = i;
				break;
			}
		}
		return getAddDay(DEFAULT_DATE, tempday, DEFAULT_DATE_FORMAT);
	}

	/**
	 * 功能：对于给定的时间增加天数/月数/年数后的日期,按指定格式输出
	 * 
	 * @param date
	 *            String 要改变的日期
	 * @param field
	 *            int 日期改变的字段，YEAR,MONTH,DAY
	 * @param amount
	 *            int 改变量
	 * @param strFormat
	 *            日期返回格式
	 * @return
	 * @throws ParseException
	 * @author
	 */
	public static String getAddDay(String date, String field, int amount,
			String strFormat) throws ParseException {
		// 当前日期和前一天

		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				strFormat);

		Calendar rightNow = Calendar.getInstance();
		Date tempdate = formatter.parse(date);
		rightNow.setTime(tempdate);

		int intField = 0;
		String tmpField = field.toUpperCase();

		intField = Calendar.DATE;
		if (tmpField.equals(DEFAULT_YEAR))
			intField = Calendar.YEAR;
		if (tmpField.equals(DEFAULT_MONTH))
			intField = Calendar.MONTH;
		if (tmpField.equals(DEFAULT_DATE))
			intField = Calendar.DATE;

		rightNow.add(intField, amount);
		String day = formatter.format(rightNow.getTime());
		return day;
	}

	/**
	 * 功能：对于给定的时间增加天数/月数/年数后的日期,按指定格式输出
	 * 
	 * @param date
	 *            String 要改变的日期
	 * @param field
	 *            int 日期改变的字段，YEAR,MONTH,DAY
	 * @param amount
	 *            int 改变量
	 * @param strFormat
	 *            日期返回格式
	 * @return
	 * @throws ParseException
	 */
	public static String getAddDay(Date date, String field, int amount,
			String strFormat) {
		// 当前日期和前一天

		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				strFormat);

		Calendar rightNow = Calendar.getInstance();
		Date tempdate = date;
		rightNow.setTime(tempdate);

		int intField = 0;
		String tmpField = field.toUpperCase();

		intField = Calendar.DATE;
		if (tmpField.equals(DEFAULT_YEAR))
			intField = Calendar.YEAR;
		if (tmpField.equals(DEFAULT_MONTH))
			intField = Calendar.MONTH;
		if (tmpField.equals(DEFAULT_DATE))
			intField = Calendar.DATE;

		rightNow.add(intField, amount);
		String day = formatter.format(rightNow.getTime());
		return day;
	}

	/**
	 * Timestamp按照指定格式转为字符串
	 * 
	 * @param ts
	 *            源对象
	 * @param sFormat
	 *            ps（如yyyy.mm.dd）
	 * @return 如：2003-01-01 或2003-01-01 13:21
	 */
	public static String toString(Timestamp ts, String sFormat) {
		if (ts == null) {
			return "";
		}
		java.util.Date d = new java.util.Date(ts.getTime());
		return toString(d, sFormat);
	}

	/**
	 * Timestamp按照缺省格式转为字符串
	 * 
	 * @param ts
	 *            源对象
	 * @return 如：2003-01-01
	 */
	public static String toString(Timestamp ts) {
		return toString(ts, DEFAULT_DATE_FORMAT);
	}

	/**
	 * Timestamp按照缺省格式转为字符串，可指定是否使用长格式
	 * 
	 * @param ts
	 *            欲转化之变量Timestamp
	 * @param fullFormat
	 *            是否使用长格式
	 * @return 如：2003-01-01 或2003-01-01 13:21
	 */
	public static String toString(Timestamp ts, boolean fullFormat) {
		String s = null;
		if (fullFormat) {
			s = DEFAULT_DATETIME_FORMAT_SEC;
		} else {
			s = DEFAULT_DATE_FORMAT;
		}

		return toString(ts, s);
	}

	/**
	 * 将sqldate型按照指定格式转为字符串
	 * 
	 * @param sqldate
	 *            源对象
	 * @param sFormat
	 *            ps
	 * @return 如：2003-01-01 或2003-01-01 00:00
	 */
	public static String toString(java.sql.Date sqldate, String sFormat) {
		if (sqldate == null) {
			return "";
		}
		java.util.Date d = new java.util.Date(sqldate.getTime());
		return toString(d, sFormat);
	}

	/**
	 * 将sqldate型按照缺省格式转为字符串
	 * 
	 * @param sqldate
	 *            源对象
	 * @return 如：2003-01-01
	 */
	public static String toString(java.sql.Date sqldate) {
		return toString(sqldate, DEFAULT_DATE_FORMAT);
	}

	/**
	 * 将java.util.date型按照指定格式转为字符串
	 * 
	 * @param d
	 *            源对象
	 * @param sFormat
	 *            ps
	 * @return 如：2003-01-01
	 */
	public static String toString(java.util.Date d, String sFormat) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				sFormat);
		String dateString = formatter.format(d);
		return dateString;
	}

	/**
	 * 将java.util.date型按照缺省格式转为字符串
	 * 
	 * @param d
	 *            源对象
	 * @return 如：2003-01-01
	 */
	public static String toString(java.util.Date d) {
		return toString(d, DEFAULT_DATE_FORMAT);
	}

	/**
	 * 强制类型转换 从串到日期
	 * 
	 * @param sDate
	 *            源字符串，采用yyyy-MM-dd格式
	 * @param sFormat
	 *            ps
	 * @return 得到的日期对象
	 * @throws ParseException
	 */
	public static java.util.Date parseDate(String sDate, String sFormat) {
		java.text.SimpleDateFormat formatter = null;

		java.util.Date utildate = null;
		try {
			formatter = new java.text.SimpleDateFormat(sFormat);
			utildate = formatter.parse(sDate);
		} catch (ParseException e) {
			utildate = new Date();
		}

		return utildate;
	}

	/**
	 * 强制类型转换 从串到时间戳
	 * 
	 * @param sDate
	 *            源串
	 * @param sFormat
	 *            遵循格式
	 * @return 取得的时间戳对象
	 * @throws ParseException
	 */
	public static Timestamp parseTimestamp(String sDate, String sFormat)
			throws ParseException {
		java.text.SimpleDateFormat formatter = null;

		java.util.Date utildate = null;
		formatter = new java.text.SimpleDateFormat(sFormat);
		utildate = formatter.parse(sDate);
		java.sql.Timestamp tsdate = new java.sql.Timestamp(utildate.getTime());
		return tsdate;
	}

	/**
	 * getCurDate 取当前日期
	 * 
	 * @return java.util.Date型日期
	 **/
	public static java.util.Date getCurDate() {
		return (new java.util.Date());
	}

	/**
	 * getCurTimestamp 取当前时间戳
	 * 
	 * @return java.sql.Timestamp
	 **/
	public static java.sql.Timestamp getCurTimestamp() {
		java.util.Date today = new java.util.Date();
		java.sql.Timestamp ts = new java.sql.Timestamp(today.getTime());
		return ts;
	}

	/**
	 * getCurTimestamp 取遵循格式的当前时间
	 * 
	 * @param sFormat
	 *            遵循格式
	 * @return java.sql.Timestamp
	 **/
	public static Date getCurDate(String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String strCurDate = toString(new Date(), format);
		Date date;
		try {
			date = formatter.parse(strCurDate);
		} catch (ParseException e) {
			throw new SystemUtilException("获取当前时间出错", e);
		}
		return date;
	}

	/**
	 * 根据年，月获得日期，用于研判分析 的饼图详情传来的年，月
	 * 
	 * @throws ParseException
	 */
	public static Date getDateByYearAndMonth(Long year, Long month) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = "" + year + "-" + "" + month + "-01";
		Date date;
		try {
			date = fmt.parse(dateString);
			return date;
		} catch (ParseException e) {
			throw new SystemUtilException("根据年，月获得日期出错", e);
		}
	}

	/**
	 * 根据当前时间，获取今天星期几
	 * 
	 * @return
	 */
	public static int getDayOfTheWeek() {
		Calendar rightNow = Calendar.getInstance();
		int day = rightNow.get(rightNow.DAY_OF_WEEK);// 获取时间
		return day - 1;// 获取今天是周几
	}

	/**
	 * 判断当前日期是星期几
	 * 
	 * @param pTime
	 *            修要判断的时间
	 * @return dayForWeek 判断结果
	 * @Exception 发生异常
	 */
	public static int dayForWeek(String pTime) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(format.parse(pTime));
		} catch (ParseException e) {
			throw new SystemUtilException("判断当前日期是星期几出错", e);
		}
		int dayForWeek = 0;
		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			dayForWeek = 7;
		} else {
			dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		}
		return dayForWeek;
	}

	/**
	 * 判断当前日期是星期几，返回字符串
	 * 
	 * @param time要判断的时间
	 * @return dayForWeek 判断结果
	 * @Exception 发生异常
	 */
	public static String dayForWeek(Date time) {
		String str[] = { "周一", "周二", "周三", "周四", "周五", "周六", "周日" };
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String pTime = format.format(time);
		try {
			c.setTime(format.parse(pTime));
		} catch (ParseException e) {
			throw new SystemUtilException("判断当前日期是星期几出错", e);
		}
		int dayForWeek = 0;
		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			dayForWeek = 7;
		} else {
			dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		}
		return str[dayForWeek - 1];
	}

	/**
	 * 获取当前所在周，周一的日期
	 * 
	 * @return
	 * @throws ParseException
	 */
	public static Date getCurrnetWeekBeginDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // 获取本周一的日期
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取当前所在周，周日的日期
	 * 
	 * @return
	 * @throws ParseException
	 */
	public static Date getCurrnetWeekEndDate() {
		Calendar cal = Calendar.getInstance();
		// 这种输出的是上个星期周日的日期，因为老外那边把周日当成第一天
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		// 增加一个星期，才是我们中国人理解的本周日的日期
		cal.add(Calendar.WEEK_OF_YEAR, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取某年第一天日期
	 * 
	 * @param year
	 *            年份
	 * @return Date
	 * @throws ParseException
	 */
	public static Date getYearFirst(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}

	/**
	 * 获取某年最后一天日期
	 * 
	 * @param year
	 *            年份
	 * @return Date
	 * @throws ParseException
	 */
	public static Date getYearLast(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.roll(Calendar.DAY_OF_YEAR, -1);
		return calendar.getTime();
	}
}
