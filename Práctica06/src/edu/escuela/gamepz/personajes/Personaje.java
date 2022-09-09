//10:02-26/08/2022
//Rivera Román Miguel Esaú
//Cláse de la práctica 5 con constructor
package com.patito.poo1pract.personajes;


public class Personaje{
	private String nombre;  
	private int edad;
	private boolean edad2;

	public Personaje (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;


	}

	public void setNombre(String nombre){
		int l = this.nombre.lenght();

		if (l < 5 || l > 25) {
			System.out.println("Incumple con el número de cáracteres solicitados");
			
		}

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
	 
	public int getDetalle(){
		return nombre + "\t" + edad;
	}


	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}  

}