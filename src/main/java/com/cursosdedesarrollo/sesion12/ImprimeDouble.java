package com.cursosdedesarrollo.sesion12;

public class ImprimeDouble {
    private Double doble;

    ImprimeDouble(){
        this.doble = 0.0;
    }
    ImprimeDouble(Double doble){
        this.doble = doble;
    }

    public void imprime(){
        System.out.println(this.doble);
    }
}
