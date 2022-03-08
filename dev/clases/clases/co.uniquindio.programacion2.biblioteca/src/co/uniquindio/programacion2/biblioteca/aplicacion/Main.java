package co.uniquindio.programacion2.biblioteca.aplicacion;

import co.uniquindio.programacion2.biblioteca.model.*;
import co.uniquindio.programacion2.biblioteca.test.TestBiblioteca;

public class Main {

	public static void main(String[] args) {

		//Main Obtener PrestamoEstudiante 
//		Biblioteca biblioteca = new Biblioteca("UQ", "2322");
//		
//		Prestamo prestamo1 = new Prestamo();
//		Prestamo prestamo2 = new Prestamo();
//		
//		Estudiante estudiante1 = new Estudiante ("paco1", "1091", "armenia", "1223",Modalidad.PRESENCIAL);
//		Estudiante estudiante2 = new Estudiante ("paco2", "1092", "armenia", "1224",Modalidad.DISTANCIA);
//		
//		prestamo1.setEstudiante(estudiante1);
//		prestamo1.setCodigo("111");
//		
//		prestamo2.setEstudiante(estudiante2);
//		prestamo2.setCodigo("112");
//		
//		biblioteca.setPrestamo1(prestamo1);
//		biblioteca.setPrestamo2(prestamo2);
//		
//		String prestamoSolicitado;
//		
//		if (biblioteca != null) {
//			prestamoSolicitado = biblioteca.obtenerPrestamoEstudiante("paco2", "1092");
//			System.out.println("id prestamo: "+prestamoSolicitado);
//		}
		
		//Main Consultar la cantidad de vocales en un titulo de un libro 
//		Biblioteca biblioteca = null;
//		int cantidadLibros = 0;
//		
//		biblioteca = new Biblioteca("UQ", "2322");
//		Prestamo prestamo1 = new Prestamo();
//		
//		Estudiante estudiante1 = new Estudiante ("paco1", "1091", "armenia", "1223",Modalidad.PRESENCIAL);
//		
//		prestamo1.setEstudiante(estudiante1);
//		prestamo1.setCodigo("111");
//		
//		biblioteca.setPrestamo1(prestamo1);
//		
//		Libro libro = new Libro("123", "QR", "Amapolas", "Deitel", 500, "Araoke", "2", "12/07/16", 50);
//		
//		biblioteca.setLibro1(libro);
//		
//		DetallePrestamo detallePrestamo = new DetallePrestamo();
//		detallePrestamo.setLibro(libro);
//		detallePrestamo.setCantidad(1);
//		
//		prestamo1.setDetallePrestamo1(detallePrestamo);
//		
//		cantidadLibros = biblioteca.consultarCantidadLibros("Araoke");
//		System.out.println("Libros consultados "+cantidadLibros);
		
		//Main Consultar los estudiantes de modalidad Distancia que hayan prestado el libro de programacion 2.
//		Biblioteca biblioteca = new Biblioteca("UQ", "2322");
//	
//		Prestamo prestamo1 = new Prestamo();
//		DetallePrestamo detallePrestamo = new DetallePrestamo();
//		
//		Estudiante estudiante1 = new Estudiante ("paco1", "1091", "armenia", "1223",Modalidad.DISTANCIA);
//		Libro libro = new Libro("123", "QR", "programacion2", "Deitel", 500, "2", "Ac", "12/07/16", 50);
//		
//		prestamo1.setEstudiante(estudiante1);
//		prestamo1.setCodigo("111");
//		
//		detallePrestamo.setLibro(libro);
//		detallePrestamo.setCantidad(1);
//		
//		prestamo1.setDetallePrestamo1(detallePrestamo);
//		
//		biblioteca.setLibro1(libro);
//		biblioteca.setPrestamo1(prestamo1);
//		biblioteca.setEstudiante1(estudiante1);
//		
//		String prestamoSolicitado;
//		
//		if (biblioteca != null) {
//			prestamoSolicitado = biblioteca.obtenerPrestamoLibro("programacion2");
//			System.out.println("estudiante: "+prestamoSolicitado);
//		}
		
		//Main Consultar los préstamos realizados en una fecha indicada por el usuario y que se hayan prestado al menos 10 libros con el título indicado por el usuario.
//		Biblioteca biblioteca = new Biblioteca("UQ", "2322");
//		
//		Prestamo prestamo1 = new Prestamo();
//		DetallePrestamo detallePrestamo = new DetallePrestamo();
//		
//		Estudiante estudiante1 = new Estudiante ("paco1", "1091", "armenia", "1223",Modalidad.DISTANCIA);
//		Libro libro1 = new Libro("123", "QR", "programacion2", "Deitel", 500, "2", "Ac", "12/07/16", 50);
//		
//		prestamo1.setEstudiante(estudiante1);
//		prestamo1.setCodigo("111");
//		prestamo1.setFechaPrestamo("1/10/2020");
//		prestamo1.setFechaDevolucion("2/2/2020");
//		
//		detallePrestamo.setLibro(libro1);
//		detallePrestamo.setCantidad(10);
//		
//		prestamo1.setDetallePrestamo1(detallePrestamo);
//		
//		biblioteca.setLibro1(libro1);
//		biblioteca.setPrestamo1(prestamo1);
//		biblioteca.setEstudiante1(estudiante1);
//		
//		String prestamoSolicitado;
//
//		if (biblioteca != null) {
//			prestamoSolicitado = biblioteca.consultarPrestamosporFechaTitulo("1/10/2020","programacion2");
//			System.out.println("Prestamo: "+prestamoSolicitado);
//		}
		
		//Main Consultar la cantidad de libros disponibles en la biblioteca.
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setNombre("Uniquindio");
		biblioteca.setDireccion("Calle 50 # 23-34");

		Libro libro1 = new Libro("123", "QR", "programacion2", "Deitel", 500, "20", "Ac", "12/07/16", 10, 3000);
		Libro libro2 = new Libro("124", "QR", "Amapolas", "Deitel", 500, "Araoke", "2", "12/07/16", 20, 50000);
		
		biblioteca.setLibro1(libro1);
		biblioteca.setLibro2(libro2);
		
		int cantidadLibros;
		if (biblioteca != null) {
			cantidadLibros = biblioteca.cantidadDeLibrosDisponibles();
			System.out.println("Libros en inventario: "+cantidadLibros);
		}
	}

}
