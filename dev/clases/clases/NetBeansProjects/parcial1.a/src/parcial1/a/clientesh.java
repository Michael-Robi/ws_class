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

public class clientesh {
 
    public static void main(String[] args) {
      clientesh sh=new clientesh();  
    }
    private  Clientes Listaclientes[];
    
    public void clientesh(){   
        
    
    Listaclientes=new Clientes [3];
    
    Listaclientes[0]=new Clientes("su nombre es maria es mujer y  su cedula es 1004798832");
    Listaclientes[1]=new Clientes(" su nombre es jose es hombre y su cedula es 100047");
    Listaclientes[2]=new Clientes(" su nombre es santiago es hombre y su cedula es 100876");
    Listaclientes[3]=new Clientes(" su nombre es mario es hombre y su cedula es 1000567");

        JOptionPane.showInputDialog(null,""+Listaclientes);
}
    public Clientes getcliente(int i){
        return Listaclientes[i];
    }
    public Clientes [] getListaclientes(){
        
        return Listaclientes;
}
    
}
