package com.tianque.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.tianque.exception.base.ServiceValidationException;
import com.tianque.exception.base.SystemUtilException;

public class CalendarUtil {

	private static final String DEFAULT_FORMAT = "yyyy-MM-dd";

	/***
	 * 默认格式的现在日期
	 * 
	 * @return
	 */
	public static Date now() {
		return new Date();
	}

	/***
	 * 返回指定格式的现在日期
	 * 
	 * @return
	 */
	public static Date now(String format) {
		return formatDate(format, now());
	}

	/***
	 * yyyy-MM-dd 格式的现在日期
	 * 
	 * @return
	 */
	public static Date today() {
		return formatDate(DEFAULT_FORMAT, now());
	}

	/***
	 * yyyy-MM-dd 格式的日期
	 * 
	 * @return
	 */
	public static Date getTomorrow() {
		Calendar c = convertToCalendar(today());
		c.add(Calendar.DAY_OF_MONTH, 1);
		return c.getTime();
	}

	/***
	 * 按照指定的格式解析日期字符串
	 * 
	 * @return
	 */
	public static Date parseDate(String dateString, String format) {
		SimpleDateFormat formater = new SimpleDateFormat();
		formater.applyPattern(format);
		formater.setLenient(false);
		try {
			return formater.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/***
	 * 按照指定的格式格式化日期
	 * 
	 * @return
	 */
	private static Date formatDate(String format, Date date) {
		SimpleDateFormat formater = new SimpleDateFormat();
		formater.applyPattern(format);
		formater.setLenient(false);
		try {
			return formater.parse(formater.format(date));
		} catch (ParseException e) {
			throw new SystemUtilException("格式化失败", e);
		}
	}

	/***
	 * 返回yyyy-MM-dd 格式的日期字符串
	 * 
	 * @return
	 */
	public static String format(Date date) {
		return format(DEFAULT_FORMAT, date);
	}

	/***
	 * 返回指定格式的日期字符串
	 * 
	 * @return
	 */
	public static String format(String format, Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat formater = new SimpleDateFormat();
		formater.applyPattern(format);
		return formater.format(date);
	}

	/***
	 * 返回今天是星期几 例如：星期一
	 * 
	 * @return
	 */
	public static String getWeekDay() {
		return format("EEEE", today());
	}

	/***
	 * 返回指定的日期是星期几 例如：星期一
	 * 
	 * @return
	 */
	public static String getWeekDay(Date date) {
		return format("EEEE", date);
	}

	/***
	 * 返回现在日期的年份
	 * 
	 * @return
	 */
	public static int getNowYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	/***
	 * 返回现在日期的月份
	 * 
	 * @return
	 */
	public static int getNowMonth() {
		return Calendar.getInstance().get(Calendar.MONTH) + 1;
	}

	/***
	 * 返回现在日期的天
	 * 
	 * @return
	 */
	public static int getNowDay() {
		return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}

	public static int getLastYear() {
		return Calendar.getInstance().get(Calendar.YEAR) - 1;
	}

	public static int getLastMonth() {
		Calendar temp = Calendar.getInstance();
		temp.add(Calendar.MONTH, -1);
		return temp.get(Calendar.MONTH) + 1;
	}

	public static int getLastMonthYearValue() {
		Calendar temp = Calendar.getInstance();
		temp.add(Calendar.MONTH, -1);
		return temp.get(Calendar.YEAR);
	}

	public static Date getMonthStart(int year, int month) {
		if (0 == year) {
			return null;
		}
		return parseDate(String.valueOf(year) + month, "yyyyM");
	}

	public static Date getNextMonthStart(int year, int month) {
		if (0 == year) {
			return null;
		}
		Calendar temp = getMonthEndCalendar(year, month);
		temp.add(Calendar.DAY_OF_MONTH, 1);
		return temp.getTime();
	}

	public static Date getLastMonthEnd(int year, int month) {
		Calendar temp = getMonthEndCalendar(year, month);
		temp.add(Calendar.MONTH, -1);
		return temp.getTime();
	}

	public static Date getLastMonthStart(int year, int month) {
		Calendar result = Calendar.getInstance();
		result.setTime(getMonthStart(year, month));
		result.add(Calendar.MONTH, -1);
		return result.getTime();
	}

	public static Date getMonthEnd(int year, int month) {
		return getMonthEndCalendar(year, month).getTime();
	}

	private static Calendar getMonthEndCalendar(int year, int month) {
		Calendar result = Calendar.getInstance();
		result.setTime(getMonthStart(year, month));
		result.set(Calendar.DAY_OF_MONTH,
				result.getActualMaximum(Calendar.DAY_OF_MONTH));
		return result;
	}

	/***
	 * 返回指定日期的年份
	 * 
	 * @return
	 */
	public static int getYear(Date date) {
		Calendar c = convertToCalendar(date);
		return c.get(Calendar.YEAR);
	}

	/***
	 * 返回指定日期的月份
	 * 
	 * @return
	 */
	public static int getMonth(Date date) {
		Calendar c = convertToCalendar(date);
		return c == null ? 1 : c.get(Calendar.MONTH) + 1;
	}

	/***
	 * 返回指定日期的天
	 * 
	 * @return
	 */
	public static int getDay(Date date) {
		Calendar c = convertToCalendar(date);
		return c == null ? 1 : c.get(Calendar.DAY_OF_MONTH);
	}

	public static Calendar convertToCalendar(Date date) {
		if (date == null) {
			return null;
		}
		Calendar result = Calendar.getInstance();
		result.setTime(date);
		return result;
	}

	/** 时间转换将指定日期转换为long型数据 */
	public static Long transferStringDateToLong(String formatDate,
			int addTimeValue) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
			Calendar nowTime = Calendar.getInstance();
			nowTime.add(Calendar.HOUR, addTimeValue);// 当前时间增加指定小时数
			Date dt = sdf.parse(sdf.format(nowTime.getTime()));
			return dt.getTime();
		} catch (ParseException e) {
			throw new ServiceValidationException(
					"类CalendarUtil的方法transferStringDateToLong出错：", "时间转换失败", e);
		}
	}

