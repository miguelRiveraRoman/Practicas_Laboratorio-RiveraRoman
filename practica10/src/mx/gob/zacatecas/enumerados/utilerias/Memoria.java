public enum Memoria{

	DDR(tipo: "Memoria Ram", velocidad: 166 , pines:30),
	DDR2(tipo: "Laptop", velocidad:140 , pines:35),
	DDR3(tipo: "Laptop Nueva",velocidad:533 , pines:40),
	DDR4(tipo: "Gamer", velocidad:160 , pines:40);



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

	public int getPines(){
		return pines;
	}

}