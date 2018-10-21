package com.shenhx.demo.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7850717601120804579L;
	
	private String name;

	public String execute() throws Exception {
		this.name = "hello,world by struct2";
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
