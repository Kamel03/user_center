package com.tianque.workBench.publicNotice.dao;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.publicNotice.domain.PublicNotice;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;

public interface NoticeDao {

	/**
	 * 根据orgId和overDueDate查找通知通告
	 * 
	 * @param orgCode
	 * @return
	 */
	public List<PublicNotice> findNoticeByOrgCode(String orgCode);

	/**
	 * 根据id查找通知通告
	 * 
	 * @param id
	 * @return PublicNotice
	 */
	public PublicNotice findNoticeById(Long id);

	public PublicNoticeAttachFiles getPublicNoticeAttachFilesById(Long id);

	public PageInfo getNoticeForHistoryByOrgCode(String orgInternalCode, Integer page,
			Integer rows, String sidx, String sord);

}
