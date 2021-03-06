package co.edu.uniquindio.model;

import java.util.ArrayList;

public class Cliente extends Persona {
	
	private String nombre;
	private String identificacion;
	private String telefono;
	private String ciudad;
	private String departamento;
	
	public Cliente(){
		
		
	}
	
	public Cliente(String nombre, String identificacion, String telefono){
		
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.telefono = telefono;
	}
	
	public Cliente(String nombre, String identificacion, String telefono,String direccion, String fechaNacimiento, String correo,
			String ciudad, String departamento){
		super(nombre,identificacion,telefono,direccion,fechaNacimiento,correo);
		this.ciudad = ciudad;
		this.departamento = departamento;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

	/**
	 * @return the nombre
	 */
//	public String getNombre() {
//		return nombre;
//	}
//
//	/**
//	 * @param nombre the nombre to set
//	 */
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	/**
//	 * @return the identificacion
//	 */
//	public String getIdentificacion() {
//		return identificacion;
//	}
//
//	/**
//	 * @param identificacion the identificacion to set
//	 */
//	public void setIdentificacion(String identificacion) {
//		this.identificacion = identificacion;
//	}
//
//	/**
//	 * @return the telefono
//	 */
//	public String getTelefono() {
//		return telefono;
//	}
//
//	/**
//	 * @param telefono the telefono to set
//	 */
//	public void setTelefono(String telefono) {
//		this.telefono = telefono;
//	}
//	
	

}
