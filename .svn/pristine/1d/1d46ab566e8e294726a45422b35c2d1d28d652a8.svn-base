package com.tianque.publicNotice.dao;

import java.util.List;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.vo.PublicNoticeVo;
import com.tianque.publicNotice.domain.PublicNotice;

public interface PublicNoticeDao {
	public PublicNotice addPublicNotice(PublicNotice publicNotice);

	public PublicNotice getPublicNoticeById(Long id);

	public PageInfo<PublicNotice> findPublicNoticeForPageByOrgInternalCode(
			String orgInternalCode, Integer publicNoticeLevel, Integer pageNum,
			Integer pageSize, String sidx, String sord);

	public PublicNotice updatePublicNotice(PublicNotice publicNotice);

	public void deletePublicNoticeById(Long id);

	public void deletePublicNoticeByIds(Long[] ids);

	public PageInfo<PublicNotice> findByStartEndDateAndTitle(
			PublicNoticeVo publicNoticevo, Integer pageNum, Integer pageSize,
			String sidx, String sord);

	public PageInfo<PublicNotice> searchPublicNotice(
			PublicNoticeVo publicNoticeVo, Integer pageNum, Integer pageSize,
			String sidx, String sord);

	public void savePublicNoticeRole(Long publicNoticeId, String str);

	public void savePublicNoticeOrg(Long publicNoticeId, String str);

	public void delPublicNoticeRole(Long id);

	public void delPublicNoticeRoleByIds(Long[] ids);

	public void delPublicNoticeOrg(Long id);

	public void delPublicNoticeOrgByIds(Long[] ids);

	public List<Long> queryPublicNoticeRoleById(Long id);

	public List<String> queryPublicNoticeOrgById(Long id);

	public void updatePublicNoticeIsRead(Long id);

	public PageInfo getPublicNoticeReceiveList(String orgInternalCode,
			PublicNoticeVo publicNoticeVo, Integer pageNum, Integer pageSize,
			String sidx, String sord);

	public void delPublicNoticeUser(Long id);

	public void delPublicNoticeUserByIds(Long[] ids);
	/**
	 * 当前用户最新的一条通知通告
	 * 
	 * @return
	 */
	public PublicNotice getPublicNoticeLatest();

	/**
	 * 当前用户最新的未读通知通告
	 * 
	 * @param latestPublicNoticeId
	 *            （最新一条通知通告的id，可为空）
	 * @param num
	 *            （获取数据的条数）
	 * @param sidx
	 * @param sord
	 * @return
	 */
	public List<PublicNotice> queryPublicNoticeUnReadForList(
			Long latestPublicNoticeId, int num, String sidx, String sord);

}
