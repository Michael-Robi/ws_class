package co.uniquindio.edu.parqueadero.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.uniquindio.edu.parqueadero.exception.VehiculoException;

/**
 * Clase parqueadero
 * 
 * @author Admin
 *
 */
public class Parqueadero {

	// ---------------------------------------------------------------------------
	// ATRIBUTOS
	// ---------------------------------------------------------------------------
	private String nombre;
	private Puesto listaPuestos[][];
	private Vehiculo[] listaVehiculos;
	private Propietario[] listaPropietarios;
	private RegistroParqueo[] listaRegistroParqueo;

	/**
	 * Constructor de la clase parqueadero
	 */
	public Parqueadero(String nombre, int tamanioPuestos, int numVehiculos, int numPropietarios, int numRegistrosParqueo) {
		listaPuestos = new Puesto[tamanioPuestos][tamanioPuestos];
		listaVehiculos = new Vehiculo[numVehiculos];
		listaPropietarios = new Propietario[numPropietarios];
		listaRegistroParqueo = new RegistroParqueo[numRegistrosParqueo];

		this.nombre = nombre;

		inicilializarPuestos();
	}

	private void inicilializarPuestos() {

		int valor = 1;

		for (int i = 0; i < listaPuestos.length; i++) {
			for (int j = 0; j < listaPuestos.length; j++) {
				if (i % 2 == 0) {

					listaPuestos[i][j] = new Puesto("" + valor, "Disponible", 2000, TipoVehiculo.CARRO);
				} else {
					listaPuestos[i][j] = new Puesto("" + valor, "Disponible", 1000, TipoVehiculo.MOTO);
				}

				valor++;
			}
		}
	}

	// ---------------------------------------------------------------------------
	// METODOS SET Y GET
	// ---------------------------------------------------------------------------

