//10:02 AM
//02/09/2022
//Miguel Esaú Rivera Román 

public class pruebaPersonaje{
	public static void main(String[] args){
		Personaje alumno = new Personaje();
		alumno.setNombre("Miguelillo Rivera");
		alumno.saludar();
		System.out.println("Modificando el nombre " + alumno.getNombre());
		alumno.setNombre("Danny Phantom");
		alumno.saludar();

	}
}
