package com.aop.shiyanlou.demo2.aspectJ;

public interface ICustomerBo {

	void addCustomer();
	void deleteCustomer();
	String AddCustomerReturnValue();
	void addCustomerThrowException() throws Exception;
	void addCustomAround(String name);
}
