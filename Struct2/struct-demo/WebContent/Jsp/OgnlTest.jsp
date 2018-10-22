<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloWorld</title>
</head>
<body>
	<s:property value="name"></s:property>
	<p>
		<s:set var="mySet" value="#{'k1':'K1已经下架','k2':'2017新版K2'}" />
		<s:property value="#mySet['K1']" />
		<s:property value="#mySet['K2']" />
		<s:url value="#mySet['K1']" />
	</p>
	<!-- 强制使用OGNL -->
	<s:url value="%{#mySet['K1']}" />
	<!-- 调用静态方法 -->
	<p>
		<s:property
			value="@com.shenhx.demo.actions.OgnlTestAction@getClassName()" />
	</p>
	<!-- 投影与过滤 -->
	<p>
		<s:property value="nameList.{?#this.contains('test')}" />
		<s:property value="nameList.{^#this.contains('test')}" />
		<s:property value="nameList.{$#this.contains('test')}" />
	</p>
	<!-- 编码转换 -->

	<p>
		<s:property value="unicodeName" />
	</p>
	<span>解决乱码：</span>
	<p>
		<s:property value='@java.net.URLEncoder@encode(unicodeName,"GBK")' />
	</p>
	<p>
		<s:property value='new String(unicodeName.getBytes("unicode"),"GBK")' />
	</p>
	<span>返回值：</span>
	<p>
	#mySet['K1']
		http://localhost:8080/HelloWorldStruts2/;jsessionid=BD0F0A35DF09350637DD6FC3A987DA02
		com.shenhx.demo.actions.OgnlTestAction [test1,
		test你好3test][test1][test你好3test] 
		测试 
		解决乱码： %B2%E2%CA%D4</p>
</body>
</html>