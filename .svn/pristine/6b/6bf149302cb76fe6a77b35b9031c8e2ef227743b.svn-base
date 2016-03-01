package com.tianque.core.base;

import java.util.List;

import com.tianque.core.vo.PageInfo;

public interface BaseDao<T extends BaseDomain, SearchVo extends BaseDomain> {

	/**
	 * 根据ID获取实体对象
	 * 
	 * @param id
	 *            记录ID
	 * @return 实体对象
	 */
	public T get(Long id);

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 *            对象
	 * @return ID
	 */
	public T add(T entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 *            对象
	 */
	public T update(T entity);

	/**
	 * 根据ID删除实体对象
	 * 
	 * @param id
	 *            记录ID
	 */
	public void delete(Long id);

	/**
	 * 根据ID数组删除实体对象
	 * 
	 * @param ids
	 *            ID数组
	 */
	public void delete(Long[] ids);

	/**
	 * 根据SearchVo进行查询(提供分页、查找、排序功能)
	 * 
	 */
	public PageInfo<T> findPagerBySearchVo(SearchVo searchVo, Integer pageNum,
			Integer pageSize, String sidx, String sord);

	/**
	 * 根据SearchVo进行查询,count的结果会存入缓存，默认2小时更新一次(提供分页、查找、排序功能)
	 * 
	 */
	public PageInfo<T> findPagerUsingCacheBySearchVo(Long orgId,
			SearchVo searchVo, Integer pageNum, Integer pageSize, String sidx,
			String sord, String moduleName);

	/**
	 * 根据object进行查询,count的结果会存入缓存，默认2小时更新一次(提供分页、查找、排序功能)
	 * 
	 */
	public PageInfo<T> findPagerUsingCacheBySearchVo(Long orgId, Object object,
			Integer pageNum, Integer pageSize, String statement,
			String moduleName);

	/**
	 * 根据object进行查询
	 * 
	 */
	public List<T> findList(Object object, Integer pageNum, Integer pageSize,
			String statement);

	/**
	 * 根据object进行统计
	 * 
	 */
	public Integer countObject(Object object, String statement);

	/**
	 * 根据SearchVo进行查询(提供分页、查找、排序功能)
	 * 
	 */
	public List<T> findListBySearchVo(SearchVo searchVo, Integer pageNum,
			Integer pageSize, String sidx, String sord);

	/**
	 * 根据SearchVo进行统计
	 * 
	 */
	public Integer countBySearchVo(SearchVo searchVo);

	/**
	 * 批量插入数据
	 * 
	 * @param datas
	 */
	public List<Long> batchInsertDate(List<T> datas);

	/**
	 * 批量更新数据
	 * 
	 * @param datas
	 */
	public void batchUpdateDate(List<T> datas);
}
