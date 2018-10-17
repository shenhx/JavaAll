package com.ioc.shiyanlou.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "animal")
	public IAmimal getAnimal(){
		return new Dog();
	}
	
	@Bean(name = "mouse")
	public IAmimal getMouse() {
		return new Mouse();
	}
	
	@Bean(name = "TestBean")
	public TestBean getTestBean() {
		return new TestBean();
	}
	
}
