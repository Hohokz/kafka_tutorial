package com.tutorial.kafkaconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@Table(name = "KAFKA_ENCRYPT_MESSAGE")
public class KafkaEncryptMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "TOPIC")
    private String topic;
    @Column(name = "MESSAGE_OFFSET")
    private Integer messageOffset;
    @Column(name = "KEY_MESSAGE")
    private String keyMessage;

}
