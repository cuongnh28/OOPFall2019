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
public class KH implements Serializable{
    private int ma;
    private String ten,loai;
    private int soPhong;

    public KH(int ma, String ten, String loai, int soPhong) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.soPhong = soPhong;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,loai,soPhong};
    }
    
}
