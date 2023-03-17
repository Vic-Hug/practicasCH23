package oop.clases;

public class Fecha extends Object{
private int dia;
private int mes;
private int anio;


public Fecha() {

}



public String diaMesAnio() {
    return "La fecha es:  dia " + this.dia +
    		"mes " + this.mes + "año " + this.anio;
}




@Override
public String toString() {
	return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
}



public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getAnio() {
	return anio;
}
public void setAnio(int anio) {
	this.anio = anio;
}





}
