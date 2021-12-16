package com.camilo.demo.controller;

import com.camilo.demo.model.TruckModel;
import com.camilo.demo.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truck")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @PostMapping
    public ResponseEntity<TruckModel> save(@RequestBody TruckModel truckModel) {
        return ResponseEntity.ok(truckService.save(truckModel));
    }

    @PutMapping
    public ResponseEntity<TruckModel> update(@RequestParam(value = "id", required = true) String id,
                                             @RequestBody TruckModel truckModel) {
        return ResponseEntity.ok(truckService.update(id, truckModel));
    }

    @GetMapping
    public ResponseEntity<List<TruckModel>> list() {
        return ResponseEntity.ok(truckService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TruckModel> findById(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(truckService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam(value = "id", required = true) String id) {
        return ResponseEntity.ok(truckService.delete(id));
    }
}
