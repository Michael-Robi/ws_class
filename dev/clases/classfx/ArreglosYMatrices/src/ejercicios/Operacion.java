package ejercicios;

import java.util.Iterator;

public class Operacion {
	
	private Estudiante[] stds;
	private int index;
	
	public Operacion(int size) {
		this.stds = new Estudiante[size];
	}
	
	public void addEstudiante(Estudiante s) {
		stds[index++] = s;
	}
	
	public void showAllEstudiantes() {
		for (int i = 0; i < stds.length; i++) {
			if (stds[i]!=null) {
				System.out.println(stds[i].getRoll()+"\t"+stds[i].getNombre());
			}
		}
	}
	
	public boolean deleteRoll(int roll) {
		
		boolean estado = false;
		
		for (int i = 0; i < stds.length; i++) {
			if (stds[i]!=null) {
				if (stds[i].getRoll()==roll) {
					stds[i]=null;
					estado = true;
				}
			}
		}
		return estado;
	}
	
	public Estudiante fiendEstudianteByRoll(int roll) {
		Estudiante std = null;
		for (int i = 0; i < stds.length; i++) {
			if (stds[i]!=null) {
				if (stds[i].getRoll()==roll) {
					std = stds[i];
				}
			}
		}
		return std;
	}
	
	public Estudiante fiendEstudianteByName(String name) {
		Estudiante std = null;
		for (int i = 0; i < stds.length; i++) {
			if (stds[i]!=null) {
				if (stds[i].getNombre().equals(name)) {
					std = stds[i];
				}
			}
		} 
		return std;
	}
}
