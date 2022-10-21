package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.Memoria;
import mx.gob.zacatecas.enumerados.utilerias.Tipo;

public class Smallfactor extends Computadora{
	private boolean nvram;

	public Smallfactor(String marca, Tipo tipo, Memoria memoria, boolean nvram){
		super(marca,tipo,memoria);
		this.nvram = nvram;
	}


	public String toString(){
		return marca + "\n" + tipo + "\n" + velocidad + "\n" + pines + "\n" + type;
	}

}