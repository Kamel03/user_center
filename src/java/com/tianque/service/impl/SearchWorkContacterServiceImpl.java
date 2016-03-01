package com.tianque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.vo.PageInfo;
import com.tianque.dao.SearchWorkContacterDao;
import com.tianque.domain.User;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;
import com.tianque.service.SearchWorkContacterService;
import com.tianque.sysadmin.service.PermissionService;

@Service("searchWorkContacterService")
@Transactional
public class SearchWorkContacterServiceImpl implements
		SearchWorkContacterService {

	@Autowired
	private SearchWorkContacterDao searchWorkContacterDao;
	@Autowired
	private PermissionService permissionService;
	
	public final String FORMUSER_WORKPHONE = "fromUser.workPhone";// 平台内联系人
																	// 通过固定电话排序
	public final String SORD_WORKPHONE = "u.workPhone";// 转化固定电话排序的字段

	@Override
	public PageInfo<WorkContacter> searchUsersByWorkContacter(
			ContacterVo contacterVo, Boolean isHasOrg, Integer page,
			Integer rows, String sidx, String sord) {
		if (FORMUSER_WORKPHONE.equals(sidx)) {
			sidx = SORD_WORKPHONE;
		} else {
			sidx = "c." + sidx;
		}
		PageInfo<WorkContacter> workContacters = searchWorkContacterDao
				.searchUsersByWorkContacter(contacterVo, isHasOrg, page, rows,
						sidx, sord);
		List<WorkContacter> list;
		if (workContacters != null && workContacters.getPerPageSize() != 0) {
			list = workContacters.getResult();
			for (WorkContacter workContacter : list) {
				if (workContacter.getFromUser() != null
						&& workContacter.getFromUser().getId() != null) {
					User user = permissionService
							.getSimpleUserById(workContacter.getFromUser()
									.getId());
					workContacter.setFromUser(user);
				}
			}
			workContacters.setResult(list);
		}
		
		return workContacters;
	}

}
