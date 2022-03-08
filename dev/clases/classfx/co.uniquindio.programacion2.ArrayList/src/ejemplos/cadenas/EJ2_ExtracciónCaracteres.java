package ejemplos.cadenas;

import java.util.Arrays;

public class EJ2_ExtracciónCaracteres {

	public static void main(String[] args) {

		ejemplo1();
		ejemplo2();
		ejemplo3();

	}

	/**
	 *  charAt(): permite extraer un solo carácter de la cadena.
	 */
	private static void ejemplo1() {

		String cadena ="Hola a todos";

		char letra=hallarLetraConMayorAscci(cadena);
		System.out.println("La letra con mayor ASCCI es  "+letra);

	}

	public static char hallarLetraConMayorAscci(String cadena)
	{
		char mayor=cadena.charAt(0);
		char caracter;
		for(int i=1; i<cadena.length(); i++)
		{   caracter=cadena.charAt(i);
		if(caracter>mayor)
		{
			mayor=caracter;
		}
		}
		return mayor;
	}

	/**
	 *  getChars(): Permite extraer más de un carácter. Su sintáxis es la siguiente:
	 *  char getChars( int posicioninicial, int posicionfinal, char[] destino, int destinoinicio );
	 */
	private static void ejemplo2() {

		String cadena ="Hola a todos";
		char arreglo2[]=new char [3];
		cadena.getChars(0, 3, arreglo2, 0);
		System.out.println("Ejemplo de getChar " +Arrays.toString(arreglo2));
	}

	/**
	 * toCharArray(): devuelve  una array de caracteres a partir de un String.
	 * char [] toCharArray();
	 */
	private static void ejemplo3() {

		String cadena ="Hola a todos";
		char arreglo[]=cadena.toCharArray();
		System.out.println(Arrays.toString(arreglo));
	}


}
