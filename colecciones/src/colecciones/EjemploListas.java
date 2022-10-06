package colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {

	public static void ejemplo1() {
		// Crear listas
		List<String> nombres = new ArrayList<String>();
		
		// anadir elementos
		nombres.add("Benjamin");
		nombres.add("Fran");
		nombres.add("Lucas");
		nombres.add("Paloma");
		
		// recorre una lista
		nombres.forEach(e->System.out.println(e));
		
			
	}
	public static void main(String[] args) {
		ejemplo1();

	}

}
