package com.vhfc.testers;

import com.vhfc.clases.*;


public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(10,2);
		FigurasGeometricas circulo = new Circulo(2);
		
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());

	}

}
