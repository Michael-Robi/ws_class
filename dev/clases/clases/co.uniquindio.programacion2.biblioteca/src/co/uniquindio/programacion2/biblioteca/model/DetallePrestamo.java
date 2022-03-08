package co.uniquindio.programacion2.biblioteca.model;

public class DetallePrestamo {
	
	private int cantidad;
	private Libro libro;
	private int subTotal;
	
	//Subtotal Prestamo
	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	public DetallePrestamo() {
		
	}

	public DetallePrestamo(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "DetallePrestamo [cantidad=" + cantidad + "]";
	}

	public int consultarCantidadLibros(String editorial) {
		
		int cantidadLibros = 0;
		boolean libroVerificado = false;
		
		if(libro != null){
			
			libroVerificado = libro.verificarEditorialTitulo(editorial);
			
			if(libroVerificado == true){
				 cantidadLibros = this.cantidad;
			}
		}
		
		return cantidadLibros;
	}
	
	public boolean obtenerPrestamoLibro(String nombre) {
		boolean verificarLibro = false;
		
		if (libro != null) {
			verificarLibro = libro.verificarTitulo(nombre);
			
			if (verificarLibro) {
				return true;
			} else {
				return false;
			}
		}
		
		return verificarLibro;
	}
	
	//VerificarCantidadTitulo
	public boolean verificarCantidadTitulo(String titulo) {
		
		boolean cantidadVerifica = false;
		boolean tituloverificado = false;
		
		if(libro != null) {
			
			cantidadVerifica = verificarCantidad(10);
			tituloverificado = libro.verificarTitulo(titulo);

			if (cantidadVerifica == true && tituloverificado == true)
				return true;
		}
		
		return false;
	}

	private boolean verificarCantidad(int i) {
		
		if(this.cantidad >= 10)
			return true;
		
		else
			return false;
	}

	public boolean verificarIdLibro(String isbn) {
		boolean idverificado = false;
		
		if(libro != null) {
			
			idverificado = libro.verificarid(isbn);

			if (idverificado == true)
				return true;
		}
		
		return false;
	}
	
}
