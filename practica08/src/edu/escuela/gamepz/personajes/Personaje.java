package edu.escuela.gamepz.personajes; 

public class Personaje{
	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}

	public Personaje(int vida){
		this.vida = 3;
	}


	public void setNombre(String nombre){
		int length = nombre.length();
		if (length>5 && length<25){
		this.nombre = nombre;
		setVida(vida);
	}

	}

	public void setVida(int vida){
		if (vida>0 && vida<99){
			this.vida = vida;
			
		}
	
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String getDetalle(){
		return nombre+"\t"+vida;
	}


	public void decVida(){
		vida = vida - 1;
	}
	public void decVida(int vida){
		this.vida -= vida;
	}
	public void addVida(){
		vida = vida + 1;
	}
	public void addVida(int vida){
		this.vida += vida;
	}
}

//javac -d ../classes edu/escuela/gamepz/pruebas/PruebaPersonaje.java
//java -cp ..\classes edu\escuela\gamepz\pruebas\PruebaPersonaje 