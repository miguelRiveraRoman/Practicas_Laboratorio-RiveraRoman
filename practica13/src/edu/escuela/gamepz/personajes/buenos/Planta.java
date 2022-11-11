package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;

public class Planta extends Personaje {
    private Escudo escudo;
    public Planta (String nombre, int vida, Escudo escudo){
        super(nombre,vida);
        this.escudo = escudo;
    }
    public Planta (String nombre, Escudo escudo){
        super(nombre,3);
        this.escudo = escudo;
    }
    public Planta (String nombre, int vida){
        super(nombre,vida);
        this.escudo = Escudo.NULO;
    }
    public Planta (String nombre){
        super(nombre,3);
        this.escudo = Escudo.NULO;
    }
    public Escudo getEscudo(){
        return escudo;
    }
    public String toString(){
        return super.toString() + " " + escudo.getNivel();
    }
    public void decVida(){
        setVida(vida-escudo.getNivel());
    }
    public void decVida(int d2){
        setVida(vida-escudo.getNivel()*d2);
    }
    public void addVida(){
        setVida(vida+escudo.getNivel());
    }
    public void addVida(int a2){
        setVida(vida+escudo.getNivel()*a2);
    }

}
