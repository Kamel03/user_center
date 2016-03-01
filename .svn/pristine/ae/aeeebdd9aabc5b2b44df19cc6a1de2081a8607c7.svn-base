package com.tianque.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	private static final String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // 定义script的正则表达式
	private static final String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // 定义style的正则表达式
	private static final String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式
	private static final String regEx_space = "\\s*|\t|\r|\n";// 定义空格回车换行符

	public static String firstCharLowCase(String str) {
		return str.substring(0, 1).toLowerCase() + str.substring(1);
	}

	public static String firstCharUpperCase(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static String addPrefix(int num, String prefix, int length) {
		return String.format("%04d", num);
	}

	/**
	 * 
	 * @param string
	 * @return 如果是合法字符串则返回true，否则返回false
	 */
	public static boolean isStringAvaliable(String string) {
		return string != null && !"".equals(string.trim());
	}

	public static Boolean notSame(String dest, String scre) {
		if (null == dest || null == scre)
			return false;
		else
			return !dest.equals(scre);
	}

	/**
	 * 去掉字符串前后空格
	 * 
	 * @param s
	 * @return
	 */
	public static String trim(String s) {
		int i = s.length();
		int j = 0;// 字符串第一个字符
		int k = 0;// 中间变量
		char[] arrayOfChar = s.toCharArray();// 将字符串转换成字符数组
		while ((j < i) && (arrayOfChar[(k + j)] <= ' '))
			++j;// 确定字符串前面的空格数
		while ((j < i) && (arrayOfChar[(k + i - 1)] <= ' '))
			--i;// 确定字符串后面的空格数
		return (((j > 0) || (i < s.length())) ? s.substring(j, i) : s);// 返回去除空格后的字符串
	}

	/**
	 * 删除input字符串中的html格式
	 * 
	 * @param input
	 * @param length
	 * @return
	 */
	public static String splitAndFilterString(String input) {
		if (input == null || input.trim().equals("")) {
			return "";
		}
		// 去掉所有html元素,
		String str = input.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll(
				"<[^>]*>", "");

		return str.replaceAll("[(/>)<]", "");
	}

	/**
	 * 将字符串用指定的分隔符分割成字符串数组，然后转化为Long类型的List
	 * 
	 * @param str
	 *            要转化的字符串
	 * @param separatorChars
	 *            分隔符
	 * @return Long类型的List
	 */
	public static List<Long> parseLong(String str, String separatorChars) {
		List<Long> list = new ArrayList<Long>();
		if (!isStringAvaliable(str)) {
			return list;
		}
		String[] strings = StringUtils.split(str, separatorChars);
		for (String string : strings) {
			list.add(Long.valueOf(string.trim()));
		}
		return list;
	}

	/**
	 * 将字符串用指定的分隔符分割成字符串数组，然后转化为Integer类型的List
	 * 
	 * @param str
	 *            要转化的字符串
	 * @param separatorChars
	 *            分隔符
	 * @return Integer类型的List
	 */
	public static List<Integer> parseInteger(String str, String separatorChars) {
		List<Integer> list = new ArrayList<Integer>();
		if (!isStringAvaliable(str)) {
			return list;
		}
		String[] strings = StringUtils.split(str, separatorChars);
		for (String string : strings) {
			list.add(Integer.valueOf(string.trim()));
		}
		return list;
	}

	/**
	 * 将字符串用","分割成字符串数组，然后转化为Long类型的List
	 * 
	 * @param str
	 *            要转化的字符串
	 * @param separatorChars
	 *            分隔符
	 * @return Long类型的List
	 */
	public static List<Long> parseLong(String str) {
		return parseLong(str, ",");
	}

	/**
	 * 将字符串用","分割成字符串数组，然后转化为Integer类型的List
	 * 
	 * @param str
	 *            要转化的字符串
	 * @param separatorChars
	 *            分隔符
	 * @return Integer类型的List
	 */
	public static List<Integer> parseInteger(String str) {
		return parseInteger(str, ",");
	}

	/**
	 * 将list转化为用separatorChars隔开的字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String toString(List list, String separatorChars) {
		StringBuffer stringBuffer = new StringBuffer();
		for (Object object : list) {
			stringBuffer.append(object).append(separatorChars);
		}
		if (stringBuffer.length() == 0) {
			return stringBuffer.toString();
		}
		return stringBuffer.substring(0, stringBuffer.length() - 1);
	}

	/**
	 * 将list转化为用','隔开的字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String toString(List list) {
		return toString(list, ",");
	}

	/**
	 * 去掉字符串的html代码
	 * 
	 * @param htmlStr
	 *            字符串
	 * @return 结果
	 */
	public static String delHTMLTag(String htmlStr) {
		Pattern p_script = Pattern.compile(regEx_script,
				Pattern.CASE_INSENSITIVE);
		Matcher m_script = p_script.matcher(htmlStr);
		htmlStr = m_script.replaceAll(""); // 过滤script标签

		Pattern p_style = Pattern
				.compile(regEx_style, Pattern.CASE_INSENSITIVE);
		Matcher m_style = p_style.matcher(htmlStr);
		htmlStr = m_style.replaceAll(""); // 过滤style标签

		Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
		Matcher m_html = p_html.matcher(htmlStr);
		htmlStr = m_html.replaceAll(""); // 过滤html标签

		Pattern p_space = Pattern
				.compile(regEx_space, Pattern.CASE_INSENSITIVE);
		Matcher m_space = p_space.matcher(htmlStr);
		htmlStr = m_space.replaceAll(""); // 过滤空格回车标签
		return htmlStr.trim(); // 返回文本字符串
	}

	public static String htmlToStr(String htmlStr) {
		htmlStr = delHTMLTag(htmlStr);
		htmlStr = htmlStr.replaceAll("&nbsp;", "");
		return htmlStr;
	}

	// 将long类型的数据 转换成list
	public static List<Long> parseLong(Long[] ids) {
		return Arrays.asList(ids);
	}

	// 将list转换long类型数组
	public static Long[] parseList(List<Long> ids) {
		return (Long[]) ids.toArray(new Long[ids.size()]);

	}
	//将list转换成String数组
	public static String[] parseString(List<Long> idList){
		return (String[]) idList.toArray();
	}
}
