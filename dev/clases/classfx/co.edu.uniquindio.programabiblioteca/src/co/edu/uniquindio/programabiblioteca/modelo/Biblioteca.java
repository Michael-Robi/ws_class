package co.edu.uniquindio.programabiblioteca.modelo;

public class Biblioteca {
	
	//Declaracion de Variables
	private String nombre;
	private int nit;

	/**
	 * Este es el metodo constructor de la clase Biblioteca
	 * @param nombre
	 * @param nit
	 */
	public Biblioteca(String nombre, int nit) {
		this.nombre = nombre;
		this.nit = nit;
	}
	
	//Metodos get y set
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNit() {
		return nit;
	}
	
	public void setNit(int nit) {
		this.nit = nit;
	}
}
