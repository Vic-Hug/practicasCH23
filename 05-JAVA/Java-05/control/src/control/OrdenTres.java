package control;

import java.util.Scanner;

public class OrdenTres {
Scanner dato = new Scanner(System.in);

public void ordenar() {
	// TODO Auto-generated method stub
	System.out.print("Introduzaca numero1: ");
	int x = dato.nextInt();
	System.out.print("Introduzaca numero2: ");
	int y = dato.nextInt();
	System.out.print("Introduzaca numero3: ");
	int z = dato.nextInt();
	if (x>y)  
		if (x>z) 
			System.out.println(x);
		else  
			System.out.println(z);
		else if (y >z) System.out.println(y);
		else System.out.println(z);
		
	
			
		
}
}
