package com.camilo.demo.controller;

import com.camilo.demo.model.CarModel;
import com.camilo.demo.service.CarService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<CarModel> save(@RequestBody CarModel carModel) {
        return ResponseEntity.ok(carService.save(carModel));
    }

    @PutMapping
    public ResponseEntity<CarModel> update(@RequestParam(value = "id", required = true) String id,
                                           @RequestBody CarModel carModel) {
        return ResponseEntity.ok(carService.update(id, carModel));
    }

    @GetMapping
    public ResponseEntity<List<CarModel>> list() {
        return ResponseEntity.ok(carService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarModel> findById(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(carService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam(value = "id") String id) {
        return ResponseEntity.ok(carService.delete(id));
    }
}
