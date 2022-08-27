package com.springtutorial.rabbitmq.messagingrabbitmq;

import com.springtutorial.rabbitmq.messagingrabbitmq.runner.RabbitAmqpRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MessagingRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingRabbitmqApplication.class, args);
	}


	@Bean
	public CommandLineRunner tutorial() {
		System.out.println("Created RabbitAmqpRunner");
		return new RabbitAmqpRunner();
	}


}
