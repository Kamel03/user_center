package com.tianque.sysadmin.service.impl;

/**
 * tianque-com.tianque.core.user.service-PermissionServiceImpl.java Created on Mar 19, 2010
 * Copyright (c) 2010 by 杭州天阙科技有限公司
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.component.SessionManager;
import com.tianque.controller.mode.MoveMode;
import com.tianque.core.Constants;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.systemLog.service.SystemLogService;
import com.tianque.core.systemLog.util.ModelType;
import com.tianque.core.systemLog.util.OperatorType;
import com.tianque.core.util.CalendarUtil;
import com.tianque.core.util.Chinese2pinyin;
import com.tianque.core.util.DialogMode;
import com.tianque.core.util.EncryptUtil;
import com.tianque.core.util.ObjectToJSON;
import com.tianque.core.util.StringUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Organization;
import com.tianque.domain.Permission;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.Role;
import com.tianque.domain.Session;
import com.tianque.domain.User;
import com.tianque.domain.property.OrganizationLevel;
import com.tianque.domain.property.OrganizationType;
import com.tianque.domain.property.SpecialGroupsContextYinchuan;
import com.tianque.domain.vo.UserCountAboutVo;
import com.tianque.domain.vo.UserCountVo;
import com.tianque.domain.vo.UserVo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.init.Node;
import com.tianque.mobile.vo.PermissionVo;
import com.tianque.service.impl.LogableService;
import com.tianque.sysadmin.dao.PermissionDao;
import com.tianque.sysadmin.dao.RoleDao;
import com.tianque.sysadmin.dao.UserDao;
import com.tianque.sysadmin.listerner.UserListerner;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PermissionService;
import com.tianque.sysadmin.service.PropertyDictService;
import com.tianque.sysadmin.vo.PermissionType;
import com.tianque.sysadmin.vo.RoleVo;
import com.tianque.workBench.patelConfiger.service.PatelService;

/**
 * Title: ***<br>
 * 
 * @author <a href=mailto:nifeng@hztianque.com>倪峰</a><br>
 * @description ***<br/>
 * @version 1.0
 */
