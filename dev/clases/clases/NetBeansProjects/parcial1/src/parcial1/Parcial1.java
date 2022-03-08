/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    

/**
 *
 * @author Home
 */
public class MenuPrincipal {

  

    public static void main(String[] args) {
        MenuPrincipal mpl = new MenuPrincipal();

        
        
        
    }

    public MenuPrincipal() {
        menu();
    }

    public void menu() {
        int opc;
 
        
       
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. agregar un vehiculo "
                    + "\n  2. agregar un cliente \n  3. hacer un alquiler 4. Salir "));

            switch (opc) {
                case 1:
                   
                    break;

                case 2:

                  

                    break;

                case 3:
                    


                        

                            }
                        

                    
                    //cL.setagregarCliente( 
                    break;

                
                default:
                    JOptionPane.showMessageDialog(null, "salir");
                    break;
        
        
        } while (opc != 4);
    

}

        
    
    

