//10:02 AM
//02/09/2022
//Miguel Esaú Rivera Román 
package com.patito.poo1pract.pruebas;
import com.patito.poo1pract.personajes.*;

public class pruebaPersonaje{
	public static void main(String[] args){
		Personaje alumno = new Personaje("Kal El");
		alumno.saludar();
		System.out.println("Nombre: " + alumno.getNombre()+ "Edad: "+ alumno.getEdad());
		System.out.println("Modificando el nombre "+alumno.getNombre());
		alumno.setNombre("Michael Jordan");
		alumno.saludar();
		if(!alumno.setEdad(30)){
			System.out.println("Edad sin cambios");
		}
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());
		System.out.println("Modificando edad en 130");
		if(!alumno.setEdad(130)){
			System.out.println("Edad sin cambio");
		}
		System.out.println("Nombre: "+ alumno.getNombre()+ " Edad: "+alumno.getEdad());

	}
}
