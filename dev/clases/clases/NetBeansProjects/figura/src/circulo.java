/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class circulo extends Figura {
   
    private final static double PI= 31416;
    
    public circulo (double radio){
        super(radio);
    }
    public double calcularArea(){
        double area ;
        area=PI*lado *lado;
        return area;
    }
    public double calcularPerimetro(){
        double per;
        per= 2*PI*lado;
        return per;
        
    }
}
