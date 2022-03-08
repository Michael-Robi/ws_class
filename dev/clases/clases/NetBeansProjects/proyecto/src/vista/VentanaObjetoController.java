/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Objetos.Amigos;
import Objetos.Estudiante;
import Objetos.libros;
import Objetos.revistas;
import Objetos.videos;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Home
 */
public class VentanaObjetoController implements Initializable {

    private Estudiante estudianteActual;

    @FXML
    private ComboBox<libros> comboboxLibro;

    @FXML
    private TextField txtFechaFin;

    @FXML
    private TextField txtFechaInicio;

    @FXML
    private TextField txtNumero;

    @FXML
    private Button btnBuscar;

    @FXML
    private TextField txtnombre;
     @FXML
    private TextField txtnumPaginas;
    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtnombreRevista;
     
     @FXML
    private TextField txtcodigoRevista;
     
    @FXML
    private TextField txtvalor;
    @FXML
    private ComboBox<revistas> comboboxRevista;
    @FXML
    private ComboBox<videos> comboboxVideos;
              @FXML
    private Button btnAgregarLibro;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void agregarEstudiante() {
        estudianteActual.getListaAmigos().add(new Amigos(txtnombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCedula.getText()));

    } 

    public void agregarLibro() {

        estudianteActual.getListaLibros().add(new libros(123, "1234", "pabre rico y padre pobre", 12345, "papel"));
        estudianteActual.getListaLibros().add(new libros(12, "4567", "cien años de soledad", 7895, "barco"));
        estudianteActual.getListaLibros().add(new libros (34,"4567","el principito",5678,"mirahadas"));
        estudianteActual.getListaLibros().add(new libros (24,"7895","la ladrona de libros",10280,"mirahadas"));

    }

    public void obtenerLibros() {
        comboboxLibro.setItems((ObservableList<libros>) estudianteActual.getListaLibros());
        
    }
    public boolean btnAgregarLibro () //"Libro1" "Libro1"
        
    {
        boolean encontrado=true;
        
        
        
        if(libros. == txtnumPaginas){
            
        } else{
          encontrado= false;     
        }
        
        return encontrado;
    }
    public void agregarRevista() {

        estudianteActual.getListaRevista().add(new revistas(LocalDate.of(2021, 11, 01),"4567","Pacifica" ,Double.parseDouble("1234") ));
        estudianteActual.getListaRevista().add(new revistas(LocalDate.of(2021, 12,11 ),"89000","Carmel" ,Double.parseDouble("20000") ));
        estudianteActual.getListaRevista().add(new revistas(LocalDate.of(2021, 12,11 ),"40000","la Semana" ,Double.parseDouble("18590") ));
    }
    public void obtenerRevista(){
       comboboxRevista.setItems((ObservableList<revistas>)estudianteActual.getListaRevista());
    }
    public void agregarVideos(){
        estudianteActual.getListaVideos().add(new videos (123,"padres de familia","soledad",Double.parseDouble("400000")));
        
    }
    public void obteneterVideos(){
        comboboxVideos.setItems((ObservableList<videos>)estudianteActual.getListaVideos());
    }

    public Estudiante getEstudianteActual() {
        return estudianteActual;
    }

    public void setEstudianteActual(Estudiante estudianteActual) {
        this.estudianteActual = estudianteActual;
    }

}
