package co.uniquindio.edu.parqueadero.model;

public class Vehiculo {

	// ---------------------------------------------------------------------------
	// ATRIBUTOS
	// ---------------------------------------------------------------------------

	private String placa;
	private String modelo;
	private TipoVehiculo tipoVehiculo;
	private Propietario propietario;

	// ---------------------------------------------------------------------------
	// CONSTRUCTOR
	// ---------------------------------------------------------------------------

	public Vehiculo() {

	}

	/**
	 * Metodo constructor clase vehiculo
	 * 
	 * @param placa
	 * @param modelo
	 */

	public Vehiculo(String placa, String modelo, TipoVehiculo tipoVehiculo, Propietario propietario) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.propietario = propietario;
	}

	// ---------------------------------------------------------------------------
	// METODOS SET Y GET
	// ---------------------------------------------------------------------------

	public String getPlaca() {
		return placa;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", tipoVehiculo=" + tipoVehiculo + ", propietario="
				+ propietario + "]";
	}

	public boolean buscarPlaca(String placa) {
		boolean respuesta = false;

		if (this.placa.equalsIgnoreCase(placa)) {
			respuesta = true;
		}

		return respuesta;
	}

	public boolean validarPlacaVehiculoMayor(String modelo) {
		boolean respuesta = false;

		if (Integer.parseInt(this.modelo) > Integer.parseInt(modelo)) {
			respuesta = true;
		}

		return respuesta;
	}

	public boolean vehiculoMenorModelo(String modelo) {
		boolean respuesta = false;

		if (Integer.parseInt(this.modelo) < Integer.parseInt(modelo)) {
			respuesta = true;
		}

		return respuesta;
	}

	public boolean validarPlacaVehiculoMayorYMenor(String modeloMenor, String modeloMayor) {
		boolean respuesta = false;

		if (Integer.parseInt(this.modelo) > Integer.parseInt(modeloMenor)
				&& Integer.parseInt(this.modelo) < Integer.parseInt(modeloMayor)) {
			respuesta = true;
		}

		return respuesta;
	}

	public boolean veficarNombrePropietario(String nombre) {
		Propietario propietario = getPropietario();
		boolean respuesta = false;

		if (propietario != null) {
			if (propietario.getNombre().equalsIgnoreCase(nombre)) {
				respuesta = true;
			}
		}

		return respuesta;
	}
}
