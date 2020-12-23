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
    private int maP,maK,soNgay;

    public QL(int maP, int maK, int soNgay) {
        this.maP = maP;
        this.maK = maK;
        this.soNgay = soNgay;
    }

    public int getMaP() {
        return maP;
    }

    public void setMaP(int maP) {
        this.maP = maP;
    }

    public int getMaK() {
        return maK;
    }

    public void setMaK(int maK) {
        this.maK = maK;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
}
