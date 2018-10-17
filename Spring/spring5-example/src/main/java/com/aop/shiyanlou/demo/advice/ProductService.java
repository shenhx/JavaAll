package com.aop.shiyanlou.demo.advice;

import org.springframework.beans.factory.annotation.Value;

public class ProductService {
	private String name;
	private String price;
	public String getName() {
		return name;
	}
	
	@Value("libai")
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", private=" + price + "]";
	}
	
	public void printName() {
		System.out.print(this.getName());
		
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
