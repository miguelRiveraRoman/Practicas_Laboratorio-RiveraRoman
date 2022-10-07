package edu.escuela.gamepz.personajes; 

public class Personaje{
	private String nombre;
	private int vida;
	public void setNombre(String nombre){
		int length = nombre.length();
		if (length>5 && length<25){
		this.nombre = nombre;
		setvida(vida);
	}

	}
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		setVida(vida);
	}
	public boolean setVida(int vida){
		if (vida>0 && vida<99){
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
	public String getDetalle(){
		return nombre+"\t"+vida;
	}
}

//javac -d ../classes edu/escuela/gamepz/pruebas/PruebaPersonaje.java
//java -cp ..\classes edu\escuela\gamepz\pruebas\PruebaPersonaje 