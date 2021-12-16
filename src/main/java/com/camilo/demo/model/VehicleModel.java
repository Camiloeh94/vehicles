package com.camilo.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class VehicleModel {

    private String brand;
    private String model;
    private Integer year;
    private Integer km;
    private String displacement;
}
