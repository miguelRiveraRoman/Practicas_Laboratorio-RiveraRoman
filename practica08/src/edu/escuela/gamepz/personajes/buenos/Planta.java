public class Planta extends Personaje{
	public char escudo;


	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida); 
		this.escudo = escudo; 
	}
	public Planta(String nombre, char escudo){
		super(nombre, 3);
		this.escudo = escudo;
	}
	public Planta(String nombre, int vida){
		super(nombre,vida);
	}
	public Planta(String nombre){
		super(nombre);
	}

	public String getDetalle(){
		super.getDetalle();
	}

	public char getEscudo(){
		return escudo;
	}

	public int decVida(char escudo){
		super.decVida(){
			if (escudo == "A") {
				vida = vida*2
			}
		}
	}
	public int decVida(char escudo){
		super.decVida(){ 
			if (escudo = "A") {
				this.vida = vida*2
			}		
		}
	}
	public int addVida(char escudo){
		super.addVida(){
			if (escudo = "A") {
				this.vida = vida*2
			}				
		}
	}
	public int addVida(char escudo){
		super.addVida(){
			if (escudo = "A") {
				this.vida = vida*2
			}				
		}
	}
}