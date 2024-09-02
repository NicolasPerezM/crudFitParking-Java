package com.example.crudFitParking.models;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios_vehiculos")
public class usuariosVehiculosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column
    private Long idUsuarios;

    @Column
    private Long idVehiculos;

    public Long getIdUsuarios() {
        return idUsuarios;
    }

    public Long getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdUsuarios(Long idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public void setIdVehiculos(Long idVehiculos) {
        this.idVehiculos = idVehiculos;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}  
