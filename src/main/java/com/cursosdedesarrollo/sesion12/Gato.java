package com.cursosdedesarrollo.sesion12;

import lombok.Data;

@Data
public class Gato extends Animal{
    private String nombre;

    Gato(){
        super();
        this.nombre = "";
    }

    Gato(Integer edad, String nombre){
        super(edad);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad='" + this.getEdad() + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
