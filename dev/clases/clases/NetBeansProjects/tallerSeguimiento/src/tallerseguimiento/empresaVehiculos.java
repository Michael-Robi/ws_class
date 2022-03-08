/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerseguimiento;

import java.time.LocalDate;

/**
 *
 * @author Home
 */
public class empresaVehiculos {

    private vehiculo veh[];
    private cliente cL[];
    private alquiler alqui[];
    int i, j, k;

    public empresaVehiculos(int n, int m)
    {
        veh = new vehiculo[n];
        cL= new cliente [m];
        alqui = new alquiler[5];
        i=0;
        j=0;
        k=0;
    }

    
    
    public vehiculo[] getVeh() {
        return veh;
    }

    public void setVeh(vehiculo[] veh) {
        this.veh = veh;
    }

    public cliente[] getcL() {
        return cL;
    }

    public void setcL(cliente[] cL) {
        this.cL = cL;
    }


   

    public void agregarvehiculos(String placa, String md, String des, String kl, Marca ma) {
        
        veh[i]= new vehiculo(placa,md, des, kl, ma);
        i++;
    }

    public void agregarCliente(String ced, String nom) {
        cL[j] = new cliente(ced, nom);
        j++;

    }
    
    public void alquilarVehiculo(LocalDate fechaAlquiler,LocalDate fechaEntrega)
    {
        alqui[k]= new alquiler (fechaAlquiler,fechaEntrega);
        k++;
    }
            
}
