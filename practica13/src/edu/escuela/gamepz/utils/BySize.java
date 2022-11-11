package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
import java.util.Comparator;

public class BySize implements Comparator<Personaje>{
	public int compare (Personaje p1, Personaje p2){
		if (p1.getSize() != p2.getSIze()){
			return (p2.getVida() < p1.getVida()) ? -1 : 1;
		}
		if (p1.getNombre() != p2.getNombre() ){ 	
			return (p1.getNombre().compareTo(p2.getNombre()));
		
		 }
		return (p2.getVida() > p1.getVida()) ? -1 : 1;
	}
}