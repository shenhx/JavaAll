package com.shiyanlou.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "animal")
	public IAmimal getAnimal(){
		return new Dog();
	}
	
	@Autowired
	@Qualifier("mouse")
	public IAmimal getAnimal2;
}
