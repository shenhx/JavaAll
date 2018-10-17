package com.aop.shiyanlou.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.shiyanlou.demo2.aspectJ.CustomerBo;
import com.aop.shiyanlou.demo2.aspectJ.ICustomerBo;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"SpringAopAspectJ.xml"});
		ICustomerBo customerBo = appContext.getBean("customerBo",ICustomerBo.class);
		customerBo.addCustomer();
		customerBo.deleteCustomer();
	}

}
