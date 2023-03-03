package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in);

	public void cicloW() {
		System.out.println("Ciclo while");
		int iterador = 0;
		while (iterador < 10) {

			System.out.println("Iterador " + iterador);
			iterador = iterador + 1;
		}

	}

	/* while uso centinela */
	public void centinelaW() {
		System.out.println("Ciclo while Centinela+");
		final int centinela = -1;
		System.out.print("Introduzca una nota: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: " + nota);
			System.out.print("Introduzca una nota: ");
			nota = entrada.nextInt();
		}
		System.out.println("Fin");
	}

	public void banderaW() {
		System.out.println("Ciclo while bandera");
		boolean valorb = false;
		while (!valorb) {
			System.out.print("Introduzca en valor numerico: ");
			int valorx = entrada.nextInt();
			if (valorx >= 0 && valorx <= 5) {
				int potaxio = (int) Math.pow(valorx, 2);
				System.out.println("el resultado --> " + potaxio);

			} else {
				valorb = true;
				System.out.println("!!!Adios");

			}

		}

	}

}
