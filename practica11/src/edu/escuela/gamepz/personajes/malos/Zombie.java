package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.*;

public class Zombie extends Personaje{

    private boolean ataque;

    public Zombie (String nombre, int vida, boolean ataque){
        super(nombre,vida);
        this.ataque = ataque;
    }

    public Zombie (String nombre, boolean ataque){
        super(nombre,3);
        this.ataque = ataque;
    }
    public Zombie (String nombre){
        super(nombre,3);
        this.ataque = false;
    }  
    public boolean getAtaque(){
        return ataque;
    }
    public String getDetalle(){
        return super.getDetalle() + "\n" + ataque;
    }
    public void decVida(){
        if (ataque == false) {
            super.decVida(1*3);
        }else{
            super.decVida();
        }
    }
    public void decVida(int di3){
        if (ataque == false) {
            super.decVida(di3*3);
        }else{
            super.decVida(di3);
        }
    }
    public void addVida(){
        if (ataque == true) {
            super.addVida(1*3);
        }
    }
    public void addVida(int ac3){
        if (ataque == true) {
            super.addVida(ac3*3);
        }
    }

}