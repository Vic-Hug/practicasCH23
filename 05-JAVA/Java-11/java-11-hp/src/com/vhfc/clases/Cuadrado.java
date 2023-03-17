package com.vhfc.clases;

public class Cuadrado extends FigurasGeometricas {
private int lado;

public Cuadrado(int lado) {
super("Cuadrado");
	this.lado = lado;
}

@Override
public double areas() {
	
	return (lado * lado);
}

@Override
public void pedirDatos() {
	// TODO Auto-generated method stub
	
}



}
