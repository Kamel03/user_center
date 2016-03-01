package com.tianque.workMemo.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.util.DateUtil;
import com.tianque.core.util.ThreadVariable;
import com.tianque.core.vo.PageInfo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;
import com.tianque.workMemo.dao.WorkMemoDao;
import com.tianque.workMemo.domain.WorkMemo;

@Service("workMemoService")
@Transactional
public class WorkMemoServiceImpl implements WorkMemoService {
	@Autowired
	private WorkMemoDao workMemoDao;

	public final static Logger logger = LoggerFactory
			.getLogger(WorkMemoServiceImpl.class);

	@Override
	public WorkMemo addWorkMemo(WorkMemo workMemo) {
		if (workMemo.getAddMemoDate() == null
				|| workMemo.getAddMemoDate().before(
						DateUtil.parseDate(DateUtil.formateYMD(new Date()),
								"yyyy-MM-dd"))) {
			throw new BusinessValidationException("不能在今天之前的日期添加备忘录");
		}
		if (workMemo.getMemoContents() == null
				|| workMemo.getMemoContents().length() > 60) {
			throw new BusinessValidationException("备忘录内容不能过多或没有内容");
		}
		if (workMemo.getUserId() == null) {
			workMemo.setUserId(ThreadVariable.getSession().getUserId());
		}
		return workMemoDao.addWorkMemo(workMemo);
	}

	@Override
	public void deleteWorkMemoById(Long id) {
		workMemoDao.deleteWorkMemoById(id);
	}

	@Override
	public List<String> getDaysByUserIdAndDate(Long userId, String year,
			String month) {
		return workMemoDao.getDaysByUserIdAndDate(userId, year, month);
	}

	@Override
	public List<WorkMemo> getMemoContentsByUserIdAndAddMemoDate(Long userId,
			String date) {
		return workMemoDao.getMemoContentsByUserIdAndAddMemoDate(userId, date);
	}

	@Override
	public List<WorkMemo> getMemoContentsByUserId(Long userId) {
		return workMemoDao.getMemoContentsByUserId(userId);
	}

	/**
	 * @Title: getMemoContentsByUserIdForMobile
	 * @Description: TODO为手机端新增一个分页查询备忘录的方法
	 * @param @param userId
	 * @param @param pageNum
	 * @param @param pageSize
	 * @param @return 设定文件
	 * @return PageInfo 返回类型
	 * @author wanggz
	 * @date 2014-7-3 下午05:23:39
	 */
	@Override
	public PageInfo getMemoContentsByUserIdForMobile(Long userId, int pageNum,
			int pageSize) {
		PageInfo pageInfo = new PageInfo();
		try {
			pageInfo = workMemoDao.getMemoContentsByUserIdForMobile(userId,
					pageNum, pageSize);
		} catch (Exception e) {
			throw new ServiceValidationException(
					"类WorkMemoServiceImpl的getMemoContentsByUserIdForMobile方法出现异常，原因：",
					"查询出现错误", e);
		}
		return pageInfo;
	}
}
