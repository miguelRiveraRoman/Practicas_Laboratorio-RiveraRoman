package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.buenos.*; 
import edu.escuela.gamepz.utils.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class PruebaColeccion{
	public static void main(String[] args) {
		

		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),		
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida()),

		};

		TreeSet<Personaje> ts = new TreeSet <>();
		
	}
}