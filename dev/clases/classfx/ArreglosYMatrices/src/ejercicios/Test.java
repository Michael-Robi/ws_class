package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero de estudiantes");
		int size = s.nextInt();
		Operacion opt = new Operacion(size);
		
		System.out.println("Mostrar detalle Estudiantes");
		
		for (int i = 0; i < size; i++) {
			Estudiante s1 = new Estudiante();
			
			System.out.println((i+1)+" Nombre del estudiante");
			String nombre=s.next();
			System.out.println((i+1)+" Roll del estudiante");
			int roll=s.nextInt();
			
			s1.setRoll(roll);
			s1.setNombre(nombre);
			
			//agregar estudiante
			opt.addEstudiante(s1);
		}
		
		String text="";
		Estudiante std=null;
		
		do {
			System.out.println("Presione 1 para buscar Estudiante el roll");
			System.out.println("Presione 2 para buscar Estudiante el nombre");
			System.out.println("Presione 3 para mostrar todos los Estudiante");
			System.out.println("Presione 4 para eliminar al estudiante");
			System.out.println("Enter para elegir opcion :-");
			
			int opc=s.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Buscar roll");
				std = opt.fiendEstudianteByRoll(s.nextInt());
				
				if (std != null) {
					System.out.println(std.getRoll()+"\t"+std.getNombre());
				} else {
					System.out.println("No existe el roll");
				}
				break;
				
			case 2:
				System.out.println("Buscar nombre");
				std = opt.fiendEstudianteByName(s.next());
				
				if (std != null) {
					System.out.println(std.getRoll()+"\t"+std.getNombre());
				} else {
					System.out.println("No existe el nombre");
				}
				break;
				
			case 3:
				opt.showAllEstudiantes();
				break;
				
			case 4:
				System.out.println("Eliminar el roll");
				if (opt.deleteRoll(s.nextInt())) {
					System.out.println("Eliminado");
				} else {
					System.out.println("No existe el roll");
				}
				break;
				
			default:
				System.out.println("Mala decision");
				
			}
			System.out.println("¿Quiere continuar? y/n");
			text=s.next();
			
		} while (text.equalsIgnoreCase("y"));
		
		System.out.println("Gracias por usar Crud Array...");
	}

}
