package com.camilo.demo.service;

import com.camilo.demo.model.MaintenanceModel;

import java.util.List;

public interface MaintenanceService {

    MaintenanceModel save(MaintenanceModel maintenanceModel);

    List<MaintenanceModel> maintenanceByVehicleId(String id);

    Integer maintenanceNumberByVehicle(String id);
}
