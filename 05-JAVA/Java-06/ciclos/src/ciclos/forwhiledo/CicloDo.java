package ciclos.forwhiledo;

import java.util.Scanner;

public class CicloDo {
	Scanner dato = new Scanner(System.in);
public void digitosDo() {
	int valor=0;
	int acumulador =0;
	do {
		System.out.println("Introduzca un digito entre (0-9)");
		 valor = dato.nextInt();
		  acumulador = acumulador + valor;
		  System.out.println("--> "+ acumulador);
		
	} while (valor>=0 && valor<=9);
	System.out.println("bye!!");



}
}
