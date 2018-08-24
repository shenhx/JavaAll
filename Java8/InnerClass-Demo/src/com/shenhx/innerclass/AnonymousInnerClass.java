package com.shenhx.innerclass;

public class AnonymousInnerClass {

	private int a;
	private static int b;

	private Object obj2 = new Object() {
		private String name = "匿名内部类";

		@Override
		public String toString() {
			return this.name;
		}
	};

	public void Test1() {
		Object obj = new Object() {
			
			@Override
			public String toString() {
				System.out.println(b);
				return String.valueOf(a);
			}
		};
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		
	}
}
