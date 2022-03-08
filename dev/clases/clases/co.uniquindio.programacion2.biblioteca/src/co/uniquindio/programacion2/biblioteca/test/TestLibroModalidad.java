package co.uniquindio.programacion2.biblioteca.test;

import co.uniquindio.programacion2.biblioteca.model.Biblioteca;
import co.uniquindio.programacion2.biblioteca.model.DetallePrestamo;
import co.uniquindio.programacion2.biblioteca.model.Estudiante;
import co.uniquindio.programacion2.biblioteca.model.Libro;
import co.uniquindio.programacion2.biblioteca.model.Modalidad;
import co.uniquindio.programacion2.biblioteca.model.Prestamo;
import co.uniquindio.programacion2.biblioteca.model.TipoDeDocumento;

public class TestLibroModalidad {
	
	public TestLibroModalidad(Biblioteca biblioteca) {
		inicializarDatos(biblioteca);
	}

	private void inicializarDatos(Biblioteca biblioteca) {
		
		Prestamo prestamo1 = new Prestamo();
		Prestamo prestamo2 = new Prestamo();
		
		DetallePrestamo detallePrestamo1 = new DetallePrestamo();
		
		Modalidad arr[] = Modalidad.values();
		
		Estudiante estudiante1 = new Estudiante("Pedro", "1095", "Genova", "034",arr[1], TipoDeDocumento.TARJETA_IDENTIDAD);
		
		prestamo1.setEstudiante(estudiante1);
		prestamo1.setDetallePrestamo1(detallePrestamo1);
		
		Libro libro1 = new Libro("122", "QR", "Programacion 2", "Anonimo", 503, "Deitel", "Activo", "10/3/2012", 4,5000);
		
		detallePrestamo1.setLibro(libro1);
		
		biblioteca.setPrestamo1(prestamo1);
		biblioteca.setEstudiante1(estudiante1);
		biblioteca.setLibro1(libro1);
		
	}
}
