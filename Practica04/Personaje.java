//10:02-26/08/2022
//Rivera Román Miguel Esaú

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

	public String getNombre(){
		return nombre;
	}

	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}  

}