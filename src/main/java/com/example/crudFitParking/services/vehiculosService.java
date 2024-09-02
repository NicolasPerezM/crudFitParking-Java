package com.example.crudFitParking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudFitParking.repositories.vehiculosRepository;
import com.example.crudFitParking.models.vehiculosModel;
import java.util.List;
import java.util.Optional;
@Service
public class vehiculosService {
    @Autowired
    vehiculosRepository UIvehiculos;

    // Create or Update
    public void saveOrUpdate(vehiculosModel vehiculos) {
        UIvehiculos.save(vehiculos);
    }

    // Read
    public List<vehiculosModel> getVehiculos() {
        return UIvehiculos.findAll();
    }

    // Read by Id
    public Optional<vehiculosModel> getVehiculo(Long id) {
        return UIvehiculos.findById(id);
    }

    //Delete by id
    public void deleteVehiculo(Long id) {
        UIvehiculos.deleteById(id);
    }

}
