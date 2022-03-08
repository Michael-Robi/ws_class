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
public class libro extends material {
    private int numpaginas;
   

    public libro(int numPaginas,String nombre,String codigo) {
        super(codigo,nombre);
        this.numpaginas=numpaginas;
    }
    
}
