package com.tutorial.kafkaconsumer.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class KafkaEncryptMessageDto {
    private UUID id;
    private String topic;
    private Integer messageOffset;
    private String keyMessage;
}
