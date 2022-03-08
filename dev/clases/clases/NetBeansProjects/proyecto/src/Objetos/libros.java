package Objetos;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class libros extends ObjetoExtender {
    private int numpaginas;
    private String editorial;

    public libros(int numpaginas, String codigo, String nombre, double valor,String editorial) {
        super(codigo, nombre, valor);
        this.numpaginas = numpaginas;
        this.editorial=editorial;
    }

    
  
    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
    
    
    
}
