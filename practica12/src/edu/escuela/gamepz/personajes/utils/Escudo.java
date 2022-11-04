public enum Escudo{

	SUPER(0),
	MEDIO(1), 
	BAJO(2),
	NULO(3);

	private final int nivel;

	public Escudo(int nivel){
		this.nivel = nivel;
	}

	public String getNivel(){
		return nivel;
	}
}