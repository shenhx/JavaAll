package com.aop.shiyanlou.demo;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.shiyanlou.demo.advice.CustomerService;
import com.aop.shiyanlou.demo.advice.ProductService;

public class AppTest {
	
	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Aop3Context.xml"});
		//CustomerService customerService = context.getBean("customerService",CustomerService.class);
		// AOP
		//CustomerService customerService = context.getBean("customerServiceProxy",CustomerService.class);
		CustomerService customerService = context.getBean(CustomerService.class);
		ProductService productService = context.getBean(ProductService.class);
		// System.out.println(customerService.toString());
		System.out.println(customerService);
		System.out.println(productService);
		customerService.printName();
		System.out.print("-----------------");
		System.out.println();
		customerService.printUrl();
		System.out.print("-----------------");
		System.out.println();
		try {
			customerService.printException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}
