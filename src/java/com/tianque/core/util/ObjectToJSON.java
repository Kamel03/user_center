package com.tianque.core.util;

import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.tianque.core.base.BaseDomain;
import com.tianque.exception.base.SystemUtilException;

public class ObjectToJSON {
	public static String convertJSON(BaseDomain domain) {
		try {
			return JSONUtil.serialize(domain);
		} catch (JSONException e) {
			throw new SystemUtilException("序列化domain异常", e);
		}
	}
}
