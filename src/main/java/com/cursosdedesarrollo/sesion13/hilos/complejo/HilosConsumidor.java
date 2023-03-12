package com.cursosdedesarrollo.sesion13.hilos.complejo;



public class HilosConsumidor extends Thread { 
	private HilosContenedor contenedor; 

	public HilosConsumidor (HilosContenedor c) { 
		contenedor= c; 
	} 

	public void run() { 
		Integer value = 0; 
		for (int i = 0; i < 10; i++) { 
			value = (Integer) contenedor.get(); 
			System.out.println("Consumidor. get: " + value); 
		}
	}
}


