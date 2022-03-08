package co.edu.uniquindio.programabiblioteca.modelo;

/**
 * 
 * @author Michael Steven
 *
 */
public class Bibliotecario {
	
	//Declaracion de Variables
	private String nombre;
	private String apellido;
	private int identificacion;
	private String email;
	private String telefono;
	private String sexo;
	private String carnet;
	
	/**
	 * Este es el metodo constructor de la clase Biblioteca
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param email
	 * @param telefono
	 * @param sexo
	 * @param carnet
	 */
	public Bibliotecario(String nombre, String apellido, int identificacion, String email, String telefono, String sexo, String carnet) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.email = email;
		this.telefono = telefono;
		this.sexo = sexo;
		this.carnet = carnet;
	}
	
	//Metodos get y set
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

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
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

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Override 
	public String toString(){
		return "Bibliotecario [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", email=" + email + ", telefono=" + telefono + ", sexo=" + sexo + ", carnet=" + carnet + "]";
	}
	
}
