package com.tianque.sysadmin.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.domain.UsedInfo;
import com.tianque.domain.UserSign;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.sysadmin.dao.UserSignDao;
import com.tianque.sysadmin.service.UserSignService;
import com.tianque.workMemo.service.WorkMemoServiceImpl;

/**
 * @author 张静静
 * @data 2014-10-16 下午02:42:25
 * 
 */
@Service("userSignService")
@Transactional
public class UserSignServiceImpl implements UserSignService {

	@Autowired
	private UserSignDao userSignDao;

	public final static Logger logger = LoggerFactory
			.getLogger(WorkMemoServiceImpl.class);

	@Override
	public UserSign addUserSign(UserSign userSign) {
		return userSignDao.addUserSign(userSign);
	}

	@Override
	public UserSign getUserSignById(Long id) {
		return userSignDao.getUserSignById(id);
	}

	@Override
	public boolean getUserSignByUserId(Long userId, String date) {
		if (userSignDao.getUserSignByUserId(userId, date) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<String> getDaysByUserIdAndDate(Long userId, String year,
			String month) {
		return userSignDao.getDaysByUserIdAndDate(userId, year, month);
	}

	@Override
	public List<String> getUserSignOfCurrentWeek(Long userId) {
		return userSignDao.getUserSignOfCurrentWeek(userId);
	}

	@Override
	public List<UsedInfo> getUsedLoginInfoForUsedInfo(Date beforDayStartDate,
			Date beforDayEndDate, Date beforWeekMonday, Date beforWeekSunday,
			Date monthStartDate, Date monthEndDate, Long orgId, Long orgTypeId) {
		if (beforDayStartDate==null 
				|| beforDayEndDate==null 
				|| beforWeekMonday==null 
				|| beforWeekSunday==null 
				|| monthStartDate==null 
				|| monthEndDate==null 
				|| orgId==null 
				|| orgTypeId==null) {
			throw new BusinessValidationException("参数错误");
		}
		return userSignDao.getUsedLoginInfoForUsedInfo(beforDayStartDate,
				beforDayEndDate, beforWeekMonday, beforWeekSunday,
				monthStartDate, monthEndDate, orgId, orgTypeId);
	}

}
