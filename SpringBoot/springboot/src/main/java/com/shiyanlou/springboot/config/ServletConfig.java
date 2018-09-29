package com.shiyanlou.springboot.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

// 方式一： 使用properties配置文件
// @Configuration 表示该类为配置类，可以被@ComponentScan扫描到
// 方式二： 使用注解声明配置类
// @Configuration
// 方式三： 使用传统方式，xml配置
public class ServletConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setPort(8081);
	}

}
