package Mundo;

import javax.swing.JOptionPane;

public class AgendaTelefonica {
	
	int numContactos = 0;
	Contacto contactos[] = new Contacto[10];
	
	public void agregarContacto() {

		String nombre = JOptionPane.showInputDialog("Nombre del contacto");
		String telefono = JOptionPane.showInputDialog("Telefono del contacto");
		
		if (existeContacto(nombre) != true) {
			
			if (numContactos<=contactos.length-1) {
				Contacto contacto = new Contacto();
				contacto.setNombre(nombre);
				contacto.setTelefono(telefono);
				
				contactos[numContactos] = contacto;
				numContactos++;
			}else {
				JOptionPane.showMessageDialog(null,  "No puede ingresar mas contactos", null, JOptionPane.WARNING_MESSAGE);
			}
			
		}else {
			JOptionPane.showMessageDialog(null,  "El contacto ya existe", null, JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void mostrarContactos() {
		
		if (numContactos==0) {
			JOptionPane.showMessageDialog(null,  "No se han creados los contactos", null, JOptionPane.WARNING_MESSAGE);
		}
		else {
			for (int i = 0; i <numContactos; i++) {
				if (contactos[i] != null) {
					Contacto contacto = new Contacto();
					contacto = contactos[i]; //lista de contactos
					System.out.println(contacto.toString());
				}
			}
		}
	}
	
	public boolean existeContacto(String nombre) {
		Contacto c = null;
		boolean respuesta = false;
		
		for (int i = 0; i <numContactos; i++) {
			c = contactos[i];
			
			if (c != null) {
				if (c.getNombre().equalsIgnoreCase(nombre)) {
					respuesta = true;
					return respuesta;
				}
			}
		}
		
		return respuesta;
	}
	
	public Contacto buscarContacto(String nombre) {

		Contacto c = null;
		
		for (int i = 0; i <numContactos; i++) {
			
			if (contactos[i] != null) {
				if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
					c = contactos[i]; 
				}
			}
		}
		
		return c;
	}
	
	public boolean eliminarContacto(String nombre) {
		
		Contacto c = null;
		boolean respuesta = false;
		
		for (int i = 0; i <numContactos; i++) {
			if (contactos[i] != null) {
				if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
					contactos[i] = null; 
					respuesta = true;
//					numContactos--;
				}
			}
		}
		
		return respuesta;
	}
	
	public int cantidad() {
		return numContactos;
	}
	
	
	
	
}
