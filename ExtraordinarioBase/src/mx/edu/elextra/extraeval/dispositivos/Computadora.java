package mx.edu.elextra.extraeval.Dispositivos;
import mx.edu.elextra.extraeval.dispositivo;

public class Computadora extends Dispositivo{
	private int ram;
	public Computadora(String marca, float costo, int ram){
		this.ram = ram;
		super(marca,costo);
	}

	public int getRam(){
		return ram;
	}

	public String toString(){
		return super.toString() + "\t" + ram;
	}
}