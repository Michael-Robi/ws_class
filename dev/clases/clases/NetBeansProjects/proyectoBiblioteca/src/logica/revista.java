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

public class revista extends material {
    private int numero;

    public revista(int numero,String codigo,String nombre) {
        super(codigo,nombre);
        
        this.numero = numero;
    }
    
}
