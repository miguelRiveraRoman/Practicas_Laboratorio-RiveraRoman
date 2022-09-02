//10:02-26/08/2022
//Rivera Román Miguel Esaú
//Cláse de la práctica 3 con constructor

public class Personaje{
	private String nombre;  
	private String edad;

	public Personaje (String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;

	}

	public int getEdad(){
		return edad 
	}

	public boolean setEdad(int e){
		if (e > 0 && e < 120)
			edad = false
	}

	public String getNombre(){
		return nombre;
	}

	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}  

}