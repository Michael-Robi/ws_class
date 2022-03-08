/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class empresaTaxis {

    private conductor cond;
    private classTaxi tax;

    public boolean conductor(String c, String n, String s) {
        cond = new conductor(c, n);
        return true;
    }

    public boolean agregarTaxi(String p) {
        tax = new classTaxi(p, cond);
        return true;
    }
}
