package com.shenhx.innerclass;

public class Program {

	public static void main(String[] args) {
		// ��̬�ڲ���
		/*
		StaticInnerClass demo = new StaticInnerClass();
		System.out.println(demo.toString()); // hello,world
		StaticInnerClass.InnerClass demo2 = new StaticInnerClass.InnerClass();
		StaticInnerClass.InnerClass demo3 = new StaticInnerClass.InnerClass();
		if(demo2.equals(demo3)) {
			System.out.println("��ͬ");
		}else {
			System.out.println("����ͬ");// ִ���������ǲ���ͬ��
		}
		*/
		
		// ��Ա�ڲ���
		/*MemberInnerClass demo = new MemberInnerClass();
		MemberInnerClass.InnerClass innerDemo = demo.new InnerClass(); // ���������е����
		System.out.println(innerDemo.toString());*/
		
		// �ֲ��ڲ���
		/*LocalInnerClass demo = new LocalInnerClass();
		demo.Test1(2);
		// demo.Test2(3);
		LocalInnerClass.Test2(3);*/
		
		// �����ڲ���
		AnonymousInnerClass demo = new AnonymousInnerClass();
		demo.Test1();
	}

}
