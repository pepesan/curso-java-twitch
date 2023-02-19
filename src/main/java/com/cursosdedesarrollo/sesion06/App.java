package com.cursosdedesarrollo.sesion06;

public class App {
    public static void main(String[] args) {
        System.out.printf("Sesion06");
        Persona persona = new Persona();
        System.out.println(persona);
        Empleado empleado = new Empleado();
        System.out.println(empleado);

        empleado.setNombre("David");
        System.out.println(empleado.getNombre());

        empleado = new Empleado("David", 35000.0);
        System.out.println(empleado);
        empleado.setSueldo(75000.0);
        System.out.println(empleado.getSueldo());
    }
}
