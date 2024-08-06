package com.example.crudFitParking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudFitParking.repositories.IUUsuarios;
import java.util.List;
import java.util.Optional;

@Service
public class usuariosService  {
    @Autowired
    IUUsuarios IUsuarios;

    // Create or Update
    public void saveOrUpdate(com.example.crudFitParking.models.usuariosModel usuarios) {
        IUsuarios.save(usuarios);
    }

    //Read
    public List<com.example.crudFitParking.models.usuariosModel> getUsuarios() {
        return IUsuarios.findAll();
    }

    //Read by Id
    public Optional<com.example.crudFitParking.models.usuariosModel> getUsuario(Long id) {
       return IUsuarios.findById(id);
    }

    //Delete by id
    public void deleteUsuario(Long id) {
        IUsuarios.deleteById(id);
    }
}
    
