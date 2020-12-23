package entity;

import java.io.Serializable;

/**
 *
 * @author The Godfather
 */
public class CT implements Serializable{
    //mã cầu thủ, Họ Tên, Tuổi, Mức lương
    private int ma;
    private String ten;
    private int tuoi;
    private double luong;

    public CT(int ma, String ten, int tuoi, double luong) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,tuoi,luong};
    }
}
