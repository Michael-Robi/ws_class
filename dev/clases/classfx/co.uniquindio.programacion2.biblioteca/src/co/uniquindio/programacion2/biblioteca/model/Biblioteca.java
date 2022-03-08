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
	
	private Bibliotecario bibliotecario;
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

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}


	
	



//	@Override
//	public String toString() {
//		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", libro1=" + libro1 + ", libro2=" + libro2
//				+ ", prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2 + ", estudiante1=" + estudiante1
//				+ ", estudiante2=" + estudiante2 + ", bibliotecario=" + bibliotecario + "]";
//	}



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
		
		boolean flagExiste = false;
		
		flagExiste = validarEstudianteExiste(identificacionEstudiante);
		// false  != true
		if (flagExiste != true) {
			
			if(estudiante1 == null ) {
				estudiante1 = new Estudiante(nombreEstudiante, identificacionEstudiante, direccionEstudiante, telefonoEstudiante);
 				mensaje = "Estudiante creado con exito";
			}else {
				if(estudiante2 == null ) {
					estudiante2 = new Estudiante(nombreEstudiante, identificacionEstudiante, direccionEstudiante, telefonoEstudiante);
					mensaje = "Estudiante creado con exito";
				}
			}	
			
		} else {
			mensaje = "El estudiante con numero de identificaci�n: "+identificacionEstudiante+" ya existe";
		}

		return mensaje;
	}
	
	private boolean validarEstudianteExiste(String identificacionEstudiante) {
		
		boolean flagExiste = false;
		
		if (estudiante1 != null && estudiante1.getIdentificacion().equals(identificacionEstudiante)) {
			flagExiste = true;
		}
		
		if(estudiante2 != null && estudiante2.getIdentificacion().equals(identificacionEstudiante)) {
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
	
	public Estudiante consultarEstudianteNombre(String identificacionEstudiante, String nombreEstudiante) {

		Estudiante estudianteEncontrado = null;
		
		if(estudiante1 != null ) {
			if(estudiante1.getIdentificacion().equals(identificacionEstudiante) && estudiante1.getNombre().equalsIgnoreCase(nombreEstudiante)) {
				estudianteEncontrado = estudiante1;
			}
		}
		if(estudianteEncontrado == null && estudiante2 != null ) {
			if(estudiante2.getIdentificacion().equals(identificacionEstudiante) && estudiante2.getNombre().equalsIgnoreCase(nombreEstudiante)) {
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
		
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);
		if(estudianteEncontrado != null) {
			estudianteEncontrado.setNombre(nombreEstudiante);
			estudianteEncontrado.setDireccion(direccionEstudiante);
			estudianteEncontrado.setTelefono(telefonoEstudiante);
			mensaje = "Estudiante actualizado";
		}
		return mensaje;
	}
	
	
	//prestamo
	public Prestamo obtenerPrestamoEstudiante(String nombre, String identificacion){ //Buscar datos
		
		Prestamo prestamoEncontrado = null;
		boolean flagExiste = false;
		
		if (prestamo1!=null) {//Si existe prestamo
			
			flagExiste = prestamo1.verificarEstudianteAsociado(nombre,identificacion);
			
			if (flagExiste == true) {
				prestamoEncontrado = prestamo1;
			}
			
		} 
		
		if( prestamo2!=null) {
			
			flagExiste = prestamo2.verificarEstudianteAsociado(nombre,identificacion);
			if (flagExiste == true) {
				prestamoEncontrado = prestamo2;
			}
		}
		
		return prestamoEncontrado;
	}
	
	/**
	 * Crear bibliotecario
	 * @param nombre
	 * @param identificacion
	 * @param direccion
	 * @param telefono
	 * @return
	 */
	public String crearBibliotecario(String nombre, String identificacion, String direccion, String telefono){
		
		String mensaje = "No es posible crear mas registros";
		
		boolean flagExiste = false;
		
		flagExiste = validarBibliotecarioExistente(identificacion);
		
		if (flagExiste != true) {
			if (bibliotecario == null) {
				bibliotecario = new Bibliotecario(nombre, identificacion, direccion, telefono);
				mensaje = "Bibliotecario Creado con exito";
			}
		}
		
		else{
			mensaje = "El Bibliotecario con identificacion "+identificacion+" ya existe";
		}
		
		return mensaje;
	}
	
	/**
	 * Eliminar bibliotecario
	 * @param identificacion
	 * @return
	 */
	public String eliminarBibliotecario(String identificacion){
		String mensaje = "No es posible eliminar el registro";
		
		Bibliotecario bibliotecarioEncontrado = null;
		
		bibliotecarioEncontrado = consultarBibliotecario(identificacion);
		
		if (bibliotecarioEncontrado != null) {
			if (bibliotecario == bibliotecarioEncontrado) {
				bibliotecario=null;
				mensaje = "Registro eliminado";
			}
		}
		
		return mensaje;
	}
	
	/**
	 * Actualizar bibliotecario
	 * @param identificacionEstudiante
	 * @return
	 */
	public String actualizarBibliotecario(String nombre, String identificacion, String direccion, String telefono){
		
		String mensaje = "Registro no Actualizado";
		
		Bibliotecario bibliotecarioEncontrado = null;
		
		bibliotecarioEncontrado = consultarBibliotecario(identificacion);
		
		if (bibliotecarioEncontrado != null) {
			bibliotecarioEncontrado.setNombre(nombre);
			bibliotecarioEncontrado.setDireccion(direccion);
			bibliotecarioEncontrado.setTelefono(telefono);
			mensaje = "Registro Actualizado";
		}
		
		return mensaje;
		
	}
	
	/**
	 * Consultar un bibliotecario
	 * @param identificacionEstudiante
	 * @return
	 */
	public Bibliotecario consultarBibliotecario(String identificacion){
		
		Bibliotecario bibliotecarioEncontrado = null;
		
		if (bibliotecario != null){  
			if(bibliotecario.getIdentificacion().equals(identificacion)) {
				bibliotecarioEncontrado=bibliotecario;
			}
		}
		
		return bibliotecarioEncontrado;
	}
	
	private boolean validarBibliotecarioExistente(String identificacion){
		
		boolean flagExiste = false;
		
		if (bibliotecario!=null && bibliotecario.getIdentificacion().equals(identificacion)) {
			return flagExiste = true;
		}

		return flagExiste;
	
	}
	
}
