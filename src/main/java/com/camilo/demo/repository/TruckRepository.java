package com.camilo.demo.repository;

import com.camilo.demo.model.TruckModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckModel, String> {
}
