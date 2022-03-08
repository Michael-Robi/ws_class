package ejemplos.arraylist;

import java.util.ArrayList;

public class MainArrayHerencia {

	public static void main(String[] args) {
		
		
		ejemplo1();

	}

	private static void ejemplo1() {
		// TODO Auto-generated method stub
		
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		Figura figura = new Figura();
		figura.setX(10);
		figura.setY(20);
		
		
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setLargo(20);
		rectangulo.setAncho(50);
		rectangulo.setX(12);
		rectangulo.setY(23);
		
		
		listaFiguras.add(figura);
		listaFiguras.add(rectangulo);
		
		
	}

}
