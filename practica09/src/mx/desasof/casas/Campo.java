package mx.desasof.casas;

public class Campo extends Casa{

	private float piscina[] = new float[1];

	public Campo(String tipo, int habitaciones, float costo, float piscina){
		super(tipo, habitaciones, costo);
		ancho = 0;
		largo = 0;

	}

	public Campo(String tipo){

	}

	public int hasCode(){
		return ((int)super.hasCode()*ancho*largo/5);
	}	

	public boolean equals(Object ob){
		return super.equals(ob) && ob instanceof Campo && piscina == ((Campo) ob ).piscina;
	}

	public String toString(){
		return "Tipo: " +tipo+"\n"+ " Habitaciones: "+ habitaciones+"\n"+"Costo: "+costo;
	}
}