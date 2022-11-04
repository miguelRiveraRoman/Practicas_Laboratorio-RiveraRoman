package edu.escuela.gamepz.personajes; 

public abstract  class Personaje{
	private String nombre;
	protected int vida;
		public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje(String nombre){
		this(nombre,3);
	}
	public void setNombre(String nombre){
		int length = nombre.length();
		if (length>5 && length<25){
		this.nombre = nombre;
	}
	}
	public boolean setVida(int vida){
		if (vida=>0 && vida<=99){
			this.vida = vida;
			return true;
		}else{
			return false;
		} 
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String toString(){
		return nombre + "\n" + vida;
	}
	public abstract  void decVida(){
		if (vida - 1 => 0 && vida -1 <=99) {
			vida --;
		}else{
			vida = 3;
		}
	}
	public abstract void decVida(int di){
		if (vida - di => 0 && vida - di <=99) {
			vida -=di;
		}else{
			vida = 3;
		}
	}
	public abstract void addVida(){
		if (vida <=99 && vida => 0) {
			vida ++;
		}
	}
	public abstract void addVida(int ac){
		if (vida <= 99 && vida => 0) {
			vida +=ac;
		}
	}
}
s