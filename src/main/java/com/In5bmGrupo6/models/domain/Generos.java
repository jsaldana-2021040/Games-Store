package com.In5bmGrupo6.models.domain;

/**
 *
 * @author TulioJimènez
 */

public class Generos {

    private int id_genero;
    private String tipo_genero;
   

    public Generos() {
    }

    public Generos(int id_genero) {
        this.id_genero = id_genero;
    }
    

    public Generos(String tipo_genero ) {
        this.id_genero = id_genero;
        this.tipo_genero = tipo_genero;
      
    }

    public Generos(int id_genero, String tipo_genero) {
        this.id_genero = id_genero;
        this.tipo_genero = tipo_genero;
       
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getTipo_genero() {
        return tipo_genero;
    }

    public void setTipo_genero(String tipo_genero) {
        this.tipo_genero = tipo_genero;
    }

  
}
