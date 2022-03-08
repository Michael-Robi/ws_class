package clases;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Alumno alumnos[];
		int cantidadAlumnos;
		
		System.out.println("¿Cuantos alumnos quiere registrar?");
		
		cantidadAlumnos = entrada.nextInt();
		
		alumnos = new Alumno[cantidadAlumnos];
		
		for (int i = 0; i < alumnos.length; i++) {
			Alumno a = new Alumno();
			
			System.out.println("Cuenta: ");
			a.setCuenta(entrada.next());
			System.out.println("Nombre: ");
			a.setNombre(entrada.next());
			System.out.println("Apellido: ");
			a.setApellido(entrada.next());
			System.out.println("Edad: ");
			a.setEdad(entrada.nextInt());
			System.out.println("Carrera: ");
			a.setCarrera(entrada.next());
			
			alumnos[i] = a;
		}
		
		System.out.println("Listado de Alumnos Registrados:");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
	}

}
