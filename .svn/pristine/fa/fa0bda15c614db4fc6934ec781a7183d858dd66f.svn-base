package com.tianque.dao;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Contacter;
import com.tianque.domain.MyGroup;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;

public interface MyGroupDao {

	/***
	 * 新增群组
	 * 
	 * @param myGroup
	 *            群组
	 * @return
	 */
	public MyGroup addMyGroup(MyGroup myGroup);

	public MyGroup updateMyGroup(MyGroup myGroup);

	public boolean isMyGroupById(Long id);

	public MyGroup getSimpleMyGroupById(Long id);

	public PageInfo<MyGroup> findMyGroupByOwnerId(Long id, Integer page,
			Integer rows, String sidx, String sord);

	public List<MyGroup> findMyGroupByOwnerId(Long id);

	public void addMyGroupHasContacter(Long groupId, Long contacterId);

	public PageInfo<ContacterVo> findMyGroupHasContactersByGroupId(Long id,
			String belongClass, String name, Integer page, Integer rows,
			String sidx, String sord);

	public List<ContacterVo> findMyGroupHasContactersByGroupId(Long id);

	public List<WorkContacter> findMyGroupHasWorkContactersByGroupId(Long id);

	public void deleteMyGroupHasAllContacterByGroupId(Long groupId);

	public void deleteMyGroupHasSingleContacterByTwoId(Long groupId,
			Long contacterId);

	public List<MyGroup> findMyGroupsByNameAndPinyinAndOwnerId(String name,
			Long id);

	/** 高级查询 */
	public PageInfo<MyGroup> findMyGroupByCondition(Long id,
			ContacterVo contacterVo, String belongClass, Integer page,
			Integer rows, String sidx, String sord);

	/** 修改群组成员数量 */
	public void updateMemberNums(Long id, Integer status);

	/** 查询我的群组下所有的联系人信息 */
	public List<MyGroup> findMygroupMemberByGroupId(Long groupId);

	/***
	 * 获取群组的成员数量
	 */
	public Integer getGroupMemberNum(Long id);

	/***
	 * 修改群组成员数量
	 */
	public void updateGroupMemberNumber(Long Id, Integer number);

	/***
	 * 批量删除群组信息
	 */
	public void deleteAllMyGroup(String[] ids);

	/***
	 * 批量删除联系人与群组的关系
	 */
	public void deleteContacterAndGroup(String[] ids);

	public Contacter findUserContacters(Long fromUserId);

}
