/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerseguimiento;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Home
 */
public class MenuPrincipal {

    private empresaVehiculos et;
    private alquiler alq[];

    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal();

    }

    public MenuPrincipal() {
        menu();
    }

    public void menu() {
        int opc;
        int n, m;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clientes"));
        
        et = new empresaVehiculos(n,m);
        Marca mar;

        Marca ma[];
        
        
        String pl, kl, md, des, ced, nom;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. agregar un vehiculo "
                    + "\n  2. agregar un cliente \n  3. hacer un alquiler 4. Salir "));

            switch (opc) {
                case 1:
                    kl = JOptionPane.showInputDialog("kilometraje actual: ");
                    pl = JOptionPane.showInputDialog("placa: ");
                    md = JOptionPane.showInputDialog("modelo: ");
                    des = JOptionPane.showInputDialog("ingregse descripcion: ");
                    mar = (Marca) JOptionPane.showInputDialog(null, "Seleccione marca: ", "titulo", JOptionPane.QUESTION_MESSAGE, null, Marca.values(), "?");
                et.agregarvehiculos(pl, md, kl, des, mar);
                    break;

                case 2:

                    ced = JOptionPane.showInputDialog("ingresar cedula: ");
                    nom = JOptionPane.showInputDialog("ingresar nombre: ");

                    et.agregarCliente(ced, nom);

                    break;

                case 3:
                    int tamaño;
                    tamaño = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño: "));

                    for (int i = 0; i < tamaño; i++) {

               

                         LocalDate fechaAlquiler, fe, hoy, fechaEntrega;
                        Period diferencia;

                        fe = LocalDate.parse("2021-04-04");

                        fechaAlquiler = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio alquiler AAAA-MM-DD"));
                        fechaEntrega = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha final alquiler AAAA-MM-DD"));
                        hoy = LocalDate.now();

                        diferencia = fechaAlquiler.until(fechaEntrega);

                        long dias = diferencia.getDays();
                        int an = diferencia.getYears();

                        int meses = diferencia.getMonths();

                        JOptionPane.showMessageDialog(null, "Usted ha alquilado" + an + "años" + meses + "meses y  " + dias + "dias");
                        String pla;
                        pla = JOptionPane.showInputDialog("ingrese la placa que desea tener");
                    // et.alquilarVehiculo(fechaAlquiler, fechaEntrega);
                     
                            for (i = 0; i < et.getVeh().length; i++) {
                                //  System.out.println(et.getnom().getced());
                                  if(et.getVeh()[i].getPlaca()==pla){
                               String prueba = et.getVeh()[i].getKl() + "\n";
                                prueba += et.getVeh()[i].getPlaca() + "\n";
                                prueba += et.getVeh()[i].getMd() + "\n";
                                prueba += et.getVeh()[i].getDes() + "\n";
                                String prueba2 = et.getcL()[i].getCed() + "\n";
                                prueba2 += et.getcL()[i].getNom() + "\n";
                                JOptionPane.showMessageDialog(null, prueba); 
                                
                              //  int modelo = Integer.parseInt("ingrese el año del modelo");
                             
                             ValorAlquiler alq =new ValorAlquiler() ;
                             alq.modelo(et.getVeh()[i].getMd());
                             
                                break;
                                  }

                                
                            
                            }
                             
                        }

                    
                    //cL.setagregarCliente( 
                    break;

                
                default:
                    JOptionPane.showMessageDialog(null, "salir");
                    break;
            }
        } while (opc != 4);
    }

}
