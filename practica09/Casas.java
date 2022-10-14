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

	public int hasCode(){
		return nombre.hasCode()
	}

	public boolean equals(Object o){
		if (o != null && o instanceof Perrito ) {
			Perrito p = (Perrito) o;

			if (nombre.equals(p.nombre) && (edad == p.edad) ) {
		  		return true;
		  }  
		}
		return false;
	}
}