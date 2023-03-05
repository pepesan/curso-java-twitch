package com.cursosdedesarrollo.sesion11;

import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        System.out.println("Ejercicios Resueltos de Colecciones");
        // Declara un objeto del tipo List<String> llamado listado
        List<String> listado = new LinkedList<>();
        // Mete dos nuevos elementos en el listado
        listado.add("Uno");
        listado.add("Dos");
        // Imprime por pantalla el primer elemento del listado
        System.out.println(listado.get(0));
        // Recorre el listado e imprime por pantalla los elementos del listado
        System.out.println("---- recorrer el listado ----");
        for (String s: listado) {
            System.out.println(s);
        }
        // Borra el último elemento de listado
        System.out.println(listado.size());
        listado.remove(1);
        // y comprueba que ya no existe en el listado
        System.out.println(listado);

        // Crea un nuevo objeto que sea un conjunto de elementos de tipo Integer (Set<Integer>) llamado numeros
        Set<Integer> numeros = new HashSet<>();
        // Mete un par de elementos dentro de conjunto de numeros
        numeros.add(1);
        numeros.add(2);

        // Recorre el conjunto de números e imprímelos por pantalla
        System.out.println("---- recorrer el set ----");
        for (Integer i : numeros) {
            System.out.println(i);
        }

        // Crea un objeto de tipo Mapa cuya clave sea un Integer y el valor sea una String
        System.out.println("---- parte de mapas ----");
        Map<Integer, String> mapa = new HashMap<>();
        // Mete dos valores con sus respectivas claves en el mapa
        mapa.put(0, "Uno");
        mapa.put(1, "Dos");
        // Imprime por pantalla el primer valor que has introducido
        System.out.println(mapa.get(0));
        // Recorre el mapa e imprime los valores por pantalla
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

        Set<Integer> claves = mapa.keySet();
        System.out.println("---- recorrer un mapa ----");
        for (Integer i : claves) {
            System.out.println("Clave: "+ i +", Valor: "+mapa.get(i));
        }

        // Dentro de la función main del programa crea un objeto de la clase Serie, dos objetos de la clase Actor

        // Mete los constructores con y sin parámetros, los getter y setter, el toString y el equals y hashcode

        Serie theMandalorian = new Serie("The Mandadalorian", "Western Soap Opera", 2019);

        // Mete los constructores con y sin parámetros, los getter y setter, el toString y el equals y hascode
        Actor pedroPascal = new Actor("Pedro Pascal", "Drama", 27);
        Actor ginaCarano  = new Actor("Gina Carano", "Drama", 22);

        // Mete los objetos de la clase actor dentro del reparto del objeto Serie
        theMandalorian.getReparto().add(pedroPascal);
        theMandalorian.getReparto().add(ginaCarano);
        // Imprime por pantalla los actores que están dentro del objeto reparto del objeto de la serie
        System.out.println(theMandalorian.getReparto());
        for (Actor a :
                theMandalorian.getReparto()) {
            System.out.println(a);
        }

    }
}
