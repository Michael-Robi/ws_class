/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import interfaz.*;

import javax.swing.JOptionPane;


/**
 *
 * @author Home
 */
public class principal1 {
    private circulo1 c;
    private cuadrado1 cu;
    private rectangulo rc;
    
    public static void main(String[] args) {
        principal1 p= new principal1();
}
    public principal1 (){
     menu()   ;
    }
public void menu(){
     int opc;
     double radio;
     double ac;
     double pc;
     double lado;
     double ancho;
     
     do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. circulo "
                    + "\n  cuadrado" + "\n  3.rectangulo" + "\n 4. Salir "));
            switch (opc) {
                case 1:
                    
                    radio= Double.parseDouble(JOptionPane.showInputDialog("radio"));
                    
                    c= new circulo1 (radio);
                    ac=c.calcularArea();
                    pc=c.calcularPerimetro();
                    
                    JOptionPane.showInputDialog(ac,pc);
               break;
                case 2:
                    
                 radio= Double.parseDouble(JOptionPane.showInputDialog("radio"));       
                        
                  cu=new cuadrado1 (radio) ;
                  ac=cu.CalcularArea();
                  pc=cu.calcularPerimetro();
                  
                  JOptionPane.showInputDialog(ac,pc);

                break;
                case 3:
                  
                 lado= Double.parseDouble(JOptionPane.showInputDialog("lado")); 
                 ancho=Double.parseDouble(JOptionPane.showInputDialog("lado")); 
                 rc=new rectangulo (lado,ancho);
                 ac=rc.calcularArea();
                 
                 pc= rc.calcularPerimetro();
                  
                 JOptionPane.showInputDialog(ac,pc);
       
                        
                        
                        
                        
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "salir");
                    break;
            }
        } while (opc != 4);
    }
}
