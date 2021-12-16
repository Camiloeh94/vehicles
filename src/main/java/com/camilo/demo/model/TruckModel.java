package com.camilo.demo.model;

import com.camilo.demo.utils.Types;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TruckModel extends VehicleModel {

    @Id
    private String id;
    private Types type;
    private Integer tonsCapacity;
    private Integer axys;
}
