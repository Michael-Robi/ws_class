package application;

import java.util.ArrayList;

import application.Clases.Biblioteca;
import application.Clases.Estudiante;
import application.Clases.Libro;
import application.Clases.Reserva;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Mario Euclides","Carrera 23 Esquina");
		
		biblioteca.crearLibro("16", "Calculo", "Deitel", "Matematicas");
		imprimirLibros(biblioteca.getListaLibros());
//		biblioteca.eliminarLibro("16");
		boolean dato = biblioteca.actualizarLibro("16", "Calculo2", "Deitel2", "Matematicas");
		
		if (dato == true) {
			System.out.println("Actualizado");
		} else{
			System.out.println("No Actualizado");
		}
		
		imprimirLibros(biblioteca.getListaLibros());
		
		imprimirEstudiantes(biblioteca.getListaEstudiantes());
		imprimirReserva(biblioteca.getListaReservas());
		
    	Libro buscarLibro = null;
    	buscarLibro = Biblioteca.BuscarLibro("16");
    	System.out.println(buscarLibro);
	}

	//Imprimir Arrays
	private static void imprimirEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			System.out.println(listaEstudiantes.get(i));
		}
	}

	private static void imprimirLibros(ArrayList<Libro> listaLibros) {
		
		for (int i = 0; i < listaLibros.size(); i++) {
			Libro libro = listaLibros.get(i);
			System.out.println(libro);
		}
	}

	private static void imprimirReserva(ArrayList<Reserva> listaReservas) {
		for (int i = 0; i < listaReservas.size(); i++) {
			System.out.println(listaReservas.get(i));
		}
	}
}
