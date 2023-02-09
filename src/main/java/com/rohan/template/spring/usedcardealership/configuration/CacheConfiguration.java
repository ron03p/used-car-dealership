package com.rohan.template.spring.usedcardealership.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfiguration {
    public static final String CAR_BODY_TYPE_CACHE = "car_body_type";
    public static final String CAR_FUEL_TYPE_CACHE = "car_fuel_type";
    public static final String CAR_LOCATION_CACHE = "car_location_type";
    public static final String CAR_MANUFACTURER_CACHE = "car_manufacturer_type";
    public static final String CAR_TRANSMISSION_TYPE_CACHE = "car_transmission_type";
}
