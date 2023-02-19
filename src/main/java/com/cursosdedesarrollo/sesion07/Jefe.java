package com.cursosdedesarrollo.sesion07;

import java.util.Objects;

public class Jefe extends Empleado{
    public String departamento;

    public Jefe() {
        super();
        this.departamento = "";
    }

    public Jefe(String nombre, String dni, String tlf, Double sueldo, String cargo, String departamento) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "departamento='" + departamento + '\'' +
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
        Jefe jefe = (Jefe) o;
        return Objects.equals(getDepartamento(), jefe.getDepartamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDepartamento());
    }
}
