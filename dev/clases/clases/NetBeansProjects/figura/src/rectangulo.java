/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class rectangulo extends Figura {
    
     private final static double PI=3.1416;
 public rectangulo(double lado, double ancho){
     
     super(lado);
     this.ancho=ancho;
         
 }
 public double calcularArea(){
     double area;
     area=lado*ancho;
     return area;
     
 }
 public double calcularPerimetro (){
     double per ;
     per= 2* lado+2*ancho;
     return per;
     
 }
}
