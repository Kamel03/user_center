package com.tianque.core.base;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tianque.core.util.DialogMode;
import com.tianque.core.util.StringUtil;
import com.tianque.core.vo.GridPage;
import com.tianque.core.vo.ReturnMessage;
import com.tianque.domain.DefaultSortAndPage;

public class BaseAction extends ActionSupport {
	protected String actionName;
	protected String ajaxUrl;
	protected String contextId;
	protected Map<String, String> cacheId;
	protected String STREAM_SUCCESS = "streamSuccess";
	/**
	 * 错误信息
	 */
	protected String errorMessage;
	protected String downloadFileName;
	protected InputStream inputStream;
	protected String callback;
	protected boolean result = false;
	/**
	 * 返回多个组织
	 */
	protected ReturnMessage returnMessage;

	/**
	 * 角色grid的数据源
	 */
	protected GridPage gridPage;
	/**
	 * 增加，修改，查看
	 */
	protected String mode = SUCCESS;

	/**
	 * 显示页
	 */
	protected Integer page = 1;
	/**
	 * 一页行数
	 */
	protected Integer rows = 15;
	/**
	 * 排序的字段名
	 */
	protected String sidx;
	/**
	 * 排序的顺序
	 */
	protected String sord;

	protected Long id;
	protected String type;

	/**
	 * 操作结果，用于判断操作是否成功
	 */
	protected boolean opreationResult = false;

	// 解析字符串：把字符串转换为Long[]类型
	public Long[] analyze(String idStrings) {
		String[] idString = idStrings.split(",");
		List<Long> idList;
		if (idString[0].equals("")) {
			idList = initTargetId(idString, 1);
		} else {
			idList = initTargetId(idString, 0);
		}
		Long[] ids = new Long[idList.size()];
		for (int i = 0; i < ids.length; i++) {
			ids[i] = idList.get(i);
		}
		return ids;
	}

	// 解析字符串：把字符串转换为List<Long>类型
	protected List<Long> analyzeToList(String idStrings) {
		return StringUtil.parseLong(idStrings);
	}

	private List<Long> initTargetId(String[] targetIds, int size) {
		List<Long> idLongs = new ArrayList<Long>();
		for (int i = size; i < targetIds.length; i++) {
			String tempId = targetIds[i];
			if (size == 0) {
				idLongs.add(Long.parseLong(targetIds[i].trim()));
			} else {
				idLongs.add(Long.parseLong(tempId.trim()));
			}
		}
		return idLongs;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public String getErrorMessage() {
		ServletActionContext.getResponse().setHeader("Error", "Error");
		return errorMessage;
	}

	public GridPage getGridPage() {
		return gridPage;
	}

	/**
	 * 获取返回result字串
	 * 
	 * @return
	 */
	public String getRetunString() {
		if (DialogMode.ADD_MODE.equals(mode)
				|| DialogMode.EDIT_MODE.equals(mode)) {
			return SUCCESS;
		}
		return mode;
	}

	protected String constructResultType() {
		if (DialogMode.VIEW_MODE.equals(mode)) {
			return DialogMode.VIEW_MODE;
		} else if (DialogMode.SEARCH_MODE.equals(mode)) {
			return DialogMode.SEARCH_MODE;
		} else {
			return SUCCESS;
		}
	}

	public String getMode() {
		return mode;
	}

	public Integer getPage() {
		return page;
	}

	public Integer getRows() {
		return rows;
	}

	public String getSidx() {
		return sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setGridPage(GridPage gridPage) {
		this.gridPage = gridPage;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	protected void appendErrorMessage(String msg) {
		if (errorMessage == null || errorMessage.trim().length() == 0) {
			errorMessage = msg;
		} else {
			errorMessage = errorMessage + "\n" + msg;
		}
	}

	public String getDownloadFileName() {
		return downloadFileName;
	}

	public void setDownloadFileName(String downloadFileName) {
		this.downloadFileName = downloadFileName;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public Map<String, String> getCacheId() {
		return cacheId;
	}

	public void setCacheId(Map<String, String> cacheId) {
		this.cacheId = cacheId;
	}

	public String getAjaxUrl() {
		return ajaxUrl;
	}

	public void setAjaxUrl(String ajaxUrl) {
		this.ajaxUrl = ajaxUrl;
	}

	public String getContextId() {
		return contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public ReturnMessage getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(ReturnMessage returnMessage) {
		this.returnMessage = returnMessage;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public boolean isOpreationResult() {
		return opreationResult;
	}

	public void setOpreationResult(boolean opreationResult) {
		this.opreationResult = opreationResult;
	}

	/**
	 * 页面获取list时，默认的排序和分页参数
	 * 
	 * @return
	 */
	public DefaultSortAndPage defaultSortAndPage() {
		DefaultSortAndPage defaultSortAndPage = new DefaultSortAndPage();
		defaultSortAndPage.setSidx(sidx);
		defaultSortAndPage.setSord(sord);
		defaultSortAndPage.setPage(page);
		defaultSortAndPage.setRows(rows);
		return defaultSortAndPage;
	}
}
