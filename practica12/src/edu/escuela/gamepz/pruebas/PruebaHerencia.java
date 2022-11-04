package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.buenos.*; 
import edu.escuela.gamepz.utils.*;
public class PruebaHerencia {
    public static void main(String[] args) {
        Personaje per01 = new Planta("David",100);
        Personaje per02 = new Zombie("Bianca");
        Planta plan01 = new Planta("Fabian", 10, Escudo.MEDIO);
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
        Planta plan04 = new Planta("Silvia");
        Zombie zom01 = new Zombie("Armando", 80, false);
        Zombie zom02 = new Zombie("Josseline", true);
        Zombie zom03 = new Zombie("Eduardo");
        
        Personaje personajes[] = {per01,per02,plan01,plan02,plan03,plan04,zom01,zom02,zom03};
        int cont = 0;
        int n = 0;
        for (Personaje p : personajes) {
            cont ++;
            n = (int)(Math.random()*100);
            
            System.out.println(p.toString());

            if (p instanceof Planta) {
                Planta tmp = (Planta) p;
                System.out.println("Soy planta" + " " +tmp.getEscudo());
                tmp.addVida(n);
            }
            if (p instanceof Zombie) {
                Zombie tmp = (Zombie) p;
                System.out.println("Soy Zombie" + " " + tmp.getAtaque()+ " " );
                tmp.Comer();
                tmp.decVida(n);
            }
            System.out.println(n);
            System.out.println(p.toString());
            System.out.println("*****Objeto*****"+ " "+ cont);
        }
    }
}
