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
public class espacio implements ObejetoReservable{
    protected String nombre;
    protected double area;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public espacio(String nombre, double area) {
        this.nombre = nombre;
        this.area = area;
    }
    
    public boolean reserva(){
       double abono =5000.00;
       return true;
    }
}
