package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")

public class Arbol implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la arbol.

    @Id //id arbol es la llave de la tabla arbol. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_arbol") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idArbol;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}