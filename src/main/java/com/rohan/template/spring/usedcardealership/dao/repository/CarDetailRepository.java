package com.rohan.template.spring.usedcardealership.dao.repository;

import com.rohan.template.spring.usedcardealership.dao.entity.CarDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarDetailRepository extends JpaRepository<CarDetail, UUID> {
}
