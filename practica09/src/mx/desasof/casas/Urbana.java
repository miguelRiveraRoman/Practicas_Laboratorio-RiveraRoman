package mx.desasof.casas;

public class Urbana extends Casa{

	int banos;

	public Urbana(String tipo, int habitaciones, float costo, float piscina, int banos){
		super(tipo,habitaciones,costo);
		this.banos = banos;
	}

	public Urbana(String tipo, int banos){
		super(tipo);
		this.banos = banos;
	}

	public int hashCode(){
		return super.hashCode()+ banos*23;
	}

	public boolean equals(Object ob){
		return super.equals(ob) && ob instanceof Urbana && banos == ((Urbana) ob ).banos;
	}

	public String toString(){
		return super.toString()+ " "+banos;
	}
}	