package com.vhfc.clases;

public class PersonaP {
	private String nombre;
	private int edad;
	
	public PersonaP(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}
	
	


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "PersonaP [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
