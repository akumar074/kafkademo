package com.immortal.jpademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Reader {

    @KafkaListener(topics = "demoTopic")
    public void getKafkaMessage(KafkaMessage kafkaMessage){
        System.out.println("Here is message-------");
        System.out.println(kafkaMessage.toString());
    }
}
