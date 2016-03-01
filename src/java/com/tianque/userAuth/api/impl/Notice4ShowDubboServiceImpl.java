package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.PageInfo;
import com.tianque.publicNotice.domain.PublicNotice;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;
import com.tianque.userAuth.api.Notice4ShowDubboService;
import com.tianque.workBench.publicNotice.service.Notice4ShowService;

@Component
public class Notice4ShowDubboServiceImpl implements Notice4ShowDubboService {

	@Autowired
	private Notice4ShowService Notice4ShowService;

	@Override
	public List<PublicNotice> findNoticeByOrgCode(String orgCode) {
		return Notice4ShowService.findNoticeByOrgCode(orgCode);
	}

	@Override
	public PublicNotice findNoticeById(Long id) {
		return Notice4ShowService.findNoticeById(id);
	}

	@Override
	public PublicNoticeAttachFiles getPublicNoticeAttachFilesById(Long id) {
		return Notice4ShowService.getPublicNoticeAttachFilesById(id);
	}

	@Override
	public PageInfo findNoticeForHistoryByOrgCode(String orgInternalCode,
			Integer page, Integer rows, String sidx, String sord) {
		return Notice4ShowService.findNoticeForHistoryByOrgCode(
				orgInternalCode, page, rows, sidx, sord);
	}

}
