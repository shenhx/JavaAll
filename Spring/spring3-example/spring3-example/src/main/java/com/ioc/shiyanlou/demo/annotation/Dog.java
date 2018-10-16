package com.ioc.shiyanlou.demo.annotation;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements IAmimal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("dog is barking");
	}

}
