package com.example.crudFitParking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.crudFitParking.services.vehiculosService;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.crudFitParking.models.vehiculosModel;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/vehiculos")

public class vehiculosController {
    @Autowired
    private vehiculosService vehiculosService;

    //Endpoint para actualizar o crear un nuevo vehiculo
    @PostMapping
    public void saveOrUpdate(@RequestBody vehiculosModel vehiculosModel) {
        vehiculosService.saveOrUpdate(vehiculosModel);
    }

    //Endpoint para leer todos los vehiculos
    @GetMapping
    public List<vehiculosModel> getAllVehiculos() {
        return vehiculosService.getVehiculos();
    }

    //Endpoint para leer un vehiculo por su id
    @GetMapping(path = "/{vehiculoId}")
    public Optional <vehiculosModel> getVehiculoById(@PathVariable("vehiculoId") Long vehiculoId) {
        return vehiculosService.getVehiculo(vehiculoId);
    }

    //Endpoint para borrar un vehiculo por su id
    @DeleteMapping(path = "/{vehiculoId}")
    public void deleteVehiculo(@PathVariable("vehiculoId") Long vehiculoId) {
        vehiculosService.deleteVehiculo(vehiculoId);
    }
}
