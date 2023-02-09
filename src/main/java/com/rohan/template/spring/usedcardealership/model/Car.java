package com.rohan.template.spring.usedcardealership.model;

import java.util.Set;
import java.util.UUID;

public record Car(UUID id, String manufacturer, String model, String year,
                  float kilometerDone, String fuelType, String bodyType,
                  String owners, String transmissionType, String location, Double price, Set<String> images) {
    public Car withId(UUID id){
        return new Car(id, manufacturer(), model(), year(), kilometerDone(),
                fuelType(), bodyType(), owners(), transmissionType(),
                location(), price(), images());
    }
}
