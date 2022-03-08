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

public class carro extends medioDetransporte {
    
    private int tamañoMotor;

    public carro(int tamañoMotor, int capacidad) {
        super (capacidad);
        this.tamañoMotor = tamañoMotor;
    }
}
