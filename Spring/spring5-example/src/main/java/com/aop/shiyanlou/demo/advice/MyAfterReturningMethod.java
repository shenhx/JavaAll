package com.aop.shiyanlou.demo.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAfterReturningMethod  implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("MyAfterReturningMethod.afterReturning()"+returnValue+"--"+method.getName());
		
	}

	
}
