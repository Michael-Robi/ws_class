package co.uniquindio.programacion2.biblioteca.model;

public class Bibliotecario {

	private String nombre;
	private String identificacion;
	private String direccion;
	private String telefono;
	private String experiencia;
	
	
	public Bibliotecario(String nombre, String identificacion, String direccion, String telefono, String experiencia) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.experiencia = experiencia;
	}


   //Años de Experiencia
	public String getExperiencia() {
		return experiencia;
	}



	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
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

	
	
}
