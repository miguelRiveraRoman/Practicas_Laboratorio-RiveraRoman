public class Dispositivo {

	private String marca;
	private float costo;

	public Dispositivo(String marca float costo){
		this.marca = marca;
		this.costo = costo;
	}

	public String toString(){
		return marca + "\t"+ costo;
	}
}