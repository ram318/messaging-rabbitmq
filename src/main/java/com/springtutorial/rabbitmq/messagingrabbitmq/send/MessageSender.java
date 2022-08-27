package com.springtutorial.rabbitmq.messagingrabbitmq.send;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.amqp.core.Queue;

import java.util.Date;

public class MessageSender {
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        String message = "Hello World! Sent at "+new Date();
        System.out.println("Sending message.... "+message);
        this.template.convertAndSend(queue.getName(), message);
        System.out.println(" Sent '" + message + "'");
    }
}
