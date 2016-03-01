package com.tianque.sysadmin.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.domain.UsedInfo;
import com.tianque.domain.UserSign;
import com.tianque.sysadmin.dao.UserSignDao;

/**
 * @author 张静静
 * @data 2014-10-16 下午02:13:54
 * 
 */
@Repository("userSignDao")
public class UserSignDaoImpl extends AbstractBaseDao implements UserSignDao {
	@Override
	public UserSign addUserSign(UserSign userSign) {
		Long id = (Long) getSqlMapClientTemplate().insert(
				"userSign.addUserSign", userSign);
		return getUserSignById(id);
	}

	@Override
	public UserSign getUserSignById(Long id) {
		return (UserSign) getSqlMapClientTemplate().queryForObject(
				"userSign.getUserSignById", id);
	}

	@Override
	public int getUserSignByUserId(Long userId, String date) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("date", date);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"userSign.getUserSignByUserId", map);
	}

	@Override
	public List<String> getDaysByUserIdAndDate(Long userId, String year,
			String month) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("year", year);
		map.put("month", month);
		return getSqlMapClientTemplate().queryForList(
				"userSign.getDaysByUserIdAndDate", map);
	}

	@Override
	public List<String> getUserSignOfCurrentWeek(Long userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("sysdate", new Date());
		return getSqlMapClientTemplate().queryForList(
				"userSign.getUserSignOfCurrentWeek", map);
	}

	@Override
	public List<UsedInfo> getUsedLoginInfoForUsedInfo(Date beforDayStartDate,
			Date beforDayEndDate, Date beforWeekMonday, Date beforWeekSunday,
			Date monthStartDate, Date monthEndDate, Long orgId, Long orgTypeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("beforDayStartDate", beforDayStartDate);
		map.put("beforDayEndDate", beforDayEndDate);
		map.put("beforWeekMonday", beforWeekMonday);
		map.put("beforWeekSunday", beforWeekSunday);
		map.put("monthStartDate", monthStartDate);
		map.put("monthEndDate", monthEndDate);
		map.put("orgId", orgId);
		map.put("orgTypeId", orgTypeId);
		return getSqlMapClientTemplate().queryForList(
				"userSign.getUsedLoginInfoForUsedInfo", map);
	}

}
