package com.tianque.core.util;

public interface DialogMode {
	public final String ADD_MODE = "add";
	public final String PRINT_MODE = "print";
	public final String COPY_MODE = "copy";
	public final String EDIT_MODE = "edit";
	public final String VIEW_MODE = "view";
	public final String SEARCH_MODE = "search";
	public final String ALLSEARCH_MODE = "allSearch";
	public final String VIEW1_MODE = "view1";
	public final String VIEW2_MODE = "view2";
	public final String STATISTIC = "statistic";
	public final String DEL_MODE = "delete";
	public final String DEAL = "deal";
	public final String PAGING_MODE = "page";
	public final String SUB_GRID = "subGrid";
	public final String RECEIVESTATE_MODE = "receiveState";// 签收
	public final String SEARCH_DOCUMENTS = "searchDocuments";// 查询整个文件
	public final String SIGN = "sign";
	public final String READ = "read";
	public final String TRANSMIT = "transmit";
	public final String SEND = "send";
	public final String SHAREING = "sharing";// 同步资料库
	public final String ISPRIMARYMEMBER = "primary";// 是否是成员库列表
	public final String COMBINE = "combine";
	public final String OUT_GOING = "outgoing";// 卸任
	public final String TAKE_OFFICE = "takeOffice";// 任职
	public final String MERGE = "merge";// 合并
	public final String ADD_LEANDER_VIEW = "addLeaderView";// 新增领导视图岗位
	public final String PRIMARYMEMBERSLIST = "primaryMembersList";// 成员库页面显示
	public final String PRIMARYMEMBERSORGOPTION = "primaryMembersOrgOption";// 组织选择
	public final String MAINTAINPRIMARYORGMEMBERS = "maintainPrimaryOrgMembers";// 维护成员
	public final String PRIMARYORGMEMBERLIST = "primaryOrgMemberList";// 维护成员页面成员显示
	public final String WORKCONTACT_ALL = "all";// 平台内联系人筛选条件 所有
	public final String WORKCONTACT_SUPERIOR = "superior";// 上级
	public final String WORKCONTACT_SAMELEVEL = "sameLevel";// 本级
	public final String WORKCONTACT_JURISDICTION = "jurisdiction";// 下辖
	public final String MYGROUP_EDIT_MEMBER = "myGroupEditMember";// 维护成员
	public final String MESSAGE_INBOXFORWARD = "inboxForward";// 消息回复
	public final String MESSAGE_OUTBOXFORWARD = "outboxForward";
	public final String MESSAGE_SELECTRECEIVER = "selectReceiver";
	public final String MESSAGE_DRAFTBOXFORWARD = "draftboxForward";
	public final String FOURTEAMS_ORG_LEADER_VIEW = "leaderView";// 四支队伍领导视图
	public final String FOURTEAMS_ORG_DISTRICT_VIEW = "districtView";// 四支队伍县级视图
	public final String FOURTEAMS_ORG_BASIC_VIEW = "basicView";// 四支队伍基层视图
	public final String OPEN = "open"; // 打开
	public final String CLOSE = "close"; // 关闭
	public final String GRADEHISTORY = "gradeHistory";// 事件评分详情
	public final String ADDRESS_CLEAN = "addressClean";// 户籍地清洗
	public final String ADDRESS_CLEANLOG = "addressCleanLog";// 户籍地清洗

	public final String ORGANIZATIONS_MEGER = "meger";// 组织机构合并
	public final String ORGANIZATIONS_TRANSFER = "transfer";// 组织机构迁移
	public final String ORGANIZATIONS_TRANSFERS = "transfers";// 组织机构迁移
																// 用于controller层级判断
	public final String ORGANIZATION_DOJOB = "doJob";

	public final String ORGANIZATION_COMPARE = "compare";

	public final String SELECT_TABLEINFO = "selectTableInfo";// 选择表结构
	public final String SELECT_COLUMNINFO = "selectColumnInfo";// 选择表字段
	public final String ORGANIZATIONS_UPDATE = "update";// 修改
	public final String OGRANIZATIONS_MAINTAIN = "maintain";
	
	public final String SORT_ASCENDING="asc";//升序
	public final String SORT_DESCENDING="desc";//降序
}
