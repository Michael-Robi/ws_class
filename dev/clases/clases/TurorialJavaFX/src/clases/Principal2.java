package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		int opcion;
		do {
			System.out.println("Seleccione una opción \n"
					+"1. Agregar Alumno \n"
					+"2. Modificar Alumno \n"
					+"3. Eliminar Alumno \n"
					+"4. Mostrar Información \n"
					+"0. Salir"
					);
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("Agregar un nuevo Alumno");
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
				
				alumnos.add(a);
				break;
			}
			case 2: {
				System.out.println("Modificar un Alumno");
				break;
			}
			case 3: {
				System.out.println("Eliminar un Alumno");
				break;
			}
			case 4: {
				System.out.println("Alumnos Registrados");
				
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println(alumnos.get(i));
				}
				
				break;
			}
			default:
				break;
			}
		} while (opcion != 0);
		
//		System.out.println("¿Cuantos alumnos quiere registrar?");
//		
//		cantidadAlumnos = entrada.nextInt();
//		
//		alumnos = new Alumno[cantidadAlumnos];
//		
//		for (int i = 0; i < alumnos.length; i++) {
//			Alumno a = new Alumno();
//			
//			System.out.println("Cuenta: ");
//			a.setCuenta(entrada.next());
//			System.out.println("Nombre: ");
//			a.setNombre(entrada.next());
//			System.out.println("Apellido: ");
//			a.setApellido(entrada.next());
//			System.out.println("Edad: ");
//			a.setEdad(entrada.nextInt());
//			System.out.println("Carrera: ");
//			a.setCarrera(entrada.next());
//			
//			alumnos[i] = a;
//		}
//		
//		System.out.println("Listado de Alumnos Registrados:");
//		for (int i = 0; i < alumnos.length; i++) {
//			System.out.println(alumnos[i]);
//		}
		
		entrada.close();
	}

}
