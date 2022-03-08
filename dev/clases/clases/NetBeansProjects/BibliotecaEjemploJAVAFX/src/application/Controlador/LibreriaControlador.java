package application.Controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import application.Aplicacion;
import application.Clases.Biblioteca;
import application.Clases.Libro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LibreriaControlador {
	
	//Inicializar Clases
	Aplicacion aplicacion;
	
	private Libro libroEncontrado;
	private Libro LibroCreado;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnMostrarReservas;

    @FXML
    private ComboBox<String> cboBibliotecarioReserva;

    @FXML
    private Button btnAgregarLibro;

    @FXML
    private Button btnLimpiarCamposReserva;

    @FXML
    private ComboBox<String> cboGeneroEstudiante;

    @FXML
    private Button btnReservar;

    @FXML
    private TextArea txtAreaReserva;

    @FXML
    private Button btnActualizaLibro;

    @FXML
    private TextField txtIdentificacionLibro;

    @FXML
    private Button btnActualizarReserva;

    @FXML
    private Button btnActualizarEstudiante;

    @FXML
    private Button btnConsultarLibro;

    @FXML
    private Button btnLimpiarCamposLibro;

    @FXML
    private TextField txtAutorLibro;

    @FXML
    private TextField txtIdentificacionReserva;

    @FXML
    private Button btnEliminarReserva;

    @FXML
    private TextArea txtAreaEstudiante;

    @FXML
    private TextField txtCedulaEstudiante;

    @FXML
    private TextField txtNombreLibroReserva;

    @FXML
    private Button btnEliminarEstudiante;

    @FXML
    private TextField txtEstudianteReserva;

    @FXML
    private TextField txtNombreLibro;

    @FXML
    private Button btnMostrarLibros;

    @FXML
    private Button btnMostrarEstudiantes;

    @FXML
    private ComboBox<String> cboCategoriaLibro;

    @FXML
    private Button btnAgregarEstudiante;

    @FXML
    private Button btnEliminarLibro;

    @FXML
    private TextField txtApellidoEstudiante;

    @FXML
    private Button btnLimpiarCamposEstudiante;

    @FXML
    private TextArea txtAreaLibro;

    @FXML
    private TextField txtNombreEstudiante;

    @FXML
    void btnAgregarLibro(ActionEvent event) {
    	String id = txtIdentificacionLibro.getText();
    	String nombre = txtNombreLibro.getText();
    	String autor = txtAutorLibro.getText();
    	String categoria = cboCategoriaLibro.getSelectionModel().getSelectedItem();
    	
    	AgregarLibro(id,nombre,autor,categoria);
    }

	@FXML
    void cboCategoriaLibro(ActionEvent event) {

    }

    @FXML
    void btnMostrarLibros(ActionEvent event) {
    	MostrarLibros();
    }

    @FXML
    void btnActualizaLibro(ActionEvent event) {
    	String id = txtIdentificacionLibro.getText();
    	String nombre = txtNombreLibro.getText();
    	String autor = txtAutorLibro.getText();
    	String categoria = cboCategoriaLibro.getSelectionModel().getSelectedItem();
    	
    	ActualizarLibro(id,nombre,autor,categoria);
    }

	@FXML
    void btnEliminarLibro(ActionEvent event) {
		String id = txtIdentificacionLibro.getText();
    	EliminarLibro(id);
    }

	@FXML
    void btnConsultarLibro(ActionEvent event) {
    	String id = txtIdentificacionLibro.getText();
    	ConsultarLibro(id);
    }

	@FXML
    void btnLimpiarCamposLibro(ActionEvent event) {
    	LimpiarCamposLibro();
    }

	@FXML
    void cboGeneroEstudiante(ActionEvent event) {

    }

    @FXML
    void btnLimpiarCamposEstudiante(ActionEvent event) {
    	LimpiarCamposEstudiante();
    }

	@FXML
    void btnEliminarEstudiante(ActionEvent event) {

    }

    @FXML
    void btnActualizarEstudiante(ActionEvent event) {

    }

    @FXML
    void btnMostrarEstudiantes(ActionEvent event) {
    	MostrarEstudiantes();
    }

    @FXML
    void btnAgregarEstudiante(ActionEvent event) {

    }

    @FXML
    void btnReservar(ActionEvent event) {

    }

    @FXML
    void btnMostrarReservas(ActionEvent event) {
    	MostrarReservas();
    }

    @FXML
    void btnActualizarReserva(ActionEvent event) {

    }

    @FXML
    void btnEliminarReserva(ActionEvent event) {

    }

    @FXML
    void cboBibliotecarioReserva(ActionEvent event) {

    }

    @FXML
    void btnLimpiarCamposReserva(ActionEvent event) {
    	LimpiarCamposReserva();
    }

	@FXML
    void initialize() {
    	
    	//Inicializar Combobox
    	ObservableList<String> listaCategoriaLibro = FXCollections.observableArrayList();
    	ObservableList<String> listaGeneroEstudiante = FXCollections.observableArrayList();
    	ObservableList<String> listaBibliotecario = FXCollections.observableArrayList();
    	
    	listaCategoriaLibro.addAll("Novelas","Infantiles","Matematicas","Cuentos");
    	listaGeneroEstudiante.addAll("Femenino","Masculino");
    	listaBibliotecario.addAll("Carlos","Arturo","Sandra","Liliana");
		
		cboCategoriaLibro.setItems(listaCategoriaLibro);
		cboGeneroEstudiante.setItems(listaGeneroEstudiante);
		cboBibliotecarioReserva.setItems(listaBibliotecario);
    }
	
	public void setAplicacion(Aplicacion aplicacion) {//Modificar Aplicación
		this.aplicacion = aplicacion;
	}
	
	//Metodos Interfaz
	private void LimpiarCamposReserva() {
		txtIdentificacionReserva.setText("");
		txtNombreLibroReserva.setText("");
		txtEstudianteReserva.setText("");
		cboBibliotecarioReserva.getSelectionModel().clearSelection();
		txtAreaReserva.setText("");	
	}
	
    private void LimpiarCamposLibro() {
    	txtIdentificacionLibro.setText("");
    	txtNombreLibro.setText("");
    	txtAutorLibro.setText("");
    	cboCategoriaLibro.getSelectionModel().clearSelection();
    	txtAreaLibro.setText("");
	}
    
    private void LimpiarCamposEstudiante() {
    	txtCedulaEstudiante.setText("");
    	txtNombreEstudiante.setText("");
    	txtApellidoEstudiante.setText("");
    	cboGeneroEstudiante.getSelectionModel().clearSelection();
    	txtAreaEstudiante.setText("");
	}
    
    //Crud Libros
    private void ConsultarLibro(String id) {
    	libroEncontrado = null;
    	libroEncontrado = aplicacion.BuscarLibro(id);
    	
    	if (libroEncontrado != null) {
			txtIdentificacionLibro.setText(libroEncontrado.getIdentificacion());
	    	txtNombreLibro.setText(libroEncontrado.getNombre());
	    	txtAutorLibro.setText(libroEncontrado.getAutor());
	    	cboCategoriaLibro.getSelectionModel().select(libroEncontrado.getCategoria());
	    	txtAreaLibro.setText(libroEncontrado.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Libro No encontrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}	
	}
    
    private void AgregarLibro(String id, String nombre, String autor, String categoria) {
		LibroCreado = null;
		LibroCreado = aplicacion.crearLibro(id,nombre,autor,categoria);
    	
    	if (LibroCreado != null) {
    		txtAreaLibro.setText(LibroCreado.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Libro No creado el id: "+id+" ya existe", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
    
    private void ActualizarLibro(String id, String nombre, String autor, String categoria) {
		Boolean libroActualizado = false;
		
		libroActualizado = aplicacion.actualizarLibro(id,nombre,autor,categoria);
		
		if (libroActualizado != false) {
			JOptionPane.showMessageDialog(null, "Libro Actualizado");
		}else{
			JOptionPane.showMessageDialog(null, "Libro con id: "+id+" no se puede actualizar", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
    
    private void EliminarLibro(String id) {
    	Boolean libroEliminado = false;
    	
    	libroEliminado = aplicacion.eliminarLibro(id);
    	
    	if (libroEliminado != false) {
    		JOptionPane.showMessageDialog(null, "Libro Eliminado");
		} else {
			JOptionPane.showMessageDialog(null, "Libro con id: "+id+" no se puede eliminar", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
    
    private void MostrarLibros(){
    	txtAreaLibro.appendText("\n"+aplicacion.imprimirLibros());
    }
    
    private void MostrarEstudiantes(){
    	txtAreaEstudiante.appendText("\n"+aplicacion.imprimirEstudiante());
    }
    private void MostrarReservas(){
    	txtAreaReserva.appendText("\n"+aplicacion.imprimirReserva());
    }
}
