/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerseguimiento;

/**
 *
 * @author Home
 */
public class cliente {
  
   private String ced;
    private String nom;

    public cliente(String ced, String nom)
    {
        this.ced = ced;
        this.nom = nom;
        
    }

    public String getCed() {
        return ced;
    }

    public String getNom() {
        return nom;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   
    
    
}
   

