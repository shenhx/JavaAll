package com.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if ("".equals(springXmlPath) || springXmlPath == null) {
            springXmlPath = "classpath*:spring-*.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.destroy();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId) {
        try {
            return (T) context.getBean(beanId);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> clazz) {
        try {
            return (T) context.getBean(clazz);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }

    }
}
