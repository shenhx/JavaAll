package com.shenhx.javabasic.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GcTest {

	public static void main(String[] args) {
		// softReferenceTest();
		// weekReferenceTest();
		phantomReferenceTest();
	}
	
	/*
	 * 特点
	 * java -Xmx2m -Xms2m SoftReferenceTest
	 */
	static void softReferenceTest(){
		SoftReference<Person>[] people = new SoftReference[100000];
		for (int i = 0; i < people.length; i++) {
			people[i] = new SoftReference<Person>(new Person("小"+i, (i+1)*4%100));
		}
		System.out.println(people[2].get());
		System.out.println(people[4].get());
		System.gc();
		System.runFinalization();
		System.out.println("GC回收后：");
		System.out.println(people[2].get());
		System.out.println(people[4].get());
	}
	
	static void weekReferenceTest(){
		String str = new String("test");
		WeakReference<String> weakReference = new WeakReference<String>(str);
		str = null;
		System.out.println(weakReference.get());
		System.out.println("GC回收后：");
		System.gc();
		System.runFinalization();
		System.out.println(weakReference.get());
		System.out.println(str);
		System.out.println(str==null);
	}
	
	static void phantomReferenceTest(){
		String str = new String("test");
		ReferenceQueue<String> rq = new ReferenceQueue<>();
		PhantomReference<String> pr = new PhantomReference<String>(str, rq);
		str = null;
		System.out.println(pr.get());
		System.out.println("GC回收后：");
		System.gc();
		System.runFinalization();
		System.out.println(rq.poll() == pr);
	}
	
}
