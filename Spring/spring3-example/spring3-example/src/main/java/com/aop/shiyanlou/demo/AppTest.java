package com.aop.shiyanlou.demo;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.shiyanlou.demo.advice.CustomerService;

public class AppTest {
	
	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"AopContext.xml"});
		CustomerService customerService = context.getBean("customerService",CustomerService.class);
		// System.out.println(customerService.toString());
		customerService.printName();
		System.out.print("-----------------");
		System.out.println();
		customerService.printUrl();
		System.out.print("-----------------");
		System.out.println();
		try {
			customerService.printException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
