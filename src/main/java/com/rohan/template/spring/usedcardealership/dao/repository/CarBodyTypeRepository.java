package com.rohan.template.spring.usedcardealership.dao.repository;

import com.rohan.template.spring.usedcardealership.dao.entity.CarBodyType;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import static com.rohan.template.spring.usedcardealership.configuration.CacheConfiguration.CAR_BODY_TYPE_CACHE;

public interface CarBodyTypeRepository extends JpaRepository<CarBodyType, UUID> {
    @Cacheable(CAR_BODY_TYPE_CACHE)
    Optional<CarBodyType> findByBodyTypeEqualsIgnoreCase(String bodyType);
}
