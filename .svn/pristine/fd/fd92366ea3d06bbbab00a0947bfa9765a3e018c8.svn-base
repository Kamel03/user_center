package com.tianque.workMemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tianque.core.base.BaseAction;
import com.tianque.core.util.DateUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.GridPage;
import com.tianque.core.vo.PageInfo;
import com.tianque.sysadmin.service.UserSignService;
import com.tianque.workMemo.domain.WorkMemo;
import com.tianque.workMemo.domain.WorkMemoVo;
import com.tianque.workMemo.service.WorkMemoService;

@Namespace("/workMemo/workMemoManage")
@Transactional
@Scope("request")
@Controller("workMemoController")
public class WorkMemoController extends BaseAction {

	private String today;
	private String date;
	private WorkMemoVo workMemoVo = new WorkMemoVo();
	private List<WorkMemo> list;
	private String year;
	private String month;
	private WorkMemo workMemo;
	private Long workMemoId;
	private String workMemoIds; // 用于手机端批量删除时获得id号
	private String workMemos; // 用于手机端批量添加备忘录
	@Autowired
	private WorkMemoService workMemoService;
	@Autowired
	private UserSignService userSignService;

	private GridPage gridPage;

	@Action(value = "addWorkMemo", results = {
			@Result(name = "success", type = "json", params = { "root",
					"workMemo", "ignoreHierarchy", "false" }),
			@Result(name = "error", type = "json", params = { "root",
					"errorMessage" }) })
	public String addWorkMemo() throws Exception {
		workMemo = workMemoService.addWorkMemo(workMemo);
		return SUCCESS;
	}

	@Action(value = "addWorkMemoForMember", results = {
			@Result(name = "success", type = "json", params = { "root", "true",
					"ignoreHierarchy", "false" }),
			@Result(name = "error", type = "json", params = { "root",
					"errorMessage" }) })
	public String addWorkMemoForMember() throws Exception {
		String[] temp = workMemos.split(";");
		for (int i = 0; i < temp.length; i++) {
			String[] wo = (temp[i]).split(",");
			WorkMemo wmo = new WorkMemo();
			wmo.setUserId(Long.valueOf(wo[0]));
			wmo.setMemoContents(wo[1]);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			wmo.setAddMemoDate(sdf.parse(wo[2]));
			workMemoService.addWorkMemo(wmo);
		}
		return SUCCESS;
	}

