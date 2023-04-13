package com.vhfc.hilosRunn;

public class Hilo2 implements Runnable{
	
	private String nombre;
	


	public Hilo2(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el Hilo "+ this.getNombre());
		for (int j = 0; j < 10; j++) {			
			System.out.println(j + " - " + nombre);
			try {
				Thread.sleep( (long) (Math.random()*1000));
				//Thread.sleep( 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}