package com.cursosdedesarrollo.sesion08.ejemplo01;

public class MainAbstracta {
    public static void main(String[] args) {

        // No está permitido crear objetos de una  clase Abstracta
        // Abstracta abstracta = new Abstracta();
        // Puedo Crear objetos de una clase que hereda de la abstracta e implementa los métodos abstractos
        HerenciaAbstracta herenciaAbstracta = new HerenciaAbstracta();
        System.out.println(herenciaAbstracta);

        herenciaAbstracta = new HerenciaAbstracta("Valor");
        System.out.println(herenciaAbstracta);
        herenciaAbstracta.setPrivado("Otro Valor");
        System.out.println(herenciaAbstracta);
    }
}
