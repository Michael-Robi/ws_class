package co.uniquindio.programacion2.biblioteca.aplicacion;//nameSpace

import javax.swing.JOptionPane;

import co.uniquindio.programacion2.biblioteca.model.Biblioteca;
import co.uniquindio.programacion2.biblioteca.model.Bibliotecario;
import co.uniquindio.programacion2.biblioteca.model.Estudiante;
import co.uniquindio.programacion2.biblioteca.model.Libro;
import co.uniquindio.programacion2.biblioteca.model.Modalidad;
import co.uniquindio.programacion2.biblioteca.model.Prestamo;
import co.uniquindio.programacion2.biblioteca.test.TestBiblioteca;

public class Aplicacion {

	public static void main(String[] args) {

		int opcion = 0;
		String nombreBiblioteca = "";
		String direccionBiblioteca = "";
		Biblioteca biblioteca = null;
		TestBiblioteca testBiblioteca = null;
		
		//variables estudiante
		String nombreEstudiante;
		String identificacionEstudiante;
		String direccionEstudiante;
		String telefonoEstudiante;
		
		//variables Libro
		String codigoLibro;
		String isbnLibro;
		String tituloLibro;
		String autorLibro;
		int numeroPaginasLibro;
		String editorialLibro;
		String estadoLibro;
		String fechaPublicacionLibro;
		int cantidadDisponibleLibro;

		//variables Bibliotecario
		String nombreBibliotecario;
		String identificacionBibliotecario;
		String direccionBibliotecario;
		String telefonoBibliotecario;

		String mensaje = "";
		boolean resultado = false;
		
		
		imprimir("Bienvenidos a la aplicacion Biblioteca");
	
//		nombreBiblioteca = leerStringVentana("Ingrese el nombre de la biblioteca");
//		direccionBiblioteca = leerStringVentana("Ingrese la direccion de la biblioteca");
		// actual
		nombreBiblioteca = "Uq";
		direccionBiblioteca = "Carrera 15 Calle 12 Norte, Armenia (Quindio), CO, 630004";
		//
		biblioteca = new Biblioteca(nombreBiblioteca,direccionBiblioteca);
		testBiblioteca = new TestBiblioteca(biblioteca);
		
		do {
			opcion = mostrarMenu();

			switch (opcion) {
			//CRUD  Create  Read  Update Delete
			case 1: //crear estudiante
				
				//1. Solicitar los datos al usuario
				nombreEstudiante = leerStringVentana("Ingrese el nombre del estudiante");
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante\"");
				direccionEstudiante = leerStringVentana("\"Ingrese la direccion del estudiante\"");
				telefonoEstudiante = leerStringVentana("\"Ingrese el telefono del estudiante\"");
				
				resultado = validarInformacionEstudiante(nombreEstudiante,identificacionEstudiante,direccionEstudiante,telefonoEstudiante);
				if(resultado == true) {
					mensaje = biblioteca.crearEstudiante(nombreEstudiante,identificacionEstudiante,direccionEstudiante,telefonoEstudiante);
					imprimir(mensaje);
				}else {
					imprimirError(mensaje);
				}
				break;
				
			case 2://consultar estudiante
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante que desea consultar\"");
				
				resultado = validarNull(identificacionEstudiante);
				
				if (resultado == true) {
				
					Estudiante registro = biblioteca.consultarEstudiante(identificacionEstudiante);
					
					if (registro!=null) {
						mensaje = registro.toString();
					} else {
						mensaje = "Estudiante no registrado";
					}
					
					imprimir(mensaje);
				
				} else {
					imprimirError(mensaje);
				}
				break;
				
			case 3://eliminar estudiante
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante que desea eliminar\"");
				
				resultado = validarNull(identificacionEstudiante);
				if (resultado == true) {
				
					mensaje = biblioteca.eliminarEstudiante(identificacionEstudiante);
					imprimir(mensaje);
				
				} else {
					imprimirError(mensaje);
				}
				
				break;
				
