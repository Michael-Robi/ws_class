package ejemplos.arreglos;

import javax.swing.JOptionPane;

public class EjerciciosPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int[] arrgeloNumeros = {1,2,4,7,8};
		//		System.out.println("La suma de los números pares es: " +sumarNumerosParesArreglo(arrgeloNumeros));


		//Ingresar valores.
		//		int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo."));
		//		int[] arreglo = new int[limite];
		//		llenarArreglo(arreglo);

		String[] arregloCadenas = {"Toro","Zorro","Casa","ana","William"};
		mostrarArray(arregloCadenas);


		burbuja(arregloCadenas);
		mostrarArray(arregloCadenas);


	}

	//a b c d e f......z    //z ......f e d c b a
	//1 2 3 4 5......100    //100 .....5 4 3 2 1
	private static String[] burbuja(String[] arreglo) {

        for (int x = 0; x < arreglo.length; x++) {

            for (int y = 0; y < arreglo.length - 1; y++) {


                String elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {

                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }

        return arreglo;
	}


	public static void mostrarArray(String arreglo[]){

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]+" ");
		}
		System.out.println();
	}


//	//Metodo burbuja
//	public static void burbuja(int[] arreglo)
//	{
//		int auxiliar;
//		int[] arregloOrdenado;
//		for(int i = 0; i < arreglo.length-1; i++)
//		{
//			for(int j = 0;j < arreglo.length-1;j++)
//			{
//				if(arreglo[j] < arreglo[j+1])
//				{
//					auxiliar = arreglo[j];
//					arreglo[j] = arreglo[j+1];
//					arreglo[j+1] = auxiliar;
//				}
//			}
//		}
//		arregloOrdenado = arreglo;
//
//		System.out.println("\nEl arreglo ordenado de forma decendente es: ");
//		for(int i = 0; i < arregloOrdenado.length;i++)
//			System.out.print(arregloOrdenado[i]+", ");
//
//	}


	public static void llenarArreglo(int[]arreglo){
		System.out.println("El arreglo ingresado por el usuario es: ");
		for (int i = 0; i < arreglo.length; i++) {
			String texto = JOptionPane.showInputDialog("Introducir numero");
			arreglo[i] =Integer.parseInt(texto);
			System.out.print(+arreglo[i]+", ");
		}


	}



	private static int sumarNumerosParesArreglo(int[] numeros)
	{
		int sumaPares = 0;
		for (int i = 0; i < numeros.length; i++) {

			if(numeros[i] % 2 == 0)
			{
				sumaPares = sumaPares + numeros[i];
			}
		}

		return sumaPares;

		//		System.out.print("La suma de los números pares es: " + sumaPares + "\n");

	}




}
