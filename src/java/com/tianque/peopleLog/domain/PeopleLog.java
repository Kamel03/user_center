package com.tianque.peopleLog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.tianque.core.base.BaseDomain;
import com.tianque.core.util.BaseDomainIdEncryptUtil;
import com.tianque.core.util.StringUtil;
import com.tianque.domain.Organization;
import com.tianque.domain.PropertyDict;

public class PeopleLog extends BaseDomain {
	/* 所属网格 */
	private Organization organization;
	/* 所属责任区编号 */
	private String orgInternalCode;
	/* 日志类型 */
	private PropertyDict logType;
	/* 用户id */
	private Long userId;
	/* 日志所属人 */
	private String belonger;
	/* 发表时间 */
	private Date publishDate;
	/* 地点 */
	private String address;
	/* 日志标题 */
	private String title;
	/* 日志内容 */
	private String contents;
	/* 日志总结 */
	private String summary;
	/* 点评数 */
	private Integer commentNums;

	private List<CommentLog> comments;

	/* 是否有附件 */
	private Boolean isAttachment;

	private Long serviceRecordId;

	/* 附件 */
	private List<PeopleLogAttachFiles> peopleLogFiles = new ArrayList<PeopleLogAttachFiles>();

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getOrgInternalCode() {
		return orgInternalCode;
	}

	public void setOrgInternalCode(String orgInternalCode) {
		this.orgInternalCode = orgInternalCode;
	}

	public PropertyDict getLogType() {
		return logType;
	}

	public void setLogType(PropertyDict logType) {
		this.logType = logType;
	}

	public List<CommentLog> getComments() {
		return comments;
	}

	public void setComments(List<CommentLog> comments) {
		this.comments = comments;
	}

	public String getBelonger() {
		return belonger;
	}

	public void setBelonger(String belonger) {
		this.belonger = belonger;
	}

	@JSON(format = "yyyy-MM-dd")
	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setCommentNums(Integer commentNums) {
		this.commentNums = commentNums;
	}

	public Integer getCommentNums() {
		return commentNums;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public Boolean getIsAttachment() {
		return isAttachment;
	}

	public void setIsAttachment(Boolean isAttachment) {
		this.isAttachment = isAttachment;
	}

	public List<PeopleLogAttachFiles> getPeopleLogFiles() {
		return peopleLogFiles;
	}

	public void setPeopleLogFiles(List<PeopleLogAttachFiles> peopleLogFiles) {
		this.peopleLogFiles = peopleLogFiles;
	}

	public void setServiceRecordId(Long serviceRecordId) {
		this.serviceRecordId = serviceRecordId;
	}

	public Long getServiceRecordId() {
		return serviceRecordId;
	}

	public String getEncryptId() {
		String orgCode = this.orgInternalCode;
		if (!StringUtil.isStringAvaliable(orgCode) && organization != null) {
			orgCode = this.organization.getOrgInternalCode();
		}
		return BaseDomainIdEncryptUtil.encryptDomainId(getId(), orgCode, null);
	}

}
