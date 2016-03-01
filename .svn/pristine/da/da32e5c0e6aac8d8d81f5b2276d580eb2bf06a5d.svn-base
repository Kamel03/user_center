package com.tianque.sysadmin.listerner.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.domain.User;
import com.tianque.domain.WorkContacter;
import com.tianque.service.ContacterService;
import com.tianque.sysadmin.listerner.UserListernerAdapter;

@Component("workContactListerner")
public class WorkContactListerner extends UserListernerAdapter {

	@Autowired
	private ContacterService contacterService;

	@Override
	public void addUser(User user) {
		WorkContacter workContacter = new WorkContacter();
		workContacter.setMobileNumber(user.getMobile());
		workContacter.setFromUser(user);
		workContacter.setName(user.getName());
		contacterService.addWorkContacter(workContacter);
	}

	@Override
	public void deleteUser(String userName) {
		WorkContacter contacter = contacterService.getWorkContactersByName(userName);
		if (null != contacter) {
			contacterService.deleteContacterById(contacter.getId());
		}
	}

	@Override
	public void update(User user) {
		WorkContacter workContacter = contacterService.getSimpleWorkContacterByUserId(user.getId());
		if (workContacter != null) {
			workContacter.setName(user.getName());
			workContacter.setFromUser(user);
			workContacter.setMobileNumber(user.getMobile());
			contacterService.updateWorkContacter(workContacter);
		}
	}
}
