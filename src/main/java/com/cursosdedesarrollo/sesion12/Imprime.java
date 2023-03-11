package com.cursosdedesarrollo.sesion12;

public class Imprime <Tipo>{

    private Tipo objeto;

    Imprime(Tipo objeto){
        this.objeto = objeto;
    }
    public void imprime(){
        System.out.println(this.objeto);
    }
}
