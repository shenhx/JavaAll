package com.shenhx.javabasic.javaapi.collection;

public class CollectionTest {

	public static void main(String[] args) {
		setToMapTest();
	}
	
	static void setToMapTest() {
		Set2Map<String, Integer> scores = new Set2Map<>();
		
		scores.put("语文", 10);
		scores.put("数学", 12);
		scores.put("英语", 11);
		
		System.out.println(scores);
		
		scores.removeEntry("数学");
		System.out.println("删除数学后，成绩清单："+scores);
		
		System.out.println("语文成绩是："+scores.get("语文"));
		
		System.out.println("英语成绩在不在："+scores.containsKey("英语"));
		
		scores.clear();
		System.out.println(scores);
	}
}
