package com.tianque.core.dubbo.filter;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * @ClassName: DubboxExceptionFilter
 * @Description: Dubbo异常过滤器
 * @author wangxiaohu wsmalltiger@163.com
 * @date 2014年12月8日 下午2:27:08
 */
@Activate(group = "provider")
public class DubboxExceptionFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation)
			throws RpcException {
		try {
			return invoker.invoke(invocation);
		} catch (Throwable e) {
			throw new RpcException(e);
		}
	}
}