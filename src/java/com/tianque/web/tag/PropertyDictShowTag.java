package com.tianque.web.tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tianque.core.util.ThreadVariable;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.Session;
import com.tianque.sysadmin.service.PropertyDictService;

/**
 * 属性字典显示的自定义标签v1.4
 * 
 */
/**
 * demo: '<select name="domain.gender.id" id="gender" class="form-txt">
 * <pop:OptionTag name="性别" defaultValue="${domain.gender.id}"/> </select>'
 */
public class PropertyDictShowTag extends TagSupport {
	private static Logger logger = LoggerFactory
			.getLogger(PropertyDictShowTag.class);
	private static final String DEFAULT_JSP_NODE = "<option value='{id}'>{displayName}</option>";
	/**
	 * 在页面先要显示的结点格式，例如： <div propertyDictId="{id}">"{displayName}"</div>
	 */
	private String jspNode = "";
	/** 返回值 */
	private String showValue = "";
	/**
	 * 对应PropertyDomain表中的domainName.
	 */
	private String domainName = "";

	public int doStartTag() throws JspException {
		if (domainName == null || domainName.length() == 0) {
			return Tag.SKIP_BODY;
		}
		Session session = (Session) ThreadVariable.getSession();
		if (session == null || session.getUserId() == null) {
			return Tag.SKIP_BODY;
		}
		PropertyDictService propertyDictService = getPropertyDictService();

		String propertyType = getPropertyTypeByExpression();
		List<PropertyDict> PropertyDict = propertyDictService
				.findPropertyDictByDomainName(propertyType);

		toHTML(PropertyDict);
		
		return Tag.EVAL_PAGE;
	}

	/**
	 * 将所有的Code转换成Option
	 * 
	 * @param codes
	 */
	public void toHTML(List<PropertyDict> propertyDicts) {
		JspWriter out = this.pageContext.getOut();
		StringBuffer sb = new StringBuffer(50 * propertyDicts.size());
		if (jspNode == null || jspNode.equals("")) {
			jspNode = DEFAULT_JSP_NODE;
		}
		try {
			// 根据分析得到需要选中选项的值
			for (PropertyDict propertyDict : propertyDicts) {
				if (showValue != null
						&& showValue.equals(propertyDict.getId().toString())) {
					sb = new StringBuffer();
					sb.append(replaceJspNode(jspNode, propertyDict));
					break;
				} else {
					sb.append(replaceJspNode(jspNode, propertyDict));
				}
			}
			out.print(sb.toString());
		} catch (Exception e) {
			logger.error("异常信息", e);
		}
	}

	private String replaceJspNode(String jspNode, PropertyDict propertyDict) {
		String result = null;
		if (jspNode != null) {
			result = jspNode.replace("{id}", "" + propertyDict.getId());
			result = result.replace("{displayName}",
					"" + propertyDict.getDisplayName());
		}
		return result;
	}

	private PropertyDictService getPropertyDictService() {
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(this.pageContext.getServletContext());

		PropertyDictService propertyDictService = (PropertyDictService) applicationContext
				.getBean("propertyDictService");
		return propertyDictService;
	}

	/**
	 * 即保留对原来写类别中文名的支持，又支持OGNL表达式写法.
	 * 
	 * @return
	 */
	private String getPropertyTypeByExpression() {
		String result = domainName;
		try {
			OgnlContext context = new OgnlContext();
			Object parseExpression = Ognl.parseExpression(domainName);
			Object value = Ognl.getValue(parseExpression, context);
			if (value != null)
				result = value.toString();
		} catch (OgnlException e) {
			logger.error("异常信息", e);
		}
		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getJspNode() {
		return jspNode;
	}

	public void setJspNode(String jspNode) {
		this.jspNode = jspNode;
	}

	public String getShowValue() {
		return showValue;
	}

	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}

}
