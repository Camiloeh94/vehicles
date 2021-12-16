package com.camilo.demo.model;

import com.camilo.demo.utils.Types;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CarModel extends VehicleModel {

    @Id
    private String id;
    private Types type;
    private Integer doors;
    private Integer passengers;
    private Integer trunkCapacity;
}
