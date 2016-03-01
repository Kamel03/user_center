package com.tianque.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.vo.PageInfo;
import com.tianque.dao.SearchWorkContacterDao;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;

@Repository("searchWorkContacterDao")
public class SearchWorkContacteDaoImpl extends AbstractBaseDao implements
		SearchWorkContacterDao {

	@Override
	public PageInfo<WorkContacter> searchUsersByWorkContacter(
			ContacterVo contacterVo, Boolean isHasOrg, Integer page,
			Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (isHasOrg) {
			map.put("privenesOrganization", contacterVo.getOrganization());
		} else {
			map.put("organization", contacterVo.getOrganization());
		}

		map.put("name", contacterVo.getName());

		map.put("mobileNumber", contacterVo.getMobileNumber());

		if (contacterVo.getOwner() != null
				&& contacterVo.getOwner().getWorkPhone() != null) {
			map.put("workPhone", contacterVo.getOwner().getWorkPhone());
		}

		map.put("belongClass", WorkContacter.WORKCONTACTER);

		map.put("sortField", sidx);

		map.put("order", sord);

		map.put("currentUserOrgLeavel", contacterVo.getCurrentUserOrgLeavel());

		PageInfo<WorkContacter> pageInfo = new PageInfo<WorkContacter>();

		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"searchWorkContacter.countWorkContacters", map);

		int pageCount = 0;

		if (rows != 0 && countNum > 0) {
			pageCount = (countNum - 1) / rows + 1;
		}

		page = page > pageCount ? pageCount : page;

		List<WorkContacter> list = getSqlMapClientTemplate().queryForList(
				"searchWorkContacter.searchWorkContacters", map,
				(page - 1) * rows, rows);

		pageInfo.setResult(list);

		pageInfo.setTotalRowSize(countNum);

		pageInfo.setCurrentPage(page);

		pageInfo.setPerPageSize(rows);

		return pageInfo;
	}

}
