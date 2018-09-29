package com.shiyanlou.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;

// @Aspect
// @Component
public class SpringbootAop {
	
	@Pointcut(value = "excution(*com.shiyanlou.springboot..*.run(..))")
	public void aop(){
		
	}
	
	@Before("aop()")
	public void before(){
		System.out.println("before");
	}
	
	@After("aop()")
	public void after(){
		System.out.println("after");
	}
	
	@AfterReturning("aop()")
	public void afterThrowing(){
		System.out.println("afterreturning");
	}
	
	@Around("aop()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("around-before");
		joinPoint.proceed();
		System.out.println("around-after");
	}
	
	/**
	 * 事务管理器
	 */
	@Autowired
	public PlatformTransactionManager platformTransactionManager;
	
	
	/**
	 * 设置事务拦截器
	 * @return
	 */
	@Bean
	public TransactionInterceptor transactionInterceptor(){
		DefaultTransactionAttribute defaultTransactionAttribute = new DefaultTransactionAttribute();
		defaultTransactionAttribute.setReadOnly(false);
		NameMatchTransactionAttributeSource nameMatchtransactionAttributeSource = new NameMatchTransactionAttributeSource();
		nameMatchtransactionAttributeSource.addTransactionalMethod("save", defaultTransactionAttribute);
		return new TransactionInterceptor(platformTransactionManager,nameMatchtransactionAttributeSource);
	}
	
	/**
	 * 事务切口方法
	 * TODO 还存在报错问题没有解决
	 * @return
	 * 
	 */
	@Bean
	public Advisor advisor(){
		AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
		//execution 表达式 匹配save方法
        aspectJExpressionPointcut.setExpression("execution(*com.shiyanlou.springboot..*.save(..))");
		return new DefaultPointcutAdvisor(aspectJExpressionPointcut, transactionInterceptor());
	}
	
	
}
