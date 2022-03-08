package ejemplos.arreglos;

import javax.lang.model.element.VariableElement;
import javax.swing.JOptionPane;

public class ArrgelosBasicos {


	/**
	 * cantidad de ceros en un arreglo
	 * numero menor de un arreglo
	 * numero de apariciones en un arreglo	
	 *
	 *
	 * @param args
	 */


	public static void main(String[] args) {
		
//		String[] arreglo = new String[10];
//		
//		String palabraMayorVocales = "";
//		
//		
//		arreglo[0] = "hola ";
//		arreglo[1] = "a ";
//		arreglo[2] = "todos ";
//		arreglo[3] = "como ";
//		arreglo[4] = "se ";
//		arreglo[5] = "encuentran ";
//		arreglo[6] = "hoy.";
//		arreglo[7] = "Como quedo el partido";
//		arreglo[8] = "Gano";
//		arreglo[9] = "Perdio";
//		
//		
//		palabraMayorVocales = obtenerPalabraMayorVocales(arreglo);
//	
//		System.out.println("Palabra mayor: "+palabraMayorVocales);
//		mostrarArreglo(arreglo);
//		armarCadena(arreglo);
		
//		Object[] arregloObjetos = new Object[5];
//		
//		arregloObjetos[0] = new Persona("Juan");
//		arregloObjetos[1] = "Hola";
//		arregloObjetos[2] = new Persona("Pedro");
//		arregloObjetos[3] = 34;
//		arregloObjetos[4] = new Persona("Ana");
//		
//		imprimirArregloObjetos(arregloObjetos);
		
		String[] arregloCadena = null;
		String cadena = "holamundo";
		String cadena2 = "Holamundo";
		
		arregloCadena = obtenerArregloDadoCadena(cadena);
		
		arregloCadena = burbujaCadenasAscendente(arregloCadena);
		
//		if(cadena.compareTo(cadena2) > 0){
//			System.out.println("es mayor");
//		}else{
//			System.out.println();
//		}
		
		
		
	}
	
	
	
	

	private static String[] obtenerArregloDadoCadena(String cadena) {
		
		String[] arregloCadena = null;
		
		arregloCadena = cadena.split("");
		
		return arregloCadena;
		
	}

	private static String[] burbujaCadenasAscendente(String[] arreglo) {

		String elementoActual = "";
		String elementoSiguiente = "";

	    for (int i = 0; i < arreglo.length; i++) {

	        // Aquí "y" se detiene antes de llegar
	        // a length - 1 porque dentro del for, accedemos
	        // al siguiente elemento con el índice actual + 1

	        for (int j = 0; j < arreglo.length - 1; j++) {

	        	elementoActual = arreglo[j];
	        	elementoSiguiente = arreglo[j + 1];

	            if (elementoActual.compareTo(elementoSiguiente) > 0) {
	                // Intercambiar
	                arreglo[j] = elementoSiguiente;
	                arreglo[j + 1] = elementoActual;
	            }
	        }
	    }
	    return arreglo;
	}



	private static String obtenerPalabraMayorVocales(String[] arreglo) {
		
		String palabraMayorVocales = "";
		int mayor = 0;
		int contadorVocales =0;
		
		for (int i = 0; i < arreglo.length; i++) {
			
			contadorVocales = contarVocales(arreglo[i]);
			
			if(contadorVocales > mayor){
				mayor = contadorVocales;
				palabraMayorVocales = arreglo[i];
			}
		}
		
		return palabraMayorVocales + " y tiene:"+mayor+" vocales";
	}





	private static int contarVocales(String palabra) {
		
		int vocales = 0;
		char letra;
		
		
		for (int i = 0; i < palabra.length(); i++) {
			
			letra = palabra.charAt(i);
			
			if(isVocal(letra)){
				vocales++;
			}
		}
		
		return (vocales);
	}





	private static void imprimirArregloObjetos(Object[] arregloObjetos) {
		
		Persona persona1 = null;
		String valorArreglo = "";
		
		
		for (int i = 0; i < arregloObjetos.length; i++) {
			
			if(arregloObjetos[i] instanceof Persona){
				persona1 = (Persona)arregloObjetos[i];
				System.out.println(persona1.toString());
			}
			
			if(arregloObjetos[i] instanceof String){
				valorArreglo = (String) arregloObjetos[i];
			}
			
			if(arregloObjetos[i] instanceof Integer){
				
			}
			
			
		}
		
	}





	public static void mostrarArreglo(String [] arreglo){
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Valor del arreglo en la posición "+i+": "+arreglo[i]);
		}
		
	}
	
	public static void armarCadena(String [] arreglo){
		
		String cadena = "";
		
		for (int i = 0; i < arreglo.length; i++) {
			
			cadena = cadena + arreglo[i];
		}
		
		System.out.println(cadena);
		
	}
	
	
	public static void llenarArreglo(int arreglo[]){
		

	}



	private static int buscarEnArreglo(int[] arreglo, int valor) {

		boolean centinela = false;
		int pos = 0;


		return pos;
	}
	
	
	private static int sumaNumerosPares(int[] arreglo) {
		int acumuladoPares = 0;

		return acumuladoPares;
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

	private static void imprimirTamanioArreglo() {
//		int primes[]={2,3,5,7,11,13,17};
		int primes[]= new int[100];
		System.out.println("Array length: " + primes.length);

	}





}
