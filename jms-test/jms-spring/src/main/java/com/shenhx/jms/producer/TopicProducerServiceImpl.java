package com.shenhx.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class TopicProducerServiceImpl implements  ProducerService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "topicDestination")
    Destination destination;

    public void sendMessage(final String message) {
        //使用JmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息：" + message);
    }
}
