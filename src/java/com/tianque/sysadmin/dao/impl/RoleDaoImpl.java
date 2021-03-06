package com.tianque.sysadmin.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.core.cache.constant.MemCacheConstant;
import com.tianque.core.cache.service.CacheService;
import com.tianque.core.vo.PageInfo;
import com.tianque.domain.Role;
import com.tianque.platformMessage.constants.PlatformMessageType;
import com.tianque.sysadmin.dao.RoleDao;
import com.tianque.sysadmin.vo.RoleVo;

@Repository("roleDao")
public class RoleDaoImpl extends AbstractBaseDao implements RoleDao {
	@Autowired
	private CacheService cacheService;

	@Override
	public Role addRole(Role role) {
		Long roleId = (Long) getSqlMapClientTemplate().insert("role.addRole",
				role);
		return getSimpleRoleById(roleId);
	}

	// @Override
	// public Role addRoleinfo(Role role) {
	// Long roleId = (Long) getSqlMapClientTemplate().insert("role.addRole",
	// role);
	// return getSimpleRoleById(roleId);
	// }
	@Override
	public void deleteRoleById(Long id) {
		getSqlMapClientTemplate()
				.delete("role.deleteUserRoleRelasByRoleId", id);
		getSqlMapClientTemplate().delete(
				"role.deleteRolePermissionRelasByRoleId", id);
		getSqlMapClientTemplate().delete("role.deleteRoleById", id);
		// invalidateFindPermissionsByUserIdNamespaceCached();
	}

	@Override
	public Role updateRole(Role role) {
		getSqlMapClientTemplate().update("role.updateRole", role);
		invalidateFindPermissionsByUserIdNamespaceCached(role.getId());
		return getSimpleRoleById(role.getId());
	}

	private void invalidateFindPermissionsByUserIdNamespaceCached(Long roleId) {
		if (roleId != null) {
			List<Long> userIds = getSqlMapClientTemplate().queryForList(
					"user.findUserIdsByRoleId", roleId);
			for (Long userId : userIds) {
				cacheService
						.remove(MemCacheConstant.PERMISSION_NAMESPACE,
								MemCacheConstant
										.getUserPermissionKey(
												MemCacheConstant.USERPERMISSION_KEY,
												userId,
												MemCacheConstant.USERPERMISSION_KEYPARAME_STRING));

			}
		}

		// cacheService
		// .invalidateNamespaceCache(CacheNameSpace.PermissionDao_findPermissionsByUserId);
		// cacheService
		// .invalidateNamespaceCache(CacheNameSpace.PermissionDao_findPermissionsEnameByUserId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public PageInfo<Role> findAllRolesByUseInLevelForPage(int pageNum,
			int pageSize, Long useInLevel, String sortField, String order) {

		Map<String, Object> map = new HashMap<String, Object>();
		if (isStrotFieldAvaliable(sortField)) {
			map.put("sortField", sortField);
		}
		map.put("order", order);
		map.put("userInlevel", useInLevel);
		List<Role> list = getSqlMapClientTemplate().queryForList(
				"role.findRoles", map, (pageNum - 1) * pageSize, pageSize);
		Integer countNum = (Integer) getSqlMapClientTemplate().queryForObject(
				"role.countRoles", map);
		PageInfo<Role> pageInfo = new PageInfo<Role>();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);