			case 4://Actualizar estudiante
				//1. Solicitar los datos al usuario
				
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante que desea actualizar\"");
				
				resultado = validarNull(identificacionEstudiante);
				
				if (resultado == true) {
				
					nombreEstudiante = leerStringVentana("Ingrese el nombre del estudiante");
					direccionEstudiante = leerStringVentana("\"Ingrese la direccion del estudiante\"");
					telefonoEstudiante = leerStringVentana("\"Ingrese el telefono del estudiante\"");
					
					resultado = validarInformacionEstudiante(nombreEstudiante,identificacionEstudiante,direccionEstudiante,telefonoEstudiante);
					if(resultado == true) {
						mensaje = biblioteca.actualizarEstudiante(identificacionEstudiante, nombreEstudiante, direccionEstudiante, telefonoEstudiante);
						imprimir(mensaje);
					}else {
						imprimirError(mensaje);
					}
				
				} else {
					imprimirError(mensaje);
				}
				break;
				
			case 5:
				mensaje="Identificacion no valida";
				String prestamoSolicitado;
				
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante\"");
				resultado = validarNull(identificacionEstudiante);
				
				if(resultado == true) {
					prestamoSolicitado = biblioteca.obtenerPrestamoEstudiante("Juan", identificacionEstudiante);
					
					if (prestamoSolicitado != null) {
						imprimir("Codigo solicitado"+prestamoSolicitado);
					}
					else{
						imprimir("sin prestamo");
					}
				}else {
					imprimirError(mensaje);
				}
			break;
			
			case 6:
				int cantidadLibros = 0;
				
				mensaje="Editorial no valida";
				
				editorialLibro = leerStringVentana("\"Ingrese la editorial\"");
				resultado = validarNull(editorialLibro);
				
				if (resultado == true) {
					cantidadLibros = biblioteca.consultarCantidadLibros(editorialLibro);
					
					if (cantidadLibros >= 1) {
						imprimir("Libros prestados: "+cantidadLibros);
					}
					else{
						imprimir("Sin prestamo");
					}
				} else {
					imprimirError(mensaje);
				}

			break;
			
			case 7:
				String prestamo;
				
				mensaje="Libro no valido";
				
				tituloLibro = leerStringVentana("\"Ingrese el libro\"");
				resultado = validarNull(tituloLibro);
				
				if(resultado == true) {
					prestamo = biblioteca.obtenerPrestamoLibro(tituloLibro);
					
					if (prestamo != null) {
						imprimir("Prestamo realizado al estudiante: " +prestamo);
					}
					else {
						imprimir("Sin prestamo");
					}
				}
				
				else {
					imprimirError(mensaje);
				}
				
				break;

			default:
				break;
			}
		}while(opcion!=8);

	}
	
	private static boolean validarInformacionEstudiante(String nombreEstudiante, String identificacionEstudiante,
			String direccionEstudiante, String telefonoEstudiante) {
		
		boolean valido = true;
		if(nombreEstudiante.equalsIgnoreCase("") || identificacionEstudiante.equalsIgnoreCase("")
				||direccionEstudiante.equalsIgnoreCase("") ||telefonoEstudiante.equalsIgnoreCase("")) {
			valido = false;
		}
		
		if(!isNumeric(telefonoEstudiante)) {
			valido = false;
		}
		return valido;
	}

	private static boolean validarNull(String identificacionEstudiante) {
		
		boolean validar = true;
		
		if (identificacionEstudiante.equalsIgnoreCase("")) {
			validar = false;
		}
		return validar;
	}

	private static void imprimirError(String mensaje) {
//		JOptionPane.showInputDialog(null, "Por favor ingresar datos validos", "Error!", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Por favor ingresar datos validos", "Error!", JOptionPane.ERROR_MESSAGE);
		
	}

	private static int mostrarMenu() {
		int opcion = 0;
		String menu = "Seleccione la opción que desea realizar :\n"
				+ " Opciones Estudiantes\n"
				+ "1 Crear un Estudiante\n"
				+ "2 Consultar un Estudiante\n"
				+ "3 Eliminar un Estudiante\n"
				+ "4 Actualizar un Estudiante\n"
				+ "5 Consultar Prestamo Estudiante\n"
				+ "6 Consultar cantidad de libros prestados\n"
				+ "7 Consultar estudiante modalidad Distancia\n\n"
				+ "8 Salir\n";
		
		opcion = leerEnteroVentana(menu);
		return opcion;
	}

	/**
	 * Permite leer un numero entero mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario
	 */
	public static int leerEnteroVentana (String mensaje)
	{
		int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Permite imprimir un mensaje
	 * @param mensaje El mensaje a imprimir
	 */
	public static void imprimir (String mensaje)
	{
		JOptionPane.showMessageDialog(null,mensaje);
	}

	/**
	 * Permite leer un numero double mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario
	 */	

	public static double leerDouble (String mensaje)
	{
		double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

	public static String  leerStringVentana(String mensaje) {
		String respuesta = "";
		respuesta  = JOptionPane.showInputDialog(mensaje);
		return respuesta;

	}

	public void test() {
		
	}

}