	/**
	 * @Title: addWorkMemoForMemberWithJSON
	 * @Description: TODO为手机端增加日程安排方法，改变传输数据格式为json格式
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @author wanggz
	 * @date 2014-6-4 下午03:45:30
	 */
	@Action(value = "addWorkMemoForMemberWithJSON", results = {
			@Result(name = "success", type = "json", params = { "root", "true",
					"ignoreHierarchy", "false" }),
			@Result(name = "error", type = "json", params = { "root",
					"errorMessage" }) })
	public String addWorkMemoForMemberWithJSON() throws Exception {
		JSONArray jsonArray = JSONArray.parseArray(workMemos);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject wo = jsonArray.getJSONObject(i);
			WorkMemo wmo = new WorkMemo();
			wmo.setUserId(wo.getLong("userId"));
			wmo.setMemoContents(wo.getString("memoContents"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			wmo.setAddMemoDate(sdf.parse(wo.getString("addMemoDate")));
			workMemoService.addWorkMemo(wmo);
		}
		return SUCCESS;
	}

	@Action(value = "deleteWorkMemoById", results = {
			@Result(name = "success", type = "json", params = { "root",
					"workMemoId" }),
			@Result(name = "error", type = "json", params = { "root",
					"errorMessage" }) })
	public String deleteWorkMemoById() throws Exception {
		workMemoService.deleteWorkMemoById(workMemoId);
		return SUCCESS;
	}

	@Action(value = "deleteWorkMemoByIdForMember", results = {
			@Result(name = "success", type = "json", params = { "root", "true" }),
			@Result(name = "error", type = "json", params = { "root",
					"errorMessage" }) })
	public String deleteWorkMemoByIdForMember() throws Exception {
		String[] temp = workMemoIds.split(",");
		for (int i = 0; i < temp.length; i++) {
			Long wmoId = Long.valueOf(temp[i]);
			workMemoService.deleteWorkMemoById(wmoId);
		}
		return SUCCESS;
	}

	@Action(value = "getDaysByUserIdAndDate", results = {
			@Result(name = "success", type = "json", params = { "root",
					"workMemoVo", "ignoreHierarchy", "false" }),
			@Result(name = "error", type = "json", params = { "root",
					"errorMessage" }) })
	public String getDaysByUserIdAndDate() throws Exception {
		List<String> listDays = workMemoService.getDaysByUserIdAndDate(
				ThreadVariable.getSession().getUserId(), year,
				replenishPrefix(month));
		List<String> userSignDays = userSignService
				.getDaysByUserIdAndDate(
						ThreadVariable.getSession().getUserId(), year,
						replenishPrefix(month));
		workMemoVo.setListDays(listDays);
		workMemoVo.setUserSignDays(userSignDays);
		return SUCCESS;
	}

	private String replenishPrefix(String month) throws Exception {
		if (month.length() == 1) {
			month = "0" + month;
		}
		return month;
	}

	@Action(value = "getMemoContentsByUserIdAndAddMemoDate", results = { @Result(type = "json", name = "success", params = {
			"root", "list", "ignoreHierarchy", "false" }) })
	public String getMemoContentsByUserIdAndAddMemoDate() throws Exception {
		list = workMemoService.getMemoContentsByUserIdAndAddMemoDate(
				ThreadVariable.getSession().getUserId(), date);
		return SUCCESS;
	}

	@Action(value = "getMemoContentsByUserIdAndAddMemoDateForMember", results = { @Result(type = "json", name = "success", params = {
			"root", "list", "ignoreHierarchy", "false",
			"excludeNullProperties", "true" }) })
	public String getMemoContentsByUserIdAndAddMemoDateForMember()
			throws Exception {
		list = workMemoService.getMemoContentsByUserIdAndAddMemoDate(
				workMemo.getUserId(), date);
		return SUCCESS;
	}

	@Action(value = "getTodayMemoContentsByUserIdAndAddMemoDate", results = { @Result(type = "json", name = "success", params = {
			"root", "list", "ignoreHierarchy", "false",
			"excludeNullProperties", "true" }) })
	public String getTodayMemoContentsByUserIdAndAddMemoDate() throws Exception {
		today = DateUtil.formateYMD(new Date());
		list = workMemoService.getMemoContentsByUserIdAndAddMemoDate(
				ThreadVariable.getSession().getUserId(), today);

		return SUCCESS;
	}

	@Action(value = "getTodayMemoContentsByUserIdForMember", results = { @Result(type = "json", name = "success", params = {
			"root", "list", "ignoreHierarchy", "false",
			"excludeNullProperties", "true" }) })
	public String getTodayMemoContentsByUserIdAndAddMemoDateForMember()
			throws Exception {
		list = workMemoService.getMemoContentsByUserId(workMemo.getUserId());
		return SUCCESS;
	}

	/**
	 * @Title: getTodayMemoContentsByUserIdAndAddMemoDateForMemberNew
	 * @Description: TODO为手机端新增分页查询备忘录集合方法
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @author wanggz
	 * @date 2014-7-3 下午05:20:58
	 */
	@Action(value = "getTodayMemoContentsByUserIdForMemberNew", results = { @Result(type = "json", name = "success", params = {
			"root", "gridPage", "ignoreHierarchy", "false",
			"excludeNullProperties", "true" }) })
	public String getTodayMemoContentsByUserIdForMemberNew() throws Exception {
		if (workMemo == null || workMemo.getUserId() == null) {
			errorMessage = "请确认参数是否正确完善";
			return ERROR;
		}
		PageInfo pageInfo = workMemoService.getMemoContentsByUserIdForMobile(
				workMemo.getUserId(), page, rows);
		gridPage = new GridPage(pageInfo);
		return SUCCESS;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public WorkMemo getWorkMemo() {
		return workMemo;
	}

	public void setWorkMemo(WorkMemo workMemo) {
		this.workMemo = workMemo;
	}

	public void setWorkMemoId(Long workMemoId) {
		this.workMemoId = workMemoId;
	}

	public Long getWorkMemoId() {
		return workMemoId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setList(List<WorkMemo> list) {
		this.list = list;
	}

	public List<WorkMemo> getList() {
		return list;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getToday() {
		return today;
	}

	public String getWorkMemoIds() {
		return workMemoIds;
	}

	public void setWorkMemoIds(String workMemoIds) {
		this.workMemoIds = workMemoIds;
	}

	public String getWorkMemos() {
		return workMemos;
	}

	public void setWorkMemos(String workMemos) {
		this.workMemos = workMemos;
	}

	public GridPage getGridPage() {
		return gridPage;
	}

	public void setGridPage(GridPage gridPage) {
		this.gridPage = gridPage;
	}

	public WorkMemoVo getWorkMemoVo() {
		return workMemoVo;
	}

	public void setWorkMemoVo(WorkMemoVo workMemoVo) {
		this.workMemoVo = workMemoVo;
	}
}
