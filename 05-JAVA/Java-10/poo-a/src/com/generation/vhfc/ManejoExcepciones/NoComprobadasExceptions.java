package com.generation.vhfc.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	System.out.print("Introduzca un valor: ");
	int divisor;
	
	
	try {
		divisor = Integer.parseInt(dato.next());
		int division = 10 / divisor;
		System.out.println("---> "+ division);

	}catch (ArithmeticException e ) {
		System.out.println("capturando la exception " + e.getMessage());
	}catch(NumberFormatException nfe) {
		System.out.println("el dato es un caracter " + nfe.getMessage());
	}finally {
		System.out.println("Este blok es opcional y se va a ejecutar con o sin la exception");
	}
	
	System.out.println("continuamos con el flujo de la aplicacion ");
	
	
}
}