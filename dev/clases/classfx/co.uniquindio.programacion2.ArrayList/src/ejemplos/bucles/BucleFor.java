package ejemplos.bucles;

import javax.swing.JOptionPane;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejemplo1RecorridoAdelante();
		ejemplo2RecorridoAtras();

//		comprobarEmail();
	}



	private static void ejemplo1RecorridoAdelante() {

		for (int i = 0; i<10; i++) {
			System.out.println("Iteración "+i+":Juan");
		}

	}

	private static void ejemplo2RecorridoAtras() {

		for (int i = 10; i>0; i--) {
			System.out.println("Iteración "+i+":Pedro");
		}
	}

	private static void comprobarEmail() {

		boolean arroba = false;
		String email = JOptionPane.showInputDialog("Introduce el Email");


		for (int i = 0; i < email.length(); i++) {

			if(email.charAt(i) == '@'){
				arroba = true;
			}
		}

		if(arroba == true){
			System.out.println("El correo es correcto");
		}else{
			System.out.println("El correo NO es correcto");
		}
	}

}
