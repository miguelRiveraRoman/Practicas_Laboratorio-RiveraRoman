package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.Memoria;
import mx.gob.zacatecas.enumerados.utilerias.Tipo;

public class Computadora{
	private String marca;
	private Tipo tipo;


	public Computadora(String marca, Tipo tipo, Memoria memoria){
	
	this.marca = marca;
	this.tipo = tipo;
	this.memoria = memoria;
	}

	public String toString(){
		return marca + "\n" + tipo.getTipo() + "\n" + velocidad.getVelocidad() + "\n" + pines.getPines() + "\n" + type.getType();
	}


}