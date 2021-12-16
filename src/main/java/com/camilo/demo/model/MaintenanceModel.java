package com.camilo.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MaintenanceModel {

    @Id
    private Integer id;
    private LocalDate date;
    @OneToOne(cascade = CascadeType.MERGE)
    private CarModel car;
    @OneToOne(cascade = CascadeType.MERGE)
    private TruckModel truck;
}
