package com.vhfc.clases;

public class Triangulo extends FigurasGeometricas{
private double base;
private double altura;



public Triangulo(double base, double altura) {
	super("Triangulo");
	this.base = base;
	this.altura = altura;
}
@Override
public double areas() {
	
	return (base*altura)/2;
}
@Override
public void pedirDatos() {
	// TODO Auto-generated method stub
	
}

}
