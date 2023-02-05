package com.cursosdedesarrollo.sesion03;

public class Funciones01Estaticas {

    // Ejemplos de funciones
    // modificador estatica develve nombre (){}
    public static void nombreFuncion(){
        // Procedimiento
        System.out.println("Algo por pantalla");
    }

    // Ejemplo de función que devuelve un valor
    public static int devuelveEntero(){
        return 1+2;
    }

    // Ejemplo de función que suma dos números
    public static int suma(int sumando1, int sumando2){
        return sumando1+sumando2;
    }

    // Ejemplo de suma de valores de un array
    public static int sumaValores(int[] miArray){
        int res = 0;
        for (int i : miArray) {
            res+= i;
        }
        return res;
    }

    public static int resta (int i, int j){
        return i-j;
    }

    // implementacion de la multi
    public  static  float multi(float f1, float f2){
        return f1*f2;
    }
}
