package co.uniquindio.programacion2.biblioteca.model;

import javax.swing.JOptionPane;

public class Prestamo {

	
	private String fechaPrestamo;
	private String codigo;
	private String fechaDevolucion;
	
	private Libro libro1;
	private Libro libro2;
	
	private Estudiante estudiante;
	private Bibliotecario bibliotecario;
	

	/**
	 * ESte es el metodo constructor
	 * @param fechaPrestamo
	 * @param codigo
	 * @param fechaDevolucion
	 * @param libro1
	 * @param libro2
	 * @param estudiante
	 * @param bibliotecario
	 */
	public Prestamo(String fechaPrestamo, String codigo, String fechaDevolucion, Libro libro1, Libro libro2,
			Estudiante estudiante, Bibliotecario bibliotecario) {
		this.fechaPrestamo = fechaPrestamo;
		this.codigo = codigo;
		this.fechaDevolucion = fechaDevolucion;
		this.libro1 = libro1;
		this.libro2 = libro2;
		this.estudiante = estudiante;
		this.bibliotecario = bibliotecario;
	}

	public Prestamo(String fechaPrestamo, String codigo, String fechaDevolucion) {
		this.fechaPrestamo = fechaPrestamo;
		this.codigo = codigo;
		this.fechaDevolucion = fechaDevolucion;
	}

	public Prestamo() {

	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Libro getLibro1() {
		return libro1;
	}

	public void setLibro1(Libro libro1) {
		this.libro1 = libro1;
	}

	public Libro getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro libro2) {
		this.libro2 = libro2;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	//verificarPrestamoAsociado
	public boolean verificarEstudianteAsociado(String nombre, String identificacion) {

		boolean flastRespuesta = false;
		
		if(estudiante!=null){
		
			flastRespuesta=estudiante.validarDatos(nombre,identificacion);
		
			if (flastRespuesta!=false) {
				return flastRespuesta;
			}
			else{
				return flastRespuesta;
			}
		}
		
		return flastRespuesta;
	}
	
	
	
}
