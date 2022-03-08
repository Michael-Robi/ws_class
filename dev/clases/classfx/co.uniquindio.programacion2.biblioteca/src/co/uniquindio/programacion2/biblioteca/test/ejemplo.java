package co.uniquindio.programacion2.biblioteca.test;

import co.uniquindio.programacion2.biblioteca.model.*;

public class ejemplo {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("ud","d1");
		Estudiante estudiante1 = new Estudiante ("Juan", "1094", "armenia", "122");
		
		Prestamo prestamo1 = new Prestamo();
		Prestamo prestamo2 = new Prestamo();
		
		prestamo1.setEstudiante(estudiante1);
		prestamo1.setCodigo("1094");
		
		biblioteca.setPrestamo1(prestamo1);
		biblioteca.setPrestamo2(prestamo2);
		
		Prestamo registroPrestamo1 = biblioteca.obtenerPrestamoEstudiante(estudiante1.getNombre(), estudiante1.getIdentificacion());

		Prestamo data =  biblioteca.obtenerPrestamoEstudiante("Juan", "123");
		
		String mensaje = "";
		
		if (registroPrestamo1!=null) {
			mensaje = data.getCodigo();
		} else {
			mensaje = "No existe el prestamo";
		}
		System.out.println(mensaje);
	}

}
