package com.tutorial.kafkaconsumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class KafkaLogInterfaceDto {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("keyTopic")
    private String keyTopic;

    @JsonProperty("kafkaOffset")
    private Integer kafkaOffset;

    @JsonProperty("value")
    private String value;

    @JsonProperty("decryptValue")
    private String decryptValue;

    // Constructors, getters, setters, and other methods

    @Override
    public String toString() {
        return "KafkaLogInterface{" +
                "id=" + id +
                ", keyTopic='" + keyTopic + '\'' +
                ", kafkaOffset=" + kafkaOffset +
                ", value='" + value + '\'' +
                ", decryptValue='" + decryptValue + '\'' +
                '}';
    }

}
