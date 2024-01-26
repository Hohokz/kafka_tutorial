package com.tutorial.kafkaconsumer.repository;

import com.tutorial.kafkaconsumer.model.KafkaEncryptMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//@Repository
public interface KafkaEncryptMessageRepository extends JpaRepository<KafkaEncryptMessage, UUID> {
}