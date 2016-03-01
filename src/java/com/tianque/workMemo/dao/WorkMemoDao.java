package com.tianque.workMemo.dao;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.workMemo.domain.WorkMemo;

public interface WorkMemoDao {
	/**
	 * 新增工作备忘录
	 * 
	 * @param workMemo
	 * @return
	 */
	public WorkMemo addWorkMemo(WorkMemo workMemo);

	/**
	 * 根据Id得到工作备忘录
	 * 
	 * @param id
	 * @return
	 */
	public WorkMemo getWorkMemoById(Long id);

	/**
	 * 根据用户Id和新增时间得到忘录内容
	 * 
	 * @param userid
	 * @param addMemoDate
	 * @return
	 */
	public List<WorkMemo> getMemoContentsByUserIdAndAddMemoDate(Long userId, String date);

	/**
	 * 根据用户Id得到忘录内容
	 * 
	 * @param userid
	 * @param addMemoDate
	 * @return
	 */
	public List<WorkMemo> getMemoContentsByUserId(Long userId);
	
	/**
	 * 
	* @Title: getMemoContentsByUserIdForMobile 
	* @Description: TODO为手机端新增分页查询备忘录方法
	* @param @param userId
	* @param @param pageNum
	* @param @param pageSize
	* @param @return    设定文件 
	* @return PageInfo    返回类型 
	* @author wanggz
	* @date 2014-7-3 下午05:25:12
	 */
	public PageInfo getMemoContentsByUserIdForMobile(Long userId,int pageNum, int pageSize);

	/**
	 * 根据Id删除工作备忘录
	 * 
	 * @param id
	 * @param addMemoDate
	 */
	public void deleteWorkMemoById(Long id);

	/**
	 * 根据用户Id删除该用户的所用备忘录
	 * 
	 * @param userId
	 */
	public void deleteAllWorkMemoByUserId(Long userId);

	/**
	 * 根据用户Id和所在年月得到有备忘录的日期
	 * 
	 * @param userId
	 * @param date
	 * @return
	 */
	public List<String> getDaysByUserIdAndDate(Long userId, String year, String month);
}
