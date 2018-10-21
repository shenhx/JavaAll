package com.shenhx.demo.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 简单自定义拦截器
 * @author shenhx
 *
 */
public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("before");
		String result = arg0.invoke();
		System.out.println("after");
		return result;
	}

}
