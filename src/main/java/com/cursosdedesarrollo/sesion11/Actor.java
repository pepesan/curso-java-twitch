package com.cursosdedesarrollo.sesion11;

import lombok.Data;

import java.io.Serializable;

// Crea una nueva clase llamada Actor
// Mete los constructores con y sin parámetros, los getter y setter, el toString y el equals y hashcode
@Data
public class Actor implements Serializable {
    // Haz también que implemente el interfaz serializable y tenga un serialUID predefinido
    private Long serialUID = 1L;
    // El actor debe tener una serie de propiedades: nombre, años de experiencia, género favorito
    private String nombre;
    private String generoFavorito;
    private Integer agnosExperiencia;

    public Actor(){
        this.nombre = "";
        this.generoFavorito = "";
        this.agnosExperiencia = 0;
    }

    public Actor(String nombre, String generoFavorito, Integer agnosExperiencia) {
        this.nombre = nombre;
        this.generoFavorito = generoFavorito;
        this.agnosExperiencia = agnosExperiencia;
    }
}
