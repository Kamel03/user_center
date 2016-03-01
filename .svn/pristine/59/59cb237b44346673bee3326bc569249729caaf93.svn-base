package com.tianque.sysadmin.dao;

import java.util.Date;
import java.util.List;

import com.tianque.domain.UsedInfo;
import com.tianque.domain.UserSign;

/**
 * @author 张静静
 * @data 2014-10-16 下午02:14:00
 * 
 */
public interface UserSignDao {
	public UserSign addUserSign(UserSign userSign);

	public UserSign getUserSignById(Long id);

	/**
	 * 根据当前用户的id和当前日期，判断用户是否已经签到
	 * 
	 * @param userId
	 * @param date
	 * @return
	 */
	public int getUserSignByUserId(Long userId, String date);

	/**
	 * 根据当前用户id和当前年月，获取用户本月的签到情况
	 * 
	 * @param userId
	 * @param year
	 * @param month
	 * @return
	 */
	public List<String> getDaysByUserIdAndDate(Long userId, String year,
			String month);
	
	/**
	 * 查询用户登录这一周的登录情况
	 * @return
	 */
	public List<String> getUserSignOfCurrentWeek(Long userId);

	public List<UsedInfo> getUsedLoginInfoForUsedInfo(Date beforDayStartDate,
			Date beforDayEndDate, Date beforWeekMonday, Date beforWeekSunday,
			Date monthStartDate, Date monthEndDate, Long orgId, Long orgTypeId);
}
