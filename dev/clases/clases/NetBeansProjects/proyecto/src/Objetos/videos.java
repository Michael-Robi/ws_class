/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Home
 */
public class videos extends ObjetoExtender {
     private int  duracionMinutos;
    
    public videos(int duracionMinutos, String codigo, String nombre, double valor) {
        super(codigo,nombre,valor);
        this.duracionMinutos=duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
}
