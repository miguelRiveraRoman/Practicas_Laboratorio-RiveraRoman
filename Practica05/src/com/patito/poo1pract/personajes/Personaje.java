//10:02-26/08/2022
//Rivera Román Miguel Esaú
//Cláse de la práctica 5 con constructor
package com.patito.poo1pract.personajes;


public class Personaje{
	private String nombre;  
	private int edad;
	private boolean edad2;

	public Personaje (String nombre){
		this.nombre = nombre;
		this.edad = 0;

	}

	public void setNombre(String nombre){
		this.nombre = nombre;

	}
	public String getNombre(){
		return nombre;
	}

	public boolean setEdad(int edad){
		if(edad>0 && edad <120){
			edad2 = true;
			this.edad = edad;
			return edad2;
		}
		return edad2;
	}

	public int getEdad(){
		return edad;
	}
	
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}  

}