package com.camilo.demo.repository;

import com.camilo.demo.model.MaintenanceModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaintenanceRepository extends JpaRepository<MaintenanceModel, Integer> {

    List<MaintenanceModel> findAllByCarId(String id);
}
