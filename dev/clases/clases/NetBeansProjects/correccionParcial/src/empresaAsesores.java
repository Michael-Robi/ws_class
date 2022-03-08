
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class empresaAsesores {
    
    private Asesores as[];
   private registroAsesoria As[];
    private clientes listadoCliente[];
    private boolean encontrado;
    

    public void empresaAsesores() {
      //  cL = new clientes[3];

       as = new Asesores[3];
	    	   as[0]= new Asesores("1010064395","maria sanchez","7489785");
	    	   as[1]= new Asesores("1010064395","mario gonsalez","7489785");
	    	   as[2]= new Asesores("1010064395","melisa rodriguez","7489785");
                   
        listadoCliente = new clientes[3];
        listadoCliente[0] = new clientes("1004798832", "maria", "femenino");
        listadoCliente[1] = new clientes("1005678", "nicolas", "masculino");
        listadoCliente[2] = new clientes("1007689", "maria", "femenino");
         As= new registroAsesoria[3];
    }

    public clientes[] getlistadoCliente() {
        return listadoCliente;

    }

    public void setlistadoCliente(clientes[] listadoCliente) {
        this.listadoCliente = listadoCliente;
    }


}
