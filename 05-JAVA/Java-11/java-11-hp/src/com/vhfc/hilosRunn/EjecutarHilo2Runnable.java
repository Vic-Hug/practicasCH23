package com.vhfc.hilosRunn;

public class EjecutarHilo2Runnable {
public static void main(String[] args) {
	Hilo2 t = new Hilo2("Victor");
	Thread st = new Thread(t);
	st.start();
	
	new Thread(new Hilo2("Hugo")).start();
	new Thread(new Hilo2("Mireya")).start();
}
}
