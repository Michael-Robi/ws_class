package co.uniquindio.edu.parqueadero.model;

/**
 * Clase propietario
 * 
 * @author Admin
 *
 */
public class Propietario {

	// ---------------------------------------------------------------------------
	// ATRIBUTOS
	// ---------------------------------------------------------------------------

	private String nombre;
	private String identificacion;
	private String telefono;

	// ---------------------------------------------------------------------------
	// CONSTRUCTOR
	// ---------------------------------------------------------------------------

	/**
	 * Constructor de la clase propietario
	 */
	public Propietario() {

	}

	/**
	 * Constructor
	 * 
	 * @param nombre
	 * @param identificacion
	 * @param telefono
	 */
	public Propietario(String nombre, String identificacion, String telefono) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.telefono = telefono;
	}

	// ---------------------------------------------------------------------------
	// METODOS SET Y GET
	// ---------------------------------------------------------------------------

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propietario other = (Propietario) obj;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", identificacion=" + identificacion + ", telefono=" + telefono + "]";
	}

	public boolean validarPlaca(String identificacionPropietario) {
		boolean respuesta = false;

		if (this.identificacion.equalsIgnoreCase(identificacionPropietario)) {
			respuesta = true;
		}

		return respuesta;
	}

}
