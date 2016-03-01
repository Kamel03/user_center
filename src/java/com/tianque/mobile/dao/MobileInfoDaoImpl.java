package com.tianque.mobile.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.BaseDaoImpl;
import com.tianque.core.util.StringUtil;
import com.tianque.core.vo.PageInfo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.mobile.domain.MobileInfo;

@Repository("mobileInfoDao")
public class MobileInfoDaoImpl extends BaseDaoImpl<MobileInfo, MobileInfo> implements MobileInfoDao {

	@Override
	public MobileInfo getMobileInfoByImsiNo(String imsiNo) {
		if (!StringUtil.isStringAvaliable(imsiNo)) {
			throw new BusinessValidationException("参数不正确！");
		}
		return (MobileInfo) getSqlMapClientTemplate().queryForObject(
				"mobileInfo.getMobileInfoByImsiNo", imsiNo);
	}

	@Override
	public MobileInfo addMobileInfo(MobileInfo mobileInfo) {
		// TODO 验证插入数据的有效性
		Long id = (Long) getSqlMapClientTemplate().insert("mobileInfo.addMobileInfo", mobileInfo);
		return getMobileInfoById(id);
	}

	@Override
	public MobileInfo getMobileInfoById(Long id) {
		if (id == null) {
			throw new BusinessValidationException("参数不正确！");
		}
		return (MobileInfo) getSqlMapClientTemplate().queryForObject(
				"mobileInfo.getMobileInfoById", id);
	}

	@Override
	public PageInfo findMobileInfoForPage(Integer pageNum, Integer pageSize, String sidx,
			String sord) {
		Map<String, String> map = new HashMap<String, String>();
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"mobileInfo.countMobileInfos", map);
		if (StringUtil.isStringAvaliable(sidx)) {
			map.put("sortField", sidx);
		}
		map.put("order", sord);
		List<MobileInfo> list = getSqlMapClientTemplate().queryForList(
				"mobileInfo.searchMobileInfos", map, (pageNum - 1) * pageSize, pageSize);
		return createPageInfo(pageNum, pageSize, countNum, list);
	}

	private PageInfo<MobileInfo> createPageInfo(int pageNum, int pageSize, Integer countNum,
			List list) {
		PageInfo<MobileInfo> pageInfo = new PageInfo<MobileInfo>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}

	@Override
	public List<MobileInfo> searchMobileInfosForExport(MobileInfo mobileInfo, Integer page,
			Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (mobileInfo != null) {
			map.put("imsiNo", mobileInfo.getImsiNo());
			map.put("name", mobileInfo.getName());
			map.put("mobileNumber", mobileInfo.getMobileNumber());
			map.put("acceptTime", mobileInfo.getAcceptTime());
			map.put("effectivelyTime", mobileInfo.getEffectivelyTime());
			map.put("orgInternalCode", mobileInfo.getOrgInternalCode());
		}

		if (page == null) {
			return getSqlMapClientTemplate().queryForList("mobileInfo.searchMobileInfos", map);
		} else {
			return getSqlMapClientTemplate().queryForList("mobileInfo.searchMobileInfos", map,
					(page - 1) * rows, rows);
		}
	}

	@Override
	public PageInfo<MobileInfo> findMobileInfosByQueryCondition(MobileInfo mobileInfo,
			Integer page, Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (mobileInfo != null) {
			map.put("imsiNo", mobileInfo.getImsiNo());
			map.put("name", mobileInfo.getName());
			map.put("mobileNumber", mobileInfo.getMobileNumber());
			if (!StringUtil.isStringAvaliable(mobileInfo.getOrgInternalCode())) {
				map.put("orgInternalCode", "1.");
			} else {
				map.put("orgInternalCode", mobileInfo.getOrgInternalCode());
			}
		}
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"mobileInfo.countMobileInfos", map);

		List<MobileInfo> list = getSqlMapClientTemplate().queryForList(
				"mobileInfo.searchMobileInfos", map, (page - 1) * rows, rows);
		return createPageInfo(page, rows, countNum, list);
	}

	@Override
	public int deleteMobileInfo(String imsiNo) {
		return getSqlMapClientTemplate().delete("mobileInfo.deleteMobileInfo", imsiNo);
	}
}
