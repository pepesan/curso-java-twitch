package com.cursosdedesarrollo.sesion05;

import java.util.Objects;

public class Hija extends Madre{
    private String tlf;

    public Hija(){
        // Ejecutar la constructora de la Madre
        super();
        // Rellenar los datos propios
        this.tlf = "";
    }

    public Hija(String nombre, String tlf){
        // Ejecutar la constructora de la Madre
        super(nombre);
        // Rellenar los datos propios
        this.tlf = tlf;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString(){
        return "Hija{ nombre='" +
                this.getNombre() +"', " +
                "tlf='" + this.tlf +
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hija hija = (Hija) o;
        return Objects.equals(tlf, hija.tlf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tlf);
    }
}
