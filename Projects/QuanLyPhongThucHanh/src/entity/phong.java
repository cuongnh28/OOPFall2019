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
public class phong implements Serializable{
    private int ma;
    private String ten;
    private int soMay;
    private String kieu;

    public phong(int ma, String ten, int soMay, String kieu) {
        this.ma = ma;
        this.ten = ten;
        this.soMay = soMay;
        this.kieu = kieu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,soMay,kieu};
    }
    
}