	public Puesto[][] getListaPuestos() {
		return listaPuestos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaPuestos(Puesto[][] listaPuestos) {
		this.listaPuestos = listaPuestos;
	}

	// -----------------------------------------------------------------------------
	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public Propietario[] getListaPropietarios() {
		return listaPropietarios;
	}

	public void setListaPropietarios(Propietario[] listaPropietarios) {
		this.listaPropietarios = listaPropietarios;
	}

	public RegistroParqueo[] getListaRegistroParqueo() {
		return listaRegistroParqueo;
	}

	public void setListaRegistroParqueo(RegistroParqueo[] listaRegistroParqueo) {
		this.listaRegistroParqueo = listaRegistroParqueo;
	}

	public String mostrarPuestos() {
		String mensaje = "";

		for (int i = 0; i < listaPuestos.length; i++) {
			for (int j = 0; j < listaPuestos[i].length; j++) {
				mensaje += listaPuestos[i][j] + "\n";
			}
		}

		return mensaje;
	}

	public String mostrarRegistroParqueo() {
		String mensaje = "";

		for (int i = 0; i < listaRegistroParqueo.length; i++) {
			mensaje += listaRegistroParqueo[i];
		}

		return mensaje;
	}

	@Override
	public String toString() {
		return "Parqueadero [listaPuestos=" + Arrays.toString(listaPuestos) + ", listaVehiculos="
				+ Arrays.toString(listaVehiculos) + ", listaPropietarios=" + Arrays.toString(listaPropietarios)
				+ ", listaRegistroParqueo=" + Arrays.toString(listaRegistroParqueo) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parqueadero other = (Parqueadero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * Metodo crearVehiculo
	 * 
	 * @param placa
	 * @param modelo
	 * @param tipoVehiculo
	 * @param identificacionPropietario
	 * @throws VehiculoException
	 */

	public String crearVehiculo(String placa, String modelo, TipoVehiculo tipoVehiculo, String identificacionPropietario)
			throws VehiculoException {

		// Crear variables
		Vehiculo vehiculoEncontrado = null;
		Propietario propietario = null;
		String resultado = "No puede registrar mas Vehiculos";
		int posicion = -1;

		// 1. buscar el vehiculo
		vehiculoEncontrado = obtenerVehiculo(placa);
		if (vehiculoEncontrado == null) {

			// 2. Obtener el propietario
			propietario = obtenerPropietario(identificacionPropietario);

			if (propietario != null) {

				// 3. Obtener posicion disponible
				posicion = obtenerPosicionDisponibleVehiculo();

				if (posicion != -1) {

					// Vehiculo vehiculo = new Vehiculo(placa, modelo, tipoVehiculo, propietario);
					Vehiculo vehiculo = new Vehiculo();
					vehiculo.setPlaca(placa);
					vehiculo.setModelo(modelo);
					vehiculo.setTipoVehiculo(tipoVehiculo);
					vehiculo.setPropietario(propietario);

					listaVehiculos[posicion] = vehiculo;
					resultado = "Vehiculo registrado" + listaVehiculos[posicion];

				} else {
					throw new VehiculoException("No existe cupo para crear el vehiculo");
				}

			} else {
				throw new VehiculoException("No existe un propietario para crear el vehiculo");
			}

		} else {
			throw new VehiculoException("El vehiculo ya se encuentra registrado");
		}

		return resultado;

	}

	private Vehiculo obtenerVehiculo(String placa) {

		Vehiculo vehiculo = null;
		Vehiculo vehiculoEncontrado = null;

		for (int i = 0; i < listaVehiculos.length; i++) {

			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {

				if (vehiculo.buscarPlaca(placa)) {
					vehiculoEncontrado = vehiculo;
					break;
				}
			}
		}

		return vehiculoEncontrado;
	}

	public boolean buscarVehiculo(String placa) {
		Vehiculo vehiculo = null;
		boolean vehiculoEncontrado = false;

		for (int i = 0; i < listaVehiculos.length; i++) {

			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {
				if (vehiculo.buscarPlaca(placa)) {
					vehiculoEncontrado = true;
					break;
				}
			}
		}

		return vehiculoEncontrado;
	}

	public void eliminarVehiculo(String placa) throws VehiculoException {
		int posicion = obtenerPosicionVehiculo(placa);

		if (posicion != -1) {
			listaVehiculos[posicion] = null;
		} else {
			throw new VehiculoException("El vehiculo no se encuentra en la lista");
		}
	}

	private Propietario obtenerPropietario(String identificacionPropietario) {
		// arreglo
		Propietario propietario = null;

		for (int i = 0; i < listaPropietarios.length; i++) {

			if (listaPropietarios[i] != null) {
				if (listaPropietarios[i].validarPlaca(identificacionPropietario)) {
					propietario = listaPropietarios[i];
					break;
				}
			}
		}

		return propietario;
	}

	private int obtenerPosicionDisponibleVehiculo() {
		int posicion = -1;

		for (int i = 0; i < listaVehiculos.length; i++) {

			if (listaVehiculos[i] == null) {
				posicion = i;
				break;
			}
		}

		return posicion;
	}

	private int obtenerPosicionVehiculo(String placa) {
		Vehiculo vehiculo = null;
		int posicion = -1;

		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {
				if (vehiculo.buscarPlaca(placa)) {
					posicion = i;
					break;
				}
			}

		}

		return posicion;
	}

	public String crearPropietario(String nombre, String identificacion, String telefono) {
		String mensaje = "No puede registrar mas propietarios";
		int posicion = -1;

		posicion = obtenerPosicionDisponiblePropietario();

		if (posicion != -1) {
			Propietario propietario = new Propietario();
			propietario.setIdentificacion(identificacion);
			propietario.setNombre(nombre);
			propietario.setTelefono(telefono);

			listaPropietarios[posicion] = propietario;
			mensaje = "Propietario Registrado" + listaPropietarios[posicion];
		}

		return mensaje;
	}

	private int obtenerPosicionDisponiblePropietario() {
		Propietario propietario = null;
		int posicion = -1;

		for (int i = 0; i < listaPropietarios.length; i++) {

			propietario = listaPropietarios[i];

			if (propietario == null) {
				posicion = i;
				break;
			}
		}

		return posicion;
	}

	public String CrearRegistroParqueo(String placa, String idPuesto, String fecha, String horaLlegada,
			String horaSalida) {
		String mensaje = "No puede registrar mas registros de parqueo";
		int posicion = -1;

		posicion = posicionDisponibleRegistroParqueo();

		if (posicion != -1) {

			Puesto puesto = null;
			Vehiculo vehiculo = null;

			vehiculo = obtenerVehiculo(placa);
			puesto = obtenerPuesto(idPuesto);

			if (vehiculo != null && puesto != null) {

				try {
					double totalAPagar = diferenciaHoras(horaLlegada, horaSalida) * puesto.getPrecio();

					RegistroParqueo registroParqueo = new RegistroParqueo(vehiculo, puesto, fecha, horaLlegada, horaSalida,
							totalAPagar);

					listaRegistroParqueo[posicion] = registroParqueo;

					mensaje = "RegistroParqueo " + listaRegistroParqueo[posicion];
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
		}

		return mensaje;
	}

	private Puesto obtenerPuesto(String idPuesto) {

		Puesto puesto = null;
		Puesto puestoEncontrado = null;

		for (int i = 0; i < listaPuestos.length; i++) {
			for (int j = 0; j < listaPuestos[i].length; j++) {
				puesto = listaPuestos[i][j];

				if (puesto != null) {
					if (puesto.getNumero().equalsIgnoreCase(idPuesto)) {
						puestoEncontrado = puesto;
						break;
					}
				}
			}
		}

		return puestoEncontrado;
	}

	public int posicionDisponibleRegistroParqueo() {
		RegistroParqueo registroParqueo = null;
		int posicion = -1;

		for (int i = 0; i < listaRegistroParqueo.length; i++) {

			registroParqueo = listaRegistroParqueo[i];

			if (registroParqueo == null) {
				posicion = i;
				break;
			}
		}

		return posicion;
	}

	public static int diferenciaHoras(String hora1, String hora2) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = null;
		Date date2 = null;

		date1 = format.parse(hora1);
		date2 = format.parse(hora2);

		int diferencia = (int) ((date2.getTime() - date1.getTime()) / 1000);
		int horas = (int) Math.floor(diferencia / 3600);

		return horas;
	}

	/**
	 * 7. Obtener los veh??culos con modelo mayor a 2016.
	 * 
	 * @param modelo
	 * @return
	 */

	public Vehiculo[] obtenerVehiculosModelo(String modelo) {

		int tam = contarVehiculosModeloMayor(modelo);

		Vehiculo vehiculo = null;
		Vehiculo[] vehiculosModeloMayor = new Vehiculo[tam];
		int indiceVehiculos = 0;

		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];
			if (vehiculo != null) {

				if (vehiculo.validarPlacaVehiculoMayor(modelo)) {
					vehiculosModeloMayor[indiceVehiculos] = vehiculo;

					indiceVehiculos++;
				}
			}
		}

		return vehiculosModeloMayor;

	}

	private int contarVehiculosModeloMayor(String modelo) {

		int contador = 0;

		for (int i = 0; i < listaVehiculos.length; i++) {

			if (listaVehiculos[i] != null) {

				if (listaVehiculos[i].validarPlacaVehiculoMayor(modelo)) {
					// if (Integer.parseInt(listaVehiculos[i].getModelo()) >
					// Integer.parseInt(modelo)) {
					contador++;

				}
			}
		}

		return contador;
	}

	public Vehiculo[] obtenerVehiculosMenores(String modelo) {

		int tamMenor = vehiculoMenor(modelo);
		Vehiculo vehiculoMenor[] = new Vehiculo[tamMenor];

		Vehiculo vehiculo = null;

		int indice = 0;
		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {
				if (vehiculo.vehiculoMenorModelo(modelo)) {
					vehiculoMenor[indice] = vehiculo;
					indice++;
				}
			}
		}

		return vehiculoMenor;
	}

