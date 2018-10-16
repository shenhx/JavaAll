package com.ioc.shiyanlou.demo.ioc;

import java.io.File;







import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * 
 * @author 623724489
 * <remark>
 * 在 Spring Ioc 容器的代表就是 org.springframework.beans 包中的 BeanFactory 接口， BeanFactory 接口提供了 IoC 容器最基本功能；而 org.springframework.context 包下的 ApplicationContext 接口扩展了 BeanFactory ，还提供了与Spring AOP 集成、国际化处理、事件传播及提供不同层次的 context 实现 (如针对 web 应用的 WebApplicationContext )。简单说， BeanFactory 提供了 IoC 容器最基本功能，而 ApplicationContext 则增加了更多支持企业级功能支持。 ApplicationContext 完全继承 BeanFactory ，因而 BeanFactory 所具有的语义也适用于 ApplicationContext。
 * </remark>
 */
@SuppressWarnings("deprecation")
public class SpringIoc {

	/**
	 * BeanFactory读取配置文件
	 */
	public void testApplicationContext1(){
		File file = new File("testFileConfig.xml");
		Resource resource = (Resource) new FileSystemResource(file);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
	}
	
	/**
	 * BeanFactory读取ClassPath
	 */
	public void testApplicationContext2() {
		Resource resource = new ClassPathResource("testFileConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
	}
	
	/**
	 * ClassPathXmlApplicationContext
	 */
	public void testApplicationContext3(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath.xml");
	}
	
	/**
	 * FileSystemXmlApplicationContext
	 */
	public void testApplicationContext4(){
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("classpath.xml");
	}
}
