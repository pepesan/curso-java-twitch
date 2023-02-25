package com.cursosdedesarrollo.sesion08.ejemplo01;

public class HerenciaAbstracta extends Abstracta{


    public HerenciaAbstracta() {
        super();
    }

    public HerenciaAbstracta(String privado) {
        super(privado);
    }

    // implementación del método de la clases abstracta
    @Override
    public void hazAlgo() {
        System.out.println("Algo");
    }

    @Override
    public String toString() {
        return "HerenciaAbstracta{private='"+getPrivado()+"'}";
    }
}