		return pageInfo;
	}

	private boolean isStrotFieldAvaliable(String sortField) {
		return sortField != null && !"".equals(sortField.trim());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findAllRoles() {
		return getSqlMapClientTemplate().queryForList("role.findRoles");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findRolesByUserId(Long userId) {
		return getSqlMapClientTemplate().queryForList("role.findRolesByUserId",
				userId);
	}

	@Override
	public Role getSimpleRoleById(Long id) {
		return (Role) getSqlMapClientTemplate().queryForObject(
				"role.getSimpleRoleById", id);
	}

	@Override
	public Long addRolePermissionRela(Long roleId, Long permissionId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleId", roleId);
		map.put("permissionId", permissionId);
		Long rows = (Long) getSqlMapClientTemplate().insert(
				"role.addRolePermissionRela", map);
		// invalidateFindPermissionsByUserIdNamespaceCached();
		return rows;
	}

	@Override
	public void deleteRolePermissionRelasByRoleId(Long roleId) {
		getSqlMapClientTemplate().delete(
				"role.deleteRolePermissionRelasByRoleId", roleId);
		// invalidateFindPermissionsByUserIdNamespaceCached();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findRolesByRoleNameAndUserInLevel(String roleName,
			Long levelId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", roleName);
		map.put("levelId", levelId);
		return getSqlMapClientTemplate().queryForList(
				"role.findRoleByLikeRoleNameUseInLevel", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findRolesByUserIdAndUseInLevel(Long userId,
			Long useInLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("useInLevel", useInLevel);
		return getSqlMapClientTemplate().queryForList(
				"role.findRolesByUserAndUseInLevel", map);
	}

	public List<Role> findRolesByRoleNameAndUserIdAndUseInLevel(
			String roleName, Long userId, Long useInLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", roleName);
		map.put("userId", userId);
		map.put("useInLevel", useInLevel);
		return getSqlMapClientTemplate().queryForList(
				"role.findRolesByRoleNameAndUserIdAndUseInLevel", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findAllRolesDownCurrentOrgLevel(Long useInLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("useInLevel", useInLevel);
		return getSqlMapClientTemplate().queryForList(
				"role.findAllRolesDownCurrentOrgLevel", map);
	}

	@Override
	public List<Role> findAllChildRolesByUseInLevel(Long useInLevel) {
		return getSqlMapClientTemplate().queryForList(
				"role.findAllChildRolesByUseInLevel", useInLevel);
	}

	@Override
	public List<Role> findDirectlyChildRolesByUseInLevel(Long useInLevel) {
		return getSqlMapClientTemplate().queryForList(
				"role.findDirectlyChildRolesByUseInLevel", useInLevel);
	}

	@Override
	public void addRolePermissionRelas(Long roleId, Long[] permissionIds) {
		Map map = new HashMap();
		map.put("permissionIds", permissionIds);
		map.put("roleId", roleId);
		getSqlMapClientTemplate().insert("role.addRolePermissionRelas", map);
	}

	@Override
	public Integer countRolesByUserId(Long userId) {
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"role.countRolesByUserId", userId);
	}

	public Integer countRolesByRoleNameAndUserInLevel(String roleName,
			Long levelId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", roleName);
		map.put("levelId", levelId);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"role.countRoleByRoleNameUseInLevel", map);
	}

	public Integer countRolesByUserIdAndUseInLevel(Long userId, Long useInLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("useInLevel", useInLevel);
		return (Integer) getSqlMapClientTemplate().queryForObject(
				"role.countRolesByUserAndUseInLevel", map);
	}

	@Override
	public void addRolePermissionRelasByRoleVos(List<RoleVo> roleVos) {
		super.batchInsertDate(roleVos, "role.addRolePermissionRelasByRoleVo");
		// invalidateFindPermissionsByUserIdNamespaceCached();
	}

	@Override
	public void deleteRolePermissionRelasByRoleVos(List<RoleVo> roleVos) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Long> permissionIds = new ArrayList<Long>();
		map.put("roleId", roleVos.get(0).getRoleId());
		for (int i = 0; i < roleVos.size(); i++) {
			permissionIds.add(roleVos.get(i).getPermissionId());
			if (i != 0 && i % 500 == 0) {
				map.put("permissionIds", permissionIds);
				map.clear();
				map.put("roleId", roleVos.get(0).getRoleId());
				permissionIds = new ArrayList<Long>();
			}
		}
		if (permissionIds.size() > 0) {
			map.put("permissionIds", permissionIds);
			getSqlMapClientTemplate().delete(
					"role.deleteRolePermissionRelasByRoleVos", map);
		}
		// invalidateFindPermissionsByUserIdNamespaceCached();
	}

	@Override
	public List<RoleVo> findRolesByRoleId(Long roleId) {
		return getSqlMapClientTemplate().queryForList("role.findRolesByRoleId",
				roleId);
	}
	
	@Override
	public List<String> findRolePermissionEnameByRoleId(List<Long> addPermissionIds) {
		Map<String,Object>map=new HashMap<String, Object>();
		map.put("addPermissionIds", addPermissionIds);
		return getSqlMapClientTemplate().queryForList("role.findRolePermissionEnameByRoleId",
				map);
	}

	@Override
	public List<Role> findRolesByRoleNameAndUserInLevelNoAdmin(String roleName,
			Long levelId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", PlatformMessageType.IS_SEARCH_ADMIN_MESSAGE);
		map.put("levelId", levelId);
		return getSqlMapClientTemplate().queryForList(
				"role.findRoleByRoleNameUseInLevelNoAdmin", map);
	}

	@Override
	public List<Role> findDirectlyChildRolesByUseInLevelNoAdmin(Long useInLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", PlatformMessageType.IS_SEARCH_ADMIN_MESSAGE);
		map.put("useInLevel", useInLevel);
		return getSqlMapClientTemplate().queryForList(
				"role.findDirectlyChildRolesByUseInLevelNoAdmin", map);
	}

	@Override
	public List<Role> findAllChildRolesByUseInLevelNoAdmin(Long useInLevel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", PlatformMessageType.IS_SEARCH_ADMIN_MESSAGE);
		map.put("useInLevel", useInLevel);
		return getSqlMapClientTemplate().queryForList(
				"role.findAllChildRolesByUseInLevelNoAdmin", map);
	}
}
