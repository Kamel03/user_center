package com.tianque.sysadmin.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.systemLog.service.SystemLogService;
import com.tianque.core.systemLog.util.ModelType;
import com.tianque.core.systemLog.util.OperatorType;
import com.tianque.core.util.Chinese2pinyin;
import com.tianque.core.util.ObjectToJSON;
import com.tianque.core.util.ThreadVariable;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.PropertyDomain;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.mobile.vo.MobilePropertyDict;
import com.tianque.service.impl.LogableService;
import com.tianque.sysadmin.dao.PropertyDictDao;
import com.tianque.sysadmin.dao.PropertyDomainDao;
import com.tianque.sysadmin.service.PropertyDictService;

@Transactional(timeout = 300000)
@Service("propertyDictService")
public class PropertyDictServiceImpl extends LogableService implements
		PropertyDictService {

	@Autowired
	private PropertyDictDao propertyDictDao;
	@Autowired
	private PropertyDomainDao propertyDomainDao;
	@Autowired
	private SystemLogService systemLogService;

	/**
	 * @description 根据ID查询系统属性字典.
	 * @param id
	 * @return.
	 */
	public List<PropertyDict> findPropertyDictByIds(Long[] ids) {
		if (ids == null || ids.length == 0) {
			return null;
		}
		return propertyDictDao.findPropertyDictByIds(ids);
	}

	@Override
	public PropertyDict addPropertyDict(PropertyDict propertyDict) {
		validatePropertyDict(propertyDict);
		autoFillChinesePinyin(propertyDict);
		propertyDict.setDisplaySeq(getDisplaySeq(propertyDict));
		PropertyDict addPropertyDict = propertyDictDao
				.addPropertyDict(propertyDict);
		systemLogService.log(INFO, ModelType.SYSTEMPROPERTYDICT,
				OperatorType.ADD, ThreadVariable.getSession().getUserName()
						+ "新增名称为\"" + addPropertyDict.getDisplayName()
						+ "\"的系统属性", null);
		return addPropertyDict;
	}

	private void autoFillChinesePinyin(PropertyDict propertyDict) {
		Map<String, String> pinyin = Chinese2pinyin
				.changeChinese2Pinyin(propertyDict.getDisplayName());
		propertyDict.setSimplePinyin(pinyin.get("simplePinyin"));
		propertyDict.setFullPinyin(pinyin.get("fullPinyin"));
	}

	private void validatePropertyDict(PropertyDict propertyDict) {
		if (propertyDict.getPropertyDomain() == null
				|| propertyDict.getPropertyDomain().getId() == null) {
			throw new BusinessValidationException("不存在系统属性，不能添加");
		}
		if (propertyDict.getDisplayName() == null
				|| propertyDict.getDisplayName().equals("")) {
			throw new BusinessValidationException("属性名称不能为空!");
		}
	}

	private Integer getDisplaySeq(PropertyDict propertyDict) {
		Integer maxDisplaySeq = propertyDictDao
				.getMaxDisplaySeqById(propertyDict.getPropertyDomain().getId());
		if (maxDisplaySeq == null) {
			maxDisplaySeq = 0;
		}
		return ++maxDisplaySeq;
	}

	@Override
	public PropertyDict updatePropertyDict(PropertyDict propertyDict) {
		validatePropertyDict(propertyDict);
		autoFillChinesePinyin(propertyDict);
		propertyDict.setUpdateDate(Calendar.getInstance().getTime());

		PropertyDict updatePropertyDict = null;
		updatePropertyDict = propertyDictDao.updatePropertyDict(propertyDict);
		systemLogService.log(INFO, ModelType.SYSTEMPROPERTYDICT,
				OperatorType.UPDATE, ThreadVariable.getSession().getUserName()
						+ "修改属性名称：" + updatePropertyDict.getDisplayName()
						+ "更改为" + propertyDict.getDisplayName(),
				ObjectToJSON.convertJSON(propertyDict));
		return updatePropertyDict;
	}

	@Override
	public List<PropertyDict> findPropertyDictByPropertyDomainId(Long domainId) {
		if (domainId == null) {
			throw new BusinessValidationException("域属性Id不能为空");
		}
		return this.propertyDictDao
				.findPropertyDictByPropertyDomainId(domainId);
	}

	@Override
	public List<PropertyDict> findPropertyDictByPropertyDomainId(Long domainId,
			String sidx, String sord) {
		if (domainId == null) {
			throw new BusinessValidationException("域属性Id不能为空");
		}
		return this.propertyDictDao.findPropertyDictByPropertyDomainId(
				domainId, sidx, sord);
	}

	@Override
	public PropertyDict getPropertyDictByDomainNameAndDictId(String domainName,
			Long id) {
		if (id == null || domainName == null || domainName.trim().length() == 0) {
			throw new BusinessValidationException("字典类型名称或字典属性Id不能为空");
		}
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(domainName);
		return this.propertyDictDao.getPropertyDictByDomainIdAndDictId(
				domain.getId(), id);
	}

	@Override
	public void movePropertyDict(Long id, Long propertyDomainId,
			ReferType position, Long referPropertyDictId) {
		PropertyDict propertyDict = propertyDictDao.getPropertyDictById(id);

		PropertyDict referPropertyDict = propertyDictDao
				.getPropertyDictById(referPropertyDictId);

		if (ReferType.last.equals(position)) {
			Integer maxDisplaySeq = propertyDictDao
					.getMaxDisplaySeqById(propertyDict.getPropertyDomain()
							.getId());
			propertyDictDao.updateProSeqBetweenReferPro(propertyDict
					.getDisplaySeq(), maxDisplaySeq, propertyDict
					.getPropertyDomain().getId(), -1L);
			propertyDictDao.updatePropertyDictDisplaySeq(id, maxDisplaySeq);
			return;
		}
		if (ReferType.first.equals(position)) {
			propertyDictDao.updateProSeqBetweenReferPro(1, propertyDict
					.getDisplaySeq(), propertyDict.getPropertyDomain().getId(),
					1L);
			propertyDictDao.updatePropertyDictDisplaySeq(id, 1);
			return;
		}
		if (ReferType.after.equals(position)) {
			moveOrgAferReferOrg(propertyDomainId, propertyDict,
					referPropertyDict);
			return;
		}

		if (ReferType.before.equals(position)) {
			moveBeforePropertyDict(propertyDomainId, propertyDict,
					referPropertyDict);
			return;
		}
	}

	private void moveOrgAferReferOrg(Long propertyDomainId,
			PropertyDict propertyDict, PropertyDict referPropertyDict) {
		if (propertyDict.getDisplaySeq() > referPropertyDict.getDisplaySeq()) {
			propertyDictDao.updateProSeqBetweenReferPro(referPropertyDict
					.getDisplaySeq(), propertyDict.getDisplaySeq(),
					propertyDict.getPropertyDomain().getId(), 1L);
			propertyDictDao.updatePropertyDictDisplaySeq(propertyDict.getId(),
					referPropertyDict.getDisplaySeq() + 1);
			propertyDictDao.updatePropertyDictDisplaySeq(
					referPropertyDict.getId(),
					referPropertyDict.getDisplaySeq());
		} else {
			propertyDictDao.updateProSeqBetweenReferPro(propertyDict
					.getDisplaySeq(), referPropertyDict.getDisplaySeq(),
					propertyDict.getPropertyDomain().getId(), -1L);
			propertyDictDao.updatePropertyDictDisplaySeq(propertyDict.getId(),
					referPropertyDict.getDisplaySeq());
		}
	}

	private void moveBeforePropertyDict(Long propertyDomainId,
			PropertyDict propertyDict, PropertyDict referPropertyDict) {
		if (propertyDict.getDisplaySeq() > referPropertyDict.getDisplaySeq()) {
			propertyDictDao.updateProSeqBetweenReferPro(referPropertyDict
					.getDisplaySeq(), propertyDict.getDisplaySeq(),
					propertyDict.getPropertyDomain().getId(), 1L);
			propertyDictDao.updatePropertyDictDisplaySeq(propertyDict.getId(),
					referPropertyDict.getDisplaySeq());
		} else {
			propertyDictDao.updateProSeqBetweenReferPro(propertyDict
					.getDisplaySeq(), referPropertyDict.getDisplaySeq(),
					propertyDict.getPropertyDomain().getId(), -1L);
			propertyDictDao.updatePropertyDictDisplaySeq(propertyDict.getId(),
					referPropertyDict.getDisplaySeq() - 1);
			propertyDictDao.updatePropertyDictDisplaySeq(
					referPropertyDict.getId(),
					referPropertyDict.getDisplaySeq());
		}
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainName(String domainName) {
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(domainName);
		if (domain == null) {
			return new ArrayList<PropertyDict>();
		} else {
			return propertyDictDao.findPropertyDictByPropertyDomainId(domain
					.getId());
		}
	}

	@Override
	public List<PropertyDict> findPropertyDictByDisplayNameAndDomainPropertyId(
			Long propertyDomainId, String displayName, Long id) {
		return this.propertyDictDao
				.findPropertyDictByDisplayNameAndDomainPropertyId(
						propertyDomainId, displayName, id);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndInternalId(
			String domainName, Integer internalId) {
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(domainName);
		if (domain == null) {
			return new ArrayList<PropertyDict>();
		} else {
			return propertyDictDao.findPropertyDictByDomainIdAndInternalId(
					domain.getId(), internalId);
		}
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndInternalIds(
			String domainName, int[] internalIds) {
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(domainName);
		if (domain == null) {
			return new ArrayList<PropertyDict>();
		} else {
			return propertyDictDao.findPropertyDictByDomainIdAndInternalIds(
					domain.getId(), internalIds);
		}
	}

	@Override
	public PropertyDict findPropertyDictByDomainNameAndDictDisplayName(
			String propertyDomainName, String dictDisplayName) {
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(propertyDomainName);
		if (domain == null) {
			return null;
		} else {
			return propertyDictDao
					.findPropertyDictByDomainIdAndDictDisplayName(
							domain.getId(), dictDisplayName);
		}
	}

	@Override
	public int deletePropertyDictById(Long id) {
		if (null == id) {
			throw new BusinessValidationException("字典类型id不能为空");
		}
		PropertyDict deletePropertyDict = getPropertyDictById(id);
		systemLogService.log(INFO, ModelType.SYSTEMPROPERTYDICT,
				OperatorType.DELETE, ThreadVariable.getSession().getUserName()
						+ "删除名称为\"" + deletePropertyDict.getDisplayName()
						+ "\"的系统属性",
				ObjectToJSON.convertJSON(deletePropertyDict));
		return propertyDictDao.deletePropertyDictById(id);
	}

	@Override
	public PropertyDict getPropertyDictById(Long id) {
		return propertyDictDao.getPropertyDictById(id);
	}

	@Override
	public PropertyDict getPropertyDictByDomainName(String domainName) {

		return propertyDictDao.getPropertyDictByDomainName(domainName);
	}

	@Override
	public PropertyDict getPropertyDictByOrgId(Long id) {
		return propertyDictDao.getPropertyDictByOrgId(id);
	}

	@Override
	public List<MobilePropertyDict> findMobilePropertyDictByDomainName(
			String domainName) {
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(domainName);
		if (domain == null) {
			return new ArrayList<MobilePropertyDict>();
		} else {
			return propertyDictDao
					.findMobilePropertyDictByPropertyDomainId(domain.getId());
		}
	}

	@Override
	public PropertyDict getPropertyDictName(Long id) {
		return propertyDictDao.getPropertyDictName(id);
	}

	@Override
	public List<PropertyDict> findPropertyDictByDomainNameAndDisplayseqs(
			String propertyDomainName, int[] displayseqs) {
		PropertyDomain domain = propertyDomainDao
				.getPropertyDomainByDomainName(propertyDomainName);
		if (domain == null) {
			return new ArrayList<PropertyDict>();
		} else {
			return propertyDictDao.findPropertyDictByDomainNameAndDisplayseqs(domain.getId(), displayseqs);
		}
}

	@Override
	public List<PropertyDict> getPropertyDictByPinYinAndDomainid(String pinyin,
			Long domainId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pinyin", pinyin);
		map.put("domainId", domainId);
		return propertyDictDao.getPropertyDictByPinYinAndDomainid(map);
	}

	@Override
	public List<PropertyDict> getPropertyDictByDomainidAndInternalid(
			Long domainId, Integer internalid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("domainId", domainId);
		map.put("internalid", internalid);
		return propertyDictDao.getPropertyDictByDomainidAndInternalid(map);
	}

	@Override
	public List<PropertyDict> findFullPropertyDictByDomainId(Long dictTypeId,
			Long dictTypeSubId) {
			if (dictTypeId==null || dictTypeSubId==null) {
				throw new BusinessValidationException("参数错误");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("dictTypeSubId", dictTypeSubId);
			map.put("dictTypeId", dictTypeId);
			return propertyDictDao.findFullPropertyDictByDomainId(map);
	}
}
