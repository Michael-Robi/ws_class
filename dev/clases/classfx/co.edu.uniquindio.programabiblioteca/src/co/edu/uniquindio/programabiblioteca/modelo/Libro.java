package co.edu.uniquindio.programabiblioteca.modelo;

public class Libro {
	
	//Declaracion de Variables
	String titulo;
	String autor;
	String genero;
	int cantidadPaginas;
	String fechaDePublicacion;
	
	/**
	 * Este es el metodo constructor de la clase Libro
	 * @param titulo
	 * @param autor
	 * @param genero
	 * @param cantidadPaginas
	 * @param fechaDePublicacion
	 */
	public Libro(String titulo, String autor, String genero, int cantidadPaginas, String fechaDePublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.cantidadPaginas = cantidadPaginas;
		this.fechaDePublicacion = fechaDePublicacion;
	}

	//Metodos get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(String fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ",\ngenero=" + genero + ", cantidadPaginas="
				+ cantidadPaginas + ",\nfechaDePublicacion=" + fechaDePublicacion + "]\n";
	}
	
}
