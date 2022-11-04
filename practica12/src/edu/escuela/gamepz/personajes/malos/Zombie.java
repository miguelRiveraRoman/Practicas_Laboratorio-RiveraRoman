package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;

public class Zombie extends Personaje implements Muerto{
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
    public String toString(){
        return super.toString() + " " + ataque;
    }
    public void decVida(){
        if (ataque == false) {
            setVida(vida - 3);
        }else{
            setVida(vida - 2);
        }
    }
    public void decVida(int d3){
        if (ataque == false) {
            setVida(vida - 3*d3);
        }else{
            setVida(vida - 2*d3);
        }
    }
    public void addVida(){
        if (ataque == true) {
            setVida(vida + 3);
        }
    }
    public void addVida(int a3){
        if (ataque == true) {
            setVida(vida + 3*a3);
        }
    }

    public void Comer(){
        System.out.println("come cerebros");
    }

}