	public int vehiculoMenor(String modelo) {
		int cont = 0;
		Vehiculo vehiculo = null;
		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {
				if (vehiculo.vehiculoMenorModelo(modelo)) {
					cont++;
				}
			}
		}

		return cont;
	}

	/**
	 * 9. Devolver un listado ordenado con los nombres de los Propietarios de los
	 * veh??culos que tienen modelo superior al indicado por el usuario.
	 * 
	 * @param modelo
	 * @return
	 */

	public Propietario[] obtenerPropietarioVehiculoSuperior(String modelo) {

		int tamPropietario = propietarioModeloSuperior(modelo);
		Propietario propietario[] = new Propietario[tamPropietario];

		Vehiculo vehiculo = null;
		int indice = 0;

		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {
				if (vehiculo.validarPlacaVehiculoMayor(modelo)) {
					if (vehiculo.getPropietario() != null) {
						propietario[indice] = vehiculo.getPropietario();
						indice++;
					}
				}
			}
		}

		return propietario;
	}

	public int propietarioModeloSuperior(String modelo) {
		int contador = 0;
		Vehiculo vehiculo = null;

		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];

			if (vehiculo != null) {
				if (vehiculo.validarPlacaVehiculoMayor(modelo)) {
					if (vehiculo.getPropietario() != null) {
						contador++;
					}
				}
			}
		}

		return contador;
	}

	// Parcial 2

	/**
	 * Punto 1
	 * 
	 * @param placa
	 */

