package com.immortal.jpademo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Publisher {

    @Autowired
    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    public String publishMessage(KafkaMessage message) {
		kafkaTemplate.send("demoTopic", message);
        System.out.println("message produced");
        return "Success";
    }
}
