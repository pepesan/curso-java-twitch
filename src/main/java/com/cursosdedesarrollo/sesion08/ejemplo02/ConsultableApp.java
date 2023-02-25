package com.cursosdedesarrollo.sesion08.ejemplo02;

public class ConsultableApp {
    public static void main(String[] args) {
        // Seleccionar la clase que quieres usar como implementación del interfaz
        String clase = "Memoria";
        // Declaración del Objeto en base a su interfaz
        Consultable consultable;
        // Inicializar un objeto del tipo del interfaz usando de base la función constructora de la clase
        // que implementa el interfaz
        switch (clase){
            case "BBDD" -> {
                // Inicializando un acceso a BBDD
                consultable = new ConsultableBBDD();
            }
            default-> {
                // Inicializando un acceso a Memoria
                consultable = new ConsultableMemoria();
            }
        }
        // Uso de los métodos comunes del interfaz independiente de la clase elegida para su inicialización
        System.out.println(consultable.findAll().toString());
        Usuario usuario = new Usuario(0,"pepesan", "1234");
        System.out.println(consultable.save(usuario));
        System.out.println(consultable.findByID(0));

        usuario.setUsername("pepesan2");
        usuario.setPassword("123456");
        System.out.println(consultable.update(0, usuario));
        System.out.println(consultable.findByID(0));

        System.out.println(consultable.delete(0));

    }
}
