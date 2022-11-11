package edu.escuela.gamepz.personajes; 

public abstract class Personaje{
	private String nombre;
	protected int vida;
	private float size;
	
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

	public  boolean setVida(int vida){
		if (vida>0 && vida<100){
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
		return nombre + " " + vida;
	}

	public float genSize(){
		float size = (float)(Math.random()*10);
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}

	public abstract void decVida();
	public abstract void decVida(int d2);
	public abstract void addVida();
	public abstract void addVida(int a2);



}

