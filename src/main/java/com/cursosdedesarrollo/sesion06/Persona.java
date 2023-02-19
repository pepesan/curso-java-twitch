package com.cursosdedesarrollo.sesion06;

import java.util.Objects;

public class Persona {

    private String nombre;

    public Persona() {
        this.nombre = "";
    }

    public Persona(String nombre) {
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
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getNombre(), persona.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
}
