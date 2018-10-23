package com.shenhx.javabasic.java8newfeatures;

public interface DefultInterfaceTest {

	default void printToPrinter(String content) {
		System.out.println("默认打印到打印机！");
	}
	
	static void AlterUser() {
		System.out.println("打印机告警！");
	}
}
