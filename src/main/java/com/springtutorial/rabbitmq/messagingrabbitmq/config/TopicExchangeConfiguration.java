package com.springtutorial.rabbitmq.messagingrabbitmq.config;

import com.springtutorial.rabbitmq.messagingrabbitmq.send.MessageSender;
import com.springtutorial.rabbitmq.messagingrabbitmq.send.TopicSender;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Profile;

@Configuration
public class TopicExchangeConfiguration {

    @Bean
    public Declarables topicBindings() {
        Queue topicQueue1 = new Queue("topic.queue1", false);
        Queue topicQueue2 = new Queue("topic.queue2", false);

        TopicExchange topicExchange = new TopicExchange("topic.exchange");

        return new Declarables(
                topicQueue1,
                topicQueue2,
                topicExchange,
                BindingBuilder
                        .bind(topicQueue1)
                        .to(topicExchange).with("*.important.*"),
                BindingBuilder
                        .bind(topicQueue2)
                        .to(topicExchange).with("#.error"));
    }

    @Profile("topicsender")
    @Bean
    public TopicSender sender() {
        return new TopicSender();
    }
}
