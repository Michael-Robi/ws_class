package ejemplos.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MainArrayList {

	public static void main(String[] args) {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		ArrayList<Alumno> listaAuxiliar = new ArrayList<Alumno>();
		
		ejercicio2(listaAlumnos);
		
		listaAlumnos = inicializarDatos(listaAlumnos);
		
//		ejemplo1();
//		ejemplo2();
		listaAuxiliar = obtenerAlumnosPromedioMayor(listaAlumnos);
		
		System.out.println("Lista alumnos :"+listaAlumnos.toString());
		System.out.println("Lista alumnos promedio mayor:"+listaAuxiliar.toString());
		
		
		
	}
	
	
	private static void ejercicio2(ArrayList<Alumno> listaAlumnos) {
		// TODO Auto-generated method stub
		Alumno alumno = null;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			alumno = listaAlumnos.get(i);
			
			if(alumno.getSexo().equalsIgnoreCase("m")) {
				
			}
		}
	}


	private static ArrayList<Alumno> inicializarDatos(ArrayList<Alumno> listaEstudiantes) {
		
		Alumno alumno = new Alumno(1, "Juan", "M", 20, 3, 0, 1.5, "Sistemas");
		listaEstudiantes.add(alumno);
		
		alumno = new Alumno(1, "Ana", "M", 20, 3, 0, 3.5, "Sistemas");
		listaEstudiantes.add(alumno);
		
		alumno = new Alumno(1, "Juana", "M", 20, 3, 0, 4.5, "Sistemas");
		listaEstudiantes.add(alumno);
		
		alumno = new Alumno(1, "Juan", "M", 20, 3, 0, 0.5, "Sistemas");
		listaEstudiantes.add(alumno);
		
		
		alumno = new Alumno(1, "Pedro", "M", 20, 3, 0, 0.5, "Sistemas");
		listaEstudiantes.add(0,alumno);
		
		
		return listaEstudiantes;
	}




	private static ArrayList<Alumno> obtenerAlumnosPromedioMayor(ArrayList<Alumno> listaEstudiantes) {
		
		ArrayList<Alumno> listaAuxiliar = new ArrayList<Alumno>();
		
		
		for (Alumno alumno : listaEstudiantes) {
			
			if(alumno.getPromedio() > 3)
				listaAuxiliar.add(alumno);
		}
		
		return listaAuxiliar;
	}




	public static void ejemplo1() {
		
		ArrayList<String> lista = new ArrayList<>();
		
		
		lista.add("Pedro");
		lista.add("Juan");
		lista.add("Ana");
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("Carlos");
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println("Valor de la lista = "+lista.get(i));
		}
		
		for (String cadena : lista) {
			System.out.println("Valor de la lista con foreach: "+cadena);
		}
		
		
		Iterator<String>  iterador = lista.iterator();
		
		
		while (iterador.hasNext()) {
			String cadena = (String) iterador.next();
			System.out.println("Valor de la lista con iterator: "+cadena);
		}
		
		
		
	}
	
	
	public static void ejemplo2() {
		
		
		ArrayList<Object> lista = new ArrayList<Object>();
		lista.add("Hola");
		lista.add(2);
		
		
		if(lista.get(0) instanceof Integer){
			int valor = (int) lista.get(0);
		}else{
			System.out.println("No es del mismo tipo");
		}
		
	}

}
