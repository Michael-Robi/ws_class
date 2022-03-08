package co.edu.uniquindio.programabiblioteca.aplicacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

import co.edu.uniquindio.programabiblioteca.modelo.Biblioteca;
import co.edu.uniquindio.programabiblioteca.modelo.Bibliotecario;
import co.edu.uniquindio.programabiblioteca.modelo.Estudiante;
import co.edu.uniquindio.programabiblioteca.modelo.Libro;
import co.edu.uniquindio.programabiblioteca.modelo.Prestamo;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca miBiblioteca = new Biblioteca("UQ",1094);
		System.out.println("Nombre de la Biblioteca "+miBiblioteca.getNombre());
		
		Estudiante miEstudiante = new Estudiante(1232,"Paco","Alcacer","paco@gmail.com","2183242","Masculino");
		System.out.println(miEstudiante.toString());
		
		Bibliotecario miBibliotecario = new Bibliotecario("Cecilia","Vargas",738291,"cvargas@uqvirtual.edu.co","2187239","Femenino","PRO_27389");
		System.out.println(miBibliotecario.toString());
		
		Libro miLibro = new Libro("Cien años de soledad", "Gabriel Marquez", "Literario", 500, "2/8/1967");
		System.out.println(miLibro.toString());
		
		Prestamo miPrestamo = new Prestamo("20123w", "2/9/2021");
		System.out.println(miPrestamo.toString());
	}
	
	private static int leerEntero(String mensaje) {
		int dato = 0;
		String captura = "";
		System.out.println(mensaje);
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		dato = Integer.parseInt(captura);
		return dato;
	}
	
	 /**
     * Permite leer un numero entero mediante una caja de dialogo 
     * @param mensaje El mensaje que verá el usuario 
     * @return el numero ingresado por el usuario
    */
    public static int leerEnteroVentana (String mensaje)
    {
    	int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    	return dato;
    }


}
