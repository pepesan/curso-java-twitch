package com.cursosdedesarrollo.sesion05;

import java.util.Objects;

public class Madre {
    private String nombre;

    public Madre() {
        this.nombre = "";
    }

    public Madre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Madre{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Madre madre = (Madre) o;
        return Objects.equals(nombre, madre.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
