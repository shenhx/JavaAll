package com.shiyanlou.springboot;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 数据源配置类
 * @author 623724489
 *
 */
@Configuration
public class DataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties("app.datasource.main")
	public DataSourceProperties mainDataSourceProperties(){
		return new DataSourceProperties();
	}
	
	@Bean
	@Primary
	@ConfigurationProperties("app.datasource.main")
	public DataSource mainDataSource() {
		return mainDataSourceProperties().initializeDataSourceBuilder().build();
	}
	
	@Bean
	@ConfigurationProperties("app.datasource.sub")
	public DataSourceProperties subDataSourceProperties(){
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties("app.datasource.sub")
	public DataSource subDataSource() {
		return subDataSourceProperties().initializeDataSourceBuilder().build();
	}
	
}
