package com.nttdata.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class YankiListener {



    @KafkaListener(topics = "yanki-topic", groupId = "yanki")
    public void listener(String message){
        System.out.println("Received Message in group foo:"+ message);
    }
}
