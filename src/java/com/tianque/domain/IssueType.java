package com.tianque.domain;

import com.tianque.core.base.BaseDomain;

/** 事件类型封装类 */
@SuppressWarnings("serial")
public class IssueType extends BaseDomain {
	/** 该类型所属的大类 */
	private IssueTypeDomain issueTypeDomain;
	/** 内部id */
	private int internalId;
	/** 类型名称 */
	private String issueTypeName;
	/** 显示顺序索引 */
	private int indexId;
	/** 类型描述 */
	private String content;
	/** 类型名称简拼 */
	private String simplePinYin;
	/** 类型名称全拼 */
	private String fullPinYin;
	private Organization org;
	private String orgInternalCode;
	/** 是否个性化 */
	private boolean personalized;
	private String orgName;
	/** 是否可用 */
	private boolean enabled;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public String getOrgInternalCode() {
		return orgInternalCode;
	}

	public void setOrgInternalCode(String orgInternalCode) {
		this.orgInternalCode = orgInternalCode;
	}

	public boolean isPersonalized() {
		return personalized;
	}

	public void setPersonalized(boolean personalized) {
		this.personalized = personalized;
	}

	public int getInternalId() {
		return internalId;
	}

	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	public IssueTypeDomain getIssueTypeDomain() {
		return issueTypeDomain;
	}

	public void setIssueTypeDomain(IssueTypeDomain issueTypeDomain) {
		this.issueTypeDomain = issueTypeDomain;
	}

	public String getIssueTypeName() {
		return issueTypeName;
	}

	public void setIssueTypeName(String issueTypeName) {
		this.issueTypeName = issueTypeName;
	}

	public int getIndexId() {
		return indexId;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSimplePinYin() {
		return simplePinYin;
	}

	public void setSimplePinYin(String simplePinYin) {
		if (simplePinYin != null && simplePinYin.length() > 10) {
			simplePinYin = simplePinYin.substring(0, 10);
		}
		this.simplePinYin = simplePinYin;
	}

	public String getFullPinYin() {
		return fullPinYin;
	}

	public void setFullPinYin(String fullPinYin) {
		if (fullPinYin != null && fullPinYin.length() > 30) {
			fullPinYin = fullPinYin.substring(0, 30);
		}
		this.fullPinYin = fullPinYin;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
