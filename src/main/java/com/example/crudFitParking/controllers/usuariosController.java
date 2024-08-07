package com.example.crudFitParking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudFitParking.services.usuariosService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.crudFitParking.models.usuariosModel;

@RestController
@RequestMapping(path = "api/usuarios")
public class usuariosController {
    @Autowired
    private usuariosService usuariosService;

    //Create or update
    @PostMapping
    public void saveOrUpdate(@RequestBody usuariosModel usuariosModel) {
        usuariosService.saveOrUpdate(usuariosModel);
    }

    //Read
    @GetMapping
    public List<usuariosModel> getAllUsuarios() {
        return usuariosService.getUsuarios();
    }

    //Read by Id
    @GetMapping(path = "/{usuarioId}")
    public Optional <usuariosModel> getUsuariosById(@PathVariable("usuarioId") Long usuarioId) {
        return usuariosService.getUsuario(usuarioId);
    }

    //Delete
    @DeleteMapping(path = "/{usuarioId}")
    public void deleteUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuariosService.deleteUsuario(usuarioId);
    }
}
