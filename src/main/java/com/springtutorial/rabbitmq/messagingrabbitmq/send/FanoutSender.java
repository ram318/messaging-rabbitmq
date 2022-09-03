package com.springtutorial.rabbitmq.messagingrabbitmq.send;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

public class FanoutSender {

    @Autowired
    private RabbitTemplate template;


    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        String message = "Hello World! Sent at "+new Date();
        System.out.println("Sending Fanout message.... "+message);
        this.template.convertAndSend("fanout.exchange","", "[FO] "+message);
        System.out.println(" Sent '" + message + "'");
    }
}
