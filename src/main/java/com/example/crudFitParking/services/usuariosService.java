package com.example.crudFitParking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudFitParking.repositories.IUUsuarios;
import java.util.List;

@Service
public class usuariosService  {
    @Autowired
    IUUsuarios IUsuarios;

    // Create or Update
    public void saveOrUpdate(com.example.crudFitParking.models.usuariosModel usuarios) {
        IUsuarios.save(usuarios);
    }

    public List<com.example.crudFitParking.models.usuariosModel> findAll() {
        return IUsuarios.findAll();
    }
}
