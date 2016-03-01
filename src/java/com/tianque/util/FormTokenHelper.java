package com.tianque.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.opensymphony.xwork2.ActionContext;
import com.tianque.core.cache.service.CacheService;

/**
 * @ClassName: FormTokenHelper
 * @Description: 防止表单提交工具类(基于memcached实现)
 * @author yumeng
 * @date 2013-4-27 下午02:14:22
 */
public class FormTokenHelper {
	public static final String TOKEN_REQUEST_PARAMETER = "form.parameter";
	public static final String TOKEN_NAME = "struts.token";

	/**
	 * @Description: 通过缓存中的令牌值验证是否重复提交
	 * @param cacheService
	 *        缓存
	 * @return 验证是否通过
	 * @author yumeng
	 * @date 2013-5-1 下午01:35:22
	 * @return boolean
	 */
	public static boolean validToken(CacheService cacheService) {
		// 当前令牌值
		String token = getToken(TOKEN_NAME);
		Map params = ActionContext.getContext().getParameters();
		String parameterStr = requestParameters(params);
		String cacheToken = (String) cacheService.get(token);
		String cacheParameter = (String) cacheService.get(TOKEN_REQUEST_PARAMETER, token);
		if (token.equals(cacheToken) && parameterStr.equals(cacheParameter)) {
			return false;
		}

		cacheService.set(FormTokenHelper.TOKEN_REQUEST_PARAMETER, token, parameterStr);

		return true;
	}

	/**
	 * @Description: 通过请求参数判断用户是否在输入错误参数后再次提交
	 * @param params
	 * @return
	 * @author yumeng
	 * @date 2013-5-1 下午01:34:27
	 * @return String
	 */
	public static String requestParameters(Map params) {
		List keys = new ArrayList(params.keySet());
		Collections.sort(keys);
		String prestr = "";
		boolean first = true;
		for (int i = 0; i < keys.size(); i++) {
			String key = (String) keys.get(i);
			String value = ((String[]) params.get(key))[0];
			if("_".equals(key)){
				continue;
			}
			if (value == null || value.trim().length() == 0) {
				continue;
			}
			if (first) {
				prestr = prestr + key + "=" + value;
				first = false;
			} else {
				prestr = prestr + "&" + key + "=" + value;
			}
		}
		return prestr;
	}

	public static String getToken(String tokenName) {
		if (tokenName == null) {
			return null;
		}
		Map params = ActionContext.getContext().getParameters();
		String[] tokens = (String[]) params.get(tokenName);
		String token;

		if ((tokens == null) || (tokens.length < 1)) {
			return null;
		}
		token = tokens[0];

		return token;
	}

	// 生成令牌值
	public static String generateGUID() {
		return UUID.randomUUID().toString().toUpperCase();
	}
}
