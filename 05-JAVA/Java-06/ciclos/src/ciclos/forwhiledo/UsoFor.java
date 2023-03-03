package ciclos.forwhiledo;

public class UsoFor {
	public void cicloFor() {
		System.out.println("Uso de Ciclo For");
		for (int i = 0; i <= 10; i++) {
			System.out.println("el iterador --> "+ i);
		}

	}
	
	public void letrasfor() {
	/*for (int i = 'A'; i <= 'Z'; i++) {
		System.out.print("soy --> "+ i+ ", ");
		char letra = (char) i;
		System.out.println();
		System.out.print("soy --->" + letra +",");
		}
		*/
		
		 /*for (int i = 'A'; i <= 'Z'; i++) {
		        System.out.println("soy --> " + Character.toString((char)i) + ", ");
		    }
*/
		System.out.println("For con letras");
		for (int i = 'A'; i <= 'Z'; i++) {
	        System.out.println("soy --> " + (char)i + ", ");
	    }


	}

}
