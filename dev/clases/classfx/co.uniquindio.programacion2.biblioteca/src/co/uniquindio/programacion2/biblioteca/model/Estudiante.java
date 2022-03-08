package co.uniquindio.programacion2.biblioteca.model;

/**
 * 
 * @author Admin
 *
 */
public class Estudiante {

	
	private String nombre;
	private String identificacion;
	private String direccion;
	private String telefono;
	
	
	public Estudiante(String nombre, String identificacion, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String toString () {
		String cadenaEstudiante = "";
		
		cadenaEstudiante = "Mi nombre es " + nombre + ", mi identificacion es " +
				identificacion + ",  vivo en " + direccion + ", mi telefono es " + telefono;
		
		return cadenaEstudiante;
	}

	//consultar datos del Estudiante
	public Boolean validarDatos(String nombre, String identificacion) {

		if (this.nombre.equalsIgnoreCase(nombre) && this.identificacion.equals(identificacion)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
