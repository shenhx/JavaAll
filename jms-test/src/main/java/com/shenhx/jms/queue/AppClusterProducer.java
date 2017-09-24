package com.shenhx.jms.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
public class AppClusterProducer {

    private static final String url = "failover:(tcp://127.0.0.1:61617,tcp://127.0.0.1:61618)?randomize=true";
    private static final String queueName = "cluster-queue-test";

    public static void main(String[] args) throws JMSException {
        //1.创建ConnectionFactory
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        //2. 创建Connction
        Connection connection = connectionFactory.createConnection();
        //启动连接
        connection.start();
        //4.创建会话
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建一个目标
        Destination destination = session.createQueue(queueName);
        //创建一个生产者
        MessageProducer producer = session.createProducer(destination);

        for (int i = 0; i < 100; i++) {
            //创建消息
            TextMessage textMessage = session.createTextMessage("test" + i);
            //发送消息
            producer.send(textMessage);
            System.out.println("发送消息" + textMessage.getText());
        }
        //关闭连接
        connection.close();
    }
}
