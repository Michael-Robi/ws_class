package co.uniquindio.edu.parqueadero.model;

public class RegistroParqueo {

	// ---------------------------------------------------------------------------
	// ATRIBUTOS
	// ---------------------------------------------------------------------------

	private Vehiculo vehiculo;
	private Puesto puesto;
	private String fecha;
	private String horaLlegada;
	private String horaSalida;
	private double total;

	// ---------------------------------------------------------------------------
	// CONSTRUCTOR
	// ---------------------------------------------------------------------------

	public RegistroParqueo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor clase RegistroParqueo
	 * 
	 * @param vehiculo
	 * @param puesto
	 * @param fecha
	 * @param horaLlegada
	 * @param horaSalida
	 * @param total
	 */
	public RegistroParqueo(Vehiculo vehiculo, Puesto puesto, String fecha, String horaLlegada, String horaSalida,
			double total) {
		super();
		this.vehiculo = vehiculo;
		this.puesto = puesto;
		this.fecha = fecha;
		this.horaLlegada = horaLlegada;
		this.horaSalida = horaSalida;
		this.total = total;
	}

	// ---------------------------------------------------------------------------
	// METODOS SET Y GET
	// ---------------------------------------------------------------------------

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "RegistroParqueo [vehiculo=" + vehiculo + ", puesto=" + puesto + ", fecha=" + fecha + ", horaLlegada="
				+ horaLlegada + ", horaSalida=" + horaSalida + ", total=" + total + "]";
	}

	public boolean verificarVehiculo(String placa) {

		if (getVehiculo() != null && getVehiculo().getPlaca().equals(placa)) {
			return true;
		}
		return false;
	}

	public String obtenerPuesto() {
		String mensaje = "";

		if (!puesto.getNumero().equals("")) {
			mensaje = "" + puesto.getNumero();
		}

		return mensaje;
	}

	public boolean validarTipoCarro() {

		if (this.puesto != null) {

			if (puesto.getTipoVehiculo() == TipoVehiculo.CARRO)
				return true;
		}

		return false;
	}

	public TipoVehiculo obtenerTipoVehiculo() {

		if (this.vehiculo != null) {

			return this.vehiculo.getTipoVehiculo();
		}
		return null;
	}

}
