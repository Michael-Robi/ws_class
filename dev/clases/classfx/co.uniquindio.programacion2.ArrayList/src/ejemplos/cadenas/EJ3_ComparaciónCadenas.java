package ejemplos.cadenas;

public class EJ3_ComparaciónCadenas {

	public static void main(String[] args) {

		ejemplo1();
		ejemplo2();
	}

	/**
	 * Para comparar cadenas se pueden usar los métodos equals y equalsIgnoreCase().
	 * El primer método compara cadenas teniendo en cuenta si son mayúsculas o minúsculas.
	 * El segundo, ignora éste aspecto.
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
	 * El método compareTo() permite comparar cadenas para
	 * determinar cuál de ellas es menor alfabéticamente.
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
