package com.shenhx.innerclass;

public class MemberInnerClass {
	private String name="outer";
	private static String name2  ="outer_static";
	public class InnerClass{
		private String name = "inner";// �Ḳ�������ͬ������
		public String toString() {
			return name2+","+name+","+this.name+","+getName();
		};
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
