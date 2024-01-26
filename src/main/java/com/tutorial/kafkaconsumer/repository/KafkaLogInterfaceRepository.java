package com.tutorial.kafkaconsumer.repository;

import com.tutorial.kafkaconsumer.model.KafkaLogInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface KafkaLogInterfaceRepository extends JpaRepository<KafkaLogInterface, UUID>, JpaSpecificationExecutor<UUID> {
}