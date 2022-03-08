package ejemplos.cadenas;

public class Cadenas {

	public static void main(String[] args) {

//		ejemploCrearCadenaArreglo();

		ejemploSubString();

	}

	private static void ejemploCrearCadenaArreglo() {
		   char[] arreglo = { 'h', 'o', 'l', 'a' };

		   System.out.println(arreglo);


//		   String cadena  = new String( arreglo, 1, 2 );
		   String cadena  = new String( arreglo, 1, arreglo.length-1);
		   System.out.println(cadena);

	}

	private static void ejemploSubString() {

		String cadena = "Mi nombre es oscar y soy profesor";
		System.out.println("Antes: "+cadena);

		cadena = cadena.substring(13, 18);
		System.out.println("Despues: "+cadena);

	}


	/**
	 * Recibe la letra
	 * @param letra Es la letra a verificar
	 * @return Un boolean, true si es vocal, false en caso contrario
	 */
	public static boolean isVocal(char letra)
	{
		boolean centinela=false;

		if(letra>='a'&& letra<='z')
		{   //se pasa a mayuscula
//			letra=(char) (letra-32);
//			Character.toUpperCase(letra);
			letra = Character.toUpperCase(letra);
		}

		if(letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U')
		{
			centinela=true;
		}

		return centinela;
	}
}
