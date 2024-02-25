package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")

public class Arbol implements Serializable { 

    private static final long serialVersionUID = 1L; 

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol") 
    private long id_arbol;
    private String nombre_cientifico;
    private String nombre_comun;
    private boolean activo;
    private float altura_metros;
    private char ruta_imagen;
    

    public Arbol() {
    }

    public Arbol(String nombre_cientifico, boolean activo) {
        this.nombre_cientifico = nombre_cientifico;
        this.activo = activo;
    }

    public Long getid_arbol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setruta_imagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}