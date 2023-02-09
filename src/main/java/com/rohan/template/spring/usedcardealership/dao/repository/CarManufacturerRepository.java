package com.rohan.template.spring.usedcardealership.dao.repository;

import com.rohan.template.spring.usedcardealership.dao.entity.CarManufacturer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import static com.rohan.template.spring.usedcardealership.configuration.CacheConfiguration.CAR_MANUFACTURER_CACHE;

public interface CarManufacturerRepository extends JpaRepository<CarManufacturer, UUID> {
    @Cacheable(CAR_MANUFACTURER_CACHE)
    Optional<CarManufacturer> findByManufacturerEqualsIgnoreCase(String manufacturer);
}
