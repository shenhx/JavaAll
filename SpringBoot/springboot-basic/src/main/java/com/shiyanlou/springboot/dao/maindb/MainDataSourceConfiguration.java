package com.shiyanlou.springboot.dao.maindb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 主连接配置
 * @author 623724489
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = ("com.shiyanlou.springboot.dao.maindb"),
		entityManagerFactoryRef = "entityManagerFactoryBeanMain",
		transactionManagerRef = "transactionManagerMain"
		)
public class MainDataSourceConfiguration {

	private final DataSource mainDataSource;
	
	@Autowired
	public MainDataSourceConfiguration(@Qualifier("mainDataSource")DataSource mainDataSource) {
		this.mainDataSource = mainDataSource;
	}
	
	@Primary
	@Bean(name = "entityManagerFactoryBeanMain")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBeanMain(EntityManagerFactoryBuilder builder) {
		// return null;
		return builder.dataSource(mainDataSource).packages("com.shiyanlou.springboot.dao.maindb").packages("com.shiyanlou.springboot.entity").build();
	}
	
	@Primary
	@Bean(name="transactionManagerMain")
	public PlatformTransactionManager transactionManagerMain(EntityManagerFactoryBuilder builder){
		return new JpaTransactionManager(entityManagerFactoryBeanMain(builder).getObject());
	}
}
