package com.cursosdedesarrollo.sesion08.ejemplo01;

public abstract class Abstracta {

    private String privado;


    public String getPrivado() {
        return privado;
    }

    Abstracta(){
        privado = "";
    }

    public Abstracta(String privado) {
        this.privado = privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public abstract void hazAlgo();
}
