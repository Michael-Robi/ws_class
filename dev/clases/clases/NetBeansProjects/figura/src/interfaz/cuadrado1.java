/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Home
 */

import GUI.*;
public class cuadrado1 {
 private final static double PI=3.1416;
    
    public cuadrado1(double radio){
        super(radio);
        
    }
    public double CalcularArea (){
        double area;
        area= lado *lado;
        
        return area;
    }

    public double calcularPerimetro (){
        double per;
        per= lado + lado+lado+lado;
        return per;
    }   
}
