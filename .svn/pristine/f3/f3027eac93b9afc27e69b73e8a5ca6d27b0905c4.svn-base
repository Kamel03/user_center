package com.tianque.domain;

import java.util.List;

import com.tianque.core.base.BaseDomain;
import com.tianque.core.util.BaseDomainIdEncryptUtil;
import com.tianque.sysadmin.vo.RoleVo;

/**
 * 系统角色实体
 */
public class Role extends BaseDomain {
	private static final long serialVersionUID = 1L;
	private String roleName;
	private String description;
	private PropertyDict useInLevel;
	private String displayName;
	private List<Permission> permissions;
	private PropertyDict workBenchType;
	private List<Long> permissionId;
	private List<String> permissionName;
	/** 高级搜索时，是否选中层级 */
	private boolean isCheckLevel;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public PropertyDict getUseInLevel() {
		return useInLevel;
	}

	public void setUseInLevel(PropertyDict useInLevel) {
		this.useInLevel = useInLevel;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PropertyDict getWorkBenchType() {
		return workBenchType;
	}

	public void setWorkBenchType(PropertyDict workBenchType) {
		this.workBenchType = workBenchType;
	}

	public boolean isCheckLevel() {
		return isCheckLevel;
	}

	public void setCheckLevel(boolean isCheckLevel) {
		this.isCheckLevel = isCheckLevel;
	}

	public String getEncryptId() {
		return BaseDomainIdEncryptUtil.encryptDomainId(super.getId(), null,
				null);
	}

	public List<Long> getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(List<Long> permissionId) {
		this.permissionId = permissionId;
	}

	public List<String> getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(List<String> permissionName) {
		this.permissionName = permissionName;
	}

	

	
}
