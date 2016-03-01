package com.tianque.dao;

import java.util.List;
import java.util.Map;

import com.tianque.domain.IssueType;
import com.tianque.domain.vo.EmphasesVo;
import com.tianque.mobile.vo.MobileIssueType;

public interface IssueTypeDao {
	public List<MobileIssueType> findMobileEnabledIssueTypesByDomainIdAndOrgId(
			Long domainId);

	/*
	 * 根据父类名称获得服务办事类别
	 */
	public List<IssueType> findIssueTypesByDomainId(Long domainId);

	/**
	 * 新增事件类型
	 * 
	 * @param issueType
	 *            事件类型
	 * @return
	 */
	public IssueType addIssueType(IssueType issueType);

	public IssueType getIssueTypeById(Long domainId, Long id);

	public IssueType updateIssueType(IssueType issueType);

	public void deleteIssueTypeById(Long domainId, Long id);

	public void moveIssueTypeToEnd(Long domainId, Long id, int indexId);

	public void moveIssueTypeToFirst(Long domainId, Long id, int indexId);

	public void moveIssueTypeToPreviousOrNext(Long domainId, Long id,
			int indexId, Long referIssueTypeId);

	public IssueType getIssueTypeByIssueTypeName(String issueTypeName,
			Long domainId);

	public Integer getIndexIdByDomainId(Long domainId);

	public void addRelatePlaces(Long issueId, String placeType, Long placeId,
			String placename);

	public void deleteRelatePlaces(Long issueId);

	public void addRelatePersons(Long issueId, String personType,
			Long personId, String personName);

	public void deleteRelatePersons(Long issueId);

	public List<EmphasesVo> findRelatePersonByName(Long issueId);

	public List<EmphasesVo> findRelatePlacesByName(Long issueId);

	public Integer getIsRelatePlaces(Long RelatePlaceId, String RelatePlaceType);

	public Integer getIsRelatePersons(Long RelatePersonsId,
			String RelatePersonsType);

	public IssueType getIssueTypeByIssueTypeName(String issueTypeName,
			Long domainId, Long orgId);

	public List<IssueType> findIssueTypesByDomainIdAndOrgId(Long domainId,
			Long orgId);

	public void updateIsEnabledById(Long id, boolean enabled);

	public List<IssueType> findEnabledIssueTypesByDomainIdAndOrgId(
			Long domainId, Long orgId);

	public List<IssueType> findAllIssueTypesByDomainIdAndOrgid(Long orgId,
			Long domainId);

	public List<Long> getIsRelatePersonIds(List<Long> personsIds,
			String personsType);

	public List<Long> getIsRelatePlaceIds(List<Long> RelatePlaceId,
			String RelatePlaceType);

	/** 重点人员基础表进行层级转移时改变事件相关的关联关系 */
	public void updateRelatePersonsForOrgChange(Map map);

	/** 重点场所基础表进行层级转移时改变事件相关的关联关系 */
	public void updateRelatePlacesForOrgChange(Map map);

	/** 删除业务人员或者场所时保存删除对象的orgId和身份证（场所名） */
	public void setOrgIdAndCardNoOrNameForPerson(Map map);

	public void setOrgIdAndCardNoOrNameForPlace(Map map);

	public Long getIssueTypeIdByIssueId(Long issueId);

	public IssueType getIssueTypeByIssueId(Long issueId);

	public IssueType getIssueTypeById(Long id);
}
