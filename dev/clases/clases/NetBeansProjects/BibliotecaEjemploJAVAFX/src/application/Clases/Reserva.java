package application.Clases;

public class Reserva {
	private String identificacion;
	private Libro libro;
	private Estudiante estudiante;
	private String nombreBibliotecario;
	
	public Reserva() {
		
	}

	public Reserva(String identificacion, Libro libro, Estudiante estudiante, String nombreBibliotecario) {
		this.identificacion = identificacion;
		this.libro = libro;
		this.estudiante = estudiante;
		this.nombreBibliotecario = nombreBibliotecario;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getNombreBibliotecario() {
		return nombreBibliotecario;
	}

	public void setNombreBibliotecario(String nombreBibliotecario) {
		this.nombreBibliotecario = nombreBibliotecario;
	}

	@Override
	public String toString() {
		return "Reserva [identificacion=" + identificacion + ", libro=" + libro + ", estudiante=" + estudiante
				+ ", nombreBibliotecario=" + nombreBibliotecario + "]";
	}
}
