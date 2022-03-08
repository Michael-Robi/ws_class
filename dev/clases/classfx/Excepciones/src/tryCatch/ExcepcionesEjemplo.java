package tryCatch;
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
		int [] a = new int [2];
		int resultado = 0;
		
		a[0]= 8;
		a[1]= 2;
		
		resultado = a[0]/a[1];
		
		System.out.println(resultado);
	}

	public static void ejemplo1() {
		int a, b, c;
		
		a = 8;
		b = 0;
		
		try
		{
		    c=a/b;
			JOptionPane.showMessageDialog(null, c);
		}
		catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Biólogo de Error",
			JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private static void ejemplo2() {
		//Bloque 1
		int []a = new int [2];
		int resultado = 0;
		a[0] = 0;
		a[1] = 0;
		try{
		//Bloque 2
		resultado = a[0]/a[1]; // Linea o fragmento de codigo que esta generando la excepción
		} catch (ArithmeticException e) {
		//Bloque 3
		JOptionPane.showMessageDialog(null, "Se presento un problema: división por cero");
		}
		//Bloque 4
		JOptionPane.showMessageDialog(null, "El valor es: "+ resultado);
	}
	
	private static void ejemplo3() {
		//Bloque 1
		int [] a = new int [2];
		int resultado = 0;

		try{
			//Bloque 2
			a[0] = 8;
			a[1] = 0;
			a[2] = 3;
			resultado = a[0] /a[1]; // Linea fragmento de codigo que esta generando la excepción
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			//Bloque 3
			JOptionPane.showMessageDialog(null, "Se presento un problema: división por cero");
			JOptionPane.showMessageDialog(null, "Se presento un problema: "+ e.getMessage());
		}
//		catch (ArrayIndexOutOfBoundsException el) { //Posicion no valida desvorde array
//			JOptionPane.showMessageDialog(null, "Se presento un problema posicion no valida:" + el.getMessage());
//		}
		
		//Bloque 4
		JOptionPane.showMessageDialog(null, "El valor es: resultado"+resultado);
		
	}
	
	private static void ejemplo4() {
			//Bloque 1
			int [] a = new int[2];
			int resultado = 0;
			
			
			
			try{
				//Bloque 2
				a[0] = 8;
				a[1] = 2;
//				a[2] = 2;
				resultado = a[0]/a[1]; // Linea o fragmento de codigo que esta generando la excepción
			} catch (ArithmeticException | NullPointerException e){
				//Boque 3
				JOptionPane.showMessageDialog(null, "Se presento un problema: "+ e.getMessage());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Se presento un problema diferente "+ e.getMessage());
			} finally{
				JOptionPane.showMessageDialog(null, "Bloque Finally ejecutado");
			}
//			catch (ArrayIndexOutOfBoundsException el) {
//				JOptionPane.showMessageDialog(null, "Se presento un problema:" + el.getMessage());
//			}
			//Bloque 4
			JOptionPane.showMessageDialog(null, "El valor es: "+ resultado);
		}
}
