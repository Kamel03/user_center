package com.tianque.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.tianque.component.ClientType;
import com.tianque.core.base.BaseDomain;
import com.tianque.core.util.BaseDomainIdEncryptUtil;
import com.tianque.qrcode.domain.QrcodeDomain;

public class User extends BaseDomain {

	private String userName;
	private String name;
	private String password;
	private String mobile;
	private boolean isLock = false;

	private boolean isAdmin = false;
	private boolean changePassword;
	private boolean hasNewMessage;
	private String fullPinyin;
	private String simplePinyin;

	private Long credits1 = 0L;
	private Long credits2 = 0L;
	private String email;
	private Date lastLoginTime;
	private String lastLoginIp;
	private Date previousLoginTime;
	private String previousLoginIp;
	private Date updatePswTime;// 最后修改密码的时间 add by miaoyuanshuai 2014-09-14

	private Organization organization;

	private String workCompany;
	private String workPhone;
	private String homePhone;
	private String orgInternalCode;
	private Integer failureTimes = 0;
	private List<Role> roles;
	private List<Organization> multiZone;
	private String vpdn;
	// 用户是否启用
	private boolean isShutDown = false;
	// 登录时是否连接vpdn
	private boolean connectVpdn;
	// PC可用
	private boolean pcusable;
	// 手机可用
	private boolean mobileusable;
	private int ignoreIsShutDownOrNot;
	private int ignoreIsAdminOrNot;
	private Date timeforQuery;
	// 头像路径
	private String headerUrl;

	// 用户所在市名称
	private String cityOrgName;

	/** IMSI号 */
	private String imsi;
	/** 是否验证IMSI号 */
	private boolean isValidatorImsi;

	/** 是否四级平台账号 */
	private boolean isFourthAccount;
	private int ignoreIsFourthAccountOrNot;

	/** 是否GPS定位 */
	private boolean isGps;
	private int gpsOrNot;
	/** 是否四支队伍 */
	private boolean isFourTeams;
	private int fourTeamsOrNot;
	/** 在线状态 */
	private boolean isLogin;
	/** 在线类型 */
	private ClientType clientType = ClientType.PC;
	/** 帐户类型 (高级搜索) */
	private int accountType;
	/** 在线状态 (高级搜索) */
	private int onLineState;

	/** 高级搜索中获取是否锁定的值 */
	private int searchLockVal;

	/** 二维码列表 */
	private List<QrcodeDomain> qrcodeList = new ArrayList<QrcodeDomain>();

	/** 手机端 版本号 */
	private String mobileVersion;

	/** 手机端 内部版本号 */
	private String mobileInnerVersion;

	/** 账号激活时间 */
	private Date activationTime;
	/** 账号状态（待激活1，正常2，停用3） */
	private Long state;

	public int getSearchLockVal() {
		return searchLockVal;
	}

	public void setSearchLockVal(int searchLockVal) {
		this.searchLockVal = searchLockVal;
	}

	public boolean isFourthAccount() {
		return isFourthAccount;
	}

	public void setFourthAccount(boolean isFourthAccount) {
		this.isFourthAccount = isFourthAccount;
	}

	public Date getTimeforQuery() {
		return timeforQuery;
	}

	public boolean isPcusable() {
		return pcusable;
	}

	public void setPcusable(boolean pcusable) {
		this.pcusable = pcusable;
	}

	public boolean isMobileusable() {
		return mobileusable;
	}

	public void setMobileusable(boolean mobileusable) {
		this.mobileusable = mobileusable;
	}

	public void setTimeforQuery(Date timeforQuery) {
		this.timeforQuery = timeforQuery;
	}

	/** 是否第一次登录工作台 */
	private Boolean isFristWorkBench;

	public int getIgnoreIsAdminOrNot() {
		return ignoreIsAdminOrNot;
	}

	public void setIgnoreIsAdminOrNot(int ignoreIsAdminOrNot) {
		this.ignoreIsAdminOrNot = ignoreIsAdminOrNot;
	}

	public int getIgnoreIsShutDownOrNot() {
		return ignoreIsShutDownOrNot;
	}

	public void setIgnoreIsShutDownOrNot(int ignoreIsShutDownOrNot) {
		this.ignoreIsShutDownOrNot = ignoreIsShutDownOrNot;
	}

	public boolean isConnectVpdn() {
		return connectVpdn;
	}

	public void setConnectVpdn(boolean connectVpdn) {
		this.connectVpdn = connectVpdn;
	}

	public boolean getHasNewMessage() {
		return hasNewMessage;
	}

