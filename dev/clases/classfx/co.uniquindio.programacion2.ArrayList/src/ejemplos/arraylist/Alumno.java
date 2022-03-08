package ejemplos.arraylist;

public class Alumno {


	private int id;
	private String nombre;
	private String sexo;
	private int edad;
	private double parcial1;
	private double parcial2;
	private double promedio;
	private String carrera;


	public Alumno(int id, String nombre, String sexo, int edad, double parcial1, double parcial2, double promedio,
			String carrera) {

		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.promedio = promedio;
		this.carrera = carrera;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getParcial1() {
		return parcial1;
	}


	public void setParcial1(double parcial1) {
		this.parcial1 = parcial1;
	}


	public double getParcial2() {
		return parcial2;
	}


	public void setParcial2(double parcial2) {
		this.parcial2 = parcial2;
	}


	public double getPromedio() {
		return promedio;
	}


	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", parcial1="
				+ parcial1 + ", parcial2=" + parcial2 + ", promedio=" + promedio + ", carrera=" + carrera + "]";
	}


	public boolean nombre(Alumno alumno) {
		boolean respuesta = true;
		char nan;
		
		nan = alumno.getNombre().charAt(0);
		
		
		return respuesta;
	}
}
