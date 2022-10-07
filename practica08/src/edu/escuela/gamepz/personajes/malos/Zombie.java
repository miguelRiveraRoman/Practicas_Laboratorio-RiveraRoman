public class Zombie extends Personaje{
	public boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque 
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre);
	}
	public Zombie(String nombre){
		super(nombre);
	}

	public String getDetalle(){
		super.getDetalle();		
	}

	public boolean getAtaque(boolean ataque){
		return ataque;
	
	public int decVida(boolean ataque){
		super.decVida(){
			if (ataque = false) {
				this.vida = vida*3
			}		
			else (ataque = true) {
				this.vida = vida*2
			}
		}
	}
	public int decVida(boolean ataque){
		super.decVida(){ 
			if (ataque = false) {
				this.vida = vida*3
			}		
			else (ataque = true) {
				this.vida = vida*2
			}
		}
	}
	public int addVida(boolean ataque){
		super.addVida(){
			if (ataque = true) {
				this.vida = vida*3
			}				
			else (ataque = false){
				this.vida = vida
			}
		}
	}
	public int addVida(boolean ataque){
		super.addVida(){
			if (ataque = true) {
				this.vida = vida*3
			}				
			else (ataque = false){
				this.vida = vida
			}				
		}
	}	

	}
}