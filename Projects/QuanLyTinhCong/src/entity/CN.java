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
public class CN implements Serializable{
    private int ma;
    private String ten,diaChi,ca;

    public CN(int ma, String ten, String diaChi, String ca) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ca = ca;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }
    public Object[] toObject(){
        return new Object[] {ma,ten,diaChi,ca};
    }
}
