package ejemplos.matrices;

import java.util.Arrays;



public class EjerciciosMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		multiplicacionMatriz();

//		diagonalYpotencias();
		cerosConsecutivos();
	}
	/**
	 * Programa para calcular la multiplicación de dos matrices.
	 */
	public static void multiplicacionMatriz() {
		int [][]multi1=new int[4][4];
		int [][]multi2=new int[4][4];
		int [][]result=new int[4][4];
		int k=0;

		for (int i = 0; i < multi2.length; i++) {
			for (int j = 0; j < multi2.length; j++) {
				multi1[i][j]=k;
				multi2[i][j]=k;
				k++;
			}
		}
		for (int i = 0; i < multi2.length; i++) {
			for (int j = 0; j < multi2.length; j++) {
				result[i][j]=(multi1[i][j]*multi2[j][i]);
			}
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j]+"  ");
				}
			System.out.println();
			}
		}
	/**
	 * 8. Determina si una matriz es o no simétrica.
	 */
	public static void matrizSimetrica() {
		int [][]simetria= {{0,2,5},{2,7,9},{5,9,6}};
		int cont=0;

		for (int i = 0; i < simetria.length; i++) {
			for (int j = 0; j < simetria[0].length; j++) {

				if(simetria.length==simetria[0].length) {

					if(simetria[i][j]==simetria[j][i]) {
						//simetriaM=true;
						cont++;
					}
				}
			}
		}

			if(cont==(simetria.length*simetria[0].length)) {
				System.out.println("La matriz es simétrica");
			}
			else {
				System.out.println("La matriz no es simétrica");
			}

	}

	/**
	 * 10.Matriz donde todos los elementos de la diagonal son1 y
	 * por encima potencias de 2.
	 */
	public static void diagonalYpotencias() {
		int [][] elementos= new int[4][4];
		int k=0;

		for (int i = 0; i < elementos.length; i++) {
			elementos[i][i]=1;
			for (int j = (i+1); j < elementos.length; j++) {
				elementos[i][j]=(int)Math.pow(2, k);
				k++;
			}//

		}

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos.length; j++) {
				System.out.print(elementos[i][j]+"  ");
			}
			System.out.println();
		}

	}
	/**
	 * 11. Determina si en una matriz existen por lo menos dos ceros consecutivos
	 * en una misma fila, o en la misma columna.
	 */
	public static void cerosConsecutivos() {

		int [][]numconsecutivo= {{0,1,2,3},{0,6,7,8},{0,0,0,13},{15,16,0,0}};
		String result="";
		for (int i = 0; i < numconsecutivo.length; i++) {
			for (int j = 0; j < (numconsecutivo.length-1); j++) {
				if(numconsecutivo[i][j]==0&&numconsecutivo[i][(j+1)]==0) {

					result+="Hay dos ceros consecutivos en la posición: fila "+i+" columnas: "+j
							+" y "+(j+1)+"\n";
				}
				if(numconsecutivo[j][i]==0&&numconsecutivo[(j+1)][i]==0) {

					result+="Hay dos ceros consecutivos en la posición: columna "+i+" filas: "+j
							+" y "+(j+1)+"\n";
				}
			}
		}
		System.out.println(result);
	}

	/**
	 * Matriz char.
	 */
	public static void matrizCaracteres() {

		char [][]caracter=new char [7][5];

		for (int i = 0; i < caracter.length; i++) {
			for (int j = 0; j < caracter[0].length; j++) {
				if(i==0||i==(caracter.length-1)||(caracter[0].length/2)==j) {
					caracter[i][j]='*';
				}
				if(i==1&&j!=0&&j!=(caracter[0].length-1)){
					caracter[i][j]='*';
				}
				if(i==(caracter.length-2)&&j!=0&&j!=(caracter[0].length-1)){
					caracter[i][j]='*';
				}
			}
		}


		for (int i = 0; i < caracter.length; i++) {
			for (int j = 0; j < caracter[0].length; j++) {
				System.out.print(caracter[i][j]+"  ");
			}
			System.out.println();
		}
	}


	/**
	 * Impresión matriz números.
	 */
	public static void numerosMatriz() {
		int [][]numeros=new int[5][5];
		int k=1;

		for (int i = 0; i < numeros.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < numeros.length; j++) {
					numeros[j][i]=k;
					k++;
				}
			}
			else {
				for (int j = (numeros.length-1); j >=0; j--) {
					numeros[j][i]=k;
					k++;
				}
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[i][j]+"  ");
			}
			System.out.println();
		}
	}

	/**
	 * Rellena determiados espacios con 1.
	 */
	public static void espaciosPintados() {

		String [][] num=new String[7][5];
		String numero=String.valueOf(1);
		for (int i = 0; i < num[0].length; i++) {
			for (int j = 0; j < num.length; j++) {

				if(i==0|| i==(num[0].length-1) ) {
					num[j][i]=numero;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if(i%2==0) {
					num[i][j]=numero;
				}
				else if(j!=0&&j!=(num[0].length-1)){
					num[i][j]=" ";
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j]+"  ");
			}
			System.out.println();
		}

	}

	/**
	 * Determina si una matriz está contenida en otra en orden estricto.
	 */
	public static void ordenEstricto() {
		int [][]A= {{1,2,3},{4,5,7}};
		int [][]B= {{4,5}};
		int posicion=-1, cont=0, z=0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				for (int k = 0; k < B.length; k++) {
					for (int x = 0; x < B[0].length; x++) {

						if(A[i][j]==B[k][x]&&x==(posicion+1)) {

							posicion=x;
							cont++;
							x=B.length;
						}
					}
				}
			}
		}
		if(cont==(B.length*B[0].length)) {
			System.out.println("El vector B está contenido en el vector A");
		}

	}

}
