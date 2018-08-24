package com.shenhx.innerclass;

public class Program {

	public static void main(String[] args) {
		// 静态内部类
		/*
		StaticInnerClass demo = new StaticInnerClass();
		System.out.println(demo.toString()); // hello,world
		StaticInnerClass.InnerClass demo2 = new StaticInnerClass.InnerClass();
		StaticInnerClass.InnerClass demo3 = new StaticInnerClass.InnerClass();
		if(demo2.equals(demo3)) {
			System.out.println("相同");
		}else {
			System.out.println("不相同");// 执行这里，结果是不相同的
		}
		*/
		
		// 成员内部类
		/*MemberInnerClass demo = new MemberInnerClass();
		MemberInnerClass.InnerClass innerDemo = demo.new InnerClass(); // 声明方法有点奇怪
		System.out.println(innerDemo.toString());*/
		
		// 局部内部类
		/*LocalInnerClass demo = new LocalInnerClass();
		demo.Test1(2);
		// demo.Test2(3);
		LocalInnerClass.Test2(3);*/
		
		// 匿名内部类
		AnonymousInnerClass demo = new AnonymousInnerClass();
		demo.Test1();
	}

}
