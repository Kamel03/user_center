package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.PageInfo;
import com.tianque.mobile.domain.MobileInfo;
import com.tianque.mobile.service.MobileInfoService;
import com.tianque.userAuth.api.MobileInfoDubboService;

@Component
public class MobileInfoDubboServiceImpl implements MobileInfoDubboService {

	@Autowired
	private MobileInfoService mobileInfoService;

	@Override
	public boolean existImsiNo(String imsiNo) {
		return mobileInfoService.existImsiNo(imsiNo);
	}

	@Override
	public MobileInfo addMobileInfo(MobileInfo mobileInfo) {
		return mobileInfoService.addMobileInfo(mobileInfo);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public PageInfo findMobileInfoForPage(Integer page, Integer rows,
			String sidx, String sord) {
		return mobileInfoService.findMobileInfoForPage(page, rows, sidx, sord);
	}

	@Override
	public MobileInfo getMobileInfoById(Long id) {
		return mobileInfoService.getMobileInfoById(id);
	}

	@Override
	public List<MobileInfo> searchMobileInfosForExport(MobileInfo mobileInfo,
			Integer page, Integer rows, String sidx, String sord) {
		return mobileInfoService.searchMobileInfosForExport(mobileInfo, page,
				rows, sidx, sord);
	}

	@Override
	public PageInfo<MobileInfo> findMobileInfosByQueryCondition(
			MobileInfo mobileInfo, Integer page, Integer rows, String sidx,
			String sord) {
		return mobileInfoService.findMobileInfosByQueryCondition(mobileInfo,
				page, rows, sidx, sord);
	}

	@Override
	public int deleteMobileInfo(String imsiNo) {
		return mobileInfoService.deleteMobileInfo(imsiNo);
	}
}
