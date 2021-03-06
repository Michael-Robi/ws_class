package co.edu.uniquindio;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniquindio.controller.TiendaController;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Producto;
import co.edu.uniquindio.model.TiendaElectronica;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Aplicacion extends Application {



	private Stage primaryStage;
	TiendaElectronica tiendaElectronica = new TiendaElectronica();

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Tienda Electronica");
		mostrarVentanaPrincipal();	

	}

	private void mostrarVentanaPrincipal() {

		try {

			//Este loader carga una vista. Y esta se especifica en la ruta
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("view/TiendaView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			//Aqui se carga el controlador principal
			//Dicho controlador va a estar conectada a la viwe que se cargo en las lineas anteriores
			TiendaController tiendaController = loader.getController();
			//Se enlaza la clase aplicacion para que se comunica el controlador y la aplicacion
			tiendaController.setAplicacion(this);


			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Cliente> obtenerClientes() {
		return tiendaElectronica.getListaClientes();
	}
	
	public ArrayList<Producto> obtenerProductos() {
		return tiendaElectronica.getListaProducto();
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}




	public static void main(String[] args) {
		launch(args);
	}
	
	public Cliente crearCliente(String nombre, String identificacion, String telefono) {
		
		Cliente cliente = null;
		
		cliente = tiendaElectronica.crearCliente(nombre,identificacion,telefono);
		
		//La verificacion de null lo hace el controlodador
		return cliente;
		
		
	}

	public boolean eliminarCliente(String identificacion) {
		// TODO Auto-generated method stub
		return tiendaElectronica.eliminarCliente(identificacion);
	}

//	public boolean actualizarCliente(String identificacionActual, String nombre, String identificacion, String telefono) {
//		// TODO Auto-generated method stub
//		return tiendaElectronica.actualizarCliente(identificacionActual,nombre,identificacion,telefono);
//	}

	public Cliente crearCliente(String nombre, String identificacion, String telefono, String direccion,
			String fechaNacimiento, String correo, String departamento, String ciudad) {
		
	    Cliente cliente = null;
		
		cliente = tiendaElectronica.crearCliente(nombre,identificacion,telefono,direccion,fechaNacimiento,correo,departamento,ciudad);
		
		return cliente;
	}

	public boolean actualizarCliente(String nombre, String identificacion, String telefono,
			String direccion, String fechaNacimiento, String correo, String departamento, String ciudad) {
		// TODO Auto-generated method stub
		 return tiendaElectronica.actualizarCliente(nombre,identificacion,telefono,direccion,fechaNacimiento,
				 correo,departamento,ciudad);
	}



	public Producto obtenercodigo(String codigo) {
		
		return tiendaElectronica.compararCodigo(codigo);
	}


}
