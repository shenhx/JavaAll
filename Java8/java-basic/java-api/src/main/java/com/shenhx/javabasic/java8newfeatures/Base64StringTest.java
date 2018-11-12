package com.shenhx.javabasic.java8newfeatures;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;


public class Base64StringTest {

	public void demo1() throws UnsupportedEncodingException {
		
		String base64String1 = Base64.getEncoder().encodeToString("测试123affv".getBytes());
		System.out.println("字符串1="+base64String1);
		
		byte[] base64DecodeBytes = Base64.getDecoder().decode(base64String1);
		System.out.println("原来的字符串："+new String(base64DecodeBytes,"UTF-8"));
		
		// 使用URL类型的Base64编码
		base64String1 = Base64.getUrlEncoder().encodeToString("Shiyanlou.com".getBytes("utf-8"));
        System.out.println("URL base64 encoding:" + base64String1);

        // MIME类型的Base64编码
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; ++i) {
           stringBuilder.append(UUID.randomUUID().toString());
        }

        byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("MIME base64 encoding:" + mimeEncodedString);
		
	}
}
