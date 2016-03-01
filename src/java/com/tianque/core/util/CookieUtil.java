package com.tianque.core.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tianque.exception.base.SystemUtilException;

public class CookieUtil {

	public static String getSessionId(HttpServletRequest request) {
		return getValueFromCookies(GlobalValue.LOGIN_SESSION_ID, request);
	}

	public static String getSesssionIdFromCookies(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (GlobalValue.LOGIN_SESSION_ID.equals(cookie.getName())) {
				String sid = cookie.getValue();
				return sid;
			}
		}
		return null;
	}

	public static void putSessionIdInCookies(HttpServletRequest request,
			HttpServletResponse response, String key, String sessionId) {
		Cookie cookie = new Cookie(key, sessionId);
		cookie.setPath("/");
		response.addCookie(cookie);
	}

	public static void saveObjectToCookie(HttpServletRequest request,
			HttpServletResponse response, String key, Object amchartData) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(amchartData);

			String cookieValue = new String(baos.toByteArray(), "UTF-8");
			Cookie cookie = new Cookie(key, cookieValue);
			cookie.setSecure(false);
			cookie.setPath("/");
			cookie.setMaxAge(6000);
			response.addCookie(cookie);
		} catch (Exception e) {
			throw new SystemUtilException("将对象存入cookie异常", e);
		}
	}

	public static Object getObjectFromCookie(String cookieValue) {
		try {
			// String decoderCookieValue =
			// java.net.URLDecoder.decode(cookieValue, " UTF-8 " );
			Object result = new Object();
			ByteArrayInputStream bais = new ByteArrayInputStream(
					cookieValue.getBytes("UTF-8"));
			ObjectInputStream ios = new ObjectInputStream(bais);
			result = ios.readObject();
			return result;
		} catch (Exception e) {
			throw new SystemUtilException("从cookie获取对象异常", e);
		}
	}

	public static Object getObject(byte[] bt) {
		Object oo = null;
		ObjectInputStream objIps;

		// 注意这里，ObjectInputStream 对以前使用 ObjectOutputStream
		// 写入的基本数据和对象进行反序列化。问题就在这里，你是直接将byte[]数组传递过来，而这个byte数组不是使用ObjectOutputStream类写入的。所以问题解决的办法就是：用输出流得到byte[]数组。
		try {
			objIps = new ObjectInputStream(new ByteArrayInputStream(bt));
			oo = (Object) objIps.readObject();
		} catch (Exception e) {
			throw new SystemUtilException("获取对象异常", e);
		}
		return oo;
	}

	public static byte[] getByte(Object object) {
		byte[] bt = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		try {
			if (object != null) {
				ObjectOutputStream objos = new ObjectOutputStream(baos);
				objos.writeObject(object);
				bt = baos.toByteArray();
			}
		} catch (Exception e) {
			throw new SystemUtilException("获取对象异常", e);
		}
		return bt;
	}

	public static void main(String[] args) {
		String s = "helloworld!";
		byte[] bt = null;

		ArrayList<String> list = new ArrayList<String>();

		ArrayList<String> byte_list = new ArrayList<String>();

		byte_list.add(s);

		bt = getByte(byte_list);// 通过调用getByte()方法得到bt[]数组。
		list = (ArrayList<String>) getObject(bt);

		System.out.println(list.size());
		System.out.println(list.get(0));

	}

	public static String getOldSessionId(HttpServletRequest request) {
		return getValueFromCookies(GlobalValue.OLD_LOGIN_SESSION_ID, request);
	}

	private static String getValueFromCookies(String key,
			HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return "";
		}
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (key.equals(cookie.getName())) {
				return cookie.getValue();
			}
		}
		return "";
	}

	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 如果有sid，清除掉该cookie； 如果有oldSid，也清除之
	 */
	public static void clearSessionIdFromCookie(HttpServletRequest request,
			HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		String sessionId = null;
		if (cookies == null)
			return;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(GlobalValue.LOGIN_SESSION_ID)) {
				String sid = cookie.getValue();
				if (sid != null && !"".equals(sid.trim()))
					clearValueInCookies(response, GlobalValue.LOGIN_SESSION_ID,
							sid);
				// break;
			} else if (cookie.getName()
					.equals(GlobalValue.OLD_LOGIN_SESSION_ID)) {
				sessionId = cookie.getValue();
				if (sessionId != null && !"".equals(sessionId.trim()))
					clearValueInCookies(response,
							GlobalValue.OLD_LOGIN_SESSION_ID, sessionId);
			}
		}

	}

	public static void clearValueInCookies(HttpServletResponse response,
			String key, String value) {
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
	}

}
