package com.cursosdedesarrollo.sesion07;

import java.util.Objects;

public class Currito extends Empleado{

    public Integer marrones;

    public Currito() {
        super();
        this.marrones = 0;
    }

    public Currito(String nombre, String dni, String tlf, Double sueldo, String cargo, Integer marrones) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.marrones = marrones;
    }

    public Integer getMarrones() {
        return marrones;
    }

    public void setMarrones(Integer marrones) {
        this.marrones = marrones;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "marrones=" + marrones +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Currito currito = (Currito) o;
        return Objects.equals(getMarrones(), currito.getMarrones());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMarrones());
    }
}
