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
public class QL implements Serializable{
    private int maC,maV,soTran;

    public QL(int maC, int maV, int soTran) {
        this.maC = maC;
        this.maV = maV;
        this.soTran = soTran;
    }

    public int getMaC() {
        return maC;
    }

    public void setMaC(int maC) {
        this.maC = maC;
    }

    public int getMaV() {
        return maV;
    }

    public void setMaV(int maV) {
        this.maV = maV;
    }

    public int getSoTran() {
        return soTran;
    }

    public void setSoTran(int soTran) {
        this.soTran = soTran;
    }
    
    
}
