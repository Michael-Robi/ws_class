package ejemplos.bucles;

import javax.swing.JOptionPane;

public class BucleWhile {

	public static void main(String[] args) {

		solicitarContrasena();
//		solicitarGenero();

	}


	private static void solicitarContrasena() {

		String clave = "Juan";
		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contraseña por favor");

			if(clave.equals(pass) == false){
				System.out.println("contraseña incorrecta");
			}

		}

		System.out.println("Contraseña correcta, acceso permitido");
	}
	
	private static void solicitarGenero() {
		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Introduce tu género(H/M)");
		} while (genero.equalsIgnoreCase("H")== false &&  genero.equalsIgnoreCase("H")== false);

	}
	

}
