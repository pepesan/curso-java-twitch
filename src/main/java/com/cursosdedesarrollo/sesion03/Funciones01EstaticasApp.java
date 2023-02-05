package com.cursosdedesarrollo.sesion03;

import static com.cursosdedesarrollo.sesion03.Funciones01Estaticas.*;
public class Funciones01EstaticasApp {
    public static void main(String[] args) {
        // invocación del procedimiento
        nombreFuncion();

        // invocar a función que devuelve un valor entero (int)
        int i = devuelveEntero();
        System.out.println("Valor de i: "+ i);
        // invocar a la función que suma
        i = suma(2,3);
        System.out.println("Sumando 2 y 3: "+ i);
        i = 2;
        int j = 3;
        int res = 0;
        res = suma(i,j);
        System.out.println("Sumando i y j: "+ res);

        // Definimos un array
        int[] unArray = new int[2];
        unArray[0] = 1;
        unArray[1] = 2;
        res = sumaValores(unArray);
        System.out.println("Sumando valores del Array: "+ res);

        int[] otroArray = new int[3];
        otroArray[0] = 1;
        otroArray[1] = 2;
        otroArray[2] = 3;
        res = sumaValores(otroArray);
        System.out.println("Sumando valores del Array: "+ res);
    }
}
