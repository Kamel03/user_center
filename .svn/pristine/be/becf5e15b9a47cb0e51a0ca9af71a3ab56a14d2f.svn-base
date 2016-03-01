package com.tianque.userAuth.api.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.domain.UsedInfo;
import com.tianque.domain.UserSign;
import com.tianque.sysadmin.service.UserSignService;
import com.tianque.userAuth.api.UserSignDubboService;

@Component
public class UserSignDubboServiceImpl implements UserSignDubboService {

	@Autowired
	private UserSignService userSignService;

	@Override
	public UserSign addUserSign(UserSign userSign) {
		return userSignService.addUserSign(userSign);
	}

	@Override
	public UserSign getUserSignById(Long id) {
		return userSignService.getUserSignById(id);
	}

	@Override
	public boolean getUserSignByUserId(Long userId, String date) {
		return userSignService.getUserSignByUserId(userId, date);
	}

	@Override
	public List<String> getDaysByUserIdAndDate(Long userId, String year,
			String month) {
		return userSignService.getDaysByUserIdAndDate(userId, year, month);
	}

	@Override
	public List<String> getUserSignOfCurrentWeek(Long userId) {
		return userSignService.getUserSignOfCurrentWeek(userId);
	}

	@Override
	public List<UsedInfo> getUsedLoginInfoForUsedInfo(Date beforDayStartDate,
			Date beforDayEndDate, Date beforWeekMonday, Date beforWeekSunday,
			Date monthStartDate, Date monthEndDate, Long orgId, Long orgTypeId) {
		return userSignService.getUsedLoginInfoForUsedInfo(beforDayStartDate,
				beforDayEndDate, beforWeekMonday, beforWeekSunday,
				monthStartDate, monthEndDate, orgId, orgTypeId);
	}

}
