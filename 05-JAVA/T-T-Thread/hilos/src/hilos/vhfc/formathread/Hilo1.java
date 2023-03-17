package hilos.vhfc.formathread;

public class Hilo1 extends Thread {

	public Hilo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("se inicia el Thread o Hilo " + this.getName());
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Termina el Hilo o Thread " + this.getName());
	}
}
