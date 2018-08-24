package com.shenhx.innerclass;

public class LocalInnerClass {
	private static int a;
	private int b;

	public void Test1(final int c) {
		final int d = 1;
		class Inner {
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}

	public static void Test2(final int c) {
		final int d = 1;
		class Inner {
			public void print() {
				System.out.println(a);
				// System.out.println(b); // 静态方法不支持访问成员变量
				System.out.println(c);
				System.out.println(d);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
}
