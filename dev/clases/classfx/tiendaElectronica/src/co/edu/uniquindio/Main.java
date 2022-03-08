package co.edu.uniquindio;

import java.util.ArrayList;

import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.TiendaElectronica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirAdministradores();
	}
	
	public static void imprimirAdministradores() {
		ArrayList<Administrador>listaAdministardor;
	
		TiendaElectronica tiendaElectronica = new TiendaElectronica();		
		listaAdministardor=tiendaElectronica.getlistaAdministardor();
		
		for (int i = 0; i < listaAdministardor.size(); i++) {
			System.out.println(listaAdministardor.toString());
		}
		
		
	}

}
