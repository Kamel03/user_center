package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tianque.domain.User;
import com.tianque.sysadmin.dao.UserAutocompleteDao;
import com.tianque.userAuth.api.UserAutocompleteDubboService;

@Component
public class UserAutocompleteDubboServiceImpl implements UserAutocompleteDubboService{

	private UserAutocompleteDao userAutocompleteDao;
	@Override
	public List<User> findSuperiorVisitNameAndPinyinAndsubordinate(String name,
			int orglevel) {
		return userAutocompleteDao.findSuperiorVisitNameAndPinyinAndsubordinate(name, orglevel);
	}

	@Override
	public List<User> findSuperiorVisitNameAndPinyinAndAll(String name) {
		return userAutocompleteDao.findSuperiorVisitNameAndPinyinAndAll(name);
	}

}
