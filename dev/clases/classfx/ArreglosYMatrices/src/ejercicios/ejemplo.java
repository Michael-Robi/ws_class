package ejercicios;

public class ejemplo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		
		llenarArreglo(numeros);
		
//		int cp = consultarPares(numeros);
//		System.out.println("Cantidad de numeros pares: "+cp);
//		
		int sn = sumaNumeros(numeros);
		System.out.println("La suma de los numeros es: "+sn);
//		
//		String n = "12";
//		String cn = consultarNumero(numeros,n);
//		System.out.println("El numero: "+n+" -> "+cn);
//		
//		int numero = 4;
//		String cm4 = consultarMayores(numeros,numero);
//		System.out.println("Los numeros mayores a "+numero+" son: "+cm4);
		
		double promedio = promedioNumeros(numeros);
		System.out.println("El promedio es: "+promedio);
		
		double des = desviacionEstandar(numeros,promedio);
		System.out.println("Desviación estanda "+des);
	}

	private static String consultarMayores(int array[], int numero) {
		// TODO Auto-generated method stub
		String lista = "";
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>numero) {
				lista += array[i]+", ";
			}
		}
		
		return lista;
	}

	private static String consultarNumero(int array[], String buscarNumero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			if (buscarNumero.equals(""+array[i])) {
				return "Registrado";
			}
		}
		
		return "No Registrado";
	}

	public static void llenarArreglo(int array[]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
	}
	
	public static int consultarPares(int array[]) {
		// TODO Auto-generated method stub
		int cantidadPares = 0;
		
		for (int i = 0; i <array.length; i++) {
			
			if(array[i]%2 == 0) {
				cantidadPares += 1;
			}
		}
		
		return cantidadPares;
	}
	
	private static int sumaNumeros(int array[]) {
		// TODO Auto-generated method stub
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		
		return suma;
	}
	
	private static double promedioNumeros(int[] array) {
		double suma = 0;
		double promedio = 0;
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		
		promedio = suma/array.length;
		
		return promedio;
	}
	
	private static double desviacionEstandar(int[] numeros, double promedio) {
		
		promedio = promedioNumeros(numeros);
		double sumaIndices = 0;
		double desviacion = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			sumaIndices += Math.pow(numeros[i] - promedio,2);
		}
		
		desviacion = sumaIndices/numeros.length;
		
		desviacion = Math.sqrt(desviacion);
		
		return desviacion;
	}
}
