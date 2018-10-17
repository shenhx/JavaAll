package com.aop.shiyanlou.demo.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeMethod  implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("hello,begin excute the method:"+arg0.getName());
		
	}

	
}
