package com.tianque.domain;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.tianque.core.base.BaseDomain;
import com.tianque.core.property.GridInternalProperty;

/***
 * 事件类型(大类)域
 */
@SuppressWarnings("serial")
public class IssueTypeDomain extends BaseDomain {

	/** 事件大类名称 */
	private String domainName;
	/** 系统敏感性 是否是系统内置属性 */
	private boolean systemSensitive;
	private String systemRestrict;
	/** 模块类型 该类型属于系统那个模块(事件处理、城市管理、服务审批、呼叫中心) */
	private String module;
	/** 是否个性化 */
	private boolean personalized;

	public boolean isPersonalized() {
		return personalized;
	}

	public void setPersonalized(boolean personalized) {
		this.personalized = personalized;
	}

	public boolean isSystemSensitive() {
		return systemSensitive;
	}

	public void setSystemSensitive(boolean systemSensitive) {
		this.systemSensitive = systemSensitive;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<GridInternalProperty> getInternaleProperties() {
		if (this.systemRestrict == null
				|| "".equals(this.systemRestrict.trim())) {
			return null;
		}
		List<GridInternalProperty> result = new ArrayList<GridInternalProperty>();
		JSONArray jsonArray = JSONArray.fromObject(this.systemRestrict);
		for (int i = 0; i < jsonArray.size(); i++) {
			Object o = jsonArray.get(i);
			JSONObject jsonObject = JSONObject.fromObject(o);
			GridInternalProperty property = (GridInternalProperty) JSONObject
					.toBean(jsonObject, GridInternalProperty.class);
			result.add(property);
		}
		return result;
	}

	public void setInternaleProperties(List<GridInternalProperty> properties) {
		if (properties == null || properties.size() == 0) {
			this.systemRestrict = null;
			return;
		}
		JSONArray jsonArray = JSONArray.fromObject(properties);
		this.systemRestrict = jsonArray.toString();
	}

	public static void main(String[] args) {
		List<GridInternalProperty> list = new ArrayList<GridInternalProperty>();
		for (int i = 0; i < 3; i++) {
			GridInternalProperty gridInternalProperty = new GridInternalProperty();
			gridInternalProperty.setIdentify(i);
			gridInternalProperty.setDisplayName(i + "");
			list.add(gridInternalProperty);
		}
		System.out.println(JSONArray.fromObject(list));
	}
}
