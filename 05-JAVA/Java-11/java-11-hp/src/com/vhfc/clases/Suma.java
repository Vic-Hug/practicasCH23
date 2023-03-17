package com.vhfc.clases;

public class Suma implements OperacioneAritmeticas, Mensajes{
private double a;
private double b;



	public Suma() {
	}

	public Suma(double a, double b) {
	this.a = a;
	this.b = b;
}

	@Override
	public double sumar() {
		
		return this.a+this.b;
	}

	
	
	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		System.out.println("Hola soy una suma. ");
		
	}

}
