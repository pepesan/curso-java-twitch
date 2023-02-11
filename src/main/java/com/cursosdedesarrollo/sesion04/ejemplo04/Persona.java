package com.cursosdedesarrollo.sesion04.ejemplo04;

public class Persona {
    // atributo que almacena el nombre de la persona
    public String nombre;
    // atributo para el tlf
    public String tlf;
    //atributo para la dirección
    public String direccion;
    // atributo que maneja la edad
    public Integer edad;

    public Persona(){
        this.nombre = "";
        this.tlf = "";
        this.direccion = "";
        this.edad = 0;
    }

    // función constructora con párametros
    public Persona(String nombre, String tlf, String direccion, Integer edad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.direccion = direccion;
        this.edad = edad;
    }
}
