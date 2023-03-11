package com.cursosdedesarrollo.sesion12;

public class ImprimeInteger {
    private Integer entero;

    ImprimeInteger(){
        this.entero = 0;
    }
    ImprimeInteger(Integer entero){
        this.entero = entero;
    }

    public void imprime(){
        System.out.println(this.entero);
    }
}
