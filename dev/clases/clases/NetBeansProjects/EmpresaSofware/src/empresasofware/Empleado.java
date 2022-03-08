/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresasofware;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class Empleado {

    private String cedula;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private double salario;
    private EnumTipoEmpleado en;

    public double calcularLiquidacion(){
      double liq=calcularPrima()*2 + calcularVacaciones()+ InteresesCesantias();
      return liq;
    }
    public Empleado(String cedula, String nombre, LocalDate fechaInicio, LocalDate fechaTermino, double salario, EnumTipoEmpleado en) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.salario = salario;
        this.en = en;
    }

    public EnumTipoEmpleado getEn() {
        return en;
    }

    public void setEn(EnumTipoEmpleado en) {
        this.en = en;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long calcularDiasLaborados() {
        Period diferencia;
        fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio alquiler AAAA-MM-DD"));
        fechaTermino = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha final alquiler AAAA-MM-DD"));

        diferencia = fechaInicio.until(fechaTermino);

        long dias = diferencia.getDays();

        return dias;
    }

    public double calcularPrima() {
        double prima = salario * calcularDiasLaborados() / 360;
        return prima;

    }

    public double calcularCesantias() {
        double cesantias = salario * calcularDiasLaborados() / 360;
        return cesantias;

    }

    public double calcularVacaciones() {
        double v = salario * calcularDiasLaborados() / 720;
        return v;
    }

    public double InteresesCesantias() {
        double c = calcularCesantias() * 0.12 * calcularDiasLaborados() / 360;
        return c;
    }
}
