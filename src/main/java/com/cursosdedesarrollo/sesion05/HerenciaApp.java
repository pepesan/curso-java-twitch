package com.cursosdedesarrollo.sesion05;

public class HerenciaApp {
    public static void main(String[] args) {
        Madre madre = new Madre();
        System.out.println(madre);
        madre.setNombre("Montse");
        System.out.println(madre.getNombre());
        System.out.println(madre);
        Hija hija = new Hija();
        System.out.println(hija);
        // usar los setter y getter
        hija.setNombre("Teresa");
        System.out.println(hija.getNombre());
        System.out.println(hija);
        // usar los setter y getter propios de Hija
        hija.setTlf("+34");
        System.out.println(hija.getTlf());
        System.out.println(hija);

        // Usar las funciones constructoras de Hija
        hija = new Hija("Montse", "+34");
        System.out.println(hija);
    }
}
