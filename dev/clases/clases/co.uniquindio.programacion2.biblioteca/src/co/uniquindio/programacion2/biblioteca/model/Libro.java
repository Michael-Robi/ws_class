package co.uniquindio.programacion2.biblioteca.model;

/**
 * 
 * @author Admin
 *
 */
public class Libro {
	
	// DECLARACION DE ATRIBUTOS
	private String codigo;
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String editorial;
	private String estado;
	private String fechaPublicacion;
	private int cantidadDisponible;	
	private int precio;
	
	/**
	 * Este es el metodo constructor de la clase libro
	 * @param codigo
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 * @param editorial
	 * @param estado
	 * @param fechaPublicacion
	 * @param cantidadDisponible
	 */
	public Libro(String codigo, String isbn, String titulo, String autor, int numeroPaginas, String editorial,
			String estado, String fechaPublicacion, int cantidadDisponible, int precio) {
		super();
		this.codigo = codigo;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.editorial = editorial;
		this.estado = estado;
		this.fechaPublicacion = fechaPublicacion;
		this.cantidadDisponible = cantidadDisponible;
		this.precio = precio;
	}

	// Precio Libro
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor
				+ ", numeroPaginas=" + numeroPaginas + ", editorial=" + editorial + ", estado=" + estado
				+ ", fechaPublicacion=" + fechaPublicacion + ", cantidadDisponible=" + cantidadDisponible + "]";
	}

	public boolean verificarEditorialTitulo(String editorial) {
		
		boolean editorialVerificada = false;
		boolean tituloVerificado = false;
		
		editorialVerificada = verificarEditorial(editorial);
		
		if(editorialVerificada == true){
			
			tituloVerificado = verificarTitulo();
			
			if(tituloVerificado == true)
				return true;
		}		
		
		return false;
	}

	private boolean verificarEditorial(String editorial) {
		
		if(this.editorial.equalsIgnoreCase(editorial))
			return true;
		else			
			return false;
	}
	
	private boolean verificarTitulo() {
		
		boolean letraVerificada = false;
		char letra = this.titulo.charAt(0);
		
		letraVerificada = verificarVocal(letra);
		
		if(letraVerificada == true){
			return true;
		}else{
			return false;
		}
		
	}

	private boolean verificarVocal(char letra) {
		
		letra = Character.toLowerCase(letra);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			return true;
		else
			return false;
	}

	//consultar Libro
	public boolean verificarTitulo(String titulo2) {
		if(this.titulo.equalsIgnoreCase(titulo))
			return true;
		else
			return false;
	}

	public boolean verificarid(String isbn) {
		// TODO Auto-generated method stub
		if(this.isbn.equalsIgnoreCase(isbn))
			return true;
		else
			return false;
	}

}
