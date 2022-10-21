public enum Memoria{

	DDR(type: "Servidor")
	DDR2(type: "Estacion de trabajo")
	DDR3(type: "Escritorio")
	DDR4(type: "Portatil")

	private final String tipo;
	private final float velocidad;
	private final int pines;


	}