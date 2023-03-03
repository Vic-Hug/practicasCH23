package operadoresJava;

public class Prue {
	public static void main(String[] args) {
		int billete = 0;
		double importe = 140;
		if (importe >= 50) {
			billete = (int) (importe / 50);

			importe %= (billete * 50);
		}
		System.out.println("billete: " + billete);
		System.out.println("importe: " + importe);

		double a = 20.5;
		int b = (int) (a / 1);
		double c = a % 1;
		System.out.println(b);

		System.out.println(c);

		byte nota = 6;
		String tareaEntregada = "s";
		if (nota > 5 && (tareaEntregada.charAt(0) == 'S' || tareaEntregada.charAt(0) == 's')) {
			System.out.println("Aprovado");
		} else {
			System.out.println("No aprovado");
		}
	}

}