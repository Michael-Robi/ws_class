package co.edu.uniquindio.controller;

import co.edu.uniquindio.Aplicacion;
import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Producto;
import co.edu.uniquindio.model.Sede;
import co.edu.uniquindio.model.TiendaElectronica;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.StringConverter;
//import javafx.scene.layout.AnchorPane;

public class TiendaController {

	Aplicacion aplicacion;
	// Parecido a un array list pero observable
	ObservableList<Cliente> listaClientesData = FXCollections.observableArrayList();
	ObservableList<Sede> listaSedesData = FXCollections.observableArrayList();
	ObservableList<Producto> listaProductos =  FXCollections.observableArrayList();

	// Es para seleccionar un cliente
	Cliente clienteSeleccionado;
	Producto productoSeleccionado;

	// Es bueno tener casi el 100% de la interfaz antes de traer
	// el codigo de la interfaz

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField textIdentificacionCliente;

	@FXML
	private TextField textNombreCliente;

	@FXML
	private TextField textTelefonoCliente;

	@FXML
	private TextField textDireccionCliente;

	@FXML
	private TextField textFechaNacimientoCliente;

	@FXML
	private TextField textCorreoCliente;

	@FXML
	private TextField textCiudadCliente;

	@FXML
	private TextField textDepartamentoCliente;
	
	@FXML
	private TextField textCodigo1;

	// Combobox
	@FXML
	private ComboBox<String> textcomboDepartamento;
	
	@FXML
	private ComboBox<?> ComboBoxSedeVenta1;

	// Calendario
	@FXML
	private DatePicker jcalFechaNacimiento;

	@FXML
	private Button btnAgregarCliente;

	@FXML
	private Button btnActualizarCliente;

	@FXML
	private Button btnLimpiar;

	@FXML
	private TableView<Cliente> tableClientes;

	@FXML
	private TableColumn<Cliente, String> columnIdentificacion;

	@FXML
	private TableColumn<Cliente, String> columnNombre;

	@FXML
	private TableColumn<Cliente, String> columnTelefono;

	@FXML
	private TableColumn<Cliente, String> columnDireccion;

	@FXML
	private TableColumn<Cliente, String> columnFechaNacimiento;

	@FXML
	private TableColumn<Cliente, String> columnCorreo;

	@FXML
	private TableColumn<Cliente, String> columnCiudad;

	@FXML
	private TableColumn<Cliente, String> columnDepartamento;

	@FXML
	private Button btnEliminarCliente;

	@FXML
	private TableColumn<Producto, String> columnCodigo1;

	@FXML
	private Button btnAgregarProducto1;

	@FXML
	private TextField textProducto;
	
	@FXML
	private Button btnNuevoEvent;
	
	@FXML
    void btnNuevoEvent(ActionEvent event) {
		nuevoCliente();
    }
	
	private void nuevoCliente() {

		textNombreCliente.setText("Ingrese Nombre");
		textIdentificacionCliente.setText("Ingrese Identificacion");
		textTelefonoCliente.setText("Ingrese telefono");
		textDireccionCliente.setText("Ingrese direccion");
		textCorreoCliente.setText("Ingrese correo");
		textFechaNacimientoCliente.setText("Ingrese fecha nacimiento");
		textCiudadCliente.setText("Ingrese ciudad");
		textDepartamentoCliente.setText("Ingrese departamento");

	}

	@FXML
	private TableColumn<Producto, String> columnSede1;
	
	@FXML
	private TableColumn<Producto, String> columnCodigoAdministrativo2;

	@FXML
	private TableColumn<Producto, String> columnCodigoAdmistrativo1;

	@FXML
	private TextField textAdministrador;

	@FXML
	private ComboBox<?> textComboTipoProducto;

	@FXML
	private Button btnActualizarProducto1;

	@FXML
	private TextField textCodigo;

	@FXML
	private TableColumn<Producto, String> columnProducto1;

	@FXML
	private TableColumn<Producto, String> columnTipoProducto1;
	
	@FXML
	private TableColumn<Producto, String> columnTipoProductolist1;
	
	@FXML
	private TableColumn<Producto, String> columnProductolist1;

	@FXML
	private Button btnEliminarProducto;

