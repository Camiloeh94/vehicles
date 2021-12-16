package com.camilo.demo.controller;

import com.camilo.demo.model.MaintenanceModel;
import com.camilo.demo.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @PostMapping
    public ResponseEntity<MaintenanceModel> save(@RequestBody MaintenanceModel maintenanceModel) {
        return ResponseEntity.ok(maintenanceService.save(maintenanceModel));
    }

    @GetMapping
    public ResponseEntity<List<MaintenanceModel>> maintenanceByVehicleId(@RequestParam(value = "id") String id) {
        return ResponseEntity.ok(maintenanceService.maintenanceByVehicleId(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> maintenanceNumerByVehicleId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(maintenanceService.maintenanceNumberByVehicle(id));
    }
}
