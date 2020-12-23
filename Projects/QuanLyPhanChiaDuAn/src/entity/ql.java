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
    private int maT,maV;
    private int soNgay;

    public ql(int maT, int maV, int soNgay) {
        this.maT = maT;
        this.maV = maV;
        this.soNgay = soNgay;
    }

    public int getMaT() {
        return maT;
    }

    public void setMaT(int maT) {
        this.maT = maT;
    }

    public int getMaV() {
        return maV;
    }

    public void setMaV(int maV) {
        this.maV = maV;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    
    
}
