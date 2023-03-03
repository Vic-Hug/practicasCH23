package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	
	public void controlIf() {
		// TODO Auto-generated method stub
		/*
		if (condition) {
			
		}
		*/
		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("continua el control de flujo...");
		

		/*
		if (condition) {
			
		} else {

		}*/		
		if (nota >= 5) {
			System.out.println("Nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada " + nota);
		}			
	}
	public void divisible() {
		// TODO Auto-generated method stub
		System.out.print("Introduzca un primer numero: ");
		int dato1 = entrada.nextInt();
		System.out.print("Introduzca un segundo numero :");
		int dato2 = entrada.nextInt();
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 +" es divisible entre "+ dato2);
		}else {
			System.out.println(dato1 + " no es divisible entre "+ dato2);
		}
		
	}
	
	public void compara() {
		System.out.print("Introduzca un primer numero: ");
		int valor1 = entrada.nextInt();
		System.out.print("Introduzca un segundo numero :");
		int valor2 = entrada.nextInt();
		if (valor1 > valor2) {
			System.out.println(valor1 +" es mayor a "+ valor2);
		}else {
			System.out.println(valor1 + " es menor a "+ valor2);
		}
		
	}
	public void anidado() {
		// TODO Auto-generated method stub
/*
		if (condition) {
			
		} else 
			if (condition) {
			
		}else {
			
		}*/
		System.out.print("Introduzca un primer numero: ");
		int mayor1 = entrada.nextInt();
		if (mayor1 > 0) {
			System.out.println("numero positivo " + mayor1);
		}else if (mayor1 < 0) {
			System.out.println("numero negativo "+ mayor1);
		}
		else {
			System.out.println("*** numero igual a cero ***");
		}
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
