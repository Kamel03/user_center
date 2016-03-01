package com.tianque.userAuth.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.userAuth.api.ModuelClickCountDubboService;
import com.tianque.workBench.moduelClickCount.domain.ModuelClick;
import com.tianque.workBench.moduelClickCount.service.ModuelClickCountService;

@Component
public class ModuelClickCountDubboServiceImpl implements
		ModuelClickCountDubboService {

	@Autowired
	private ModuelClickCountService moduelClickCountService;

	@Override
	public ModuelClick findModuelClickCountByPermissionIdAndUserId(
			Long permissionId, Long userId) {
		return moduelClickCountService
				.findModuelClickCountByPermissionIdAndUserId(permissionId,
						userId);
	}

	@Override
	public ModuelClick addModuelClickCount(ModuelClick moduelClick) {
		return moduelClickCountService.addModuelClickCount(moduelClick);
	}

	@Override
	public ModuelClick updateModuelClickCount(ModuelClick moduelClick) {
		return moduelClickCountService.updateModuelClickCount(moduelClick);
	}

	@Override
	public List<ModuelClick> findModuelClickCountByUserId(Long userId,
			Integer nums) {
		return moduelClickCountService.findModuelClickCountByUserId(userId,
				nums);
	}

}
