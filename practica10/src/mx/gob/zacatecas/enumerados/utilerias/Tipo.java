public enum Tipo{

	SERVER(type: "Servidor") 
	WORKSTATION(type: "Estacion de trabajo") 
	DESKTOP(type: "Escritorio")
	LAPTOP(type: "Portatil")

	private final String type:

	private Tipo(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}


	}
