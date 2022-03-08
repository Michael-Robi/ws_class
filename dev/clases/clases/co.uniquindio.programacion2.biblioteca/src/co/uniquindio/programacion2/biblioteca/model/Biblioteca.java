package co.uniquindio.programacion2.biblioteca.model;


/**
 * Clase Biblioteca
 * @author Admin
 * 
 */
public class Biblioteca {

	//------------LISTA DE ATRIBUTOS
	private String nombre;
	private String direccion;
	
	private Libro libro1;
	private Libro libro2;
	
	private Prestamo prestamo1;
	private Prestamo prestamo2;
	
	private Estudiante estudiante1;
	private Estudiante estudiante2;
	
	//Bibliotecarios
	private Bibliotecario bibliotecario1;
	private Bibliotecario bibliotecario2;
	//-----------------------------
	
	/**
	 * Metodo constructor de la clase Biblioteca
	 * @param nombre
	 * @param direccion
	 */
	public Biblioteca(String nombre,String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * Constructor vacio
	 */
	public Biblioteca() {
		
	}

	/**
	 * Metodo get del atributo nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * @return
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo direccion
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public Prestamo getPrestamo1() {
		return prestamo1;
	}

	public void setPrestamo1(Prestamo prestamo1) {
		this.prestamo1 = prestamo1;
	}

	public Prestamo getPrestamo2() {
		return prestamo2;
	}

	public void setPrestamo2(Prestamo prestamo2) {
		this.prestamo2 = prestamo2;
	}

	public Estudiante getEstudiante1() {
		return estudiante1;
	}

	public void setEstudiante1(Estudiante estudiante1) {
		this.estudiante1 = estudiante1;
	}

	public Estudiante getEstudiante2() {
		return estudiante2;
	}

	public void setEstudiante2(Estudiante estudiante2) {
		this.estudiante2 = estudiante2;
	}

	//Bibliotecarios

	public Bibliotecario getBibliotecario1() {
		return bibliotecario1;
	}

	public void setBibliotecario1(Bibliotecario bibliotecario1) {
		this.bibliotecario1 = bibliotecario1;
	}

	public Bibliotecario getBibliotecario2() {
		return bibliotecario2;
	}

	public void setBibliotecario2(Bibliotecario bibliotecario2) {
		this.bibliotecario2 = bibliotecario2;
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", libro1=" + libro1 + ", libro2=" + libro2
				+ ", prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2 + ", estudiante1=" + estudiante1
				+ ", estudiante2=" + estudiante2 + ", bibliotecario=" + bibliotecario1 + "]";
	}

	/**
	 * Crear un estudiante
	 * @param nombreEstudiante
	 * @param identificacionEstudiante
	 * @param direccionEstudiante
	 * @param telefonoEstudiante
	 * @return
	 */
	public String crearEstudiante(String nombreEstudiante, String identificacionEstudiante, String direccionEstudiante,
			String telefonoEstudiante) {

		String mensaje = "No es posible crear mas estudiantes";
		
		Modalidad arr[] = Modalidad.values();
		
		TipoDeDocumento TipoCC[] = TipoDeDocumento.values();
		
		boolean flagExiste = false;
		
		flagExiste = validarEstudianteExiste(identificacionEstudiante);
		
		if(flagExiste != true){
			
			if(estudiante1 == null ) {
				estudiante1 = new Estudiante(nombreEstudiante, identificacionEstudiante, direccionEstudiante, telefonoEstudiante, arr[0], TipoCC[0]);
				mensaje = "Estudiante creado con exito";
			}else {
				if(estudiante2 == null ) {
					estudiante2 = new Estudiante(nombreEstudiante, identificacionEstudiante, direccionEstudiante, telefonoEstudiante, arr[0], TipoCC[0]);
					mensaje = "Estudiante creado con exito";
				}
			}
			
		}else{
			mensaje = "El estudiante con numero de identificación: "+ identificacionEstudiante+" ya existe";
		}

		return mensaje;
	}
	
	private boolean validarEstudianteExiste(String identificacionEstudiante) {
		
		boolean flagExiste = false;
		
		if(estudiante1 != null && estudiante1.getIdentificacion().equals(identificacionEstudiante)){
			flagExiste = true;
		}
		
		if(estudiante2 != null && estudiante2.getIdentificacion().equals(identificacionEstudiante)){
			flagExiste = true;
		}
		
		return flagExiste;
	}



	/**
	 * Consultar un estudiante
	 * @param identificacionEstudiante
	 * @return
	 */
	public Estudiante consultarEstudiante( String identificacionEstudiante) {

		Estudiante estudianteEncontrado = null;
		if(estudiante1 != null ) {
			if(estudiante1.getIdentificacion().equals(identificacionEstudiante)) {
				estudianteEncontrado = estudiante1;
			}
		}
		if(estudianteEncontrado == null && estudiante2 != null ) {
			if(estudiante2.getIdentificacion().equals(identificacionEstudiante)) {
				estudianteEncontrado = estudiante2;
			}
		}

		return estudianteEncontrado;
	}
	
	/**
	 * Eliminar estudiante
	 * @param identificacionEstudiante
	 * @return
	 */
	public String eliminarEstudiante( String identificacionEstudiante) {
		String mensaje = "Estudiante no eliminado";
		Estudiante estudianteEncontrado = null;
		
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);
		if(estudianteEncontrado != null) {
			if(estudiante1 == estudianteEncontrado) {
				estudiante1 = null;
				mensaje = "Estudiante eliminado";
			}else {
				if(estudiante2 == estudianteEncontrado) {
					estudiante2 = null;
					mensaje = "Estudiante eliminado";
				}
			}
		}
		return mensaje;
	}
	/**
	 * Actualizar estudiante
	 * @param identificacionEstudiante
	 * @return
	 */
	public String actualizarEstudiante( String identificacionEstudiante,String nombreEstudiante, String direccionEstudiante,
			String telefonoEstudiante) {
		String mensaje = "Estudiante no actualizado";
		Estudiante estudianteEncontrado = null;
		
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante );
		if(estudianteEncontrado != null) {
			estudianteEncontrado.setNombre(nombreEstudiante);
			estudianteEncontrado.setDireccion(direccionEstudiante);
			estudianteEncontrado.setTelefono(telefonoEstudiante);
			mensaje = "Estudiante actualizado";
		}
		return mensaje;
	}
	
	//obtener Prestamo
	public String obtenerPrestamoEstudiante(String nombre, String identificacion) { //Buscar datos
		
		String prestamo = "";
		
		if(prestamo1 != null){ //Si existe prestamo
			
			if(prestamo1.verificarEstudianteAsociado(nombre,identificacion) == true){
				return prestamo = prestamo1.getCodigo();
			}
		}
		
		if(prestamo2 != null){
			
			if(prestamo2.verificarEstudianteAsociado(nombre,identificacion) == true){
				return prestamo = prestamo2.getCodigo();
			}
		}
		
		return prestamo;
	}
	
	/**
	 * Consultar la cantidad de libros de la editorial “Uniquindio”
	 * que han sido prestados  en la biblioteca y su título empiece por una vocal. 
	 * @param editorial
	 * @return
	 */
	public int consultarCantidadLibros(String editorial) {
		
		int cantidadLibros = 0;
		
		if(prestamo1 != null){
			cantidadLibros = prestamo1.consultarCantidadLibros(editorial);
		}
		
		
		if(prestamo2 != null){
			cantidadLibros += prestamo2.consultarCantidadLibros(editorial);
		}
		
		return cantidadLibros;
	}
	
	
	//Consultar los estudiantes de modalidad Distancia que hayan prestado el libro de programacion 2.
	public String obtenerPrestamoLibro(String nombre) {
		
		String prestamoEstudiante = "";
		
		boolean presmoVerificado=false;
		
		if (prestamo1!=null) {
			presmoVerificado = prestamo1.obtenerPrestamoLibro(nombre);
			
			if (presmoVerificado==true) {
				
				if (estudiante1!=null) {
					prestamoEstudiante = prestamo1.getEstudiante().getNombre()+" ";
				}
				
				if (estudiante2!=null) {
					prestamoEstudiante = prestamo1.getEstudiante().getNombre()+" ";
				}
				
			} 
		}
		
		if (prestamo2!=null) {
			presmoVerificado = prestamo2.obtenerPrestamoLibro(nombre);
			
			if (presmoVerificado==true) {
				
				if (estudiante1!=null) {
					prestamoEstudiante += prestamo2.getEstudiante().getNombre();
				}
				
				if (estudiante2!=null) {
					prestamoEstudiante += prestamo2.getEstudiante().getNombre();
				}
				
			} 
		}
		
		return prestamoEstudiante;
	}
	
	//ConsultarCantidadLibros
	public int cantidadDeLibrosDisponibles() {
		int verificarCantidad = 0;
		int cantidadLibros = 0;
		
		if(libro1!=null){
			verificarCantidad = libro1.getCantidadDisponible();
			
			if (verificarCantidad > 0) {
				cantidadLibros = verificarCantidad;
			}
		}
		
		if(libro2!=null){
			verificarCantidad = libro2.getCantidadDisponible();
			
			if (verificarCantidad > 0) {
				cantidadLibros += verificarCantidad;
			}
		}
		
		return cantidadLibros;
	}
	
	//Consultar los préstamos realizados en una fecha indicada por el usuario y que se hayan prestado al menos 10 libros con el título indicado por el usuario.
	public String consultarPrestamosporFechaTitulo(String fecha, String titulo) {
		
		String prestamos = "";
		
		if (prestamo1 != null) {
			if (prestamo1.verificarPrestamosPorFechaTitulo(fecha, titulo) == true){
				prestamos += prestamo1.toString();
			}
		}
		
		if (prestamo2 != null) {
			if (prestamo2.verificarPrestamosPorFechaTitulo(fecha, titulo) == true) {
				prestamos += prestamo2.toString();
			}
		}
		
		return prestamos;
	}
	
	/**
	 * Devolver la información del bibliotecario que haya realizado un préstamo de un libro dado el isbn del libro 
	 * y la fecha de entrega sea el 11-10-21. 
	 * @param isbn
	 * @param fechaPrestamo
	 * @return
	 */
	public String consultarPrestamoIdLibro(String isbn, String fechaPrestamo) {
		String prestamos = "";
		
		fechaPrestamo = "11-10-21";
		
		//prestamo 1 bibliotecario
		
		String bibliotecario = "";
		
		if (prestamo1 != null) {
			if (prestamo1.verificarPrestamosPorIdLibro(isbn, fechaPrestamo) == true){
				prestamos += prestamo1.toString();
			}
		}
		
		if (prestamo2 != null) {
			if (prestamo2.verificarPrestamosPorIdLibro(isbn, fechaPrestamo) == true) {
				prestamos += prestamo2.toString();
			}
		}
		
		return prestamos;
	}
}






