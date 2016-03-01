package com.tianque.workMemo.service;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.workMemo.domain.WorkMemo;

public interface WorkMemoService {

	public WorkMemo addWorkMemo(WorkMemo workMemo);

	public void deleteWorkMemoById(Long id);

	public List<String> getDaysByUserIdAndDate(Long userId, String year, String month);

	public List<WorkMemo> getMemoContentsByUserIdAndAddMemoDate(Long userId, String date);

	public List<WorkMemo> getMemoContentsByUserId(Long userId);
	
	/**
	 * 
	* @Title: getMemoContentsByUserIdForMobile 
	* @Description: TODO为手机端新增一个分页查询备忘录的方法
	* @param @param userId
	* @param @param pageNum
	* @param @param pageSize
	* @param @return    设定文件 
	* @return PageInfo    返回类型 
	* @author wanggz
	* @date 2014-7-3 下午05:23:39
	 */
	public PageInfo getMemoContentsByUserIdForMobile(Long userId,int pageNum, int pageSize);
}
