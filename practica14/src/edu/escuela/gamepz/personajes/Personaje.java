package edu.escuela.gamepz.personajes; 
import java.text.DecimalFormat;

public abstract class Personaje implements Comparable<Personaje>{
	private String nombre;
	protected int vida;
	private float size;
	
	public Personaje (String nombre, int vida, float size){
	this.nombre = nombre;
	this.vida = vida;
	this.size = size;

	if(size == 00.0f){
		this.size = genSize();
	} else {
		this.size = Math.round(size)/100;
	}

	}

	public Personaje (String nombre){
		this(nombre,3,0.0f);
	}

	public int compareTo(Personaje o){
		if (this.nombre.compareTo(o.nombre) != 0){
			return (this.nombre.compareTo(o.nombre));
		}
		if (this.vida == o.vida) {
			return (this.vida >  o.vida) ? -1 : 1;
			
		}
		if (this.size == o.size) {
			return 0;
		}
		return (o.size < this.size) ? -1 : 1;
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
	public float getSize(){
		return size;
	}

	public String toString(){
		return "nombre = " + nombre + "\t vida = " + vida + "\t size = " + size;
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

