package com.rohan.template.spring.usedcardealership.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarDetail {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
    @ManyToOne
    private CarManufacturer manufacturer;
    private String model;
    @Type(type = "org.hibernate.type.StringType")
    private String year;
    private float kilometerDone;
    @ManyToOne
    private CarFuelType fuelType;
    @ManyToOne
    private CarBodyType bodyType;
    private String owners;
    @ManyToOne
    private CarTransmissionType transmissionType;
    @ManyToOne
    private CarLocation location;
    private Double price;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "carDetail"
    )
    private Set<CarImage> images = new HashSet<>();

    public void addImage(CarImage image){
        images.add(image);
        image.setCarDetail(this);
    }

    public void removeImage(CarImage image){
        images.remove(image);
        image.setCarDetail(null);
    }

    public void addImage(Set<CarImage> images){
        images.forEach(image -> addImage(image));
    }

    public void removeImage(Set<CarImage> images){
        images.forEach(image -> removeImage(image));
    }
}
