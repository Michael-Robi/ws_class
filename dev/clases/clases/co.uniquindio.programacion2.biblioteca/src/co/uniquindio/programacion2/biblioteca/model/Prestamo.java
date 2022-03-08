package co.uniquindio.programacion2.biblioteca.model;

public class Prestamo {

	
	private String fechaPrestamo;
	private String codigo;
	private String fechaDevolucion;
	private int valorPrestamo;
	
	private Estudiante estudiante;
	private Bibliotecario bibliotecario;
	
	
	private DetallePrestamo detallePrestamo1;
	private DetallePrestamo detallePrestamo2;
	

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
	public Prestamo(String fechaPrestamo, String codigo, String fechaDevolucion, int valorPrestamo,
			Estudiante estudiante, Bibliotecario bibliotecario) {
		this.fechaPrestamo = fechaPrestamo;
		this.codigo = codigo;
		this.fechaDevolucion = fechaDevolucion;
		this.estudiante = estudiante;
		this.bibliotecario = bibliotecario;
		this.valorPrestamo = valorPrestamo;
	}

	//Valor Prestamo
	public int getValorPrestamo() {
		return valorPrestamo;
	}

	public void setValorPrestamo(int valorPrestamo) {
		this.valorPrestamo = valorPrestamo;
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
	
	public DetallePrestamo getDetallePrestamo1() {
		return detallePrestamo1;
	}

	public void setDetallePrestamo1(DetallePrestamo detallePrestamo1) {
		this.detallePrestamo1 = detallePrestamo1;
	}

	public DetallePrestamo getDetallePrestamo2() {
		return detallePrestamo2;
	}

	public void setDetallePrestamo2(DetallePrestamo detallePrestamo2) {
		this.detallePrestamo2 = detallePrestamo2;
	}
	
	@Override
	public String toString() {
		return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", codigo=" + codigo + ", fechaDevolucion="
				+ fechaDevolucion + ", estudiante=" + estudiante + ", detallePrestamo1=" + detallePrestamo1
				+ ", detallePrestamo2=" + detallePrestamo2 + "]";
	}

	//Prestamo prestamo Asociado
	public boolean verificarEstudianteAsociado(String nombre, String identificacion) {
		
		boolean estudianteVerificado = false;
		
		if(estudiante != null){
			
			estudianteVerificado = estudiante.validarDatos(nombre,identificacion);
			if(estudianteVerificado == true)
			{
				return true;
			}else{
				return false;
			}
		}
		return false;
		
	}
 
	//Cantidad libros
	public int consultarCantidadLibros(String editorial) {
		
		int cantidadLibros = 0;
		
		if(detallePrestamo1 != null){
			
			cantidadLibros = detallePrestamo1.consultarCantidadLibros(editorial);
		}
		
		if(detallePrestamo2 != null){
			
			cantidadLibros += detallePrestamo2.consultarCantidadLibros(editorial);
		}
		
		return cantidadLibros;
	}
	
	//obtenerPrestamoLibro
	public boolean obtenerPrestamoLibro(String nombre) {
		boolean prestamoVerificado = false;
		boolean estudianteVerificado = false;
		
		if (detallePrestamo1!=null) {
			prestamoVerificado = detallePrestamo1.obtenerPrestamoLibro(nombre);
			estudianteVerificado = prestamoEstudiante();
			
			if (prestamoVerificado == true && estudianteVerificado == true) {
				return true;
			}
			else{
				return false;
			}
		}
		
		if (detallePrestamo2!=null) {
			prestamoVerificado = detallePrestamo2.obtenerPrestamoLibro(nombre);
			estudianteVerificado = prestamoEstudiante();
			
			if (prestamoVerificado == true && estudianteVerificado == true) {
				return true;
			}
			else{
				return false;
			}
		}
		
		return prestamoVerificado;
	}
	
	//Prestamo Estudiante por Modalidad
	public boolean prestamoEstudiante() {
		
		boolean modalidadVerificada = false;
		
		if (estudiante!=null) {
			
			modalidadVerificada = estudiante.validarModalidad();
			
			if(modalidadVerificada==true){
				return true;
			}
			else{
				return false;
			}
		}
		
		return modalidadVerificada;
		
	}

	
	//VerificarPrestamo
	public boolean verificarPrestamosPorFechaTitulo(String fecha, String titulo){
		
		boolean prestamoVerifcado = false;
		boolean fechaVerificada = false;
		
		fechaVerificada = verificarFecha(fecha);
		
		if (fechaVerificada == true) {
			
			if (detallePrestamo1 != null) {
				prestamoVerifcado= detallePrestamo1.verificarCantidadTitulo(titulo);
				
				if (prestamoVerifcado == true)
					return true;
			}
			
			if (detallePrestamo2 != null) {
				prestamoVerifcado = detallePrestamo2.verificarCantidadTitulo(titulo);
				if (prestamoVerifcado == true)
					return true;
			}
		}
		
		return prestamoVerifcado;
	}

	//VerificarFecha parte 1
	private boolean verificarFecha(String fecha) {
		
		if(this.fechaPrestamo.equalsIgnoreCase(fecha))
			return true;
		
		else
			return false;
	}
 
	/**
	 * Verificar Prestamo Libro
	 * @param isbn
	 * @param fechaPrestamo
	 * @return
	 */
	public boolean verificarPrestamosPorIdLibro(String isbn, String fechaPrestamo) {
		
		boolean prestamoVerifcado = false;
		boolean fechaVerificada = false;
		
		fechaVerificada = verificarFecha(fechaPrestamo);
		
		if(bibliotecario != null) {
			if (fechaVerificada == true) {
				
				if (detallePrestamo1 != null) {
					prestamoVerifcado= detallePrestamo1.verificarIdLibro(isbn);
					
					if (prestamoVerifcado == true)
						return true;
				}
				
				if (detallePrestamo2 != null) {
					prestamoVerifcado = detallePrestamo2.verificarIdLibro(isbn);
					if (prestamoVerifcado == true)
						return true;
				}
			}
		}
		
		return prestamoVerifcado;
	}
}
