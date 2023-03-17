package com.vhfc.hilos;

public class EjecutarHilo1 {

	public static void main(String[] args) {
		Thread h =new Hilo1("Victor");
		System.out.println(h.getState());
		/*
		System.out.println(h.getState());
		 * es el estado cundo se crea la instancia 
		 * sin asignar el recurso 
		 *  se muestra NEW
		 */
		
		/*h.start(); ESTO INVOCA Y LLAMA A RUN
		 * arancando el hilo y lo mostarmos con getState()
		 * System.out.println(h.getState());
		 * nos muestra un RUNNABLE
		 */
		
		/*GENERAR UN TERMINATED 
		 * generado por una espera en el tiempo y se logra con
		 * un Thread.sleep(100); esto del hilo principal
		 * y esta pausa nos genera 	TERMINATED PERO DE LA PAUSA 
		 * probar con intervalos pequeños
		 * 
		 */
		
		/*Mas insdtancias esto es en paralelo
		 * 
		 * 
		Thread h0 =new Hilo1("Maria");
		h0.start();
		geramos una pausa en hilo1
		
		Thread h1 =new Hilo1("Clara");
		h1.start();*/
	}

}
