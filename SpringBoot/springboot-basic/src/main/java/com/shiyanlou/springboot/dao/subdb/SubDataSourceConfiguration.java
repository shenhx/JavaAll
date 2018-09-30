package com.shiyanlou.springboot.dao.subdb;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

/**
 * 子连接配置
 * @author 623724489
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = ("com.shiyanlou.springboot.dao.subdb"),
		entityManagerFactoryRef = "entityManagerFactoryBeanSub",
		transactionManagerRef = "transactionManagerSub"
		)
public class SubDataSourceConfiguration {

	private final DataSource subDataSource;
	
	@Autowired
	public SubDataSourceConfiguration(@Qualifier("subDataSource")DataSource subDataSource) {
		this.subDataSource = subDataSource;
	}
	
	@Bean(name = "entityManagerFactoryBeanSub")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBeanSub(EntityManagerFactoryBuilder builder) {
		// return null;
		return builder.dataSource(subDataSource).packages("com.shiyanlou.springboot.dao.subdb").packages("com.shiyanlou.springboot.entity").build();
	}
	
	@Bean(name="transactionManagerSub")
	public PlatformTransactionManager transactionManagerSub(EntityManagerFactoryBuilder builder){
		return new JpaTransactionManager(entityManagerFactoryBeanSub(builder).getObject());
	}
}
