package com.springtutorial.rabbitmq.messagingrabbitmq.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;


public class MessageReceiver {
    @RabbitListener(queues = "hello")
    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }


    @RabbitListener(queues = "fanout.queue1")
    public void receiveMessageFromFanoutQueue1(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }

    @RabbitListener(queues = "fanout.queue2")
    public void receiveMessageFromFanoutQueue2(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }

    @RabbitListener(queues = "topic.queue1")
    public void receiveMessageFromTopic1(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }

    @RabbitListener(queues = "topic.queue2")
    public void receiveMessageFromTopic2(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }
}
