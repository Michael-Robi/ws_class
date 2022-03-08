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
public class avion  extends medioDetransporte implements objetoVolador , inventoHumano {
    private int numeroDeMotores;

    public avion(int numeroDeMotores, int capacidad) {
        super(capacidad);
        this.numeroDeMotores = numeroDeMotores;
    }

    @Override
    public String arrancar() {
     String cadena;
     cadena="jaaaaa;" ;
            
     return cadena;
    }

    @Override
    public String aterrizar() {
    String cadena;
    cadena="fiuuu" ;
    return cadena;
    }

    @Override
    public String mostrarInventor() {
     return "hermanos wright" ;    
    }
    
}
