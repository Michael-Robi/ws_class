
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
public class registroAsesoria {

    private int numero;
    private tipoAsesoria as;

    public registroAsesoria() {
    }
    

    public registroAsesoria(int numero, tipoAsesoria ase) {

        this.numero = numero;
        this.as = as;
        
    }

    public int getNumero() {
        return numero;
    }

    public tipoAsesoria getAse() {
        return as;
    }



    public double costoAsesoria(int hora) {
   double costo=0;
        if (as == tipoAsesoria.JURIDICA) {
            costo = 80.000*hora;
        } else {
            if (as == tipoAsesoria.FINANCIERA) {
                costo = 120.000*hora;
            } else {
                if (as == tipoAsesoria.TECNICA) {
                    costo = 100.000*hora;

                } else {
                    JOptionPane.showMessageDialog(null, "ponga otro tipo");

                }
                
            }
               
        }
      return costo;
    }
    
}

