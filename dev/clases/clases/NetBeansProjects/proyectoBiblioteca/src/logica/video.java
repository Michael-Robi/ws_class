/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Home
 */
public class video  extends material{
    private int duracion;
    
 public video (int duracion , String codigo , String nombre){
     super(codigo,nombre);
     this.duracion=duracion;
 }
}
