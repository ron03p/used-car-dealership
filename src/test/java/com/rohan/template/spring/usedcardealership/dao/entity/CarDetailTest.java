package com.rohan.template.spring.usedcardealership.dao.entity;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarDetailTest {
    CarDetail carDetail;

    @BeforeEach
    void setUp() {
        carDetail = new CarDetail();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("should add an image to the existing set of images associated with a car")
    void addImage() {
        int initialImageCount = carDetail.getImages().size();
        CarImage carImage = new CarImage();
        carImage.setImageUrl(RandomStringUtils.randomAlphanumeric(256));
        carDetail.addImage(carImage);
        int finalImageCount = carDetail.getImages().size();
        assertThat(finalImageCount).isEqualTo(initialImageCount +1);
        assertThat(carImage.getCarDetail()).isEqualTo(carDetail);
    }

    @Test
    void removeImage() {
    }

    @Test
    void testAddImage() {
    }

    @Test
    void testRemoveImage() {
    }
}
