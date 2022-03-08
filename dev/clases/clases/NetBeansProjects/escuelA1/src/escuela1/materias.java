/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela1;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
class materias {
  private String creditos, profesor;
  private NombreAsignatura miAsignatura;
  private ArrayList<examenParcial> misExamenes;

    public materias(String creditos, String profesor, NombreAsignatura miAsignatura, ArrayList<examenParcial> misExamenes) {
        this.creditos = creditos;
        this.profesor = profesor;
        this.miAsignatura = miAsignatura;
        this.misExamenes = misExamenes;
    }

  

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
   
          
}
