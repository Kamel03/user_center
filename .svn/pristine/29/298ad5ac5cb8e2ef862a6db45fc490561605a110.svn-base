package com.tianque.sysadmin.dao;

import java.util.List;
import java.util.Map;

import com.tianque.domain.PropertyDict;
import com.tianque.mobile.vo.MobilePropertyDict;

/**
 * 系统属性元信息数据库操作接口
 */
public interface PropertyDictDao {

	/**
	 * @description 根据ID查询系统属性字典.
	 * @param id
	 * @return.
	 */
	public List<PropertyDict> findPropertyDictByIds(Long[] id);

	/**
	 * 新增系统属性字典
	 * 
	 * @param propertyDict
	 *            系统属性字典对象
	 * @return 系统属性字典对象
	 */
	public PropertyDict addPropertyDict(PropertyDict propertyDict);

	/**
	 * 修改系统属性字典
	 * 
	 * @param propertyDict
	 *            系统属性字典对象
	 * @return 系统属性字典对象
	 */
	public PropertyDict updatePropertyDict(PropertyDict propertyDict);

	/**
	 * 根据域属性ID获取系统属性字典列表
	 * 
	 * @param Id
	 *            域属性ID
	 * @return
	 */
	public List<PropertyDict> findPropertyDictByPropertyDomainId(Long domainId);

	public List<PropertyDict> findPropertyDictByPropertyDomainId(Long domainId,
			String sidx, String sord);

	/**
	 * 根据系统属性字典ID查找最大显示序号
	 * 
	 * @param id
	 *            系统属性字典ID
	 * @return
	 */
	public Integer getMaxDisplaySeqById(Long id);

	/**
	 * 根据系统属性字典ID查询系统属性字典
	 * 
	 * @param id
	 *            系统属性字典ID
	 */
	public PropertyDict getPropertyDictByDomainIdAndDictId(Long domainId,
			Long dictid);

	/**
	 * 修改系统属性字典显顺序
	 * 
	 * @param id
	 *            系统属性字典ID
	 * @param displaySeq
	 *            系统属性字典显示顺序
	 */
	public void updatePropertyDictDisplaySeq(Long id, int displaySeq);

	/**
	 * 系统属性
	 * 
	 * @param id
	 * @param displaySeq
	 * @param propertyDomainId
	 */
	public void updateProSeqBetweenReferPro(int fromDisplaySeq,
			int toDisplaySeq, Long propertyDomainId, Long index);

	public List<PropertyDict> findPropertyDictByDisplayNameAndDomainPropertyId(
			Long propertyDomainId, String displayName, Long id);

	public List<PropertyDict> findPropertyDictByDomainIdAndInternalId(
			Long propertyDomainId, Integer internalId);

	/**
	 * 删除系统字典类型
	 * 
	 * @param id
	 *            字典类型id
	 * @return int
	 */
	public int deletePropertyDictById(Long id);

	public List<PropertyDict> findPropertyDictByDomainIdAndInternalIds(
			Long propertyDomainId, int[] internalIds);

	public PropertyDict findPropertyDictByDomainIdAndDictDisplayName(
			Long propertyDomainId, String dictDisplayName);

	public PropertyDict getPropertyDictById(Long id);

	public PropertyDict getPropertyDictByOrgId(Long id);

	public List<MobilePropertyDict> findMobilePropertyDictByPropertyDomainId(
			Long propertyDomainId);

	public PropertyDict getPropertyDictByDomainName(String domainName);

	public PropertyDict getPropertyDictName(Long id);
	
	public List<PropertyDict> findPropertyDictByDomainNameAndDisplayseqs(Long domainId, int[] displayseqs);
	
	public List<PropertyDict> getPropertyDictByPinYinAndDomainid(
			Map<String, Object> map);

	public List<PropertyDict> getPropertyDictByDomainidAndInternalid(
			Map<String, Object> map);

	public List<PropertyDict> findFullPropertyDictByDomainId(
			Map<String, Object> map);
}
