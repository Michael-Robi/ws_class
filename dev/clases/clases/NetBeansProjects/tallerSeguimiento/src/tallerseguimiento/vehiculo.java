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
public class vehiculo {

    private String placa, md, des, kl;
    private Marca ma;

    public vehiculo(String placa, String md, String des, String kl, Marca ma) {
        this.placa = placa;
        this.md = md;
        this.des = des;
        this.kl = kl;
        this.ma = ma;
    }

    public Marca getMa() {
        return ma;
    }

    public void setMa(Marca ma) {
        this.ma = ma;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMd() {
        return md;

    }

    public String getDes() {
        return des;
    }

    public String getKl() {
        return kl;

    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setKl(String kl) {
        this.kl = kl;
    }

}
