package com.tianque.core.web.tag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import com.tianque.core.util.DateUtil;
import com.tianque.core.util.GridProperties;
import com.tianque.exception.base.SystemUtilException;

public class SysBeginUseYearOptionsTag extends TagSupport {

	@Override
	public int doStartTag() {
		Long sysBeginYear = Long
				.valueOf(DateUtil.toString(DateUtil.parseDate(
						GridProperties.SYS_BEGIN_USE_YEAR, "yyyyMM"), "yyyy"));
		Long nowYear = Long.valueOf(DateUtil.toString(new Date(), "yyyy"));
		StringBuffer options = new StringBuffer();
		for (; nowYear >= sysBeginYear; nowYear--) {
			options.append("<option value='" + nowYear + "'>" + nowYear
					+ "</option>");
		}
		JspWriter out = this.pageContext.getOut();
		try {
			out.print(options.toString());
		} catch (IOException e) {
			throw new SystemUtilException("获取系统标签异常", e);
		}
		return Tag.EVAL_PAGE;
	}
}
