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
    private int maC,maS,soLuong;

    public QL(int maC, int maS, int soLuong) {
        this.maC = maC;
        this.maS = maS;
        this.soLuong = soLuong;
    }

    public int getMaC() {
        return maC;
    }

    public void setMaC(int maC) {
        this.maC = maC;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
