package com.tianque.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.vo.PageInfo;
import com.tianque.dao.MyGroupDao;
import com.tianque.domain.Contacter;
import com.tianque.domain.MyGroup;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;
import com.tianque.exception.base.BusinessValidationException;

@Repository("myGroupDao")
public class MyGroupDaoImpl extends AbstractBaseDao implements MyGroupDao {

	@Override
	public MyGroup addMyGroup(MyGroup myGroup) {
		if (!validate(myGroup)) {
			throw new BusinessValidationException();
		}
		Long id = (Long) getSqlMapClientTemplate().insert("myGroup.addMyGroup",
				myGroup);
		return getSimpleMyGroupById(id);
	}

	@Override
	public PageInfo<MyGroup> findMyGroupByOwnerId(Long id, Integer page,
			Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ownerId", id);
		map.put("belongClass", MyGroup.MYGROUP);
		map.put("sortField", sidx);
		map.put("order", sord);

		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"myGroup.countfindMyGroups", map);
		int pageCount = 0;
		if (rows != 0 && countNum > 0)
			pageCount = (countNum - 1) / rows + 1;
		page = page > pageCount ? pageCount : page;
		List<MyGroup> list = getSqlMapClientTemplate().queryForList(
				"myGroup.findMyGroups", map, (page - 1) * rows, rows);
		PageInfo<MyGroup> pageInfo = new PageInfo<MyGroup>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(page > pageCount ? pageCount : page);
		pageInfo.setPerPageSize(rows);
		return pageInfo;

