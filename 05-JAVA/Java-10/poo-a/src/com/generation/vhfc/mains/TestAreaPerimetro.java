package com.generation.vhfc.mains;

import com.generation.vhfc.clases.AreaPerimetro;
import com.generation.vhfc.clases.FigurasGeometricas;

public class TestAreaPerimetro {
public static void main(String[] args) {
	AreaPerimetro ap= new AreaPerimetro();
	FigurasGeometricas fg = new FigurasGeometricas();
	
	fg.setArea(ap.areaCuadrado(5));
	System.out.println("Area Cuadrado--->"+fg.getArea());
	
	fg.setPerimetro(ap.perimetroCuadrado(5));
	System.out.println("Perimetro del cuadrado-->" + fg.getPerimetro());
	
	
}
}