//	public void vehiculoMasParqueado(String placa) {
//
//		int contador = 0;
//		RegistroParqueo registroParqueo = null;
//
//		for (int i = 0; i < listaRegistroParqueo.length; i++) {
//			registroParqueo = listaRegistroParqueo[i];
//
//			if (registroParqueo != null) {
//				if (registroParqueo.getVehiculo().getPlaca().equalsIgnoreCase(placa)) {
//					contador++;
//				}
//			}
//		}
//	}
	
//	/**
//	 * Para el punto 1 del parcial 2
//	 * @return
//	 */
//
//	public Vehiculo buscarVehiculoMasParqueado(){
//
//		//El arreglo auxiliar se crea para asegurar que no se valide 
//		//el mismo vehiculo en diferentes posiciones
//		Vehiculo[] aux = new Vehiculo[listaRegistroParqueo.length];
//		Vehiculo vehiculoMasParqueado = null;
//		int mayor = 0;
//		int indiceAux= 0;
//		int veces = 0;
//
//
//		for(int i=0; i< listaRegistroParqueo.length;i++){
//
//			if(listaRegistroParqueo[i] != null){
//
//				if(!buscarVehiculo(listaRegistroParqueo[i].getVehiculo(),aux)){
//
//					veces = contarVecesVehiculo(listaRegistroParqueo[i].getVehiculo());
//					if(veces > mayor){
//						mayor = veces;
//						vehiculoMasParqueado = listaRegistroParqueo[i].getVehiculo();
//					}
//					veces = 0;
//					//Se guarda el vehiculo al arreglo auxiliar para que 
//					//no se vuelva a repetir
//					aux[indiceAux]  = listaRegistroParqueo[i].getVehiculo();
//					indiceAux++;
//
//				}
//
//			}
//		}
//
//		return vehiculoMasParqueado;
//
//
//	}
//
//	/**
//	 * Este metodo ayuda al punto 1 y su funcion es contar la cantidad de veces
//	 * que se encuentra un vehiculo en la lista de registro
//	 * @param vehiculo
//	 * @return
//	 */
//	private int contarVecesVehiculo(Vehiculo vehiculo) {
//
//		int contador = 0;
//
//		for (int i = 0; i < listaRegistroParqueo.length; i++) {
//
//			//Se valida la placa del vehiculo pasador por parametro y se aumenta el contador
//			if(listaRegistroParqueo[i].verificarVehiculo(vehiculo.getPlaca())){
//				contador ++;
//			}
//		}
//
//		return contador;
//	}
//
//	/**
//	 * Este metodo ayuda al punto 1 y su funcion es que no se analice el mismo vehiculo
//	 * varias veces
//	 * @param vehiculo a analizar
//	 * @param arrayVehiculosAux arreglo auxiliar
//	 * @return
//	 */
//	private boolean buscarVehiculo(Vehiculo vehiculo, Vehiculo[] arrayVehiculosAux) {
//
//		for(int i=0; i< arrayVehiculosAux.length;i++){
//
//			if(arrayVehiculosAux[i].validarPlaca(vehiculo.getPlaca())){
//				return true;
//			}
//		}
//
//		return false;
//
//	}

	/**
	 * Punto 5
	 * 
	 * @param modeloMenor
	 * @param modeloMayor
	 * @param nombre
	 * @return
	 */
	public Vehiculo[] obtenerVehiculoMenorYMayor(String modeloMenor, String modeloMayor, String nombre) {

		int tam = contarObtenerVehiculoMenorYMayor(modeloMenor, modeloMayor, nombre);

		Vehiculo vehiculo = null;
		Vehiculo[] vehiculosModeloMayor = new Vehiculo[tam];
		int indiceVehiculos = 0;

		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];
			if (vehiculo != null) {

				if (vehiculo.validarPlacaVehiculoMayorYMenor(modeloMenor, modeloMayor)) {

					if (vehiculo.veficarNombrePropietario(nombre)) {
						vehiculosModeloMayor[indiceVehiculos] = vehiculo;

						indiceVehiculos++;
					}
				}
			}
		}

		return vehiculosModeloMayor;
	}

	private int contarObtenerVehiculoMenorYMayor(String modeloMenor, String modeloMayor, String nombre) {
		int contador = 0;
		Vehiculo vehiculo = null;

		for (int i = 0; i < listaVehiculos.length; i++) {
			vehiculo = listaVehiculos[i];
			if (vehiculo != null) {

				if (vehiculo.validarPlacaVehiculoMayorYMenor(modeloMenor, modeloMayor)) {

					if (vehiculo.veficarNombrePropietario(nombre)) {
						contador++;
					}
				}
			}
		}

		return contador;
	}

}
