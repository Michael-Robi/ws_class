/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerseguimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class ValorAlquiler {

    //private modelo md;

   

        public void  modelo(int  modelo) {
          
            double t;
            if (modelo<2015) {
                t = 60000.00;
            } else {
                if (modelo>= 2015 && modelo <2020) {
                    t = 80000.00;

                } else {
                    if (modelo > 2020) {
                        t = 10000.00;
                    }else{
                        JOptionPane.showInputDialog("valor erroneo");
                       
                    } 
                   
                }
            }
        
    }
}
