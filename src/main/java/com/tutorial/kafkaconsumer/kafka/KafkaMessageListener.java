package com.tutorial.kafkaconsumer.kafka;

import com.tutorial.kafkaconsumer.service.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @Autowired
    private KafkaService kafkaService;

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "message",groupId = "group-1")
    public void consumeMessage(String message){
        log.info("consume message : {}" , message);
    }
    @KafkaListener(topics = "kafka-value", groupId = "your-group-id", containerFactory = "kafkaListenerContainerFactory")
    public void consumeValue(String messageData){

        if (messageData != null) {
            kafkaService.saveKafkaEncrypt(messageData);
            log.info("consume message : {}" , messageData.toString());
        } else {
            log.info("Failed to convert Kafka message to KafkaLogInterface");
        }

    }
}
