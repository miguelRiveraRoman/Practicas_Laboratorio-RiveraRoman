package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.buenos.*; 
import edu.escuela.gamepz.utils.*;


public class PruebaTablero{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta ("David",100),
			new Zombie ("Bianca"),
			new Planta ("Fabian",10,Escudo.MEDIO),
			new Planta ("Almendra",50),
			new Planta ("Ricardo",Escudo.BAJO),
			new Planta ("Silvia"),
			new Zombie ("Armando",80,false),
			new Zombie ("Josseline",true),
			new Zombie ("Eduardo")
		};
		for (Personaje p: datos) {
			
			int pos = (int )(Math.random()*20-5);
			try{
				Tablero.instertarT(p,pos);
			} catch(Exception e){
				System.err.println(e.getMessage()+" "+ pos);
			}
		}
		Tablero.mostrarT();

		for (int i = 0; i < Tablero.MAX_SIZE ; i += 1 ) {
			int pos = (int)(Math.random()*20-5);
			try{
				Tablero.borrarT(pos);
			} catch(Exception e){
				System.err.println(e.getMessage()+" "+pos);
			}
		}
		Tablero.mostrarT();
	}
}