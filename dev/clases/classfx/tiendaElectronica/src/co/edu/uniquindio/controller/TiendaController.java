package co.edu.uniquindio.controller;

import co.edu.uniquindio.Aplicacion;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Producto;
import co.edu.uniquindio.model.Sede;
import co.edu.uniquindio.model.Venta;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

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
import javafx.scene.layout.AnchorPane;
import javafx.util.StringConverter;

public class TiendaController {

	Aplicacion aplicacion;
	// Parecido a un array list pero observable
	ObservableList<Cliente> listaClientesData = FXCollections.observableArrayList();
	ObservableList<Producto> listaProductos = FXCollections.observableArrayList();
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
	private TableColumn<Producto, String> columnCodigo1;

	@FXML
	private Button btnAgregarProducto1;

	@FXML
	private TextField textProducto;

	// Combobox
	@FXML
	private ComboBox<String> textcomboDepartamento;

	// Calendario
	@FXML
	private DatePicker jcalFechaNacimiento;

	@FXML
	private TableColumn<Cliente, String> columnNombrelistAdministrativos;

	@FXML
	private TableColumn<Sede, String> columnSede1;

	@FXML
	private TableColumn<?, ?> columnSedeVenta2;

	@FXML
	private TableColumn<?, ?> columnSedeVenta1;

	@FXML
	private TextField textAdministrador;

	@FXML
	private Button buttonActualizarVenta;

	@FXML
	private TableColumn<Cliente, String> columnDireccion;

	@FXML
	private TableView<Cliente> tableClientes;

	@FXML
	private TableColumn<Cliente, String> columnTelefono;

	@FXML
	private Button btnActualizarProducto1;

	@FXML
	private TableView<Venta> tableMayorVenta;

	@FXML
	private TableColumn<Cliente, String> columnDepartamento;

	@FXML
	private TableColumn<Cliente, String> columnIdentificacionListAdministrativo;

	@FXML
	private Button btnAgregarCliente;

	@FXML
	private Button buttonBuscarRango1;

	@FXML
	private Button buttonBuscarRango2;

	@FXML
	private ComboBox<Sede> ComboBoxSedeAdministrativo;

	@FXML
	private Button btnNuevoCliente;

	@FXML
	private TextField textTelefonoCliente;

	@FXML
	private TableColumn<?, ?> columnDepartamentoVenta1;

	@FXML
	private TextField textDireccionCliente;

	@FXML
	private Button buttonEliminarVenta;

	@FXML
	private TableColumn<?, ?> columnProductoVenta1;

	@FXML
	private TableColumn<Producto, String> columnProductosDisponibles;

	@FXML
	private TableColumn<?, ?> columnCodigoVenta1;

	@FXML
	private TableColumn<?, ?> columnVentas1;

	@FXML
	private TableColumn<Producto, String> columnProducto1;

	@FXML
	private TableColumn<Producto, String> columnCantidadListAdministrativos;

	@FXML
	private Button btnEliminarCliente;

	@FXML
	private TableColumn<?, ?> columnClienteVenta1;

	@FXML
	private TableView<Producto> tableProductos;

	@FXML
	private TableView<?> tableInfoSedeVenta;

	@FXML
	private ComboBox<?> ComboBoxClienteVenta1;

	@FXML
	private TableColumn<?, ?> columnTipoVenta1;

	@FXML
	private TextField textRango2;

	@FXML
	private TextField textRango1;

	@FXML
	private AnchorPane textcomboTipoProducto;

	@FXML
	private TableColumn<?, ?> columnCodigoListAdministrativos;

	@FXML
	private ComboBox<?> ComboBoxSedeVenta1;

	@FXML
	private TableView<Producto> tableProductoMasVendido;

	@FXML
	private ComboBox<?> textComboTipoProducto;

	@FXML
	private TableColumn<?, ?> columnCodigoAdmistrativo;

