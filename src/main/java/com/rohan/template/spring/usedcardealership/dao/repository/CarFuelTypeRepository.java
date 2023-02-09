package com.rohan.template.spring.usedcardealership.dao.repository;

import com.rohan.template.spring.usedcardealership.dao.entity.CarFuelType;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import static com.rohan.template.spring.usedcardealership.configuration.CacheConfiguration.CAR_FUEL_TYPE_CACHE;

public interface CarFuelTypeRepository extends JpaRepository<CarFuelType, UUID> {
    @Cacheable(CAR_FUEL_TYPE_CACHE)
    Optional<CarFuelType> findByFuelTypeEqualsIgnoreCase(String fuelType);
}
