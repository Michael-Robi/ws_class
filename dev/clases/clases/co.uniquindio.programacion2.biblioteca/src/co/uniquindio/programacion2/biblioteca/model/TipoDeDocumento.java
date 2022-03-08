package co.uniquindio.programacion2.biblioteca.model;

public enum TipoDeDocumento {
	
	TARJETA_IDENTIDAD(0), CEDULA_CIUDADANIA(1), PASAPORTE(2);
	
	private int enumModalidad;
	
	private TipoDeDocumento(int enumModalidad) {
		this.enumModalidad = enumModalidad;
	}

	public int getEnumModalidad() {
		return enumModalidad;
	}

	public void setEnumModalidad(int enumModalidad) {
		this.enumModalidad = enumModalidad;
	}
	
}
