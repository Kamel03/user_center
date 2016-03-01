package com.tianque.domain;

import com.tianque.core.base.BaseDomain;

/*** 联系人 **/
public abstract class Contacter extends BaseDomain {

	private static final long serialVersionUID = -72964438448078669L;
	/** 姓名 */
	private String name;
	/** 联系人所属类别(站内联系人、其他联系人、我的群组) */
	private String belongClass;
	/** 姓名全拼 */
	private String fullPinyin;
	/** 姓名简拼 */
	private String simplePinyin;
	/** 群组成员数 */
	private Integer member;
	/** 其他联系人 */
	public static final String MYCONTACTER = "myContact";
	/** 站内联系人/平台内联系人 */
	public static final String WORKCONTACTER = "workContact";
	/** 我的群组 */
	public static final String MYGROUP = "myGroup";
	/** 我的组织机构 暂时未使用 */
	public static final String MYAREA = "myArea";
	/** 是否不查询中国层级用户数据 */
	public static final int IS_SEARCH_CHINADATA = 1;
	public static final int SEARCH_CHINADATA = 0;
	/** 用户名 */
	private String userName;
	public abstract String getMobile();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBelongClass() {
		return belongClass;
	}

	public void setBelongClass(String belongClass) {
		this.belongClass = belongClass;
	}

	public String getFullPinyin() {
		return fullPinyin;
	}

	public void setFullPinyin(String fullPinyin) {
		if (fullPinyin != null && fullPinyin.length() > 30) {
			fullPinyin = fullPinyin.substring(0, 30);
		}
		this.fullPinyin = fullPinyin;
	}

	public String getSimplePinyin() {
		return simplePinyin;
	}

	public void setSimplePinyin(String simplePinyin) {
		if (simplePinyin != null && simplePinyin.length() > 10) {
			simplePinyin = simplePinyin.substring(0, 10);
		}
		this.simplePinyin = simplePinyin;
	}

	public Integer getMember() {
		return member;
	}

	public void setMember(Integer member) {
		this.member = member;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	
}
