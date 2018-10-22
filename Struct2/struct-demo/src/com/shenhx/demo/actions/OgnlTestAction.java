package com.shenhx.demo.actions;

import com.opensymphony.xwork2.ActionSupport;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class OgnlTestAction extends ActionSupport {

	private static final long serialVersionUID = -1992610040139609990L;

	public static String Unicode2GBK(String dataStr) {
        int index = 0;
        StringBuffer buffer = new StringBuffer();
  
        while(index<dataStr.length()) {
               if(!"//u".equals(dataStr.substring(index,index+2))){
                buffer.append(dataStr.charAt(index));
                index++;
                continue;
         }
        String charStr = "";
      charStr = dataStr.substring(index+2,index+6);
      
        char letter = (char) Integer.parseInt(charStr, 16 );
         buffer.append(letter);
               index+=6;
        }
        return buffer.toString();
 }

	
	public OgnlTestAction() {
		try {
			this.unicodeName = URLEncoder.encode("测试", "unicode");
			// 无效转换
			// System.out.println(URLEncoder.encode(this.unicodeName,"UTF-8"));
			// System.out.println(URLEncoder.encode(this.unicodeName,"GBK"));
			// System.out.println(new String(this.unicodeName.getBytes("unicode"),"GBK"));
			this.unicodeName = URLDecoder.decode(this.unicodeName, "unicode");
			System.out.println(URLEncoder.encode("测试","GBK"));
			System.out.println(URLEncoder.encode("测试","GB2312"));
			System.out.println(URLEncoder.encode("测试","ISO-8859-1"));
			System.out.println(URLEncoder.encode("测试","UTF-8"));
			System.out.println(URLEncoder.encode("测试","unicode"));
			
			//this.name = Unicode2GBK(this.unicodeName);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.unicodeName = "failure!";
		}
		this.nameList = new ArrayList<>();
		this.nameList.add("test1");
		this.nameList.add("shx");
		this.nameList.add("test你好3test");
	}
	
	private String unicodeName;
	
	private String name;
	
	/**
	 * 获取类的名称
	 * @return
	 */
	public static String getClassName() {
		return OgnlTestAction.class.getName();
	}
	
	private List<String> nameList;
	
	public String test() {
		return "default";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public String getUnicodeName() {
		return unicodeName;
	}

	public void setUnicodeName(String unicodeName) {
		this.unicodeName = unicodeName;
	}
	
}