@Service("permissionService")
@Transactional
public class PermissionServiceImpl extends LogableService implements
		PermissionService {

	public final static Logger logger = LoggerFactory
			.getLogger(PermissionServiceImpl.class);

	@Autowired
	private CacheService cacheService;
	@Autowired
	private PropertyDictService propertyDictService;
	@Autowired
	private SessionManager sessionManager;
	@Autowired
	private SystemLogService systemLogService;
	@Autowired
	private PatelService patelService;
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private PermissionDao permissionDao;
	@Autowired
	private OrganizationService organizationService;
	
	// @Autowired
	// private RoleUpdateLogService roleUpdateLogService;

	@Autowired
	private Map<String, UserListerner> listerners;

	private Collection<UserListerner> getUserListers() {
		if (null == listerners) {
			return new ArrayList();
		}
		return listerners.values();
	}

	@Override
	@Transactional
	public User addUser(User user) {
		PermissionServiceHelper.checkAddUser(user);
		String str = user.getUserName();
		if ("".equals(str)) {
			throw new BusinessValidationException("用户名输入不正确！");
		}
		if (-1 != str.indexOf(".", 1)) {
			user.setVpdn(str);
			user.setUserName(str.substring(0, str.indexOf(".", 1)));
		}
		// 不要改顺序
		if (this.findUserByUserName(user.getUserName()) != null) {
			throw new BusinessValidationException("用户名已存在！");
		}
		// 当
		
		user.setPassword(EncryptUtil.md5Encrypt(user.getPassword()));
		if (user.getName() != null) {
			Map<String, String> map = Chinese2pinyin.changeChinese2Pinyin(user
					.getName());
			user.setFullPinyin(map.get("fullPinyin"));
			user.setSimplePinyin(map.get("simplePinyin"));
		}
		if (user.getState() != null) {
			user.setState(user.getState());
		} else {
			user.setState(Constants.UserState.WITHACTIVATION_STATE);
		}
		if (user.getOrganization() != null) {
			Organization organization = organizationService
					.getSimpleOrgById(user.getOrganization().getId());
			user.setOrgInternalCode(organization.getOrgInternalCode());
		}
		user = userDao.addUser(user);
		if (user.getOrganization() != null) {
			Organization organization = organizationService
					.getSimpleOrgById(user.getOrganization().getId());
			user.setOrganization(organization);
		}

		for (UserListerner listerner : getUserListers()) {
			listerner.addUser(user);
		}
		return user;
	}

	@Override
	@Transactional(readOnly = true)
	public List<PermissionVo> findUserAllPermissionEnameAndCnameByUserId(
			Long userId) {
		return permissionDao.findUserAllPermissionEnameAndCnameByUserId(userId);
	}

	@Override
	public String[][] findUserForAutocomplete(Long parentOrgId, String text,
			Boolean locked, boolean searchChildOrg, int size) {

		if (text == null || text.trim().length() == 0 || size < 1)
			return null;
		text = text.replaceAll("%", "");
		text = text.replaceAll("\\?", "");
		if (text.trim().length() == 0)
			return null;

		if (parentOrgId == null) {
			Session session = ThreadVariable.getSession();
			User currentUser = userDao.getSimpleUserById(session.getUserId());
			parentOrgId = currentUser.getOrganization().getId();
		}

		List<User> users = null;
		if (searchChildOrg) {
			Organization root = organizationService
					.getSimpleOrgById(parentOrgId);
			users = userDao.findUserForAutocompleteByLikeOrgInternalCode(
					root.getOrgInternalCode(), text, locked, size);
		} else {
			users = userDao.findUserForAutocompleteByParentOrgId(parentOrgId,
					text, locked, size);
		}

		return getUserAutocompleteValue(users);
	}

	private String[][] getUserAutocompleteValue(List<User> users) {
		if (users == null) {
			return null;
		}
		String[][] result = new String[users.size()][5];
		Long[] orgIds = new Long[users.size()];
		for (int index = 0; index < orgIds.length; index++) {
			orgIds[index] = users.get(index).getOrganization().getId();
		}
		Map<Long, String> orgNames = organizationService
				.getOrganizationDisplayName(orgIds);
		for (int index = 0; index < result.length; index++) {
			User user = users.get(index);
			result[index][0] = user.getId().toString();
			result[index][1] = user.getUserName();
			result[index][2] = user.getName();
			result[index][3] = user.getOrganization() == null ? "" : orgNames
					.get(user.getOrganization().getId());
			result[index][4] = user.getOrganization() == null ? "" : user
					.getOrganization().getId() + "";
		}
		return result;
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		User userUpdate = userDao.getSimpleUserById(user.getId());
		PermissionServiceHelper.checkUpdateUser(userUpdate);
		userUpdate.setAdmin(user.isAdmin());
		userUpdate.setChangePassword(user.isChangePassword());
		userUpdate.setHasNewMessage(user.getHasNewMessage());
		userUpdate.setHomePhone(user.getHomePhone());
		userUpdate.setUserName(user.getUserName());
		userUpdate.setName(user.getName());
		userUpdate.setMobile(user.getMobile());
		userUpdate.setWorkCompany(user.getWorkCompany());
		userUpdate.setWorkPhone(user.getWorkPhone());
		userUpdate.setRoles(user.getRoles());
		userUpdate.setMultiZone(user.getMultiZone());
		userUpdate.setLastLoginIp(user.getLastLoginIp());
		userUpdate.setLastLoginTime(user.getLastLoginTime());
		userUpdate.setPreviousLoginIp(user.getPreviousLoginIp());
		userUpdate.setPreviousLoginTime(user.getPreviousLoginTime());
		userUpdate.setValidatorImsi(user.isValidatorImsi());
		userUpdate.setFourthAccount(user.isFourthAccount());
		userUpdate.setImsi(user.getImsi());
		userUpdate.setGps(user.isGps());
		userUpdate.setFourTeams(user.isFourTeams());
		Map<String, String> map = Chinese2pinyin.changeChinese2Pinyin(user
				.getName());
		userUpdate.setFullPinyin(map.get("fullPinyin"));
		userUpdate.setSimplePinyin(map.get("simplePinyin"));
		userUpdate.setShutDown(user.isShutDown());
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getUser().isAdmin()) {
			userUpdate.setConnectVpdn(user.isConnectVpdn());
			userUpdate.setPcusable(user.isPcusable());
			userUpdate.setMobileusable(user.isMobileusable());
		}
		userUpdate.setState(user.getState());
		String userName = user.getUserName();
		if ("".equals(userName)) {
			throw new BusinessValidationException("用户名输入不正确！");
		}
		user = userDao.updateUser(userUpdate);
		for (UserListerner listerner : getUserListers()) {
			listerner.update(user);
		}
		return user;
	}
	@Override
	public User updateUserFromGridTeam(User user){
		return userDao.updateUserFromGridTeam(user);
	}
	/**
	 * 
	 * @Title: updateUserForMobile
	 * @Description: TODO手机端 更新用户信息
	 * @param @param user
	 * @param @return 设定文件
	 * @return User 返回类型
	 * @author wanggz
	 * @date 2014-8-6 下午03:57:28
	 */
	@Override
	@Transactional
	public User updateUserForMobile(User user) {
		try {
			User userUpdate = userDao.getSimpleUserById(user.getId());
			PermissionServiceHelper.checkUpdateUser(userUpdate);
			userUpdate.setHomePhone(user.getHomePhone());
			userUpdate.setName(user.getName());
			userUpdate.setMobile(user.getMobile());
			userUpdate.setWorkCompany(user.getWorkCompany());
			userUpdate.setWorkPhone(user.getWorkPhone());
			Map<String, String> map = Chinese2pinyin.changeChinese2Pinyin(user
					.getName());
			userUpdate.setFullPinyin(map.get("fullPinyin"));
			userUpdate.setSimplePinyin(map.get("simplePinyin"));

			if (ThreadVariable.getUser() != null
					&& ThreadVariable.getUser().isAdmin()) {
				userUpdate.setConnectVpdn(user.isConnectVpdn());
				userUpdate.setPcusable(user.isPcusable());
				userUpdate.setMobileusable(user.isMobileusable());
			}
			userUpdate.setState(user.getState());
			String userName = user.getUserName();
			if ("".equals(userName)) {
				throw new BusinessValidationException("用户名输入不正确！");
			}
			user = userDao.updateUser(userUpdate);
			for (UserListerner listerner : getUserListers()) {
				listerner.update(user);
			}
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的updateUserForMobile方法出现异常，原因：",
					"修改手机账号数错误", e);
		}
		return user;
	}

	@Autowired
	private SystemLogService systemhighLogService;

	public SystemLogService getSystemhighLogService() {
		return systemhighLogService;
	}

	public void setSystemhighLogService(SystemLogService systemhighLogService) {
		this.systemhighLogService = systemhighLogService;
	}

	@Override
	@Transactional
	public String resetUserPasswordByUserName(String userName, String password) {
		String md5Password = EncryptUtil.md5Encrypt(password);
		userDao.resetUserPasswordByUserName(userName, md5Password);
		User user = userDao.getFullUserByUserName(userName);
		sessionManager.validateUserSessionByUserName(user.getUserName());
		resetUserPasswordListerner(userName, md5Password);
		return password;
	}

	@Override
	@Transactional
	public void resetUserPasswordByUserId(Long userId, String password) {
		try {
			String md5Password = EncryptUtil.md5Encrypt(password);
			User oldUser = userDao.getSimpleUserById(userId);
			userDao.resetUserPasswordByUserId(userId, md5Password);

			User user = userDao.getSimpleUserById(userId);
			sessionManager.validateUserSessionByUserName(user.getUserName());

			resetUserPasswordListerner(user.getUserName(), md5Password);
			systemLogService.log(
					com.vladium.logging.Logger.INFO,
					ModelType.USER,
					OperatorType.UPDATE,
					ThreadVariable.getSession().getUserName() + "重置"
							+ oldUser.getUserName() + "的密码",
					ObjectToJSON.convertJSON(oldUser));
		} catch (Exception e) {
			throw new ServiceValidationException("操作出现错误", e);
		}
	}

	@Override
	@Transactional
	public void deleteRoleById(Long id) {
		Role role = findRoleById(id);
		PropertyDict doamin = propertyDictService.getPropertyDictById(role
				.getUseInLevel().getId());
		roleDao.deleteRoleById(id);
		systemLogService.log(
				INFO,
				ModelType.ROLES,
				OperatorType.DELETE,
				ThreadVariable.getSession().getUserName() + "删除岗位"
						+ role.getRoleName() + ",应用层级:"
						+ doamin.getDisplayName(),
				ObjectToJSON.convertJSON(role));
	}

	@Override
	@Transactional(readOnly = true)
	public PageInfo<Role> findAllRolesByUseInLevelForPage(int pageNum,
			int pageSize, Long useInLevel, String sortField, String order) {
		return roleDao.findAllRolesByUseInLevelForPage(pageNum, pageSize,
				useInLevel, sortField, order);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public PageInfo<Permission> findAllPermissionsForPage(int pageNum,
			int pageSize) {
		return permissionDao.findAllPermissionsForPage(pageNum, pageSize);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Permission> findAllPermissionsByRoleId(Long roleId) {
		return permissionDao.findPermissionsByRoleId(roleId);

	}

	@Override
	@Transactional
	public void deleteUserMultiZoneByUserId(Long userId) {
		userDao.deleteUserMultiZoneByUserId(userId);
	}

	@Override
	@Transactional
	public void deleteUserRoleRelasByUserId(Long userId) {
		userDao.deleteUserRoleRelasByUserId(userId);
	}

	@Override
	@Transactional
	public Long addUserMultiZone(Long userId, Long orgId) {
		return userDao.addUserMultiZone(userId, orgId);
	}

	@Override
	@Transactional
	public Long addUserRoleRela(Long userId, Long roleId) {
		return userDao.addUserRoleRela(userId, roleId);
	}

	@Override
	@Transactional(readOnly = true)
	public Role findRoleById(Long id) {
		return roleDao.getSimpleRoleById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<String> findUserAllPermissionEnameByUserId(Long userId) {
		return permissionDao.findPermissionsEnameByUserId(userId);
	}

	@Override
	@Transactional(readOnly = true)
	public User getSimpleUserById(Long id) {
		return userDao.getSimpleUserById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public User getFullUserById(Long id) {
		return userDao.getFullUserById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Role> findRolesByUserId(Long userId) {
		return roleDao.findRolesByUserId(userId);
	}

	@Override
	@Transactional(readOnly = true)
	public User findUserByUserName(String userName) {
		if (-1 != (userName == null ? "" : userName).indexOf(".", 1)) {
			userName = userName.substring(0, userName.indexOf(".", 1));
		}
		return userDao.findUserByUserName(userName);
	}

	public List<User> findChildUsersByEnameAndOrgCode(String ename,
			String orgcode) {
		return userDao.findChildUsersByEnameAndOrgCode(ename, orgcode);
	}

	public List<User> findChildUsersByEnameAndInternalCode(String ename,
			String internalCode) {
		return userDao
				.findChildUsersByEnameAndInternalCode(ename, internalCode);
	}

	public List<User> findChildUsersByEnameAndParentOrgId(String ename,
			long orgid) {
		return userDao.findChildUsersByEnameAndParentOrgId(ename, orgid);
	}

	@Override
	@Transactional
	public boolean updatePasswordSuccess(Long id, String oldPassword,
			String currentPassword, String validatePassword, String email) {
		if (id == null || oldPassword == null || currentPassword == null
				|| validatePassword == null) {
			return false;
		}
		if (!validatePassword.equals(currentPassword)) {
			return false;
		}
		User user = userDao.getSimpleUserById(id);
		if (user == null) {
			return false;
		}
		if (EncryptUtil.md5Encrypt(oldPassword).equals(user.getPassword())) {
			String md5Password = EncryptUtil.md5Encrypt(currentPassword);
			userDao.updateUserPassword(id, md5Password, email);

			resetUserPasswordListerner(user.getUserName(), md5Password);
			return true;
		}
		return false;
	}

	private void resetUserPasswordListerner(String userName, String md5Password) {
		for (UserListerner listerner : getUserListers()) {
			listerner.resetUserPassword(userName, md5Password);
		}
	}

	@Override
	@Transactional
	public Role addRole(Role role, String[] enames) {
		role.setCreateUser(ThreadVariable.getSession().getUserName());
		role.setCreateDate(Calendar.getInstance().getTime());
		role = roleDao.addRole(role);
		if (enames != null && enames.length > 0) {
			List<Permission> permissions = permissionDao
					.findPermissionsByEnames(enames);
			Long[] permissionIds = new Long[permissions.size()];
			for (int i = 0; i < permissions.size(); i++) {
				Permission permission = permissions.get(i);
				permissionIds[i] = permission.getId();
			}
			addRolePermissionRelas(role.getId(), permissionIds);
		}
		if (role.getUseInLevel() != null
				&& role.getUseInLevel().getId() != null) {
			PropertyDict propertyDict = propertyDictService
					.getPropertyDictById(role.getUseInLevel().getId());
			role.setDisplayName(propertyDict.getDisplayName());
		}
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {
			PropertyDict doamin = propertyDictService.getPropertyDictById(role
					.getUseInLevel().getId());
			systemLogService.log(
					INFO,
					ModelType.ROLES,
					OperatorType.ADD,
					ThreadVariable.getSession().getUserName() + "新增岗位"
							+ role.getRoleName() + ",应用层级:"
							+ doamin.getDisplayName(),
					ObjectToJSON.convertJSON(role));
		}
		return role;
	}

	@Override
	@Transactional
	public Role updateRole(Role role, String[] enames) {
		role.setUpdateUser(ThreadVariable.getSession().getUserName());
		role.setUpdateDate(Calendar.getInstance().getTime());
		role = roleDao.updateRole(role);

		roleDao.deleteRolePermissionRelasByRoleId(role.getId());
		if (enames == null || enames.length == 0) {
			return role;
		}
		List<Permission> permissions = permissionDao
				.findPermissionsByEnames(enames);
		Long[] permissionIds = new Long[permissions.size()];
		for (int i = 0; i < permissions.size(); i++) {
			Permission permission = permissions.get(i);
			permissionIds[i] = permission.getId();
		}
		addRolePermissionRelas(role.getId(), permissionIds);
		PropertyDict propertyDict = propertyDictService
				.getPropertyDictById(role.getUseInLevel().getId());
		role.setDisplayName(propertyDict.getDisplayName());
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {

			PropertyDict doamin = propertyDictService.getPropertyDictById(role
					.getUseInLevel().getId());
			systemLogService.log(
					INFO,
					ModelType.ROLES,
					OperatorType.UPDATE,
					ThreadVariable.getSession().getUserName() + "修改岗位"
							+ role.getRoleName() + ",应用层级:"
							+ doamin.getDisplayName(),
					ObjectToJSON.convertJSON(role));
		}
		return role;
	}

	private void addRolePermissionRelas(Long roleId, Long[] permissionIds) {
		roleDao.addRolePermissionRelas(roleId, permissionIds);
	}

	@Override
	public Role findRoleByRoleNameAndUserInLevel(String roleName, Long levelId) {
		List<Role> roles = this.roleDao.findRolesByRoleNameAndUserInLevel(
				roleName, levelId);
		if (roles == null || roles.size() == 0) {
			return null;
		}
		return roles.get(0);
	}

	@Override
	@Transactional(readOnly = true)
	public PageInfo<User> findUsersForPageByUserIdAndOrgIdAndLockState(
			Long userId, Long orgId, boolean findChild, Boolean locked,
			User usr, String roleIds, int pageNum, int pageSize,
			String sortField, String order) {
		if (userId != null && userId > 0) {
			// User user = userDao.getSimpleUserById(userId);
			User user = userDao.getFullUserById(userId);
			user.setOrganization(organizationService.getOrgAndLevelInfo(user
					.getOrganization().getId()));
			List<User> list = new ArrayList<User>();
			list.add(user);
			PageInfo<User> pageInfo = new PageInfo<User>();
			pageInfo.setResult(list);
			pageInfo.setTotalRowSize(1);
			pageInfo.setCurrentPage(pageNum);
			pageInfo.setPerPageSize(pageSize);
			return pageInfo;
		}
		if (findChild) {
			return userDao.findUsersForPageByOrgInternalCodeAndLockState(
					organizationService.getSimpleOrgById(orgId)
							.getOrgInternalCode(), locked, usr, roleIds,
					pageNum, pageSize, sortField, order);
		} else {
			return userDao.findUsersForPageByOrgIdAndLockState(orgId, locked,
					roleIds, pageNum, pageSize, sortField, order, usr);
		}
	}

	@Override
	public boolean isRoleUsed(Long id) {
		return this.userDao.getUsedRoleCount(id) != 0;
	}

	@Override
	public void lockOperate(Long id, boolean lock) {
		User user = this.userDao.getSimpleUserById(id);
		if (user.isAdmin()) {
			throw new BusinessValidationException("超级管理员不能进行锁定或者解锁操作!");
		}
		if (lock) {
			sessionManager.validateUserSessionByUserName(user.getUserName());
		} else {
			// 如果是解锁操作，就清楚登录失败次数
			updateFailureTimesById(id, 0);
		}
		this.userDao.updateIsLockById(id, lock);
		if (ThreadVariable.getSession() != null && lock == true) {
			systemLogService.log(
					INFO,
					ModelType.USER,
					OperatorType.LOCK,
					ThreadVariable.getSession().getUserName() + "锁定用户"
							+ user.getUserName(),
					ObjectToJSON.convertJSON(user));
		}
		if (ThreadVariable.getSession() != null && lock == false) {
			systemLogService.log(
					INFO,
					ModelType.USER,
					OperatorType.UNLOCK,
					ThreadVariable.getSession().getUserName() + "对"
							+ user.getUserName() + "解锁",
					ObjectToJSON.convertJSON(user));
		}
	}

	@Override
	public boolean isUserHasPermission(Long userId, String ename) {
		User user = this.userDao.getSimpleUserById(userId);
		if (user.isAdmin()) {
			return true;
		}
		List<String> permissionList = permissionDao
				.findPermissionsEnameByUserId(userId);
		return permissionList.contains(ename);
	}

	@Override
	public void updateUserMultiZone(Long userId, Long[] zoneIds) {
		if (zoneIds == null || zoneIds.length == 0) {
			userDao.deleteMultizoneByUserId(userId);
			return;
		}
		List<Organization> multizones = organizationService
				.findMultizonesByUserId(userId);
		List<Long> userMultiZoneIds = new ArrayList<Long>();
		List<Long> addZoneIds = new ArrayList<Long>();
		List<Long> deleteZoneIds = new ArrayList<Long>();
		for (Organization organization : multizones) {
			int index = Arrays.binarySearch(zoneIds, organization.getId());
			if (index < 0) {
				deleteZoneIds.add(organization.getId());
			}
			userMultiZoneIds.add(organization.getId());
		}
		for (Long zoneId : zoneIds) {
			int index = Arrays.binarySearch(userMultiZoneIds.toArray(), zoneId);
			if (index < 0) {
				addZoneIds.add(zoneId);
			}
		}
		if (deleteZoneIds.size() > 0) {
			userDao.deleteMultizoneByUserIdAndZoneIds(userId, deleteZoneIds);
		}
		if (addZoneIds.size() > 0) {
			for (Long zoneId : addZoneIds)
				userDao.addMultizoneByUserIdAndZoneId(userId, zoneId);
		}
	}

	@Override
	public void updateUserRoleRela(Long userId, Long[] roleIds) {
		if (roleIds == null || roleIds.length == 0) {
			userDao.deleteUserRoleRelasByUserId(userId);
			return;
		}
		List<Role> roles = roleDao.findRolesByUserId(userId);
		List<Long> userRoleIds = new ArrayList<Long>();
		List<Long> addRoleIds = new ArrayList<Long>();
		List<Long> deleteRoleIds = new ArrayList<Long>();
		Arrays.sort(roleIds);
		for (Role role : roles) {
			int index = Arrays.binarySearch(roleIds, role.getId());
			if (index < 0) {
				deleteRoleIds.add(role.getId());
			}
			userRoleIds.add(role.getId());
		}
		for (Long roleId : roleIds) {
			int index = Arrays.binarySearch(userRoleIds.toArray(), roleId);
			if (index < 0) {
				addRoleIds.add(roleId);
			}
		}
		if (deleteRoleIds.size() > 0) {
			userDao.deleteRoleByUserIdAndRoleIds(userId, deleteRoleIds);
		}
		if (addRoleIds.size() > 0) {
			for (Long roleId : addRoleIds)
				userDao.addRoleByUserIdAndRoleId(userId, roleId);
		}
	}

	@Override
	public int countUsersByOrgInternalCode(String orgInternalCode) {
		return userDao.countUsersByOrgInternalCode(orgInternalCode);
	}

	@Override
	public void updateFailureTimesById(Long userId, Integer failureTimes) {
		userDao.updateFailureTimesById(userId, failureTimes);
	}

	@Override
	public List<Role> findRolesByUserInLevel(Long levelId) {
		List<Role> roles = roleDao.findRolesByRoleNameAndUserInLevel(null,
				levelId);
		return roles;
	}

	@Override
	public List<Role> findRolesByUserInLevel(String roleName, Long levelId) {
		if ("".equals(roleName)) {
			roleName = null;
		}
		List<Role> roles = roleDao.findRolesByRoleNameAndUserInLevel(roleName,
				levelId);
		return roles;
	}

	@Override
	public List<Role> findDirectlyChildRolesByUseInLevel(Long useInLevel) {
		return roleDao.findDirectlyChildRolesByUseInLevel(useInLevel);
	}

	@Override
	public List<Role> findAllChildRolesByUseInLevel(Long useInLevel) {
		return roleDao.findAllChildRolesByUseInLevel(useInLevel);
	}

	@Override
	public List<Role> findRolesByUserInLevelNoAdmin(Long levelId) {
		List<Role> roles = roleDao.findRolesByRoleNameAndUserInLevelNoAdmin(
				null, levelId);
		return roles;
	}

	@Override
	public List<Role> findDirectlyChildRolesByUseInLevelNoAdmin(Long useInLevel) {
		return roleDao.findDirectlyChildRolesByUseInLevelNoAdmin(useInLevel);
	}

	@Override
	public List<Role> findAllChildRolesByUseInLevelNoAdmin(Long useInLevel) {
		return roleDao.findAllChildRolesByUseInLevelNoAdmin(useInLevel);
	}

	@Override
	public List<Role> findRolesByUserIdAndUseInLevel(Long userId,
			Long useInLevel) {
		return roleDao.findRolesByUserIdAndUseInLevel(userId, useInLevel);
	}

	@Override
	public List<Role> findRolesByRoleNameAndUserIdAndUseInLevel(
			String roleName, Long userId, Long useInLevel) {
		if ("".equals(roleName)) {
			roleName = null;
		}
		return roleDao.findRolesByRoleNameAndUserIdAndUseInLevel(roleName,
				userId, useInLevel);
	}

	@Override
	public boolean updateUserDetails(User user) {
		if (user == null || user.getId() == null || user.getUserName() == null
				|| user.getName() == null || user.getMobile() == null
				|| user.getWorkPhone() == null
				|| user.getWorkCompany().length() > 30) {
			return false;
		}
		User userCheck = userDao.getSimpleUserById(user.getId());
		if (userCheck == null) {
			return false;
		}
		userDao.updateUserDetails(user);
		systemLogService.log(com.vladium.logging.Logger.INFO, ModelType.USER,
				OperatorType.UPDATE, user.getUserName() + "修改个人信息",
				ObjectToJSON.convertJSON(user));
		for (UserListerner listerner : getUserListers()) {
			listerner.update(user);
		}
		return true;
	}

	@Override
	public List<User> findUsersByOrgId(Long id) {
		return userDao.findUsersByOrgId(id);
	}

	@Override
	public List<Permission> getRootPermissions() {
		return permissionDao.getRootPermissions();
	}

	@Override
	public List<Permission> getPermissionByParentId(Long parentId) {
		return permissionDao.getPermissionByParentId(parentId);
	}

	@Override
	public List<Permission> getPermissionByParentId(Long parentId, Long userId) {
		return permissionDao.getPermissionByParentIdAnduserId(parentId, userId);
	}

	@Override
	public PageInfo<Permission> getChildPermissions(Long parentId) {
		if (parentId != null) {
			List<Permission> list = new ArrayList<Permission>();
			Long userId = ThreadVariable.getUser().getId();
			if (getSimpleUserById(userId).isAdmin()) {
				/** 由于岗位新增修改时不需要领导视图的权限所以为权限管理新增一个方法 */
				list = permissionDao
						.getPermissionByParentIdToPermissionTree(parentId);
			} else {
				list = permissionDao.getPermissionByParentIdAnduserId(parentId,
						userId);
			}

			PageInfo<Permission> pageInfo = new PageInfo<Permission>();
			pageInfo.setResult(list);
			pageInfo.setTotalRowSize(1);
			pageInfo.setCurrentPage(1);
			pageInfo.setPerPageSize(20);
			return pageInfo;
		}
		return null;
	}

	@Override
	public Permission updatePermissionName(Permission permission) {
		return permissionDao.updatePermissionName(permission);
	}

	/**
	 * 递归向表中插入indexId数据
	 * 
	 * @author 傅豪
	 * @param parentId
	 */
	@Override
	public void setIndexIdPermission(Long parentId) {
		List<Permission> permissions = new ArrayList<Permission>();
		Long userId = ThreadVariable.getUser().getId();
		if (-1 == parentId) { // 传入-1表示没有parentId
			permissions = permissionDao.getRootPermissions();// 是根目录
		} else {
			permissions = permissionDao.getPermissionByParentIdAnduserId(
					parentId, userId);// 获取parentId以下的permissions
		}
		for (int i = 0; i < permissions.size(); i++) {
			permissionDao.updatePermissionIndexId(permissions.get(i).getId(),
					Long.parseLong(new Integer(i).toString()));// 更改返回数据中的每一行的数据
			// 递归停止条件
			if (permissionDao.getPermissionByParentIdAnduserId(
					permissions.get(i).getId(), userId) != null
					&& permissionDao.getPermissionByParentIdAnduserId(
							permissions.get(i).getId(), userId).size() != 0) {
				setIndexIdPermission(permissions.get(i).getId());
			}
		}
	}

	@Override
	public Permission getPermissionByPermissionId(Long id) {
		return permissionDao.getSimplePermissionById(id);
	}

	@Override
	public boolean movePreviousOrNext(Permission p, String mode) {
		Long parentId = null;
		if (null != p.getParent()) {
			parentId = p.getParent().getId();
		}

		long indexId = permissionDao.getPermissionIndexIdById(p.getId());

		Permission passivPermission;// 被动改变的元素
		if (mode.equals(MoveMode.TO_PREVIOUS)) {
			if (indexId == 0) {
				return true;
			}
			passivPermission = permissionDao.getPermissionByParentIdAndIndexId(
					parentId, indexId - 1);
		} else {
			if (indexId >= permissionDao.countPermissionByParentId(parentId) - 1) {
				return true;
			}
			passivPermission = permissionDao.getPermissionByParentIdAndIndexId(
					parentId, indexId + 1);
		}
		if (mode.equals(MoveMode.TO_PREVIOUS)) {
			permissionDao.updatePermissionIndexId(p.getId(), indexId - 1);
			permissionDao.updatePermissionIndexId(passivPermission.getId(),
					indexId);
		} else {
			permissionDao.updatePermissionIndexId(p.getId(), indexId + 1);
			permissionDao.updatePermissionIndexId(passivPermission.getId(),
					indexId);
		}
		return true;
	}

	@Override
	public boolean moveFirstOrLast(Permission p, String mode) {
		Long parentId = null;
		if (null != p.getParent()) {
			parentId = p.getParent().getId();
		}
		Long indexId = permissionDao.getSimplePermissionById(p.getId())
				.getIndexId();

		Permission passivPermission;// 被动改变的元素

		if (mode.equals(MoveMode.TO_FIRST)) {
			if (indexId == 0) {
				return true;
			}
			passivPermission = permissionDao.getPermissionByParentIdAndIndexId(
					parentId, 0L);
		} else {
			if (indexId >= permissionDao.countPermissionByParentId(parentId) - 1) {
				return true;
			}
			passivPermission = permissionDao.getPermissionByParentIdAndIndexId(
					parentId,
					permissionDao.countPermissionByParentId(parentId) - 1);
		}
		if (mode.equals(MoveMode.TO_FIRST)) {
			permissionDao.updatePermissionIndexId(p.getId(), 0L);
			permissionDao.updatePermissionIndexId(passivPermission.getId(),
					indexId);
		} else {
			permissionDao.updatePermissionIndexId(p.getId(),
					permissionDao.countPermissionByParentId(parentId) - 1);
			permissionDao.updatePermissionIndexId(passivPermission.getId(),
					indexId);
		}
		return true;
	}

	@Override
	public List<Permission> findPermissionsByPermissionName(String name,
			int pageNum, int pageSize) {
		return permissionDao.findPermissionsByPermissionName(name, pageNum,
				pageSize);
	}

	@Override
	public List<Long> searchParentPermissionIds(Long id) {
		List<Long> list = new ArrayList<Long>();
		searchParentId(id, list);
		return list;
	}

	private void searchParentId(Long id, List<Long> returnParentIds) {
		Permission permission = permissionDao.getSimplePermissionById(id);
		if (null == permission.getParent()
				|| null == permission.getParent().getId()) {
			return;
		}
		returnParentIds.add(permission.getParent().getId());
		searchParentId(permission.getParent().getId(), returnParentIds);
	}

	@Override
	public Permission findPermissionByEname(String ename) {
		return permissionDao.findPermissionByEname(ename);
	}

	@Override
	public List<Node> getMenuPermissionTree() {
		List<Node> nodes = (List<Node>) cacheService
				.get(MemCacheConstant.PERMISSION_NAMESPACE, MemCacheConstant
						.getUserPermissionKey(
								MemCacheConstant.USERPERMISSION_KEY,
								ThreadVariable.getUser().getId(),
								MemCacheConstant.USERPERMISSION_KEYPARAME_NOTE));
		if (nodes == null) {
			List<Permission> menuPermissions = findMenuPermissions(ThreadVariable
					.getUser().getId());
			menuPermissions = sortMenuPermissions(null, menuPermissions);
			List<Node> permissionNodes = new ArrayList<Node>();
			int treeLevel = 1;
			for (Permission permissionNode : menuPermissions) {
				Node node = new Node(permissionNode);
				if (null == permissionNode.getParent()) { // 说明为根节点
					node.setLevel(treeLevel);
					node.setLeaf(getChildMenuByEname(permissionNode.getEname())
							.size() == 0);
					permissionNodes.add(node);
					continue;
				}
				// parent为null的不需设置level,children,nodeParent
				setNodeLevel(permissionNode, treeLevel, menuPermissions, node);
				if (ThreadVariable.getUser().isAdmin()) {
					setChildren(permissionNode, menuPermissions, node);
				} else {
					setChildren(permissionNode, menuPermissions, node,
							ThreadVariable.getUser().getId());
				}
				setNodeParent(permissionNode, menuPermissions, node);
				permissionNodes.add(node);
				treeLevel = 1;
			}
			cacheService.set(MemCacheConstant.PERMISSION_NAMESPACE,
					MemCacheConstant.getUserPermissionKey(
							MemCacheConstant.USERPERMISSION_KEY, ThreadVariable
									.getUser().getId(),
							MemCacheConstant.USERPERMISSION_KEYPARAME_NOTE),
					permissionNodes);
			return permissionNodes;
		} else {
			return nodes;
		}
	}

	@Override
	public List<Node> getMenuPermissionTree(String nodeId, Integer n_lv) {
		List<Node> nodes = (List<Node>) cacheService.get(
				MemCacheConstant.PERMISSION_NAMESPACE, MemCacheConstant
						.getUserPermissionKey(
								MemCacheConstant.USERPERMISSION_KEY,
								ThreadVariable.getUser().getId(), nodeId));
		if (nodes == null) {
			List<Permission> menuPermissions = findMenuPermissions(
					ThreadVariable.getUser().getId(), nodeId);
			// menuPermissions = sortMenuPermissions(null, menuPermissions);
			List<Node> permissionNodes = new ArrayList<Node>();
			int treeLevel = n_lv + 1;
			for (Permission permissionNode : menuPermissions) {
				Node node = new Node(permissionNode);
				if (null == permissionNode.getParent()) { // 说明为根节点
					node.setLevel(treeLevel);
					permissionNodes.add(node);
					continue;
				}
				// wangxiaohu update 20130902 权限采用异步加载方式
				node.setLevel(treeLevel);
				// parent为null的不需设置level,children,nodeParent
				// setNodeLevel(permissionNode, treeLevel, menuPermissions,
				// node);
				boolean isLeaf = permissionDao
						.getPermissionHasChildren(permissionNode.getId()) == 0;
				node.setLeaf(isLeaf);
				if (ThreadVariable.getUser().isAdmin()) {
					if (isLeaf) {
						List<Permission> leafs = getPermissionByParentId(permissionNode
								.getId());
						if (leafs != null && leafs.size() > 0) {
							for (Permission leaf : leafs) {
								node.add(new Node(leaf));
							}
						}
					}
					// setChildren(permissionNode, menuPermissions, node);
				} else {
					if (isLeaf) {
						List<Permission> leafs = getPermissionByParentId(
								permissionNode.getId(), ThreadVariable
										.getUser().getId());
						if (leafs != null && leafs.size() > 0) {
							for (Permission leaf : leafs) {
								node.add(new Node(leaf));
							}
						}
					}
					// setChildren(permissionNode, menuPermissions, node,
					// ThreadVariable.getUser().getId());
				}
				// setNodeParent(permissionNode, menuPermissions, node);
				node.setParentEname(nodeId);
				// wangxiaohu end
				permissionNodes.add(node);
				treeLevel = n_lv + 1;
			}
			cacheService.set(MemCacheConstant.PERMISSION_NAMESPACE,
					MemCacheConstant.getUserPermissionKey(
							MemCacheConstant.USERPERMISSION_KEY, ThreadVariable
									.getUser().getId(), nodeId),
					permissionNodes);
			return permissionNodes;
		} else {
			return nodes;
		}
	}

	private List<Permission> findMenuLeaderPermissions(Long userId,
			String nodeId) {
		List<Permission> Permission = null;
		if (nodeId != null && ThreadVariable.getUser().isAdmin()) {
			Permission = permissionDao.findMenuPermissions(nodeId);
		} else if (nodeId != null && !ThreadVariable.getUser().isAdmin()) {
			Permission = permissionDao.findMenuPermissions(userId, nodeId);
		} else if (nodeId == null && ThreadVariable.getUser().isAdmin()) {
			Permission = permissionDao.findMenuLeaderPermissions(nodeId);
		} else if (nodeId == null && !ThreadVariable.getUser().isAdmin()) {
			Permission = permissionDao
					.findMenuLeaderPermissionsByUserId(userId);
		}

		// if (ThreadVariable.getUser().isAdmin()) {
		// if (nodeId == null) {
		// Permission = permissionDao.findMenuLeaderPermissions(nodeId);
		// } else {
		// Permission = permissionDao.findMenuPermissions(nodeId);
		// }
		// } else {
		// if (nodeId == null) {
		// Permission = permissionDao
		// .findMenuLeaderPermissionsByUserId(userId);
		// } else {
		// Permission = permissionDao.findMenuPermissions(userId, nodeId);
		// }
		// }

		return Permission;
	}

	public List<Node> getMenuLeaderPermissionTree(String nodeId, Integer n_lv) {
		List<Permission> menuPermissions = findMenuLeaderPermissions(
				ThreadVariable.getUser().getId(), nodeId);
		if (menuPermissions == null || menuPermissions.size() == 0) {
			throw new BusinessValidationException("查询权限列表出错");
		}
		List<Node> permissionNodes = new ArrayList<Node>();
		int treeLevel = n_lv + 1;
		for (Permission permissionNode : menuPermissions) {
			Node node = new Node(permissionNode);
			if (null == permissionNode.getParent()) { // 说明为根节点
				node.setLevel(treeLevel);
				permissionNodes.add(node);
				continue;
			}
			node.setLevel(treeLevel);
			boolean isLeaf = permissionDao
					.getPermissionHasChildren(permissionNode.getId()) == 0;
			node.setLeaf(isLeaf);
			// if (ThreadVariable.getUser().isAdmin()) {
			if (isLeaf) {
				List<Permission> leafs = permissionDao
						.getLeaderPermissionByParentId(permissionNode.getId());
				if (leafs != null && leafs.size() > 0) {
					for (Permission leaf : leafs) {
						node.add(new Node(leaf));
					}
				} else {
					continue;
				}
			} else {
				boolean isHasLeader = permissionDao
						.getLeaderPermissionHasChildren(permissionNode.getId()) == 0;
				if (isHasLeader) {
					continue;
				}
			}
			// } else {
			// if (isLeaf) {
			// List<Permission> leafs = permissionDao
			// .getLeaderPermissionByParentId(permissionNode
			// .getId());
			// if (leafs != null && leafs.size() > 0) {
			// for (Permission leaf : leafs) {
			// node.add(new Node(leaf));
			// }
			// } else {
			// continue;
			// }
			// } else {
			// boolean isHasLeader = permissionDao
			// .getLeaderPermissionHasChildren(permissionNode
			// .getId()) == 0;
			// if (isHasLeader) {
			// continue;
			// }
			// }
			// }
			node.setParentEname(nodeId);
			permissionNodes.add(node);
			treeLevel = n_lv + 1;
		}
		// cacheService.set(
		// CacheNameSpace.PermissionService_getMenuPermissionTree,
		// "getMenuPermissionTree" + ThreadVariable.getUser().getId()
		// + nodeId, permissionNodes);
		return permissionNodes;
	}

	/**
	 * 对读取过来的权限列表进行排序
	 * 
	 * @param parentId
	 * @param menuPermissions
	 * @return
	 */
	private List<Permission> sortMenuPermissions(Long parentId,
			List<Permission> menuPermissions) {
		List<Permission> permissions = new ArrayList<Permission>();
		permissions = getChildrenFromMenuByParentId(null, menuPermissions);
		for (int i = 0; i < permissions.size(); i++) {
			List<Permission> childPermissions = getChildrenFromMenuByParentId(
					permissions.get(i).getId(), menuPermissions);
			if (null != childPermissions) {
				permissions.addAll(i + 1, childPermissions);
			}
			if (null == childPermissions) {
				continue;
			}
		}
		return permissions;
	}

	/**
	 * 根据parentId,返回有顺序的下一层级的权限
	 * 
	 * @param parentId
	 * @param menuPermissions
	 * @return
	 */
	private List<Permission> getChildrenFromMenuByParentId(Long parentId,
			List<Permission> menuPermissions) {
		boolean isHaveChildPermission = false;
		List<Permission> permissions = new ArrayList<Permission>();
		for (Permission menuPermission : menuPermissions) {
			if (null == menuPermission.getParent()) {
				if (null == parentId) {
					isHaveChildPermission = true;
					permissions.add(menuPermission);
				}
				continue;
			}
			if (menuPermission.getParent().getId() == parentId
					|| menuPermission.getParent().getId().equals(parentId)) {
				isHaveChildPermission = true;
				permissions.add(menuPermission);
			}
		}
		if (!isHaveChildPermission) {
			return null;
		} else {
			Collections.sort(permissions, new Comparator<Permission>() {
				@Override
				public int compare(Permission o1, Permission o2) {
					if (o1 == null || o2 == null || o1.getIndexId() == null
							|| o2.getIndexId() == null) {
						return 0;
					}
					if (o1.getIndexId() < o2.getIndexId()) {
						return 0;
					}
					return 1;

				}
			});
		}
		return permissions;
	}

	/**
	 * 设置对应的level
	 */
	public void setNodeLevel(Permission permission, int treeLevel,
			List<Permission> menuPermissions, Node node) {
		for (Permission p : menuPermissions) {
			if (null == permission.getParent()) {
				node.setLevel(treeLevel);
				break;
			}
			if (p.getId() == permission.getParent().getId()
					|| p.getId().equals(permission.getParent().getId())) {
				treeLevel = treeLevel + 1;
				node.setLevel(treeLevel);
				setNodeLevel(p, treeLevel, menuPermissions, node);
				break;
			}
		}
	}

	public void setChildren(Permission permission,
			List<Permission> menuPermissions, Node node) {
		int i = 0;// 标量标示是否有节点的parentid和permission的id相同
		for (Permission menu : menuPermissions) {
			if (null == menu.getParent()) {
				continue;
			}
			if (menu.getParent().getId() == permission.getId()
					|| menu.getParent().getId().equals(permission.getId())) {
				i++;
				break;
			}
		}
		if (i == 0) {
			node.setLeaf(true);
			List<Permission> leafs = getPermissionByParentId(permission.getId());
			if (leafs != null && leafs.size() > 0) {
				for (Permission leaf : leafs) {
					if (leaf.getPermissionType() == PermissionType.BUTTON_TYPE)
						node.add(new Node(leaf));
				}
			}
		}
	}

	/**
	 * levelDown代表往下的层数 设置相应的子节点集 根据userId
	 */
	public void setChildren(Permission permission,
			List<Permission> menuPermissions, Node node, Long userId) {
		int i = 0;// 标量标示是否有节点的parentid和permission的id相同
		for (Permission menu : menuPermissions) {
			if (null == menu.getParent()) {
				continue;
			}
			if (menu.getParent().getId() == permission.getId()
					|| menu.getParent().getId().equals(permission.getId())) {
				i++;
				break;
			}
		}
		if (i == 0) {
			node.setLeaf(true);
			List<Permission> leafs = getPermissionByParentId(
					permission.getId(), userId);
			if (leafs != null && leafs.size() > 0) {
				for (Permission leaf : leafs) {
					if (leaf.getPermissionType() == PermissionType.BUTTON_TYPE)
						node.add(new Node(leaf));
				}
			}
		}
	}

	// 获得对应的parent
	public Permission setNodeParent(Permission permissionNode,
			List<Permission> menuPermissions, Node node) {
		for (Permission menu : menuPermissions) {
			if (menu.getId() == permissionNode.getParent().getId()
					|| permissionNode.getParent().getId().equals(menu.getId())) {
				node.setParentEname(menu.getEname());
				break;
			}
		}
		return permissionNode;
	}

	@Override
	public List<Node> checkPermissionTree(List<Permission> permissions,
			List<Node> permissionNodes) {
		for (Node node : permissionNodes) {
			for (Permission permission : permissions) {
				if (node.getPermission().getEname()
						.equals(permission.getEname())) {
					node.setCheck(true);
				}
			}
			if (null != node.getChildren()) {
				List<Node> children = node.getChildren();
				for (Node child : children) {
					for (Permission permission : permissions) {
						if (child.getPermission().getEname()
								.equals(permission.getEname())) {
							child.setCheck(true);
							break;
						}
					}
				}
			}
		}

		return permissionNodes;
	}

	private List<Permission> findMenuPermissions(Long userId) {
		List<Permission> Permission = null;
		if (ThreadVariable.getUser().isAdmin()) {
			Permission = permissionDao.findMenuPermissions();
		} else {
			Permission = permissionDao.findMenuPermissions(userId);
		}

		return Permission;
	}

	private List<Permission> findMenuPermissions(Long userId, String nodeId) {
		List<Permission> Permission = null;
		if (ThreadVariable.getUser().isAdmin()) {
			Permission = permissionDao.findMenuPermissions(nodeId);
		} else {
			Permission = permissionDao.findMenuPermissions(userId, nodeId);
		}

		return Permission;
	}

	@Override
	public List<Node> getCheckedPermssionTree() {
		return null;
	}

	@Override
	public List<Node> getAllNodes() {
		return null;
	}

	@Override
	public Permission addPermission(Permission permission) {
		permissionDao.addPermission(permission);
		return permission;
	}

	@Override
	public PageInfo<User> findUsersBylockStatus(String status, User user,
			Integer page, Integer rows, String sidx, String sord) {
		if ("all".equals(status)) {
			return userDao.findUsersBylockStatus(user, page, rows, sidx, sord);
		} else {
			return userDao.findUsers(user, page, rows, sidx, sord);
		}
	}

	@Override
	public boolean deleteUserById(Long[] ids) {
		for (int i = 0; i < ids.length; i++) {
			User user = userDao.getSimpleUserById(ids[i]);
			if ("admin".equals(user.getUserName()))
				return false;
			deleteUserMultiZoneByUserId(ids[i]);
			deleteUserRoleRelasByUserId(ids[i]);

			for (UserListerner listerner : getUserListers()) {
				listerner.deleteUser(user.getUserName());
			}
			patelService.deleteConfiguration(ids[i]);
			patelService.deleteConfiguration(ids[i]);
			userDao.deleteUserById(ids[i]);
			systemLogService.log(
					com.vladium.logging.Logger.INFO,
					ModelType.USER,
					OperatorType.DELETE,
					ThreadVariable.getSession().getUserName() + "删除用户"
							+ user.getUserName(),
					ObjectToJSON.convertJSON(user));
		}
		return true;
	}

	@Override
	public boolean oldPasswordIsRight(Long userId, String oldPassword) {
		User user = userDao.getSimpleUserById(userId);
		if (EncryptUtil.md5Encrypt(oldPassword).equals(user.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public User updateUserByShutdown(User user) {
		return updateUser(user);
	}

	@Override
	public List<Role> findAllRolesDownCurrentOrgLevel(Long useInLevel) {
		List<Role> list = roleDao.findAllRolesDownCurrentOrgLevel(useInLevel);
		return list;
	}

	@Override
	public User getFullUserByUerName(String userName) {
		return userDao.getFullUserByUserName(userName);
	}

	@Override
	public List<Permission> getChildMenuByEname(String ename) {
		Long parentId = null;
		if (!StringUtils.isEmpty(ename)) {
			parentId = permissionDao.findPermissionByEname(ename).getId();
		}
		return permissionDao.getPermissionByParentId(parentId);
	}

	public void initWorkBench(Long id, Boolean isFristWorkBench) {
		userDao.updateIsFristWorkBenchById(id, isFristWorkBench);
	}

	@Override
	public Permission findPermissionByNormalUrl(String normalUrl) {
		return permissionDao.findPermissionByNormalUrl(normalUrl);
	}

	@Override
	public PageInfo<User> findUsersForPageInfoListByOrgInternalCodeAndRoleId(
			String orgInternalCode, Long roleId, Integer page, Integer rows,
			String sidx, String sord) {
		return userDao.findUsersForPageInfoListByOrgInternalCodeAndRoleId(
				orgInternalCode, roleId, page, rows, sidx, sord);
	}

	@Override
	public List<Permission> getChildMenuByEnameAndExcludeButtons(String ename) {
		Long parentId = null;
		if (!StringUtils.isEmpty(ename)) {
			parentId = permissionDao.findPermissionByEname(ename).getId();
		}
		return permissionDao.getPermissionByParentIdToPermissionTree(parentId);
	}

	@Override
	public Long[] reSetPatelConfigByRoleId(Long roleId) {
		List<Long> userIds = userDao.findUserIdsByRoleId(roleId);
		if (userIds != null && userIds.size() > 0) {
			patelService.deleteConfigurationByUserIds(userIds);
		}
		return StringUtil.parseList(userIds);
	}

	@Override
	public void reSetPatelConfigByUserId(Long userId) {
		userDao.updateIsFristWorkBenchById(userId, true);
		patelService.deleteConfiguration(userId);
	}

	@Override
	public List<Long> findUserIdsByOrgIds(List<Long> orgIdList) {
		return userDao.findUserIdsByOrgIds(orgIdList);
	}

	@Override
	public List<Long> findUserIdsByRoleIds(List<Long> roleIdList) {
		return userDao.findUserIdsByRoleIds(roleIdList);
	}

	@Override
	public List<User> findUsersByRoleIds(List<Long> roleIdList){
		return userDao.findUsersByRoleIds(roleIdList);
	}
	
	@Override
	public List<Long> findUserIdsByByOrgTypeAndOrgLevelAndOrgParentId(
			Integer orgTypeInternalId, Integer orgLevelInternalId,
			Long orgParentId) {
		if (null == orgParentId || null == orgTypeInternalId
				|| null == orgLevelInternalId) {
			return null;
		}
		String parentOrgInternalCode = organizationService
				.getOrgInternalCodeById(orgParentId);
		Long orgTypeId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationType.ORG_TYPE_KEY, orgTypeInternalId);
		Long orgLevelId = getPropertyDictIdByDomainNameAndInternalId(
				OrganizationLevel.ORG_LEVEL_KEY, orgLevelInternalId);
		return userDao.findUserIdsByByOrgTypeAndOrgLevelAndOrgParentId(
				orgTypeId, orgLevelId, parentOrgInternalCode);
	}

	public List<Long> findUserIdsByOrgIdAndRoleId(Long orgId, Long roleId) {
		if (null == orgId || null == roleId) {
			return null;
		}
		String orgCode = organizationService.getOrgInternalCodeById(orgId);
		return userDao.findUserIdsByOrgCodeAndRoleId(orgCode, roleId);
	}

	private Long getPropertyDictIdByDomainNameAndInternalId(String domainName,
			Integer orgTypeInternalId) {
		if (null == domainName || "".equals(domainName)
				|| null == orgTypeInternalId) {
			return null;
		}
		List<PropertyDict> dicts = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(domainName,
						orgTypeInternalId);
		if (null == dicts || dicts.size() == 0) {
			return null;
		}
		return dicts.get(0).getId();
	}

	@Override
	public Integer countRolesByUserId(Long userId) {
		return roleDao.countRolesByUserId(userId);
	}

	@Override
	public Integer countRolesByRoleNameAndUserInLevel(Long levelId) {
		return roleDao.countRolesByRoleNameAndUserInLevel(null, levelId);
	}

	@Override
	public Integer countRolesByUserIdAndUseInLevel(Long userId, Long useInLevel) {
		return roleDao.countRolesByUserIdAndUseInLevel(userId, useInLevel);
	}

	@Override
	public Role addRolePermissionRelasByRoleVos(Role role,
			List<RoleVo> roelVoList) {
		role.setCreateUser(ThreadVariable.getSession().getUserName());
		role.setCreateDate(Calendar.getInstance().getTime());
		role = roleDao.addRole(role);

		List<RoleVo> addPermissionId = new ArrayList<RoleVo>();
		for (RoleVo vo : roelVoList) {
			if (vo == null || vo.getStstus() == null) {
				continue;
			}
			vo.setRoleId(role.getId());
			addPermissionId.add(vo);
		}
		if (addPermissionId.size() > 0) {
			roleDao.addRolePermissionRelasByRoleVos(addPermissionId);
		}
		List<Long> addPermissionIds = getRolePermissionByRoleId(role.getId());
		List<String> permissionNames = getRolePermissionEnameByRoleId(addPermissionIds);
		role.setPermissionName(permissionNames);
		if (role.getUseInLevel() != null
				&& role.getUseInLevel().getId() != null) {
			PropertyDict propertyDict = propertyDictService
					.getPropertyDictById(role.getUseInLevel().getId());
			role.setDisplayName(propertyDict.getDisplayName());
		}
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {
			PropertyDict doamin = propertyDictService.getPropertyDictById(role
					.getUseInLevel().getId());
			systemLogService.log(
					INFO,
					ModelType.ROLES,
					OperatorType.ADD,
					ThreadVariable.getSession().getUserName() + "新增岗位"
							+ role.getRoleName() + ",应用层级:"
							+ doamin.getDisplayName(),
					ObjectToJSON.convertJSON(role));
		}
		return role;

	}

	@Override
	public Role updateRolePermissionRelasByRoleVos(Role role,
			List<RoleVo> roelVoList) {
		role.setUpdateUser(ThreadVariable.getSession().getUserName());
		role.setUpdateDate(Calendar.getInstance().getTime());
		role = roleDao.updateRole(role);

		List<RoleVo> addPermissionId = new ArrayList<RoleVo>();
		List<RoleVo> deletePermissionId = new ArrayList<RoleVo>();

		for (RoleVo vo : roelVoList) {
			if (vo == null || vo.getStstus() == null) {
				continue;
			}
			vo.setRoleId(role.getId());
			if (vo.getStstus().booleanValue()) {
				addPermissionId.add(vo);
			} else {
				deletePermissionId.add(vo);
			}
		}
		if (deletePermissionId.size() > 0) {
			// 将删除的岗位权限信息记录日志
			// roleUpdateLogService.addRoleUpdateLog(deletePermissionId, Calendar.getInstance().getTime(), ModelType.ROLE_OPEARTE_TYPE);

			roleDao.deleteRolePermissionRelasByRoleVos(deletePermissionId);
		}
		if (addPermissionId.size() > 0) {
			roleDao.addRolePermissionRelasByRoleVos(addPermissionId);
		}
		List<Long> addPermissionIds = getRolePermissionByRoleId(role.getId());
		List<String> permissionNames = getRolePermissionEnameByRoleId(addPermissionIds);
		role.setPermissionName(permissionNames);
		
		PropertyDict propertyDict = propertyDictService
				.getPropertyDictById(role.getUseInLevel().getId());
		role.setDisplayName(propertyDict.getDisplayName());
		if (ThreadVariable.getUser() != null
				&& ThreadVariable.getOrganization() != null
				&& ThreadVariable.getSession() != null) {

			PropertyDict doamin = propertyDictService.getPropertyDictById(role
					.getUseInLevel().getId());
			systemLogService.log(
					INFO,
					ModelType.ROLES,
					OperatorType.UPDATE,
					ThreadVariable.getSession().getUserName() + "修改岗位"
							+ role.getRoleName() + ",应用层级:"
							+ doamin.getDisplayName

							(), ObjectToJSON.convertJSON(role));
		}
		return role;
	}

	@Override
	public Role copyRole(Role role) {
		List<RoleVo> roelVoList = roleDao.findRolesByRoleId(role.getId());
		role.setCreateUser(ThreadVariable.getSession().getUserName());
		role.setCreateDate(Calendar.getInstance().getTime());
		role = roleDao.addRole(role);
		if (roelVoList == null) {
			return role;
		}
		List<RoleVo> addPermissionId = new ArrayList<RoleVo>();
		for (RoleVo vo : roelVoList) {
			vo.setRoleId(role.getId());
			addPermissionId.add(vo);
		}
		if (addPermissionId.size() > 0) {
			roleDao.addRolePermissionRelasByRoleVos(addPermissionId);
		}
		
		List<Long> addPermissionIds = getRolePermissionByRoleId(role.getId());
		List<String> permissionNames = getRolePermissionEnameByRoleId(addPermissionIds);
		role.setPermissionName(permissionNames);
		
		return role;
	}

	@Override
	public User addMobileUser(User user, Boolean isImport) {
		if (!isImport) {
			PermissionServiceHelper.checkAddMobileUser(user);
			user.setUserName(user.getUserName() + user.getVpdn());
		}
		user.setLock(true);
		user.setShutDown(false);

		// 不要改顺序
		if (this.findUserByMobileUserName(user.getUserName()) != null) {
			throw new BusinessValidationException("用户名已存在！");
		}
		try {
			user.setPassword(EncryptUtil.md5Encrypt(user.getPassword()));
			if (user.getName() != null) {
				Map<String, String> map = Chinese2pinyin
						.changeChinese2Pinyin(user.getName());
				user.setFullPinyin(map.get("fullPinyin"));
				user.setSimplePinyin(map.get("simplePinyin"));
			}
			if (user.getState() != null) {
				user.setState(user.getState());
			} else {
				user.setState(Constants.UserState.WITHACTIVATION_STATE);
			}
			Organization organization = organizationService
					.getRootOrganization();
			user.setOrganization(organization);
			user.setOrgInternalCode(organization.getOrgInternalCode());

			user = userDao.addUser(user);
			if (user.getOrganization() != null) {
				organization = organizationService.getSimpleOrgById(user
						.getOrganization().getId());
				user.setOrganization(organization);
			}

			for (UserListerner listerner : getUserListers()) {
				listerner.addUser(user);
			}
			systemLogService.log(
					com.vladium.logging.Logger.INFO,
					ModelType.MOBILEINFOMANAGE,
					OperatorType.ADD,
					ThreadVariable.getSession().getUserName() + "新增手机账号"
							+ user.getUserName(),
					ObjectToJSON.convertJSON(user));
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的addMobileUser方法出现异常，原因：",
					"新增手机账号数错误", e);
		}
		return user;
	}

	@Override
	@Transactional(readOnly = true)
	public User findUserByMobileUserName(String userName) {
		try {
			return userDao.findUserByUserName(userName);
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的findUserByMobileUserName方法出现异常，原因：",
					"根据username查询手机账号数错误", e);
		}
	}

	@Override
	public int countMobileUsers(UserVo userVo, int pageNum, int pageSize,
			String sortField, String sord) {
		try {
			return userDao.countMobileUsers(userVo, pageNum, pageSize,
					sortField, sord);
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的countMobileUsers方法出现异常，原因：",
					"统计列表手机账号数错误", e);
		}
	}

	@Override
	public PageInfo<User> findMobileUsers(UserVo userVo, int pageNum,
			int pageSize, String sortField, String sord) {
		try {
			if (userVo != null && userVo.getOrganization() != null
					&& userVo.getOrganization().getId() != null) {
				String orgInternalCode = organizationService
						.getOrgInternalCodeById(userVo.getOrganization()
								.getId());
				userVo.setOrgInternalCode(orgInternalCode);
			}
			return userDao.findMobileUsers(userVo, pageNum, pageSize,
					sortField, sord);
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的findMobileUsers方法出现异常，原因：",
					"查询列表显示手机账号错误", e);
		}
	}

	@Override
	public String[][] getExportPopertyArray() {
		return SpecialGroupsContextYinchuan.getUserPropertyArray();
	}

	@Override
	public User updateMobileUser(User user) {
		try {
			User userUpdate = userDao.getSimpleUserById(user.getId());
			PermissionServiceHelper.checkAddMobileUser(userUpdate);
			userUpdate.setAdmin(user.isAdmin());
			userUpdate.setChangePassword(user.isChangePassword());
			userUpdate.setHomePhone(user.getHomePhone());
			userUpdate.setUserName(user.getUserName());
			userUpdate.setName(user.getName());
			userUpdate.setMobile(user.getMobile());
			userUpdate.setWorkCompany(user.getWorkCompany());
			userUpdate.setWorkPhone(user.getWorkPhone());
			userUpdate.setValidatorImsi(user.isValidatorImsi());
			userUpdate.setFourthAccount(user.isFourthAccount());
			userUpdate.setImsi(user.getImsi());
			userUpdate.setGps(user.isGps());
			userUpdate.setFourTeams(user.isFourTeams());
			Map<String, String> map = Chinese2pinyin.changeChinese2Pinyin(user
					.getName());
			userUpdate.setFullPinyin(map.get("fullPinyin"));
			userUpdate.setSimplePinyin(map.get("simplePinyin"));
			userUpdate.setConnectVpdn(user.isConnectVpdn());
			userUpdate.setPcusable(user.isPcusable());
			userUpdate.setMobileusable(user.isMobileusable());

			String userName = user.getUserName();
			if ("".equals(userName) || userName == null) {
				throw new BusinessValidationException("用户名输入不正确！");
			}
			user = userDao.updateUser(userUpdate);
			for (UserListerner listerner : getUserListers()) {
				listerner.update(user);
			}
			systemLogService.log(
					com.vladium.logging.Logger.INFO,
					ModelType.MOBILEINFOMANAGE,
					OperatorType.UPDATE,
					ThreadVariable.getSession().getUserName() + "修改手机账号"
							+ user.getUserName(),
					ObjectToJSON.convertJSON(userUpdate));
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的updateMobileUser方法出现异常，原因：",
					"修改手机账号错误", e);
		}
		return user;
	}

	/**
	 * 
	 * @Title: updateMobileUserVersion
	 * @Description: TODO手机端登录，修改版本号和内部版本号参数
	 * @param @param user
	 * @param @return 设定文件
	 * @return User 返回类型
	 * @author wanggz
	 * @date 2014-7-23 上午10:38:30
	 */
	@Override
	public User updateMobileUserVersion(User user) {
		try {
			User userUpdate = userDao.getSimpleUserById(user.getId());
			// PermissionServiceHelper.checkAddMobileUser(userUpdate);
			/** 手机端适用 如果版本号和内部版本号不为空，则修改 */
			if (null != user.getMobileVersion()) {
				userUpdate.setMobileVersion(user.getMobileVersion());
			}
			if (null != user.getMobileInnerVersion()) {
				userUpdate.setMobileInnerVersion(user.getMobileInnerVersion());
			}

			user = userDao.updateUser(userUpdate);
			for (UserListerner listerner : getUserListers()) {
				listerner.update(user);
			}
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的updateMobileUserVersion方法出现异常，原因：",
					"修改手机账号错误", e);
		}
		return user;
	}

	@Override
	public void matchupOrganizationMobileUserByIds(Long[] ids,
			Organization organization) {
		try {
			if (organization == null || organization.getId() == null
					|| organization.getOrgInternalCode() == null) {
				throw new BusinessValidationException("参数错误");
			}
			for (Long id : ids) {
				userDao.matchupOrganizationMobileUserByIds(id, organization, 1);
				User matchUser = userDao.getSimpleUserById(id);
				systemLogService.log(com.vladium.logging.Logger.INFO,
						ModelType.MOBILEINFOMANAGE, OperatorType.UPDATE,
						ThreadVariable.getSession().getUserName() + "手机账号"
								+ matchUser.getUserName() + "匹配网格", null);
			}

		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的matchupOrganizationMobileUserByIds方法出现异常，原因：",
					"手机账号匹配网格错误", e);
		}

	}

	@Override
	public Boolean validateMobileUserVpdn(String vpdnTemp, Long[] ids) {
		Boolean result = true;
		try {
			for (Long id : ids) {
				User userTemp = this.getFullUserById(id);
				if (userTemp == null
						|| !vpdnTemp.equals(userTemp.getUserName().substring(
								userTemp.getUserName().indexOf("@") + 1,
								userTemp.getUserName().length()))) {
					result = false;
				}
			}
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的validateMobileUserVpdn方法出现异常，原因：",
					"手机账号验证用户名错误", e);
		}
		return result;
	}

	@Override
	public void recycleMobileUser(Long[] ids) {
		try {
			if (ids == null) {
				throw new BusinessValidationException("参数错误");
			}
			Organization organization = organizationService
					.getRootOrganization();
			for (Long id : ids) {
				userDao.deleteUserRoleRelasByUserId(id);
				userDao.matchupOrganizationMobileUserByIds(id, organization, 1);
				User recycleUser = userDao.getSimpleUserById(id);
				systemLogService.log(com.vladium.logging.Logger.INFO,
						ModelType.MOBILEINFOMANAGE, OperatorType.UPDATE,
						ThreadVariable.getSession().getUserName() + "回收手机账号"
								+ recycleUser.getUserName(), null);
			}
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的recycleMobileUser方法出现异常，原因：",
					"手机账号回收错误", e);
		}

	}

	@Override
	public User findUserByImsi(String imsi) {
		if ("".equals(imsi)) {
			throw new BusinessValidationException("imsi码不能为空");
		}
		try {
			return userDao.findUserByImsi(imsi);
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的findUserByImsi方法出现异常，原因：",
					"根据imsi码查询账号错误", e);
		}
	}

	@Override
	public int countFourthAccountUserByOrg(Organization organization) {
		if (organization == null || organization.getId() == null) {
			throw new BusinessValidationException("参数错误");
		}
		return userDao.countFourthAccountUserByOrg(organization);
	}

	@Override
	public boolean findUserAllPermissionByUserIdAndPermissionEname(Long userId,
			String ename) {
		List<Permission> list = permissionDao
				.findUserAllPermissionByUserIdAndPermissionEname(userId, ename);
		if (list != null && list.size() != 0) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean setPermissionSeq(Long id, Long seq) {
		if (id == null || seq == null) {
			throw new BusinessValidationException("参数错误");
		}

		Permission permission = permissionDao.getSimplePermissionById(id);
		if (permission == null) {
			throw new BusinessValidationException("参数错误");
		}
		Long parentId = null;
		if (permission.getParent() != null) {
			parentId = permission.getParent().getId();
		}
		Long indexId = permission.getIndexId();
		Long count = permissionDao.countPermissionByParentId(parentId);
		if (seq >= count) {
			throw new BusinessValidationException("不能大于最高的排序号");
		}
		Permission passivPermission;// 被动改变的元素

		try {
			passivPermission = permissionDao.getPermissionByParentIdAndIndexId(
					parentId, seq);
			permissionDao.updatePermissionIndexId(id, seq);
			if (passivPermission != null && passivPermission.getId() != null) {
				permissionDao.updatePermissionIndexId(passivPermission.getId(),
						indexId);
			}

		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的setPermissionSeq方法出现异常，原因：",
					"修改排序字段错误", e);
		}
		return true;
	}

	@Override
	public boolean isCanSeq(Long id, Long seq) {

		if (id == null || seq == null) {
			throw new BusinessValidationException("参数错误");
		}
		Permission permission = permissionDao.getSimplePermissionById(id);
		if (permission == null) {
			throw new BusinessValidationException("参数错误");
		}
		Long parentId = null;
		if (permission.getParent() != null) {
			parentId = permission.getParent().getId();
		}
		Long count = permissionDao.countPermissionByParentId(parentId);
		if (seq >= count) {
			throw new BusinessValidationException("不能大于最高的排序号");
		}

		return true;
	}

	@Override
	public void openOrCloseGpsByUserId(Long[] ids, String mode) {
		if (ids == null || ids.length == 0) {
			throw new BusinessValidationException("没有选择用户");
		}
		boolean openOrClose = false;
		if (DialogMode.OPEN.equals(mode)) {
			openOrClose = true;
		} else if (DialogMode.CLOSE.equals(mode)) {
			openOrClose = false;
		} else {
			throw new BusinessValidationException("未知的操作类型");
		}
		for (Long id : ids) {
			User user = userDao.getSimpleUserById(id);
			userDao.updateOpenOrCloseGpsById(id, openOrClose);
			systemLogService.log(com.vladium.logging.Logger.INFO,
					ModelType.MOBILEINFOMANAGE,
					DialogMode.OPEN.equals(mode) == true ? OperatorType.SHUT
							: OperatorType.UNSHUT, ThreadVariable.getSession()
							.getUserName()
							+ (DialogMode.OPEN.equals(mode) == true ? "启用"
									: "禁用") + user.getUserName() + "GPS",
					ObjectToJSON.convertJSON(user));
		}
	}

	@Override
	public void openOrCloseFourTeamsByUserId(Long[] ids, String mode) {
		if (ids == null || ids.length == 0) {
			throw new BusinessValidationException("没有选择用户");
		}
		boolean openOrClose = false;
		if (DialogMode.OPEN.equals(mode)) {
			openOrClose = true;
		} else if (DialogMode.CLOSE.equals(mode)) {
			openOrClose = false;
		} else {
			throw new BusinessValidationException("未知的操作类型");
		}
		for (Long id : ids) {
			User user = userDao.getSimpleUserById(id);
			userDao.updateOpenOrCloseFourTeamsById(id, openOrClose);
			systemLogService.log(com.vladium.logging.Logger.INFO,
					ModelType.MOBILEINFOMANAGE,
					DialogMode.OPEN.equals(mode) == true ? OperatorType.SHUT
							: OperatorType.UNSHUT, ThreadVariable.getSession()
							.getUserName()
							+ (DialogMode.OPEN.equals(mode) == true ? "启用"
									: "禁用") + user.getUserName() + "四支队伍",
					ObjectToJSON.convertJSON(user));
		}
	}

	@Override
	public List<Long> getRolePermissionByRoleId(Long roleId) {
		List<RoleVo> roelVoList = roleDao.findRolesByRoleId(roleId);
		List<Long> rolePermissionIds = new ArrayList<Long>();
		if (roelVoList != null && roelVoList.size() != 0) {
			for (RoleVo roleVo : roelVoList) {
				rolePermissionIds.add(roleVo.getPermissionId());
			}
		}
		return rolePermissionIds;
	}
	
	@Override
	  public List<String> getRolePermissionEnameByRoleId(List<Long> addPermissionIds) {
	    List<Long> list=new ArrayList<Long>(); 
	    List<String> permissionEnameList = new ArrayList<String>();
	    List<String> enameList;
	    //循环遍历addPermissionIds
	    for(int i=0;i<addPermissionIds.size();i++){
	       list.add(addPermissionIds.get(i));
	       //每900个执行查询并加到permissionEnameList
	       if(i!=0&&i%500==0){
	       enameList = roleDao.findRolePermissionEnameByRoleId(list);
	       permissionEnameList.addAll(enameList);
	       list=new ArrayList<Long>();
	       } 
	    }
	    //上面循环后执行最后不足900个的查询
	    if(list.size()!=0){
	      enameList = roleDao.findRolePermissionEnameByRoleId(list);
	      permissionEnameList.addAll(enameList);
			}
			return permissionEnameList;
		}


	@Override
	public List<String> findPermissionsEnameByUserId(Long userId) {
		return permissionDao.findPermissionsEnameByUserId(userId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Permission> findAllPermissionsByCurrentUserRoleId(Long userId,
			Integer permissiontype) {
		return permissionDao.findAllPermissionsByCurrentUserRoleId(userId,
				permissiontype);

	}

	@Override
	public boolean updateUserStateByUserIds(Long[] ids, Long state) {
		if (ids == null || ids.length == 0) {
			throw new BusinessValidationException("没有选择账号");
		}
		try {
			User user = new User();
			for (Long id : ids) {
				user = userDao.getFullUserById(id);
				user.setState(state);
				user.setActivationTime(CalendarUtil.now());
				userDao.updateUser(user);
			}
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的updateUserStateByUserIds方法出现异常，原因：",
					"账号激活操作失败", e);
		}
		return true;
	}

	@Override
	public PageInfo<UserCountVo> findUserCount(Long orgId, Long accountType,
			Integer page, Integer rows, String sidx, String sord) {
		if (orgId == null || accountType == null) {
			throw new BusinessValidationException("参数错误");
		}
		Organization organization = organizationService.getFullOrgById(orgId);
		if (organization == null || organization.getOrgInternalCode() == null
				|| organization.getOrgLevel() == null
				|| organization.getOrgLevel().getId() == null) {
			throw new BusinessValidationException("组织机构层级错误");
		}
		try {
			String OrgCode = organization.getOrgInternalCode();
			if (Constants.AccountType.ACCOUNTTYPE_TWO.equals(accountType)) {
				OrgCode = OrgCode + "_";// 查询所有下辖数据的参数OrgCode，用于模糊查询
			}
			PageInfo<UserCountVo> list = userDao.findUserCount(
					organization.getId(), organization.getOrgLevel().getId(),
					OrgCode, accountType, page, rows, sidx, sord);
			return list;
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的findUserCount方法出现异常，原因：",
					"账号统计操作失败", e);
		}

	}

	@Override
	public String[][] getUserCountExportPopertyArray() {
		return SpecialGroupsContextYinchuan.getUserCountAboutPropertyArray();//--------------
	}

	@Override
	public Permission getSimplePermissionById(Long id) {
		return permissionDao.getSimplePermissionById(id);
	}

	/**************************** 组织机构迁移合并方法 *********************/
	@Override
	public List<Permission> getAllChildPermissionsByParentId(Long permissionId) {
		if (permissionId == null) {
			throw new BusinessValidationException("查询权限所有子权限参数错误");
		}
		return permissionDao.getAllChildPermissionsByParentId(permissionId);
	}

	@Override
	public int countAllLoginCount(Long orgId) {
		if (orgId == null) {
			throw new BusinessValidationException("根据组织机构获取层级用户数量时，参数错误");
		}
		return userDao.countAllLoginCount(orgId);
	}

	@Override
	public boolean findUserAllPermissionByUserIdAndPermissionEnames(
			Long userId, String[] enames) {
		if (enames == null) {
			return false;
		}
		List<Permission> list = permissionDao
				.findUserAllPermissionByUserIdAndPermissionEnames(userId,
						enames);
		if (list != null && list.size() != 0) {
			return true;
		}
		return false;
	}

	@Override
	public PageInfo<UserCountAboutVo> findUsersAboutUserCount(Long orgId,
			Date loginBeginDate, Date loginEndDate, Date createBeginDate, Date createEndDate, int pageNum,
			int pageSize, String sortField, String order, Long pcOrMobile, Long isSelectLoginTime, Date beginActivationTime, Date endActivationTime, Long isSelectActivationTime) {
		if (orgId == null) {
			throw new BusinessValidationException("参数错误");
		}
		Organization organization = organizationService.getFullOrgById(orgId);
		if (organization == null || organization.getOrgInternalCode() == null
				|| organization.getOrgLevel() == null
				|| organization.getOrgLevel().getId() == null) {
			throw new BusinessValidationException("组织机构层级错误");
		}
		try {
			String orgCode = organization.getOrgInternalCode();
//			if (Constants.AccountType.ACCOUNTTYPE_TWO.equals(accountType)) {
//				orgCode = orgCode + "_";// 查询所有下辖数据的参数OrgCode，用于模糊查询
//			}
			PageInfo<UserCountAboutVo> list = userDao.findUsersAboutUserCount(orgCode, loginBeginDate, loginEndDate,createBeginDate, createEndDate, 
					pageNum, pageSize, sortField, order, pcOrMobile, isSelectLoginTime, beginActivationTime, endActivationTime, isSelectActivationTime);
			return list;
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类PermissionServiceImpl的findUsersAboutUserCount方法出现异常，原因：",
					"账号统计操作失败", e);
		}
	}
	

	@Override
	public List<Role> findAllRoles() {
		List<Role> roles = roleDao.findAllRoles();
		return roles;
	}

	@Override
	public List<Permission> findAllPermissionMobile() {
		return permissionDao.findAllPermissionMobile();
	}
	
}
