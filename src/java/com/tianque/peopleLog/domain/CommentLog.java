package com.tianque.peopleLog.domain;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

import com.tianque.core.base.BaseDomain;

public class CommentLog extends BaseDomain {
	/* 日志Id */
	private Long logId;
	/* 点评人Id */
	private Long userId;
	/* 点评人Name */
	private String commentUser;
	/* 点评内容 */
	private String comments;
	/* 点评时间 */
	private Date commentTime;
	/* 民情日志 */
	private PeopleLog peopleLog;

	public PeopleLog getPeopleLog() {
		return peopleLog;
	}

	public void setPeopleLog(PeopleLog peopleLog) {
		this.peopleLog = peopleLog;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCommentUser() {
		return commentUser;
	}

	public void setCommentUser(String commentUser) {
		this.commentUser = commentUser;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	@JSON(format = "yyyy-MM-dd")
	public Date getCommentTime() {
		return commentTime;
	}

}
