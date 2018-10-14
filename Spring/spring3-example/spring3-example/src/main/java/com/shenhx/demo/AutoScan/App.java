package com.shenhx.demo.AutoScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shenhx.demo.Service.CustomerService;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "SpringCustomer.xml" });

		/*CustomerService cust = (CustomerService) context
				.getBean("customerService");*/
		CustomerService cust = (CustomerService)context.getBean("customerService");
		System.out.println(cust);
	}

}
