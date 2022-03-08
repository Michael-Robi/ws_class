package application.Clases;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String direccion;
	
	private ArrayList<Estudiante> listaEstudiantes;
	private static ArrayList<Libro> listaLibros;
	private ArrayList<Reserva> listaReservas;
	
	public Biblioteca(String nombre, String direccion) {

		this.nombre = nombre;
		this.direccion = direccion;

		listaEstudiantes = new ArrayList<Estudiante>();
		listaLibros = new ArrayList<Libro>();
		listaReservas = new ArrayList<Reserva>();
		
		CargarArray();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", listaEstudiantes=" + listaEstudiantes
				+ ", listaLibros=" + listaLibros + ", listaReservas=" + listaReservas + "]";
	}
	
	//Metodo para CargarArray
	private void CargarArray() {
		Estudiante estudiante = new Estudiante("1234","Marcos","Yorente","Masculino");
		listaEstudiantes.add(estudiante);
		
		estudiante = new Estudiante("1235","Marta","Garcia","Femenino");
		listaEstudiantes.add(estudiante);
		
		Libro libro = new Libro("12","El gato Negro","Edgar Poe","Infantiles");
		listaLibros.add(libro);
		
		libro = new Libro("13","100 años de Soledad","Gabriel Garcia Marquez","Novela");
		listaLibros.add(libro);
		
		Reserva reserva = new Reserva("1",libro,estudiante,"Carlos");
		listaReservas.add(reserva);
	}
	
	//Crud Libro
	
	public static Libro crearLibro(String id, String nombre, String autor, String categoria){
		Libro libro = null;
		
		libro = BuscarLibro(id);
		
		if (libro == null) {
			libro = new Libro(id,nombre,autor,categoria);
			
			listaLibros.add(libro);
			
			return libro;
		}
		
		return libro;
	}

	public static Libro BuscarLibro(String id) {
		
		Libro libro = null;
		
		for(Libro KeyLibro: listaLibros){

			if(KeyLibro.getIdentificacion().equals(id)){
				libro = KeyLibro;
			}
		}

		return libro;
	}
	
	public static boolean eliminarLibro(String identificacion) {

		Libro libro = null;

		//Verificar si el cliente existe
		libro = BuscarLibro(identificacion);

		if(libro != null){
			listaLibros.remove(libro);
			return true;
		}
		else{
			return false;

		}

	}
	
	public static boolean actualizarLibro(String id, String nombre, String autor, String categoria) {
		
		Libro libro = null;
		int posicion = 0;
		
		//Verificar si el cliente existe
		libro = BuscarLibro(id);
		posicion = PoscionLibro(id);

		if(libro != null){

			libro = new Libro();
			
			libro.setIdentificacion(id);
			libro.setNombre(nombre);
			libro.setAutor(autor);
			libro.setCategoria(categoria);
			
			listaLibros.set(posicion, libro);

			return true;
		}
		else{
			return false;

		}
	}

	private static int PoscionLibro(String id) {
		int posicion = 0;
		
		Libro libro = null;
		
		for (int i = 0; i < listaLibros.size(); i++) {
			libro = listaLibros.get(i);
			
			if (libro.getIdentificacion().equalsIgnoreCase(id)) {
				posicion = i;
			}
		}
		
		return posicion;
	}
	
}
