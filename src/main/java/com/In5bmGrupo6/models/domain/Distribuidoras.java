package com.In5bmGrupo6.models.domain;

/**
 *
 * @author joser
 */
public class Distribuidoras {

    private int id;
    private String nombre_distribuidora;

    public Distribuidoras() {
    }

    public Distribuidoras(int id) {
        this.id = id;
    }

    public Distribuidoras(String nombre_distribuidora) {
        this.nombre_distribuidora = nombre_distribuidora;
    }

    public Distribuidoras(int id, String nombre_distribuidora) {
        this.id = id;
        this.nombre_distribuidora = nombre_distribuidora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_distribuidora() {
        return nombre_distribuidora;
    }

    public void setNombre_distribuidora(String nombre_distribuidora) {
        this.nombre_distribuidora = nombre_distribuidora;
    }
    

    
}
