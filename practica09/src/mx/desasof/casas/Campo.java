package mx.desasof.casas;

public class Campo extends Casa{

	private float[] piscina = new float[2];

	public Campo(String tipo, int habitaciones, float costo, float piscina){
		super(tipo, habitaciones, costo);
		piscina[0] = ancho;
		piscina[1] = largo;

	}

	public Campo(String tipo, float ancho, float largo){
		this(tipo, 2,2000000,ancho,largo);
	}

	public int hashCode(){
		return super.hashCode()+ (int)piscina[0]*(int)piscina[1]/5;
	}	

	public boolean equals(Object ob){
		return super.equals(ob) && ob instanceof Campo && piscina == ((Campo) ob ).piscina;
	}

	public String toString(){
		return "Tipo: " +tipo+"\n"+ " Habitaciones: "+ habitaciones+"\n"+"Costo: "+costo;
	}
}