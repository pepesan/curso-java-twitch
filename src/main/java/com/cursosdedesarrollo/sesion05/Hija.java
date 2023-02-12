package com.cursosdedesarrollo.sesion05;

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
}
