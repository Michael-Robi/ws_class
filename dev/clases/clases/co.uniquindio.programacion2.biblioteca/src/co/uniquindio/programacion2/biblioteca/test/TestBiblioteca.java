package co.uniquindio.programacion2.biblioteca.test;

import co.uniquindio.programacion2.biblioteca.model.Biblioteca;
import co.uniquindio.programacion2.biblioteca.model.DetallePrestamo;
import co.uniquindio.programacion2.biblioteca.model.Estudiante;
import co.uniquindio.programacion2.biblioteca.model.Libro;
import co.uniquindio.programacion2.biblioteca.model.Modalidad;
import co.uniquindio.programacion2.biblioteca.model.Prestamo;
import co.uniquindio.programacion2.biblioteca.model.TipoDeDocumento;

public class TestBiblioteca {
	
	
	public TestBiblioteca(Biblioteca biblioteca) {
		inicializarDatos(biblioteca);
	}

	private void inicializarDatos(Biblioteca biblioteca) {
		Prestamo prestamo1 = new Prestamo();
		Prestamo prestamo2 = new Prestamo();
		DetallePrestamo detallePrestamo = new DetallePrestamo();
		DetallePrestamo detallePrestamo1 = new DetallePrestamo();
		
		Estudiante estudiante1 = new Estudiante("Juan", "1094", "armenia", "122",Modalidad.DISTANCIA, TipoDeDocumento.TARJETA_IDENTIDAD);
		Estudiante estudiante2 = new Estudiante("David", "1095", "armenia", "123",Modalidad.DISTANCIA, TipoDeDocumento.TARJETA_IDENTIDAD);
		Libro libro1 = new Libro("123", "QR", "Programacion2", "Deitel", 500, "Araoke", "2", "12/07/16", 50, 5000);
		Libro libro2 = new Libro("124", "QR", "Programacion2", "Cervantes", 500, "Editorial", "2", "12/07/16", 50, 3000);
		
		biblioteca.setPrestamo1(prestamo1);
		biblioteca.setPrestamo2(prestamo2);
		biblioteca.setEstudiante1(estudiante1);
		biblioteca.setEstudiante1(estudiante2);
		
		prestamo1.setEstudiante(estudiante1);
		prestamo1.setCodigo("111");
		
		prestamo2.setEstudiante(estudiante2);
		prestamo2.setCodigo("112");
		
		//Consultar la cantidad de libros prestados en una editorial donde su titulo empieza por vocal
		biblioteca.setLibro1(libro1);
		biblioteca.setLibro2(libro2);
		
		detallePrestamo.setLibro(libro1);
		detallePrestamo.setCantidad(1);
		
		detallePrestamo1.setLibro(libro2);
		detallePrestamo1.setCantidad(1);
		
		prestamo1.setDetallePrestamo1(detallePrestamo);
		prestamo2.setDetallePrestamo2(detallePrestamo1);
	}
	
}
