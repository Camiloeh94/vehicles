package com.camilo.demo.service;

import com.camilo.demo.model.CarModel;

import java.util.List;

public interface CarService {

    CarModel save(CarModel car);

    CarModel update(String id, CarModel carUpdate);

    List<CarModel> list();

    CarModel findById(String id);

    Boolean delete(String id);
}
