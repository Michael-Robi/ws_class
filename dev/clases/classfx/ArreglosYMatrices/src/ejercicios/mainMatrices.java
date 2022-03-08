package ejercicios;

import javax.swing.JOptionPane;

public class mainMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]numeros = null;
		
		numeros = llenarArreglo();
		
		imprimirArreglo();
	}

	private static int[][] llenarArreglo() {
		
		int [][]numeros = new int[3][4];
		int valor = 0;
		
		for (int i = 0; i <numeros.length; i++) {
			for (int j = 0; j <numeros[i].length; j++) {
				
//					valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
					numeros[i][j] = valor;
					valor++;
				}
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
