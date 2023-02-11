package com.cursosdedesarrollo.sesion04.ejemplo04;

public class PersonaApp {
    public static void main(String[] args) {
        // Declaro e inializo un objeto de la clase persona
        Persona persona = new Persona("David", "+34 656", "c/ Mayor, Salamanca", 44);
        System.out.println(persona.nombre);
        System.out.println(persona.tlf);
        System.out.println(persona.direccion);
        System.out.println(persona.edad);
    }
}
