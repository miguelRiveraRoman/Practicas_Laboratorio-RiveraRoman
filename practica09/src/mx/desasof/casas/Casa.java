package mx.desasof.casas;

public class Casa{
	private String tipo;
	private int habitaciones;
	private float costo;

	public Casa(String tipo, int habitaciones, float costo){
		this.tipo = tipo;
		this.habitaciones = habitaciones;
		this.costo = costo;
	}

	public Casa(String tipo){
		habitaciones = 2;
		costo = 2000000;
	}

	public int hashCode(Object o){
		Casa p = (Casa) o;	
		return ((int)tipo.hashCode() + tipo*habitaciones*costo);
	}

	public boolean equals(Object o){
		if (o != null && o instanceof Casa) {
			Casa p = (Casa) o;

			if (tipo.equals(p.tipo) && (costo == p.costo) ) {
		  		return true;
		  }  
		}
		return false;
	}
}