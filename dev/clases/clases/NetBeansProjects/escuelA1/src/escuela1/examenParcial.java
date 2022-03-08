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
class examenParcial {
  
    private materias  miMateria;
    private int nota;
    private estudiante miEstudiante;

    public examenParcial(materias miMateria, int nota, estudiante miEstudiante) {
        this.miMateria = miMateria;
        this.nota = nota;
        this.miEstudiante = miEstudiante;
    }

    public materias getMiMateria() {
        return miMateria;
    }

    public void setMiMateria(materias miMateria) {
        this.miMateria = miMateria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public estudiante getMiEstudiante() {
        return miEstudiante;
    }

    public void setMiEstudiante(estudiante miEstudiante) {
        this.miEstudiante = miEstudiante;
    }


    
    
}