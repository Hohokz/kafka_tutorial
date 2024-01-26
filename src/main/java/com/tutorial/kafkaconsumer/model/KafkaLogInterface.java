package com.tutorial.kafkaconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@ToString
@Table(name = "KAFKA_LOG_INTERFACE")
public class KafkaLogInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "KEY_TOPIC")
    private String keyTopic;
    @Column(name = "KAFKA_OFFSET")
    private Integer kafkaOffset;
    @Column(name = "VALUE")
    private String value;
    @Column(name = "DECRYPT_VALUE")
    private String decryptValue;
}
