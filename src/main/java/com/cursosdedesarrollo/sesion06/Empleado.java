package com.cursosdedesarrollo.sesion06;

import java.util.Objects;

public class Empleado extends Persona{
    private Double sueldo;

    public Empleado() {
        super();
        this.sueldo = 0.0;
    }

    public Empleado(String nombre, Double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + getNombre() +
                "," +
                "sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(getSueldo(), empleado.getSueldo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSueldo());
    }
}
