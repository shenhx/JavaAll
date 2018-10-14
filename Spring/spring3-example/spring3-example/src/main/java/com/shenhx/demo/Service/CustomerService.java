package com.shenhx.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shenhx.demo.Dao.CustomerDao;

@Component
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public String toString() {
		return "CustomerService [customerDao=" + customerDao + "]";
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
}
