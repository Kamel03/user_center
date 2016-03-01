package com.tianque.plugin.analyzing.domain;

import java.io.Serializable;

public class StatisticsBaseInfoAddCountVo implements Comparable, Cloneable,
		Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 组织结构名称
	 */
	private String statisticsType;
	/**
	 * 今日新增数量
	 */
	private int todayAddCount;
	/**
	 * 本月新增数量
	 */
	private int thisMonthCount;
	/**
	 * 本月关注人数
	 */
	private int attentionCount;
	/**
	 * 所有人数
	 */
	private int allCount;

	/***
	 * 涉疆人员总数
	 */
	private int involveSinkiangCount;
	/***
	 * 涉藏人员总数
	 */
	private int involveTibetCount;

	public int getInvolveSinkiangCount() {
		return involveSinkiangCount;
	}

	public void setInvolveSinkiangCount(int involveSinkiangCount) {
		this.involveSinkiangCount = involveSinkiangCount;
	}

	public int getInvolveTibetCount() {
		return involveTibetCount;
	}

	public void setInvolveTibetCount(int involveTibetCount) {
		this.involveTibetCount = involveTibetCount;
	}

	private Long seq;

	public String getStatisticsType() {
		return statisticsType;
	}

	public void setStatisticsType(String statisticsType) {
		this.statisticsType = statisticsType;
	}

	public int getTodayAddCount() {
		return todayAddCount;
	}

	public void setTodayAddCount(int todayAddCount) {
		this.todayAddCount = todayAddCount;
	}

	public int getThisMonthCount() {
		return thisMonthCount;
	}

	public void setThisMonthCount(int thisMonthCount) {
		this.thisMonthCount = thisMonthCount;
	}

	public int getAttentionCount() {
		return attentionCount;
	}

	public void setAttentionCount(int attentionCount) {
		this.attentionCount = attentionCount;
	}

	public int getAllCount() {
		return allCount;
	}

	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public int compareTo(Object o) {// 实现Comparable接口的方法
		StatisticsBaseInfoAddCountVo p = (StatisticsBaseInfoAddCountVo) o;
		Long s1 = this.seq;
		Long s2 = p.getSeq();
		if (s1 == null && s2 == null) {
			return 0;
		}
		if (s1 == null) {
			return -1;
		}
		if (s2 == null) {
			return 1;
		}
		return s1.compareTo(s2);
	}

	@Override
	public StatisticsBaseInfoAddCountVo clone() {
		try {
			return (StatisticsBaseInfoAddCountVo) super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return this;
	}
}
