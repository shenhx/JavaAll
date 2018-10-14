package com.shiyanlou.demo.innerBean;

public class Customer {

	private Person person;
	
	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}

	public Customer(Person person) {
		// TODO Auto-generated constructor stub
		this.setPerson(person);
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
