package com.cursosdedesarrollo.sesion11;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Crea una nueva clase llamada Serie
// Mete los constructores con y sin parámetros, los getter y setter, el toString y el equals y hascode
// Crea los nuevos setter y getter para reparto y modifica el toString y el equals y hashcode de Serie
@Data
public class Serie implements Serializable {

    // Haz también que implemente el interfaz serializable y tenga un serialUID predefinido
    private Long serialUID = 1L;

    // La clase debe disponer de un título, un género y un año de publicación
    private String titulo;
    private String genero;
    private Integer agno;

    // Mete un nuevo atributo en Serie llamado reparto que sea un listado de Actores (List<Actor>)
    private List<Actor> reparto;

    public Serie(){
        this.titulo = "";
        this.genero = "";
        this.agno = 0;
        this.reparto = new ArrayList<>();
    }

    public Serie(String titulo, String genero, Integer agno) {
        this.titulo = titulo;
        this.genero = genero;
        this.agno = agno;
        this.reparto = new ArrayList<>();
    }
    public Serie(String titulo, String genero, Integer agno, List<Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.agno = agno;
        this.reparto = reparto;
    }

}
