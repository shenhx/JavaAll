package com.shenhx.javabasic.javaapi.javalang;

public class ClassDemo {

	public void print() throws ClassNotFoundException {
		String objString = new String();
		@SuppressWarnings("rawtypes")
		Class objClass;
		objClass = objString.getClass();
		System.out.println("String对象的类型是："+objClass.getName());
		objClass = Integer.class;
		System.out.println("Integer对象的类型是："+objClass.getName());
		objClass = Class.forName("java.lang.String");
		System.out.println("Charator对象的类型是："+objClass.getName());
		objClass = Integer.class;
		System.out.println("Charator对象的父类型是："+objClass.getName());
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		objClass = systemClassLoader.loadClass("java.lang.String");
		System.out.println("使用systemClassLoader输出的Charator对象的类型是："+objClass.getName());
	}
}
