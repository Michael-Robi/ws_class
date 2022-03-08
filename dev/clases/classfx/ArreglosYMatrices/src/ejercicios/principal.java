package ejercicios;

import javax.swing.JOptionPane;

public class principal {
	
	public static String resultado = null;
	public static int contarVerdadero = 0;
	public static int contarFalso = 0;
	
	public static void main(String[] args) {

		Boolean []array = new Boolean[10];
		
		llenarArray(array);
		contarVerdaderosYFalsos(array);
		recorrerArreglo(array);
	}
	
	public static void contarVerdaderosYFalsos(Boolean[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i].equals(true)) {
				contarVerdadero += 1;
			}
			else {
				contarFalso += 1;
			}
		}
		resultado = "Cantidad de Verdaderos= "+contarVerdadero+ ", Cantidad de Falsos = "+contarFalso;
		System.out.println(resultado);
	} 
	
	public static void recorrerArreglo(Boolean[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("array["+i+ "] = " +array[i]+";");
		}
	}
	
	public static void llenarArray(Boolean[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() < 0.5);
		}
	}

}
