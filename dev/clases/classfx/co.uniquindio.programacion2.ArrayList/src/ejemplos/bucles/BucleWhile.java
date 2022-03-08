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

			pass = JOptionPane.showInputDialog("Introduce la contrase�a por favor");

			if(clave.equals(pass) == false){
				System.out.println("contrase�a incorrecta");
			}

		}

		System.out.println("Contrase�a correcta, acceso permitido");
	}
	
	private static void solicitarGenero() {
		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Introduce tu g�nero(H/M)");
		} while (genero.equalsIgnoreCase("H")== false &&  genero.equalsIgnoreCase("H")== false);

	}
	

}
