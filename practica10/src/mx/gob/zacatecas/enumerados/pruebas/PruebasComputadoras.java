public class PruebasComputadoras{
	public static void main(String[] args) {
		Computadora dell = new Computadora("dell",166, 30);  
		Cmputadora hp = new Computadora("hp",140, 35);
		Computadora msi = new Computadora("msi",533, 40); 
		Computadora asus = new Computadora("aus",160, 40);


		Computadora[] p =(dell,hp,msi,asus);

		for(Computadora tmp:p){
			System.out.println(tmp);
		} 

	}
}