package com.aop.shiyanlou.demo.advice;

import org.springframework.beans.factory.annotation.Value;

public class CustomerService {
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	
	@Value("baidu")
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	
	@Value("http://baidu.com")
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", url=" + url + "]";
	}
	
	public void printName() {
		System.out.print(this.getName());
		
	}
	
	public void printUrl() {
		System.out.print(this.getUrl());
	}
	
	public void printException() throws IllegalAccessException {
		throw new IllegalAccessException();
		
	}
	
}