		// return getSqlMapClientTemplate().queryForList("myGroup.findMyGroups",
		// map);
	}

	@Override
	public List<MyGroup> findMyGroupByOwnerId(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ownerId", id);
		map.put("belongClass", MyGroup.MYGROUP);
		map.put("sortField", "id");
		map.put("order", "asc");
		return getSqlMapClientTemplate().queryForList("myGroup.findMyGroups",
				map);
	}

	@Override
	public MyGroup getSimpleMyGroupById(Long id) {
		return (MyGroup) getSqlMapClientTemplate().queryForObject(
				"myGroup.getSimpleMyGroupById", id);
	}

	@Override
	public List<WorkContacter> findMyGroupHasWorkContactersByGroupId(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("groupId", id);
		map.put("belongClass", WorkContacter.WORKCONTACTER);
		return getSqlMapClientTemplate().queryForList(
				"myGroup.findMyGroupHasWorkContacters", map);
	}

	@Override
	public MyGroup updateMyGroup(MyGroup myGroup) {
		if (!validate(myGroup))
			throw new BusinessValidationException();
		getSqlMapClientTemplate().update("myGroup.updateMyGroup", myGroup);
		return this.getSimpleMyGroupById(myGroup.getId());
	}

	private boolean validate(MyGroup myGroup) {
		if (myGroup == null)
			return false;
		if (myGroup.getName() == null || "".equals(myGroup.getName().trim()))
			return false;
		if (myGroup.getOwner() == null || myGroup.getOwner().getId() == null)
			return false;
		if (myGroup.getBelongClass() == null
				|| "".equals(myGroup.getBelongClass().trim()))
			return false;
		return true;
	}

	@Override
	public void addMyGroupHasContacter(Long groupId, Long contacterId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("groupId", groupId);
		map.put("contacterId", contacterId);
		getSqlMapClientTemplate().insert("myGroup.addMyGroupHasContacter", map);
	}

	@Override
	public PageInfo<ContacterVo> findMyGroupHasContactersByGroupId(Long id,
			String belongClass, String name, Integer page, Integer rows,
			String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("groupId", id);
		map.put("belongClass", belongClass);
		map.put("name", name);
		map.put("sortField", sidx);
		map.put("order", sord);

		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"myGroup.countMyGroupHasContacters", map);
		int pageCount = 0;
		if (rows != 0 && countNum > 0)
			pageCount = (countNum - 1) / rows + 1;
		page = page > pageCount ? pageCount : page;
		List<ContacterVo> list = getSqlMapClientTemplate().queryForList(
				"myGroup.findMyGroupHasContacters", map, (page - 1) * rows,
				rows);
		PageInfo<ContacterVo> pageInfo = new PageInfo<ContacterVo>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(page > pageCount ? pageCount : page);
		pageInfo.setPerPageSize(rows);
		return pageInfo;
	}

	@Override
	public void deleteMyGroupHasAllContacterByGroupId(Long groupId) {
		getSqlMapClientTemplate().delete(
				"myGroup.deleteMyGroupHasAllContacter", groupId);
	}

	@Override
	public void deleteMyGroupHasSingleContacterByTwoId(Long groupId,
			Long contacterId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("groupId", groupId);
		map.put("contacterId", contacterId);
		getSqlMapClientTemplate().delete(
				"myGroup.deleteMyGroupHasSingleContacter", map);

	}

	@Override
	public List<MyGroup> findMyGroupsByNameAndPinyinAndOwnerId(String name,
			Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tagName", name);
		map.put("ownerId", id);
		map.put("belongClass", MyGroup.MYGROUP);
		return getSqlMapClientTemplate().queryForList(
				"myGroup.findMyGroupsByNameAndPinyinAndOwnerId", map);
	}

	@Override
	public List<ContacterVo> findMyGroupHasContactersByGroupId(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("groupId", id);
		return getSqlMapClientTemplate().queryForList(
				"myGroup.findMyGroupHasContacters", map);
	}

	public boolean isMyGroupById(Long id) {
		if (null != getSimpleMyGroupById(id))
			return true;
		return false;
	}

	@Override
	public Contacter findUserContacters(Long fromUserId) {
		return (Contacter) getSqlMapClientTemplate().queryForObject(
				"myGroup.findUserContacters", fromUserId);
	}

	@Override
	public PageInfo<MyGroup> findMyGroupByCondition(Long id,
			ContacterVo contacterVo, String belongClass, Integer page,
			Integer rows, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", contacterVo.getName());
		map.put("remark", contacterVo.getRemark());
		map.put("belongClass", belongClass);
		map.put("minNums", contacterVo.getMinContacterNums());
		map.put("maxNums", contacterVo.getMaxContacterNums());
		map.put("ownerId", contacterVo.getOwner().getId());
		map.put("groupId", id);
		map.put("sortField", sidx);
		map.put("order", sord);

		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"myGroup.countfindMyGroupHasContactersByCondition", map);
		int pageCount = 0;
		if (rows != 0 && countNum > 0)
			pageCount = (countNum - 1) / rows + 1;
		page = page > pageCount ? pageCount : page;
		List<MyGroup> list = getSqlMapClientTemplate().queryForList(
				"myGroup.findMyGroupHasContactersByCondition", map,
				(page - 1) * rows, rows);
		PageInfo<MyGroup> pageInfo = new PageInfo<MyGroup>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(page > pageCount ? pageCount : page);
		pageInfo.setPerPageSize(rows);
		return pageInfo;
	}

	@Override
	public void updateMemberNums(Long id, Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		MyGroup myGroup = (MyGroup) getSqlMapClientTemplate().queryForObject(
				"myGroup.findMyGroupMemberNums", map);
		if (myGroup == null) {
			myGroup = new MyGroup();
		}
		Integer member = myGroup.getMember();
		if (member == null) {
			member = 0;
		}
		if (status == 0) {
			member += 1;
		} else {
			member -= 1;
		}
		map.put("member", member);
		getSqlMapClientTemplate().update("myGroup.updateMemberNums", map);
	}

	@Override
	public List<MyGroup> findMygroupMemberByGroupId(Long groupId) {
		return getSqlMapClientTemplate().queryForList(
				"myGroup.findMygroupMemberByGroupId", groupId);
	}

	@Override
	public Integer getGroupMemberNum(Long id) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"myGroup.getGroupMemberNum", id);
	}

	@Override
	public void updateGroupMemberNumber(Long Id, Integer number) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", Id);
		map.put("member", number);
		getSqlMapClientTemplate().update("myGroup.updateMemberNums", map);
	}

	@Override
	public void deleteAllMyGroup(String[] ids) {
		deleteContacterAndGroup(ids);
		getSqlMapClientTemplate().update("myGroup.deleteAllMyGroup", ids);
	}

	@Override
	public void deleteContacterAndGroup(String[] ids) {
		getSqlMapClientTemplate()
				.update("myGroup.deleteContacterAndGroup", ids);
	}

}
