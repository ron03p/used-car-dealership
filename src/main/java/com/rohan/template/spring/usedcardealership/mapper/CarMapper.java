package com.rohan.template.spring.usedcardealership.mapper;

import com.rohan.template.spring.usedcardealership.dao.entity.CarDetail;
import com.rohan.template.spring.usedcardealership.dao.entity.CarImage;
import com.rohan.template.spring.usedcardealership.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface CarMapper {
    @Mapping(target = "manufacturer",ignore = true)
    @Mapping(target = "fuelType",ignore = true)
    @Mapping(target = "bodyType",ignore = true)
    @Mapping(target = "transmissionType",ignore = true)
    @Mapping(target = "location",ignore = true)
    @Mapping(target = "images",ignore = true)
    CarDetail toCarDetail(Car carModel);

    Set<CarImage> toCarImageSet(Set<String> images);

    default CarImage toCarImage(String imageUrl){
        CarImage carImage = new CarImage();
        carImage.setImageUrl(imageUrl);
        return carImage;
    }
}
