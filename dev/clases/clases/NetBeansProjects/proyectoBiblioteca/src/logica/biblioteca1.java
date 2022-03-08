/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class biblioteca1 {
    private ArrayList<material>listaMaterial;
    private ArrayList<espacio>listaEspacio;
    public biblioteca1(){
        listaMaterial=new ArrayList();
        listaEspacio=new ArrayList();
        listaMaterial.add(new revista(4,"401","nacionalGeografic"));
        listaMaterial.add(new libro(25,"203","Maria"));
        listaMaterial.add(new video (80,"42","santotomas"));
        listaEspacio.add(new espacio("salon exposicion",200));
        listaEspacio.add(new espacio ("salon algo",100));
        
        
    }
}
