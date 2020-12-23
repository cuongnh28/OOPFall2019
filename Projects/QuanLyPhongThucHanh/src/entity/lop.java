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
public class lop implements Serializable{
    private int ma;
    private String ten;
    private int soSv;

    public lop(int ma, String ten, int soSv) {
        this.ma = ma;
        this.ten = ten;
        this.soSv = soSv;
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

    public int getSoSv() {
        return soSv;
    }

    public void setSoSv(int soSv) {
        this.soSv = soSv;
    }
    public Object[] toObject(){
        return new Object[] {ma,ten,soSv};
    }
}
