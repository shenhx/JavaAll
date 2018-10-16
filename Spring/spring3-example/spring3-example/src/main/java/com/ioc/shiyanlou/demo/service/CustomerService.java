package com.ioc.shiyanlou.demo.service;

public class CustomerService {
	private String message;

	@Override
	public String toString() {
		return "CustomerService [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
