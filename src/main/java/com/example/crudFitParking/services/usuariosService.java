package com.example.crudFitParking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudFitParking.repositories.IUUsuarios;
import java.util.List;
import java.util.Optional;
import com.example.crudFitParking.models.usuariosModel;

@Service
public class usuariosService  {
    @Autowired
    IUUsuarios IUsuarios;

    // Create or Update
    public void saveOrUpdate(usuariosModel usuarios) {
        IUsuarios.save(usuarios);
    }

    //Read
    public List<usuariosModel> getUsuarios() {
        return IUsuarios.findAll();
    }

    //Read by Id
    public Optional<usuariosModel> getUsuario(Long id) {
       return IUsuarios.findById(id);
    }

    //Delete by id
    public void deleteUsuario(Long id) {
        IUsuarios.deleteById(id);
    }
}
    
