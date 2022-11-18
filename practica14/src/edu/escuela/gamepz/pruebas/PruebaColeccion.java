package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.buenos.*; 
import edu.escuela.gamepz.utils.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaColeccion{
	public static void main(String[] args) {
		private String path ("user.home"); 
		Scanner fname = new scanner(System.in); 

		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),		
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida()),

		};

		TreeSet<Personaje> arbol = new TreeSet <Personaje>();
		LinkedList<Personaje> lista = new LinkedList<Personaje>();

		for(Personaje p : arbol){
			arbol.add(p);

		}
		lista.addAll(arbol);

		System.out.println("---Orden Natural---");
		for(Personaje p : arbol){
			System.out.println(p);
		}
		System.out.println("---Orden vida---");
		Collections.sort(lista,new ByVida());
		for(Personaje p:lista){
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<Personaje>();
		arr.addAll(lista);
		System.out.println("---Orden Tamanio---");
		Collections.sort(arr, new BySize());
		for (Personaje p:arr){
			System.out.println(p);
		}
	}
}