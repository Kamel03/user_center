package com.tianque.publicNotice.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.base.AbstractBaseService;
import com.tianque.core.util.FileUtil;
import com.tianque.core.util.GridProperties;
import com.tianque.core.util.StoredFile;
import com.tianque.core.util.StringUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.Role;
import com.tianque.domain.vo.PublicNoticeVo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.publicNotice.dao.PublicNoticeAttachFileDao;
import com.tianque.publicNotice.dao.PublicNoticeDao;
import com.tianque.publicNotice.domain.PublicNotice;
import com.tianque.publicNotice.domain.PublicNoticeAttachFiles;
import com.tianque.publicNotice.domain.PublicNoticeBenchVo;
import com.tianque.publicNotice.domain.PublicNoticeObject;
import com.tianque.publicNotice.service.PublicNoticeService;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.userAuth.api.PermissionDubboService;
import com.tianque.userAuth.api.PropertyDictDubboService;

@Service("publicNoticeService")
@Transactional
public class PublicNoticeServiceImpl extends AbstractBaseService implements
		PublicNoticeService {

	@Autowired
	private PublicNoticeDao publicNoticeDao;
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private PermissionService permissionoService;

	@Autowired
	private PropertyDictService propertyDictService;
	@Autowired
	private PublicNoticeAttachFileDao publicNoticeAttachFileDao;

	public PageInfo<PublicNotice> constructEmptyPageInfo() {
		PageInfo<PublicNotice> result = new PageInfo<PublicNotice>();
		result.setResult(new ArrayList<PublicNotice>());
		return result;
	}

	@Override
	public PublicNotice addPublicNotice(PublicNotice publicNotice) {
		try {
			publicNotice.setUserId(ThreadVariable.getSession().getUserId());
			Organization org = organizationService
					.getSimpleOrgById(publicNotice.getOrganization().getId());
			String orgInternalCode = org.getOrgInternalCode();
			publicNotice.setOrgInternalCode(orgInternalCode);

			PublicNoticeObject publicNoticeObject = publicNotice
					.getPublicNoticeObject();
			publicNotice = publicNoticeDao.addPublicNotice(publicNotice);
			savePublicNoticeObject(publicNoticeObject, publicNotice.getId(),
					org);
			return publicNotice;
		} catch (Exception e) {
			return dealException(this, "addPublicNotice", "通知通报新增错误", e);
		}
	}

	private void savePublicNoticeObject(PublicNoticeObject publicNoticeObject,
			Long publicNoticeId, Organization org) {
		if (publicNoticeObject != null) {
			String publicNoticeRole = publicNoticeObject.getPublicNoticeRole();
			if (publicNoticeRole != null && !"".equals(publicNoticeRole)) {
				String publicNoticeRoles[] = publicNoticeRole.split(",");
				for (String str : publicNoticeRoles) {
					publicNoticeDao.savePublicNoticeRole(publicNoticeId, str);
				}
			}
			String publicNoticeOrgZN = publicNoticeObject
					.getPublicNoticeOrgZN();
			if (publicNoticeOrgZN != null && !"".equals(publicNoticeOrgZN)) {
				String noticeOrgs[] = publicNoticeOrgZN.split(",");
				for (String str : noticeOrgs) {
					publicNoticeDao.savePublicNoticeOrg(publicNoticeId, str);
				}
			}
			String publicNoticeOrgXZ = publicNoticeObject
					.getPublicNoticeOrgXZ();
			if (StringUtil.isStringAvaliable(publicNoticeOrgXZ)) {
				publicNoticeOrgXZsavePublicNoticeOrg(publicNoticeOrgXZ,publicNoticeId);
			}
		}
	}
	
	//根据行政部门发送
	private void publicNoticeOrgXZsavePublicNoticeOrg(String publicNoticeOrgXZ,Long publicNoticeId){
		String [] publicNoticeOrgXZs = StringUtils.split(publicNoticeOrgXZ,",");
		List<String> list = null;
		Map<String, String> publicNoticeOrg = null;
		for (String pNoticeOrgXZ : publicNoticeOrgXZs) {
			Long orgId = Long.valueOf(StringUtils.split(pNoticeOrgXZ,"_")[0]);
			Organization organization = organizationService.getSimpleOrgById(orgId);
			publicNoticeOrg = getPublicNoticeOrgByLevel(
					organization, getLevels(publicNoticeOrgXZ));
			for (Map.Entry<String, String> map : publicNoticeOrg.entrySet()) {
				list = publicNoticeDao.queryPublicNoticeOrgById(publicNoticeId);
				if(list.contains(map.getKey())){
					//判断是否已经发过通知
					continue;
				}
				publicNoticeDao.savePublicNoticeOrg(publicNoticeId,
						map.getKey());
			}
		}
		for (int i = 0;i<publicNoticeOrgXZs.length;i++) {
			
		}

	}

	// 获取需要通知的层级
	private List<String> getLevels(String noticeOrg) {
		List<String> levelList = new ArrayList<String>();
		String noticeOrgs[] = noticeOrg.split(",");
		for (String level : noticeOrgs) {
			levelList.add(level.split("_")[1]);
		}
		return levelList;
	}

	// 获取下辖的所有组织机构Id
	private Map<String, String> getPublicNoticeOrgByLevel(
			Organization parentOrg, List<String> levels) {
		Map<String, String> publicNoticeOrgIds = new HashMap<String, String>();

		List<Organization> orgList = organizationService
				.findOrganizationsByOrgInternalCode(parentOrg
						.getOrgInternalCode());
		for (String level : levels) {
			// 遍历层级过滤符合的条件
			for (Organization childOrg : orgList) {
				Organization tempOrg = organizationService
						.getFullOrgById(childOrg.getId());
				// 如果层级匹配，那么找到父类的id即可拼装
				if (tempOrg.getOrgLevel().getId().equals(Long.valueOf(level))) {
					Long parentId = tempOrg.getParentOrg().getId();
					if (tempOrg.getParentOrg().getId() != null) {
						publicNoticeOrgIds.put(parentId + "_" + level, parentId
								+ "_" + level);
					}
				}
			}
		}

		return publicNoticeOrgIds;
	}

	@Override
	public PageInfo<PublicNotice> findfindPublicNoticeForPageByOrgInternalCode(
			Long orgId, Integer publicNoticeLevel, Integer pageNum,
			Integer pageSize, String sidx, String sord) {
		try {
			Organization org = ThreadVariable.getOrganization();
			return publicNoticeDao.findPublicNoticeForPageByOrgInternalCode(
					org.getOrgInternalCode(), publicNoticeLevel, pageNum,
					pageSize, sidx, sord);
		} catch (Exception e) {
			return dealException(this,
					"findfindPublicNoticeForPageByOrgInternalCode",
					"查询通知通报信息出现错误", e);
		}
	}

	@Override
	public PageInfo<PublicNotice> findByStartEndDateAndTitle(
			PublicNoticeVo publicNoticevo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		return publicNoticeDao.findByStartEndDateAndTitle(publicNoticevo,
				pageNum, pageSize, sidx, sord);
	}

	@Override
	public PublicNotice getPublicNoticeById(Long id) {
		if (null == id || id < 0L) {
			throw new BusinessValidationException("传入参数为空");
		}
		try {
			PublicNotice publicNotice = publicNoticeDao.getPublicNoticeById(id);

			PublicNoticeObject publicNoticeObject = new PublicNoticeObject();
			List<Long> publicNoticeRole = publicNoticeDao
					.queryPublicNoticeRoleById(id);
			String publicNoticeRoleStr = "", publicNoticeRoleContent = "";
			for (Long roleId : publicNoticeRole) {
				Role role = permissionoService.findRoleById(roleId);
				if (role != null) {
					publicNoticeRoleStr += roleId + ",";
					publicNoticeRoleContent += "[岗位] " + role.getRoleName()
							+ ";";
				}
			}
			publicNoticeObject.setPublicNoticeRole(publicNoticeRoleStr);
			publicNoticeObject
					.setPublicNoticeRoleContent(publicNoticeRoleContent);

			String publicNoticeOrgZNStr = "", publicNoticeOrgZNContent = "", publicNoticeOrgXZStr = "", publicNoticeOrgXZContent = "";
			List<String> publicNoticeOrg = publicNoticeDao
					.queryPublicNoticeOrgById(id);
			for (String orgIds : publicNoticeOrg) {
				if (orgIds != null && !"".equals(orgIds)) {
					if (orgIds.indexOf("_") == -1) {
						try {
							Long orgId = Long.parseLong(orgIds);
							Organization org = organizationService
									.getSimpleOrgById(orgId);
							Organization porg = organizationService
									.getSimpleOrgById(org.getParentOrg()
											.getId());
							if (org != null && porg != null) {
								publicNoticeOrgZNStr += orgId + ",";
								publicNoticeOrgZNContent += porg.getOrgName()
										+ " > " + org.getOrgName() + ";";
							}
						} catch (Exception e) {
						}
					} else {
						String orgOrZNId[] = orgIds.split("_");
						if (orgOrZNId.length == 2) {
							try {
								Long orgId2 = Long.parseLong(orgOrZNId[0]);
								Organization org = organizationService
										.getSimpleOrgById(orgId2);
								Long znId = Long.parseLong(orgOrZNId[1]);
								PropertyDict pd = propertyDictService
										.getPropertyDictById(znId);
								if (org != null && pd != null) {
									publicNoticeOrgXZStr += orgIds + ",";
									publicNoticeOrgXZContent += org
											.getOrgName()
											+ "下所有 "
											+ pd.getDisplayName() + ";";
								}
							} catch (Exception e) {
							}
						}
					}
				}
			}
			publicNoticeObject.setPublicNoticeOrgZN(publicNoticeOrgZNStr);
			publicNoticeObject
					.setPublicNoticeOrgZNContent(publicNoticeOrgZNContent);
			publicNoticeObject.setPublicNoticeOrgXZ(publicNoticeOrgXZStr);
			publicNoticeObject
					.setPublicNoticeOrgXZContent(publicNoticeOrgXZContent);
			publicNoticeObject.setPublicNoticeObject(publicNoticeRoleContent
					+ publicNoticeOrgZNContent + publicNoticeOrgXZContent);
			publicNotice.setPublicNoticeObject(publicNoticeObject);

			return publicNotice;
		} catch (Exception e) {
			return dealException(this, "getPublicNoticeById", "获取通知通报出现错误", e);
		}
	}

	@Override
	public PublicNotice updatePublicNotice(PublicNotice publicNotice) {
		Organization org = organizationService
				.getSimpleOrgById(publicNotice.getOrganization().getId());
		publicNotice.setOrgInternalCode(org.getOrgInternalCode());
		try {
			PublicNoticeObject publicNoticeObject = publicNotice
					.getPublicNoticeObject();
			publicNotice = publicNoticeDao.updatePublicNotice(publicNotice);
			publicNoticeDao.delPublicNoticeRole(publicNotice.getId());
			publicNoticeDao.delPublicNoticeOrg(publicNotice.getId());
			publicNoticeDao.delPublicNoticeUser(publicNotice.getId());
			savePublicNoticeObject(publicNoticeObject, publicNotice.getId(),
					org);
			return publicNotice;
		} catch (Exception e) {
			return dealException(this, "updatePublicNotice", "通知通报的更新错误", e);
		}
	}

	// 删除
	@Override
	public void deletePublicNoticeAttachFileById(Long id) {
		if (null == id || id < 0L) {
			throw new BusinessValidationException("传入的参数为空");
		}
		try {
			PublicNoticeAttachFiles publicNoticeAttachFile = getPublicNoticeAttachFileById(id);
			if (null != publicNoticeAttachFile) {
				deleteAttachFile(publicNoticeAttachFile);
			}
			publicNoticeAttachFileDao.deletePublicNoticeAttachFileById(id);
		} catch (Exception e) {
			dealException(this, "deletePublicNoticeAttachFileById",
					"删除通知通报附件信息出现错误", e);
		}
	}

	public void deleteAttachFile(PublicNoticeAttachFiles publicNoticeAttachFile) {
		if (null != publicNoticeAttachFile) {
			File file = new File(publicNoticeAttachFile.getFileActualUrl());
			if (file.exists()) {
				file.delete();
			}
		}
	}

	@Override
	public void deletePublicNoticeAttachFileByPublicNoticeId(
			Long[] publicNoticeIds) {
		if (publicNoticeIds == null || publicNoticeIds.length == 0) {
			throw new BusinessValidationException("传入参数为空");
		}
		try {
			for (Long publicNoticeId : publicNoticeIds) {
				List<PublicNoticeAttachFiles> noticeAttachFileList = publicNoticeAttachFileDao
						.listAttachFileByPublicNoticeId(publicNoticeId);
				for (PublicNoticeAttachFiles noticeAttachFile : noticeAttachFileList) {
					deleteAttachFile(noticeAttachFile);
				}
				publicNoticeAttachFileDao
						.deleteAttachFileByPublicNoticeId(publicNoticeId);
			}
		} catch (Exception e) {
			dealException(this, "deletePublicNoticeAttachFileByPublicNoticeId",
					"删除通知通报附件信息出现错误", e);
		}
	}

	// 删除一
	@Override
	public void deletePublicNotice(Long id) {
		publicNoticeDao.deletePublicNoticeById(id);
	}

	// 删除二
	@Override
	public void deletePublicNoticeByIds(Long[] ids) {
		if (ids == null || ids.length == 0) {
			throw new BusinessValidationException("传入的参数为空");
		}
		try {
			publicNoticeDao.deletePublicNoticeByIds(ids);
			publicNoticeDao.delPublicNoticeRoleByIds(ids);
			publicNoticeDao.delPublicNoticeOrgByIds(ids);
			publicNoticeDao.delPublicNoticeUserByIds(ids);

		} catch (Exception e) {
			dealException(this, "findfindPublicNoticeForPageByOrgInternalCode",
					"通知通报删除成功", e);
		}
	}

	public PageInfo<PublicNotice> searchPublicNotice(
			PublicNoticeVo publicNoticeVo, Integer pageNum, Integer pageSize,
			String sidx, String sord) {
		return publicNoticeDao.searchPublicNotice(publicNoticeVo, pageNum,
				pageSize, sidx, sord);
	}

	@Override
	public List<PublicNoticeAttachFiles> addAttachFileByPublicNoticeId(
			Long publicNoticeId, String[] attachFiles) {
		try {
			if (null != publicNoticeId && attachFiles != null
					&& attachFiles.length > 0) {
				for (String attachFileName : attachFiles) {
					addAttachFile(publicNoticeId, attachFileName);
				}
			}
			return publicNoticeAttachFileDao
					.listAttachFileByPublicNoticeId(publicNoticeId);
		} catch (Exception e) {
			return dealException(this, "addAttachFileByPublicNoticeId",
					"保存通知通报附件信息出现错误", e);
		}
	}

	public void addAttachFile(Long publicNoticeId, String fileName)
			throws Exception {
		PublicNoticeAttachFiles PublicNoticeAttachFile = new PublicNoticeAttachFiles();
		PublicNoticeAttachFile.setNoticeId(publicNoticeId);
		StoredFile storeFile = FileUtil.copyTmpFileToStoredFile(fileName,
				GridProperties.PUBLICNOTICE_ATTACHFILE);
		PublicNoticeAttachFile.setFileActualUrl(storeFile.getStoredFilePath()
				+ File.separator + storeFile.getStoredFileName());
		PublicNoticeAttachFile.setFileName(storeFile.getStoredTruthFileName());
		publicNoticeAttachFileDao
				.addPublicNoticeAttachFile(PublicNoticeAttachFile);
	}

	@Override
	public PublicNoticeAttachFiles getPublicNoticeAttachFileById(Long id) {
		return publicNoticeAttachFileDao.getPublicNoticeAttachFileById(id);
	}

	@Override
	public List<PublicNoticeAttachFiles> attachFileList(Long publicNoticeId) {
		List<PublicNoticeAttachFiles> publicNoticeAttachFileList = new ArrayList<PublicNoticeAttachFiles>();
		publicNoticeAttachFileList = publicNoticeAttachFileDao
				.listAttachFileByPublicNoticeId(publicNoticeId);
		return publicNoticeAttachFileList;
	}

	@Override
	public List<PublicNoticeAttachFiles> updatePublicNoticeAttachFile(
			Long publicNoticeId, String[] attachFiles) {
		try {
			if (null != publicNoticeId && null != attachFiles
					&& attachFiles.length > 0) {
				List<PublicNoticeAttachFiles> publicNoticeAttachFileList = publicNoticeAttachFileDao
						.listAttachFileByPublicNoticeId(publicNoticeId);
				List<String> publicNoticeFileName = new ArrayList<String>();
				for (PublicNoticeAttachFiles publicNoticeAttachFile : publicNoticeAttachFileList) {
					publicNoticeFileName.add(publicNoticeAttachFile
							.getFileName());
				}
				for (String fileName : attachFiles) {
					if (!publicNoticeFileName.contains(fileName)) {
						addAttachFile(publicNoticeId, fileName);
					}
				}
			}
			return publicNoticeAttachFileDao
					.listAttachFileByPublicNoticeId(publicNoticeId);
		} catch (Exception e) {
			return dealException(this, "updatePublicNoticeAttachFile",
					"修改通知通报附件信息出现错误", e);
		}
	}

	@Override
	public PageInfo getPublicNoticeReceiveList(PublicNoticeVo publicNoticeVo,
			Integer pageNum, Integer pageSize, String sidx, String sord) {
		Organization org = ThreadVariable.getOrganization();
		return publicNoticeDao.getPublicNoticeReceiveList(
				org.getOrgInternalCode(), publicNoticeVo, pageNum, pageSize,
				sidx, sord);
	}

	@Override
	public void updatePublicNoticeIsRead(Long id) {
		publicNoticeDao.updatePublicNoticeIsRead(id);
	}

	@Override
	public PublicNoticeBenchVo getPublicNoticeReceiveList(int num, String sidx,
			String sord) {
		try {
			PublicNoticeBenchVo publicNoticeBenchVo = new PublicNoticeBenchVo();
			PublicNotice publicNotice = publicNoticeDao.getPublicNoticeLatest();// 最新的一条通知通告
			if (publicNotice != null
					&& publicNotice.getPublicNoticeMatter() != null) {
				// 去除通知通告中的html标签
				publicNotice.setPublicNoticeMatter(StringUtil
						.htmlToStr(publicNotice.getPublicNoticeMatter()));
			}
			if (publicNotice != null && publicNotice.getId() != null) {
				publicNoticeBenchVo.setPublicNotice(publicNotice);
				List<PublicNotice> unReadPublicNoticeList = publicNoticeDao
						.queryPublicNoticeUnReadForList(publicNotice.getId(),
								num, sidx, sord);
				if (unReadPublicNoticeList != null
						&& unReadPublicNoticeList.size() > 0) {
					publicNoticeBenchVo
							.setPublicNoticeList(unReadPublicNoticeList);
				}
			}
			return publicNoticeBenchVo;
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PublicNoticeServiceImpl的getPublicNoticeReceiveList方法出现异常，原因：",
					"获取通知通告出错", e);
		}
	}
}
