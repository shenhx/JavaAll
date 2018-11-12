package com.shenhx.javabasic.java8newfeatures;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	/**
	 * 例子一：函数式接口
	 */
	public void calc() {
		MathOperation addition = (int a, int b)-> a+b;
		MathOperation subtraction  = (int a, int b)-> a-b;
		MathOperation division  = (int a, int b)-> {
			return a/b;
		};
		MathOperation multiplication = (int a, int b)-> a*b;
		// 输出结果
        System.out.println("10 + 5 = " + this.operate(10, 5, addition));
        System.out.println("10 - 5 = " + this.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + this.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + this.operate(10, 5, division));
		 
		
	}
	
	private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
     }
	
	public void printDemo2() {
		List<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zack");
        names.add("Bob");
        names.forEach(System.out::println);
	}
}
