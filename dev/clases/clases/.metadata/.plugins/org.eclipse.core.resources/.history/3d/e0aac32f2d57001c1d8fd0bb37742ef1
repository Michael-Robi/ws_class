package co.uniquindio.edu.parqueadero.aplicacion;

import co.uniquindio.edu.parqueadero.exception.VehiculoException;
import co.uniquindio.edu.parqueadero.model.Parqueadero;
import co.uniquindio.edu.parqueadero.model.TipoVehiculo;
import co.uniquindio.edu.parqueadero.model.Vehiculo;
import co.uniquindio.edu.parqueadero.model.Propietario;

public class Aplicacion {

	public static void main(String[] args) {

		Parqueadero parq = null;

		// public Parqueadero(String nombre, int tamanioPuestos, int numVehiculos, int
		// numPropietarios, int numRegistrosParqueo)
		// Parqueadero parqueadero = new Parqueadero("centinela", 10, 20, 20, 15);
		Parqueadero parqueadero = new Parqueadero("centinela", 2, 3, 3, 2);

		parq = parqueadero;

		parq.crearPropietario("Carlo", "1231", "2192830");
		parq.crearPropietario("Juan", "1232", "2192830");
		parq.crearPropietario("Sergio", "1233", "2192833");

		try {
			parq.crearVehiculo("12a", "2016", TipoVehiculo.CARRO, "1231");
			parq.crearVehiculo("12b", "2017", TipoVehiculo.CARRO, "1232");
			parq.crearVehiculo("12c", "2018", TipoVehiculo.CARRO, "1233");
		} catch (VehiculoException e) {
			e.printStackTrace();
		}

		parq.CrearRegistroParqueo("12a", "1", "12-08-2021", "13:00", "14:00");
		parq.CrearRegistroParqueo("12b", "2", "13-08-2021", "9:00", "12:00");

		// try {
		// parq.eliminarVehiculo("12m");
		// } catch (VehiculoException e) {
		// e.printStackTrace();
		// }

		// System.out.println("Vehiculo Encontrado: " + parq.buscarVehiculo("12m"));

		// 7. Obtener los vehículos con modelo mayor a 2016.
		// int modeloMayor = 2016;
		// Vehiculo vehiculoModeloMayor[] = parq.obtenerVehiculosModelo(modeloMayor +
		// "");
		// imprimirArrayVehiculo("Vehiculo Mayor a " + modeloMayor,
		// vehiculoModeloMayor);

		// Obtener los vehiculos con modelo menor a 2015.
		// Vehiculo vehiculoModeloMenor[] = parq.obtenerVehiculosMenores("2018");
		// imprimirArrayVehiculo("Vehiculo Menor a 2018", vehiculoModeloMenor);

		// 9. Obtener propietario modelo superior vehiculo
		// Propietario vehiculoModeloSuperior[] =
		// parq.obtenerPropietarioVehiculoSuperior("2016");
		// ordenarPropietarios(vehiculoModeloSuperior);

		// imprimirArrayPropietario("Propietario modelo superior 2016",
		// vehiculoModeloSuperior);

		// System.out.println(parq.toString());

		// parcial

		String menor = "2016", mayor = "2018", nombre = "Juan";
		Vehiculo vehiculoMenorYMayor[] = parq.obtenerVehiculoMenorYMayor(menor, mayor, nombre);
		imprimirArrayVehiculo("Vehiculo menor a: " + menor + " y mayor a: " + mayor + " Conductor: " + nombre,
				vehiculoMenorYMayor);
	}

	public static void imprimirArrayVehiculo(String mensaje, Vehiculo vehiculo[]) {

		for (int i = 0; i < vehiculo.length; i++) {
			System.out.println(mensaje + "\n" + vehiculo[i]);
		}
	}

	public static void imprimirArrayPropietario(String mensaje, Propietario propietario[]) {

		for (int i = 0; i < propietario.length; i++) {
			System.out.println(mensaje + "\n" + propietario[i]);
		}
	}

	public static void ordenarEnteros(int lista[]) {

		// Usamos un bucle anidado
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] > lista[j]) {
					// Intercambiamos valores
					int variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;

				}
			}
		}
	}

	public static void ordenarCadena(String lista[]) {

		// Usamos un bucle anidado
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i].compareToIgnoreCase(lista[j]) > 0) {
					// Intercambiamos valores
					String variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;

				}
			}
		}
	}

	public static void ordenarPropietarios(Propietario propietario[]) {

		// Usamos un bucle anidado
		Propietario auxPropietario = null;

		for (int i = 0; i < (propietario.length - 1); i++) {
			for (int j = i + 1; j < propietario.length; j++) {
				if (propietario[i].getNombre().compareToIgnoreCase(propietario[j].getNombre()) > 0) {
					// Intercambiamos valores
					auxPropietario = propietario[i];
					propietario[i] = propietario[j];
					propietario[j] = auxPropietario;

				}
			}
		}
	}

}
