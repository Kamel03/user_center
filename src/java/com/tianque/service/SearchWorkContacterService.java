package com.tianque.service;

import com.tianque.core.vo.PageInfo;
import com.tianque.domain.WorkContacter;
import com.tianque.domain.vo.ContacterVo;

public interface SearchWorkContacterService {

	public PageInfo<WorkContacter> searchUsersByWorkContacter(
			ContacterVo contacterVo, Boolean isHasOrg, Integer page,
			Integer rows, String sidx, String sord);
}
