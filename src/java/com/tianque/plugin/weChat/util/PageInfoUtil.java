package com.tianque.plugin.weChat.util;

public class PageInfoUtil {

	private static PageInfoUtil pageInfoUtil = null;

	private PageInfoUtil() {

	}

	public synchronized static PageInfoUtil getInstance() {
		if (null == pageInfoUtil) {
			pageInfoUtil = new PageInfoUtil();
		}
		return pageInfoUtil;
	}

	public int dealOutofMaxPageNum(int total, int pageSize, int pageNum) {
		int maxPage = 0;
		if (pageSize == 0) {
			pageSize = 1;
		}
		if ((total % pageSize) == 0) {
			maxPage = total / pageSize;
		} else {
			maxPage = total / pageSize + 1;
		}
		return pageNum > maxPage ? maxPage : pageNum;
	}
}
