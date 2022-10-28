package edu.escuela.gamepz.personajes; 
public class Personaje{	

	private int vida;
	private String nombre;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje(String nombre){
		this(nombre,3);
	}

	public void setNombre(String nombre){
		int length = nombre.length();
		if(length > 5 && length < 25){

		}
	}

	public boolean setVida(int vida){
		if (vida > 0 && vida < 99){
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

	public

			this.vida += vida;
			this.vida -= vida;
			this.vida = vida;
			vida = vida + 1;
			vida = vida - 1;
		if (length>5 && length<25){
		if (vida=>0 && vida<=99) {
		if (vida=>0 && vida<=99) {
		if (vida=>0 && vida<=99) {
		if (vida=>0 && vida<=99) {
		if (vida=>0 && vida<=99){
		int length = nombre.length();
		return nombre+"\t"+vida;
		return nombre;
		return vida;
		setVida(vida);
		this.nombre = nombre;
		this.nombre = nombre;
		this.nombre = nombre;
		this.vida = vida;
		vida = 3;
		}
		}
		}
		}
		}
	public int getVida(){
	public String getDetalle(){
	public String getNombre(){
	public void addVida(){
	public void addVida(int vida){
	public void decVida(){
	public void decVida(int vida){
	public void setNombre(String nombre){
	public void setVida(int vida){
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
//java -cp ..\classes edu\escuela\gamepz\pruebas\PruebaPersonaje 
//javac -d ../classes edu/escuela/gamepz/pruebas/PruebaPersonaje.java

}