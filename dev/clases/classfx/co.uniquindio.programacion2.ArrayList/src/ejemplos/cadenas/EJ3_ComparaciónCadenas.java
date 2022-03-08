package ejemplos.cadenas;

public class EJ3_Comparaci�nCadenas {

	public static void main(String[] args) {

		ejemplo1();
		ejemplo2();
	}

	/**
	 * Para comparar cadenas se pueden usar los m�todos equals y equalsIgnoreCase().
	 * El primer m�todo compara cadenas teniendo en cuenta si son may�sculas o min�sculas.
	 * El segundo, ignora �ste aspecto.
	 * boolean equals           ( Object cadena );
	 * boolean equalsIgnoreCase ( Object cadena );
	 */
	private static void ejemplo1() {
		String salida="";
		String cadena = "Hola";

		if(!cadena.equals("Hola A todos"))
		{
			salida=("Son diferentes");
		}
		System.out.println(salida);
	}

	/**
	 * El m�todo compareTo() permite comparar cadenas para
	 * determinar cu�l de ellas es menor alfab�ticamente.
	 * int compareTo( String cadena );
	 */
	private static void ejemplo2() {

		String salida="";
		String cadena = "Ana";
		int valorComparacion = 0;

		valorComparacion = cadena.compareTo("Hola");

		if(valorComparacion>0)
		{
		 salida=(cadena +" es alfabeticamente mayor"+"(Valor:"+valorComparacion+")");
		}
		else{
		 salida=("(Valor:"+valorComparacion+")");
		}
		System.out.println(salida);

	}

}
