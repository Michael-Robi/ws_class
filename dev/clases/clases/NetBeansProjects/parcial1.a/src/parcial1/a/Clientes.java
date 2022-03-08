/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.a;

/**
 *
 * @author Home
 */
class Clientes {
    private String cedula;
    private String nombre;
    private String sexo;
    
        public Clientes(String cedula,String nombre,String sexo) {
     this.cedula=cedula;
     this.nombre=cedula;
     this.sexo=sexo;

        }

    Clientes() {
        
    }

    Clientes(String _clientes_2) {
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        
}