package com.rohan.template.spring.usedcardealership.dao;

import com.rohan.template.spring.usedcardealership.dao.entity.*;
import com.rohan.template.spring.usedcardealership.dao.repository.*;
import com.rohan.template.spring.usedcardealership.mapper.CarMapper;
import com.rohan.template.spring.usedcardealership.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarDaoImpl implements CarDao{

    private final CarDetailRepository carDetailRepository;
    private final CarBodyTypeRepository carBodyTypeRepository;
    private final CarFuelTypeRepository carFuelTypeRepository;
    private final CarLocationRepository carLocationRepository;
    private final CarManufacturerRepository carManufacturerRepository;
    private final CarTransmissionTypeRepository carTransmissionTypeRepository;
    private final CarMapper carMapper;

    @Override
    public Car add(Car car) {
        CarDetail carDetail = carMapper.toCarDetail(car);
        CarManufacturer manufacturer = carManufacturerRepository
                .findByManufacturerEqualsIgnoreCase(car.manufacturer())
                .orElseThrow(() -> new RuntimeException("Invalid Car Manufacturer"));
        carDetail.setManufacturer(manufacturer);
        CarFuelType fuelType = carFuelTypeRepository
                .findByFuelTypeEqualsIgnoreCase(car.fuelType())
                .orElseThrow(() -> new RuntimeException("Invalid Car Fuel Type"));
        carDetail.setFuelType(fuelType);
        CarBodyType bodyType = carBodyTypeRepository
                .findByBodyTypeEqualsIgnoreCase(car.bodyType())
                .orElseThrow(() -> new RuntimeException("Invalid Car Body Type"));
        carDetail.setBodyType(bodyType);
        CarTransmissionType transmissionType = carTransmissionTypeRepository
                .findByTransmissionTypeEqualsIgnoreCase(car.transmissionType())
                .orElseThrow(() -> new RuntimeException("Invalid Car Transmission Type"));
        carDetail.setTransmissionType(transmissionType);
        CarLocation location = carLocationRepository
                .findByLocationEqualsIgnoreCase(car.location())
                .orElseThrow(() -> new RuntimeException("Invalid Car Location"));
        carDetail.setLocation(location);
        Set<CarImage> images = carMapper.toCarImageSet(car.images());
        carDetail.addImage(images);
        carDetailRepository.save(carDetail);
        return car.withId(carDetail.getId());
    }

    @Override
    public Optional<Car> get(UUID id) {
        return null;
    }

    @Override
    public void update(UUID id) {
        //ToDo
    }

    @Override
    public void remove(UUID id) {
        carDetailRepository.deleteById(id);
    }
}
