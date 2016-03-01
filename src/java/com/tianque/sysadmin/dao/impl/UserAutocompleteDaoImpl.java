package com.tianque.sysadmin.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tianque.core.base.AbstractBaseDao;
import com.tianque.domain.User;
import com.tianque.sysadmin.dao.UserAutocompleteDao;

@Repository("userAutocompleteDao")
public class UserAutocompleteDaoImpl extends AbstractBaseDao implements UserAutocompleteDao {

	@Override
	public List<User> findSuperiorVisitNameAndPinyinAndsubordinate(String name, int orglevel) {
		Map map = new HashMap();
		map.put("name", name);
		map.put("orglevel", orglevel);
		return getSqlMapClientTemplate().queryForList(
				"userAutocomplete.findSuperiorVisitNameAndPinyinAndsubordinate", map);
	}

	public List<User> findSuperiorVisitNameAndPinyinAndAll(String name) {
		Map map = new HashMap();
		map.put("name", name);
		return getSqlMapClientTemplate().queryForList(
				"userAutocomplete.findSuperiorVisitNameAndPinyinAndAll", map);
	}

}
