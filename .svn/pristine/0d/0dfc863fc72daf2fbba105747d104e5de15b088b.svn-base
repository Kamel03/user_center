package com.tianque.core.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.tianque.core.vo.PageInfo;
import com.tianque.core.vo.Pager;

public final class PageInfoUtil {

	// 私有构造方法，不允许外部创建PageInfoUtil对象
	private PageInfoUtil() {

	}

	public static PageInfo emptyPage(int pageSize) {
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPerPageSize(pageSize);
		pageInfo.setResult(new ArrayList());
		return pageInfo;
	}

	public static PageInfo createPageInfo(int pageNum, int pageSize,
			Integer countNum, List list) {
		PageInfo pageInfo = new PageInfo();
		pageInfo.setResult(list);
		pageInfo.setTotalRowSize(countNum);
		pageInfo.setCurrentPage(pageNum);
		pageInfo.setPerPageSize(pageSize);
		return pageInfo;
	}

	public static void copyPageInfo(PageInfo source, PageInfo target) {
		BeanUtils.copyProperties(source, target);
	}

	public static Pager genaratePager(Integer page, Integer rows, String sidx,
			String sord) {
		return new Pager(page, rows, sidx, sord);
	}
}
