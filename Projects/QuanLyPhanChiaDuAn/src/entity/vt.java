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
public class vt implements Serializable{
    private int ma;
    private String ten;
    private double thuong;

    public vt(int ma, String ten, double thuong) {
        this.ma = ma;
        this.ten = ten;
        this.thuong = thuong;
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

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }
    public Object[] toObject(){
        return new Object[] {ma,ten,thuong};
    }
}
