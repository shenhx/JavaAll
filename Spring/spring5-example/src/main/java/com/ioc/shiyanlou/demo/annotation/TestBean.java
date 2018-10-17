package com.ioc.shiyanlou.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean {

	private IAmimal amimal;

	public IAmimal getAmimal() {
		return amimal;
	}
	
	@Autowired
	public void Init(@Qualifier("mouse")IAmimal amimal) {
		this.amimal = amimal;
	}
	
}
