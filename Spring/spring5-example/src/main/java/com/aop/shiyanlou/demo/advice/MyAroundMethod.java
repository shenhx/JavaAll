package com.aop.shiyanlou.demo.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyAroundMethod  implements MethodInterceptor{

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("before");
		try {
			Object result = methodInvocation.proceed();
			System.out.println("after");
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ex");
			throw e;
		}
	}
	
	
}
