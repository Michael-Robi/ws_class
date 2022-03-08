package Objetos;

import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class revistas extends ObjetoExtender {
    private LocalDate fechaEdicion;
    
    public revistas(LocalDate fechaEdicion, String codigo, String nombre, double valor) {
        super(codigo,nombre,valor);
        this.fechaEdicion=fechaEdicion;
    }

    public LocalDate getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(LocalDate fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

}
