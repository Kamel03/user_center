package com.tianque.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.validate.DomainValidator;
import com.tianque.core.validate.ValidateResult;
import com.tianque.core.vo.PageInfo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.mobile.dao.MobileInfoDao;
import com.tianque.mobile.domain.MobileInfo;
import com.tianque.sysadmin.service.OrganizationService;

@Service("mobileInfoService")
@Transactional
public class MobileInfoServiceImpl implements MobileInfoService {

	@Autowired
	private MobileInfoDao mobileInfoDao;

	@Autowired
	private OrganizationService organizationService;

	@Autowired
	@Qualifier("mobileInfoValidator")
	private DomainValidator validator;

	@Override
	public boolean existImsiNo(String imsiNo) {
		MobileInfo mobileInfo = mobileInfoDao.getMobileInfoByImsiNo(imsiNo);
		if (mobileInfo != null && mobileInfo.getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public MobileInfo addMobileInfo(MobileInfo mobileInfo) {
		// TODO验证数据的有效性
		ValidateResult validateResult = validator.validate(mobileInfo);
		if (validateResult.hasError()) {
			throw new BusinessValidationException(
					validateResult.getErrorMessages());
		}
		// 获得orgInternalCode
		mobileInfo.setOrgInternalCode(organizationService.getSimpleOrgById(
				mobileInfo.getOrganization().getId()).getOrgInternalCode());

		return mobileInfoDao.addMobileInfo(mobileInfo);
	}

	@Override
	public PageInfo findMobileInfoForPage(Integer pageNum, Integer pageSize,
			String sidx, String sord) {

		return mobileInfoDao.findMobileInfoForPage(pageNum, pageSize, sidx,
				sord);
	}

	@Override
	public MobileInfo getMobileInfoById(Long id) {
		if (id == null) {
			throw new BusinessValidationException("参数错误");
		}
		return mobileInfoDao.getMobileInfoById(id);
	}

	@Override
	public List<MobileInfo> searchMobileInfosForExport(MobileInfo mobileInfo,
			Integer page, Integer rows, String sidx, String sord) {
		return mobileInfoDao.searchMobileInfosForExport(mobileInfo, page, rows,
				sidx, sord);
	}

	@Override
	public PageInfo<MobileInfo> findMobileInfosByQueryCondition(
			MobileInfo mobileInfo, Integer page, Integer rows, String sidx,
			String sord) {
		return mobileInfoDao.findMobileInfosByQueryCondition(mobileInfo, page,
				rows, sidx, sord);
	}

	@Override
	public int deleteMobileInfo(String imsiNo) {
		return mobileInfoDao.deleteMobileInfo(imsiNo);
	}

}