	@FXML
	private Button btnNuevoproducto1;

	@FXML
	private TableView<Producto> tableProductos;

	@FXML
	void btnNuevoProductoEvent(ActionEvent event) {

	}

	@FXML
	void btnAgregarProductoEvent(ActionEvent event) {

	}

	@FXML
	void btnActualizarProductoEvent(ActionEvent event) {

	}

	@FXML
	void comboboxArraySede(ActionEvent event) {

	}

	@FXML
	void combobocTipoProducto(ActionEvent event) {

	}

	@FXML
	void combobocTipoDepartamento(ActionEvent event) {

	}
	
	@FXML
	void ComboBoxSedeVenta(ActionEvent event) {

	}
	
	@FXML
	void actionBuscar_Por_Rango1(ActionEvent event) {

	}

	public TiendaController() {

	}

	@FXML
	void btnActualizarEvent(ActionEvent event) {

		actualizarCliente();
	}

	@FXML
	void btnAgregarEvent(ActionEvent event) {

		agregarCliente();

	}

	@FXML
	void btnEliminarEvent(ActionEvent event) {

		eliminarCliente();
	}

	@FXML
	void btnLimpiarEvent(ActionEvent event) {
		limpiarCamposTexto();
	}
	


	@FXML
	void eventtextcomboDepartamento(ActionEvent event) {

	}
	
	@FXML
	void btnEliminarVentaEvent(ActionEvent event) {

	}
	
	@FXML
	void btnActualizarVentaEvent(ActionEvent event) {

	}

	@FXML
	void btnRealizarVentaEvent(ActionEvent event) {

	}
	
	@FXML
	void actionBuscar_Por_Codigo(ActionEvent event) {
		buscarCodigo();
	}
	
	@FXML
	void ComboBoxClienteVentas(ActionEvent event) {

	}
	
	@FXML
	void actionBuscar_Por_Rango2(ActionEvent event) {

	}
	
	@FXML
	void ComboBoxSedeAdministrativos(ActionEvent event) {

	}

