package ejemplos.matrices;

import java.util.Arrays;


public class Matriz {
	String codigo;
	int[][] matriz;
	/**
	 * método constructor de la clase
	 */
	public Matriz(int[][] matrizAux, int codigo) {
		this.matriz=matrizAux;
		this.codigo=""+codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = ""+codigo;
	}
	public int[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	@Override
	public String toString() {
		return "Matriz [codigo=" + codigo + ", matriz=" + Arrays.toString(matriz) + "]";
	}

	/**
	 * método que imprime la matriz con su codigo
	 */
	public void imprimirMatriz()
	{
		System.out.println("Codigo matriz:"+codigo);
		System.out.println("--------------------------------");

		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				if(matriz[i][j]>=10)
				{
					System.out.print(" |"+matriz[i][j]+"|");
				}
				else
				{
					System.out.print(" |"+matriz[i][j]+"| ");
				}
			}
			System.out.println("");
		}
		System.out.println("--------------------------------\n\n\n");
	}
	/**
	 * método que verifica si la matriz es o no simetrica, si es simetrica se
	 * retorna un mensaje "La matriz es simetrica" sino se retorna el mensaje
	 * "La matriz no es simetrica", antes de la verificación el programa verifica que la matriz sea
	 * cuadrada, si no es cuadrada se retorna la excepción MatrizNoCuadradaException
	 * @return mensaje
	 * @throws MatrizNoCuadradaException
	 */
	public String verificarSimetria()
	{
		String respuesta;
		boolean esSimetrica=true;
		if(matriz.length!=matriz[0].length)
			System.out.println("La matriz debe ser cuadrada...");
		for(int i=0;i<matriz.length && esSimetrica ;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				if(matriz[i][j]!=matriz[j][i])
				{
					esSimetrica=false;
				}
			}
		}
		if(esSimetrica==true)
		{
			respuesta="La matriz es simetrica.";
		}
		else
		{
			respuesta="La matriz no es simetrica.";
		}
		return respuesta;

	}
	/**
	 * método que verifica si la matriz de la clase es igual a la matriz
	 * que llega como parametro, si son iguales retorna un true, sino
	 * retorna un false
	 * @param matrizAux
	 * @return respuesta
	 */
	public boolean verificarIgualdadMatrices(int[][] matrizAux) {
		boolean respuesta=true;
		if(matriz.length==matrizAux.length && matriz[0].length==matrizAux[0].length)
		{
			for(int i=0;i<matriz.length && respuesta;i++)
			{
				for(int j=0;j<matriz[i].length;j++)
				{
					if(matriz[i][j]!=matrizAux[i][j])
						respuesta=false;
				}
			}

		}
		else
		{
			respuesta=false;
		}
		return respuesta;
	}
	/**
	 * método que imprime el elemento mayor de la matriz, si hay más de una
	 * iteración imprimirá la última encontrada.
	 */
	public void imprimirElementoMayor() {
		int fila=0;
		int columna=0;
		int numMayor=matriz[0][0];

		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				if(numMayor<=matriz[i][j])
				{
					numMayor=matriz[i][j];
					fila=i;
					columna=j;
				}
			}
		}
		System.out.println("El número mayor es "+numMayor+" y se encuentra en :\nFila: "+(fila+1)+"\nColumna: "+(columna+1));
	}
	/**
	 * método que compara el código ingresado por parametro con el código de la matriz,
	 * si son iguales retorna un true, sino retorna un false
	 * @param codigo2
	 * @return
	 */
	public boolean verificarCodigo(int codigoAux) {
		String codigoAux2=codigoAux+"";
		boolean esIgual=false;
		if(codigo.equalsIgnoreCase(codigoAux2))
			esIgual=true;
		return esIgual;
	}
	/**
	 * método que suma una fila he imprime el resultado de esta suma.
	 * @param fila
	 */
	public void sumarFila(int fila) throws IndexOutOfBoundsException{
		int resultado=0;
		if(fila<=matriz.length)
		{
			for(int j=0;j<matriz[fila-1].length;j++)
			{
				resultado+=matriz[fila-1][j];
			}
			System.out.println("La suma de la fila "+(fila)+" es "+resultado);
		}
		else
		{
			throw new IndexOutOfBoundsException("La fila ingresada no pertenece a la matriz...");
		}
	}
	/**
	 * método que suma una columna he imprime el resultado de esta suma.
	 * @param columna
	 */
	public void sumarColumna(int columna) throws IndexOutOfBoundsException{
		int resultado=0;
		if(columna<=matriz.length)
		{
			for(int i=0;i<matriz.length;i++)
			{
				resultado+=matriz[i][columna-1];
			}
			System.out.println("La suma de la columna "+(columna)+" es "+resultado);
		}
		else
		{
			throw new IndexOutOfBoundsException("La columna ingresada no pertenece a la matriz...");
		}
	}
	/**
	 * método que suma la diagonal principal he imprime el resultado, si la matriz
	 * no es cuadrada genera un MatrizNoCuadradaException
	 * @throws MatrizNoCuadradaException
	 */
	public void sumarDiagonalPrincipal(){
		int resultado=0;
		if(matriz.length==matriz[0].length)
		{
			for(int i=0;i<matriz.length;i++)
			{
				for(int j=0;j<matriz[i].length;j++)
				{
					if(i==j)
						resultado+=matriz[i][j];
				}
			}
			System.out.println("La suma de la diagonal principal es :"+resultado);
		}
		else
		{
			System.out.println("La matriz debe ser cuadrada...");
		}
	}
	/**
	 * método que suma la diagonal secundaria he imprime el resultado, si la matriz
	 * no es cuadrada genera un MatrizNoCuadradaException
	 * @throws MatrizNoCuadradaException
	 */
	public void sumarDiagonalSecundaria() {
		int resultado=0;
		if(matriz.length==matriz[0].length)
		{
			for(int i=0;i<matriz.length;i++)
			{
				for(int j=0;j<matriz[i].length;j++)
				{
					if(i+j==matriz.length-1)
						resultado+=matriz[i][j];
				}
			}
			System.out.println("La suma de la diagonal principal es :"+resultado);
		}
		else
		{
			System.out.println("La matriz debe ser cuadrada...");
		}
	}
	/**
	 * método que calcula el valor promedio de la matriz y lo imprime, se usa el divisor
	 * como double para que el resultado tenga las decimales
	 */
	public void imprimirPromedioMatriz() {

		int acumulado=0;
		double divisor=0;
		double resultado;

		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				acumulado+=matriz[i][j];
				divisor++;
			}
		}
		resultado=acumulado/divisor;
		System.out.println("El promedio de la matriz es :"+resultado);
	}
	/**
	 * método que suma la matriz de la clase con otra matriz que ingresa
	 * como parametro, el resultado de esta suma se guarda en una tercera
	 * matriz que se retorna.
	 * Si las dimensiones de las matrices son distintas se genera una excepción
	 * @param matrizAux
	 * @return matrizResultante
	 * @throws MatricesDiferentesException
	 */
	public int[][] sumarMatriz(int[][] matrizAux)  {
		int[][] matrizResultante=new int[matriz.length][matriz[0].length];
		if(matriz.length==matrizAux.length && matriz[0].length==matrizAux[0].length)
		{
			for(int i=0;i<matriz.length;i++)
			{
				for(int j=0;j<matriz[0].length;j++)
				{
					matrizResultante[i][j]=matriz[i][j]+matrizAux[i][j];
				}
			}
			return matrizResultante;
		}
		else
		{
			System.out.println("La suma debe ser entre matrices con dimensiones iguales...");
		}
		return matrizResultante;
	}
	/**
	 * método que verifica si la matriz contiene por lo menos dos ceros consecutivos
	 */
	public void verificarCerosConsecutivos() {
		int    cero=0;
		int    numAnterior;
		String mensaje="";
		boolean encontrado=false;
		for(int i=0;i<matriz.length && !encontrado;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				if(j!=0 && i<(matriz.length-1))
				{
					numAnterior=matriz[i][j-1];
					if(matriz[i][j]==numAnterior && numAnterior==cero)
					{
						encontrado=true;
					}
					else
					{
						if(matriz[i+1][j-1]==numAnterior && numAnterior==cero)
						{
							encontrado=true;
						}
					}
				}
			}
		}
		if(encontrado==true)
		{
			System.out.println("La matriz posee por lo menos dos ceros consecutivos");
		}
		else
		{
			System.out.println("La matriz no posee dos ceros consecutivos");
		}
	}

}