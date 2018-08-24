package com.shenhx.innerclass;

public class StaticInnerClass {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private static String sex;

	public static class InnerClass {
		private String enName = "world";
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			// String sex = getSex(); // 允许，可以访问外部类的所有静态变量或方法等
			// String name = getName(); // 禁止
			return super.toString();
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		this.name = "hello";
		return this.name + "," + (new StaticInnerClass.InnerClass()).enName;
	}

	public static String getSex() {
		return sex;
	}

	public static void setSex(String sex) {
		StaticInnerClass.sex = sex;
	}

}
