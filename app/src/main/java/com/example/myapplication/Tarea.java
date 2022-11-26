package com.example.myapplication;


import androidx.annotation.NonNull;

import java.io.Serializable;

public class Tarea implements Serializable {

    private int id;
    private String titulo;
    private String descripcion;


    @NonNull


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
