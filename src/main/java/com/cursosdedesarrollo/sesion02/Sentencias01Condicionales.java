package com.cursosdedesarrollo.sesion02;

public class Sentencias01Condicionales {
    public static void main(String[] args) {

        // Comparaciones con números
        int i = 0;
        int j = 0;
        // Comparación de igualdad
        if (i == j){
            System.out.println("Las dos variables son iguales");
        }
        i = 0;
        j = 1;
        // comparación de desigualdad
        if (i != j){
            System.out.println("Las dos variables son diferentes");
        }

        // comparación de menor que
        i = 0;
        j = 1;
        if (i<j){
            System.out.println("El valor de i es menor que el valor de j");
        }
        // Comparación de mayor que
        i = 0;
        j = 1;
        if (j>i){
            System.out.println("El valor de j es mayor que el valor de i");
        }
        // Comparación de mayor o igual
        i = 0;
        j = 0;
        if (j>=i){
            System.out.println("El valor de j es mayor o igual que el valor de i");
        }
        // Comparación de menor o igual
        i = 1;
        j = 0;
        if (j<=i){
            System.out.println("El valor de j es menor o igual que el valor de i");
        }

        // Comparaciones con objetos
        // Cadenas
        String cadena1 = "";
        String cadena2 = "";
        if (cadena1.equals(cadena2)){
            System.out.println("Las dos cadenas son iguales en su valor");
        }
        // Comparamos las referencias a los objetos
        cadena1 = cadena2;
        if (cadena1 == cadena2){
            System.out.println("Las dos referencias son iguales");
        }else{
            System.out.println("Las dos referencias son diferentes");
        }

        // Uso sencillo de else
        // Se ejecuta el caso del else
        i = 0;
        j = 1;
        if (i==j){
            System.out.println("El valor de i es igual al de j");
        }else {
            System.out.println("El valor de i NO es igual al de j");
        }
        // Se ejecuta el caso del if
        i = 0;
        j = 0;
        if (i==j){
            System.out.println("El valor de i es igual al de j");
        }else {
            System.out.println("El valor de i NO es igual al de j");
        }

        boolean primer = true;
        boolean segundo = true;
        // Operacion AND
        // el resultado será true sólo si las dos variables comparadas son true
        if (primer && segundo){
            System.out.println("Salida primer && segundo: true");
        }else{
            System.out.println("Salida primer && segundo: false");
        }
        // ejemplo con Strings
        String contrasegna = "valores";
        String nombreUsusario = "pepesan";
        System.out.println(contrasegna.length());
        // Operación AND entre cadenas
        if (contrasegna.length() >15 && nombreUsusario.length()>=4){
            System.out.println("La contraseña tiene más de 15 caracteres y el nombre de usuario tiene 4 o más");
        }else {
            System.out.println("No se cumplen los criterio de la contraseña y el nombre de usuario");
        }
        // Operación OR
        // Si una de las condiciones es true el resultado final es true
        contrasegna = "valores";
        nombreUsusario = "pepesan";
        System.out.println(contrasegna.length());
        // Operación OR entre cadenas
        if (contrasegna.length() >15 ||  nombreUsusario.length()>=4){
            // Como se cumple una de las dos condiciones el resultado final es true
            System.out.println("La contraseña tiene más de 15 caracteres o el nombre de usuario tiene 4 o más");
        }else {
            System.out.println("No se cumplen los criterio de la contraseña y el nombre de usuario");
        }
        // Operación de tipo NOT
        nombreUsusario = "pepesan";
        if (nombreUsusario.isBlank()){
            System.out.println("El nombre de usuario está en blanco");
        }else{
            System.out.println("El nombre de usuario NO está en blanco");
        }
        // validar que NO está en blanco
        nombreUsusario = "pepesan";
        if(!nombreUsusario.isBlank()){
            System.out.println("El nombre de usuario NO está en blanco");
        }

        // Sentencias de Tipo Switch con numéros enteros (int)
        i = 2;
        // Primera definición switch
        switch (i){
            case 1:
                System.out.println("La variable i tiene el valor 1");
                break;
            case 2:
                System.out.println("La variable i tiene el valor 2");
                break;
        }
        // Comparación en base a la edad de una persona
        int edad = 21;
        switch (edad){
            case 18:
                System.out.println("En España ya puedes votar en las elecciones");
                break;
            case 21:
                System.out.println("En USA ya puedes votar en las elecciones");
                break;
        }

        // Uso del Default
        edad = 20;
        switch (edad){
            case 18:
                System.out.println("En España ya puedes votar en las elecciones");
                break;
            case 21:
                System.out.println("En USA ya puedes votar en las elecciones");
                break;
            default:
                System.out.println("Tu edad es: " + edad);
        }
         // A partir de Java 7 lo podemos usar con Cadenas
        nombreUsusario = "admin";
        switch (nombreUsusario){
            case "pepesan":
                System.out.println("Es Pepesan");
                break;
            case "admin":
                System.out.println("El usuario es el administrador");
                break;
            default:
                System.out.println("No es pepesan");
        }

        // A partir de Java 12 podemos hacer comprobaciones más complejas
        nombreUsusario = "askjdhaksjhd";
        switch (nombreUsusario){
            case "pepesan", "natalia":
                System.out.println("Es un usuario normal");
                break;
            case "admin":
                System.out.println("El usuario es el administrador");
                break;
            default:
                System.out.println("No es pepesan, ni natalia, ni admin");
        }

        // Otra manera diferente de hacer un switch en Java 12
        nombreUsusario = "pepesan";
        switch (nombreUsusario){
            case "pepesan","natalia" -> {
                System.out.println("Es un usuario normal");
                System.out.println("El usuario es:  " + nombreUsusario);
            }
            case "admin" -> {System.out.println("El usuario es el administrador");}
            default-> {System.out.println("No es pepesan, ni natalia, ni admin");}
        }
    }
}
