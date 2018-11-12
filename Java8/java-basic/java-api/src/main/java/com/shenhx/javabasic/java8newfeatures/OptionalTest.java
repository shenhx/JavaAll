package com.shenhx.javabasic.java8newfeatures;

import java.util.Optional;

public class OptionalTest {
	public void test(Integer value1,Integer value2) {
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		System.out.println(this.sum(a,b));
	}

	private Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// isPresent 用于检查值是否存在

	      System.out.println("First parameter is present: " + a.isPresent());
	      System.out.println("Second parameter is present: " + b.isPresent());
	      
	      Integer value1 = a.orElse(new Integer(0));
	      Integer value2 = b.get();
	      return value1+value2;
	}
}
