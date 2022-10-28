package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.*;

public class Planta extends Personaje {

    private Escudo escudo;

    public Planta (String nombre, int vida, char escudo){
        super(nombre,vida);
        this.escudo = escudo;
    }

    public Planta (String nombre, char escudo){
        super(nombre,3);
        this.escudo = escudo;
    }

    public Planta (String nombre, int vida){
        super(nombre,vida);
        this.escudo = 'A';
    }

    public Planta (String nombre){
        super(nombre,3);
        this.escudo = 'A';
    }

    public char getEscudo(){
        return escudo;
    }
    public String toString(){

        return super.toString() + "\n" + escudo;
    }
    public void decVida(){
        if (escudo == 'A') {

            super.decVida(1*2);

        }else{

            super.decVida();
        }
    }
    public void decVida(int di2){
        if (escudo == 'A') {

            super.decVida(di2 * 2);

        }else{
            super.decVida(di2);
        }
    }

    public void addVida(){

        if (escudo == 'A') {

            super.addVida(1 *2);

        }else{

            super.addVida();
        }
    }

    public void addVida(int ac2){

        if (escudo == 'A') {

            super.addVida(ac2*2);

        }else{

            super.addVida(ac2);
        }
    }
}
