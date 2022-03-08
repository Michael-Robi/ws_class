package co.uniquindio.edu.parqueadero.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import co.uniquindio.edu.parqueadero.exception.VehiculoException;


/**
 * Clase parqueadero
 * @author Admin
 *
 */
public class Parqueadero {

	//---------------------------------------------------------------------------
	//ATRIBUTOS
	//---------------------------------------------------------------------------
	private String nombre;
	private Puesto listaPuestos[][];
	private Vehiculo [] listaVehiculos;
	private Propietario [] listaPropietarios;
	private RegistroParqueo[] listaRegistroParqueo;

	/**
	 * Constructor de la clase parqueadero
	 */
	public Parqueadero(String nombre,int tamanioPuestos,int numVehiculos,int numPropietarios, int numRegistrosParqueo){
		listaPuestos = new Puesto[tamanioPuestos][tamanioPuestos];
		listaVehiculos = new Vehiculo[numVehiculos];
		listaPropietarios = new Propietario[numPropietarios];
		listaRegistroParqueo = new RegistroParqueo[numRegistrosParqueo];

		this.nombre = nombre;

		inicilializarPuestos();
	}

	private void inicilializarPuestos() {

		int valor = 1;
		
		for(int i=0; i<listaPuestos.length; i++)
		{
			for(int j=0; j<listaPuestos.length; j++)
			{
				if(i % 2 == 0)
				{
					listaPuestos[i][j]=new Puesto(""+valor,"Disponible",2000,TipoVehiculo.CARRO);
				}
				else
				{
					listaPuestos[i][j]=new Puesto(""+valor,"Disponible",1000,TipoVehiculo.MOTO);
				}
				
				valor++;
			}
		}
	}


	//---------------------------------------------------------------------------
	//METODOS SET Y GET
	//---------------------------------------------------------------------------


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



	//-----------------------------------------------------------------------------
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



	@Override
	public String toString() {
		return "Parqueadero [listaPuestos=" + Arrays.toString(listaPuestos) + ", listaVehiculos=" + listaVehiculos
				+ ", listaPropietarios=" + listaPropietarios + ", listaRegistroParqueo=" + listaRegistroParqueo + "]";
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
	 * 
	 * @param placa
	 * @param modelo
	 * @param tipoVehiculo
	 * @param identificacionPropietario
	 * @throws VehiculoException 
	 */

	public String crearVehiculo(String placa, String modelo, TipoVehiculo tipoVehiculo,String identificacionPropietario) throws VehiculoException {
		
		//Crear variables
		Vehiculo vehiculoEncontrado = null;
		Propietario propietario =  null;
		String resultado = "";
		int posicion = -1;
		
		//1. buscar el vehiculo
		vehiculoEncontrado = buscarVehiculo(placa);
		if(vehiculoEncontrado == null){
			
			//2. Obtener el propietario
			propietario = obtenerPropietario(identificacionPropietario);
			
			if(propietario != null){
				
				//3. Obtener posicion disponible
				posicion = obtenerPosicionDisponibleVehiculo();
				
				if(posicion != -1){
					
//					Vehiculo vehiculo = new Vehiculo(placa, modelo, tipoVehiculo, propietario);
					Vehiculo vehiculo = new Vehiculo();
					vehiculo.setPlaca(placa);
					vehiculo.setModelo(modelo);
					vehiculo.setTipoVehiculo(tipoVehiculo);
					vehiculo.setPropietario(propietario);
					listaVehiculos[posicion]= vehiculo;
					
				}else{
					throw new VehiculoException("No existe cupo para crear el vehiculo");
				}
				
				
			}else{
				throw new VehiculoException("No existe un propietario para crear el vehiculo");
			}

		}else{
			throw new VehiculoException("El vehiculo ya se encuentra registrado");
		}
		
		return resultado;
		
	}




	private Vehiculo buscarVehiculo(String placa) {
		
		Vehiculo vehiculo = null;
		
		for (int i = 0; i < listaVehiculos.length; i++) {
			
			vehiculo = listaVehiculos[i];
			
			if (vehiculo != null) {
				
				if(vehiculo.buscarPlaca(placa)) {
					return vehiculo;
				}
				break;
			}
		}
		
		return vehiculo;
	}
	
	private Propietario obtenerPropietario(String identificacionPropietario) {
		// arreglo
		Propietario propietario = null;
		
		for (int i = 0; i < listaPropietarios.length; i++) {
			
			if (listaPropietarios[i] !=null ) {
				if (listaPropietarios[i].validarPlaca(identificacionPropietario)) {
					propietario = listaPropietarios[i];
					break;
				}
			}
		}
		
		return propietario;
	}
	
	private int obtenerPosicionDisponibleVehiculo() {
		// TODO Auto-generated method stub
		int posicion = -1;
		
		for (int i = 0; i < listaRegistroParqueo.length; i++) {
			
			if (listaRegistroParqueo[i] != null) {
				posicion = i;
				break;
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

}
