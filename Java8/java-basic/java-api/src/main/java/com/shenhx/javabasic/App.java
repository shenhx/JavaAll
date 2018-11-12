package com.shenhx.javabasic;

import java.io.UnsupportedEncodingException;

import com.shenhx.javabasic.java8newfeatures.Base64StringTest;
import com.shenhx.javabasic.java8newfeatures.DateTimeTest;
import com.shenhx.javabasic.java8newfeatures.OptionalTest;

// import com.shenhx.javabasic.javaapi.javalang.ClassDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*ClassDemo demo1 = new ClassDemo();
        try {
			demo1.print();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	// OptionalTest test=  new OptionalTest();
    	//test.test(null, 1);
    	
    	//DateTimeTest test = new DateTimeTest();
    	//test.demo2();
    	
    	Base64StringTest test = new Base64StringTest();
    	try {
			test.demo1();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
