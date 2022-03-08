package co.edu.uniquindio.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TiendaElectronica {

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Administrador> listaAdministardor;
	private ArrayList<Sede> listaSedes;
	private ArrayList<Ciudad> listaCiudades;
	private ArrayList<Producto> listaProducto;
	
	public TiendaElectronica(){

		inicializarDatos();
	}

	/**
	 * @return the listClientes
	 */
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	/**
	 * @param listClientes the listClientes to set
	 */
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public ArrayList<Sede> getListaSedes() {
		return listaSedes;
	}
	
	public void setListaSedes(ArrayList<Sede> listaSedes) {
		this.listaSedes = listaSedes;
	}
	
	public ArrayList<Administrador> getlistaAdministardor() {
		return listaAdministardor;
	}
	
	public void setListaAdmistrador(ArrayList<Administrador> listaAdministrador) {
		this.listaAdministardor = listaAdministrador;
	}
	
	public ArrayList<Ciudad> getListaCiudad(){
		return listaCiudades;
	}

	
	public void setListaCiudades(ArrayList<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}

	private void inicializarDatos(){

		ArrayList<Cliente> clientes = new ArrayList <Cliente>();


		Cliente cliente = new Cliente("Miguel","1097","311320","Cra23","2008-08-12","miguel@.com","Armenia","Quindio");
		clientes.add(cliente);

		//getListaClientes().add(cliente);

		cliente = new Cliente("Valeria","1098","310552","cra24","2012-11-10","vale@.com","Cali","Valle");
		clientes.add(cliente);

		//getListaClientes().add(cliente);
		cliente = new Cliente("Diana","3381","316870","Cra25","2010-07-10","Diana@.com","Armenia","Qundio");
		clientes.add(cliente);

		setListaClientes(clientes);

		//getListaClientes().add(cliente);
		
		ArrayList<Administrador> administradores = new ArrayList<Administrador>();
		
		Administrador administrador = new Administrador("Pedro","1097","311320","Cra23","9902020","miguel@.com","universidad");
		administradores.add(administrador);
		
		administrador = new Administrador("Juan","1098","311321","Cra25","9902021","miguel1@.com","Bachillerato");
		administradores.add(administrador);
		
		administrador = new Administrador("Carlos","1099","311321","Cra24","9902022","miguel2@.com","universidad");
		administradores.add(administrador);
		
		administrador = new Administrador("Carlos","1100","311322","Calle 23","9902023","carlos@.com","Bachillerato");
		administradores.add(administrador);
		
		administrador = new Administrador("Sergio","1101","311323","Calle 24","9902024","sergio@.com","Bachillerato");
		administradores.add(administrador);
		
		setListaAdmistrador(administradores);
		
		ArrayList<Sede> sedes = new ArrayList<Sede>();
		
		Sede sede = new Sede("Pereira","1");
		sedes.add(sede);
		
		sede = new Sede("Armenia","2");
		sedes.add(sede);
		
		sede = new Sede("Cali","3");
		sedes.add(sede);
		
		sede = new Sede("Bogota","4");
		sedes.add(sede);
	
		sede = new Sede("Medellin","5");
		sedes.add(sede);
		
		setListaSedes(sedes);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public  Cliente crearCliente(String nombre, String identificacion, String telefono) {

		Cliente cliente = null;

		//Verificar si el cliente existe
		cliente = obtenerCliente(identificacion);

		if(cliente == null){

			cliente = new Cliente();
			cliente.setNombre(nombre);
			cliente.setIdentificacion(identificacion);
			cliente.setTelefono(telefono);

			listaClientes.add(cliente);

			return cliente;
		}
		else{
			return null;

		}

	}

	private Cliente obtenerCliente(String identificacion) {

		for(Cliente cliente: listaClientes){

			if(cliente.getIdentificacion().equals(identificacion)){
				return cliente;
			}
		}

		return null;
	}
	
	private Sede obtenerSedes() {

		for(Sede sede: listaSedes){

			if(sede!=null){
				return sede;
			}
		}

		return null;
	}


	public boolean eliminarCliente(String identificacion) {

		Cliente cliente = null;

		//Verificar si el cliente existe
		cliente = obtenerCliente(identificacion);

		if(cliente != null){
			listaClientes.remove(cliente);
			return true;
		}
		else{
			return false;

		}

	}

//	public boolean actualizarCliente(String identificacionActual, String nombre, String identificacion,
//			String telefono) {
//
//		Cliente cliente = null;
//
//		//Verificar si el cliente existe
//		cliente = obtenerCliente(identificacionActual);
//
//		if(cliente != null){
//
//			cliente.setNombre(nombre);
//			cliente.setIdentificacion(identificacion);
//			cliente.setTelefono(telefono);
//
//			return true;
//		}
//		else{
//			return false;
//
//		}
//
//	}

	public Cliente crearCliente(String nombre, String identificacion, String telefono, String direccion,
			String fechaNacimiento, String correo, String departamento, String ciudad) {

		Cliente cliente = null;

		//Verificar si el cliente existe
		cliente = obtenerCliente(identificacion);

		if(cliente == null){

			cliente = new Cliente();
			cliente.setNombre(nombre);
			cliente.setIdentificacion(identificacion);
			cliente.setTelefono(telefono);
			cliente.setDireccion(direccion);
			cliente.setFechaNacimiento(fechaNacimiento);
			cliente.setCorreo(correo);
			cliente.setDepartamento(departamento);
			cliente.setCiudad(ciudad);

			listaClientes.add(cliente);

			return cliente;
		}
		else{
			return null;

		}
	}

	public boolean actualizarCliente(String nombre, String identificacion, String telefono,
			String direccion, String fechaNacimiento, String correo, String departamento, String ciudad) {
		
		Cliente cliente = null;

		//Verificar si el cliente existe
		cliente = obtenerCliente(identificacion);

		if(cliente != null){

			cliente.setNombre(nombre);
			cliente.setIdentificacion(identificacion);
			cliente.setTelefono(telefono);
			cliente.setDireccion(direccion);
			cliente.setCorreo(correo);
			cliente.setFechaNacimiento(fechaNacimiento);
			cliente.setTelefono(telefono);
			cliente.setCiudad(ciudad);
			cliente.setDepartamento(departamento);

			return true;
		}
		else{
			return false;

		}
	}
	
	public Producto compararCodigo(String codigo) {

		Producto producto = null;

		producto = productoVerificado(codigo);

		return producto;
	}

	// Producto_1
	private Producto productoVerificado(String codigo) {

		for (Producto producto : listaProducto) {

			if (producto.getCodigo().equals(codigo)) {
				return producto;
			}
		}

		return null;
	}

}
