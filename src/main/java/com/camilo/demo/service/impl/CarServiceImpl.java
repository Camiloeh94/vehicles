package com.camilo.demo.service.impl;

import com.camilo.demo.exception.CarException;
import com.camilo.demo.model.CarModel;
import com.camilo.demo.repository.CarRepository;
import com.camilo.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public CarModel save(CarModel car) {
        return carRepository.save(car);
    }

    @Override
    public CarModel update(String id, CarModel carUpdate) {
        CarModel car = findById(id);

        car.setBrand(carUpdate.getBrand());
        car.setModel(carUpdate.getModel());
        car.setYear(carUpdate.getYear());
        car.setKm(carUpdate.getKm());
        car.setDisplacement(carUpdate.getDisplacement());
        car.setType(carUpdate.getType());
        car.setDoors(carUpdate.getDoors());
        car.setPassengers(carUpdate.getPassengers());
        car.setTrunkCapacity(carUpdate.getTrunkCapacity());

        return carRepository.save(car);
    }

    @Override
    public List<CarModel> list() {
        return carRepository.findAll();
    }

    @Override
    public CarModel findById(String id) {
        Optional<CarModel> optCar = carRepository.findById(id);
        if(optCar.isEmpty()) {
            throw new CarException("Lo sentimos, no pudimos encontrar el automóvil solicitado");
        }
        return optCar.get();
    }

    @Override
    public Boolean delete(String id) {
        CarModel car = findById(id);
        carRepository.delete(car);

        return true;
    }
}
