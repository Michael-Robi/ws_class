/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresasofware;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class EmpresaSof {
    private Empleado en;
    private ArrayList<Empleado> listaEmpleados;

    public EmpresaSof() {
        listaEmpleados = new ArrayList();
    }

    public void agregarEmpleado(String cedula, String nombre, LocalDate fechaInicio, LocalDate fechaFinal, Double sal, EnumTipoEmpleado te) {
       listaEmpleados.add(new Empleado (cedula, nombre, fechaInicio, fechaFinal,sal,te));
       JOptionPane.showMessageDialog(null, "empleado creado ");
       

    }

    public Empleado buscarEmpleado(String cedula) {

        Empleado e = null;
        int i;
        boolean encontrado = false;
        for (i = 0; i < listaEmpleados.size() && encontrado == false; i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)) {
                e = listaEmpleados.get(i);
                encontrado = true;
            }
        }
        return e;
    }

    public double obtenerLiquidacion(String cedula) {
        Empleado e = buscarEmpleado(cedula);
        double s;
        if (e == null) {
            s = 0;
        } else {
            s = e.calcularLiquidacion();

        }
        return s;

    }
    
    public void PagadoPrimas()
    {
        int i;
        double totalPagado = 0;
        for(i=0; i<listaEmpleados.size();i++ )
        {
            totalPagado = totalPagado + listaEmpleados.get(i).calcularPrima();
        }
        JOptionPane.showMessageDialog(null, "la candidad de cesantias pagadas son: "+totalPagado);
    }
    
    public void promedioDiasLaborados() 
    {
        int i;
        double diasLaborados=0;
        double promedio;
        for(i=0; i<listaEmpleados.size();i++ )
        {
            diasLaborados = diasLaborados + listaEmpleados.get(i).calcularDiasLaborados();
        }
        promedio = diasLaborados/listaEmpleados.size();
        JOptionPane.showMessageDialog(null, "El promedio de dias lavorados son : "+promedio);
    }

    public void TipoEmpleados(EnumTipoEmpleado tipoElegido) 
    {
        int i;
        for(i=0; i<listaEmpleados.size();i++ )
            {
                if(listaEmpleados.get(i).getEn()==tipoElegido)
                    {
                        listaEmpleados.add(listaEmpleados.get(i));
                    }
            }
        JOptionPane.showMessageDialog(null,"los empleados con el rol elegido son: "+listaEmpleados.toString());
    }
public void mayorLiquidacion() 
    {
        double mayorLiquidacion=0;
        Empleado clienteLiquidado =null; 
        int i;
        for(i=0; i<listaEmpleados.size();i++ )        
        {
            if(calculaLiquidacion(listaEmpleados.get(i))>mayorLiquidacion)
                {
                    mayorLiquidacion = calcularLiquidacion(listaEmpleados.get(i));
                    clienteLiquidado = listaEmpleados.get(i);
                }
        }
        JOptionPane.showMessageDialog(null,"El empleado con mayor liquidacion es: "+clienteLiquidado.toString());
        en.calcularLiquidacion();
}
}