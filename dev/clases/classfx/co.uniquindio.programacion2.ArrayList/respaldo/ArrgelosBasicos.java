package ejemplos.arreglos;

import javax.swing.JOptionPane;

public class ArrgelosBasicos {


	/**
	 * cantidad de ceros en un arreglo
	 * numero menor de un arreglo
	 * numero de apariciones en un arreglo
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 * @param args
	 */


	public static void main(String[] args) {


//		imprimirTamanioArreglo();

//		int[] arregloEnteros = new int[5];
//		llenarArreglo(arregloEnteros);
//		mostrarArray(arregloEnteros);
//		System.out.println("Valor encontrado en la posición: "+buscarEnArreglo(arregloEnteros, 2));


//		int[] arregloEnteros = {10,3,1,8,2};
//		System.out.println("Suma= "+sumaNumerosPares(arregloEnteros));


		System.out.println(retornarVocales("Murcielado"));


	}


	public static void llenarArreglo(int arreglo[]){

		for(int i=0;i<arreglo.length;i++){
			String texto=JOptionPane.showInputDialog("Introduce un número");
			arreglo[i]=Integer.parseInt(texto);
		}
	}

	public static void mostrarArray(int arreglo[]){
		for(int i=0;i<arreglo.length;i++){
			System.out.println("En el indice "+i+" esta el valor "+arreglo[i]);
		}
	}

	private static int buscarEnArreglo(int[] arreglo, int valor) {

		boolean centinela = false;
		int pos = 0;


		for (int i = 0; i < arreglo.length && centinela != true; i++) {

			if(arreglo[i] == valor){
				centinela = true;
				pos = i;
			}
		}

		return pos;
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

	private static String retornarVocales(String cadena) {

		String vocales = "";

		char[] arregloCaracteres = cadena.toCharArray();
		for(int i=0;i<arregloCaracteres.length;i++){

			if(isVocal(arregloCaracteres[i])){
//				System.out.print(arregloCaracteres[i]);
//				vocales += arregloCaracteres[i];
				vocales += arregloCaracteres[i]+"-";
//				if(i != arregloCaracteres.length-1){
//					vocales += "-";
//				}
			}
		}

		vocales = vocales.substring(0,vocales.length()-1);
		return vocales;

	}

	private static void imprimirTamanioArreglo() {
//		int primes[]={2,3,5,7,11,13,17};
		int primes[]= new int[100];
		System.out.println("Array length: " + primes.length);

	}



	private static int sumaNumerosPares(int[] arreglo) {
		int acumuladoPares = 0;

		for (int i = 0; i < arreglo.length; i++) {

			if(arreglo[i] % 2 ==0){
				System.out.println("es par"+ arreglo[i]);
				acumuladoPares+= arreglo[i];
			}

		}
		return acumuladoPares;
	}

}
