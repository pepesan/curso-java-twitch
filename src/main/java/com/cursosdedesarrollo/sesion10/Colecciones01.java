package com.cursosdedesarrollo.sesion10;

import java.util.*;

public class Colecciones01 {
    public static void main(String[] args) {
        // Uso y manejo de colecciones en Java
        // Array list maneja los listados de manera interna como arrays
        // inicializamos un listado en base a una clase que implemente el interfaz de List
        System.out.println("-----List-----");
        List<Object> listado = new ArrayList<Object>();
        Integer entero = 12;
        // añadir elementos al final del listado
        listado.add(entero);
        System.out.println(listado);
        Integer otroEntero = 1;
        listado.add(otroEntero);
        System.out.println(listado);
        String nombre = "David";
        listado.add(nombre);
        System.out.println(listado);
        Boolean booleano = true;
        listado.add(booleano);
        System.out.println(listado);
        // obtener un valor del listado en base a su posición, empezando por 0
        System.out.println(listado.get(0));
        // Devolver el tamaño de elementos del lisatdo
        System.out.println("Numero de elementos 0" +listado.size());
        // Borrar un elemento de una posición del listado
        listado.remove(0);
        System.out.println("Numero de elementos 0" +listado.size());
        System.out.println(listado);
        System.out.println(listado.get(0));
        // Modificar el dato de una posición del listado
        listado.set(0, 2);
        System.out.println(listado);
        // Se usa linkedlint cuando sabemos que el listado de datos va a ser variable respecto a su contenido
        // Para manejar listados muy dinámicos
        List<String> familiares = new LinkedList<>();
        String madre = "Montse";
        familiares.add(madre);
        System.out.println(familiares);
        familiares.add("Ángel");
        System.out.println(familiares);
        // borrar un objeto pasado como parámetro que encuentra usando el equals de la clase
        familiares.remove("Montse");
        System.out.println(familiares);

        // Set
        System.out.println("-----Set-----");
        // Conjuntos no ordenados de elementos
        Set<String> conjunto = new HashSet<>();
        // Añadir un elemento al conjunto
        conjunto.add("David");
        System.out.println(conjunto);
        // Número de elementos del Set
        System.out.println(conjunto.size());
        // borrar un elemento
        conjunto.remove("David");
        System.out.println(conjunto);
        conjunto.add("David");
        System.out.println(conjunto);
        // si contiene el objeto devolverá true
        System.out.println(conjunto.contains("David"));

        // Mapas
        System.out.println("-----Map-----");
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(0,"Nombre");
        System.out.println(mapa);

        Map<String, String> mapaCliente = new HashMap<>();
        mapaCliente.put("nombre", "David");
        mapaCliente.put("direccion", "Salamanca");
        mapaCliente.put("tlf", "+34 65778899");
        System.out.println(mapaCliente);
        // Acceso al valor mediante la clave
        System.out.println(mapaCliente.get("nombre"));
        System.out.println(mapaCliente.get("tlf"));
        // Quitar un elemento por su clave
        mapaCliente.remove("tlf");
        System.out.println(mapaCliente);


    }
}
