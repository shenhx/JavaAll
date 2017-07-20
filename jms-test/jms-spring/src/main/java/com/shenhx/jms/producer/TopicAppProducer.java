package com.shenhx.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class TopicAppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Producer.xml");
        ProducerService service = (ProducerService)context.getBean("topicProducerService");
        for (int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();
    }
}
