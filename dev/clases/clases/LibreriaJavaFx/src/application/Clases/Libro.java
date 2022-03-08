package application.Clases;

public class Libro {
	private String identificacion;
	private String nombre;
	private String autor;
	private String categoria;
	
	public Libro() {
		
	}
	
	public Libro(String identificacion, String nombre, String autor, String categoria) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.autor = autor;
		this.categoria = categoria;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Libro [identificacion=" + identificacion + ", nombre=" + nombre + ", autor=" + autor + ", categoria="
				+ categoria + "]";
	}
}
