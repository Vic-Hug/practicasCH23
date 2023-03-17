package hilos.vhfc.pruebas;

import hilos.vhfc.formarunnable.Hilo2;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hilo2 ht = new Hilo2("Pedro");
		Thread st= new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Canicula")).start();
		new Thread(new Hilo2("Mariano")).start();

	}

}

