/*
 * 文件名称: User2CMSUser.java
 * ----------------------------------------------------------------------------------------------
 * 修改历史:
 * ----------------------------------------------------------------------------------------------
 * 修改原因: 新增
 * 修改人员: 王振
 * 修改日期: 2013-5-27
 * 修改内容:
 */
package com.tianque.sysadmin.listerner.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

import com.tianque.core.util.GlobalValue;
import com.tianque.core.util.GridProperties;
import com.tianque.domain.User;
import com.tianque.exception.base.OperationFailedException;
import com.tianque.sysadmin.listerner.UserListernerAdapter;

/**
 * @author 王振
 */
@Component("user2CMSUser")
public class User2CMSUser extends UserListernerAdapter {

	@Override
	public void addUser(User user) {
		if (!"production".equals(GlobalValue.environment)
				|| "true".equals(GridProperties.CMS_OFF)) {
			return;
		}
		HttpClient httpClient = new DefaultHttpClient();
		try {
			HttpPost httpPost = new HttpPost(GridProperties.CMS_PATH
					+ "/member/o_save.jspx");
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("userName", user.getUserName()));
			nvps.add(new BasicNameValuePair("password", user.getPassword()));
			nvps.add(new BasicNameValuePair("email",
					user.getEmail() == null ? "admin@163.com" : user.getEmail()));
			httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
			httpClient.execute(httpPost);
			httpPost.releaseConnection();
		} catch (Exception e) {
			throw new OperationFailedException("新增用户失败", e);
		}
	}

	public static void main(String[] args) {
		if (!"production".equals(GlobalValue.environment)
				|| "true".equals(GridProperties.CMS_OFF)) {
			return;
		}
		User2CMSUser cmsuser = new User2CMSUser();
		cmsuser.resetUserPassword("11111", "11232");
	}

	@Override
	public void deleteUser(String userName) {
		if (!"production".equals(GlobalValue.environment)
				|| "true".equals(GridProperties.CMS_OFF)) {
			return;
		}
		HttpClient httpClient = new DefaultHttpClient();
		try {
			HttpPost httpPost = new HttpPost(GridProperties.CMS_PATH
					+ "/member/o_delete.jspx");
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("userName", userName));
			httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
			httpClient.execute(httpPost);
			httpPost.releaseConnection();
		} catch (Exception e) {
			throw new OperationFailedException("删除用户失败", e);
		}

	}

	@Override
	public void resetUserPassword(String userName, String password) {
		if (!"production".equals(GlobalValue.environment)
				|| "true".equals(GridProperties.CMS_OFF)) {
			return;
		}
		HttpClient httpClient = new DefaultHttpClient();
		try {
			HttpPost httpPost = new HttpPost(GridProperties.CMS_PATH
					+ "/member/o_updatePwdEmail.jspx");
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("userName", userName));
			nvps.add(new BasicNameValuePair("email", "admin@163.com"));
			nvps.add(new BasicNameValuePair("password", password));
			httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
			httpClient.execute(httpPost);
			httpPost.releaseConnection();
		} catch (Exception e) {
			throw new OperationFailedException("重置用户密码失败", e);
		}

	}

}
