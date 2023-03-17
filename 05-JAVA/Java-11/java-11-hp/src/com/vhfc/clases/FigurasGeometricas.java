package com.vhfc.clases;

public abstract class FigurasGeometricas {
	private String nombre;

	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	public abstract double areas();
	public abstract void pedirDatos();

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	}


	
	
	
}
