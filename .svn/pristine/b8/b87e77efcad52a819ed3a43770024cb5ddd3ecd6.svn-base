package com.tianque.workBench.publicNotice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.vo.PageInfo;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.publicNotice.domain.PublicNotice;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;
import com.tianque.workBench.publicNotice.dao.NoticeDao;

@Service("notice4ShowService")
@Transactional
public class Notice4ShowServiceImpl implements Notice4ShowService {

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<PublicNotice> findNoticeByOrgCode(String orgCode) {
		return noticeDao.findNoticeByOrgCode(orgCode);
	}

	@Override
	public PublicNotice findNoticeById(Long id) {
		return noticeDao.findNoticeById(id);
	}

	@Override
	public PublicNoticeAttachFiles getPublicNoticeAttachFilesById(Long id) {
		return noticeDao.getPublicNoticeAttachFilesById(id);
	}

	@Override
	public PageInfo findNoticeForHistoryByOrgCode(String orgInternalCode,
			Integer page, Integer rows, String sidx, String sord) {
		try {
			return noticeDao.getNoticeForHistoryByOrgCode(orgInternalCode,
					page, rows, sidx, sord);

		} catch (Exception e) {
			throw new ServiceValidationException("查找数据错误", e);
		}
	}

}
