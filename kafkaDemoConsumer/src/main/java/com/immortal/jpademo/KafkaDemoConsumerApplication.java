package com.immortal.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.immortal.jpademo.consumer.Reader;

@SpringBootApplication
public class KafkaDemoConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(KafkaDemoConsumerApplication.class, args);		
	}
}
