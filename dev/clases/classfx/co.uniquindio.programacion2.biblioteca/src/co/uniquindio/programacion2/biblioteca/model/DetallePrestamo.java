package co.uniquindio.programacion2.biblioteca.model;

public class DetallePrestamo {
	private Libro libro1;
	private Libro libro2;
	private int cantidad;
	
	public DetallePrestamo(Libro libro1, Libro libro2) {
		super();
		this.libro1 = libro1;
		this.libro2 = libro2;
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
	
	
}
