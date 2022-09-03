package com.springtutorial.rabbitmq.messagingrabbitmq.config;

import com.springtutorial.rabbitmq.messagingrabbitmq.send.FanoutSender;
import com.springtutorial.rabbitmq.messagingrabbitmq.send.TopicSender;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class FanoutExchangeConfiguration {

    @Bean
    public Declarables fanoutBindings() {
        Queue fanoutQueue1 = new Queue("fanout.queue1", false);
        Queue fanoutQueue2 = new Queue("fanout.queue2", false);
        FanoutExchange fanoutExchange = new FanoutExchange("fanout.exchange");

        return new Declarables(
                fanoutQueue1,
                fanoutQueue2,
                fanoutExchange,
                BindingBuilder.bind(fanoutQueue1).to(fanoutExchange),
                BindingBuilder.bind(fanoutQueue2).to(fanoutExchange));
    }

    @Profile("fanoutsender")
    @Bean
    public FanoutSender sender() {
        return new FanoutSender();
    }
}