	@FXML
	void initialize() {

		// Esta propiedad setea los datos que se le manda desde el modelo, se enlaza con
		// el modelo.
		// Por eso se le envian los parametros con los mismos nombres
		// Aqui se identifca donde va cada variable
		this.columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
		this.columnTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
		this.columnDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
		this.columnFechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
		this.columnCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
		this.columnCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
		this.columnDepartamento.setCellValueFactory(new PropertyValueFactory<>("departamento"));

		this.columnCodigo1.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		this.columnProducto1.setCellValueFactory(new PropertyValueFactory<>("producto "));
		this.columnTipoProducto1.setCellValueFactory(new PropertyValueFactory<>("tipoProducto"));
		this.columnSede1.setCellValueFactory(new PropertyValueFactory<>("sede"));
		
		this.jcalFechaNacimiento.setConverter(new StringConverter<LocalDate>() {
			 String pattern = "yyyy-MM-dd";
			 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

			 {
				 jcalFechaNacimiento.setPromptText(pattern.toLowerCase());
			 }

			 @Override public String toString(LocalDate date) {
			     if (date != null) {
			         return dateFormatter.format(date);
			     } else {
			         return "";
			     }
			 }

			 @Override public LocalDate fromString(String string) {
			     if (string != null && !string.isEmpty()) {
			         return LocalDate.parse(string, dateFormatter);
			     } else {
			         return null;
			     }
			 }
			});

		// Es un evento para captar un objeto seleccionado de la tabla o seleccion de la
		// tabla,
		// Cuando se genera se llama al metodo mostrarInformacion
		tableClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {

			clienteSeleccionado = newSelection;
			mostrarInformacionCliente(clienteSeleccionado);

			ObservableList<String> listaCiudades = FXCollections.observableArrayList();
			listaCiudades.addAll("Armenia", "Pereira", "Bogota", "Cali", "Pasto");
			textcomboDepartamento.setItems(listaCiudades);
		});

	}

	// tableProductos.getSelectionModel().selectedItemProperty().addListener((obs,
	// oldSelection, newSelection) -> {
	//
	//
	// }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
		// Este metodo limpia la tabla
		tableClientes.getItems().clear();
		// Se setean los items
		tableClientes.setItems(getListaClientesData());

	}

	public ObservableList<Cliente> getListaClientesData() {

		listaClientesData.addAll(aplicacion.obtenerClientes());
		return listaClientesData;
	}

	public ObservableList<Sede> getListaSedeData() {
		listaSedesData.addAll(aplicacion.obtenerSedes());
		return listaSedesData;
	}

	private void mostrarInformacionCliente(Cliente clienteSeleccionado) {
		
		if (clienteSeleccionado != null) {
			textNombreCliente.setText(clienteSeleccionado.getNombre());
			textIdentificacionCliente.setText(clienteSeleccionado.getIdentificacion());
			textTelefonoCliente.setText(clienteSeleccionado.getTelefono());
			textDireccionCliente.setText(clienteSeleccionado.getDireccion());
			textCorreoCliente.setText(clienteSeleccionado.getCorreo());
			textFechaNacimientoCliente.setText(clienteSeleccionado.getFechaNacimiento());
			textCiudadCliente.setText(clienteSeleccionado.getCiudad());
			textDepartamentoCliente.setText(clienteSeleccionado.getDepartamento());
			jcalFechaNacimiento.setValue(LocalDate.parse(clienteSeleccionado.getFechaNacimiento()));
			textcomboDepartamento.getSelectionModel().select(clienteSeleccionado.getDepartamento());
		}
	}
	
	private void agregarCliente() {

		// Primero se capturan los datos

		// Si se requiere un entero, se parsea
		String nombre = textNombreCliente.getText();
		String identificacion = textIdentificacionCliente.getText();
		String telefono = textTelefonoCliente.getText();
		String direccion = textDireccionCliente.getText();
		String fechaNacimiento = textFechaNacimientoCliente.getText();
		String correo = textCorreoCliente.getText();
		String departamento = textDepartamentoCliente.getText();
		String ciudad = textCiudadCliente.getText();
		
		System.out.println(jcalFechaNacimiento.getValue());
		System.out.println("sjsjkdjskjdsjk");

		 //Se valida la informacion
		if (validarDatos(nombre, identificacion, telefono, direccion, fechaNacimiento, correo, departamento, ciudad)) {

			// Se crea un cliente
			Cliente cliente = null;

			cliente = aplicacion.crearCliente(nombre, identificacion, telefono, direccion, fechaNacimiento, correo, departamento,
					ciudad);

			if (cliente != null) {
				listaClientesData.add(cliente);
				limpiarCamposTexto();
				mostrarMensaje("Notificacion Cliente", "Cliente registrado", "El cliente se ha registrado con exito",
						AlertType.INFORMATION);
			} else {
				mostrarMensaje("Notificacion Cliente", "Cliente no registrado", "El cliente no se registro", AlertType.INFORMATION);
			}

		}

		// Registrar
	}

	private void limpiarCamposTexto() {

		textNombreCliente.setText("");
		textIdentificacionCliente.setText("");
		textTelefonoCliente.setText("");
		textDireccionCliente.setText("");
		textDepartamentoCliente.setText("");
		textCiudadCliente.setText("");
		textFechaNacimientoCliente.setText("");
		textCorreoCliente.setText("");
		textcomboDepartamento.getSelectionModel().clearSelection();
		jcalFechaNacimiento.setValue(null);

	}

	private void eliminarCliente() {

		boolean flagClienteEliminado = false;
		if (clienteSeleccionado != null) {
			flagClienteEliminado = aplicacion.eliminarCliente(clienteSeleccionado.getIdentificacion());

			if (mostrarMensajeConfirmacion("???Esta seguro de eliminar el cliente?") == true) {

				if (flagClienteEliminado == true) {
					listaClientesData.remove(clienteSeleccionado);
					clienteSeleccionado = null;
					// Quita la seleccion de la tabla
					tableClientes.getSelectionModel().clearSelection();
					limpiarCamposTexto();
					mostrarMensaje("Notificacion Cliente", "Cliente eliminado", "El cliente se ha elimnado con exito",
							AlertType.WARNING);

				} else {

					mostrarMensaje("Notificacion Cliente", "Cliente no eliminado", "El cliente no se puede eliminar",
							AlertType.WARNING);

				}
			}

		} else {
			mostrarMensaje("Notificacion Cliente", "Cliente no seleccionado", "Debe seleccionar un cliente", AlertType.WARNING);

		}

	}

	private boolean mostrarMensajeConfirmacion(String mensaje) {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle(null);
		alert.setHeaderText("Confirmacion");
		alert.setContentText(mensaje);
		Optional<ButtonType> action = alert.showAndWait();

		if (action.get() == ButtonType.OK) {
			return true;
		} else {

			return false;
		}
	}

	private void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

		Alert alert = new Alert(alertType);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();

	}

	private boolean validarDatos(String nombre, String identificacion, String telefono, String direccion,
			String fechaNacimiento, String correo, String departamento, String ciudad) {

		String mensaje = "";
		if (nombre == null || nombre.equals("")) {
			mensaje += "El nombre es invalido \n";
		}

		if (identificacion == null || identificacion.equals("")) {
			mensaje += "El nombre es invalido \n";
		}
		if (telefono == null || telefono.equals("")) {
			mensaje += "El nombre es invalido \n";
		}
		if (direccion == null || direccion.equals("")) {
			mensaje += "La direccion es invalida \n";
		}
		if (fechaNacimiento == null || fechaNacimiento.equals("")) {
			mensaje += "La fecha de nacimiento es invalida \n";
		}
		if (correo == null || correo.equals("")) {
			mensaje += "El correo es invalido \n";
		}
		if (departamento == null || departamento.equals("")) {
			departamento += "El departamento es invalido \n";
		}

		if (ciudad == null || ciudad.equals("")) {
			mensaje += "La ciudad es invalida \n";
		}

		if (mensaje.equals("")) {
			return true;
		} else {

			mostrarMensaje("Notificacion Cliente", "Datos invalidos", mensaje, AlertType.WARNING);
		}

		return false;
	}

	private void actualizarCliente() {

		String nombre = textNombreCliente.getText();
		String identificacion = textIdentificacionCliente.getText();
		String telefono = textTelefonoCliente.getText();
		String direccion = textDireccionCliente.getText();
		String fechaNacimiento = textDireccionCliente.getText();
		String correo = textCorreoCliente.getText();
		String departamento = textDepartamentoCliente.getText();
		String ciudad = textCiudadCliente.getText();

		boolean flagClienteActualizado = false;
		if (clienteSeleccionado != null) {

			if (validarDatos(nombre, identificacion, telefono, direccion, fechaNacimiento, correo, departamento, ciudad)) {

				flagClienteActualizado = aplicacion.actualizarCliente(nombre, identificacion, telefono, direccion, fechaNacimiento,
						correo, departamento, ciudad);

				if (flagClienteActualizado == true) {
					tableClientes.refresh();

					mostrarMensaje("Notificacion Cliente", "Cliente  actualizado", "El cliente se ha actualizado con exito",
							AlertType.WARNING);

				} else {
					mostrarMensaje("Notificacion Cliente", "Cliente no actualizado", "El cliente no se ha actualizado",
							AlertType.WARNING);
				}

			}

		} else {
			mostrarMensaje("Notificacion Cliente", "Cliente no seleccionado", "Por favor seleccione un cliente",
					AlertType.WARNING);
		}

	}
	
	private void buscarCodigo() {
		Producto compararCodigo = null;

			String codigo = textCodigo1.getText();

			compararCodigo = aplicacion.obtenercodigo(codigo);
			
			listaProductos.add(compararCodigo);
			
			
			
		for (Producto producto : listaProductos) {		
				System.out.println(producto.getNombre());
			}
//			System.out.println(compararCodigo);

			if (compararCodigo != null) {
				
				mostrarInformacionProducto(compararCodigo);
				

			}

	}
	
	private void mostrarInformacionProducto(Producto productoSelecionado) {
		
		
		if (productoSelecionado != null) {

			columnCodigoAdmistrativo1.setText(productoSelecionado.getCodigo());
			columnTipoProductolist1.setText(productoSelecionado.getTipoProducto());
			columnProductolist1.setText(productoSelecionado.getNombre());

		}

	}
	
	}
