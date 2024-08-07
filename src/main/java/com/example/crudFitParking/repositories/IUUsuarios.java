package com.example.crudFitParking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crudFitParking.models.usuariosModel;

@Repository
public interface IUUsuarios extends JpaRepository<usuariosModel, Long> {

}
