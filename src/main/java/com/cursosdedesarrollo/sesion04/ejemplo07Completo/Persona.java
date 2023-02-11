package com.cursosdedesarrollo.sesion04.ejemplo07Completo;

import java.util.Objects;

public class Persona {

    // Atributos
    private String nombre;
    private String tlf;
    private String direccion;
    private Integer edad;

    // Constructoras
    public Persona() {
        this.nombre = "";
        this.tlf = "";
        this.direccion = "";
        this.edad = 0;
    }
    public Persona(String nombre, String tlf, String direccion, Integer edad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.direccion = direccion;
        this.edad = edad;
    }

    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // toString

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", tlf='" + tlf + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(tlf, persona.tlf) && Objects.equals(direccion, persona.direccion) && Objects.equals(edad, persona.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tlf, direccion, edad);
    }
}
