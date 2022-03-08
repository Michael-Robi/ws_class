package co.uniquindio.programacion2.biblioteca.model;

public enum Modalidad {
	
	PRESENCIAL(0), DISTANCIA(1);
	
	private int enumModalidad;
	
	private Modalidad(int enumModalidad) {
		this.enumModalidad = enumModalidad;
	}

	public int getEnumModalidad() {
		return enumModalidad;
	}

	public void setEnumModalidad(int enumModalidad) {
		this.enumModalidad = enumModalidad;
	}
	
}
