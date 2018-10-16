package com.aop.shiyanlou.demo;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aop.shiyanlou.demo.advice.CustomerService;
import com.aop.shiyanlou.demo.advice.MyBeforeMethod;
import com.oracle.webservices.internal.api.message.PropertySet.Property;
import com.sun.xml.internal.bind.v2.runtime.Name;

@Configuration
public class AppConfig {
	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService() {
//		return new CustomerService();
//	}
//	
//	@Bean(name="myBeforeMethod")
//	public MyBeforeMethod getMyBeforeMethod() {
//		return new MyBeforeMethod();
//	}
	
}
