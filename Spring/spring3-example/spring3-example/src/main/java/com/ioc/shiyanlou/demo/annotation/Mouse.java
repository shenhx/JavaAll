package com.ioc.shiyanlou.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class Mouse implements IAmimal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("mouse is making noise...");
	}

}
