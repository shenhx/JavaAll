package com.aop.shiyanlou.demo2.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutsDefinition {

	@Pointcut("execution(* com.aop.shiyanlou.demo2.aspectJ.CustomerBo.*(..))")
	public void customerLog() {
	}
}
