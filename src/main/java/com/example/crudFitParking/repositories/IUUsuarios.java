package com.example.crudFitParking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IUUsuarios extends JpaRepository<com.example.crudFitParking.models.usuariosModel, Long> {

}