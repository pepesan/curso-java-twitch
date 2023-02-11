package com.cursosdedesarrollo.sesion04.ejemplo03;

public class PersonaApp {
    public static void main(String[] args) {
        // Declaro e inializo un objeto de la clase persona
        Persona persona = new Persona();
        System.out.println(persona);
        // Cambiar el valor de un atributo del objeto
        persona.nombre = "David";
        // Acceder al valor de un atributo del objeto
        System.out.println(persona.nombre);

        // Otro ejemplo de objeto de la clase Persona
        Persona otraPersona = new Persona();
        otraPersona.nombre = "Chari";
        System.out.println(otraPersona.nombre);

        // Accediendo a atributos de un objeto
        otraPersona.tlf = "+34 6566778899";
        System.out.println(otraPersona.tlf);
        otraPersona.direccion = "C/ Mayor, Salamanca";
        System.out.println(otraPersona.direccion);
        otraPersona.edad = 27;
        System.out.println(otraPersona.edad);
    }
}
