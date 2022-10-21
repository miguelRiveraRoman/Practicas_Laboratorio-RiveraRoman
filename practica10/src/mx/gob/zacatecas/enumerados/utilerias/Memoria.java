package mx.gob.zacatecas.enumerados.utilerias;

public enum Memoria{

	DDR("Memoria Ram", 166 ,30),
	DDR2("Laptop",140 , 35),
	DDR3("Laptop Nueva",533 ,40),
	DDR4("Gamer", 160 , 40);

	private final String tipo;
	private final float velocidad;
	private final int pines;

	private Memoria(String tipo, float velocidad, int pines){
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
