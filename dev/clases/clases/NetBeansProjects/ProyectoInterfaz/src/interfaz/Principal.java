/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author Home
 */
public class Principal {
    private avion avi;
    private superman boyacoman;
      
    
    public static void main (String [] args){
        Principal p = new Principal();
    }
    
    public Principal(){
        avi= new avion(2,100);
       boyacoman=new superman() ;
       
       
       
       JOptionPane.showMessageDialog(null, avi.arrancar());
       JOptionPane.showMessageDialog(null, boyacoman.arrancar());
       
       JOptionPane.showMessageDialog(null, avi.arrancar());
       JOptionPane.showMessageDialog(null, boyacoman.aterrizar());
       JOptionPane.showMessageDialog(null, avi.mostrarInventor());



       
       

       
    }
}
