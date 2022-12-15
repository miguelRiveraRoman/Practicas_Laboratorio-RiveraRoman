package mx.edu.elextra.extraeval.Dispositivos;

public class Celular extends Dispositivo{

	private float procesador;

	public Celular(String marca, float costo, float procesador){
		this.procesador = procesador;
		super(marca,costo);
	}

	public float getFloat(){
		return procesador;
	}
	
	public String toString(){
		return super.toString() + "\t" + procesador;
	}
}