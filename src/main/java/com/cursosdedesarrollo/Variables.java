package com.cursosdedesarrollo;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Ejemplos de Variables");
        // Declaración de la variable
        int numero;
        // Inicialización de la variable
        numero = 12;
        // imprimir variable por pantalla
        System.out.println(numero);

        // Tipos de variables
        System.out.println("Ejemplos de variables Booleanas");
        // Variables booleanas
        boolean activo = true;
        // cambiar el valor de la variables
        activo  = false;
        // imprimir por pantalla
        System.out.println(activo);

        // Variables numéricas
        // números enteros
        int natural = 12;
        System.out.println(natural);
        long largo = 2131234154;
        System.out.println(largo);
        // Byte -128 + 127
        byte unByte = -125;
        // short 2 byte tamaño
        short cortico = 255;
        // números de coma flotante
        float temperatura = 12.3F;
        System.out.println(temperatura);
        double valorDePi = 3.141597;
        System.out.println(valorDePi);

        // Caracteres (Unicode)
        // ref: https://es.wikipedia.org/wiki/Unicode
        char arbol = '木';
        System.out.println(arbol);
    }
}
