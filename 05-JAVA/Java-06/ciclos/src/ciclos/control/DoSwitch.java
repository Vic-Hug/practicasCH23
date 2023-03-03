package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;

public class DoSwitch {
public void controlador() {
	Scanner s= new Scanner(System.in);
	Menus mp = new Menus();
	UsoWhile objetoUW = new UsoWhile();
	UsoFor uf = new UsoFor();
	CicloDo cd = new CicloDo();
	
	int opcion = 0;
	do {
		mp.menuPrincipal();
		System.out.print("Introduzca un op: ");
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			objetoUW.cicloW();
			break;
		case 2:
			objetoUW.centinelaW();
			break;
		case 3:
			objetoUW.banderaW();;
			break;
		case 4:
			uf.cicloFor();			
			break;
		case 5:
			uf.letrasfor();
			break;
		case 6:
			cd.digitosDo();
			break;
		default:
			break;
		}
				
	} while (opcion>0 && opcion<7);
System.out.println("Terminamos bye!!");

}
}
