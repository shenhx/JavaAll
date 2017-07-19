package com.shenhx.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class AppProducer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }

    }
}
