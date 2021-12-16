package com.camilo.demo.service.impl;

import com.camilo.demo.exception.TruckException;
import com.camilo.demo.model.TruckModel;
import com.camilo.demo.repository.TruckRepository;
import com.camilo.demo.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckRepository truckRepository;

    @Override
    public TruckModel save(TruckModel truck) {
        return truckRepository.save(truck);
    }

    @Override
    public TruckModel update(String id, TruckModel truckUpdate) {
        TruckModel truck = findById(id);
        truck.setBrand(truckUpdate.getBrand());
        truck.setModel(truckUpdate.getModel());
        truck.setYear(truckUpdate.getYear());
        truck.setKm(truckUpdate.getKm());
        truck.setDisplacement(truckUpdate.getDisplacement());
        truck.setType(truckUpdate.getType());
        truck.setTonsCapacity(truckUpdate.getTonsCapacity());
        truck.setAxys(truckUpdate.getAxys());

        return truckRepository.save(truck);
    }

    @Override
    public List<TruckModel> list() {
        return truckRepository.findAll();
    }

    @Override
    public TruckModel findById(String id) {
        Optional<TruckModel> optTruck = truckRepository.findById(id);
        if(optTruck.isEmpty()) {
            throw new TruckException("Lo sentimos, no pudimos encontrar el camión solicitado");
        }
        return optTruck.get();
    }

    @Override
    public Boolean delete(String id) {
        TruckModel truck = findById(id);
        truckRepository.delete(truck);

        return true;
    }
}
