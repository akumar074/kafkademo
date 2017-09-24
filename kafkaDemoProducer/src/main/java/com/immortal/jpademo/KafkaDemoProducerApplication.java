package com.immortal.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.immortal.jpademo.producer.Publisher;

@SpringBootApplication
public class KafkaDemoProducerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KafkaDemoProducerApplication.class, args);
		
		Publisher publisher = applicationContext.getBean(Publisher.class);
		publisher.publishMessage();
	}
}