	/***
	 * 根据系统时间取得上个月的月末
	 * 
	 * @return
	 */
	public static Date getBeforeMonthLastDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, calendar.getMaximum(Calendar.DATE));
		calendar.add(Calendar.MONTH, -1);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	/***
	 * 根据系统时间取得下个月的月初
	 * 
	 * @return
	 */
	public static Date getNextMonthFirstDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, calendar.getMinimum(Calendar.DATE));
		calendar.add(Calendar.MONTH, 1);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	/***
	 * 根据当前时间获得本月月初
	 * 
	 * @param args
	 */
	public static Date getMonthFirstDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, calendar.getMinimum(Calendar.DATE));
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	/***
	 * 根据当前时间获得本月月末
	 * 
	 * @param args
	 */
	public static Date getMonthLastDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, calendar.getMaximum(Calendar.DATE));
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	/***
	 * 根据系统时间获取当前周的周一
	 */
	public static Date getWeekMonday() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		String dateFormat = "yyyy-MM-dd";
		return formatDate(dateFormat, calendar.getTime());
	}

	/***
	 * 根据系统时间获取下周的周一
	 */
	public static Date getNextWeekMonday() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 7);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		String dateFormat = "yyyy-MM-dd";
		return formatDate(dateFormat, calendar.getTime());
	}

	/**
	 * 根据当前时间获取当前月的最后一天精确到23:59:59
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeforeMonthLastDayByTime(int year, int month) {
		Date date = getDateByYearAndMonth(year, month);
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}
	/***
	 * 根据传入时间获取上月最后一天，精确到时分秒
	 */
	public static Date getBeforMonthLastDayByDate(Date date){
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 cal.add(Calendar.MONTH, -1);
		 int MaxDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 cal.set( cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), MaxDay, 23, 59, 59);
		 String dateFormat = "yyyy-MM-dd HH:mm:ss";
		 return formatDate(dateFormat, cal.getTime());
	}
	
	/**
	 * 根据当前时间获取当前月的第一天精确到00:00:00
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeforeMonthFirstDayByTime(int year, int month) {
		Date date = getDateByYearAndMonth(year, month);
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	/**
	 * 根据当前时间获取当前月的最后一天向前推7天精确到00:00:00
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeforeMonthWeekDayByTime(int year, int month) {
		Date date = getDateByYearAndMonth(year, month);
		if (date == null) {
			return null;
		}
		Date lastDay = getBeforeMonthLastDayByTime(year, month);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(lastDay);
		calendar.add(Calendar.DATE, -6);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	/**
	 * 根据当前时间获取当前月往前推2个自然月，到00:00:00
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeforeQuarterDayByTime(int year, int month) {
		Date date = getDateByYearAndMonth(year, month);
		if (date == null) {
			return null;
		}
		Date lastDay = getBeforeMonthLastDayByTime(year, month);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(lastDay);
		calendar.add(Calendar.MONTH, -2);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}

	public static Date getDateByYearAndMonth(int year, int month) {
		if (year <= 0 || month <= 0) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.add(Calendar.MONTH, -1);
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		return formatDate(dateFormat, calendar.getTime());
	}
	
	/***
	 * 根据系统时间获取上个月所在年份
	 * @param args
	 */
	public static int getLastYearByMonth(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -15);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy");
		String yearStr = sdf.format(c.getTime());
		return Integer.parseInt(yearStr);
		
	}
	
	/***
	 * 根据系统时间获取上个月
	 * @param args
	 */
	public static int getLastMonthByMonth(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -15);
		SimpleDateFormat sdf =new SimpleDateFormat("MM");
		String monthStr = sdf.format(c.getTime());
		return Integer.parseInt(monthStr);
		
	}
	
	/***
	 * 根据传入时间获取本月最后一天 精确到时分秒
	 */
	public static Date getNextDate(int year,int month){
		Date date = getDateByYearAndMonth(year, month);
		 if (date == null) {
			 return null;
		 }
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DATE, calendar.getMinimum(Calendar.DATE));
		calendar.add(Calendar.MONTH, 1);
		String dateFormat = "yyyy-MM";
		return formatDate(dateFormat, calendar.getTime());
	}
	
}
