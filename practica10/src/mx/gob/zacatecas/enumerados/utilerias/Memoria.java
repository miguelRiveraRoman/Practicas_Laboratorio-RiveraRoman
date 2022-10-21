public enum Memoria{

	DDR(type: "Servidor"),
	DDR2(type: "Estacion de trabajo"),
	DDR3(type: "Escritorio"),
	DDR4(type: "Portatil");



	private final String tipo;
	private final float velocidad;
	private final int pines;


	public Memoria(String tipo, float velocidad, int pines){
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.pines = pines;
	}

	public String getTipo(){
	return tipo;
	}

	public float getVelocidad(){
		return velocidad;
	}

	public int pines(){
		return pines;
	}
}