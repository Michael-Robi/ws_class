package excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExcepcionesEjemplo {

	public static void main(String[] args) {
		
//		ejemplo0();
//		ejemplo1();
//		ejemplo2();
//		ejemplo3();
		ejemplo4();
		
	}


	private static void ejemplo0() {

		int [] 	a = new int[2];
		int resultado = 0;

		a[0] = 8;
		a[1] = 2;

		resultado = a[0]/a[1];
		
		System.out.println(resultado);
	}
	
	
	
	
	private static void ejemplo1() {

		//Bloque 1
		int [] 	a = new int[2];
		int resultado = 0;

		a[0] = 8;
		a[1] = 0;

		//Bloque 2
		
		try {
			resultado = a[0]/a[1]; // Linea o fragmento de codigo que esta generando la excepciòn
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
				
	}
	
	
	private static void ejemplo2() {

		//Bloque 1
		int [] 	a = new int[2];
		int resultado = 0;



		try {
			//Bloque 2	
			a[0] = 8;
			a[2] = 0;
			resultado = a[0]/a[1]; // Linea o fragmento de codigo que esta generando la excepciòn		
		} catch (ArithmeticException e) {
			//Bloque 3
			JOptionPane.showMessageDialog(null, "Se presento un problema: divisiòn por cero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Se presento un problema: asignación en una posición no valida");
		}
		//Bloque 4
		JOptionPane.showMessageDialog(null, "El valor es: "+ resultado);
	}
	
	
	private static void ejemplo3() {

		//Bloque 1
		int [] 	a = new int[2];
		int resultado = 0;

		a[0] = 8;
		a[1] = 0;

		try {
			//Bloque 2
			resultado = a[0]/a[1]; // Linea o fragmento de codigo que esta generando la excepciòn		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			//Bloque 3
//			JOptionPane.showMessageDialog(null, "Se presento un problema: divisiòn por cero");
			JOptionPane.showMessageDialog(null, "Se presento un problema: "+ e.getMessage());
		}
//		catch (ArrayIndexOutOfBoundsException e1) {
//			JOptionPane.showMessageDialog(null, "Se presento un problema:" + e1.getMessage());
//		}
		//Bloque 4
		JOptionPane.showMessageDialog(null, "El valor es: "+ resultado);
	}

	
	private static void ejemplo4() {

		//Bloque 1
		int [] 	a = new int[2];
		int resultado = 0;



		try {
			//Bloque 2
			a[0] = 8;
			a[1] = 2;
			resultado = a[0]/a[1]; // Linea o fragmento de codigo que esta generando la excepciòn		
		} catch (ArithmeticException | NullPointerException e) {
			//Bloque 3
			JOptionPane.showMessageDialog(null, "Se presento un problema: "+ e.getMessage());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se presento un problema diferente "+ e.getMessage());
		}finally {
			JOptionPane.showMessageDialog(null, "Bloque Finally ejecutado");
		}
//		catch (ArrayIndexOutOfBoundsException e1) {
//			JOptionPane.showMessageDialog(null, "Se presento un problema:" + e1.getMessage());
//		}
		//Bloque 4
		JOptionPane.showMessageDialog(null, "El valor es: "+ resultado);
	}


}
