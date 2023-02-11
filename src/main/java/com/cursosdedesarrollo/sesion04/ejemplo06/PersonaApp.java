package com.cursosdedesarrollo.sesion04.ejemplo06;

public class PersonaApp {
    public static void main(String[] args) {
        // Declaro e inializo un objeto de la clase persona
        Persona persona = new Persona("David", "+34 656", "c/ Mayor, Salamanca", 44);
        System.out.println(persona);
        Persona chari = new Persona("Chari", "+34 676", "Salamanca", 51);
        System.out.println(chari);

        chari.setEdad(44);
        System.out.println(chari.getEdad());
    }
}
