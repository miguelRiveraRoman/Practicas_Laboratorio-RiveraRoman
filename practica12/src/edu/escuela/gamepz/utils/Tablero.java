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
				System.out.println(personajes[c] + "---");

				}		
			else{
				System.out.println(personajes[c]);
				}	
			}
		System.out.println("Fin *** Contenido del arreglo en Tablero \n");
	} 

	public static void instertarT(Personaje p, int pos)
		throws PersException{
			if (pos < 0 || pos > MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);
			}else{
				personajes[pos] = p;
			}
		}

	public static void borrarT(int pos)
		throws PersException{
			if (pos < 0 || pos > MAX_SIZE) {
				throw new PersException("Indice fuera de rango",pos);
			}
			if (personajes[pos] == null) {
				throw new PersException("Si personaje para borrar",pos);
			}

			personajes[pos] = null;
	}

}