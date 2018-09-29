package com.shiyanlou.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller注解和@ResponseBody注解
@RestController
// 单资源文件：@PropertySouce(value = "classpath:shiyanlou.properties")
@PropertySources(value = { @PropertySource(value = { "classpath:shiyanlou.properties" }),@PropertySource(value = { "classpath:application.properties" })})
public class ShiyanlouController {
	
	// 使用@Value注解获取自定义的属性
	// 注意:这里只能获取application.properties文件中的属性
	@Value("${my_property}")
	private String myProperty;
	
	@Value("${other_properties}")
	private String myOtherProperty;
	
	@RequestMapping("/shiyanlou")
	public String shiyanlou(){
		// return "Hello,springboot";
		return myProperty + " " + myOtherProperty;
		// return myOtherProperty;
	}
}
