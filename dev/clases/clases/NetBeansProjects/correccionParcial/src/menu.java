
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

    private empresaAsesores et;
    private registroAsesoria as;

    public static void main(String[] args) {
        menu mp = new menu();

    }

    public menu() {
      et=new empresaAsesores()  ;
        menu2();

    }

    public void menu2() {
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. agregar un cliente  "
                    + "\n  2. valor a pagar \n  3. Salir "));

            switch (opc) {
                case 1:
                String cedula = JOptionPane.showInputDialog("Digite la cedula del cliente");
            
                et.
             
                    buscarCliente(cedula);
                    break;

                case 2:
                    
                 int horas =Integer.parseInt(JOptionPane.showInputDialog("horas "));
                 double retorno =as.costoAsesoria(horas);
                 
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "salir");
                    break;

            }
        } while (opc != 3);

    }
        public clientes buscarCliente(String cedula) {
            
            
          String c = JOptionPane.showInputDialog("Ingrese la cedula del cliente: ");
                  boolean encontrado = false;
                  clientes [] clientes = et.getlistadoCliente(); 
        
       
        clientes cL = null;
        
        for (int i = 0; i < et.getlistadoCliente().length-1; i++) {

            if (et.getlistadoCliente()[i].getCedula().equals(cedula)) {
                cL=et.getlistadoCliente()[i];
                break;

            }

        }
        if (cL==null){
         JOptionPane.showMessageDialog(null,"usuario no existe");
        }
        return cL;
        }
}
