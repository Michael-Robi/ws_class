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
public class telefono extends medioDeComunicacion implements inventoHumano{

    public telefono(double valor) {
        super(valor);
    }

    @Override
    public String mostrarInventor() {
     return "alexander Graham Bell";
    }
    
}
