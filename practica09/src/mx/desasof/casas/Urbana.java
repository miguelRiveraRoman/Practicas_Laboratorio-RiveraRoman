public class Urbana extends Casa{

	int banos;

	public Urbana(String tipo, int habitaciones, float costo, float piscina, int banos){
		super(tipo,habitaciones,costo,piscina);
		this.banos = banos;
	}

	public Urbana(String tipo, int banos){

	}

	public int hashCode(){
		return(int)*banos*23 super.hashCode()
	}

	public boolean equals(Object ob){
		return super.equals(ob) && ob instanceof Urbana && banos == ((Urbana) ob ).banos;
	}

	public String toString(){

	}
}	