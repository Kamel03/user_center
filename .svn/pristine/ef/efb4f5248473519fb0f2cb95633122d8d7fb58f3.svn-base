package com.tianque.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.vo.PageInfo;
import com.tianque.dao.WorkContacterDao;
import com.tianque.domain.MyContacter;
import com.tianque.domain.Organization;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.OperationFailedException;
import com.tianque.util.ParametersConvertUtil;

@Repository("workContacterDao")
public class WorkContacterDaoImpl extends AbstractBaseDao implements
		WorkContacterDao {

	@Override
	public WorkContacter addWorkContacter(WorkContacter workContacter) {
		if (!validate(workContacter))
			throw new BusinessValidationException("系统异常");
		Long id = (Long) getSqlMapClientTemplate().insert(
				"workContacter.addWorkContacter", workContacter);
		return this.getSimpleWorkContacterById(id);
	}

	@Override
	public WorkContacter getSimpleWorkContacterById(Long id) {
		return (WorkContacter) getSqlMapClientTemplate().queryForObject(
				"workContacter.getSimpleWorkContacterById", id);
	}

	public ContacterVo getSimpleContacterById(Long id) {
		return (ContacterVo) getSqlMapClientTemplate().queryForObject(
				"workContacter.getSimpleContacterById", id);
	}

	@Override
	public WorkContacter updateWorkContacter(WorkContacter workContacter) {
		if (!validate(workContacter))
			throw new BusinessValidationException("系统异常");
		getSqlMapClientTemplate().update("workContacter.updateWorkContacter",
				workContacter);
		return this.getSimpleWorkContacterById(workContacter.getId());
	}

	private boolean validate(WorkContacter workContacter) {
		if (workContacter == null)
			return false;
		if (workContacter.getName() == null
				|| "".equals(workContacter.getName().trim()))
			return false;
		if (workContacter.getMobileNumber() == null
				|| "".equals(workContacter.getMobileNumber().trim()))
			return false;
		if (workContacter.getFromUser() == null)
			return false;
		if (workContacter.getBelongClass() == null
				|| "".equals(workContacter.getBelongClass().trim()))
			return false;
		return true;
	}

	@Override
	public PageInfo<WorkContacter> findWorkContacterForPage(Integer page,
			Integer rows, String sidx, String sord, Organization organization,
			String leavel, List leaveIds, String orgCode) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sortField", sidx);
		map.put("order", sord);
		map.put("belongClass", WorkContacter.WORKCONTACTER);
		map.put("leavel", leavel);
		map.put("orgLevel", organization.getOrgLevel().getId());
		map.put("leaveIds", ParametersConvertUtil.convertToListString(leaveIds));
		if (orgCode == null) {
			map.put("orginternalcode", null);
		} else {
			map.put("notSearchChinaData", WorkContacter.IS_SEARCH_CHINADATA);
			map.put("orginternalcode", orgCode);
		}

		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"workContacter.countWorkContacters", map);
		int pageCount = 0;
		if (rows != 0 && countNum > 0)
			pageCount = (countNum - 1) / rows + 1;
		page = page > pageCount ? pageCount : page;
		List<WorkContacter> list = getSqlMapClientTemplate().queryForList(
				"workContacter.findFullWorkContacters", map, (page - 1) * rows,
				rows);
		PageInfo<WorkContacter> pageInfo = new PageInfo<WorkContacter>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(page > pageCount ? pageCount : page);
		pageInfo.setPerPageSize(rows);
		return pageInfo;
	}

	@Override
	public List<WorkContacter> findWorkContacter() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("belongClass", WorkContacter.WORKCONTACTER);
		return getSqlMapClientTemplate().queryForList(
				"workContacter.findWorkContacters", map);
	}

	@Override
	public WorkContacter getSimpleWorkContacterByUserId(Long userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fromUserId", userId);
		map.put("belongClass", WorkContacter.WORKCONTACTER);
		return (WorkContacter) getSqlMapClientTemplate().queryForObject(
				"workContacter.findWorkContacters", map);
	}

	@Override
	public List<WorkContacter> findWorkContactersByNameAndPinyin(String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tagName", name);
		map.put("belongClass", WorkContacter.WORKCONTACTER);
		return getSqlMapClientTemplate().queryForList(
				"workContacter.findWorkContactersByNameAndPinyin", map);
	}

	@Override
	public List<WorkContacter> findWorkContactersByOrganizationId(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("organizationId", id);
		map.put("belongClass", WorkContacter.WORKCONTACTER);
		return getSqlMapClientTemplate().queryForList(
				"workContacter.findWorkContactersByOrganizationId", map);
	}

	@Override
	public WorkContacter getWorkContactersByName(String userName) {
		WorkContacter workContacter = null;
		try {
			workContacter = (WorkContacter) getSqlMapClientTemplate()
					.queryForObject("workContacter.getWorkContactersByName",
							userName);
		} catch (Exception e) {
			throw new OperationFailedException("监听器中删除用户出错", e);
		}
		return workContacter;
	}

	
	@Override
	public MyContacter addMyContacter(MyContacter myContact) {
		if (!validate(myContact))
			throw new BusinessValidationException();
		Long id = (Long) getSqlMapClientTemplate().insert("workContacter.addMyContacter", myContact);
		return this.getSimpleMyContacterById(id);
	}

	@Override
	public void deleteMyContacterById(Long id) {
		getSqlMapClientTemplate().delete("workContacter.deleteMyContacterById", id);
	}

	@Override
	public MyContacter getSimpleMyContacterById(Long id) {
		return (MyContacter) getSqlMapClientTemplate().queryForObject(
				"workContacter.getSimpleMyContacterById", id);
	}

	@Override
	public MyContacter updateMyContacter(MyContacter myContact) {
		if (!validate(myContact))
			throw new BusinessValidationException();
		getSqlMapClientTemplate().update("workContacter.updateMyContacter", myContact);
		return getSimpleMyContacterById(myContact.getId());
	}

	private boolean validate(MyContacter myContact) {
		if (myContact == null)
			return false;
		if (myContact.getName() == null || "".equals(myContact.getName().trim()))
			return false;
		if (myContact.getMobileNumber() == null || "".equals(myContact.getMobileNumber().trim()))
			return false;
		if (myContact.getOwner() == null)
			return false;
		if (myContact.getBelongClass() == null || "".equals(myContact.getBelongClass().trim()))
			return false;
		return true;
	}

	@Override
	public PageInfo<MyContacter> findMyContacterByOwnerIdForPage(Long ownerId, Integer page,
			Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ownerId", ownerId);
		map.put("sortField", sidx);
		map.put("order", sord);
		map.put("belongClass", MyContacter.MYCONTACTER);
		return exeQuery(page, rows, map);
	}

	@Override
	public PageInfo<MyContacter> searchMyContacter(MyContacter myContact, Integer page,
			Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", myContact.getName());
		map.put("mobileNumber", myContact.getMobileNumber());
		map.put("ownerId", myContact.getOwner().getId());
		map.put("sortField", sidx);
		map.put("order", sord);
		map.put("belongClass", MyContacter.MYCONTACTER);
		return exeQuery(page, rows, map);
	}

	private PageInfo<MyContacter> exeQuery(Integer page, Integer rows, Map<String, Object> map) {
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"workContacter.countMyContacters", map);
		int pageCount = 0;
		if (rows != 0 && countNum > 0)
			pageCount = (countNum - 1) / rows + 1;
		page = page > pageCount ? pageCount : page;
		List<MyContacter> list = getSqlMapClientTemplate().queryForList(
				"workContacter.findMyContacters", map, (page - 1) * rows, rows);
		PageInfo<MyContacter> pageInfo = new PageInfo<MyContacter>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(page > pageCount ? pageCount : page);
		pageInfo.setPerPageSize(rows);
		return pageInfo;
	}

	@Override
	public List<MyContacter> findMyContacterByOwnerId(Long ownerId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ownerId", ownerId);
		map.put("belongClass", MyContacter.MYCONTACTER);
		return getSqlMapClientTemplate().queryForList("workContacter.findMyContacters", map);
	}

	@Override
	public List<MyContacter> findMyContactersByNameAndPinyinAndOwnerId(String name, Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tagName", name);
		map.put("ownerId", id);
		map.put("belongClass", MyContacter.MYCONTACTER);
		return getSqlMapClientTemplate().queryForList(
				"workContacter.findMyContactersByNameAndPinyinAndOwnerId", map);
	}

	@Override
	public Integer getMyContacterByIdInMyGroup(Long id) {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("id", id);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"workContacter.getMyContacterByIdInMyGroup", id);
	}

}
