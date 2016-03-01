package com.tianque.service;

import java.util.List;
import java.util.Map;

import com.tianque.domain.IssueType;
import com.tianque.domain.IssueTypeDomain;
import com.tianque.domain.vo.EmphasesVo;
import com.tianque.mobile.vo.MobileIssueType;

public interface IssueTypeService {
	public List<MobileIssueType> findMobileEnabledIssueTypesByParentName(
			String parentName);

	/*
	 * 根据传入父类名称获得服务办事类别
	 */
	public List<IssueType> findIssueTypesByDomainId(Long domainId);

	public List<IssueType> findIssueTypesByParentName(String parentName);

	public List<IssueType> findEnabledIssueTypesByParentName(Long orgId,
			String parentName);

	/**
	 * 添加事件类型
	 * 
	 * @param issueType
	 *            事件类型
	 * @return
	 */
	public IssueType addIssueType(IssueType issueType);

	public Long getIssueTypeIdByIssueId(Long issueId);

	public IssueType getIssueTypeByIssueId(Long issueId);

	public IssueType getIssueTypeById(Long domainId, Long id);

	public IssueType updateIssueType(IssueType issueType);

	public boolean deleteIssueTypeById(IssueType issueType);

	public void moveIssueTypeToFirst(Long domainId, Long id, int indexId);

	public void moveIssueTypeToEnd(Long domainId, Long id, int indexId);

	public void moveIssueTypeToPreviousOrNext(Long domainId, Long id,
			int indexId, Long referIssueTypeId);

	public IssueType getIssueTypeByIssueTypeName(String issueTypeName,
			Long domainId);

	public void addRelatePlaces(Long issueId, String placeType, Long placeId,
			String placename);

	public void deleteRelatePlaces(Long issueId);

	public void addRelatePersons(Long issueId, String personType,
			Long personId, String personName);

	public void deleteRelatePersons(Long issueId);

	public List<EmphasesVo> findRelatePersonByName(Long issueId);

	public List<EmphasesVo> findRelatePlacesByName(Long issueId);

	public IssueType getIssueTypeByIssueTypeNameAndOrgId(String issueTypeName,
			Long domainId, Long orgId);

	public List<IssueType> findIssueTypesByDomainIdAndOrgId(Long domainId,
			Long orgId);

	public void updateIsEnabledById(Long id, boolean enabled);

	public List<IssueType> findAllIssueTypesByParentName(Long orgId,
			String typeDomainName);

	List<IssueTypeDomain> findIssueTypeDomainsByModule(String module);

	IssueTypeDomain getIssueTypeDomainById(Long id);

	IssueTypeDomain getIssueTypeDoaminByDomainName(String domainName);

	/** 重点人员基础表进行层级转移时改变事件相关的关联关系 */
	public void updateRelatePersonsForOrgChange(Map map);

	/** 重点场所基础表进行层级转移时改变事件相关的关联关系 */
	public void updateRelatePlacesForOrgChange(Map map);

	/** 删除业务人员或者场所时保存删除对象的orgId和身份证（场所名） */
	public void setOrgIdAndCardNoOrNameForPerson(Long orgId,
			String cardNoOrName, String personType, Long personId);

	public void setOrgIdAndCardNoOrNameForPlace(Long orgId,
			String cardNoOrName, String placeType, Long placeId);

}
