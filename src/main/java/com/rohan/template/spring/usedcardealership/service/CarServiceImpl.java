package com.rohan.template.spring.usedcardealership.service;

import com.rohan.template.spring.usedcardealership.dao.CarDao;
import com.rohan.template.spring.usedcardealership.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{
    private final CarDao carDao;

    @Override
    public Car add(Car car) {
        return carDao.add(car);
    }
}
