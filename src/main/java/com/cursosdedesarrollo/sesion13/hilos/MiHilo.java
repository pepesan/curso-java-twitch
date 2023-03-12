package com.cursosdedesarrollo.sesion13.hilos;

public class MiHilo extends Thread{

    private String nombre;

    MiHilo(String nombre){
        this.nombre = nombre;
    }

    public void run(){
        for (int i = 0; i<10 ; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.nombre+": "+ i);
        }
    }
}
