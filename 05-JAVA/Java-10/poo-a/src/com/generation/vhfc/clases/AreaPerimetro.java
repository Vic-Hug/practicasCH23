package com.generation.vhfc.clases;

public class AreaPerimetro {

	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}

	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}

	public double areaTriangulo(int base, int altura) {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		// TODO Auto-generated method stub
		return (ladoA + ladoB + ladoC);
	}
}
