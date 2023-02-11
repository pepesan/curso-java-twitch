package com.cursosdedesarrollo.sesion04.ejemplo07Completo;

public class PersonaApp {
    public static void main(String[] args) {
        Persona persona = new Persona("David", "+34", "Salamanca", 44);
        System.out.println(persona);
        Persona persona2 = new Persona("David", "+34", "Salamanca", 44);
        if (persona.equals(persona2)){
            System.out.println("Los dos objetos tienen el mismo valor");
        }
    }
}
