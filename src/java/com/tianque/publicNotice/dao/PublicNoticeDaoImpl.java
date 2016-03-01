package com.tianque.publicNotice.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.vo.PublicNoticeVo;
import com.tianque.publicNotice.domain.PublicNotice;

@Repository("publicNoticeDao")
public class PublicNoticeDaoImpl extends AbstractBaseDao implements
		PublicNoticeDao {

	public boolean isStrotFieldAvaliable(String sortField) {
		return sortField != null && !"".equals(sortField.trim());
	}

	public PageInfo<PublicNotice> createPageInfo(int pageNum, int pageSize,
			Integer countNum, List list) {
		PageInfo<PublicNotice> pageInfo = new PageInfo<PublicNotice>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}

	@Override
	public PublicNotice addPublicNotice(PublicNotice publicNotice) {
		Long id = (Long) getSqlMapClientTemplate().insert(
				"publicNotice.addPublicNotice", publicNotice);
		return getPublicNoticeById(id);
	}

	@Override
	public PublicNotice getPublicNoticeById(Long id) {
		return (PublicNotice) getSqlMapClientTemplate().queryForObject(
				"publicNotice.getPublicNoticeById", id);
	}

	@Override
	public PageInfo<PublicNotice> findPublicNoticeForPageByOrgInternalCode(
			String orgInternalCode, Integer publicNoticeLevel, Integer pageNum,
			Integer pageSize, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgInternalCode", orgInternalCode);
		map.put("publicNoticeLevel", publicNoticeLevel);
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"publicNotice.countPublicNotices", map);
		if (isStrotFieldAvaliable(sidx)) {
			map.put("sortField", sidx);
		}
		map.put("order", sord);
		List<PublicNotice> publicNoticeList = getSqlMapClientTemplate()
				.queryForList("publicNotice.findPublicNotices", map,
						(pageNum - 1) * pageSize, pageSize);
		return createPageInfo(pageNum, pageSize, countNum, publicNoticeList);
	}

	@Override
	public PageInfo<PublicNotice> findByStartEndDateAndTitle(
			PublicNoticeVo publicNoticevo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgInternalCode", publicNoticevo.getOrganizationCode());
		map.put("publicNoticeLevel", publicNoticevo.getPublicNoticeLevel());
		map.put("startDate", publicNoticevo.getStartDate());
		map.put("endDate", publicNoticevo.getEndDate());
		map.put("editorTitle", publicNoticevo.getEditorTitle());
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"publicNotice.countPublicNotices", map);
		if (isStrotFieldAvaliable(sidx)) {
			map.put("sortField", sidx);
		}
		map.put("order", sord);
		List<PublicNotice> publicNoticeList = getSqlMapClientTemplate()
				.queryForList("publicNotice.findPublicNotices", map,
						(pageNum - 1) * pageSize, pageSize);
		return createPageInfo(pageNum, pageSize, countNum, publicNoticeList);

	}

	@Override
	public PublicNotice updatePublicNotice(PublicNotice publicNotice) {
		getSqlMapClientTemplate().update("publicNotice.updatePublicNotice",
				publicNotice);
		return getPublicNoticeById(publicNotice.getId());
	}

	@Override
	public void deletePublicNoticeById(Long id) {
		getSqlMapClientTemplate().delete("publicNotice.deletePublicNotice", id);
	}

	@Override
	public void deletePublicNoticeByIds(Long[] ids) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idList", ids);
		getSqlMapClientTemplate().delete(
				"publicNotice.deletePublicNoticeByIds", map);
	}

	/* 查询的方法 */
	@Override
	public PageInfo<PublicNotice> searchPublicNotice(
			PublicNoticeVo publicNoticeVo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgInternalCode", publicNoticeVo.getOrganizationCode());
		map.put("editorTitle", publicNoticeVo.getEditorTitle());
		map.put("noticeEditor", publicNoticeVo.getNoticeEditor());
		map.put("editstartDate", publicNoticeVo.getEditstartDate());
		map.put("editEndDate", publicNoticeVo.getEditEndDate());
		map.put("validoverdueStartDate",
				publicNoticeVo.getValidoverdueStartDate());
		map.put("validoverdueEndDate", publicNoticeVo.getValidoverdueEndDate());
		map.put("isInValidity", publicNoticeVo.getIsInValidity());
		map.put("isHaveValidity", publicNoticeVo.getIsHaveValidity());
		map.put("order", sord);
		map.put("sortField", sidx);
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"publicNotice.countInquirePublicNotice", map);
		int pageCount = 0;
		if ((countNum % pageSize) == 0) {
			pageCount = countNum / pageSize;
		} else {
			pageCount = countNum / pageSize + 1;
		}
		pageNum = pageNum > pageCount ? pageCount : pageNum;
		List<PublicNotice> list = (List<PublicNotice>) getSqlMapClientTemplate()
				.queryForList("publicNotice.findInquirePublicNotice", map,
						(pageNum - 1) * pageSize, pageSize);

		return createPageInfo(pageNum, pageSize, countNum, list);

	}

	@Override
	public void savePublicNoticeOrg(Long publicNoticeId, String str) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("noticeId", publicNoticeId);
		map.put("orgId", str);
		getSqlMapClientTemplate().insert("publicNotice.savePublicNoticeOrg",
				map);
	}

	@Override
	public void savePublicNoticeRole(Long publicNoticeId, String str) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("noticeId", publicNoticeId);
		map.put("roleId", str);
		getSqlMapClientTemplate().insert("publicNotice.savePublicNoticeRole",
				map);
	}

	@Override
	public void delPublicNoticeOrg(Long id) {
		getSqlMapClientTemplate().delete("publicNotice.delPublicNoticeOrg", id);
	}

	@Override
	public void delPublicNoticeOrgByIds(Long[] ids) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idList", ids);
		getSqlMapClientTemplate().delete(
				"publicNotice.delPublicNoticeOrgByIds", map);
	}

	@Override
	public void delPublicNoticeRole(Long id) {
		getSqlMapClientTemplate()
				.delete("publicNotice.delPublicNoticeRole", id);
	}

	@Override
	public void delPublicNoticeRoleByIds(Long[] ids) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idList", ids);
		getSqlMapClientTemplate().delete(
				"publicNotice.delPublicNoticeRoleByIds", map);
	}

	@Override
	public List<String> queryPublicNoticeOrgById(Long id) {
		return getSqlMapClientTemplate().queryForList(
				"publicNotice.queryPublicNoticeOrgById", id);
	}

	@Override
	public List<Long> queryPublicNoticeRoleById(Long id) {
		return getSqlMapClientTemplate().queryForList(
				"publicNotice.queryPublicNoticeRoleById", id);
	}

	@Override
	public void updatePublicNoticeIsRead(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("noticeId", id);
		map.put("userId", ThreadVariable.getUser().getId());
		Integer isRead = (Integer) getSqlMapClientTemplate().queryForObject(
				"publicNotice.checkIsRead", map);
		if (isRead == 0) {
			getSqlMapClientTemplate().insert(
					"publicNotice.insertPublicNoticeIsRead", map);
		} else {
			getSqlMapClientTemplate().insert(
					"publicNotice.updatePublicNoticeIsRead", map);
		}
	}

	@Override
	public PageInfo getPublicNoticeReceiveList(String orgInternalCode,
			PublicNoticeVo publicNoticeVo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		publicNoticeVo = publicNoticeVo == null ? new PublicNoticeVo()
				: publicNoticeVo;
		map.put("editorTitle", publicNoticeVo.getEditorTitle());
		map.put("startDate", publicNoticeVo.getEditstartDate());
		map.put("endDate", publicNoticeVo.getEditEndDate());
		map.put("isInValidity", publicNoticeVo.getIsInValidity());
		map.put("userId", ThreadVariable.getUser().getId());
		map.put("noticeEditor", publicNoticeVo.getNoticeEditor());
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"publicNotice.queryPublicNoticeReceiveForListCount", map);
		if (isStrotFieldAvaliable(sidx)) {
			map.put("sortField", sidx);
		}
		map.put("order", sord);
		List<PublicNotice> publicNoticeList = getSqlMapClientTemplate()
				.queryForList("publicNotice.queryPublicNoticeReceiveForList",
						map, (pageNum - 1) * pageSize, pageSize);
		return createPageInfo(pageNum, pageSize, countNum, publicNoticeList);
	}

	@Override
	public void delPublicNoticeUser(Long id) {
		getSqlMapClientTemplate()
				.delete("publicNotice.delPublicNoticeUser", id);
	}

	@Override
	public void delPublicNoticeUserByIds(Long[] ids) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idList", ids);
		getSqlMapClientTemplate().delete(
				"publicNotice.delPublicNoticeUserByIds", map);
	}
	@Override
	public PublicNotice getPublicNoticeLatest() {
		return (PublicNotice) getSqlMapClientTemplate().queryForObject(
				"publicNotice.getPublicNoticeLatest",
				ThreadVariable.getUser().getId());
	}

	@Override
	public List<PublicNotice> queryPublicNoticeUnReadForList(
			Long latestPublicNoticeId, int num, String sidx, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", ThreadVariable.getUser().getId());
		if (latestPublicNoticeId != null) {
			map.put("latestPublicNoticeId", latestPublicNoticeId);
		}
		map.put("num", num);
		if (isStrotFieldAvaliable(sidx)) {
			map.put("sortField", sidx);
		}
		map.put("order", sord);
		return getSqlMapClientTemplate().queryForList(
				"publicNotice.queryPublicNoticeUnReadForList", map);
	}

}
