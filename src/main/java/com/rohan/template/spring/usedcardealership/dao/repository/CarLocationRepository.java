package com.rohan.template.spring.usedcardealership.dao.repository;

import com.rohan.template.spring.usedcardealership.dao.entity.CarLocation;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import static com.rohan.template.spring.usedcardealership.configuration.CacheConfiguration.CAR_LOCATION_CACHE;

public interface CarLocationRepository extends JpaRepository<CarLocation, UUID> {
    @Cacheable(CAR_LOCATION_CACHE)
    Optional<CarLocation> findByLocationEqualsIgnoreCase(String location);
}
