package com.example.crudFitParking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crudFitParking.models.vehiculosModel;


public interface vehiculosRepository extends JpaRepository<vehiculosModel, Long> {

}
