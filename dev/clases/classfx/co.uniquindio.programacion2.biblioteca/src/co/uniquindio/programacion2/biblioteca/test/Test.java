package co.uniquindio.programacion2.biblioteca.test;

import javax.swing.JOptionPane;

import co.uniquindio.programacion2.biblioteca.model.Biblioteca;

public class Test {

	public static void main(String[] args) {

		// 1. Crear un objeto o instancia
		
		String nombreBiblioteca = "";
		String direccionBiblioteca = "";
		

		// variables para estudiante
		String nombre = "";
		String identificacion= "";
		String direccion= "";
		String telefono= "";
		
		imprimir("Bienvenido a nuestra aplicacion");
		
		

		//imprimir("Por favor ingrese la informacion de la biblioteca");


//		nombreBiblioteca = leerStringVentana("Por favor ingrese el nombre de la biblioteca");
//		direccionBiblioteca = leerStringVentana("Por favor ingrese la dirección de la biblioteca");
//		
//
//		Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, direccionBiblioteca);
//
//		System.out.println(biblioteca.toString());
//		
//		imprimir("Por favor ingrese la informacion del estudiante 1");
//		nombre = leerStringVentana("Por favor ingrese el nombre del estudiante 1");
		
		
	}


	/**
	 * Permite imprimir un mensaje
	 * @param mensaje El mensaje a imprimir
	 */
	public static void imprimir (String mensaje)
	{
		JOptionPane.showMessageDialog(null,mensaje);
	}


	public static String  leerStringVentana(String mensaje) {
		String respuesta = "";
		respuesta  = JOptionPane.showInputDialog(mensaje);
		return respuesta;

	}
	
	


}
