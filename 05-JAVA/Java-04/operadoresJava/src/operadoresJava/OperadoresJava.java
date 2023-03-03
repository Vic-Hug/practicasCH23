package operadoresJava;

public class OperadoresJava {
	public static void main(String[] vic) {
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
			System.out.println("Puede conducir un coche");
		} else {
			System.out.println("No puede conducir un coche");
		}

		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
			System.out.println("El usuario es Juan Pérez");
		} else {
			System.out.println("El usuario no es Juan Pérez");
		}
		
		
	}
}

}
