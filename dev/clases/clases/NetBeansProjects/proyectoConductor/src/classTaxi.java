/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class classTaxi {

    private String placa;
    private conductor cond;

    public classTaxi(String placa, conductor cond) {
        this.placa = placa;
        this.cond = cond;
    }

    public String getPlaca() {
        return placa;
    }

    public conductor getCond() {
        return cond;
    }

}
