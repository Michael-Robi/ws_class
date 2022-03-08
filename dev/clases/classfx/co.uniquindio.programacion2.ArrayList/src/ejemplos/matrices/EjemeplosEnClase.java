package ejemplos.matrices;

import javax.swing.JOptionPane;

public class EjemeplosEnClase {

	public static void main(String[] args) {

		int [][] matriz;
//
		matriz = llenarMatriz();
		imprimirMatriz(matriz);
//		recorrerMatriz_v2();
//		retornarMayor();
	}

	private static int[][] llenarMatriz() {

		int[][] matriz = new int[3][4];
		int valor = 1;
		
		
		for(int i=0; i < matriz.length;i++){//recorrer filas
			
			for(int j=0; j <matriz[i].length;j++){//recorrer columnas
				
				matriz[i][j] = valor;
				valor++;
			}
		}
		return matriz;
	}

	
	private static void imprimirMatriz(int[][] matriz) {
		
		for(int i=0; i < matriz.length;i++){//recorrer filas
			
			for(int j=0; j <matriz[i].length;j++){//recorrer columnas
				
			System.out.println("Valor de la matriz en la posicion ["+i+"]"+"["+j+"] = "+matriz[i][j]);
			}
		}
		
	}
	
	
	
	
	
	

}


//int[][] matriz = new int[3][4];
//
//matriz[0][0] = 1;
//matriz[0][1] = 1;
//matriz[0][2] = 1;
//matriz[0][3] = 1;
//matriz[1][0] = 1;
//matriz[1][1] = 1;
//matriz[1][2] = 1;
//matriz[1][3] = 1;