	public void setHasNewMessage(boolean hasNewMessage) {
		this.hasNewMessage = hasNewMessage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isChangePassword() {
		return changePassword;
	}

	public void setChangePassword(boolean changePassword) {
		this.changePassword = changePassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JSON(serialize = false, deserialize = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullPinyin() {
		if (fullPinyin != null && fullPinyin.length() > 30) {
			return fullPinyin.substring(0, 30);
		}
		return fullPinyin;
	}

	public void setFullPinyin(String fullPinyin) {
		if (fullPinyin != null && fullPinyin.length() > 30) {
			fullPinyin = fullPinyin.substring(0, 30);
		}
		this.fullPinyin = fullPinyin;
	}

	public String getSimplePinyin() {
		if (simplePinyin != null && simplePinyin.length() > 10) {
			return simplePinyin.substring(0, 10);
		}
		return simplePinyin;
	}

	public void setSimplePinyin(String simplePinyin) {
		if (simplePinyin != null && simplePinyin.length() > 10) {
			simplePinyin = simplePinyin.substring(0, 10);
		}
		this.simplePinyin = simplePinyin;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWorkCompany() {
		return workCompany;
	}

	public void setWorkCompany(String workCompany) {
		this.workCompany = workCompany;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public boolean isLock() {
		return isLock;
	}

	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public List<Organization> getMultiZone() {
		return multiZone;
	}

	public void setMultiZone(List<Organization> multiZone) {
		this.multiZone = multiZone;
	}

	public Long getCredits1() {
		return credits1;
	}

	public void setCredits1(Long credits1) {
		this.credits1 = credits1;
	}

	public Long getCredits2() {
		return credits2;
	}

	public void setCredits2(Long credits2) {
		this.credits2 = credits2;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPreviousLoginTime() {
		return previousLoginTime;
	}

	public void setPreviousLoginTime(Date previousLoginTime) {
		this.previousLoginTime = previousLoginTime;
	}

	public String getPreviousLoginIp() {
		return previousLoginIp;
	}

	public void setPreviousLoginIp(String previousLoginIp) {
		this.previousLoginIp = previousLoginIp;
	}

	public String getOrgInternalCode() {
		return orgInternalCode;
	}

	public void setOrgInternalCode(String orgInternalCode) {
		this.orgInternalCode = orgInternalCode;
	}

	public Integer getFailureTimes() {
		return failureTimes;
	}

	public void setFailureTimes(Integer failureTimes) {
		this.failureTimes = failureTimes;
	}

	public String getVpdn() {
		return vpdn;
	}

	public void setVpdn(String vpdn) {
		this.vpdn = vpdn;
	}

	public boolean isShutDown() {
		return isShutDown;
	}

	public void setShutDown(boolean isShutDown) {
		this.isShutDown = isShutDown;
	}

	public Boolean getIsFristWorkBench() {
		return isFristWorkBench;
	}

	public void setIsFristWorkBench(Boolean isFristWorkBench) {
		this.isFristWorkBench = isFristWorkBench;
	}

	public String getHeaderUrl() {
		return headerUrl;
	}

	public void setHeaderUrl(String headerUrl) {
		this.headerUrl = headerUrl;
	}

	public String getCityOrgName() {
		return cityOrgName;
	}

	public void setCityOrgName(String cityOrgName) {
		this.cityOrgName = cityOrgName;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public boolean isValidatorImsi() {
		return isValidatorImsi;
	}

	public void setValidatorImsi(boolean isValidatorImsi) {
		this.isValidatorImsi = isValidatorImsi;
	}

	public int getIgnoreIsFourthAccountOrNot() {
		return ignoreIsFourthAccountOrNot;
	}

	public void setIgnoreIsFourthAccountOrNot(int ignoreIsFourthAccountOrNot) {
		this.ignoreIsFourthAccountOrNot = ignoreIsFourthAccountOrNot;
	}

	public List<QrcodeDomain> getQrcodeList() {
		return qrcodeList;
	}

	public void setQrcodeList(List<QrcodeDomain> qrcodeList) {
		this.qrcodeList = qrcodeList;
	}

	public String getEncryptId() {
		return BaseDomainIdEncryptUtil.encryptDomainId(super.getId(), null,
				null);
	}

	public String getMobileVersion() {
		return mobileVersion;
	}

	public void setMobileVersion(String mobileVersion) {
		this.mobileVersion = mobileVersion;
	}

	public String getMobileInnerVersion() {
		return mobileInnerVersion;
	}

	public void setMobileInnerVersion(String mobileInnerVersion) {
		this.mobileInnerVersion = mobileInnerVersion;
	}

	public boolean isFourTeams() {
		return isFourTeams;
	}

	public void setFourTeams(boolean isFourTeams) {
		this.isFourTeams = isFourTeams;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public int getFourTeamsOrNot() {
		return fourTeamsOrNot;
	}

	public void setFourTeamsOrNot(int fourTeamsOrNot) {
		this.fourTeamsOrNot = fourTeamsOrNot;
	}

	public boolean isGps() {
		return isGps;
	}

	public void setGps(boolean isGps) {
		this.isGps = isGps;
	}

	public int getGpsOrNot() {
		return gpsOrNot;
	}

	public void setGpsOrNot(int gpsOrNot) {
		this.gpsOrNot = gpsOrNot;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public int getOnLineState() {
		return onLineState;
	}

	public void setOnLineState(int onLineState) {
		this.onLineState = onLineState;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatePswTime() {
		return updatePswTime;
	}

	public void setUpdatePswTime(Date updatePswTime) {
		this.updatePswTime = updatePswTime;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getActivationTime() {
		return activationTime;
	}

	public void setActivationTime(Date activationTime) {
		this.activationTime = activationTime;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

}
