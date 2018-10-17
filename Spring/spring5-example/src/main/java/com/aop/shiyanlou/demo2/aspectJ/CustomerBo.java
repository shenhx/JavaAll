package com.aop.shiyanlou.demo2.aspectJ;

public class CustomerBo implements ICustomerBo {
	@Override
	public void addCustomer() {
		System.out.println("addCustomer() is running ...");
	}

	@Override
	public void deleteCustomer() {
		System.out.println("deleteCustomer() is running ...");
	}

	@Override
	public String AddCustomerReturnValue() {
		System.out.println("AddCustomerReturnValue() is running ...");
		return "abc";
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ...");
		throw new Exception("Generic Error");
	}

	@Override
	public void addCustomAround(String name) {
		System.out.println("addCustomerAround() is running ,args:" + name);

	}
}
