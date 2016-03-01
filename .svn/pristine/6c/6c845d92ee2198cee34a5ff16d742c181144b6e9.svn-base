package com.tianque.mobile.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.datatransfer.dataconvert.ValidateHelper;
import com.tianque.core.util.CalendarUtil;
import com.tianque.core.util.StringUtil;
import com.tianque.core.validate.DomainValidator;
import com.tianque.core.validate.ValidateResult;
import com.tianque.mobile.domain.MobileInfo;
import com.tianque.sysadmin.service.OrganizationService;

@Component("mobileInfoValidator")
public class MobileInfoValidator implements DomainValidator<MobileInfo> {
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private ValidateHelper validateHelper;

	@Override
	public ValidateResult validate(MobileInfo domain) {
		ValidateResult validateResult = new ValidateResult();
		if (domain == null) {
			validateResult.addErrorMessage("对象为空！");
			return validateResult;
		}
		// 部门是否为空，是否在库中存在
		if (domain.getOrganization() == null
				|| domain.getOrganization().getId() == null) {
			validateResult.addErrorMessage("部门为空！");
		}
		if (domain.getOrganization() != null
				&& domain.getOrganization().getId() != null
				&& organizationService.getSimpleOrgById(domain
						.getOrganization().getId()) == null) {
			validateResult.addErrorMessage("部门不存在！");
		}

		// 验证imsi号是否存在， 是否合法
		if (!StringUtil.isStringAvaliable(domain.getImsiNo())) {
			validateResult.addErrorMessage("IMSI号为空！");
		}
		if (StringUtil.isStringAvaliable(domain.getImsiNo())
				&& validateHelper.illegalIMSI(domain.getImsiNo())) {
			validateResult.addErrorMessage("IMSI号只能输入15位数字");
		}

		// TODO
		// 户主姓名最多只能输入 20个字符
		if (StringUtil.isStringAvaliable(domain.getName())
				&& (domain.getName().trim().length() < 2 || domain.getName()
						.trim().length() > 20)) {
			validateResult.addErrorMessage("姓名的长度应为2到20之间");
		}

		// 手机号是否为空， 是否 合法
		if (!StringUtil.isStringAvaliable(domain.getMobileNumber())) {
			validateResult.addErrorMessage("手机号不能为空");
		}
		if (StringUtil.isStringAvaliable(domain.getMobileNumber())
				&& validateHelper.illegalMobilePhone(domain.getMobileNumber())) {
			validateResult.addErrorMessage("手机号应为1开头的11为数字");
		}

		// 受理时间是否为空， 是否合法
		if (domain.getAcceptTime() == null) {
			validateResult.addErrorMessage("受理时间不能为空");
		}
		if (!domain.getAcceptTime().before(
				CalendarUtil.now("yyyy-MM-dd HH:mm:ss"))) {
			validateResult.addErrorMessage("受理时间应小于当前时间");
		}

		// 有效时间是否为空， 是否合法
		if (domain.getEffectivelyTime() == null) {
			validateResult.addErrorMessage("有效时间不能为空");
		}
		if (domain.getEffectivelyTime().before(
				CalendarUtil.now("yyyy-MM-dd HH:mm:ss"))) {
			validateResult.addErrorMessage("有效时间应大于当前时间");
		}

		return validateResult;
	}

}
