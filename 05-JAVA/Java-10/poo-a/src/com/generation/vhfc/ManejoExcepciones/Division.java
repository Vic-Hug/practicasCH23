package com.generation.vhfc.ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;

	public Division(int numerador, int denominador) throws OpExceptions {
		
		if (denominador == 0) {
			throw new OpExceptions("el denominador es un cero");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarD() {
		// TODO Auto-generated method stub
		System.out.println("el reultado de la division es: " + (this.numerador / this.denominador));

	}

}
