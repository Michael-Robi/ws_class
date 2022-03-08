package co.edu.uniquindio.model;

public class Sede {
	
	private String nombre;
	private String id;
	
	public Sede(String nombre, String id) {
		this.nombre= nombre;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
	    return getNombre() + " - " + getId();
	}
	
}
