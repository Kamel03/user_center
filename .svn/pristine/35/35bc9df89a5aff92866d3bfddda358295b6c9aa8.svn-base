package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.vo.PublicNoticeVo;
import com.tianque.publicNotice.domain.PublicNotice;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;
import com.tianque.publicNotice.domain.PublicNoticeBenchVo;
import com.tianque.publicNotice.service.PublicNoticeService;
import com.tianque.userAuth.api.PublicNoticeDubboService;

@Component
public class PublicNoticeDubboServiceImpl implements PublicNoticeDubboService {

	@Autowired
	private PublicNoticeService publicNoticeService;

	@Override
	public PublicNotice addPublicNotice(PublicNotice publicNotice) {
		return publicNoticeService.addPublicNotice(publicNotice);
	}

	@Override
	public PageInfo<PublicNotice> findfindPublicNoticeForPageByOrgInternalCode(
			Long orgId, Integer publicNoticeLevel, Integer pageNum,
			Integer pageSize, String sidx, String sord) {
		return publicNoticeService
				.findfindPublicNoticeForPageByOrgInternalCode(orgId,
						publicNoticeLevel, pageNum, pageSize, sidx, sord);
	}

	@Override
	public PublicNotice getPublicNoticeById(Long id) {
		return publicNoticeService.getPublicNoticeById(id);
	}

	@Override
	public PublicNotice updatePublicNotice(PublicNotice publicNotice) {
		return publicNoticeService.updatePublicNotice(publicNotice);
	}

	@Override
	public void deletePublicNotice(Long id) {
		publicNoticeService.deletePublicNotice(id);
	}

	@Override
	public void deletePublicNoticeByIds(Long[] ids) {
		publicNoticeService.deletePublicNoticeByIds(ids);
	}

	@Override
	public PageInfo<PublicNotice> findByStartEndDateAndTitle(
			PublicNoticeVo publicNoticevo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		return publicNoticeService.findByStartEndDateAndTitle(publicNoticevo,
				pageNum, pageSize, sidx, sord);
	}

	@Override
	public PageInfo<PublicNotice> searchPublicNotice(
			PublicNoticeVo publicNoticeVo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		return publicNoticeService.searchPublicNotice(publicNoticeVo, pageNum,
				pageSize, sidx, sord);
	}

	@Override
	public List<PublicNoticeAttachFiles> addAttachFileByPublicNoticeId(
			Long publicNoticeId, String[] attachFiles) {
		return publicNoticeService.addAttachFileByPublicNoticeId(
				publicNoticeId, attachFiles);
	}

	@Override
	public PublicNoticeAttachFiles getPublicNoticeAttachFileById(Long id) {
		return publicNoticeService.getPublicNoticeAttachFileById(id);
	}

	@Override
	public void deletePublicNoticeAttachFileById(Long id) {
		publicNoticeService.deletePublicNoticeAttachFileById(id);
	}

	@Override
	public void deletePublicNoticeAttachFileByPublicNoticeId(
			Long[] publicNoticeIds) {
		publicNoticeService
				.deletePublicNoticeAttachFileByPublicNoticeId(publicNoticeIds);
	}

	@Override
	public List<PublicNoticeAttachFiles> attachFileList(Long publicNoticeId) {
		return publicNoticeService.attachFileList(publicNoticeId);
	}

	@Override
	public List<PublicNoticeAttachFiles> updatePublicNoticeAttachFile(
			Long publicNoticeId, String[] attachFiles) {
		return publicNoticeService.updatePublicNoticeAttachFile(publicNoticeId,
				attachFiles);
	}

	@Override
	public PageInfo getPublicNoticeReceiveList(PublicNoticeVo publicNoticeVo,
			Integer page, Integer rows, String sidx, String sord) {
		return publicNoticeService.getPublicNoticeReceiveList(publicNoticeVo,
				page, rows, sidx, sord);
	}

	@Override
	public void updatePublicNoticeIsRead(Long id) {
		publicNoticeService.updatePublicNoticeIsRead(id);
	}

	@Override
	public PublicNoticeBenchVo getPublicNoticeReceiveList(int num, String sidx,
			String sord) {
		return publicNoticeService.getPublicNoticeReceiveList(num, sidx, sord);
	}

}
