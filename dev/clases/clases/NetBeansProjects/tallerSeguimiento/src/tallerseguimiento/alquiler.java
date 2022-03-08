/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerseguimiento;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;


public class alquiler {
    
    
 private alquiler alqui ;   
    public void prueba(){
        
     LocalDate fechaAlquiler,fe,hoy,fechaEntrega;
 
  
        Period diferencia;
        
        
        fe =LocalDate.parse("2021-04-04");
        
        fechaAlquiler = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio alquiler AAAA-MM-DD"));
        fechaEntrega = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha final alquiler AAAA-MM-DD"));
        hoy = LocalDate.now();
        
        diferencia = fechaAlquiler.until(fechaEntrega);
        
        long dias = diferencia.getDays();
        int an= diferencia.getYears();
        
        int meses=diferencia.getMonths();
        an=an *365;
                
        
        JOptionPane.showMessageDialog(null,"Usted ha alquilado" +an+"años"+ meses +"meses y  "+ dias+"dias");
        
    }

    public alquiler getAlqui() {
        return alqui;
    }

    public void setAlqui(alquiler alqui) {
        this.alqui = alqui;
    }
    
    public alquiler(LocalDate fechaAlquiler, LocalDate fechaEntrega) {
        
       alqui= new alquiler (fechaAlquiler,fechaEntrega);
        
        
        
    }
     
    

  }
 