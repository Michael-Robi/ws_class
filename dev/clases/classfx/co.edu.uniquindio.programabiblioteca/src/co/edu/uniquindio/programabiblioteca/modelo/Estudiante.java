package co.edu.uniquindio.programabiblioteca.modelo;

public class Estudiante {
	
	//Declaracion de Variables
	private int codigo;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String sexo;

	/**
	 * Este es el metodo constructor de la clase Estudiante
	 * @param codigo
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param telefono
	 * @param sexo
	 */
	public Estudiante(int codigo, String nombre, String apellido, String email, String telefono, String sexo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.sexo = sexo;
	}
	
	//Metodos get y set
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "\nEstudiante [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ",\nemail=" + email
				+ ", telefono=" + telefono + ", sexo=" + sexo + "]\n";
	}
}
