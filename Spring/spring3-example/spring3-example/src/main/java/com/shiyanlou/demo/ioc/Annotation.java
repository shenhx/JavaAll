package com.shiyanlou.demo.ioc;

/**
 * 注解
 * 
 * @author 623724489
 *
 */
public class Annotation {
	// 使用说明
	// 1. @Component
	/*
	 * @Component("shiyanlou") 等价于：xml配置中的<bean id="shiyanlou"
	 * class="com.shiyanlou.spring.shiyanlou">
	 */
	// 2. Spring中常见的注解
	/*
	 * @Controller:对应表现层的 Bean，也就是 Action 。
	 * @Service:对应的是业务层 Bean 。
	 * @Repository:对应数据访问层 Bean 。
	 */
	// 3.  @Autowired
	/*
	 * @Autowired 可以用来装配 bean，都可以写在字段上，或者方法上
	 * */
	// 4. @Configuration
	/*
	 * 通过使用注释 @Configuration 告诉 Spring ，这个 Class 是 Spring 的核心配置文件，并且通过使用注释 @Bean 定义 bean
	 * */

}
