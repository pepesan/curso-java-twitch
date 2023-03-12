package com.cursosdedesarrollo.sesion13.hilos.complejo;


public class HilosProductorConsumidorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HilosContenedor c = new HilosContenedor ();
	    HilosProductor produce = new HilosProductor (c);
	    HilosConsumidor consume = new HilosConsumidor (c);
	    produce.start();
	    consume.start();
	}

}

