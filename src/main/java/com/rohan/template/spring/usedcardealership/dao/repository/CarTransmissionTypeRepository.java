package com.rohan.template.spring.usedcardealership.dao.repository;

import com.rohan.template.spring.usedcardealership.dao.entity.CarTransmissionType;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import static com.rohan.template.spring.usedcardealership.configuration.CacheConfiguration.CAR_TRANSMISSION_TYPE_CACHE;

public interface CarTransmissionTypeRepository extends JpaRepository<CarTransmissionType, UUID> {
    @Cacheable(CAR_TRANSMISSION_TYPE_CACHE)
    Optional<CarTransmissionType> findByTransmissionTypeEqualsIgnoreCase(String transmissionType);
}
