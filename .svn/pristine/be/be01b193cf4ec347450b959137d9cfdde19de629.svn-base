package com.tianque.core.base;

import java.text.MessageFormat;

import org.springframework.transaction.annotation.Transactional;

import com.tianque.core.vo.PageInfo;
import com.tianque.exception.base.BusinessValidationException;
import com.tianque.exception.base.ServiceValidationException;

@Transactional
public abstract class BaseServiceImpl<T extends BaseDomain, SearchVo extends BaseDomain>
		implements BaseService<T, SearchVo> {

	private BaseDao<T, SearchVo> baseDao;

	private void validatorId(Long id) {
		if (id == null) {
			throw new BusinessValidationException("Id不能为空");
		}
	}

	@Override
	public T get(Long id) {
		validatorId(id);

		return baseDao.get(id);
	}

	@Override
	public abstract T add(T entity);

	@Override
	public abstract T update(T entity);

	@Override
	public void delete(Long id) {
		validatorId(id);

		baseDao.delete(id);
	}

	@Override
	public void delete(Long[] ids) {
		if (ids == null || ids.length == 0) {
			throw new BusinessValidationException("Id不能为空");
		}
		for (Long id : ids) {
			delete(id);
		}

	}

	@Override
	public PageInfo<T> findPagerBySearchVo(SearchVo searchVo, Integer pageNum,
			Integer pageSize, String sidx, String sord) {

		return baseDao.findPagerBySearchVo(searchVo, pageNum, pageSize, sidx,
				sord);
	}

	public BaseDao<T, SearchVo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao<T, SearchVo> baseDao) {
		this.baseDao = baseDao;
	}

	public <X extends Object> X dealException(String className,
			String methodName, String msg, Throwable e) {
		throw new ServiceValidationException(MessageFormat.format(
				"类{0}的{1}方法出现异常，原因：", className, methodName), msg, e);
	}

	public <X extends Object> X dealException(Object className,
			String methodName, String msg, Throwable e) {
		throw new ServiceValidationException(MessageFormat.format(
				"类{0}的{1}方法出现异常，原因：", className.getClass().getSimpleName(),
				methodName), msg, e);
	}
}
