package mx.edu.elextra.extraeval.acciones;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;
import java.util.Comparator;

public class PorMarca implements Comparator<Dispositivo>{
	public int compare(Dispositivo d1, Dispositivo d2){
		if(d1.getMarca().compareTo(d2.getMarca()) !=0){
			return d1.getMarca().compareTo(d2.getMarca());
		}
		if (d1.getCosto() != d2.getCosto()){
			return (d1.getCosto()>d2.getCosto())? -1 : 1;
		}
	}
}