package com.cursosdedesarrollo.sesion02;

public class Sentencias02Bucles {
    public static void main(String[] args) {
        // Bucle de tipo While
        // primero pregunta y luego dispara (La roca)
        System.out.println("Antes del bucle");
        // Bucle que da dos vueltas
        // inicializo la variable del bucle
        int i = 0;
        // Compruebo que debo entrar o seguir en el bucle
        // con la condición i<2
        // mientras que se cumpla esa condición seguiré dentro del bucle
        while (i<2){
            // Sentencia que yo quiero repetir ya dentro del bucle
            System.out.println(i);
            // Incremento de la variable del bucle
            i++;
        }
        // fuera del bucle
        System.out.println("Fuera del primer bucle");

        // Bucle que da 3 vueltas
        System.out.println("Bucle de tres vueltas");
        // inicialización i
        i= 0;
        // Comprobación i
        while (i<3){
            System.out.println(i);
            // modificación o incremento de i
            i++;
        }

        // Bucle for
        // Repetir un número de veces
        // La ametralladora o gatlin
        System.out.println("Bucle de tres vueltas con for");
        // for (init;compr;inc){}
        for (i = 0; i<3; i++){
            System.out.println(i);
        }
        System.out.println("Bucle de cuatro vueltas con for");
        // Bucle de 4 vueltas
        for (i = 0; i<4; i++){
            System.out.println(i);
        }

        // Bucle do While
        // Primero dispara y luego pregunta + John Wick
        System.out.println("Bucle de 3 vueltas con do While");
        // inicialización
        i=0;
        do{
            // código a ejecutar
            System.out.println(i);
            // modificación
            i++;
        // comprobación
        }while (i<3);


    }
}
