package mx.gob.zacatecas.enumerados.equipos;


public class Computadora{
	private String marca;
	private Tipo tipo;


	public Computadora(String marca, Tipo tipo, Memoria memoria){
	
	this.marca = marca;
	this.tipo = tipo;
	this.memoria = memoria;
	}

	public String toString(){
		return marca + "\n" + tipo + "\n" + velocidad + "\n" + pines + "\n" + type;
	}


}