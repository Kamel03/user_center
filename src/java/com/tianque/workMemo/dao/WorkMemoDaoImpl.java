package com.tianque.workMemo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.vo.PageInfo;
import com.tianque.workMemo.domain.WorkMemo;

@Repository("workMemoDao")
public class WorkMemoDaoImpl extends AbstractBaseDao implements WorkMemoDao {

	@Override
	public WorkMemo addWorkMemo(WorkMemo workMemo) {
		Long id = (Long) getSqlMapClientTemplate().insert("workMemo.addWorkMemo", workMemo);
		return getWorkMemoById(id);
	}

	public WorkMemo getWorkMemoById(Long id) {
		return (WorkMemo) getSqlMapClientTemplate().queryForObject("workMemo.getWorkMemoById", id);
	}

	@Override
	public void deleteWorkMemoById(Long id) {
		getSqlMapClientTemplate().delete("workMemo.deleteWorkMemoById", id);
	}

	@Override
	public void deleteAllWorkMemoByUserId(Long userId) {
		getSqlMapClientTemplate().delete("workMemo.deleteWorkMemoByUserId", userId);
	}

	@Override
	public List<WorkMemo> getMemoContentsByUserIdAndAddMemoDate(Long userId, String date) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("date", date);
		return getSqlMapClientTemplate().queryForList(
				"workMemo.getMemoContentsByUserIdAndAddMemoDate", map);
	}

	@Override
	public List<WorkMemo> getMemoContentsByUserId(Long userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		return getSqlMapClientTemplate().queryForList("workMemo.getMemoContentsByUserId", map);
	}

	/**
	 * @Title: getMemoContentsByUserIdForMobile
	 * @Description: TODO为手机端新增分页查询备忘录方法
	 * @param @param userId
	 * @param @param pageNum
	 * @param @param pageSize
	 * @param @return 设定文件
	 * @return PageInfo 返回类型
	 * @author wanggz
	 * @date 2014-7-3 下午05:25:12
	 */
	@Override
	public PageInfo getMemoContentsByUserIdForMobile(Long userId, int pageNum, int pageSize) {
		PageInfo pageInfo = new PageInfo();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		List list = getSqlMapClientTemplate().queryForList("workMemo.getMemoContentsByUserId", map,
				(pageNum - 1) * pageSize, pageSize);
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"workMemo.countMemoContentsByUserId", map);
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}

	@Override
	public List<String> getDaysByUserIdAndDate(Long userId, String year, String month) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("year", year);
		map.put("month", month);
		return getSqlMapClientTemplate().queryForList("workMemo.getDaysByUserIdAndDate", map);
	}

}
