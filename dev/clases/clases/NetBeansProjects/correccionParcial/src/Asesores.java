/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
class Asesores {
 private String ced;
 private String nom;
 private String telefono;

    public Asesores(String ced, String nom, String telefono) {
        this.ced = ced;
        this.nom = nom;
        this.telefono = telefono;
    }
 
 
 @Override
 public String toString(){
    return ("ced"+ced+"nom"+nom+"telefono"+telefono) ;
 }
}
