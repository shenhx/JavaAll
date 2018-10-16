package com.ioc.shiyanlou.demo.entity;

import com.ioc.shiyanlou.demo.innerBean.Person;

public class HelloEntity {

	private Person person;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloEntity [person=" + person + ", name=" + name + "]";
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
