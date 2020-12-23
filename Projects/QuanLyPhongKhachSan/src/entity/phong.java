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
    //mã kiểu phòng, Kiểu phòng, Mức tiền thuê, Số phòng
    private int ma;
    private String kieu;
    private double mucTien;
    private int soPhong;

    public phong(int ma, String kieu, double mucTien, int soPhong) {
        this.ma = ma;
        this.kieu = kieu;
        this.mucTien = mucTien;
        this.soPhong = soPhong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public double getMucTien() {
        return mucTien;
    }

    public void setMucTien(double mucTien) {
        this.mucTien = mucTien;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,kieu,mucTien,soPhong};
    }
}
