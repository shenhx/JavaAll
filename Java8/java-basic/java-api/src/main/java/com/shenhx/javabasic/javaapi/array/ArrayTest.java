package com.shenhx.javabasic.javaapi.array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 没有多维数组
	 */
	static void demo1(){
		int[][] a;
		a = new int[4][];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		a[0] = new int[2];
		a[0][1] = 6;
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[0][i]);
		}
	}

}
