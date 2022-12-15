package mx.edu.elextra.extraeval.dispositivos;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;

public class Celular extends Dispositivo{

	private float procesador;

	public Celular(String marca, float costo, float procesador){
		super(marca,costo);
		this.procesador = procesador;

	}

	public float getFloat(){
		return procesador;
	}
	
	public String toString(){
		return super.toString() + "\t" + procesador;
	}
}