package com.tutorial.kafkaconsumer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutorial.kafkaconsumer.model.KafkaEncryptMessage;
import com.tutorial.kafkaconsumer.model.KafkaLogInterface;
import com.tutorial.kafkaconsumer.repository.KafkaEncryptMessageRepository;
import com.tutorial.kafkaconsumer.repository.KafkaLogInterfaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaService {


    private final KafkaEncryptMessageRepository kafkaEncryptMessageRepository;
    private final KafkaComponent kafkaComponent;
//    @Autowired
//    private KafkaLogInterfaceRepository kafkaLogInterfaceRepository;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void saveKafkaEncrypt(String data){

        try{
            KafkaLogInterface logInterface = objectMapper.readValue(data, KafkaLogInterface.class);
            KafkaEncryptMessage encryptMessage = new KafkaEncryptMessage();
            encryptMessage.setTopic(logInterface.getKeyTopic());
            encryptMessage.setKeyMessage(data);
            encryptMessage.setMessageOffset(logInterface.getKafkaOffset());
//            kafkaEncryptMessageRepository.save(encryptMessage);
//            kafkaLogInterfaceRepository.save(logInterface);
        }catch (Exception e){
            throw new RuntimeException("ERROR : ", e);
        }

    }
}
