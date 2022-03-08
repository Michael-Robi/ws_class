/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.a;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class MenuPrincipal {
    private Clientes cL;
    private clientesh sh;
    private EmpresaAsesores et;
    
    
public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
   
    MenuPrincipal mp = new MenuPrincipal();
    
    principal L= new principal();
   
      
    

    }

    public MenuPrincipal() {
     sh=new clientesh(); 
        menu();
      
    }

    public void menu() {
        int opc;
       String Asesores;
       int n,m;
       

       
       n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asesores"));
       m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clientes"));
       
     

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. agregar un vehiculo "
                    + "\n  2. agregar un cliente \n  3. hacer un alquiler 4. Salir "));

            switch (opc) {
                case 1:
               String cedula,nombre,sexo;     
                cedula=JOptionPane.showInputDialog("ingrese la cedula");
                nombre=JOptionPane.showInputDialog("ingrese el nombre");
                sexo=JOptionPane.showInputDialog("ingrese el sexo");
                 principal p= new principal();
                 cL=new Clientes(cedula, nombre, sexo);
                  
                  
                   for (int i = 0; i < sh.getListaclientes().length; i++) {
                       if(sh.getcliente(i).getCedula()==cedula){
                           
                       }
                 
break;
                   }
                case 2:

                  

                    break;
                   }
                case 3:
                   

                         

                                 
                        }

                    
                    //cL.setagregarCliente( 
                    break;

        
                default:
                    JOptionPane.showMessageDialog(null, "salir");
                    break;

        } while (opc != 4);
}
    
}
