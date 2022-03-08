package co.edu.uniquindio.model;

public class Administrador extends Persona {

	private String estudio;

	public Administrador() {

	}

	public Administrador(String nombre, String identificacion, String telefono, String estudio) {

		this.nombre = nombre;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.estudio = estudio;

	}

	public Administrador(String nombre, String identificacion, String telefono, String direccion,
			String fechaNacimiento, String correo, String estudio) {
		super(nombre, identificacion, telefono, direccion, fechaNacimiento, correo);
		this.estudio = estudio;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	@Override
	public String toString() {
		return "Administrador [estudio=" + estudio + ", identificacion=" + identificacion + ", nombre=" + nombre
				+ ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo
				+ ", telefono=" + telefono + ", getEstudio()=" + getEstudio() + ", getIdentificacion()="
				+ getIdentificacion() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getCorreo()=" + getCorreo() + ", getTelefono()="
				+ getTelefono() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
