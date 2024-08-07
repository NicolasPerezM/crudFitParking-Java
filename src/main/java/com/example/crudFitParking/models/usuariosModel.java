package com.example.crudFitParking.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuarios")
public class usuariosModel {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombres;  

    @Column
    private String apellidos;  

    @Column(name = "email", unique = true, nullable = false) 
    private String email;

    @Column
    private String direccion;

    @Column
    private Long telefono;  

    @Column
    private Date fechaNacimiento; 

    @Column
    private Long documentoId;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Long documentoId) {
        this.documentoId = documentoId;
    }
}
