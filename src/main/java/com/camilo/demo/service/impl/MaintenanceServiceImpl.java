package com.camilo.demo.service.impl;

import com.camilo.demo.model.MaintenanceModel;
import com.camilo.demo.repository.MaintenanceRepository;
import com.camilo.demo.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public MaintenanceModel save(MaintenanceModel maintenanceModel) {
        return maintenanceRepository.save(maintenanceModel);
    }

    @Override
    public List<MaintenanceModel> maintenanceByVehicleId(String id) {
        return maintenanceRepository.findAllByCarId(id);
    }

    @Override
    public Integer maintenanceNumberByVehicle(String id) {
        Integer count = 0;

        List<MaintenanceModel> list = maintenanceByVehicleId(id);

        return list.size();
    }
}
