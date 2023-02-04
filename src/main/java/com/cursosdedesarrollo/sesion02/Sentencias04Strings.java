package com.cursosdedesarrollo.sesion02;

public class Sentencias04Strings {
    public static void main(String[] args) {
        // Declarar e inicializar un objeto de tipo String
        String usuario = "Pepesan";

        // otra maneraq diferente de inicializar una String
        usuario = new String("Pepesan");

        System.out.println("longitud de la cadena: "+ usuario.length());
        // Recorrer una String con un bucle for
        System.out.println("Recorrer con for");
        for (int i = 0; i<usuario.length();i++){
            System.out.println(usuario.charAt(i));
        }

        // Operaciones interesantes
        System.out.println("toUpperCase");
        System.out.println(usuario.toUpperCase());
        System.out.println("toLowerCase");
        System.out.println(usuario.toLowerCase());
        System.out.println("charAt");
        System.out.println(usuario.charAt(0));
    }
}
