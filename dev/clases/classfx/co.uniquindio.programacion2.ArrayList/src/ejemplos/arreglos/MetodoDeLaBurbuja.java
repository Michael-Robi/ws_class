package ejemplos.arreglos;

public class MetodoDeLaBurbuja {

	public static void main(String[] args) {

//		//Valores que tiene el arreglo desordenado.
//		int arreglo[] = {8,6,7,2,1,8};
//
//		//imprimimos el arreglo no ordenado.
//		mostrarArray(arreglo);
//
//		//	int arregloOrdenado[] = burbujaEnteros(arreglo);
//		int arregloOrdenado[] = burbuja2(arreglo);
//
//		//imprimimos el arreglo ordenado.
//		mostrarArray(arreglo);



		String arregloCadenas[] = {"Zorro","Rayos","Ana","","Toro"};
		mostrarArray(arregloCadenas);

		burbujaCadenasAscendente(arregloCadenas);
//		burbujaCadenasDescendente(arregloCadenas);
		//imprimimos el arreglo ordenado.
		mostrarArray(arregloCadenas);


	}


	public static int[] burbujaEnteros(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }


	public static int[] burbuja2(int[] arreglo) {
		int i, j, aux;
		for (i = 0; i < arreglo.length - 1; i++) {
			for (j = 0; j < arreglo.length - i - 1; j++) {

				if (arreglo[j + 1] < arreglo[j]) {
					aux = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}

		return arreglo;
	}


	private static void burbujaCadenasAscendente(String[] arreglo) {

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
	}

	private static void burbujaCadenasDescendente(String[] arreglo) {

		String elementoActual = "";
		String elementoSiguiente = "";

	    for (int i = 0; i < arreglo.length; i++) {

	        // Aquí "y" se detiene antes de llegar
	        // a length - 1 porque dentro del for, accedemos
	        // al siguiente elemento con el índice actual + 1

	        for (int j = 0; j < arreglo.length - 1; j++) {

	        	elementoActual = arreglo[j];
	        	elementoSiguiente = arreglo[j + 1];

	            if (elementoActual.compareTo(elementoSiguiente) < 0) {
	                // Intercambiar
	                arreglo[j] = elementoSiguiente;
	                arreglo[j + 1] = elementoActual;
	            }
	        }
	    }
	}



	public static void mostrarArray(int arreglo[]){
		for(int i=0;i<arreglo.length;i++){
			System.out.print(arreglo[i]+"");
		}
		System.out.println();
	}

	public static void mostrarArray(String arreglo[]){
		for(int i=0;i<arreglo.length;i++){
			System.out.print(arreglo[i]+"-");
		}
		System.out.println();
	}

}