	@FXML
	private TableColumn<?, ?> columnTipoProdcutoVenta;

	@FXML
	private TableColumn<?, ?> columnCantidadVenta1;

	@FXML
	private TableView<Producto> tableProductosDisponibles;

	@FXML
	private TableColumn<?, ?> columnIdentificacion;

	@FXML
	private TableColumn<Producto, String> columnTipoProductolist1;

	@FXML
	private TableColumn<Cliente, String> columnCorreo;

	@FXML
	private TextField textCodigo1;

	@FXML
	private TextField textCodigo;

	@FXML
	private TextField TextCantidadVenta;

	@FXML
	private TableColumn<?, ?> columnIdentificacionVenta;

	@FXML
	private TextField textNombreCliente;

	@FXML
	private TableColumn<Producto, String> columnDisponibilidad;

	@FXML
	private TableColumn<Cliente, String> columnFechaNacimiento;

	@FXML
	private TableColumn<?, ?> columnPrecioAdministrativo2;

	@FXML
	private Button btnActualizarCliente;

	@FXML
	private TableColumn<Producto, String> columnProductolist1;

	@FXML
	private Button buttonBuscarCodigo;

	@FXML
	private ComboBox<String> textcomboCiudades;

	@FXML
	private TableColumn<Cliente, String> columnNombre;

	@FXML
	private TableColumn<?, ?> columnPrecioAdministrativo1;

	@FXML
	private TextField textIdentificacionCliente;

	@FXML
	private TableColumn<Sede, String> columnCiudad;

	@FXML
	private Button buttonRealizarVenta;

	@FXML
	private TableColumn<Producto, String> columnTipoProducto1;

	@FXML
	private Button btnEliminarProducto;

	@FXML
	private TableView<?> tableListVentas;

	@FXML
	private TextField textCorreoCliente;

	@FXML
	private Button btnNuevoproducto1;

	@FXML
	private ComboBox<?> textcomboSede;

	@FXML
	void btnNuevoEvent(ActionEvent event) {
		limpiarCamposTexto();
	}

	@FXML
	void btnAgregarEvent(ActionEvent event) {
		agregarCliente();
	}

	@FXML
	void btnActualizarEvent(ActionEvent event) {
		actualizarCliente();
	}

	@FXML
	void btnEliminarEvent(ActionEvent event) {
		eliminarCliente();
	}

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
	void textcomboDepartamentoEvent(ActionEvent event) {

	}

	@FXML
	void textcomboCiudadesEvent(ActionEvent event) {
		int opc = textcomboCiudades.getSelectionModel().getSelectedIndex();

		if (opc == 0) {
			textcomboDepartamento.getSelectionModel().select(0);
		}
		if (opc == 1) {
			textcomboDepartamento.getSelectionModel().select(1);
		}
		if (opc == 2) {
			textcomboDepartamento.getSelectionModel().select(2);
		}
		if (opc == 3) {
			textcomboDepartamento.getSelectionModel().select(3);
		}
		if (opc == 4) {
			textcomboDepartamento.getSelectionModel().select(4);
		}
	}

	@FXML
	void comboboxArraySede(ActionEvent event) {

	}

	@FXML
	void combobocTipoProducto(ActionEvent event) {

	}

	@FXML
	private TableColumn<Producto, String> columnCodigoAdministrativo2;

	@FXML
	private TableColumn<Producto, String> columnCodigoAdmistrativo1;

	@FXML
	void btnEliminarEvent1(ActionEvent event) {

	}

