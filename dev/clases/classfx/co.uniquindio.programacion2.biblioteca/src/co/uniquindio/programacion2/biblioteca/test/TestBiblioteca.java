package co.uniquindio.programacion2.biblioteca.test;

import co.uniquindio.programacion2.biblioteca.model.*;

public class TestBiblioteca {
	
	public TestBiblioteca (Biblioteca biblioteca)
	{
		inicializarDatos(biblioteca);
	}
	
	private void inicializarDatos (Biblioteca biblioteca){
		
		Prestamo prestamo1 = new Prestamo();
		Prestamo prestamo2 = new Prestamo();
		
		Estudiante estudiante1 = new Estudiante ("Juan", "1094", "armenia", "122");
//		Estudiante estudiante2 = new Estudiante ("paco", "1092", "armenia", "122");
		
		prestamo1.setEstudiante(estudiante1);
		prestamo1.setCodigo("111");
//		prestamo2.setEstudiante(estudiante2);
//		prestamo2.setCodigo("112");
		
		biblioteca.setPrestamo1(prestamo1);
//		biblioteca.setPrestamo2(prestamo2);
		
	}
}
