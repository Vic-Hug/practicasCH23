package com.vhfc.hilos;

public class Hilo1 extends Thread{
	
	public Hilo1(String name) {
		super(name);		
	}

	@Override
public void run() {
	System.out.println("Se inicia el thread o hilo " + getName());
	
	for (int i = 0; i < 10; i++) {
		System.out.println(this.getName());
		/*try {
			System.out.println(this.getName());
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("Capturando la exception ");
			e.printStackTrace();
		}*/
	}
	
	System.out.println("Termina o finaliza el hilo o thread " + getName());
}
}