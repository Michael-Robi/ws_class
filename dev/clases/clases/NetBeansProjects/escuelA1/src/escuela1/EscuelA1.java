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
public class EscuelA1 {
   private estudiante es[];
   private materias mate[];
   private examenParcial exPar[];
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
EscuelA1 miEscuela=new EscuelA1();

    }

    public EscuelA1() {
         ArrayList<materias> materiasEstudiante = new  ArrayList<materias>();
         ArrayList<examenParcial> misExamenesEstudiante = new  ArrayList<examenParcial>();
         materiasEstudiante.add(new materias("2", "Claudia", NombreAsignatura.MATEMATICAS, misExamenesEstudiante));
        estudiante miEstudiante=new estudiante("Luisa", "Alonso", materiasEstudiante);
    }
     
 
    
}
