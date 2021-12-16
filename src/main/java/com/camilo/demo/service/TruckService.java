package com.camilo.demo.service;

import com.camilo.demo.model.TruckModel;

import java.util.List;

public interface TruckService {

    TruckModel save(TruckModel truck);

    TruckModel update(String id, TruckModel truckUpdate);

    List<TruckModel> list();

    TruckModel findById(String id);

    Boolean delete(String id);
}
