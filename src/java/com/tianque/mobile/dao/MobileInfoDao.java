package com.tianque.mobile.dao;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.mobile.domain.MobileInfo;

public interface MobileInfoDao {

	MobileInfo getMobileInfoByImsiNo(String imsiNo);

	MobileInfo addMobileInfo(MobileInfo mobileInfo);

	MobileInfo getMobileInfoById(Long id);

	PageInfo findMobileInfoForPage(Integer pageNum, Integer pageSize, String sidx, String sord);

	List<MobileInfo> searchMobileInfosForExport(MobileInfo mobileInfo, Integer page, Integer rows,
			String sidx, String sord);

	PageInfo<MobileInfo> findMobileInfosByQueryCondition(MobileInfo mobileInfo, Integer page,
			Integer rows, String sidx, String sord);

	int deleteMobileInfo(String imsiNo);

}
