package com.tianque.workBench.publicNotice.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.vo.PageInfo;
import com.tianque.peopleLog.domain.PeopleLog;
import com.tianque.publicNotice.domain.PublicNotice;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;

@Repository("noticeDao")
public class NoticeDaoImpl extends AbstractBaseDao implements NoticeDao {

	@Override
	public List<PublicNotice> findNoticeByOrgCode(String orgCode) {
		List<PublicNotice> notices = getSqlMapClientTemplate().queryForList(
				"publicNotice.getPublicNoticeByOrgCode", orgCode);
		return notices;
	}

	@Override
	public PublicNotice findNoticeById(Long id) {
		PublicNotice publicNotice = (PublicNotice) getSqlMapClientTemplate().queryForObject(
				"publicNotice.getPublicNoticeById", id);
		Long noticeId = publicNotice.getId();
		List<PublicNoticeAttachFiles> noticeFiles = getSqlMapClientTemplate().queryForList(
				"publicNoticeAttachFiles.getNoticeFilesByNoticeId", noticeId);
		if (noticeFiles.size() != 0) {
			publicNotice.setNoticeFiles(noticeFiles);
		} else {
			publicNotice.setNoticeFiles(null);
		}
		return publicNotice;
	}

	@Override
	public PublicNoticeAttachFiles getPublicNoticeAttachFilesById(Long id) {
		PublicNoticeAttachFiles noticeFile = (PublicNoticeAttachFiles) getSqlMapClientTemplate()
				.queryForObject("publicNoticeAttachFiles.getNoticeFilesById", id);
		return noticeFile;
	}

	@Override
	public PageInfo getNoticeForHistoryByOrgCode(String orgInternalCode, Integer pageNum,
			Integer pageSize, String sortField, String sord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orgInternalCode", orgInternalCode);
		map.put("sortField", sortField);
		map.put("order", sord);
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"publicNotice.countNoticeForHistoryByOrgCode", map);
		map.put("countNum", countNum);
		List<PeopleLog> list = getSqlMapClientTemplate().queryForList(
				"publicNotice.getNoticeForHistoryByOrgCode", map, (pageNum - 1) * pageSize,
				pageSize);
		return createPageInfo(pageNum, pageSize, countNum, list);
	}

	private PageInfo<PeopleLog> createPageInfo(int pageNum, int pageSize, Integer countNum,
			List list) {
		PageInfo<PeopleLog> pageInfo = new PageInfo<PeopleLog>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}
}
