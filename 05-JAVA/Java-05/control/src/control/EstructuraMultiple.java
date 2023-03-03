package control;

import java.util.Scanner;

public class EstructuraMultiple {

	Scanner dato = new Scanner(System.in);

	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Introduzaca un letra: ");
		char letra = dato.next().charAt(0);
		switch (letra) {
		case 'a':

		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		case 'A':
			System.out.println(" es vocal ");
			break;
		default:
			System.out.println("El caracter no es vocal");
			break;
		}
	}

	public void notas() {
		// TODO Auto-generated method stub
		System.out.print("Introduzca la nota: ");
		int nota = dato.nextInt();
		switch (nota) {
		case 10:
			System.out.println("Excelente");
			break;
		case 9:
			System.out.println("Muy bien");
			break;
		case 8:
			System.out.println("Bueno");
			break;
		case 7:
			System.out.println("Regular");
			break;
		case 6:
			System.out.println("Deficiente");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobado");
			break;
		default:
			System.out.println("Fuera de rango");
			break;
		}

	}

	/*
	 * ?: Operador Elvis o ternario variable = (PL) ? entrada verdad : entrada falso
	 */
	public void ternario() {
		// TODO Auto-generated method stub
		System.out.print("Introduzca un primer valor numerico: ");
		int entradaV = dato.nextInt();
		System.out.println("Introduzaca uu segundo valor numerico: ");
		int entradaF = dato.nextInt();
		int menor =(entradaV <= entradaF) ?  entradaV : entradaF;
		System.out.println("----> " + menor);
				
	}

}
