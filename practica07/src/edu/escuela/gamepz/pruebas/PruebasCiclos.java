package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;

public class PruebasCiclos{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Diego", 0);
		Personaje per01 = new Personaje("Almendra", 0);
		Personaje per01 = new Personaje("Bianca", 0);
		Personaje per01 = new Personaje("Jordan", 0);
	 int n,m;
		n = 0
		m = 0
	}
	{
		while (n>=m); {
			int n = (int)(Math.random()*100);
			int m = (int)(Math.random()*100)			
		}

		System.out.println(n,m);
		
		outfor:
		for (int i = n; i<m ; i++ ) {
			int ed= (int)(Math.random()*250);
			if(!per01.setEdad(ed)) {
				System.out.println(per01.getDetalle() + " sin modificación en edad a "+ ed);
			}
			System.out.println(per01.getDetalle() + "se modificó la edad");

			do{
				ed =(int)(Math.random()*200);
				System.out.println(ed);


				if( ed > 150) {
					System.out.println("El número generado es mayor a 150");
					continue outfor;
				}
				while(per04.setEdad(ed));
				System.out.println(per04.getDetalle());
			}
		}
	}
}