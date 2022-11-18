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
import java.io.File;

public class PruebaColeccion{
	public static void main(String[] args) {
		String path = System.getProperty("user.home"); 
		Scanner s = new scanner(System.in); 
		File f = new File(path);
		String su = fname + path;

		while (!path.equals("exit")){
			System.out.print("Escribe Algo: ");
			fname = s.nextLine();
			fname = fname.trim();
			cadenas.add(fname);
		
		if (f.exists()){
			System.out.println("El archivo o directorio si existe");
			if( f.isDirectory()){
			System.out.println("Es directorio");
			String nuevo = path+System.getProperty("file.separator")+"nuevo";
			} else {
			System.out.println("Es archivo");
			}
		}


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
}