
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
public class menu {

     menu();

    private  class MENU {

        public MENU() {
        String cedula, nombre;
       int opc;      
       do {
         
       switch(opc)  {  
           
           case 1:
              cedula=JOptionPane.showInputDialog("ingrese el nombre");
              
            break;
            case 2:  
           break;
           case 3:
           break;    
           default:
            JOptionPane.showMessageDialog(null,"la opcion es carrecta");
        } 
       while(opc!=4);
       
    
    }
       }
    }
}

