package com.springtutorial.rabbitmq.messagingrabbitmq.config;

import com.springtutorial.rabbitmq.messagingrabbitmq.receive.MessageReceiver;
import com.springtutorial.rabbitmq.messagingrabbitmq.send.MessageSender;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SendAndReceiveConfiguration {
    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public MessageReceiver receiver() {
        return new MessageReceiver();
    }
}
