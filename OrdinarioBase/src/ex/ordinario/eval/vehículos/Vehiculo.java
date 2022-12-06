public class Vehiculo {
	private String marca;
	private int modelo;
	private float costo;

	public Vehiculo(String marca, int modelo, float costo){
		this.marca = marca;
		this.modelos = modelo;
		this.costo = costo;
	}

	public String getMarca(){
		return marca;
	}
	public int getModelos(){
		return modelo;
	}
	public float getCosto(){
		return costo;
	}


	public String toString(){
		return marca +"\t"+modelo+"\t "+costo"\t";
	}
.

}