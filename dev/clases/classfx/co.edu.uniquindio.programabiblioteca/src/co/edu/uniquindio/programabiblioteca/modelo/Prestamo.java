package co.edu.uniquindio.programabiblioteca.modelo;

public class Prestamo {
	//Declaracion de Variables
	String codigoPrestamo;
	String fechaPrestamo;
	
	/**
	 * Este es el metodo constructor de la clase Prestamo
	 * @param codigoPrestamo
	 * @param fechaPrestamo
	 */
	public Prestamo(String codigoPrestamo, String fechaPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
		this.fechaPrestamo = fechaPrestamo;
	}

	//Metodos get y set
	public String getCodigoPrestamo() {
		return codigoPrestamo;
	}

	public void setCodigoPrestamo(String codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	@Override
	public String toString() {
		return "Prestamo [codigoPrestamo=" + codigoPrestamo + ",fechaPrestamo=" + fechaPrestamo + "]";
	}
}
