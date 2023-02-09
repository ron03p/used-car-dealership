package com.rohan.template.spring.usedcardealership.dao;

import com.rohan.template.spring.usedcardealership.model.Car;

import java.util.Optional;
import java.util.UUID;

public interface CarDao {
    Car add(Car car);
    Optional<Car> get(UUID id);
    void update(UUID id);
    void remove(UUID id);
}
