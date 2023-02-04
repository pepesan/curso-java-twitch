package com.cursosdedesarrollo.sesion02;

public class Sentencias03Arrays {
    public static void main(String[] args) {
        System.out.println("Ejemplos de uso de bucles con Arrays");
        // un array en un conjunto ordenado de elementos o variables del mismo tipo en memoria
        // definición de un array
        int[] miArray;
        // inicialización de un array
        // debemos definir el número de elementos del array
        miArray = new int[2];
        // Acceso a los elementos del array
        // primera posición del array (posición 0)
        miArray[0] = 5;
        System.out.println("miArray[0]= "+ miArray[0]);
        miArray[1] = 7;
        System.out.println("miArray[1]= "+ miArray[1]);

        // Recorrer un array
        // Pasar por todas y cada una de las posiciones de un array
        // usando un for
        System.out.println("Recorrer un array con un for");
        for (int i = 0; i<2;i++){
            System.out.println("miArray["+i+"]= "+miArray[i]);
        }

        System.out.println("Recorrer un array con un for dinámico");
        for (int i = 0; i< miArray.length;i++){
            System.out.println("miArray["+i+"]= "+miArray[i]);
        }

        // usando un foreach
        System.out.println("Usando foreach");
        for (int numero: miArray) {
            System.out.println(numero);
        }

        // Array de 6 posiciones 0-5 inicializado al vuelo
        System.out.println("Usando foreach en array grande");
        int[] arrayGrande = {1,2,3,4,5,6};
        for (int numero : arrayGrande) {
            System.out.println(numero);
        }
    }
}
