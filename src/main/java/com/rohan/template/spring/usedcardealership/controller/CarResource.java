package com.rohan.template.spring.usedcardealership.controller;

import com.rohan.template.spring.usedcardealership.model.Car;
import com.rohan.template.spring.usedcardealership.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CarResource {
    private final CarService carService;
    @PostMapping("/car")
    public ResponseEntity<Car> add(@RequestBody Car car){
        return ResponseEntity.ok(carService.add(car));
    }
}
