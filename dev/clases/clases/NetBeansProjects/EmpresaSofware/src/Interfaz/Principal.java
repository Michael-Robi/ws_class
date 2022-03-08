/*
 TALLER 11/11/21
 */
package Interfaz;

import empresasofware.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class Principal {

    private EmpresaSof em;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal mp = new Principal();
    }

    public Principal() {
        menu();
        em = new EmpresaSof();
    }

    public void menu() {
        int opc;
        String cedula , nombre;
        double salario;
        LocalDate fechaInicio, fechaFinal;
        EnumTipoEmpleado te;
        Empleado mp;
       EnumTipoEmpleado tipoElegido;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. agregar un emppleado "
                    + "\n  2. buscar por cedula de empleado" + "\n  3. obtener liquidacion de un empleado" + "\n 4. mostrar total pagado por primas" + "\n 5. promedio de dias laborados por empleado " + "\n 6.lista de datos por empleado " + "\n 7. listar el empleado que tuvo mayor liquidacion" + "8. Salir "));
            switch (opc) {
                case 1:

                    cedula = JOptionPane.showInputDialog("ingrese la cedula: ");
                    nombre = JOptionPane.showInputDialog("ingrese el nombre: ");
                    fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha que inició el empleado AAAA-MM-DD"));
                    fechaFinal = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha  final del empleado AAAA-MM-DD"));
                    salario = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario"));

                    te = (EnumTipoEmpleado) JOptionPane.showInputDialog(null, "Seleccione el tipo de empleado: ", "titulo", JOptionPane.QUESTION_MESSAGE, null, EnumTipoEmpleado.values(), "?");

                    em.agregarEmpleado(cedula, nombre, fechaInicio, fechaFinal, salario, te);

                    //JOptionPane.showMessageDialog(null, "El cliente a sido agregado:" +);

                    break;
                case 2:
                   
                  cedula=JOptionPane.showInputDialog("ingrese la cedula");
                    EmpresaSof em = new EmpresaSof();
   
                  em.buscarEmpleado(cedula);
                  
                  
                    mp = em.buscarEmpleado(cedula);
                    if(mp!=null)
                    {
                        mp.toString();
                        JOptionPane.showMessageDialog(null,"los datos del empleado son: "+mp.toString());
                    }else
                    {
                        JOptionPane.showMessageDialog(null,"no se encuentra el empleado");
                    }
                    
                case 3:
                    
                    Empleado emp;
                    cedula = JOptionPane.showInputDialog("Ingrese la cedula del1 empleado al que desea calcular la liquidacion: ");
                    emp=em.buscarEmpleado(cedula);
                    double liquidacion =em.obtenerLiquidacion(emp);
                    JOptionPane.showMessageDialog(null,"la liquidacion del empleado elegido es: "+liquidacion);
                    break;
                case 4:
                    em.PagadoPrimas();

                    break;     
                    case 5:
                        
                    em.promedioDiasLaborados();
                    
                    break;
                    
                    case 6:
                    
                    tipoElegido = (EnumTipoEmpleado)JOptionPane.showInputDialog(null, "Imprimir los empleados con el rol de: ","Roles", JOptionPane.QUESTION_MESSAGE, null ,Rol.values(),"?");
                    em.TipoEmpleados(tipoElegido);
                    break;    
                    
                    case 7:
                        
                    em.mayorLiquidacion();  
                    break;
                    
                   
                default:
                    JOptionPane.showMessageDialog(null, "salir");
                    break;
            }
        } while (opc != 9);
    }
}
