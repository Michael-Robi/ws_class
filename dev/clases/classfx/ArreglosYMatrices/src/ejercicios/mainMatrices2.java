package ejercicios;

public class mainMatrices2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]numeros = null;
		
		numeros = llenarArreglo();
		
		imprimirArreglo();
	}

	private static int[][] llenarArreglo() {
		
		int [][]numeros = new int[3][3];
		int valor = 0;
		int valorFila = 1;
		int fila = 0;
		
		for (int i = 0; i <numeros.length; i++) {
			for (int j = 0; j <numeros[i].length; j++) {
				
				if(i==j) {
					numeros[i][j] = valor;
					valor++;
				}
			}
		}
		
		for (int i = 0; i <numeros.length; i++) {
			for (int j = 0; j <numeros[i].length; j++) {
				if (numeros[i][j] == 0) {
					if(i == fila) {
						numeros[fila][j] = valor;
						valor++;
					}
				}
			}
			fila++;
		}
		
		return numeros;
	}
	
	private static void imprimirArreglo() {
		int [][]numeros = llenarArreglo();
		
		for (int i = 0; i <numeros.length; i++) {
			for (int j = 0; j <numeros[i].length; j++) {
				System.out.print(" "+numeros[i][j]);
			}
			System.out.println();
		}
		
	}

}
