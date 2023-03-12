package com.cursosdedesarrollo.sesion13.hilos;

import java.util.LinkedList;
import java.util.List;

public class MiHiloApp {
    public static void main(String[] args) {
        Integer numHilos = 4;
        List<MiHilo>  listadoHilos = new LinkedList<>();
        for (int i = 0; i<numHilos; i++){
            MiHilo miHilo = new MiHilo("hilo"+i);
            listadoHilos.add(miHilo);
        }
        for (int i = 0; i<numHilos; i++){
            listadoHilos.get(i).start();
        }
    }
}
