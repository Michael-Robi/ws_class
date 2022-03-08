/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class Estudiante {
    
    private String nombre,direccion, telefono,cedula;
    private ArrayList<libros>listaLibros;
   private ArrayList< Amigos>listaAmigos;
   private ArrayList<revistas>listaRevista;
   private ArrayList<videos>listaVideos;
   
   /**
    private ArrayList< Estudiante>listaAmigos;//video
   private ArrayList< Estudiante>listaAmigos;//objpadr
   private ArrayList< Estudiante>listaAmigos;//revista
   private ArrayList< Estudiante>listaAmigos;//libro
**/
   
    public Estudiante(String nombre, String direccion, String telefono, String cedula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
        
        listaAmigos=new ArrayList<>();
        listaLibros= new ArrayList<>();
        listaRevista=new ArrayList<>();
        listaVideos=new ArrayList<>();
    }

    public ArrayList<videos> getListaVideos() {
        return listaVideos;
    }

    public void setListaVideos(ArrayList<videos> listaVideos) {
        this.listaVideos = listaVideos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Amigos> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Amigos> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public ArrayList<libros> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<libros> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<revistas> getListaRevista() {
        return listaRevista;
    }

    public void setListaRevista(ArrayList<revistas> listaRevista) {
        this.listaRevista = listaRevista;
    }
    
    public void CargarDatos(){
        Amigos amigo = new Amigos("112","Carlos","CLL 40", "312432");
        listaAmigos.add(amigo);
        
        amigo = new Amigos("113","Julian","CLL 40", "312432");
        listaAmigos.add(amigo);
    }
    
}
