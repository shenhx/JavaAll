package com.shiyanlou.demo.spring5_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.shiyanlou.demo.annotation.AppConfig;
import com.shiyanlou.demo.annotation.IAmimal;
import com.shiyanlou.demo.collectionBean.Customer;
import com.shiyanlou.demo.service.CustomerService;
// import org.springframework.context.support.ClassPathXmlApplicationContext;
// import com.shiyanlou.demo.entity.HelloEntity;
// import com.shiyanlou.demo.bean.FileNameGenerator;
// import com.shiyanlou.demo.innerBean.Customer;
// import com.shiyanlou.demo.looselyCoupled.OutputFileHelper;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		// Test HelloBean

		/*
		 * context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		 * HelloEntity obj = (HelloEntity)context.getBean("helloBean");
		 * System.out.println(obj);
		 */

		// Test LooselyCoupled
		/*
		 * context = new ClassPathXmlApplicationContext(new
		 * String[]{"SpringOutput.xml"}); OutputFileHelper outputFileHelper =
		 * (OutputFileHelper)context.getBean("outputHelper");
		 * outputFileHelper.generatorOutput();
		 */
		// BeanFactory
		/*
		 * context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		 * FileNameGenerator fileNameGenerator =
		 * (FileNameGenerator)context.getBean("FileNameGenerator2");
		 * System.out.println(fileNameGenerator);
		 */
		// 嵌套Bean
		/*
		 * context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		 * Customer obj1 = (Customer)context.getBean("CustomerBean");
		 * System.out.println(obj1.toString()); Customer obj2 =
		 * (Customer)context.getBean("TestBean1");
		 * System.out.println(obj2.toString());
		 */
		// scope
		/*
		 * context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		 * CustomerService CSA = (CustomerService)
		 * context.getBean("CustomerService"); CSA.setMessage("Message by CSA");
		 * System.out.println("Message : "+ CSA.getMessage());
		 * 
		 * //retrieve it again CustomerService CSB = (CustomerService)
		 * context.getBean("CustomerService"); System.out.println("Message : "+
		 * CSB.getMessage());
		 */
		// List
		/*context = new ClassPathXmlApplicationContext("SpringCollections.xml");
		Customer lists = (Customer) context.getBean("customerBean");
        System.out.println(lists.getLists().toString());*/
		// annotation
		// todo 注解还存在问题
		context = new AnnotationConfigApplicationContext(AppConfig.class);
        IAmimal obj = (IAmimal) context.getBean("animal");
        obj.makeSound();
        IAmimal obj2 = (IAmimal) context.getBean("animal2");
        obj2.makeSound();
	}
}
