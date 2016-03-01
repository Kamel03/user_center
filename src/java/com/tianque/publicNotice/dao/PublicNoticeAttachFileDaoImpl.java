package com.tianque.publicNotice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;

@Repository("publicNoticeAttachFileDao")
public class PublicNoticeAttachFileDaoImpl extends AbstractBaseDao implements
		PublicNoticeAttachFileDao {

	@Override
	public PublicNoticeAttachFiles addPublicNoticeAttachFile(
			PublicNoticeAttachFiles publicNoticeAttachFiles) {
		Long id = (Long) getSqlMapClientTemplate().insert(
				"publicNoticeAttachFiles.addPublicNoticeAttachFile", publicNoticeAttachFiles);
		return getPublicNoticeAttachFileById(id);
	}

	@Override
	public PublicNoticeAttachFiles getPublicNoticeAttachFileById(Long id) {
		return (PublicNoticeAttachFiles) getSqlMapClientTemplate().queryForObject(
				"publicNoticeAttachFiles.getNoticeFilesById", id);
	}

	@Override
	public List<PublicNoticeAttachFiles> listAttachFileByPublicNoticeId(Long publicNoticeId) {
		return getSqlMapClientTemplate().queryForList(
				"publicNoticeAttachFiles.getNoticeFilesByNoticeId", publicNoticeId);
	}

	@Override
	public void deletePublicNoticeAttachFileById(Long id) {
		getSqlMapClientTemplate().delete("publicNoticeAttachFiles.deleteAttachFileById", id);
	}

	@Override
	public void deleteAttachFileByPublicNoticeId(Long publicNoticeId) {
		getSqlMapClientTemplate().delete(
				"publicNoticeAttachFiles.deleteAttachFileByPublicNoticeId", publicNoticeId);
	}

}
