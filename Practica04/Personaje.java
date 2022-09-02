//10:02-26/08/2022
//Rivera Román Miguel Esaú
//Cláse de la práctica 3 con constructor

public class Personaje{
	private String nombre;  
	private int edad;

	public Personaje (String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;

	}
	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

	public boolean setEdad(int edad){
		if(edad>0 && edad <120){
			edad2 = true;
			this.edad = edad;
		}
		return edad2;
	}
	
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}  

}