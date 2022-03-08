package application;
	
import java.io.IOException;
import java.util.ArrayList;

import application.Clases.Biblioteca;
import application.Clases.Estudiante;
import application.Clases.Libro;
import application.Clases.Reserva;
import application.Controlador.LibreriaControlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application {
	
	//Declarar Variables
	private Stage primaryStage;
	Biblioteca biblioteca = new Biblioteca("Mario Euclides","Carrera 23 Esquina");
	
	@Override
	public void start(Stage primaryStage) {//metodo start
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Biblioteca"); //Definir titulo
		mostrarVentanaPrincipal();
	}
	
	private void mostrarVentanaPrincipal() {//Mostrar Vista Principal
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/vistas/Libreria.fxml"));//Cargar Vista del proyecto
			
			AnchorPane rootLayout = (AnchorPane)loader.load();
			
			LibreriaControlador parqueaderoController = loader.getController(); //Controlador de eventos
			parqueaderoController.setAplicacion(this);
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	//Consumir Crud Estudiante y demas en: Biblioteca
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	public Libro BuscarLibro(String id){
		Libro buscarLibro = null;
    	buscarLibro = Biblioteca.BuscarLibro(id);
    	return buscarLibro;
	}
	
	public Libro crearLibro(String id, String nombre, String autor, String categoria){
		Libro crearLibro = null;
		Libro buscarLibro = Biblioteca.BuscarLibro(id);
		
		if (buscarLibro==null) {
			crearLibro = Biblioteca.crearLibro(id,nombre,autor,categoria);
		}
		
		return crearLibro;
	}
	
	public Boolean actualizarLibro(String id, String nombre, String autor, String categoria){
		Boolean actualizarLibro = null;
		actualizarLibro = Biblioteca.actualizarLibro(id,nombre,autor,categoria);
		return actualizarLibro;
	}
	
	public Boolean eliminarLibro(String identificacion){
		Boolean eliminarLibro = false;
		eliminarLibro = Biblioteca.eliminarLibro(identificacion);
		return eliminarLibro;
	}
	
	public String imprimirLibros(){
		return imprimirLibros(biblioteca.getListaLibros());
	}
	
	private String imprimirLibros(ArrayList<Libro> listaLibros) {
		String Libros = "";
		
		for (int i = 0; i < listaLibros.size(); i++) {
			Libro libro = listaLibros.get(i);
			Libros += libro + "\n";
		}
		
		return Libros;
	}
	
	public String imprimirEstudiante(){
		return imprimirEstudiantes(biblioteca.getListaEstudiantes());
	}
	
	private String imprimirEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		String Estudiantes = "";
		
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			Estudiante estudiante = listaEstudiantes.get(i);
			Estudiantes += estudiante + "\n";
		}
		
		return Estudiantes;
	}
	
	public String imprimirReserva(){
		return imprimirReservas(biblioteca.getListaReservas());
	}
	
	private String imprimirReservas(ArrayList<Reserva> listaReservas) {
		String Reservas = "";
		
		for (int i = 0; i < listaReservas.size(); i++) {
			Reserva reserva = listaReservas.get(i);
			Reservas += reserva + "\n";
		}
		
		return Reservas;
	}
}
