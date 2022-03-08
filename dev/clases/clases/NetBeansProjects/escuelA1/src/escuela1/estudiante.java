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
class estudiante {
    private String nombre;
    private String apellido;
    private ArrayList<materias> misMaterias;

    public estudiante(String nombre, String apellido, ArrayList<materias> misMaterias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.misMaterias = misMaterias;
    }
    

    public ArrayList<materias> getMisMaterias() {
        return misMaterias;
    }

    public void setMisMaterias(ArrayList<materias> misMaterias) {
        this.misMaterias = misMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
