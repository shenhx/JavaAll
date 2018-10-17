package com.aop.shiyanlou.demo2.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	// @Before("execution(public * com.aop.shiyanlou.demo2.aspectJ.CustomerBo.addCustomer(..))")
	@Before("com.aop.shiyanlou.demo2.aspectJ.PointcutsDefinition.customerLog()")
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("logBefore() is running ...");
        System.out.println(":"+joinpoint.getSignature().getName());
        System.out.println("**********");
	}
	
//	//@Before("execution(public * com.aop.shiyanlou.demo2.aspectJ.CustomerBo.deleteCustomer(..))")
	@After("com.aop.shiyanlou.demo2.aspectJ.PointcutsDefinition.customerLog()")
	public void logAfter(JoinPoint joinpoint) {
		System.out.println("logAfter() is running ...");
        System.out.println(":"+joinpoint.getSignature().getName());
        System.out.println("**********");
	}
	
	@Around("com.aop.shiyanlou.demo2.aspectJ.PointcutsDefinition.customerLog()")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around before");
		Object result = joinPoint.proceed();
		System.out.println("执行结果："+result);
		System.out.println("around after");
	}
}
