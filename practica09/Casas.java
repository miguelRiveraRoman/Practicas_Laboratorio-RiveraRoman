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

	public int hashCode(){
		return(int)*tipo*habitaciones*costo nombre.hashCode()
	}

	public boolean equals(Object o){
		if (o != null && o instanceof Casa) {
			Casa p = (Casa) o;

			if (nombre.equals(p.tipo) && (habitaciones == p.habitaciones) ) {
		  		return true;
		  }  
		}
		return false;
	}
}