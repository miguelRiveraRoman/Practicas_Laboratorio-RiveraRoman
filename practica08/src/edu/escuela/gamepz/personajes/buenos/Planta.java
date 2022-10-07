public class Planta extends Personaje{
	public char escudo;


	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo = escudo; 
	}
	public Planta(String nombre, char escudo){
		super(nombre);
		
	}
	public Planta(String nombre, int vida){
		super(nombre,vida);
	}
	public Planta(String nombre){
		super(nombre);
	}


	public char getEscudo(){
		return escudo;
	}
}