	@FXML
	void ComboBoxSedeVenta(ActionEvent event) {

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
	void ComboBoxClienteVentas(ActionEvent event) {

	}

	@FXML
	void actionBuscar_Por_Rango1(ActionEvent event) {

	}

	@FXML
	void actionBuscar_Por_Codigo(ActionEvent event) {
		buscarCodigo();
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

		this.jcalFechaNacimiento.setConverter(new StringConverter<LocalDate>() {
			String pattern = "yyyy-MM-dd";
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

			{
				jcalFechaNacimiento.setPromptText(pattern.toLowerCase());
			}

			@Override
			public String toString(LocalDate date) {
				if (date != null) {
					return dateFormatter.format(date);
				} else {
					return "";
				}
			}

			@Override
			public LocalDate fromString(String string) {
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
		});

		ObservableList<String> listaCiudades = FXCollections.observableArrayList();
		ObservableList<String> listaDepartamentos = FXCollections.observableArrayList();
		listaCiudades.addAll("Armenia", "Pereira", "Cali", "Bogota", "Pasto");
		listaDepartamentos.addAll("Quindio", "Risaralda", "Valle", "Santafe", "Nari???o");

		textcomboCiudades.setItems(listaCiudades);
		textcomboDepartamento.setItems(listaDepartamentos);

		textCodigo1.setText("25001");

	}

	@FXML
	void initializeAdministrativo() {

		this.columnCodigoAdmistrativo1.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		this.columnTipoProductolist1.setCellValueFactory(new PropertyValueFactory<>("tipoProducto"));
		this.columnProductolist1.setCellValueFactory(new PropertyValueFactory<>("nombre"));

		tableProductoMasVendido.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			productoSeleccionado = newSelection;
			mostrarInformacionProducto(productoSeleccionado);
		});

	}

	private void mostrarInformacionProducto(Producto productoSelecionado) {

		if (productoSelecionado != null) {

			columnCodigoAdmistrativo1.setText(productoSelecionado.getCodigo());
			columnTipoProductolist1.setText(productoSelecionado.getTipoProducto());
			columnProductolist1.setText(productoSelecionado.getNombre());

		}

	}

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

	public ObservableList<Producto> getListaProductos() {

		listaProductos.addAll(aplicacion.obtenerProductos());
		return listaProductos;
	}

	private void mostrarInformacionCliente(Cliente clienteSeleccionado) {

		if (clienteSeleccionado != null) {
			textNombreCliente.setText(clienteSeleccionado.getNombre());
			textIdentificacionCliente.setText(clienteSeleccionado.getIdentificacion());
			textTelefonoCliente.setText(clienteSeleccionado.getTelefono());
			textDireccionCliente.setText(clienteSeleccionado.getDireccion());
			textCorreoCliente.setText(clienteSeleccionado.getCorreo());
			jcalFechaNacimiento.setValue(LocalDate.parse(clienteSeleccionado.getFechaNacimiento()));
			textcomboCiudades.getSelectionModel().select(clienteSeleccionado.getCiudad());
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
		String fechaNacimiento = jcalFechaNacimiento.getValue().toString();
		String correo = textCorreoCliente.getText();
		String departamento = textcomboDepartamento.getSelectionModel().getSelectedItem();
		String ciudad = textcomboCiudades.getSelectionModel().getSelectedItem();

		// Se valida la informacion
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
		textCorreoCliente.setText("");
		textcomboDepartamento.getSelectionModel().clearSelection();
		textcomboCiudades.getSelectionModel().clearSelection();
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
		String fechaNacimiento = jcalFechaNacimiento.getValue().toString();
		String correo = textCorreoCliente.getText();
		String departamento = textcomboDepartamento.getSelectionModel().getSelectedItem();
		String ciudad = textcomboCiudades.getSelectionModel().getSelectedItem();

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

	private void buscarRango(TextField textRango12) {

	}

	private void buscarCodigo() {
		Producto compararCodigo = null;

		String codigo = textCodigo1.getText();

		compararCodigo = aplicacion.obtenercodigo(codigo);

		listaProductos.add(compararCodigo);

		for (Producto producto : listaProductos) {
			// System.out.println(producto.getNombre());
		}
		// System.out.println(compararCodigo);

		if (compararCodigo != null) {

			mostrarInformacionProducto(compararCodigo);

		}

	}
}
