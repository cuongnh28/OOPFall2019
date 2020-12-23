/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author The Godfather
 */
public class ql implements Serializable{
    private int maP,maL,kip;

    public ql(int maP, int maL, int kip) {
        this.maP = maP;
        this.maL = maL;
        this.kip = kip;
    }

    public int getMaP() {
        return maP;
    }

    public void setMaP(int maP) {
        this.maP = maP;
    }

    public int getMaL() {
        return maL;
    }

    public void setMaL(int maL) {
        this.maL = maL;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
    
}
