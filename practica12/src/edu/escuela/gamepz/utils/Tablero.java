package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;

public class Tablero{

	public static final int MAX_SIZE = 10;
	public static final Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(int MAX_SIZE){}

	public static void mostrarT(){
		System.out.println("\nInicio ***Contenido del areeglo en Tablero");
		
		for (int c=0; c<MAX_SIZE; c += 1 ) {

		if (personajes[c] == null) {
			System.out.println(personajes + "---");

		}		
		
	}

	} 

}